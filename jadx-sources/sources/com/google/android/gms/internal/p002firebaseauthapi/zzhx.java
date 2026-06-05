package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzhx {
    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static long zza(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j);
            i11++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            int i10 = 3;
            int i11 = 2;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j = jZza2 * 5;
            long j4 = jZza3 * 5;
            long j10 = jZza4 * 5;
            long j11 = jZza5 * 5;
            int i12 = 17;
            byte[] bArr3 = new byte[17];
            long j12 = 0;
            int i13 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            while (i13 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i13);
                System.arraycopy(bArr2, i13, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i12, (byte) 0);
                }
                long jZza6 = j16 + zza(bArr3, 0, 0);
                long jZza7 = j12 + zza(bArr3, i10, i11);
                long jZza8 = j13 + zza(bArr3, 6, 4);
                long jZza9 = j14 + zza(bArr3, 9, 6);
                long j17 = jZza2;
                long jZza10 = j15 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j18 = (jZza10 * j) + (jZza9 * j4) + (jZza8 * j10) + (jZza7 * j11) + (jZza6 * jZza);
                long j19 = (jZza10 * j4) + (jZza9 * j10) + (jZza8 * j11) + (jZza7 * jZza) + (jZza6 * j17);
                long j20 = (jZza10 * j10) + (jZza9 * j11) + (jZza8 * jZza) + (jZza7 * j17) + (jZza6 * jZza3);
                long j21 = (jZza10 * j11) + (jZza9 * jZza) + (jZza8 * j17) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j22 = jZza9 * j17;
                long j23 = jZza10 * jZza;
                long j24 = j19 + (j18 >> 26);
                long j25 = j20 + (j24 >> 26);
                long j26 = j21 + (j25 >> 26);
                long j27 = j23 + j22 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j26 >> 26);
                long j28 = j27 >> 26;
                j15 = j27 & 67108863;
                long j29 = (j28 * 5) + (j18 & 67108863);
                i13 += 16;
                j13 = j25 & 67108863;
                j14 = j26 & 67108863;
                i12 = 17;
                i10 = 3;
                j16 = j29 & 67108863;
                j12 = (j24 & 67108863) + (j29 >> 26);
                jZza2 = j17;
                i11 = 2;
            }
            long j30 = j13 + (j12 >> 26);
            long j31 = j30 & 67108863;
            long j32 = j14 + (j30 >> 26);
            long j33 = j32 & 67108863;
            long j34 = j15 + (j32 >> 26);
            long j35 = j34 & 67108863;
            long j36 = ((j34 >> 26) * 5) + j16;
            long j37 = j36 >> 26;
            long j38 = j36 & 67108863;
            long j39 = (j12 & 67108863) + j37;
            long j40 = j38 + 5;
            long j41 = j40 & 67108863;
            long j42 = (j40 >> 26) + j39;
            long j43 = j31 + (j42 >> 26);
            long j44 = j33 + (j43 >> 26);
            long j45 = (j35 + (j44 >> 26)) - 67108864;
            long j46 = j45 >> 63;
            long j47 = ~j46;
            long j48 = (j38 & j46) | (j41 & j47);
            long j49 = (j39 & j46) | (j42 & 67108863 & j47);
            long j50 = (j31 & j46) | (j43 & 67108863 & j47);
            long j51 = (j33 & j46) | (j44 & 67108863 & j47);
            long j52 = (j48 | (j49 << 26)) & 4294967295L;
            long j53 = ((j49 >> 6) | (j50 << 20)) & 4294967295L;
            long j54 = ((j50 >> 12) | (j51 << 14)) & 4294967295L;
            long j55 = ((((j45 & j47) | (j35 & j46)) << 8) | (j51 >> 18)) & 4294967295L;
            long jZza11 = j52 + zza(bArr, 16);
            long j56 = jZza11 & 4294967295L;
            long jZza12 = j53 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j54 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j55 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j56, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
