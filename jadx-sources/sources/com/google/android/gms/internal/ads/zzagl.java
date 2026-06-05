package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzagl extends zzaeg {
    final /* synthetic */ zzaes zza;
    final /* synthetic */ zzagm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagl(zzagm zzagmVar, zzaes zzaesVar, zzaes zzaesVar2) {
        super(zzaesVar);
        this.zza = zzaesVar2;
        this.zzb = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeg, com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        zzaeq zzaeqVarZzg = this.zza.zzg(j);
        zzaet zzaetVar = zzaeqVarZzg.zza;
        long j4 = zzaetVar.zzc;
        zzagm zzagmVar = this.zzb;
        zzaet zzaetVar2 = new zzaet(zzaetVar.zzb, zzagmVar.zzb + j4);
        zzaet zzaetVar3 = zzaeqVarZzg.zzb;
        return new zzaeq(zzaetVar2, new zzaet(zzaetVar3.zzb, zzagmVar.zzb + zzaetVar3.zzc));
    }
}
