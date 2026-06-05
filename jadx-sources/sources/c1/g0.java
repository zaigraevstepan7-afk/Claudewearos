package c1;

import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2115b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f2114a = i10;
        this.f2115b = obj;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2114a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p1.e eVar = (p1.e) this.f2115b;
                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
                    int iT = f1.s.t(i0Var);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    v2.e eVar2 = v2.g.f17650g;
                    if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iT))) {
                        m6.a.l(iT, i0Var, iT, eVar2);
                    }
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    eVar.c(b0.c0.f1285a, i0Var, 6);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                wh.s sVar = (wh.s) this.f2115b;
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strI = d1.i.i(R.string.m3c_dialog, i0Var2);
                    v1.o oVarN = b0.t1.n((v1.o) sVar.f19380b, j.f2253a, j.f2254b, 10);
                    boolean zF = i0Var2.f(strI);
                    Object objQ = i0Var2.Q();
                    if (zF || objQ == f1.m.f6385a) {
                        objQ = new q(strI, 1);
                        i0Var2.l0(objQ);
                    }
                    v1.o oVarC2 = oVarN.c(d3.p.a(v1.l.f17564b, false, (ej.c) objQ));
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
                    int iT2 = f1.s.t(i0Var2);
                    f1.n1 n1VarL2 = i0Var2.l();
                    v1.o oVarC3 = v1.a.c(i0Var2, oVarC2);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar2);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL2);
                    v2.e eVar3 = v2.g.f17650g;
                    if (i0Var2.S || !fj.l.b(i0Var2.Q(), Integer.valueOf(iT2))) {
                        m6.a.l(iT2, i0Var2, iT2, eVar3);
                    }
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC3);
                    ((p1.e) sVar.f19382d).invoke(i0Var2, 0);
                    i0Var2.p(true);
                } else {
                    i0Var2.W();
                }
                break;
            case 2:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b0.c cVar = b0.j.f1360b;
                    v1.f fVar3 = v1.b.D;
                    ej.f fVar4 = ((z5) this.f2115b).f2949e;
                    b0.q1 q1VarA = b0.o1.a(cVar, fVar3, i0Var3, 54);
                    int iT3 = f1.s.t(i0Var3);
                    f1.n1 n1VarL3 = i0Var3.l();
                    v1.o oVarC4 = v1.a.c(i0Var3, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar5 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar5);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL3);
                    v2.e eVar4 = v2.g.f17650g;
                    if (i0Var3.S || !fj.l.b(i0Var3.Q(), Integer.valueOf(iT3))) {
                        m6.a.l(iT3, i0Var3, iT3, eVar4);
                    }
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC4);
                    fVar4.c(b0.r1.f1410a, i0Var3, 6);
                    i0Var3.p(true);
                } else {
                    i0Var3.W();
                }
                break;
            case 3:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objQ2 = i0Var4.Q();
                    if (objQ2 == f1.m.f6385a) {
                        objQ2 = new ab.d(14);
                        i0Var4.l0(objQ2);
                    }
                    v1.o oVarA = d3.p.a(v1.l.f17564b, false, (ej.c) objQ2);
                    f1.a1 a1Var = (f1.a1) this.f2115b;
                    t2.q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                    int iT4 = f1.s.t(i0Var4);
                    f1.n1 n1VarL4 = i0Var4.l();
                    v1.o oVarC5 = v1.a.c(i0Var4, oVarA);
                    v2.h.f17668w.getClass();
                    v2.f fVar6 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar6);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, q0VarD2);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL4);
                    v2.e eVar5 = v2.g.f17650g;
                    if (i0Var4.S || !fj.l.b(i0Var4.Q(), Integer.valueOf(iT4))) {
                        m6.a.l(iT4, i0Var4, iT4, eVar5);
                    }
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC5);
                    ((ej.e) a1Var.getValue()).invoke(i0Var4, 0);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                break;
            default:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    v7.a((String) this.f2115b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var5, 0, 0, 262142);
                } else {
                    i0Var5.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
