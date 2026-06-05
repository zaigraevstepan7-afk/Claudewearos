package f0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class s0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.a f6187b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f6188c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f6189d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6190e;

    public s0(ej.a aVar, r0 r0Var, o1 o1Var, boolean z2) {
        this.f6187b = aVar;
        this.f6188c = r0Var;
        this.f6189d = o1Var;
        this.f6190e = z2;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new w0(this.f6187b, this.f6188c, this.f6189d, this.f6190e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f6187b == s0Var.f6187b && fj.l.b(this.f6188c, s0Var.f6188c) && this.f6189d == s0Var.f6189d && this.f6190e == s0Var.f6190e;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        w0 w0Var = (w0) nVar;
        w0Var.H = this.f6187b;
        w0Var.I = this.f6188c;
        o1 o1Var = w0Var.J;
        o1 o1Var2 = this.f6189d;
        if (o1Var != o1Var2) {
            w0Var.J = o1Var2;
            v2.n.o(w0Var);
        }
        boolean z2 = w0Var.K;
        boolean z10 = this.f6190e;
        if (z2 == z10) {
            return;
        }
        w0Var.K = z10;
        w0Var.q1();
        v2.n.o(w0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + gk.b.i((this.f6189d.hashCode() + ((this.f6188c.hashCode() + (this.f6187b.hashCode() * 31)) * 31)) * 31, 31, this.f6190e);
    }
}
