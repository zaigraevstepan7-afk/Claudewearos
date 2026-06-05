package d1;

import f1.n1;
import f1.q2;
import t.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2 f4616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.n0 f4618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f4619d;

    public z0(i1 i1Var, long j, g3.n0 n0Var, ej.e eVar) {
        this.f4616a = i1Var;
        this.f4617b = j;
        this.f4618c = n0Var;
        this.f4619d = eVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        v1.o oVar = (v1.o) obj;
        f1.i0 i0Var = (f1.i0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= i0Var.f(oVar) ? 4 : 2;
        }
        if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            q2 q2Var = this.f4616a;
            boolean zF = i0Var.f(q2Var);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = new ab.z(q2Var, 3);
                i0Var.l0(objQ);
            }
            v1.o oVarQ = c2.e0.q(oVar, (ej.c) objQ);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iT = f1.s.t(i0Var);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarQ);
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
            d1.b(this.f4617b, this.f4618c, this.f4619d, i0Var, 0);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
