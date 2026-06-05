package com.google.ads.mediation;

import fc.l;
import tc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f3431a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3432b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f3431a = abstractAdViewAdapter;
        this.f3432b = mVar;
    }

    @Override // fc.l
    public final void a() {
        this.f3432b.onAdClosed(this.f3431a);
    }

    @Override // fc.l
    public final void c() {
        this.f3432b.onAdOpened(this.f3431a);
    }
}
