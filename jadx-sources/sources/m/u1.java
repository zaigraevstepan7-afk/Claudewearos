package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f11196b;

    public /* synthetic */ u1(Toolbar toolbar, int i10) {
        this.f11195a = i10;
        this.f11196b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11195a) {
            case 0:
                w1 w1Var = this.f11196b.f824g0;
                l.i iVar = w1Var == null ? null : w1Var.f11200b;
                if (iVar != null) {
                    iVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f11196b.l();
                break;
        }
    }
}
