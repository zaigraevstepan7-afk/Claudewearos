#!/usr/bin/env bash
#
# build.sh — пересборка VoidLauncher из декомпилированных исходников.
#
# Что делает скрипт:
#   1. Скачивает apktool и uber-apk-signer (если их нет в tools/).
#   2. Собирает APK из каталога decompiled/ командой `apktool b`.
#   3. Выравнивает (zipalign) и подписывает APK debug-ключом (схемы v1/v2/v3).
#
# Результат: dist/VoidLauncher-rebuilt-aligned-debugSigned.apk
#
# Требования: Java 11+ (проверено на OpenJDK 21).
#
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
TOOLS_DIR="$ROOT_DIR/tools"
SRC_DIR="$ROOT_DIR/decompiled"
DIST_DIR="$ROOT_DIR/dist"

APKTOOL_VERSION="2.11.1"
UBER_SIGNER_VERSION="1.3.0"
APKTOOL_JAR="$TOOLS_DIR/apktool-${APKTOOL_VERSION}.jar"
UBER_SIGNER_JAR="$TOOLS_DIR/uber-apk-signer-${UBER_SIGNER_VERSION}.jar"

OUT_APK="$DIST_DIR/VoidLauncher-rebuilt.apk"

mkdir -p "$TOOLS_DIR" "$DIST_DIR"

download() {
  local url="$1" dest="$2"
  if [ -f "$dest" ]; then
    echo ">> Уже скачано: $(basename "$dest")"
    return
  fi
  echo ">> Скачиваю $(basename "$dest") ..."
  curl -fSL --retry 4 --retry-delay 2 -o "$dest" "$url"
}

echo "== 1/3: подготовка инструментов =="
download "https://github.com/iBotPeaches/Apktool/releases/download/v${APKTOOL_VERSION}/apktool_${APKTOOL_VERSION}.jar" "$APKTOOL_JAR"
download "https://github.com/patrickfav/uber-apk-signer/releases/download/v${UBER_SIGNER_VERSION}/uber-apk-signer-${UBER_SIGNER_VERSION}.jar" "$UBER_SIGNER_JAR"

echo "== 2/3: сборка APK из decompiled/ =="
java -jar "$APKTOOL_JAR" b -f -o "$OUT_APK" "$SRC_DIR"

echo "== 3/3: zipalign + подпись (debug) =="
java -jar "$UBER_SIGNER_JAR" --apks "$OUT_APK"

echo
echo "Готово. Подписанный APK:"
ls -la "$DIST_DIR"/*-debugSigned.apk
