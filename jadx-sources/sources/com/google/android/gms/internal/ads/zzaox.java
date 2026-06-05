package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaox implements zzaes {
    private final zzaou zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaox(zzaou zzaouVar, int i10, long j, long j4) {
        this.zza = zzaouVar;
        this.zzb = i10;
        this.zzc = j;
        long j10 = (j4 - j) / zzaouVar.zzd;
        this.zzd = j10;
        this.zze = zzb(j10);
    }

    private final long zzb(long j) {
        return zzex.zzu(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        long j4 = this.zzb;
        zzaou zzaouVar = this.zza;
        long j10 = (zzaouVar.zzc * j) / (j4 * 1000000);
        String str = zzex.zza;
        long j11 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j10, j11));
        long j12 = zzaouVar.zzd;
        long jZzb = zzb(jMax);
        long j13 = this.zzc;
        zzaet zzaetVar = new zzaet(jZzb, (jMax * j12) + j13);
        if (jZzb >= j || jMax == j11) {
            return new zzaeq(zzaetVar, zzaetVar);
        }
        long j14 = jMax + 1;
        return new zzaeq(zzaetVar, new zzaet(zzb(j14), (j12 * j14) + j13));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
