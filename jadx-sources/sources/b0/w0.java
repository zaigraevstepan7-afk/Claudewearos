package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class w0 extends v2.x0 {
    @Override // v2.x0
    public final v1.n d() {
        v0 v0Var = v0.f1447b;
        x0 x0Var = new x0();
        x0Var.H = v0Var;
        x0Var.I = true;
        return x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w0 ? (w0) obj : null) == null) {
            return false;
        }
        v0 v0Var = v0.f1446a;
        return true;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        x0 x0Var = (x0) nVar;
        x0Var.H = v0.f1447b;
        x0Var.I = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (v0.f1447b.hashCode() * 31);
    }
}
