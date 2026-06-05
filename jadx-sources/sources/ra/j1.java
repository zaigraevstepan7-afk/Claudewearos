package ra;

import c1.v7;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 implements ej.g {
    public final /* synthetic */ String A;
    public final /* synthetic */ f1.a1 B;
    public final /* synthetic */ f1.a1 C;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f14039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2.a f14040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1.t f14041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mg.d f14042f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f14043z;

    public j1(List list, long j, f1.a1 a1Var, k2.a aVar, t1.t tVar, mg.d dVar, c cVar, String str, f1.a1 a1Var2, f1.a1 a1Var3) {
        this.f14037a = list;
        this.f14038b = j;
        this.f14039c = a1Var;
        this.f14040d = aVar;
        this.f14041e = tVar;
        this.f14042f = dVar;
        this.f14043z = cVar;
        this.A = str;
        this.B = a1Var2;
        this.C = a1Var3;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        Object obj5 = (e0.i) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.i0 i0Var = (f1.i0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (i0Var.f(obj5) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= i0Var.d(iIntValue) ? 32 : 16;
        }
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            String str = (String) this.f14037a.get(iIntValue);
            i0Var.b0(1950106254);
            v1.o oVarF = v.n.f(z1.h.c(b0.d.g(1.0f, v1.l.f17564b), j0.e.a(12)), this.f14038b, c2.e0.f2986b);
            Object objQ = i0Var.Q();
            Object obj6 = f1.m.f6385a;
            if (objQ == obj6) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            f1.a1 a1Var = this.f14039c;
            boolean zF = i0Var.f(a1Var) | i0Var.h(this.f14040d);
            t1.t tVar = this.f14041e;
            boolean zF2 = zF | i0Var.f(tVar);
            mg.d dVar = this.f14042f;
            boolean zH = zF2 | i0Var.h(dVar) | i0Var.h(this.f14043z) | i0Var.f(this.A) | i0Var.f(str);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == obj6) {
                objQ2 = new h1(str, this.f14040d, tVar, dVar, this.f14043z, this.A, a1Var, this.B, this.C);
                i0Var.l0(objQ2);
            }
            v1.o oVarK = v.n.k(oVarF, kVar, null, false, null, (ej.a) objQ2, 28);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarK);
            v2.h.f17668w.getClass();
            ej.a aVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            v7.a(str, null, 0L, hj.a.x(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24576, 0, 262126);
            i0Var.p(true);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
