package lb;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10615d;

    public /* synthetic */ r1(Object obj, boolean z2, pi.c cVar, int i10, int i11) {
        this.f10612a = i11;
        this.f10614c = obj;
        this.f10613b = z2;
        this.f10615d = cVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10612a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f10614c;
                mi.p pVar = (mi.p) this.f10615d;
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarS = b0.t1.s(v1.l.f17564b, 2);
                    ga.c cVar = new ga.c(18, 1);
                    Object objQ = i0Var.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new d(8);
                        i0Var.l0(objQ);
                    }
                    uk.c.c(oVarS, arrayList, pVar, this.f10613b, cVar, null, null, (ej.e) objQ, i0Var, 12582918, 96);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 1:
                ((Integer) obj2).getClass();
                v3.a((t3) this.f10614c, this.f10613b, (ej.a) this.f10615d, (f1.i0) obj, f1.s.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ua.k.a((xa.f) this.f10614c, this.f10613b, (ej.c) this.f10615d, (f1.i0) obj, f1.s.O(1));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ r1(ArrayList arrayList, mi.p pVar, boolean z2) {
        this.f10612a = 0;
        this.f10614c = arrayList;
        this.f10615d = pVar;
        this.f10613b = z2;
    }
}
