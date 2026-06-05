package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgbd {
    public static long zza(long j, long j4) {
        long j10 = j + j4;
        if (((j ^ j4) < 0) || ((j ^ j10) >= 0)) {
            return j10;
        }
        StringBuilder sbL = m1.l("overflow: checkedAdd(", ", ", j);
        sbL.append(j4);
        sbL.append(")");
        throw new ArithmeticException(sbL.toString());
    }

    public static long zzb(long j, long j4, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j10 = j / j4;
        long j11 = j - (j4 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i10 = ((int) ((j ^ j4) >> 63)) | 1;
        switch (zzgbc.zza[roundingMode.ordinal()]) {
            case 1:
                zzgbe.zzb(false);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i10 >= 0) {
                    return j10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return j10;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j11);
                long jAbs2 = jAbs - (Math.abs(j4) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (jAbs2 <= 0) {
                    return j10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j10 + i10;
    }

    public static long zzc(long j, long j4) {
        zzgbe.zza("a", j);
        zzgbe.zza("b", j4);
        if (j == 0) {
            return j4;
        }
        if (j4 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
        long j10 = j4 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j10) {
            long j11 = jNumberOfTrailingZeros - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            jNumberOfTrailingZeros = j13 >> Long.numberOfTrailingZeros(j13);
            j10 += j12;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzd(long j, long j4) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j4;
        }
        long j10 = j ^ j4;
        long j11 = (j10 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j4 == Long.MIN_VALUE) & (j < 0)))) {
            long j12 = j * j4;
            if (j == 0 || j12 / j == j4) {
                return j12;
            }
        }
        return j11;
    }
}
