package ra;

import com.anonlab.voidlauncher.feature.home.presentation.WhatsNewScreen;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb.g f14136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WhatsNewScreen f14137c;

    public /* synthetic */ q1(lb.g gVar, WhatsNewScreen whatsNewScreen, int i10) {
        this.f14135a = i10;
        this.f14136b = gVar;
        this.f14137c = whatsNewScreen;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f14135a;
        pi.o oVar = pi.o.f13011a;
        WhatsNewScreen whatsNewScreen = this.f14137c;
        lb.g gVar = this.f14136b;
        int i11 = 1;
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i12 = WhatsNewScreen.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    ha.d.a(false, p1.j.d(-1707955654, new q1(gVar, whatsNewScreen, i11), i0Var), i0Var, 48);
                    break;
                }
            default:
                int i13 = WhatsNewScreen.M;
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    boolean zH = i0Var.h(whatsNewScreen);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        objQ = new q0.k(whatsNewScreen, 5);
                        i0Var.l0(objQ);
                    }
                    a2.c(gVar, (ej.a) objQ, i0Var, 8);
                    break;
                }
                break;
        }
        return oVar;
    }
}
