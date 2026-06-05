package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfhk implements zzgcx {
    final /* synthetic */ zzfhm zza;
    final /* synthetic */ zzfhb zzb;

    public zzfhk(zzfhm zzfhmVar, zzfhb zzfhbVar) {
        this.zza = zzfhmVar;
        this.zzb = zzfhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzfhb zzfhbVar = this.zzb;
        zzfhbVar.zzh(th2);
        zzfhbVar.zzg(false);
        this.zza.zza(zzfhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
    }
}
