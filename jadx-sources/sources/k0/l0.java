package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class l0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final g3.n0 f9162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9164d;

    public l0(g3.n0 n0Var, int i10, int i11) {
        this.f9162b = n0Var;
        this.f9163c = i10;
        this.f9164d = i11;
    }

    @Override // v2.x0
    public final v1.n d() {
        n0 n0Var = new n0();
        n0Var.H = this.f9162b;
        n0Var.I = this.f9163c;
        n0Var.J = this.f9164d;
        n0Var.L = -1;
        n0Var.M = -1;
        return n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return fj.l.b(this.f9162b, l0Var.f9162b) && this.f9163c == l0Var.f9163c && this.f9164d == l0Var.f9164d;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        n0 n0Var = (n0) nVar;
        g3.n0 n0Var2 = n0Var.H;
        g3.n0 n0Var3 = this.f9162b;
        boolean zB = fj.l.b(n0Var2, n0Var3);
        int i10 = this.f9163c;
        int i11 = this.f9164d;
        if (zB && n0Var.I == i10 && n0Var.J == i11) {
            return;
        }
        n0Var.H = n0Var3;
        n0Var.I = i10;
        n0Var.J = i11;
        n0Var.N = g3.e0.h(n0Var3, v2.n.y(n0Var).S);
        n0Var.K = true;
        v2.n.n(n0Var);
    }

    public final int hashCode() {
        return (((this.f9162b.hashCode() * 31) + this.f9163c) * 31) + this.f9164d;
    }
}
