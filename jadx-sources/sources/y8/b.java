package y8;

import com.anonlab.voidlauncher.SetupActivity;
import f1.i0;
import f1.m;
import p1.j;
import pi.o;
import q0.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetupActivity f20239b;

    public /* synthetic */ b(SetupActivity setupActivity, int i10) {
        this.f20238a = i10;
        this.f20239b = setupActivity;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f20238a;
        o oVar = o.f13011a;
        SetupActivity setupActivity = this.f20239b;
        int i11 = 1;
        i0 i0Var = (i0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i12 = SetupActivity.R;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, j.d(-723545019, new b(setupActivity, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                int i13 = SetupActivity.R;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    boolean zH = i0Var.h(setupActivity);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == m.f6385a) {
                        objQ = new k(setupActivity, 21);
                        i0Var.l0(objQ);
                    }
                    a.c((ej.a) objQ, i0Var, 0);
                    break;
                }
                break;
        }
        return oVar;
    }
}
