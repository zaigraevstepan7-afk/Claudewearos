package z1;

import a2.d0;
import v2.h0;
import v2.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends v1.n implements m1, b, v2.m {
    public final d H;
    public boolean I;
    public ej.c J;

    public c(d dVar, ej.c cVar) {
        this.H = dVar;
        this.J = cVar;
        dVar.f20354a = this;
    }

    @Override // v2.m1
    public final void F0() {
        q1();
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        boolean z2 = this.I;
        d dVar = this.H;
        if (!z2) {
            dVar.f20355b = null;
            v2.n.t(this, new d0(20, this, dVar));
            if (dVar.f20355b == null) {
                throw t.m1.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.I = true;
        }
        yh.c cVar = dVar.f20355b;
        fj.l.c(cVar);
        ((ej.c) cVar.f20314b).invoke(h0Var);
    }

    @Override // z1.b
    public final long a() {
        return cg.b.S(v2.n.v(this, 4).f15552c);
    }

    @Override // v2.m
    public final void d0() {
        q1();
    }

    @Override // z1.b
    public final s3.c e() {
        return v2.n.y(this).R;
    }

    @Override // z1.b
    public final s3.m getLayoutDirection() {
        return v2.n.y(this).S;
    }

    @Override // v2.j
    public final void j0() {
        q1();
    }

    @Override // v1.n
    public final void k1() {
        q1();
    }

    @Override // v2.j
    public final void l() {
        q1();
    }

    public final void q1() {
        this.I = false;
        this.H.f20355b = null;
        v2.n.m(this);
    }

    @Override // v1.n
    public final void j1() {
    }
}
