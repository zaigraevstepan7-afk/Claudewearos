package t1;

import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f15442o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f15443p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15444q;

    /* renamed from: r, reason: collision with root package name */
    public ej.c f15445r;

    /* renamed from: s, reason: collision with root package name */
    public ej.c f15446s;

    /* renamed from: t, reason: collision with root package name */
    public final long f15447t;

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(b bVar, ej.c cVar, ej.c cVar2, boolean z2, boolean z10) {
        ej.c cVarI;
        ej.c cVarE;
        p0 p0Var = m.f15469a;
        super(0L, k.f15461e, m.k(cVar, (bVar == null || (cVarE = bVar.e()) == null) ? m.j.f15408e : cVarE, z2), m.l(cVar2, (bVar == null || (cVarI = bVar.i()) == null) ? m.j.f15409f : cVarI));
        this.f15442o = bVar;
        this.f15443p = z2;
        this.f15444q = z10;
        this.f15445r = this.f15408e;
        this.f15446s = this.f15409f;
        this.f15447t = p1.j.b();
    }

    @Override // t1.b
    public final void B(q.h0 h0Var) {
        r.o();
        throw null;
    }

    @Override // t1.b
    public final b C(ej.c cVar, ej.c cVar2) {
        ej.c cVarK = m.k(cVar, this.f15445r, true);
        ej.c cVarL = m.l(cVar2, this.f15446s);
        return !this.f15443p ? new g0(D().C(null, cVarL), cVarK, cVarL, false, true) : D().C(cVarK, cVarL);
    }

    public final b D() {
        b bVar = this.f15442o;
        return bVar == null ? m.j : bVar;
    }

    @Override // t1.b, t1.g
    public final void c() {
        b bVar;
        this.f15440c = true;
        if (!this.f15444q || (bVar = this.f15442o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // t1.g
    public final k d() {
        return D().d();
    }

    @Override // t1.b, t1.g
    public final ej.c e() {
        return this.f15445r;
    }

    @Override // t1.b, t1.g
    public final boolean f() {
        return D().f();
    }

    @Override // t1.g
    public final long g() {
        return D().g();
    }

    @Override // t1.b, t1.g
    public final int h() {
        return D().h();
    }

    @Override // t1.b, t1.g
    public final ej.c i() {
        return this.f15446s;
    }

    @Override // t1.b, t1.g
    public final void k() {
        r.o();
        throw null;
    }

    @Override // t1.b, t1.g
    public final void l() {
        r.o();
        throw null;
    }

    @Override // t1.b, t1.g
    public final void m() {
        D().m();
    }

    @Override // t1.b, t1.g
    public final void n(a0 a0Var) {
        D().n(a0Var);
    }

    @Override // t1.g
    public final void r(k kVar) {
        r.o();
        throw null;
    }

    @Override // t1.g
    public final void s(long j) {
        r.o();
        throw null;
    }

    @Override // t1.b, t1.g
    public final void t(int i10) {
        D().t(i10);
    }

    @Override // t1.b, t1.g
    public final g u(ej.c cVar) {
        ej.c cVarK = m.k(cVar, this.f15445r, true);
        return !this.f15443p ? m.g(D().u(null), cVarK, true) : D().u(cVarK);
    }

    @Override // t1.b
    public final r w() {
        return D().w();
    }

    @Override // t1.b
    public final q.h0 x() {
        return D().x();
    }

    @Override // t1.b
    /* renamed from: y */
    public final ej.c e() {
        return this.f15445r;
    }
}
