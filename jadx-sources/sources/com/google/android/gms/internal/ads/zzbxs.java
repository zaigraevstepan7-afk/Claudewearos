package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbxs implements zzgcx {
    final /* synthetic */ mf.a zza;

    public zzbxs(zzbxt zzbxtVar, mf.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        zzbxt.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbxt.zzc.remove(this.zza);
    }
}
