package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.e f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2077c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.e f2080f;

    public f(ej.e eVar, ej.e eVar2, long j, long j4, long j10, long j11, p1.e eVar3) {
        this.f2075a = eVar;
        this.f2076b = eVar2;
        this.f2077c = j4;
        this.f2078d = j10;
        this.f2079e = j11;
        this.f2080f = eVar3;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z2 = (iIntValue & 3) != 2;
        v2.f2 f2Var = i0Var.f6313a;
        if (i0Var.T(iIntValue & 1, z2)) {
            v1.o oVarS = b0.d.s(v1.l.f17564b, j.f2257e);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
            int iT = f1.s.t(i0Var);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarS);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var, b0VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var, n1VarL);
            v2.e eVar3 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                m6.a.l(iT, i0Var, iT, eVar3);
            }
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var, oVarC);
            i0Var.b0(346092326);
            i0Var.p(false);
            ej.e eVar5 = this.f2075a;
            if (eVar5 == null) {
                i0Var.b0(346396529);
            } else {
                i0Var.b0(346396530);
                d1.i.b(this.f2077c, p8.a(e1.m.f5563f, i0Var), p1.j.d(71284337, new e(0, eVar5), i0Var), i0Var, 384);
            }
            i0Var.p(false);
            ej.e eVar6 = this.f2076b;
            if (eVar6 == null) {
                i0Var.b0(347174009);
            } else {
                i0Var.b0(347174010);
                d1.i.b(this.f2078d, p8.a(e1.m.f5565h, i0Var), p1.j.d(705583346, new e(1, eVar6), i0Var), i0Var, 384);
            }
            i0Var.p(false);
            b0.l0 l0Var = new b0.l0(v1.b.G);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iT2 = f1.s.t(i0Var);
            f1.n1 n1VarL2 = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, l0Var);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q0VarD);
            f1.s.M(eVar2, i0Var, n1VarL2);
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT2))) {
                m6.a.l(iT2, i0Var, iT2, eVar3);
            }
            f1.s.M(eVar4, i0Var, oVarC2);
            d1.i.b(this.f2079e, p8.a(e1.m.f5559b, i0Var), this.f2080f, i0Var, 0);
            i0Var.p(true);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
