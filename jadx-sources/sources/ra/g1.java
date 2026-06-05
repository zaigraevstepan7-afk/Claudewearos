package ra;

import c1.v7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14007b;

    public /* synthetic */ g1(long j, int i10) {
        this.f14006a = i10;
        this.f14007b = j;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f14006a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v1.o oVarU = b0.d.u(b0.t1.c(1.0f, v1.l.f17564b), 32, 12);
                    b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.C, i0Var, 0);
                    int iHashCode = Long.hashCode(i0Var.T);
                    f1.n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarU);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    v7.a("DEV LOGS", null, this.f14007b, hj.a.x(13), k3.s.A, null, hj.a.w(0.5d), null, 0L, 0, false, 0, 0, null, i0Var, 102261126, 0, 261802);
                    i0Var.p(true);
                } else {
                    i0Var.W();
                }
                break;
            default:
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.r1) obj, "$this$TextButton");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v7.a("Got it", null, this.f14007b, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1573254, 0, 262074);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
