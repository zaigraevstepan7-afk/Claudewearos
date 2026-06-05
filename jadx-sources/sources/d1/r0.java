package d1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ab.m f4568b;

    public r0(ab.m mVar) {
        this.f4568b = mVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        q0 q0Var = new q0();
        q0Var.H = this.f4568b;
        return q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return this.f4568b == ((r0) obj).f4568b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        q0 q0Var = (q0) nVar;
        q0Var.H = this.f4568b;
        v2.n.o(q0Var);
    }

    public final int hashCode() {
        return this.f4568b.hashCode();
    }
}
