package com.google.ads.mediation;

import tc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends sc.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3430b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f3429a = abstractAdViewAdapter;
        this.f3430b = mVar;
    }

    @Override // fc.d
    public final void onAdFailedToLoad(fc.m mVar) {
        this.f3430b.onAdFailedToLoad(this.f3429a, mVar);
    }

    @Override // fc.d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        sc.a aVar = (sc.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f3429a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        m mVar = this.f3430b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, mVar));
        mVar.onAdLoaded(abstractAdViewAdapter);
    }
}
