package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class q0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final d2 f1400b;

    public q0(d2 d2Var) {
        this.f1400b = d2Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new s0(this.f1400b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return fj.l.b(((q0) obj).f1400b, this.f1400b);
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        s0 s0Var = (s0) nVar;
        d2 d2Var = s0Var.J;
        d2 d2Var2 = this.f1400b;
        if (fj.l.b(d2Var2, d2Var)) {
            return;
        }
        s0Var.J = d2Var2;
        s0Var.r1();
    }

    public final int hashCode() {
        return this.f1400b.hashCode();
    }
}
