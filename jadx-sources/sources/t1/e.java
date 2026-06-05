package t1;

import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f15428e;

    /* renamed from: f, reason: collision with root package name */
    public int f15429f;

    public e(long j, k kVar, ej.c cVar) {
        super(j, kVar);
        this.f15428e = cVar;
        this.f15429f = 1;
    }

    @Override // t1.g
    public final void c() {
        if (this.f15440c) {
            return;
        }
        l();
        this.f15440c = true;
        synchronized (m.f15471c) {
            o();
        }
    }

    @Override // t1.g
    public final ej.c e() {
        return this.f15428e;
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
        this.f15429f++;
    }

    @Override // t1.g
    public final void l() {
        int i10 = this.f15429f - 1;
        this.f15429f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // t1.g
    public final void n(a0 a0Var) {
        p0 p0Var = m.f15469a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // t1.g
    public final g u(ej.c cVar) {
        m.c(this);
        return new d(this.f15439b, this.f15438a, m.k(cVar, this.f15428e, true), this);
    }

    @Override // t1.g
    public final void m() {
    }
}
