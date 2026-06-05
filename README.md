# VoidLauncher 26.3 beta6.1 (build 24) — декомпиляция и сборка

Этот репозиторий содержит **декомпилированные исходники** Android-приложения
`VoidLauncher` (пакет `com.anonlab.voidlauncher`) и инструменты для его
**обратной сборки в рабочий APK**.

Исходный артефакт — APK `VoidLauncher_26.3_beta6.1_build24.apk` — был получен из
многотомного архива (`.z01`, `.z02`, `.z03`, `.zip`), распакован и декомпилирован.

> ⚠️ Код приложения обфусцирован (имена пакетов/классов вида `a`, `a0`, `a2`…).
> Это нормально для декомпиляции релизного билда: для **пересборки** используется
> представление smali (каталог `decompiled/`), которое полностью эквивалентно
> оригиналу. Каталог `jadx-sources/` приведён только для чтения/анализа.

## Структура репозитория

| Путь | Описание |
|------|----------|
| `apk/VoidLauncher_26.3_beta6.1_build24.apk` | Оригинальный APK (исходный артефакт). |
| `decompiled/` | Проект [apktool](https://apktool.org): smali-код, ресурсы, `AndroidManifest.xml`, `apktool.yml`. **Это то, что собирается.** |
| `jadx-sources/` | Java-исходники, декомпилированные [jadx](https://github.com/skylot/jadx) (для чтения, ~13.7к файлов; не для сборки). |
| `build.sh` | Скрипт пересборки: `apktool b` → `zipalign` → подпись debug-ключом. |
| `.github/workflows/build.yml` | CI, который пересобирает APK при каждом пуше и публикует артефакт. |

## Как собрать

Нужна только **Java 11+** (проверено на OpenJDK 21). Всё остальное скрипт
скачивает сам.

```bash
./build.sh
```

Результат — подписанный, устанавливаемый APK:

```
dist/VoidLauncher-rebuilt-aligned-debugSigned.apk
```

Под капотом:

1. Скачиваются `apktool 2.11.1` и `uber-apk-signer 1.3.0` в `tools/`.
2. `apktool b decompiled/` собирает `classes.dex`, ресурсы и упаковывает APK.
3. `uber-apk-signer` делает `zipalign` и подписывает APK debug-ключом
   (схемы подписи **v1 + v2 + v3**), после чего проверяет подпись.

### Установка на устройство

```bash
adb install -r dist/VoidLauncher-rebuilt-aligned-debugSigned.apk
```

APK подписан **debug-ключом**, а не оригинальным ключом разработчика, поэтому
установить «поверх» официальной версии не получится (конфликт подписи) — сначала
удалите официальную версию либо ставьте как отдельную сборку.

## Как это было сделано

```text
VoidLauncher_..._build24.z01 ┐
VoidLauncher_..._build24.z02 ├─ cat → spanned zip → unzip → .apk
VoidLauncher_..._build24.z03 ┤
VoidLauncher_..._build24.zip ┘

.apk ──apktool d──► decompiled/      (smali + ресурсы → собирается)
.apk ──jadx──────► jadx-sources/     (Java → для чтения)
```

## Сведения о приложении

| Параметр | Значение |
|----------|----------|
| package | `com.anonlab.voidlauncher` |
| versionName | `26.3_beta6.1` |
| versionCode | `24` |
| minSdkVersion | 27 (Android 8.1) |
| targetSdkVersion | 35 (Android 15) |

## Лицензия / правовая оговорка

Декомпиляция выполнена в учебно-исследовательских целях. Все права на исходное
приложение принадлежат его авторам (anonlab). Не распространяйте пересобранные
сборки от своего имени.
