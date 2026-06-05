package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.i1 f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.e f2628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2629e;

    public r0(float f10, b0.i1 i1Var, long j, p1.e eVar, long j4) {
        this.f2625a = f10;
        this.f2626b = i1Var;
        this.f2627c = j;
        this.f2628d = eVar;
        this.f2629e = j4;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z2 = (iIntValue & 3) != 2;
        v2.f2 f2Var = i0Var.f6313a;
        if (i0Var.T(iIntValue & 1, z2)) {
            t.u0 u0VarL = z4.l(e1.u.f5673e, i0Var);
            t.u0 u0VarL2 = z4.l(e1.u.f5672d, i0Var);
            t.u0 u0VarL3 = z4.l(e1.u.f5670b, i0Var);
            t.u0 u0VarL4 = z4.l(e1.u.f5671c, i0Var);
            float f10 = this.f2625a;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarS = b0.d.s(b0.t1.a(lVar, Float.NaN, f10), this.f2626b);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new v0();
                i0Var.l0(objQ);
            }
            v0 v0Var = (v0) objQ;
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
            f1.s.M(eVar, i0Var, v0Var);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var, n1VarL);
            v2.e eVar3 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                m6.a.l(iT, i0Var, iT, eVar3);
            }
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var, oVarC);
            v1.o oVarL = t2.z.l(lVar, "leadingIcon");
            v1.e eVar5 = v1.b.E;
            s.a0.b(false, oVarL, s.n0.a(u0VarL3, eVar5).a(s.n0.c(u0VarL, 2)), s.n0.e(u0VarL4, eVar5).a(s.n0.d(u0VarL2, 2)), null, p1.j.d(687705959, new y0(this.f2627c, 2), i0Var), i0Var, 196656, 16);
            v1.o oVarV = b0.d.v(t2.z.l(lVar, "label"), t0.f2695a, 0.0f, 2);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.D, i0Var, 54);
            int iT2 = f1.s.t(i0Var);
            f1.n1 n1VarL2 = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarV);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q1VarA);
            f1.s.M(eVar2, i0Var, n1VarL2);
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT2))) {
                m6.a.l(iT2, i0Var, iT2, eVar3);
            }
            f1.s.M(eVar4, i0Var, oVarC2);
            this.f2628d.invoke(i0Var, 0);
            i0Var.p(true);
            v1.o oVarL2 = t2.z.l(lVar, "trailingIcon");
            v1.e eVar6 = v1.b.G;
            s.a0.b(false, oVarL2, s.n0.a(u0VarL3, eVar6).a(s.n0.c(u0VarL, 2)), s.n0.e(u0VarL4, eVar6).a(s.n0.d(u0VarL2, 2)), null, p1.j.d(1905252304, new y0(this.f2629e, 3), i0Var), i0Var, 196656, 16);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
