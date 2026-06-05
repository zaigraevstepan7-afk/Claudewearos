package bb;

import android.content.Context;
import b0.r;
import c1.h3;
import c1.z4;
import f1.a1;
import f1.g1;
import f1.i0;
import f1.n1;
import f1.s;
import java.util.List;
import java.util.Set;
import lb.t3;
import lb.v3;
import t2.q0;
import t2.z;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1662e;

    public /* synthetic */ c(Object obj, Object obj2, ej.a aVar, ej.c cVar, int i10, int i11) {
        this.f1658a = i11;
        this.f1659b = obj;
        this.f1661d = obj2;
        this.f1660c = aVar;
        this.f1662e = cVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1658a) {
            case 0:
                ((Integer) obj2).getClass();
                v.d((v1.o) this.f1659b, (ej.a) this.f1660c, (ej.a) this.f1661d, (p1.e) this.f1662e, (i0) obj, s.O(3079));
                break;
            case 1:
                lb.g gVar = (lb.g) this.f1659b;
                Context context = (Context) this.f1660c;
                g1 g1Var = (g1) this.f1661d;
                a1 a1Var = (a1) this.f1662e;
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = i0Var.h(gVar) | i0Var.h(context);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        objQ = new h3(gVar, context, g1Var, a1Var, 2);
                        i0Var.l0(objQ);
                    }
                    z4.i((ej.a) objQ, null, false, null, null, null, lb.c.f10164a, i0Var, 805306368, 510);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 2:
                ((Integer) obj2).getClass();
                v3.b((t3) this.f1659b, (mi.p) this.f1661d, (ej.a) this.f1660c, (ej.c) this.f1662e, (i0) obj, s.O(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mb.a.e((String) this.f1659b, (mi.p) this.f1662e, (ej.a) this.f1660c, (ej.a) this.f1661d, (i0) obj, s.O(385));
                break;
            case 4:
                v1.o oVar = (v1.o) this.f1659b;
                a1 a1Var2 = (a1) this.f1660c;
                p1.e eVar = (p1.e) this.f1662e;
                r0.c cVar = (r0.c) this.f1661d;
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objQ2 = i0Var2.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ2 == fVar) {
                        objQ2 = new ab.i(a1Var2, 19);
                        i0Var2.l0(objQ2);
                    }
                    v1.o oVarM = z.m(oVar, (ej.c) objQ2);
                    q0 q0VarD = r.d(v1.b.f17547a, true);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarM);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar2);
                    } else {
                        i0Var2.o0();
                    }
                    s.M(v2.g.f17649f, i0Var2, q0VarD);
                    s.M(v2.g.f17648e, i0Var2, n1VarL);
                    s.M(v2.g.f17650g, i0Var2, Integer.valueOf(iHashCode));
                    s.I(v2.g.f17651h, i0Var2);
                    s.M(v2.g.f17647d, i0Var2, oVarC);
                    eVar.invoke(i0Var2, 0);
                    Object objQ3 = i0Var2.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new r0.d(a1Var2, 0);
                        i0Var2.l0(objQ3);
                    }
                    cVar.b((ej.a) objQ3, i0Var2, 6);
                    i0Var2.p(true);
                } else {
                    i0Var2.W();
                }
                return pi.o.f13011a;
            default:
                ((Integer) obj2).getClass();
                ua.k.b((List) this.f1659b, (Set) this.f1661d, (ej.a) this.f1660c, (ej.c) this.f1662e, (i0) obj, s.O(1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ c(String str, mi.p pVar, ej.a aVar, ej.a aVar2, int i10) {
        this.f1658a = 3;
        this.f1659b = str;
        this.f1662e = pVar;
        this.f1660c = aVar;
        this.f1661d = aVar2;
    }

    public /* synthetic */ c(lb.g gVar, Context context, g1 g1Var, a1 a1Var) {
        this.f1658a = 1;
        this.f1659b = gVar;
        this.f1660c = context;
        this.f1661d = g1Var;
        this.f1662e = a1Var;
    }

    public /* synthetic */ c(v1.o oVar, ej.a aVar, ej.a aVar2, p1.e eVar, int i10) {
        this.f1658a = 0;
        this.f1659b = oVar;
        this.f1660c = aVar;
        this.f1661d = aVar2;
        this.f1662e = eVar;
    }

    public /* synthetic */ c(v1.o oVar, a1 a1Var, p1.e eVar, r0.c cVar) {
        this.f1658a = 4;
        this.f1659b = oVar;
        this.f1660c = a1Var;
        this.f1662e = eVar;
        this.f1661d = cVar;
    }
}
