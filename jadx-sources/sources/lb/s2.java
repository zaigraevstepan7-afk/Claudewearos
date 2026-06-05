package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10648b;

    public /* synthetic */ s2(g gVar, int i10) {
        this.f10647a = i10;
        this.f10648b = gVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10647a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q3.l("HOME SCREEN", i0Var, 6);
                    q3.j(0L, p1.j.d(143562474, new s2(this.f10648b, 1), i0Var), i0Var, 48);
                    b0.d.e(i0Var, b0.t1.e(24, v1.l.f17564b));
                } else {
                    i0Var.W();
                }
                break;
            default:
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q3.i("Wallpaper", "Change your home screen wallpaper", 0L, 0L, null, i0Var2, 54, 28);
                    q3.k(0, i0Var2);
                    q3.i("Layout", "Grid size and icon spacing", 0L, 0L, null, i0Var2, 54, 28);
                    q3.k(0, i0Var2);
                    String string = this.f10648b.f10289a.getString("transition_effect", "SLIDE");
                    q3.i("Transition Effect", string == null ? "SLIDE" : string, 0L, 0L, null, i0Var2, 6, 28);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
