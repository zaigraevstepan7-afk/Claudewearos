package va;

import f1.i0;
import f1.n1;
import java.util.List;
import t.m1;
import t2.q0;
import wa.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements ej.g {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ int C;
    public final /* synthetic */ xa.b D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ float F;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f17996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f17997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f17999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f18000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f18001f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f18002z;

    public t(List list, ej.c cVar, boolean z2, float f10, float f11, float f12, float f13, float f14, float f15, int i10, xa.b bVar, boolean z10, float f16) {
        this.f17996a = list;
        this.f17997b = cVar;
        this.f17998c = z2;
        this.f17999d = f10;
        this.f18000e = f11;
        this.f18001f = f12;
        this.f18002z = f13;
        this.A = f14;
        this.B = f15;
        this.C = i10;
        this.D = bVar;
        this.E = z10;
        this.F = f16;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        e0.i iVar = (e0.i) obj;
        int iIntValue = ((Number) obj2).intValue();
        i0 i0Var = (i0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (i0Var.f(iVar) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= i0Var.d(iIntValue) ? 32 : 16;
        }
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            int i11 = i10 & 126;
            o0 o0Var = (o0) this.f17996a.get(iIntValue);
            i0Var.b0(-1449223905);
            v1.o oVarG = b0.d.g(1.0f, v1.l.f17564b);
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            boolean zD = i0Var.d(o0Var.f19130a.f19862a);
            Object objQ2 = i0Var.Q();
            if (zD || objQ2 == fVar) {
                objQ2 = new sa.n(1, this.f17997b, o0Var);
                i0Var.l0(objQ2);
            }
            v1.o oVarK = v.n.k(oVarG, kVar, null, false, null, (ej.a) objQ2, 28);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarK);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            xa.b bVar = this.D;
            a.b(iIntValue, this.f17998c, this.f17999d, this.f18000e, this.f18001f, this.f18002z, this.A, this.B, this.C, bVar.f19850b, bVar, this.E, this.F, o0Var.f19130a.f19864c.f19855a, i0Var, (i11 >> 3) & 14);
            i0Var.p(true);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
