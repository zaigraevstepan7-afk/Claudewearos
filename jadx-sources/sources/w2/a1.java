package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 extends a {
    public final f1.j1 C;
    public boolean D;

    public a1(c.m mVar) {
        super(mVar);
        this.C = f1.s.A(null);
    }

    @Override // w2.a
    public final void a(int i10, f1.i0 i0Var) {
        i0Var.c0(420213850);
        int i11 = (i0Var.h(this) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            ej.e eVar = (ej.e) this.C.getValue();
            if (eVar == null) {
                i0Var.b0(-1238823553);
            } else {
                i0Var.b0(98585282);
                eVar.invoke(i0Var, 0);
            }
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new s.f(this, i10, 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return a1.class.getName();
    }

    @Override // w2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.D;
    }

    public final void setContent(ej.e eVar) {
        this.D = true;
        this.C.setValue(eVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
