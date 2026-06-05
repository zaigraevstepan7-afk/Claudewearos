package t1;

import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f15421e;

    /* renamed from: f, reason: collision with root package name */
    public final g f15422f;

    public d(long j, k kVar, ej.c cVar, g gVar) {
        super(j, kVar);
        this.f15421e = cVar;
        this.f15422f = gVar;
        gVar.k();
    }

    @Override // t1.g
    public final void c() {
        g gVar = this.f15422f;
        if (this.f15440c) {
            return;
        }
        if (this.f15439b != gVar.g()) {
            a();
        }
        gVar.l();
        this.f15440c = true;
        synchronized (m.f15471c) {
            o();
        }
    }

    @Override // t1.g
    public final ej.c e() {
        return this.f15421e;
    }

    @Override // t1.g
    public final boolean f() {
        return true;
    }

    @Override // t1.g
    public final ej.c i() {
        return null;
    }

    @Override // t1.g
    public final void k() {
        r.o();
        throw null;
    }

    @Override // t1.g
    public final void l() {
        r.o();
        throw null;
    }

    @Override // t1.g
    public final void n(a0 a0Var) {
        p0 p0Var = m.f15469a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // t1.g
    public final g u(ej.c cVar) {
        return new d(this.f15439b, this.f15438a, m.k(cVar, this.f15421e, true), this.f15422f);
    }

    @Override // t1.g
    public final void m() {
    }
}
