package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class q1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final g3.n0 f9239b;

    public q1(g3.n0 n0Var) {
        this.f9239b = n0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new r1(this.f9239b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return fj.l.b(this.f9239b, ((q1) obj).f9239b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        r1 r1Var = (r1) nVar;
        r1Var.getClass();
        g3.n0 n0VarH = g3.e0.h(this.f9239b, v2.n.y(r1Var).S);
        r1Var.q1(n0VarH, (k3.i) v2.n.h(r1Var, w2.f1.f18264k));
        fi.k kVar = r1Var.J;
        if (kVar == null) {
            a0.a.b("Min size state is not set.");
            throw new b3.e();
        }
        fi.k.a(kVar, null, null, n0VarH, 23);
        v2.n.n(r1Var);
    }

    public final int hashCode() {
        return this.f9239b.hashCode();
    }
}
