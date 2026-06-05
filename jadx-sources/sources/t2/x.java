package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class x extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.f f15668b;

    public x(ej.f fVar) {
        this.f15668b = fVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        c0 c0Var = new c0();
        c0Var.H = this.f15668b;
        return c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f15668b == ((x) obj).f15668b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((c0) nVar).H = this.f15668b;
    }

    public final int hashCode() {
        return this.f15668b.hashCode();
    }
}
