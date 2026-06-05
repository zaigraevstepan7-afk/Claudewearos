package d1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ab.d f4497b;

    public e0(ab.d dVar) {
        this.f4497b = dVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        d0 d0Var = new d0();
        d0Var.H = this.f4497b;
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f4497b == ((e0) obj).f4497b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        d0 d0Var = (d0) nVar;
        d0Var.H = this.f4497b;
        v2.n.o(d0Var);
    }

    public final int hashCode() {
        return this.f4497b.hashCode();
    }
}
