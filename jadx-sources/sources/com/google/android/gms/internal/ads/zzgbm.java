package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgbm extends zzgbo {
    public zzgbm(mf.a aVar, Class cls, zzgci zzgciVar) {
        super(aVar, cls, zzgciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th2) {
        zzgci zzgciVar = (zzgci) obj;
        mf.a aVarZza = zzgciVar.zza(th2);
        zzfve.zzd(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgciVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* synthetic */ void zzf(Object obj) {
        zzn((mf.a) obj);
    }
}
