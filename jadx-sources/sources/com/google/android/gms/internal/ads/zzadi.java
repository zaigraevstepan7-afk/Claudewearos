package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzadi implements zzaes {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzadi(long j, long j4, int i10, int i11, boolean z2) {
        long jZzc;
        this.zza = j;
        this.zzb = j4;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j == -1) {
            this.zzd = -1L;
            jZzc = -9223372036854775807L;
        } else {
            this.zzd = j - j4;
            jZzc = zzc(j, j4, i10);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j, long j4, int i10) {
        return (Math.max(0L, j - j4) * 8000000) / i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        long j4 = this.zzd;
        if (j4 == -1) {
            zzaet zzaetVar = new zzaet(0L, this.zzb);
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j10 = this.zzc;
        long jMin = (((this.zze * j) / 8000000) / j10) * j10;
        if (j4 != -1) {
            jMin = Math.min(jMin, j4 - j10);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        zzaet zzaetVar2 = new zzaet(jZzb, jMax);
        if (j4 != -1 && jZzb < j) {
            long j11 = jMax + j10;
            if (j11 < this.zza) {
                return new zzaeq(zzaetVar2, new zzaet(zzb(j11), j11));
            }
        }
        return new zzaeq(zzaetVar2, zzaetVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
