package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class y0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f17333b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f17334c;

    public y0(z.k kVar, a1 a1Var) {
        this.f17333b = kVar;
        this.f17334c = a1Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        v2.j jVarA = this.f17334c.a(this.f17333b);
        z0 z0Var = new z0();
        z0Var.J = jVarA;
        z0Var.q1(jVarA);
        return z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return fj.l.b(this.f17333b, y0Var.f17333b) && fj.l.b(this.f17334c, y0Var.f17334c);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        z0 z0Var = (z0) nVar;
        v2.j jVarA = this.f17334c.a(this.f17333b);
        z0Var.r1(z0Var.J);
        z0Var.J = jVarA;
        z0Var.q1(jVarA);
    }

    public final int hashCode() {
        return this.f17334c.hashCode() + (this.f17333b.hashCode() * 31);
    }
}
