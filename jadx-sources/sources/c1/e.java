package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2039b;

    public /* synthetic */ e(int i10, ej.e eVar) {
        this.f2038a = i10;
        this.f2039b = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2038a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarC = b0.d.s(v1.l.f17564b, j.f2258f).c(new b0.l0(v1.b.E));
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iT = f1.s.t(i0Var);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC2 = v1.a.c(i0Var, oVarC);
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
                    f1.s.M(v2.g.f17647d, i0Var, oVarC2);
                    this.f2039b.invoke(i0Var, 0);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        c0.a.a("invalid weight; must be greater than zero");
                    }
                    v1.o oVarC3 = b0.d.s(new b0.y0(1.0f, false), j.f2259g).c(new b0.l0(v1.b.E));
                    t2.q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                    int iT2 = f1.s.t(i0Var2);
                    f1.n1 n1VarL2 = i0Var2.l();
                    v1.o oVarC4 = v1.a.c(i0Var2, oVarC3);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar2);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q0VarD2);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL2);
                    v2.e eVar2 = v2.g.f17650g;
                    if (i0Var2.S || !fj.l.b(i0Var2.Q(), Integer.valueOf(iT2))) {
                        m6.a.l(iT2, i0Var2, iT2, eVar2);
                    }
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC4);
                    this.f2039b.invoke(i0Var2, 0);
                    i0Var2.p(true);
                } else {
                    i0Var2.W();
                }
                break;
            case 2:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    t2.q0 q0VarD3 = b0.r.d(v1.b.f17547a, false);
                    int iT3 = f1.s.t(i0Var3);
                    f1.n1 n1VarL3 = i0Var3.l();
                    v1.o oVarC5 = v1.a.c(i0Var3, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar3 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar3);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, q0VarD3);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL3);
                    v2.e eVar3 = v2.g.f17650g;
                    if (i0Var3.S || !fj.l.b(i0Var3.Q(), Integer.valueOf(iT3))) {
                        m6.a.l(iT3, i0Var3, iT3, eVar3);
                    }
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC5);
                    this.f2039b.invoke(i0Var3, 0);
                    i0Var3.p(true);
                } else {
                    i0Var3.W();
                }
                break;
            case 3:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    t2.q0 q0VarD4 = b0.r.d(v1.b.f17547a, false);
                    int iT4 = f1.s.t(i0Var4);
                    f1.n1 n1VarL4 = i0Var4.l();
                    v1.o oVarC6 = v1.a.c(i0Var4, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar4 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar4);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, q0VarD4);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL4);
                    v2.e eVar4 = v2.g.f17650g;
                    if (i0Var4.S || !fj.l.b(i0Var4.Q(), Integer.valueOf(iT4))) {
                        m6.a.l(iT4, i0Var4, iT4, eVar4);
                    }
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC6);
                    this.f2039b.invoke(i0Var4, 0);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                break;
            case 4:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    t2.q0 q0VarD5 = b0.r.d(v1.b.f17547a, false);
                    int iT5 = f1.s.t(i0Var5);
                    f1.n1 n1VarL5 = i0Var5.l();
                    v1.o oVarC7 = v1.a.c(i0Var5, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar5 = v2.g.f17645b;
                    i0Var5.e0();
                    if (i0Var5.S) {
                        i0Var5.k(fVar5);
                    } else {
                        i0Var5.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var5, q0VarD5);
                    f1.s.M(v2.g.f17648e, i0Var5, n1VarL5);
                    v2.e eVar5 = v2.g.f17650g;
                    if (i0Var5.S || !fj.l.b(i0Var5.Q(), Integer.valueOf(iT5))) {
                        m6.a.l(iT5, i0Var5, iT5, eVar5);
                    }
                    f1.s.M(v2.g.f17647d, i0Var5, oVarC7);
                    this.f2039b.invoke(i0Var5, 0);
                    i0Var5.p(true);
                } else {
                    i0Var5.W();
                }
                break;
            case 5:
                f1.i0 i0Var6 = (f1.i0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    t2.q0 q0VarD6 = b0.r.d(v1.b.f17547a, false);
                    int iT6 = f1.s.t(i0Var6);
                    f1.n1 n1VarL6 = i0Var6.l();
                    v1.o oVarC8 = v1.a.c(i0Var6, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar6 = v2.g.f17645b;
                    i0Var6.e0();
                    if (i0Var6.S) {
                        i0Var6.k(fVar6);
                    } else {
                        i0Var6.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var6, q0VarD6);
                    f1.s.M(v2.g.f17648e, i0Var6, n1VarL6);
                    v2.e eVar6 = v2.g.f17650g;
                    if (i0Var6.S || !fj.l.b(i0Var6.Q(), Integer.valueOf(iT6))) {
                        m6.a.l(iT6, i0Var6, iT6, eVar6);
                    }
                    f1.s.M(v2.g.f17647d, i0Var6, oVarC8);
                    this.f2039b.invoke(i0Var6, 0);
                    i0Var6.p(true);
                } else {
                    i0Var6.W();
                }
                break;
            default:
                f1.i0 i0Var7 = (f1.i0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (i0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    v1.o oVarL = t2.z.l(v1.l.f17564b, "Container");
                    t2.q0 q0VarD7 = b0.r.d(v1.b.f17547a, true);
                    int iT7 = f1.s.t(i0Var7);
                    f1.n1 n1VarL7 = i0Var7.l();
                    v1.o oVarC9 = v1.a.c(i0Var7, oVarL);
                    v2.h.f17668w.getClass();
                    v2.f fVar7 = v2.g.f17645b;
                    i0Var7.e0();
                    if (i0Var7.S) {
                        i0Var7.k(fVar7);
                    } else {
                        i0Var7.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var7, q0VarD7);
                    f1.s.M(v2.g.f17648e, i0Var7, n1VarL7);
                    v2.e eVar7 = v2.g.f17650g;
                    if (i0Var7.S || !fj.l.b(i0Var7.Q(), Integer.valueOf(iT7))) {
                        m6.a.l(iT7, i0Var7, iT7, eVar7);
                    }
                    f1.s.M(v2.g.f17647d, i0Var7, oVarC9);
                    this.f2039b.invoke(i0Var7, 0);
                    i0Var7.p(true);
                } else {
                    i0Var7.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
