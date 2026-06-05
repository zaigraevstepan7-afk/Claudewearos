package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class e1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f1304b;

    public e1(ej.c cVar) {
        this.f1304b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        f1 f1Var = new f1();
        f1Var.H = this.f1304b;
        f1Var.I = true;
        return f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e1 e1Var = obj instanceof e1 ? (e1) obj : null;
        return e1Var != null && this.f1304b == e1Var.f1304b;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        f1 f1Var = (f1) nVar;
        ej.c cVar = f1Var.H;
        ej.c cVar2 = this.f1304b;
        if (cVar != cVar2 || !f1Var.I) {
            v2.n.y(f1Var).U(false);
        }
        f1Var.H = cVar2;
        f1Var.I = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1304b.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1304b + ", rtlAware=true)";
    }
}
