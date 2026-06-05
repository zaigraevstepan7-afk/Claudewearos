package com.google.android.gms.internal.ads;

import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbow implements zzcak {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzboa zzb;

    public zzbow(zzboy zzboyVar, zzcai zzcaiVar, zzboa zzboaVar) {
        this.zza = zzcaiVar;
        this.zzb = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final void zza() {
        l0.k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzboj("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
