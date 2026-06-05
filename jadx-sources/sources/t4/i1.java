package t4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 extends h1 {

    /* renamed from: s, reason: collision with root package name */
    public static final m1 f15732s = m1.d(null, WindowInsets.CONSUMED);

    public i1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
    }

    @Override // t4.g1, t4.c1, t4.j1
    public l4.b g(int i10) {
        return l4.b.d(this.f15705c.getInsets(l1.a(i10)));
    }

    @Override // t4.g1, t4.c1, t4.j1
    public l4.b h(int i10) {
        return l4.b.d(this.f15705c.getInsetsIgnoringVisibility(l1.a(i10)));
    }

    @Override // t4.g1, t4.c1, t4.j1
    public boolean q(int i10) {
        return this.f15705c.isVisible(l1.a(i10));
    }

    public i1(m1 m1Var, i1 i1Var) {
        super(m1Var, i1Var);
    }
}
