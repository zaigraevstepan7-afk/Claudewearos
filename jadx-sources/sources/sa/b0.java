package sa;

import c1.v7;
import f1.n1;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14809b;

    public /* synthetic */ b0(String str, int i10) {
        this.f14808a = i10;
        this.f14809b = str;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        ej.e eVar;
        f1.i0 i0Var;
        switch (this.f14808a) {
            case 0:
                ej.e eVar2 = (ej.e) obj;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(eVar2, "innerTextField");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var2.h(eVar2) ? 4 : 2;
                }
                int i10 = iIntValue;
                if (i0Var2.T(i10 & 1, (i10 & 19) != 18)) {
                    q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, v1.l.f17564b);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                    f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var2);
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                    if (this.f14809b.length() == 0) {
                        i0Var2.b0(1159857615);
                        eVar = eVar2;
                        v7.a("Search apps", null, c2.w.c(c2.w.f3054d, 0.72f), hj.a.x(15), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                        i0Var2 = i0Var2;
                        i0Var2.p(false);
                    } else {
                        eVar = eVar2;
                        i0Var2.b0(1160256430);
                        i0Var2.p(false);
                    }
                    eVar.invoke(i0Var2, Integer.valueOf(i10 & 14));
                    i0Var2.p(true);
                } else {
                    i0Var2.W();
                }
                break;
            default:
                ej.e eVar3 = (ej.e) obj;
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f(eVar3, "innerTextField");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= i0Var3.h(eVar3) ? 4 : 2;
                }
                int i11 = iIntValue2;
                if (i0Var3.T(i11 & 1, (i11 & 19) != 18)) {
                    q0 q0VarD2 = b0.r.d(v1.b.f17547a, false);
                    int iHashCode2 = Long.hashCode(i0Var3.T);
                    n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC2 = v1.a.c(i0Var3, v1.l.f17564b);
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
                    f1.s.w(i0Var3, Integer.valueOf(iHashCode2), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var3);
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                    if (this.f14809b.length() == 0) {
                        i0Var3.b0(1080922710);
                        v7.a("Search apps", null, c2.w.c(c2.w.f3054d, 0.72f), hj.a.x(15), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1597830, 0, 262058);
                        f1.i0 i0Var4 = i0Var3;
                        i0Var4.p(false);
                        i0Var = i0Var4;
                    } else {
                        i0Var3.b0(1081321525);
                        i0Var3.p(false);
                        i0Var = i0Var3;
                    }
                    eVar3.invoke(i0Var, Integer.valueOf(i11 & 14));
                    i0Var.p(true);
                } else {
                    i0Var3.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
