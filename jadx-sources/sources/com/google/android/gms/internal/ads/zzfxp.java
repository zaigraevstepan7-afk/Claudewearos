package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfxp {
    public static int zza(int i10) {
        return (i10 + 1) * (i10 < 32 ? 4 : 2);
    }

    public static int zzb(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iZzb = zzfxx.zzb(obj);
        int i13 = iZzb & i10;
        int iZzc = zzc(obj3, i13);
        if (iZzc != 0) {
            int i14 = ~i10;
            int i15 = iZzb & i14;
            int i16 = -1;
            while (true) {
                i11 = iZzc - 1;
                int i17 = iArr[i11];
                i12 = i17 & i10;
                if ((i17 & i14) != i15 || !zzfvb.zza(obj, objArr[i11]) || (objArr2 != null && !zzfvb.zza(obj2, objArr2[i11]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i16 = i11;
                    iZzc = i12;
                } else {
                    break;
                }
            }
            if (i16 == -1) {
                zze(obj3, i13, i12);
                return i11;
            }
            iArr[i16] = (iArr[i16] & i14) | (i12 & i10);
            return i11;
        }
        return -1;
    }

    public static int zzc(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static Object zzd(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(m6.a.d(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static void zze(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
