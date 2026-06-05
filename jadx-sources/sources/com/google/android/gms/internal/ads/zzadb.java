package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadb {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzadb(long j, long j4, long j10, long j11, long j12, long j13, long j14) {
        this.zza = j;
        this.zzb = j4;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzc = j14;
        this.zzh = zzf(j4, 0L, j11, j12, j13, j14);
    }

    public static long zzf(long j, long j4, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || 1 + j4 >= j10) {
            return j11;
        }
        long j14 = (long) (((j12 - j11) / (j10 - j4)) * (j - j4));
        String str = zzex.zza;
        return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzadb zzadbVar, long j, long j4) {
        zzadbVar.zze = j;
        zzadbVar.zzg = j4;
        zzadbVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzadb zzadbVar, long j, long j4) {
        zzadbVar.zzd = j;
        zzadbVar.zzf = j4;
        zzadbVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
