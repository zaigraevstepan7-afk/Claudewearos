package c1;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x2 extends w2.a {
    public final f1.j1 C;
    public boolean D;

    public x2(Context context) {
        super(context);
        this.C = f1.s.A(d1.f2005a);
    }

    @Override // w2.a
    public final void a(int i10, f1.i0 i0Var) {
        i0Var.c0(576708319);
        int i11 = (i0Var.h(this) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            ((ej.e) this.C.getValue()).invoke(i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0.g2(i10, 3, this);
        }
    }

    @Override // w2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.D;
    }
}
