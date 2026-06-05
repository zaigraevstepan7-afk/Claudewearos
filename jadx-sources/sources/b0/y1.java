package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class y1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f1463b;

    public y1(k0 k0Var) {
        this.f1463b = k0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        z1 z1Var = new z1();
        z1Var.J = this.f1463b;
        return z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y1) {
            return ((y1) obj).f1463b.equals(this.f1463b);
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        z1 z1Var = (z1) nVar;
        k0 k0Var = z1Var.J;
        k0 k0Var2 = this.f1463b;
        if (k0Var2.equals(k0Var)) {
            return;
        }
        z1Var.J = k0Var2;
        z1Var.r1();
    }

    public final int hashCode() {
        return this.f1463b.hashCode();
    }
}
