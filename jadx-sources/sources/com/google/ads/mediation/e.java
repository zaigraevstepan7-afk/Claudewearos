package com.google.ads.mediation;

import fc.m;
import ic.j;
import ic.k;
import ic.l;
import tc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends fc.c implements l, k, j {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f3433a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3434b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
        this.f3433a = abstractAdViewAdapter;
        this.f3434b = oVar;
    }

    @Override // fc.c, nc.a
    public final void onAdClicked() {
        this.f3434b.onAdClicked(this.f3433a);
    }

    @Override // fc.c
    public final void onAdClosed() {
        this.f3434b.onAdClosed(this.f3433a);
    }

    @Override // fc.c
    public final void onAdFailedToLoad(m mVar) {
        this.f3434b.onAdFailedToLoad(this.f3433a, mVar);
    }

    @Override // fc.c
    public final void onAdImpression() {
        this.f3434b.onAdImpression(this.f3433a);
    }

    @Override // fc.c
    public final void onAdOpened() {
        this.f3434b.onAdOpened(this.f3433a);
    }

    @Override // fc.c
    public final void onAdLoaded() {
    }
}
