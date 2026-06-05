package com.google.android.gms.internal.ads;

import pc.m;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbse implements m {
    final /* synthetic */ zzbsg zza;

    public zzbse(zzbsg zzbsgVar) {
        this.zza = zzbsgVar;
    }

    @Override // pc.m
    public final void zzdH() {
        k.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // pc.m
    public final void zzdk() {
        k.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // pc.m
    public final void zzds() {
        k.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // pc.m
    public final void zzdt() {
        k.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbsg zzbsgVar = this.zza;
        zzbsgVar.zzb.onAdOpened(zzbsgVar);
    }

    @Override // pc.m
    public final void zzdw(int i10) {
        k.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbsg zzbsgVar = this.zza;
        zzbsgVar.zzb.onAdClosed(zzbsgVar);
    }

    @Override // pc.m
    public final void zzdv() {
    }
}
