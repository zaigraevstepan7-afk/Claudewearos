package lb;

import com.anonlab.voidlauncher.feature.home.presentation.settings.MoreSettingsActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MoreSettingsActivity f10660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3 f10661d;

    public /* synthetic */ t0(g gVar, MoreSettingsActivity moreSettingsActivity, r3 r3Var, int i10) {
        this.f10658a = i10;
        this.f10659b = gVar;
        this.f10660c = moreSettingsActivity;
        this.f10661d = r3Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10658a;
        pi.o oVar = pi.o.f13011a;
        r3 r3Var = this.f10661d;
        g gVar = this.f10659b;
        int i11 = 1;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = MoreSettingsActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, p1.j.d(-300423503, new t0(gVar, this.f10660c, r3Var, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = MoreSettingsActivity.M;
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    MoreSettingsActivity moreSettingsActivity = this.f10660c;
                    boolean zH = i0Var2.h(moreSettingsActivity);
                    Object objQ = i0Var2.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        a2.i iVar = new a2.i(0, moreSettingsActivity, MoreSettingsActivity.class, "finish", "finish()V", 0, 0, 2);
                        i0Var2.l0(iVar);
                        objQ = iVar;
                    }
                    q3.p(gVar, (ej.a) ((fj.j) objQ), r3Var, i0Var2, 8);
                    break;
                }
                break;
        }
        return oVar;
    }
}
