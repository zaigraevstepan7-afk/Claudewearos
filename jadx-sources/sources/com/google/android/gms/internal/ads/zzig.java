package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzig {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzig(float f10, float f11, long j, float f12, long j4, long j10, float f13, zzif zzifVar) {
        this.zza = j4;
        this.zzb = j10;
    }

    private static long zzf(long j, long j4, float f10) {
        return (long) ((j4 * 9.999871E-4f) + (j * 0.999f));
    }

    private final void zzg() {
        long j;
        long j4 = this.zzc;
        if (j4 != -9223372036854775807L) {
            j = this.zzd;
            if (j == -9223372036854775807L) {
                long j10 = this.zzf;
                if (j10 != -9223372036854775807L && j4 < j10) {
                    j4 = j10;
                }
                j = this.zzg;
                if (j == -9223372036854775807L || j4 <= j) {
                    j = j4;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j, long j4) {
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j10 = j - j4;
        long j11 = this.zzm;
        if (j11 == -9223372036854775807L) {
            this.zzm = j10;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j10, zzf(j11, j10, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzf(this.zzn, Math.abs(j10 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j12 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j12) {
            long jZzs = zzex.zzs(1000L);
            float f10 = this.zzk - 1.0f;
            float f11 = this.zzi - 1.0f;
            long j13 = this.zze;
            float f12 = jZzs;
            long j14 = this.zzh - (((long) (f10 * f12)) + ((long) (f11 * f12)));
            long[] jArr = {j12, j13, j14};
            jMax = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j15 = jArr[i10];
                if (j15 > jMax) {
                    jMax = j15;
                }
            }
            this.zzh = jMax;
        } else {
            long jMax3 = j - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j16 = this.zzh;
            String str = zzex.zza;
            jMax = Math.max(j16, Math.min(jMax3, j12));
            this.zzh = jMax;
            long j17 = this.zzg;
            if (j17 != -9223372036854775807L && jMax > j17) {
                this.zzh = j17;
                jMax = j17;
            }
        }
        long j18 = j - jMax;
        if (Math.abs(j18) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j18 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j4 = j + this.zzb;
        this.zzh = j4;
        long j10 = this.zzg;
        if (j10 != -9223372036854775807L && j4 > j10) {
            this.zzh = j10;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzaj zzajVar) {
        long j = zzajVar.zza;
        this.zzc = zzex.zzs(-9223372036854775807L);
        this.zzf = zzex.zzs(-9223372036854775807L);
        this.zzg = zzex.zzs(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }
}
