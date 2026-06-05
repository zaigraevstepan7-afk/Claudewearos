package com.google.android.gms.internal.p002firebaseauthapi;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzamn {
    private static final zzamo zza;

    static {
        if (zzamm.zzc()) {
            zzamm.zzd();
        }
        zza = new zzamr();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    public static String zzb(byte[] bArr, int i10, int i11) {
        return zza.zza(bArr, i10, i11);
    }

    public static boolean zzc(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }

    public static int zza(String str, byte[] bArr, int i10, int i11) {
        return zza.zza(str, bArr, i10, i11);
    }

    public static int zza(String str) {
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
                        if ('\ud800' <= cCharAt2 && cCharAt2 <= '\udfff') {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzamq(i11, length2);
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
        throw new IllegalArgumentException(m1.g(i12 + 4294967296L, "UTF-8 length does not fit in int: "));
    }

    public static boolean zza(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }
}
