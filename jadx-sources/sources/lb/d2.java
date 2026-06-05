package lb;

import c1.z4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10235c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10236d;

    public /* synthetic */ d2(f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, int i10) {
        this.f10233a = i10;
        this.f10234b = a1Var;
        this.f10235c = a1Var2;
        this.f10236d = a1Var3;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10233a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = i0Var.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new h1(this.f10234b, this.f10235c, this.f10236d, 8);
                        i0Var.l0(objQ);
                    }
                    z4.i((ej.a) objQ, null, false, null, null, null, c.f10174l, i0Var, 805306374, 510);
                } else {
                    i0Var.W();
                }
                break;
            default:
                String str = (String) obj;
                ra.s0 s0Var = (ra.s0) obj2;
                fj.l.f(str, "url");
                fj.l.f(s0Var, "pos");
                this.f10234b.setValue(Boolean.FALSE);
                this.f10235c.setValue(s0Var);
                this.f10236d.setValue(str);
                break;
        }
        return pi.o.f13011a;
    }
}
