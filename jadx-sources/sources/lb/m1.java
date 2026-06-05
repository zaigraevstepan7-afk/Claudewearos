package lb;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi.p f10473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10475d;

    public /* synthetic */ m1(mi.p pVar, boolean z2, f1.q2 q2Var, int i10) {
        this.f10472a = i10;
        this.f10473b = pVar;
        this.f10474c = z2;
        this.f10475d = q2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10472a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v1.o oVarS = b0.t1.s(v1.l.f17564b, 2);
                    List list = (List) this.f10475d.getValue();
                    ga.c cVar = new ga.c(18, 1);
                    Object objQ = i0Var.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new d(6);
                        i0Var.l0(objQ);
                    }
                    uk.c.c(oVarS, list, this.f10473b, this.f10474c, cVar, null, null, (ej.e) objQ, i0Var, 12582918, 96);
                } else {
                    i0Var.W();
                }
                break;
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v1.o oVarS2 = b0.t1.s(v1.l.f17564b, 2);
                    List list2 = (List) this.f10475d.getValue();
                    ga.c cVar2 = new ga.c(18, 1);
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == f1.m.f6385a) {
                        objQ2 = new d(9);
                        i0Var2.l0(objQ2);
                    }
                    uk.c.c(oVarS2, list2, this.f10473b, this.f10474c, cVar2, null, null, (ej.e) objQ2, i0Var2, 12582918, 96);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
