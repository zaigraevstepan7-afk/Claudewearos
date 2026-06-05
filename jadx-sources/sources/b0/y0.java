package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1461b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1462c;

    public y0(float f10, boolean z2) {
        this.f1461b = f10;
        this.f1462c = z2;
    }

    @Override // v2.x0
    public final v1.n d() {
        z0 z0Var = new z0();
        z0Var.H = this.f1461b;
        z0Var.I = this.f1462c;
        return z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        y0 y0Var = obj instanceof y0 ? (y0) obj : null;
        return y0Var != null && this.f1461b == y0Var.f1461b && this.f1462c == y0Var.f1462c;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        z0 z0Var = (z0) nVar;
        z0Var.H = this.f1461b;
        z0Var.I = this.f1462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1462c) + (Float.hashCode(this.f1461b) * 31);
    }
}
