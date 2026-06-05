package lb;

import com.anonlab.voidlauncher.feature.home.presentation.settings.UpdateScreenActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpdateScreenActivity f10790b;

    public /* synthetic */ w3(UpdateScreenActivity updateScreenActivity, int i10) {
        this.f10789a = i10;
        this.f10790b = updateScreenActivity;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10789a;
        pi.o oVar = pi.o.f13011a;
        int i11 = 1;
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i12 = UpdateScreenActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, p1.j.d(-660463433, new w3(this.f10790b, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                int i13 = UpdateScreenActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    UpdateScreenActivity updateScreenActivity = this.f10790b;
                    boolean zH = i0Var.h(updateScreenActivity);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        a2.i iVar = new a2.i(0, updateScreenActivity, UpdateScreenActivity.class, "finish", "finish()V", 0, 0, 3);
                        i0Var.l0(iVar);
                        objQ = iVar;
                    }
                    c.e((ej.a) ((fj.j) objQ), i0Var, 0);
                    break;
                }
                break;
        }
        return oVar;
    }
}
