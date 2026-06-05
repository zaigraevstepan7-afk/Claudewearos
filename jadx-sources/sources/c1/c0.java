package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1957c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.f1955a = i10;
        this.f1956b = obj;
        this.f1957c = obj2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1955a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarS = b0.d.s(b0.t1.a(v1.l.f17564b, w.f2783b, w.f2784c), (b0.i1) this.f1956b);
                    b0.f fVar = b0.j.f1363e;
                    v1.f fVar2 = v1.b.D;
                    ej.f fVar3 = (ej.f) this.f1957c;
                    b0.q1 q1VarA = b0.o1.a(fVar, fVar2, i0Var, 54);
                    int iT = f1.s.t(i0Var);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarS);
                    v2.h.f17668w.getClass();
                    v2.f fVar4 = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar4);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    v2.e eVar = v2.g.f17650g;
                    if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                        m6.a.l(iT, i0Var, iT, eVar);
                    }
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    fVar3.c(b0.r1.f1410a, i0Var, 6);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o2.c(((h2) this.f1956b).f2179b, e1.t.f5659k, (p1.e) this.f1957c, i0Var2, 48);
                } else {
                    i0Var2.W();
                }
                break;
            case 2:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p1.e eVar2 = (p1.e) this.f1956b;
                    h5 h5Var = (h5) this.f1957c;
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iT2 = f1.s.t(i0Var3);
                    f1.n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC2 = v1.a.c(i0Var3, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar5 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar5);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                    v2.e eVar3 = v2.g.f17650g;
                    if (i0Var3.S || !fj.l.b(i0Var3.Q(), Integer.valueOf(iT2))) {
                        m6.a.l(iT2, i0Var3, iT2, eVar3);
                    }
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                    eVar2.c(h5Var, i0Var3, 6);
                    i0Var3.p(true);
                } else {
                    i0Var3.W();
                }
                break;
            case 3:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    f1.a1 a1Var = (f1.a1) this.f1956b;
                    Object objQ = i0Var4.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new ab.i(a1Var, 2);
                        i0Var4.l0(objQ);
                    }
                    v1.o oVarM = t2.z.m(v1.l.f17564b, (ej.c) objQ);
                    p1.e eVar4 = (p1.e) this.f1957c;
                    t2.q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                    int iT3 = f1.s.t(i0Var4);
                    f1.n1 n1VarL3 = i0Var4.l();
                    v1.o oVarC3 = v1.a.c(i0Var4, oVarM);
                    v2.h.f17668w.getClass();
                    v2.f fVar6 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar6);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, q0VarD2);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL3);
                    v2.e eVar5 = v2.g.f17650g;
                    if (i0Var4.S || !fj.l.b(i0Var4.Q(), Integer.valueOf(iT3))) {
                        m6.a.l(iT3, i0Var4, iT3, eVar5);
                    }
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC3);
                    eVar4.invoke(i0Var4, 0);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                break;
            case 4:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                String str = (String) this.f1956b;
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zF = i0Var5.f(str);
                    Object objQ2 = i0Var5.Q();
                    if (zF || objQ2 == f1.m.f6385a) {
                        objQ2 = new q(str, 4);
                        i0Var5.l0(objQ2);
                    }
                    v1.o oVarA = d3.p.a(v1.l.f17564b, false, (ej.c) objQ2);
                    p1.e eVar6 = (p1.e) this.f1957c;
                    t2.q0 q0VarD3 = b0.r.d(v1.b.f17547a, false);
                    int iT4 = f1.s.t(i0Var5);
                    f1.n1 n1VarL4 = i0Var5.l();
                    v1.o oVarC4 = v1.a.c(i0Var5, oVarA);
                    v2.h.f17668w.getClass();
                    v2.f fVar7 = v2.g.f17645b;
                    i0Var5.e0();
                    if (i0Var5.S) {
                        i0Var5.k(fVar7);
                    } else {
                        i0Var5.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var5, q0VarD3);
                    f1.s.M(v2.g.f17648e, i0Var5, n1VarL4);
                    v2.e eVar7 = v2.g.f17650g;
                    if (i0Var5.S || !fj.l.b(i0Var5.Q(), Integer.valueOf(iT4))) {
                        m6.a.l(iT4, i0Var5, iT4, eVar7);
                    }
                    f1.s.M(v2.g.f17647d, i0Var5, oVarC4);
                    eVar6.invoke(i0Var5, 0);
                    i0Var5.p(true);
                } else {
                    i0Var5.W();
                }
                break;
            default:
                f1.i0 i0Var6 = (f1.i0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((ej.f) this.f1957c).c((d1.a1) this.f1956b, i0Var6, 6);
                } else {
                    i0Var6.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public c0(ej.f fVar, d1.a1 a1Var) {
        this.f1955a = 5;
        this.f1957c = fVar;
        this.f1956b = a1Var;
    }
}
