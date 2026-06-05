package kb;

import b0.t1;
import c1.b7;
import c1.w0;
import c1.x0;
import com.anonlab.voidlauncher.feature.home.presentation.rain.RainPlaygroundActivity;
import ej.e;
import f1.i0;
import f1.m;
import ha.d;
import p1.j;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RainPlaygroundActivity f9507b;

    public /* synthetic */ b(RainPlaygroundActivity rainPlaygroundActivity, int i10) {
        this.f9506a = i10;
        this.f9507b = rainPlaygroundActivity;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9506a;
        o oVar = o.f13011a;
        RainPlaygroundActivity rainPlaygroundActivity = this.f9507b;
        int i11 = 2;
        int i12 = 1;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = RainPlaygroundActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    d.a(false, j.d(2086906354, new b(rainPlaygroundActivity, i12), i0Var), i0Var, 48);
                    break;
                }
            case 1:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = RainPlaygroundActivity.M;
                if (!i0Var2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    b7.a(t1.f1433c, null, ((w0) i0Var2.j(x0.f2845a)).f2804n, 0L, 0.0f, 0.0f, j.d(1073818829, new b(rainPlaygroundActivity, i11), i0Var2), i0Var2, 12582918, 122);
                    break;
                }
            default:
                i0 i0Var3 = (i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i15 = RainPlaygroundActivity.M;
                if (!i0Var3.T(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    i0Var3.W();
                    break;
                } else {
                    boolean zH = i0Var3.h(rainPlaygroundActivity);
                    Object objQ = i0Var3.Q();
                    if (zH || objQ == m.f6385a) {
                        objQ = new a7.e(rainPlaygroundActivity, 19);
                        i0Var3.l0(objQ);
                    }
                    cb.a.b((ej.a) objQ, i0Var3, 0);
                    break;
                }
                break;
        }
        return oVar;
    }
}
