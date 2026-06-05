package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f2465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.e f2466c;

    public /* synthetic */ n2(h2 h2Var, ej.e eVar, int i10) {
        this.f2464a = i10;
        this.f2465b = h2Var;
        this.f2466c = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2464a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarX = b0.d.x(v1.l.f17564b, 0.0f, 0.0f, o2.f2514e, 0.0f, 11);
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iT = f1.s.t(i0Var);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarX);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    v2.e eVar = v2.g.f17650g;
                    if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                        m6.a.l(iT, i0Var, iT, eVar);
                    }
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    f1.s.a(g1.f2116a.a(new c2.w(this.f2465b.f2180c)), this.f2466c, i0Var, 8);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o2.c(this.f2465b.f2181d, e1.t.f5664p, this.f2466c, i0Var2, 48);
                } else {
                    i0Var2.W();
                }
                break;
            default:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v1.o oVarX2 = b0.d.x(v1.l.f17564b, o2.f2515f, 0.0f, 0.0f, 0.0f, 14);
                    t2.q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                    int iT2 = f1.s.t(i0Var3);
                    f1.n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC2 = v1.a.c(i0Var3, oVarX2);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar2);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, q0VarD2);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                    v2.e eVar2 = v2.g.f17650g;
                    if (i0Var3.S || !fj.l.b(i0Var3.Q(), Integer.valueOf(iT2))) {
                        m6.a.l(iT2, i0Var3, iT2, eVar2);
                    }
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                    o2.c(this.f2465b.f2182e, e1.t.f5667s, this.f2466c, i0Var3, 48);
                    i0Var3.p(true);
                } else {
                    i0Var3.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
