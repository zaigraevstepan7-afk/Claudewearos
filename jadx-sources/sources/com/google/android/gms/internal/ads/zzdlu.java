package com.google.android.gms.internal.ads;

import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdlu implements zzgcx {
    final /* synthetic */ zzcai zza;

    public zzdlu(zzdlv zzdlvVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        int i10 = l0.f13401b;
        k.d("Failed to load media data due to video view load failure.");
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (zzcfeVar == null) {
            this.zza.zzd(new zzegx(1, "Missing webview from video view future."));
        } else {
            zzcfeVar.zzag("/video", new zzccx(new zzdlt(this.zza)));
            zzcfeVar.zzaa();
        }
    }
}
