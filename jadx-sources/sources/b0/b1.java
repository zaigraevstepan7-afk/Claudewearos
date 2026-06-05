package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class b1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1282b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1283c;

    public b1(float f10, float f11) {
        this.f1282b = f10;
        this.f1283c = f11;
    }

    @Override // v2.x0
    public final v1.n d() {
        d1 d1Var = new d1();
        d1Var.H = this.f1282b;
        d1Var.I = this.f1283c;
        d1Var.J = true;
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return b1Var != null && s3.f.e(this.f1282b, b1Var.f1282b) && s3.f.e(this.f1283c, b1Var.f1283c);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        d1 d1Var = (d1) nVar;
        float f10 = d1Var.H;
        float f11 = this.f1282b;
        boolean zE = s3.f.e(f10, f11);
        float f12 = this.f1283c;
        if (!zE || !s3.f.e(d1Var.I, f12) || !d1Var.J) {
            v2.n.y(d1Var).U(false);
        }
        d1Var.H = f11;
        d1Var.I = f12;
        d1Var.J = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + gk.b.f(this.f1283c, Float.hashCode(this.f1282b) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) s3.f.f(this.f1282b)) + ", y=" + ((Object) s3.f.f(this.f1283c)) + ", rtlAware=true)";
    }
}
