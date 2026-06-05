package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzml {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j4 = jArr3[1] * j;
        long j10 = jArr2[1];
        long j11 = jArr3[0];
        jArr[1] = (j10 * j11) + j4;
        long j12 = jArr2[1];
        long j13 = jArr3[1];
        jArr[2] = (jArr2[2] * j11) + (jArr3[2] * j) + (j12 * 2 * j13);
        long j14 = jArr3[2];
        long j15 = jArr2[2];
        jArr[3] = (jArr2[3] * j11) + (jArr3[3] * j) + (j15 * j13) + (j12 * j14);
        long j16 = jArr3[3];
        long j17 = jArr2[3];
        jArr[4] = (jArr2[4] * j11) + (jArr3[4] * j) + (((j17 * j13) + (j12 * j16)) * 2) + (j15 * j14);
        long j18 = jArr3[4];
        long j19 = (j12 * j18) + (j17 * j14) + (j15 * j16);
        long j20 = jArr2[4];
        jArr[5] = (jArr2[5] * j11) + (jArr3[5] * j) + (j20 * j13) + j19;
        long j21 = jArr3[5];
        long j22 = jArr2[5];
        jArr[6] = (jArr2[6] * j11) + (jArr3[6] * j) + (j20 * j14) + (j15 * j18) + (((j22 * j13) + (j12 * j21) + (j17 * j16)) * 2);
        long j23 = (j22 * j14) + (j15 * j21) + (j20 * j16) + (j17 * j18);
        long j24 = jArr3[6];
        long j25 = (j12 * j24) + j23;
        long j26 = jArr2[6];
        jArr[7] = (jArr2[7] * j11) + (jArr3[7] * j) + (j26 * j13) + j25;
        long j27 = jArr3[7];
        long j28 = (j12 * j27) + (j22 * j16) + (j17 * j21);
        long j29 = jArr2[7];
        long j30 = (((j29 * j13) + j28) * 2) + (j20 * j18);
        jArr[8] = (jArr2[8] * j11) + (jArr3[8] * j) + (j26 * j14) + (j15 * j24) + j30;
        long j31 = (j29 * j14) + (j15 * j27) + (j26 * j16) + (j17 * j24) + (j22 * j18) + (j20 * j21);
        long j32 = jArr3[8];
        long j33 = (j12 * j32) + j31;
        long j34 = jArr2[8];
        jArr[9] = (jArr2[9] * j11) + (j * jArr3[9]) + (j34 * j13) + j33;
        long j35 = (j29 * j16) + (j17 * j27) + (j22 * j21);
        long j36 = jArr3[9];
        long j37 = jArr2[9];
        long j38 = j20 * j24;
        jArr[10] = (j34 * j14) + (j15 * j32) + (j26 * j18) + j38 + (((j13 * j37) + (j12 * j36) + j35) * 2);
        long j39 = j15 * j36;
        long j40 = j14 * j37;
        jArr[11] = j40 + j39 + (j34 * j16) + (j17 * j32) + (j29 * j18) + (j20 * j27) + (j26 * j21) + (j22 * j24);
        long j41 = j17 * j36;
        long j42 = j16 * j37;
        long j43 = j34 * j18;
        jArr[12] = j43 + (j20 * j32) + ((j42 + j41 + (j29 * j21) + (j22 * j27)) * 2) + (j26 * j24);
        long j44 = j20 * j36;
        long j45 = j18 * j37;
        jArr[13] = j45 + j44 + (j34 * j21) + (j22 * j32) + (j29 * j24) + (j26 * j27);
        long j46 = j21 * j37;
        long j47 = j34 * j24;
        jArr[14] = j47 + (j26 * j32) + ((j46 + (j22 * j36) + (j29 * j27)) * 2);
        long j48 = j26 * j36;
        long j49 = j24 * j37;
        jArr[15] = j49 + j48 + (j34 * j27) + (j29 * j32);
        jArr[16] = (((j27 * j37) + (j29 * j36)) * 2) + (j34 * j32);
        jArr[17] = (j32 * j37) + (j34 * j36);
        jArr[18] = j37 * 2 * j36;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j = jArrCopyOf[i13];
                int i14 = -((int) (((j >> 31) & j) >> zzd[i13 & 1]));
                jArrCopyOf[i13] = j + (i14 << r14);
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - i14;
            }
            long j4 = jArrCopyOf[9];
            jArrCopyOf[9] = j4 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j4 >> 31) & j4) >> 25))) * 19);
            i12++;
        }
        long j10 = jArrCopyOf[0];
        jArrCopyOf[0] = j10 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j10 >> 31) & j10) >> 26)));
        int i15 = 0;
        while (i15 < 2) {
            int i16 = i11;
            while (i16 < 9) {
                long j11 = jArrCopyOf[i16];
                int i17 = i11;
                int i18 = (int) (j11 >> zzd[i16 & 1]);
                jArrCopyOf[i16] = j11 & zzc[r15];
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + i18;
                i11 = i17;
                i15 = i15;
            }
            i15++;
        }
        int i19 = i11;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        long j12 = (((int) (r2 >> 25)) * 19) + jArrCopyOf[i19];
        jArrCopyOf[i19] = j12;
        int i20 = ~((((int) j12) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) jArrCopyOf[i21]) ^ zzc[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 << 1)) >> 31;
        }
        jArrCopyOf[i19] = jArrCopyOf[i19] - (67108845 & i20);
        long j13 = 33554431 & i20;
        jArrCopyOf[1] = jArrCopyOf[1] - j13;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - (67108863 & i20);
            int i27 = i10 + 1;
            jArrCopyOf[i27] = jArrCopyOf[i27] - j13;
        }
        for (int i28 = i19; i28 < 10; i28++) {
            jArrCopyOf[i28] = jArrCopyOf[i28] << zzb[i28];
        }
        byte[] bArr = new byte[32];
        for (int i29 = i19; i29 < 10; i29++) {
            int i30 = zza[i29];
            long j14 = bArr[i30];
            long j15 = jArrCopyOf[i29];
            bArr[i30] = (byte) (j14 | (j15 & 255));
            bArr[i30 + 1] = (byte) (bArr[r5] | ((j15 >> 8) & 255));
            bArr[i30 + 2] = (byte) (bArr[r5] | ((j15 >> 16) & 255));
            bArr[i30 + 3] = (byte) (bArr[r4] | ((j15 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j = jArr[8];
        long j4 = jArr[18];
        long j10 = j + (j4 << 4);
        jArr[8] = j10;
        long j11 = j10 + (j4 << 1);
        jArr[8] = j11;
        jArr[8] = j11 + j4;
        long j12 = jArr[7];
        long j13 = jArr[17];
        long j14 = j12 + (j13 << 4);
        jArr[7] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[7] = j15;
        jArr[7] = j15 + j13;
        long j16 = jArr[6];
        long j17 = jArr[16];
        long j18 = j16 + (j17 << 4);
        jArr[6] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[6] = j19;
        jArr[6] = j19 + j17;
        long j20 = jArr[5];
        long j21 = jArr[15];
        long j22 = j20 + (j21 << 4);
        jArr[5] = j22;
        long j23 = j22 + (j21 << 1);
        jArr[5] = j23;
        jArr[5] = j23 + j21;
        long j24 = jArr[4];
        long j25 = jArr[14];
        long j26 = j24 + (j25 << 4);
        jArr[4] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[4] = j27;
        jArr[4] = j27 + j25;
        long j28 = jArr[3];
        long j29 = jArr[13];
        long j30 = j28 + (j29 << 4);
        jArr[3] = j30;
        long j31 = j30 + (j29 << 1);
        jArr[3] = j31;
        jArr[3] = j31 + j29;
        long j32 = jArr[2];
        long j33 = jArr[12];
        long j34 = j32 + (j33 << 4);
        jArr[2] = j34;
        long j35 = j34 + (j33 << 1);
        jArr[2] = j35;
        jArr[2] = j35 + j33;
        long j36 = jArr[1];
        long j37 = jArr[11];
        long j38 = j36 + (j37 << 4);
        jArr[1] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[1] = j39;
        jArr[1] = j39 + j37;
        long j40 = jArr[0];
        long j41 = jArr[10];
        long j42 = j40 + (j41 << 4);
        jArr[0] = j42;
        long j43 = j42 + (j41 << 1);
        jArr[0] = j43;
        jArr[0] = j43 + j41;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j4 = jArr2[1];
        long j10 = jArr2[2];
        long j11 = jArr2[3];
        long j12 = jArr2[4];
        long j13 = jArr2[5];
        long j14 = jArr2[6];
        long j15 = jArr2[7];
        long j16 = jArr2[8];
        long j17 = jArr2[9];
        zze(new long[]{j * j, j * 2 * j4, ((j * j10) + (j4 * j4)) * 2, ((j * j11) + (j4 * j10)) * 2, (j * 2 * j12) + (j4 * 4 * j11) + (j10 * j10), ((j * j13) + (j4 * j12) + (j10 * j11)) * 2, ((j4 * 2 * j13) + (j * j14) + (j10 * j12) + (j11 * j11)) * 2, ((j * j15) + (j4 * j14) + (j10 * j13) + (j11 * j12)) * 2, (((((j11 * j13) + (j4 * j15)) * 2) + (j * j16) + (j10 * j14)) * 2) + (j12 * j12), ((j * j17) + (j4 * j16) + (j10 * j15) + (j11 * j14) + (j12 * j13)) * 2, ((((j4 * j17) + (j11 * j15)) * 2) + (j10 * j16) + (j12 * j14) + (j13 * j13)) * 2, ((j10 * j17) + (j11 * j16) + (j12 * j15) + (j13 * j14)) * 2, (((((j11 * j17) + (j13 * j15)) * 2) + (j12 * j16)) * 2) + (j14 * j14), ((j12 * j17) + (j13 * j16) + (j14 * j15)) * 2, ((j13 * 2 * j17) + (j14 * j16) + (j15 * j15)) * 2, ((j14 * j17) + (j15 * j16)) * 2, (j15 * 4 * j17) + (j16 * j16), j16 * 2 * j17, 2 * j17 * j17}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j = jArr[i10];
            long j4 = j / 67108864;
            jArr[i10] = j - (j4 << 26);
            int i11 = i10 + 1;
            long j10 = jArr[i11] + j4;
            jArr[i11] = j10;
            long j11 = j10 / 33554432;
            jArr[i11] = j10 - (j11 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j11;
        }
        long j12 = jArr[0];
        long j13 = jArr[10];
        long j14 = j12 + (j13 << 4);
        jArr[0] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[0] = j15;
        long j16 = j15 + j13;
        jArr[0] = j16;
        jArr[10] = 0;
        long j17 = j16 / 67108864;
        jArr[0] = j16 - (j17 << 26);
        jArr[1] = jArr[1] + j17;
    }

    public static void zza(long[] jArr, long[] jArr2, long j) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zza[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> zzb[i10]) & zzc[i10 & 1];
        }
        return jArr;
    }
}
