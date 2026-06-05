package d1;

import b0.i1;
import c1.n4;
import c1.q7;
import f1.n1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f4610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q7 f4611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f4612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f4613d;

    public y0(f1.a1 a1Var, q7 q7Var, i1 i1Var, ej.e eVar) {
        this.f4610a = a1Var;
        this.f4611b = q7Var;
        this.f4612c = i1Var;
        this.f4613d = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            v1.o oVarL = t2.z.l(v1.l.f17564b, "Container");
            x0 x0Var = new x0(this.f4610a, f1.a1.class, "value", "getValue()Ljava/lang/Object;", 0);
            v1.e eVarC = d1.c(this.f4611b);
            float f10 = n4.f2471a;
            v1.o oVarG = z1.h.g(oVarL, new ab.m(x0Var, this.f4612c, eVarC, 3));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
            int iT = f1.s.t(i0Var);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarG);
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
            this.f4613d.invoke(i0Var, 0);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
