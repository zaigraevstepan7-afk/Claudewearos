package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class h2 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f1349b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.e f1350c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1351d;

    public h2(g0 g0Var, ej.e eVar, Object obj) {
        this.f1349b = g0Var;
        this.f1350c = eVar;
        this.f1351d = obj;
    }

    @Override // v2.x0
    public final v1.n d() {
        j2 j2Var = new j2();
        j2Var.H = this.f1349b;
        j2Var.I = this.f1350c;
        return j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f1349b == h2Var.f1349b && fj.l.b(this.f1351d, h2Var.f1351d);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        j2 j2Var = (j2) nVar;
        j2Var.H = this.f1349b;
        j2Var.I = this.f1350c;
    }

    public final int hashCode() {
        return this.f1351d.hashCode() + gk.b.i(this.f1349b.hashCode() * 31, 31, false);
    }
}
