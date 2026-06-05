package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f19637a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.b0 f19638b = new g0.b0(this);

    /* renamed from: c, reason: collision with root package name */
    public final v.j1 f19639c = new v.j1();

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f19640d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.j1 f19641e;

    /* renamed from: f, reason: collision with root package name */
    public final f1.j1 f19642f;

    public n(ej.c cVar) {
        this.f19637a = cVar;
        Boolean bool = Boolean.FALSE;
        this.f19640d = f1.s.A(bool);
        this.f19641e = f1.s.A(bool);
        this.f19642f = f1.s.A(bool);
    }

    @Override // x.f2
    public final boolean a() {
        return ((Boolean) this.f19640d.getValue()).booleanValue();
    }

    @Override // x.f2
    public final Object b(v.f1 f1Var, ej.e eVar, vi.c cVar) {
        Object objH = qj.b0.h(new w6.z(this, f1Var, eVar, null, 3), cVar);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }

    @Override // x.f2
    public final float e(float f10) {
        return ((Number) this.f19637a.invoke(Float.valueOf(f10))).floatValue();
    }
}
