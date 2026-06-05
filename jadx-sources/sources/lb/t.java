package lb;

import com.anonlab.voidlauncher.feature.home.presentation.settings.LiquidGlassSettingsActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LiquidGlassSettingsActivity f10657c;

    public /* synthetic */ t(g gVar, LiquidGlassSettingsActivity liquidGlassSettingsActivity, int i10) {
        this.f10655a = i10;
        this.f10656b = gVar;
        this.f10657c = liquidGlassSettingsActivity;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10655a;
        pi.o oVar = pi.o.f13011a;
        g gVar = this.f10656b;
        int i11 = 1;
        f1.i0 i0Var = (f1.i0) obj;
        switch (i10) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = LiquidGlassSettingsActivity.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, p1.j.d(-897175517, new t(gVar, this.f10657c, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = LiquidGlassSettingsActivity.M;
                if (!i0Var.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    LiquidGlassSettingsActivity liquidGlassSettingsActivity = this.f10657c;
                    boolean zH = i0Var.h(liquidGlassSettingsActivity);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        a2.i iVar = new a2.i(0, liquidGlassSettingsActivity, LiquidGlassSettingsActivity.class, "finish", "finish()V", 0, 0, 1);
                        i0Var.l0(iVar);
                        objQ = iVar;
                    }
                    l0.e(gVar, (ej.a) ((fj.j) objQ), i0Var, 0);
                    break;
                }
                break;
        }
        return oVar;
    }
}
