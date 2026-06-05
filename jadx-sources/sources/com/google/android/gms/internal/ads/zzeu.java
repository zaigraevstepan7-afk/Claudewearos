package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeu {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzeu(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return zzex.zzu(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzh(long j) {
        return zzex.zzu(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzj()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.zzd.get();
                    if (l10 == null) {
                        throw null;
                    }
                    jLongValue = l10.longValue();
                }
                this.zzb = jLongValue - j;
                notifyAll();
            }
            this.zzc = j;
            return j + this.zzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.zzc;
            if (j4 != -9223372036854775807L) {
                long jZzh = zzh(j4);
                long j10 = (4294967296L + jZzh) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j;
                long j12 = (j10 * 8589934592L) + j;
                j = Math.abs(j11 - jZzh) < Math.abs(j12 - jZzh) ? j11 : j12;
            }
            return zza(zzg(j));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzc(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.zzc;
            if (j4 != -9223372036854775807L) {
                long jZzh = zzh(j4);
                long j10 = jZzh / 8589934592L;
                long j11 = (j10 * 8589934592L) + j;
                j = j11 >= jZzh ? j11 : ((j10 + 1) * 8589934592L) + j;
            }
            return zza(zzg(j));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long zzd() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zze() {
        long j;
        try {
            j = this.zzc;
        } catch (Throwable th2) {
            throw th2;
        }
        return j != -9223372036854775807L ? j + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}
