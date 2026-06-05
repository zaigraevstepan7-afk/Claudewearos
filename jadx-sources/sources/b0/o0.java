package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o0 extends v1.n implements v2.e2 {
    public d2 H;
    public d2 I;

    public o0() {
        k0 k0Var = d.f1293c;
        this.H = k0Var;
        this.I = k0Var;
    }

    @Override // v2.e2
    public final Object D() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // v1.n
    public void i1() {
        v2.n.B(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n0(this, 1));
        r1();
    }

    @Override // v1.n
    public void j1() {
        this.I = this.H;
        v2.n.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n0(this, 0));
    }

    @Override // v1.n
    public final void k1() {
        this.H = d.f1293c;
    }

    public abstract d2 q1(d2 d2Var);

    public void r1() {
        this.I = q1(this.H);
        v2.n.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new n0(this, 0));
    }
}
