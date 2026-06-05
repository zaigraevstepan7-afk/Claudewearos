package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class q0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f17263b;

    public q0(z.k kVar) {
        this.f17263b = kVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        u0 u0Var = new u0();
        u0Var.H = this.f17263b;
        return u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && fj.l.b(((q0) obj).f17263b, this.f17263b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        u0 u0Var = (u0) nVar;
        z.k kVar = u0Var.H;
        z.k kVar2 = this.f17263b;
        if (fj.l.b(kVar, kVar2)) {
            return;
        }
        u0Var.s1();
        u0Var.H = kVar2;
    }

    public final int hashCode() {
        return this.f17263b.hashCode() * 31;
    }
}
