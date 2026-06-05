package wg;

import zg.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l f19286a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19287b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19288c;

    public a(l lVar, boolean z2, boolean z10) {
        this.f19286a = lVar;
        this.f19287b = z2;
        this.f19288c = z10;
    }

    public final boolean a(zg.c cVar) {
        return (this.f19287b && !this.f19288c) || this.f19286a.f20605a.h(cVar);
    }

    public final boolean b(rg.h hVar) {
        return hVar.isEmpty() ? this.f19287b && !this.f19288c : a(hVar.z());
    }
}
