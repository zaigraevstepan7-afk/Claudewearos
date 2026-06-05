package s;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14593b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i10) {
        super(2);
        this.f14592a = i10;
        this.f14593b = obj;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14592a) {
            case 0:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                g0 g0Var3 = g0.f14604c;
                break;
            case 1:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.f14593b;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ej.e eVar = (ej.e) list.get(i10);
                        int iHashCode = Long.hashCode(i0Var.T);
                        v2.h.f17668w.getClass();
                        v2.f fVar = v2.g.f17646c;
                        i0Var.e0();
                        if (i0Var.S) {
                            i0Var.k(fVar);
                        } else {
                            i0Var.o0();
                        }
                        f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
                        eVar.invoke(i0Var, 0);
                        i0Var.p(true);
                    }
                } else {
                    i0Var.W();
                }
                break;
            case 2:
                v1.o oVar = (v1.o) obj;
                v1.o oVarB = (v1.m) obj2;
                f1.i0 i0Var2 = (f1.i0) this.f14593b;
                if (oVarB instanceof v1.j) {
                    ej.f fVar2 = ((v1.j) oVarB).f17562b;
                    fj.y.c(3, fVar2);
                    oVarB = v1.a.b(i0Var2, (v1.o) fVar2.c(v1.l.f17564b, i0Var2, 0));
                }
                break;
            case 3:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((w2.a) this.f14593b).a(0, i0Var3);
                } else {
                    i0Var3.W();
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ((w2.a1) this.f14593b).a(f1.s.O(1), (f1.i0) obj);
                break;
            case 5:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objQ = i0Var4.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = w3.c.f18478b;
                        i0Var4.l0(objQ);
                    }
                    u0.c.c(d3.p.a(v1.l.f17564b, false, (ej.c) objQ), (ej.e) ((f1.a1) this.f14593b).getValue(), i0Var4, 0);
                } else {
                    i0Var4.W();
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                ((w3.t) this.f14593b).a(f1.s.O(1), (f1.i0) obj);
                break;
            case 7:
                ((Number) obj2).intValue();
                ((w3.x) this.f14593b).a(f1.s.O(1), (f1.i0) obj);
                break;
            default:
                ((x1.e) this.f14593b).m(((Number) obj).intValue(), (d3.r) obj2);
                break;
        }
        return pi.o.f13011a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(w2.a aVar, int i10, int i11) {
        super(2);
        this.f14592a = i11;
        this.f14593b = aVar;
    }
}
