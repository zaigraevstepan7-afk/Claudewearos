package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafi implements zzaes {
    final /* synthetic */ zzafl zza;
    private final long zzb;

    public zzafi(zzafl zzaflVar, long j) {
        this.zza = zzaflVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        zzafl zzaflVar = this.zza;
        zzaeq zzaeqVarZza = zzaflVar.zzi[0].zza(j);
        for (int i10 = 1; i10 < zzaflVar.zzi.length; i10++) {
            zzaeq zzaeqVarZza2 = zzaflVar.zzi[i10].zza(j);
            if (zzaeqVarZza2.zza.zzc < zzaeqVarZza.zza.zzc) {
                zzaeqVarZza = zzaeqVarZza2;
            }
        }
        return zzaeqVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}
