package v;

import c1.z2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends v1.n implements v2.m {
    public final z.k H;
    public boolean I;
    public boolean J;
    public boolean K;

    public e0(z.k kVar) {
        this.H = kVar;
    }

    @Override // v2.m
    public final void O0(v2.h0 h0Var) {
        h0Var.f();
        e2.b bVar = h0Var.f17669a;
        if (this.I) {
            e2.d.c1(h0Var, c2.w.c(c2.w.f3052b, 0.3f), 0L, bVar.a(), 0.0f, null, 0, 122);
        } else if (this.J || this.K) {
            e2.d.c1(h0Var, c2.w.c(c2.w.f3052b, 0.1f), 0L, bVar.a(), 0.0f, null, 0, 122);
        }
    }

    @Override // v1.n
    public final void i1() {
        qj.b0.w(e1(), null, new z2(this, null, 13), 3);
    }
}
