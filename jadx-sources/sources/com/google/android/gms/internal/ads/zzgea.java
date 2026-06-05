package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgea extends zzgdj {
    final /* synthetic */ zzgec zza;
    private final zzgch zzb;

    public zzgea(zzgec zzgecVar, zzgch zzgchVar) {
        this.zza = zzgecVar;
        this.zzb = zzgchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ Object zza() {
        zzgch zzgchVar = this.zzb;
        mf.a aVarZza = zzgchVar.zza();
        zzfve.zzd(aVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgchVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzn((mf.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
