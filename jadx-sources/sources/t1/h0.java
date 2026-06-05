package t1;

import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends g {

    /* renamed from: e, reason: collision with root package name */
    public final g f15449e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15450f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15451g;

    /* renamed from: h, reason: collision with root package name */
    public ej.c f15452h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15453i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g gVar, ej.c cVar, boolean z2, boolean z10) {
        ej.c cVarE;
        super(0L, k.f15461e);
        p0 p0Var = m.f15469a;
        this.f15449e = gVar;
        this.f15450f = z2;
        this.f15451g = z10;
        this.f15452h = m.k(cVar, (gVar == null || (cVarE = gVar.e()) == null) ? m.j.f15408e : cVarE, z2);
        this.f15453i = p1.j.b();
    }

    @Override // t1.g
    public final void c() {
        g gVar;
        this.f15440c = true;
        if (!this.f15451g || (gVar = this.f15449e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // t1.g
    public final k d() {
        return v().d();
    }

    @Override // t1.g
    public final ej.c e() {
        return this.f15452h;
    }

    @Override // t1.g
    public final boolean f() {
        return v().f();
    }

    @Override // t1.g
    public final long g() {
        return v().g();
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
    public final void m() {
        v().m();
    }

    @Override // t1.g
    public final void n(a0 a0Var) {
        v().n(a0Var);
    }

    @Override // t1.g
    public final g u(ej.c cVar) {
        ej.c cVarK = m.k(cVar, this.f15452h, true);
        return !this.f15450f ? m.g(v().u(null), cVarK, true) : v().u(cVarK);
    }

    public final g v() {
        g gVar = this.f15449e;
        return gVar == null ? m.j : gVar;
    }
}
