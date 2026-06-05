package w3;

import f1.a1;
import f1.i0;
import f1.n1;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f18524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f18525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(x xVar, a1 a1Var, int i10) {
        super(2);
        this.f18523a = i10;
        this.f18524b = xVar;
        this.f18525c = a1Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f18523a;
        pi.o oVar = pi.o.f13011a;
        a1 a1Var = this.f18525c;
        x xVar = this.f18524b;
        int i11 = 0;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    Object objQ = i0Var.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ == fVar) {
                        objQ = c.f18481e;
                        i0Var.l0(objQ);
                    }
                    v1.o oVarA = d3.p.a(v1.l.f17564b, false, (ej.c) objQ);
                    boolean zH = i0Var.h(xVar);
                    Object objQ2 = i0Var.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new j(xVar, 1);
                        i0Var.l0(objQ2);
                    }
                    v1.o oVarA2 = z1.h.a(xVar.getCanCalculatePosition() ? 1.0f : 0.0f, t2.z.n(oVarA, (ej.c) objQ2));
                    f1.v vVar = m.f18526a;
                    ej.e eVar = (ej.e) a1Var.getValue();
                    Object objQ3 = i0Var.Q();
                    if (objQ3 == fVar) {
                        objQ3 = e.f18497c;
                        i0Var.l0(objQ3);
                    }
                    q0 q0Var = (q0) objQ3;
                    int iHashCode = Long.hashCode(i0Var.T);
                    n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarA2);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar2);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, q0Var);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    eVar.invoke(i0Var, 0);
                    i0Var.p(true);
                    break;
                }
            default:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    f1.s.a(m.f18527b.a(Boolean.TRUE), p1.j.d(1022273628, new l(xVar, a1Var, i11), i0Var2), i0Var2, 56);
                    break;
                }
        }
        return oVar;
    }
}
