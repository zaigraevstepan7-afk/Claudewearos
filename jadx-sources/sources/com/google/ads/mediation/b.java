package com.google.ads.mediation;

import fc.m;
import tc.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends fc.c implements gc.e, nc.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f3427a;

    /* renamed from: b, reason: collision with root package name */
    public final i f3428b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f3427a = abstractAdViewAdapter;
        this.f3428b = iVar;
    }

    @Override // fc.c, nc.a
    public final void onAdClicked() {
        this.f3428b.onAdClicked(this.f3427a);
    }

    @Override // fc.c
    public final void onAdClosed() {
        this.f3428b.onAdClosed(this.f3427a);
    }

    @Override // fc.c
    public final void onAdFailedToLoad(m mVar) {
        this.f3428b.onAdFailedToLoad(this.f3427a, mVar);
    }

    @Override // fc.c
    public final void onAdLoaded() {
        this.f3428b.onAdLoaded(this.f3427a);
    }

    @Override // fc.c
    public final void onAdOpened() {
        this.f3428b.onAdOpened(this.f3427a);
    }

    @Override // gc.e
    public final void onAppEvent(String str, String str2) {
        this.f3428b.zzb(this.f3427a, str, str2);
    }
}
