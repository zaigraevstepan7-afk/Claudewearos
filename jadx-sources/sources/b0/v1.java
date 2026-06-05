package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class v1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f1449b;

    public v1(ej.c cVar) {
        this.f1449b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        w1 w1Var = new w1(d.f1293c);
        w1Var.K = this.f1449b;
        return w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            return this.f1449b == ((v1) obj).f1449b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        w1 w1Var = (w1) nVar;
        ej.c cVar = w1Var.K;
        ej.c cVar2 = this.f1449b;
        if (cVar != cVar2) {
            w1Var.K = cVar2;
            f2 f2Var = w1Var.L;
            if (f2Var != null) {
                d2 d2Var = (d2) cVar2.invoke(f2Var);
                if (fj.l.b(d2Var, w1Var.J)) {
                    return;
                }
                w1Var.J = d2Var;
                w1Var.r1();
            }
        }
    }

    public final int hashCode() {
        return this.f1449b.hashCode();
    }
}
