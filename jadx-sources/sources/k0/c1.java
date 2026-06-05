package k0;

import c1.z2;
import f1.q2;
import w2.k2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9068c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9070e;

    public /* synthetic */ c1(ej.e eVar, w.d dVar, ej.f fVar, ej.a aVar) {
        this.f9066a = 2;
        this.f9067b = eVar;
        this.f9068c = dVar;
        this.f9069d = fVar;
        this.f9070e = aVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object objG;
        switch (this.f9066a) {
            case 0:
                c2.s sVar = (c2.s) this.f9067b;
                t0 t0Var = (t0) this.f9068c;
                l3.t tVar = (l3.t) this.f9069d;
                long j = tVar.f9938b;
                l3.n nVar = (l3.n) this.f9070e;
                v1.o oVar = (v1.o) obj;
                f1.i0 i0Var = (f1.i0) obj2;
                ((Integer) obj3).getClass();
                i0Var.b0(-84507373);
                boolean zBooleanValue = ((Boolean) i0Var.j(w2.f1.f18277x)).booleanValue();
                boolean zG = i0Var.g(zBooleanValue);
                Object objQ = i0Var.Q();
                f1.f fVar = f1.m.f6385a;
                if (zG || objQ == fVar) {
                    objQ = new t0.g(zBooleanValue);
                    i0Var.l0(objQ);
                }
                t0.g gVar = (t0.g) objQ;
                boolean z2 = ((sVar instanceof c2.z0) && ((c2.z0) sVar).f3065a == 16) ? false : true;
                if (((Boolean) ((w2.r1) ((k2) i0Var.j(w2.f1.f18274u))).f18367a.getValue()).booleanValue() && t0Var.b() && g3.m0.c(j) && z2) {
                    i0Var.b0(-707487962);
                    g3.f fVar2 = tVar.f9937a;
                    g3.m0 m0Var = new g3.m0(j);
                    boolean zH = i0Var.h(gVar);
                    Object objQ2 = i0Var.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new z2(gVar, null, 6);
                        i0Var.l0(objQ2);
                    }
                    f1.s.g(fVar2, m0Var, (ej.e) objQ2, i0Var);
                    boolean zH2 = i0Var.h(gVar) | i0Var.h(nVar) | i0Var.f(tVar) | i0Var.h(t0Var) | i0Var.f(sVar);
                    Object objQ3 = i0Var.Q();
                    if (zH2 || objQ3 == fVar) {
                        objQ3 = new d.b(gVar, nVar, tVar, t0Var, sVar, 1);
                        i0Var.l0(objQ3);
                    }
                    objG = z1.h.g(oVar, (ej.c) objQ3);
                    i0Var.p(false);
                } else {
                    i0Var.b0(-705473241);
                    i0Var.p(false);
                    objG = v1.l.f17564b;
                }
                i0Var.p(false);
                break;
            case 1:
                v.v1 v1Var = (v.v1) this.f9067b;
                gi.d dVar = (gi.d) this.f9068c;
                q2 q2Var = (q2) this.f9069d;
                f1.a1 a1Var = (f1.a1) this.f9070e;
                v1.o oVar2 = (v1.o) obj;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(oVar2, "overscrollModifier");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var2.f(oVar2) ? 4 : 2;
                }
                if (i0Var2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    v1.o oVarT = v.n.t(oVar2.c(b0.t1.f1433c), v1Var, true);
                    float f10 = 20;
                    v1.o oVarX = b0.d.x(b0.d.v(oVarT, f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, nb.v.j, 7);
                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    f1.n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarX);
                    v2.h.f17668w.getClass();
                    v2.f fVar3 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar3);
                    } else {
                        i0Var2.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var2, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                    f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var2);
                    f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                    ab.d dVar2 = b0.d.f1295e;
                    v1.l lVar = v1.l.f17564b;
                    b0.d.e(i0Var2, b0.d.C(lVar, dVar2));
                    b0.d.e(i0Var2, b0.t1.e(64, lVar));
                    nb.v.e(0, i0Var2);
                    b0.d.e(i0Var2, b0.t1.e(28, lVar));
                    nb.v.c(dVar, i0Var2, 0);
                    b0.d.e(i0Var2, b0.t1.e(f10, lVar));
                    ig.l lVar2 = (ig.l) q2Var.getValue();
                    String str = lVar2 != null ? ((jg.d) lVar2).f8873b.f8924e : null;
                    if (str == null) {
                        i0Var2.b0(-1729269641);
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(-1729269640);
                        nb.v.i(str, i0Var2, 0);
                        b0.d.e(i0Var2, b0.t1.e(f10, lVar));
                        i0Var2.p(false);
                    }
                    if (((String) a1Var.getValue()) != null) {
                        i0Var2.b0(-1729088321);
                        String str2 = (String) a1Var.getValue();
                        fj.l.c(str2);
                        nb.v.b(str2, i0Var2, 0);
                        b0.d.e(i0Var2, b0.t1.e(16, lVar));
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(-1728965313);
                        i0Var2.p(false);
                    }
                    b0.d.e(i0Var2, b0.t1.e(12, lVar));
                    i0Var2.p(true);
                } else {
                    i0Var2.W();
                }
                break;
            default:
                ej.e eVar = (ej.e) this.f9067b;
                w.d dVar3 = (w.d) this.f9068c;
                ej.f fVar4 = (ej.f) this.f9069d;
                ej.a aVar = (ej.a) this.f9070e;
                w.c cVar = (w.c) obj;
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= i0Var3.f(cVar) ? 4 : 2;
                }
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str3 = (String) eVar.invoke(i0Var3, 0);
                    if (nj.e.K0(str3)) {
                        a0.a.c("Label must not be blank");
                    }
                    dVar3.getClass();
                    w.b.f18140a.d(str3, Boolean.TRUE, cVar, fVar4, aVar, i0Var3, Integer.valueOf((iIntValue2 << 9) & 7168));
                } else {
                    i0Var3.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f9066a = i10;
        this.f9067b = obj;
        this.f9068c = obj2;
        this.f9069d = obj3;
        this.f9070e = obj4;
    }
}
