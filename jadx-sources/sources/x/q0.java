package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends m0 {

    /* renamed from: c0, reason: collision with root package name */
    public r0 f19681c0;

    /* renamed from: d0, reason: collision with root package name */
    public o1 f19682d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f19683e0;

    /* renamed from: f0, reason: collision with root package name */
    public ej.f f19684f0;

    /* renamed from: g0, reason: collision with root package name */
    public ej.f f19685g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f19686h0;

    @Override // x.m0
    public final void C1(long j) {
        if (!this.G || fj.l.b(this.f19684f0, p0.f19671a)) {
            return;
        }
        qj.z zVarE1 = e1();
        qj.a0 a0Var = qj.a0.f13538a;
        qj.b0.w(zVarE1, null, new bb.k(this, j, null), 1);
    }

    @Override // x.m0
    public final void D1(w wVar) {
        if (!this.G || fj.l.b(this.f19685g0, p0.f19672b)) {
            return;
        }
        qj.z zVarE1 = e1();
        qj.a0 a0Var = qj.a0.f13538a;
        qj.b0.w(zVarE1, null, new w6.z(this, wVar, null, 5), 1);
    }

    @Override // x.m0
    public final boolean I1() {
        return this.f19683e0;
    }

    @Override // x.m0
    public final Object x1(l0 l0Var, l0 l0Var2) {
        r0 r0Var = this.f19681c0;
        v.f1 f1Var = v.f1.f17189a;
        Object objA = r0Var.a(new w6.z(l0Var, this, null, 4), l0Var2);
        return objA == ui.a.f17085a ? objA : pi.o.f13011a;
    }
}
