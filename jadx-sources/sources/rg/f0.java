package rg;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f0 extends hj.a {

    /* renamed from: f, reason: collision with root package name */
    public final z f14411f;

    /* renamed from: g, reason: collision with root package name */
    public final h f14412g;

    public f0(z zVar, h hVar) {
        this.f14411f = zVar;
        this.f14412g = hVar;
    }

    @Override // hj.a
    public final zg.r C() {
        return this.f14411f.g(this.f14412g, new ArrayList());
    }

    @Override // hj.a
    public final hj.a v(zg.c cVar) {
        return new f0(this.f14411f, this.f14412g.i(cVar));
    }
}
