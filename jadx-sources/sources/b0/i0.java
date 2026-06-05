package b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f1352b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1353c;

    public i0(g0 g0Var, float f10) {
        this.f1352b = g0Var;
        this.f1353c = f10;
    }

    @Override // v2.x0
    public final v1.n d() {
        j0 j0Var = new j0();
        j0Var.H = this.f1352b;
        j0Var.I = this.f1353c;
        return j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f1352b == i0Var.f1352b && this.f1353c == i0Var.f1353c;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        j0 j0Var = (j0) nVar;
        j0Var.H = this.f1352b;
        j0Var.I = this.f1353c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1353c) + (this.f1352b.hashCode() * 31);
    }
}
