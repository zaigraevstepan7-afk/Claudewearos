package com.google.android.gms.internal.ads;

import android.view.View;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdig implements zzgcx {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdih zzb;

    public zzdig(zzdih zzdihVar, View view) {
        this.zza = view;
        this.zzb = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfC)).booleanValue()) {
            n.D.f11582h.zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzaf(this.zza, (zzecz) obj);
    }
}
