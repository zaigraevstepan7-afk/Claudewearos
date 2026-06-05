package lb;

import android.content.Context;
import c1.z4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10286c;

    public /* synthetic */ f2(Context context, f1.a1 a1Var, int i10) {
        this.f10284a = i10;
        this.f10285b = context;
        this.f10286c = a1Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10284a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Context context = this.f10285b;
                    boolean zH = i0Var.h(context);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        objQ = new k2(context, this.f10286c, 0);
                        i0Var.l0(objQ);
                    }
                    z4.i((ej.a) objQ, null, false, null, null, null, c.f10171h, i0Var, 805306368, 510);
                } else {
                    i0Var.W();
                }
                break;
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Context context2 = this.f10285b;
                    boolean zH2 = i0Var2.h(context2);
                    Object objQ2 = i0Var2.Q();
                    if (zH2 || objQ2 == f1.m.f6385a) {
                        objQ2 = new k2(context2, this.f10286c, 1);
                        i0Var2.l0(objQ2);
                    }
                    z4.i((ej.a) objQ2, null, false, null, null, null, mb.a.f11434a, i0Var2, 805306368, 510);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
