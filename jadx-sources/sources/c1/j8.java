package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final v.j1 f2300a;

    /* renamed from: b, reason: collision with root package name */
    public final t.l0 f2301b = new t.l0(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public qj.l f2302c;

    public j8(v.j1 j1Var) {
        this.f2300a = j1Var;
    }

    public final void a() {
        this.f2301b.f15226c.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        t.l0 l0Var = this.f2301b;
        return ((Boolean) l0Var.f15225b.getValue()).booleanValue() || ((Boolean) l0Var.f15226c.getValue()).booleanValue();
    }

    public final Object c(v.f1 f1Var, vi.i iVar) {
        ti.c cVar = null;
        h8 h8Var = new h8(this, new i8(this, cVar, 0), f1Var, cVar, 0);
        v.j1 j1Var = this.f2300a;
        j1Var.getClass();
        Object objH = qj.b0.h(new d1.m0(f1Var, j1Var, h8Var, (ti.c) null), iVar);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }
}
