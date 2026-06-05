package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzglb {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i11 = 0;
        long j4 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j13 = j + (j4 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j10 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j11 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = ((j17 >> 26) * 5) + j12;
                long j20 = j19 >> 26;
                long j21 = j19 & 67108863;
                long j22 = j21 + 5;
                long j23 = (j4 & 67108863) + j20;
                long j24 = j23 + (j22 >> 26);
                long j25 = (j24 >> 26) + j14;
                long j26 = j16 + (j25 >> 26);
                long j27 = (j18 + (j26 >> 26)) - 67108864;
                long j28 = j27 >> 63;
                long j29 = ~j28;
                long j30 = (j23 & j28) | (j24 & 67108863 & j29);
                long j31 = (j14 & j28) | (j25 & 67108863 & j29);
                long j32 = (j16 & j28) | (j26 & 67108863 & j29);
                long j33 = (j18 & j28) | (j27 & j29);
                long jZzc = (((j21 & j28) | (j22 & 67108863 & j29) | (j30 << 26)) & 4294967295L) + zzc(bArr, 16);
                long jZzc2 = (((j30 >> 6) | (j31 << 20)) & 4294967295L) + zzc(bArr, 20);
                long jZzc3 = (((j32 << 14) | (j31 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long jZzc4 = (((j32 >> 18) | (j33 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & 4294967295L, 0);
                long j34 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j34 & 4294967295L, 4);
                long j35 = jZzc3 + (j34 >> 32);
                zzd(bArr4, j35 & 4294967295L, 8);
                zzd(bArr4, (jZzc4 + (j35 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j36 = jZzb5 * 5;
            long j37 = jZzb4 * 5;
            long j38 = jZzb3 * 5;
            long jZzb6 = j12 + zzb(bArr3, 0, 0);
            long jZzb7 = j4 + zzb(bArr3, 3, 2);
            long jZzb8 = j + zzb(bArr3, 6, 4);
            long jZzb9 = j10 + zzb(bArr3, 9, 6);
            long jZzb10 = j11 + (zzb(bArr3, 12, 8) | (bArr3[16] << 24));
            long j39 = jZzb7 * jZzb;
            long j40 = jZzb7 * jZzb2;
            long j41 = jZzb8 * jZzb;
            long j42 = jZzb7 * jZzb3;
            long j43 = jZzb8 * jZzb2;
            long j44 = jZzb9 * jZzb;
            long j45 = jZzb7 * jZzb4;
            long j46 = jZzb8 * jZzb3;
            long j47 = jZzb9 * jZzb2;
            long j48 = jZzb10 * jZzb;
            long j49 = (jZzb2 * 5 * jZzb10) + (jZzb9 * j38) + (jZzb8 * j37) + (jZzb7 * j36) + (jZzb6 * jZzb);
            long j50 = j49 & 67108863;
            long j51 = jZzb9 * j37;
            long j52 = j38 * jZzb10;
            long j53 = j52 + j51 + (jZzb8 * j36) + (jZzb6 * jZzb2) + j39 + (j49 >> 26);
            long j54 = j37 * jZzb10;
            long j55 = j54 + (jZzb9 * j36) + (jZzb6 * jZzb3) + j40 + j41 + (j53 >> 26);
            long j56 = (jZzb10 * j36) + (jZzb6 * jZzb4) + j42 + j43 + j44 + (j55 >> 26);
            long j57 = (jZzb6 * jZzb5) + j45 + j46 + j47 + j48 + (j56 >> 26);
            long j58 = ((j57 >> 26) * 5) + j50;
            j4 = (j53 & 67108863) + (j58 >> 26);
            i11 += 16;
            j = j55 & 67108863;
            j10 = j56 & 67108863;
            j11 = j57 & 67108863;
            i10 = 17;
            j12 = j58 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16)) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
