package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaec implements zzaes {
    private final zzaee zza;
    private final long zzb;

    public zzaec(zzaee zzaeeVar, long j) {
        this.zza = zzaeeVar;
        this.zzb = j;
    }

    private final zzaet zzb(long j, long j4) {
        return new zzaet((j * 1000000) / this.zza.zze, this.zzb + j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        zzaee zzaeeVar = this.zza;
        zzaed zzaedVar = zzaeeVar.zzk;
        zzdd.zzb(zzaedVar);
        long[] jArr = zzaedVar.zza;
        long[] jArr2 = zzaedVar.zzb;
        int iZzd = zzex.zzd(jArr, zzaeeVar.zzb(j), true, false);
        zzaet zzaetVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzaetVarZzb.zzb == j || iZzd == jArr.length - 1) {
            return new zzaeq(zzaetVarZzb, zzaetVarZzb);
        }
        int i10 = iZzd + 1;
        return new zzaeq(zzaetVarZzb, zzb(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
