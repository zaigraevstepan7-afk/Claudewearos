package t0;

import f1.j1;
import f1.s;
import k0.t0;
import v0.u0;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends v1.n implements v2.i, v2.o, v2.j {
    public a H;
    public t0 I;
    public u0 J;
    public final j1 K = s.A(null);

    public l(a aVar, t0 t0Var, u0 u0Var) {
        this.H = aVar;
        this.I = t0Var;
        this.J = u0Var;
    }

    @Override // v2.o
    public final void N0(i1 i1Var) {
        this.K.setValue(i1Var);
    }

    @Override // v1.n
    public final void i1() {
        a aVar = this.H;
        if (aVar.f15338a != null) {
            a0.a.c("Expected textInputModifierNode to be null");
        }
        aVar.f15338a = this;
    }

    @Override // v1.n
    public final void j1() {
        this.H.k(this);
    }
}
