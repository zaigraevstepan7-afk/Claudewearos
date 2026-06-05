package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f2865b;

    /* renamed from: c, reason: collision with root package name */
    public t.j f2866c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.q f2867d;

    /* renamed from: e, reason: collision with root package name */
    public t.z f2868e;

    /* renamed from: f, reason: collision with root package name */
    public t.z f2869f;

    public x5(boolean z2, ej.a aVar, ej.a aVar2, y5 y5Var, ej.c cVar) {
        this.f2864a = z2;
        this.f2865b = cVar;
        if (z2 && y5Var == y5.f2913c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f2866c = t5.f2717b;
        int i10 = 4;
        this.f2867d = new d1.q(y5Var, new l(i10, aVar), aVar2, new a7.e(this, i10), cVar);
        this.f2868e = t.d.r();
        this.f2869f = t.d.r();
    }

    public static Object a(x5 x5Var, y5 y5Var, t.z zVar, vi.i iVar) {
        Object objA = x5Var.f2867d.a(y5Var, v.f1.f17189a, new w5(x5Var, x5Var.f2867d.f4563k.g(), zVar, null), iVar);
        return objA == ui.a.f17085a ? objA : pi.o.f13011a;
    }

    public final Object b(vi.i iVar) {
        Object objA;
        y5 y5Var = y5.f2912b;
        return (((Boolean) this.f2865b.invoke(y5Var)).booleanValue() && (objA = a(this, y5Var, this.f2868e, iVar)) == ui.a.f17085a) ? objA : pi.o.f13011a;
    }

    public final Object c(vi.i iVar) {
        Object objA;
        y5 y5Var = y5.f2911a;
        return (((Boolean) this.f2865b.invoke(y5Var)).booleanValue() && (objA = a(this, y5Var, this.f2869f, iVar)) == ui.a.f17085a) ? objA : pi.o.f13011a;
    }

    public final boolean d() {
        return this.f2867d.f4560g.getValue() != y5.f2911a;
    }

    public final Object e(vi.i iVar) {
        Object objA;
        if (this.f2864a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        y5 y5Var = y5.f2913c;
        return (((Boolean) this.f2865b.invoke(y5Var)).booleanValue() && (objA = a(this, y5Var, this.f2869f, iVar)) == ui.a.f17085a) ? objA : pi.o.f13011a;
    }

    public final Object f(vi.i iVar) {
        Object objA;
        d1.o0 o0VarD = this.f2867d.d();
        y5 y5Var = y5.f2913c;
        if (!o0VarD.f4550a.containsKey(y5Var)) {
            y5Var = y5.f2912b;
        }
        return (((Boolean) this.f2865b.invoke(y5Var)).booleanValue() && (objA = a(this, y5Var, this.f2868e, iVar)) == ui.a.f17085a) ? objA : pi.o.f13011a;
    }
}
