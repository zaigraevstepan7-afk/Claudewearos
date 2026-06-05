package v3;

import a2.d0;
import a2.e0;
import f0.k0;
import v2.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends v2.k implements m1, v2.i {
    public final e0 J;
    public k0 K;

    public t() {
        e0 e0Var = new e0(0, new u6.t(2, this, t.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 3), 9);
        q1(e0Var);
        this.J = e0Var;
    }

    @Override // v2.m1
    public final void F0() {
        fj.v vVar = new fj.v();
        v2.n.t(this, new d0(16, vVar, this));
        k0 k0Var = (k0) vVar.f6807a;
        if (this.J.v1().a()) {
            k0 k0Var2 = this.K;
            if (k0Var2 != null) {
                k0Var2.b();
            }
            if (k0Var != null) {
                k0Var.a();
            } else {
                k0Var = null;
            }
            this.K = k0Var;
        }
    }
}
