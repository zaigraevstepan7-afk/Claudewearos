package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbsf implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbsg zzb;

    public zzbsf(zzbsg zzbsgVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbsgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        y9.a aVar = n.D.f11576b;
        y9.a.m(this.zzb.zza, this.zza, true, null);
    }
}
