package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhbx {
    private static final zzhbu zza;

    static {
        if (zzhbs.zzA() && zzhbs.zzB()) {
            int i10 = zzgxa.zza;
        }
        zza = new zzhbv();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return zzj(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return zzk(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int zzd(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= '\u0080') {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < '\u0080' && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < '\u0800' && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((cCharAt2 >= '\ud800' && cCharAt2 <= '\udfff') || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 >= '\ud800' && cCharAt2 <= '\udfff' && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new zzhbw(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i17 = i15 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i18 = i16 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i15 = i17;
                        } else {
                            i15 = i17;
                        }
                    }
                    throw new zzhbw(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    public static int zze(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < '\u0080') {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < '\u0800') {
                i12 += ('\u007f' - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < '\u0800') {
                        i10 += ('\u007f' - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= '\ud800' && cCharAt2 <= '\udfff') {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzhbw(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int zzf(int i10, byte[] bArr, int i11, int i12) {
        return zza.zza(i10, bArr, i11, i12);
    }

    public static String zzg(ByteBuffer byteBuffer, int i10, int i11) {
        zzhbu zzhbuVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhbuVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        return byteBuffer.isDirect() ? zzhbu.zzc(byteBuffer, i10, i11) : zzhbu.zzc(byteBuffer, i10, i11);
    }

    public static String zzh(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }

    public static boolean zzi(byte[] bArr, int i10, int i11) {
        return zza.zza(0, bArr, i10, i11) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
