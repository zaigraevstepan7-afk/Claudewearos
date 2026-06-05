package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class d0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f1302b;

    public d0(ej.c cVar) {
        this.f1302b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        e0 e0Var = new e0();
        e0Var.J = this.f1302b;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && ((d0) obj).f1302b == this.f1302b;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        e0 e0Var = (e0) nVar;
        ej.c cVar = e0Var.J;
        ej.c cVar2 = this.f1302b;
        if (cVar2 != cVar) {
            e0Var.J = cVar2;
        }
    }

    public final int hashCode() {
        return this.f1302b.hashCode();
    }
}
