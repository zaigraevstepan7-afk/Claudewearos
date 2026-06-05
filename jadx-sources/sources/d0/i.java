package d0;

import ak.x;
import b0.b0;
import b0.t1;
import b0.z;
import c1.v7;
import f1.g1;
import f1.i0;
import f1.n1;
import g0.a0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4362c;

    public /* synthetic */ i(int i10, int i11, Object obj) {
        this.f4360a = i11;
        this.f4362c = obj;
        this.f4361b = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4360a) {
            case 0:
                k kVar = (k) this.f4362c;
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x xVar = kVar.f4368b.f4359b;
                    int i10 = this.f4361b;
                    f0.l lVarD = xVar.d(i10);
                    ((f) lVarD.f6165c).f4356c.e(kVar.f4369c, Integer.valueOf(i10 - lVarD.f6163a), i0Var, 0);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 1:
                e0.h hVar = (e0.h) this.f4362c;
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x xVar2 = hVar.f5240b.f5238c;
                    int i11 = this.f4361b;
                    f0.l lVarD2 = xVar2.d(i11);
                    ((e0.f) lVarD2.f6165c).f5235d.e(e0.i.f5242a, Integer.valueOf(i11 - lVarD2.f6163a), i0Var2, 6);
                } else {
                    i0Var2.W();
                }
                return pi.o.f13011a;
            case 2:
                ((Integer) obj2).getClass();
                x8.a.a((List) this.f4362c, (i0) obj, f1.s.O(this.f4361b | 1));
                break;
            case 3:
                g0.w wVar = (g0.w) this.f4362c;
                i0 i0Var3 = (i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x xVarK = wVar.f6981b.k();
                    int i12 = this.f4361b;
                    f0.l lVarD3 = xVarK.d(i12);
                    ((g0.q) lVarD3.f6165c).f6961b.e(a0.f6850a, Integer.valueOf(i12 - lVarD3.f6163a), i0Var3, 0);
                } else {
                    i0Var3.W();
                }
                return pi.o.f13011a;
            case 4:
                g1 g1Var = (g1) this.f4362c;
                i0 i0Var4 = (i0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    b0 b0VarA = z.a(b0.j.f1361c, v1.b.E, i0Var4, 0);
                    int iHashCode = Long.hashCode(i0Var4.T);
                    n1 n1VarL = i0Var4.l();
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarC = v1.a.c(i0Var4, lVar);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL);
                    f1.s.w(i0Var4, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var4);
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC);
                    v7.a("The following settings require an app restart to take effect:", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 6, 0, 262142);
                    b0.d.e(i0Var4, t1.e(10, lVar));
                    v7.a(y8.f.b("\u2022 Beyond viewport pages: ", lb.r.g(this.f4361b), " -> ", lb.r.g(g1Var.g())), null, lb.r.f10606c, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 24960, 0, 262122);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                return pi.o.f13011a;
            default:
                ((Integer) obj2).intValue();
                lb.c.a((ej.a) this.f4362c, (i0) obj, f1.s.O(this.f4361b | 1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ i(int i10, g1 g1Var) {
        this.f4360a = 4;
        this.f4361b = i10;
        this.f4362c = g1Var;
    }
}
