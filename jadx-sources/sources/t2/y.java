package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class y extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f15672b;

    public y(Object obj) {
        this.f15672b = obj;
    }

    @Override // v2.x0
    public final v1.n d() {
        a0 a0Var = new a0();
        a0Var.H = this.f15672b;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && fj.l.b(this.f15672b, ((y) obj).f15672b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((a0) nVar).H = this.f15672b;
    }

    public final int hashCode() {
        return this.f15672b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f15672b + ')';
    }
}
