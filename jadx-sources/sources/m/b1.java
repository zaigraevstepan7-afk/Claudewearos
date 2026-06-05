package m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f11061b;

    public /* synthetic */ b1(f1 f1Var, int i10) {
        this.f11060a = i10;
        this.f11061b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11060a) {
            case 0:
                j1 j1Var = this.f11061b.f11086c;
                if (j1Var != null) {
                    j1Var.setListSelectionHidden(true);
                    j1Var.requestLayout();
                    break;
                }
                break;
            default:
                f1 f1Var = this.f11061b;
                j1 j1Var2 = f1Var.f11086c;
                if (j1Var2 != null && j1Var2.isAttachedToWindow() && f1Var.f11086c.getCount() > f1Var.f11086c.getChildCount() && f1Var.f11086c.getChildCount() <= Integer.MAX_VALUE) {
                    f1Var.O.setInputMethodMode(2);
                    f1Var.e();
                    break;
                }
                break;
        }
    }
}
