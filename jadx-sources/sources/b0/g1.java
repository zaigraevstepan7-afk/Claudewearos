package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class g1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1337b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1338c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1339d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1340e;

    public g1(float f10, float f11, float f12, float f13) {
        this.f1337b = f10;
        this.f1338c = f11;
        this.f1339d = f12;
        this.f1340e = f13;
        boolean z2 = true;
        boolean z10 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z2 = false;
        }
        if (!z10 || !z2) {
            c0.a.a("Padding must be non-negative");
        }
    }

    @Override // v2.x0
    public final v1.n d() {
        h1 h1Var = new h1();
        h1Var.H = this.f1337b;
        h1Var.I = this.f1338c;
        h1Var.J = this.f1339d;
        h1Var.K = this.f1340e;
        h1Var.L = true;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        g1 g1Var = obj instanceof g1 ? (g1) obj : null;
        return g1Var != null && s3.f.e(this.f1337b, g1Var.f1337b) && s3.f.e(this.f1338c, g1Var.f1338c) && s3.f.e(this.f1339d, g1Var.f1339d) && s3.f.e(this.f1340e, g1Var.f1340e);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        h1 h1Var = (h1) nVar;
        h1Var.H = this.f1337b;
        h1Var.I = this.f1338c;
        h1Var.J = this.f1339d;
        h1Var.K = this.f1340e;
        h1Var.L = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + gk.b.f(this.f1340e, gk.b.f(this.f1339d, gk.b.f(this.f1338c, Float.hashCode(this.f1337b) * 31, 31), 31), 31);
    }
}
