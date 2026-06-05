package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class j1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final i1 f1366b;

    public j1(i1 i1Var) {
        this.f1366b = i1Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        l1 l1Var = new l1();
        l1Var.H = this.f1366b;
        return l1Var;
    }

    public final boolean equals(Object obj) {
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        if (j1Var == null) {
            return false;
        }
        return fj.l.b(this.f1366b, j1Var.f1366b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((l1) nVar).H = this.f1366b;
    }

    public final int hashCode() {
        return this.f1366b.hashCode();
    }
}
