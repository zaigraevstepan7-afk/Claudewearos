package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class g1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f6145b;

    public g1(o0 o0Var) {
        this.f6145b = o0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        h1 h1Var = new h1();
        h1Var.H = this.f6145b;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && fj.l.b(this.f6145b, ((g1) obj).f6145b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((h1) nVar).H = this.f6145b;
    }

    public final int hashCode() {
        return this.f6145b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f6145b + ')';
    }
}
