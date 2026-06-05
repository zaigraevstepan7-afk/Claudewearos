package t4;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g1 extends f1 {

    /* renamed from: r, reason: collision with root package name */
    public static final m1 f15730r = m1.d(null, WindowInsets.CONSUMED);

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // t4.c1, t4.j1
    public l4.b g(int i10) {
        return l4.b.d(this.f15705c.getInsets(k1.a(i10)));
    }

    @Override // t4.c1, t4.j1
    public l4.b h(int i10) {
        return l4.b.d(this.f15705c.getInsetsIgnoringVisibility(k1.a(i10)));
    }

    @Override // t4.c1, t4.j1
    public boolean q(int i10) {
        return this.f15705c.isVisible(k1.a(i10));
    }

    public g1(m1 m1Var, g1 g1Var) {
        super(m1Var, g1Var);
    }

    @Override // t4.c1, t4.j1
    public final void d(View view) {
    }
}
