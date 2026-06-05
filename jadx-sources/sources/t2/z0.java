package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class z0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f15685b;

    public z0(ej.c cVar) {
        this.f15685b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        a1 a1Var = new a1();
        a1Var.H = this.f15685b;
        long j = Integer.MIN_VALUE;
        a1Var.I = (j & 4294967295L) | (j << 32);
        return a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return this.f15685b == ((z0) obj).f15685b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        a1 a1Var = (a1) nVar;
        a1Var.H = this.f15685b;
        long j = Integer.MIN_VALUE;
        a1Var.I = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.f15685b.hashCode();
    }
}
