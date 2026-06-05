package t4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class d1 extends c1 {

    /* renamed from: n, reason: collision with root package name */
    public l4.b f15717n;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f15717n = null;
    }

    @Override // t4.j1
    public m1 b() {
        return m1.d(null, this.f15705c.consumeStableInsets());
    }

    @Override // t4.j1
    public m1 c() {
        return m1.d(null, this.f15705c.consumeSystemWindowInsets());
    }

    @Override // t4.j1
    public final l4.b j() {
        if (this.f15717n == null) {
            WindowInsets windowInsets = this.f15705c;
            this.f15717n = l4.b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f15717n;
    }

    @Override // t4.j1
    public boolean o() {
        return this.f15705c.isConsumed();
    }

    @Override // t4.j1
    public void u(l4.b bVar) {
        this.f15717n = bVar;
    }

    public d1(m1 m1Var, d1 d1Var) {
        super(m1Var, d1Var);
        this.f15717n = null;
        this.f15717n = d1Var.f15717n;
    }
}
