package bb;

import b0.r;
import c1.e0;
import c1.f0;
import c1.o2;
import c1.z4;
import c2.w0;
import f1.a1;
import f1.f1;
import f1.i0;
import f1.n1;
import f1.s;
import t2.q0;
import t2.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1655f;

    public /* synthetic */ a(ej.e eVar, ej.e eVar2, p1.e eVar3, ej.e eVar4, ej.e eVar5, int i10) {
        this.f1650a = 3;
        this.f1652c = eVar;
        this.f1655f = eVar2;
        this.f1651b = eVar3;
        this.f1653d = eVar4;
        this.f1654e = eVar5;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1650a) {
            case 0:
                p1.e eVar = (p1.e) this.f1651b;
                v1.o oVar = (v1.o) this.f1652c;
                p pVar = (p) this.f1655f;
                f1 f1Var = (f1) this.f1653d;
                f1 f1Var2 = (f1) this.f1654e;
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = i0Var.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ == fVar) {
                        objQ = new b(f1Var, 0);
                        i0Var.l0(objQ);
                    }
                    v1.o oVarA = o2.f.a(z.n(oVar, (ej.c) objQ), pVar, null);
                    Object objQ2 = i0Var.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new b(f1Var2, 1);
                        i0Var.l0(objQ2);
                    }
                    eVar.c(b0.d.o(oVarA, (ej.c) objQ2), i0Var, 0);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 1:
                p1.e eVar2 = (p1.e) this.f1651b;
                v1.o oVar2 = (v1.o) this.f1652c;
                l lVar = (l) this.f1655f;
                f1 f1Var3 = (f1) this.f1653d;
                f1 f1Var4 = (f1) this.f1654e;
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ3 = i0Var2.Q();
                    f1.f fVar2 = f1.m.f6385a;
                    if (objQ3 == fVar2) {
                        objQ3 = new b(f1Var3, 2);
                        i0Var2.l0(objQ3);
                    }
                    v1.o oVarA2 = o2.f.a(z.n(oVar2, (ej.c) objQ3), lVar, null);
                    Object objQ4 = i0Var2.Q();
                    if (objQ4 == fVar2) {
                        objQ4 = new b(f1Var4, 3);
                        i0Var2.l0(objQ4);
                    }
                    eVar2.c(b0.d.o(oVarA2, (ej.c) objQ4), i0Var2, 0);
                } else {
                    i0Var2.W();
                }
                return pi.o.f13011a;
            case 2:
                ((Integer) obj2).getClass();
                z4.c((v1.o) this.f1652c, (w0) this.f1655f, (e0) this.f1653d, (f0) this.f1654e, (p1.e) this.f1651b, (i0) obj, s.O(196615));
                break;
            case 3:
                ((Integer) obj2).getClass();
                o2.b((ej.e) this.f1652c, (ej.e) this.f1655f, (p1.e) this.f1651b, (ej.e) this.f1653d, (ej.e) this.f1654e, (i0) obj, s.O(385));
                break;
            case 4:
                ej.a aVar = (ej.a) this.f1651b;
                kj.d dVar = (kj.d) this.f1652c;
                ej.c cVar = (ej.c) this.f1655f;
                a1 a1Var = (a1) this.f1653d;
                a1 a1Var2 = (a1) this.f1654e;
                fj.l.f((hb.h) obj, "$this$DampedDragAnimation");
                Boolean bool = Boolean.TRUE;
                a1Var.setValue(bool);
                a1Var2.setValue(Float.valueOf(((Number) cg.b.r((Comparable) aVar.a(), dVar)).floatValue()));
                if (cVar != null) {
                    cVar.invoke(bool);
                }
                return pi.o.f13011a;
            case 5:
                a1 a1Var3 = (a1) this.f1651b;
                a1 a1Var4 = (a1) this.f1652c;
                a1 a1Var5 = (a1) this.f1655f;
                a1 a1Var6 = (a1) this.f1653d;
                a1 a1Var7 = (a1) this.f1654e;
                i0 i0Var3 = (i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objQ5 = i0Var3.Q();
                    if (objQ5 == f1.m.f6385a) {
                        lb.f0 f0Var = new lb.f0(a1Var3, a1Var4, a1Var5, a1Var6, a1Var7);
                        i0Var3.l0(f0Var);
                        objQ5 = f0Var;
                    }
                    z4.i((ej.a) objQ5, null, false, null, null, null, lb.c.f10183u, i0Var3, 805306374, 510);
                } else {
                    i0Var3.W();
                }
                return pi.o.f13011a;
            default:
                v1.o oVar3 = (v1.o) this.f1652c;
                a1 a1Var8 = (a1) this.f1655f;
                p1.e eVar3 = (p1.e) this.f1651b;
                r0.c cVar2 = (r0.c) this.f1653d;
                ej.a aVar2 = (ej.a) this.f1654e;
                i0 i0Var4 = (i0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objQ6 = i0Var4.Q();
                    if (objQ6 == f1.m.f6385a) {
                        objQ6 = new ab.i(a1Var8, 18);
                        i0Var4.l0(objQ6);
                    }
                    v1.o oVarM = z.m(oVar3, (ej.c) objQ6);
                    q0 q0VarD = r.d(v1.b.f17547a, true);
                    int iHashCode = Long.hashCode(i0Var4.T);
                    n1 n1VarL = i0Var4.l();
                    v1.o oVarC = v1.a.c(i0Var4, oVarM);
                    v2.h.f17668w.getClass();
                    v2.f fVar3 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar3);
                    } else {
                        i0Var4.o0();
                    }
                    s.M(v2.g.f17649f, i0Var4, q0VarD);
                    s.M(v2.g.f17648e, i0Var4, n1VarL);
                    s.M(v2.g.f17650g, i0Var4, Integer.valueOf(iHashCode));
                    s.I(v2.g.f17651h, i0Var4);
                    s.M(v2.g.f17647d, i0Var4, oVarC);
                    eVar3.invoke(i0Var4, 0);
                    cVar2.b(aVar2, i0Var4, 6);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                return pi.o.f13011a;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, a1 a1Var, a1 a1Var2, int i10) {
        this.f1650a = i10;
        this.f1651b = obj;
        this.f1652c = obj2;
        this.f1655f = obj3;
        this.f1653d = a1Var;
        this.f1654e = a1Var2;
    }

    public /* synthetic */ a(v1.o oVar, w0 w0Var, e0 e0Var, f0 f0Var, p1.e eVar, int i10) {
        this.f1650a = 2;
        this.f1652c = oVar;
        this.f1655f = w0Var;
        this.f1653d = e0Var;
        this.f1654e = f0Var;
        this.f1651b = eVar;
    }

    public /* synthetic */ a(v1.o oVar, a1 a1Var, p1.e eVar, r0.c cVar, ej.a aVar) {
        this.f1650a = 6;
        this.f1652c = oVar;
        this.f1655f = a1Var;
        this.f1651b = eVar;
        this.f1653d = cVar;
        this.f1654e = aVar;
    }
}
