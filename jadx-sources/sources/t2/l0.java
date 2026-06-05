package t2;

import w2.c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        super(2);
        this.f15592a = i10;
        this.f15593b = obj;
        this.f15594c = obj2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15592a;
        Object obj3 = this.f15593b;
        Object obj4 = this.f15594c;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    Boolean bool = (Boolean) ((e0) obj3).f15539g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    ej.e eVar = (ej.e) obj4;
                    i0Var.d0(bool);
                    boolean zG = i0Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        eVar.invoke(i0Var, 0);
                    } else {
                        if (i0Var.f6323l != 0) {
                            f1.n.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!i0Var.S) {
                            if (zG) {
                                i1.g gVar = i0Var.G;
                                int i11 = gVar.f8119g;
                                int i12 = gVar.f8120h;
                                j1.b bVar = i0Var.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f8609b.f8606d.f0(j1.i.f8633c);
                                f1.s.k(i11, i12, i0Var.f6330s);
                                i0Var.G.t();
                            } else {
                                i0Var.V();
                            }
                        }
                    }
                    if (i0Var.f6336y && i0Var.G.f8121i == i0Var.f6337z) {
                        i0Var.f6337z = -1;
                        i0Var.f6336y = false;
                    }
                    i0Var.p(false);
                    break;
                }
                break;
            case 1:
                c2.u uVar = (c2.u) obj;
                f2.b bVar2 = (f2.b) obj2;
                v2.i1 i1Var = (v2.i1) obj3;
                v2.f0 f0Var = i1Var.H;
                if (!f0Var.H()) {
                    i1Var.f17687d0 = true;
                    break;
                } else {
                    i1Var.f17684a0 = uVar;
                    i1Var.Z = bVar2;
                    v2.t1 snapshotObserver = ((w2.t) v2.i0.a(f0Var)).getSnapshotObserver();
                    c2.t0 t0Var = v2.i1.f17679f0;
                    snapshotObserver.f17770a.c(i1Var, v2.d.f17597d, (v2.f1) obj4);
                    i1Var.f17687d0 = false;
                    break;
                }
            default:
                int iIntValue2 = ((Number) obj).intValue();
                d3.r rVar = (d3.r) obj2;
                x1.e eVar2 = (x1.e) obj4;
                if (!((c2) obj3).f18219b.c(rVar.f4768f)) {
                    eVar2.m(iIntValue2, rVar);
                    eVar2.A.h(oVar);
                    break;
                }
                break;
        }
        return oVar;
    }
}
