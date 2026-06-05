package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final v1.e f1376b;

    public l0(v1.e eVar) {
        this.f1376b = eVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        m0 m0Var = new m0();
        m0Var.H = this.f1376b;
        return m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l0 l0Var = obj instanceof l0 ? (l0) obj : null;
        if (l0Var == null) {
            return false;
        }
        return this.f1376b.equals(l0Var.f1376b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((m0) nVar).H = this.f1376b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1376b.f17555a);
    }
}
