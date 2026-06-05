package lb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10756b;

    public /* synthetic */ w0(Context context, int i10) {
        this.f10755a = i10;
        this.f10756b = context;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10755a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Context context = this.f10756b;
                    boolean zH = i0Var.h(context);
                    Object objQ = i0Var.Q();
                    Object obj4 = f1.m.f6385a;
                    if (zH || objQ == obj4) {
                        objQ = new g1(context, 0);
                        i0Var.l0(objQ);
                    }
                    q3.i("Lock Screen", "Require passcode when opening launcher", 0L, 0L, (ej.a) objQ, i0Var, 54, 12);
                    q3.k(0, i0Var);
                    boolean zH2 = i0Var.h(context);
                    Object objQ2 = i0Var.Q();
                    if (zH2 || objQ2 == obj4) {
                        objQ2 = new g1(context, 1);
                        i0Var.l0(objQ2);
                    }
                    q3.i("Passcode", "Set up passcode for folder protection", 0L, 0L, (ej.a) objQ2, i0Var, 54, 12);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Context context2 = this.f10756b;
                    boolean zH3 = i0Var2.h(context2);
                    Object objQ3 = i0Var2.Q();
                    Object obj5 = f1.m.f6385a;
                    if (zH3 || objQ3 == obj5) {
                        objQ3 = new g1(context2, 5);
                        i0Var2.l0(objQ3);
                    }
                    q3.i("Open animations", "Customize app opening animation", 0L, 0L, (ej.a) objQ3, i0Var2, 54, 12);
                    q3.k(0, i0Var2);
                    boolean zH4 = i0Var2.h(context2);
                    Object objQ4 = i0Var2.Q();
                    if (zH4 || objQ4 == obj5) {
                        objQ4 = new g1(context2, 6);
                        i0Var2.l0(objQ4);
                    }
                    q3.i("App icons", "Opacity, shape, icon pack and icon corners", 0L, 0L, (ej.a) objQ4, i0Var2, 54, 12);
                    q3.k(0, i0Var2);
                    boolean zH5 = i0Var2.h(context2);
                    Object objQ5 = i0Var2.Q();
                    if (zH5 || objQ5 == obj5) {
                        objQ5 = new g1(context2, 7);
                        i0Var2.l0(objQ5);
                    }
                    q3.i("Dock", "Dock padding, gap and corner radius", 0L, 0L, (ej.a) objQ5, i0Var2, 54, 12);
                    q3.k(0, i0Var2);
                    boolean zH6 = i0Var2.h(context2);
                    Object objQ6 = i0Var2.Q();
                    if (zH6 || objQ6 == obj5) {
                        objQ6 = new g1(context2, 8);
                        i0Var2.l0(objQ6);
                    }
                    q3.i("Highlights", "Highlight style and light direction", 0L, 0L, (ej.a) objQ6, i0Var2, 54, 12);
                } else {
                    i0Var2.W();
                }
                break;
            case 2:
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    q3.l("SOUNDS AND VIBRATION", i0Var3, 6);
                    q3.j(0L, p1.j.d(-286783799, new w0(this.f10756b, 5), i0Var3), i0Var3, 48);
                    b0.d.e(i0Var3, b0.t1.e(24, v1.l.f17564b));
                } else {
                    i0Var3.W();
                }
                break;
            case 3:
                f1.i0 i0Var4 = (f1.i0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    q3.l("SECURITY", i0Var4, 6);
                    q3.j(0L, p1.j.d(-717130072, new w0(this.f10756b, 0), i0Var4), i0Var4, 48);
                    b0.d.e(i0Var4, b0.t1.e(24, v1.l.f17564b));
                } else {
                    i0Var4.W();
                }
                break;
            case 4:
                f1.i0 i0Var5 = (f1.i0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    q3.l("CUSTOMIZATION", i0Var5, 6);
                    q3.j(0L, p1.j.d(-1147476345, new w0(this.f10756b, 1), i0Var5), i0Var5, 48);
                    b0.d.e(i0Var5, b0.t1.e(24, v1.l.f17564b));
                } else {
                    i0Var5.W();
                }
                break;
            default:
                f1.i0 i0Var6 = (f1.i0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Context context3 = this.f10756b;
                    boolean zH7 = i0Var6.h(context3);
                    Object objQ7 = i0Var6.Q();
                    if (zH7 || objQ7 == f1.m.f6385a) {
                        objQ7 = new g1(context3, 9);
                        i0Var6.l0(objQ7);
                    }
                    q3.i("Sounds and vibration", "Switch feedback and vibration settings", 0L, 0L, (ej.a) objQ7, i0Var6, 54, 12);
                } else {
                    i0Var6.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
