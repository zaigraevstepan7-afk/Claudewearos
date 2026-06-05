package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class x0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f15669b;

    public x0(ej.c cVar) {
        this.f15669b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        y0 y0Var = new y0();
        y0Var.H = this.f15669b;
        return y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return this.f15669b == ((x0) obj).f15669b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((y0) nVar).H = this.f15669b;
    }

    public final int hashCode() {
        return this.f15669b.hashCode();
    }
}
