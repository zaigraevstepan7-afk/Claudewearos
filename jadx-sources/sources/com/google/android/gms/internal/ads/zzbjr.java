package com.google.android.gms.internal.ads;

import mc.n;
import qc.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbjr implements zzgcx {
    final /* synthetic */ zzcfe zza;

    public zzbjr(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        n.D.f11582h.zzw(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcfe zzcfeVar = this.zza;
        new b0(zzcfeVar.getContext(), zzcfeVar.zzm().f14321a, str, zzcfeVar.zzD() != null ? zzcfeVar.zzD().zzax : null).zzb();
    }
}
