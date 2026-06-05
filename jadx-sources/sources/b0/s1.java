package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class s1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f1417b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1418c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1419d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1420e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1421f;

    public s1(float f10, float f11, float f12, float f13, boolean z2) {
        this.f1417b = f10;
        this.f1418c = f11;
        this.f1419d = f12;
        this.f1420e = f13;
        this.f1421f = z2;
    }

    @Override // v2.x0
    public final v1.n d() {
        u1 u1Var = new u1();
        u1Var.H = this.f1417b;
        u1Var.I = this.f1418c;
        u1Var.J = this.f1419d;
        u1Var.K = this.f1420e;
        u1Var.L = this.f1421f;
        return u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return s3.f.e(this.f1417b, s1Var.f1417b) && s3.f.e(this.f1418c, s1Var.f1418c) && s3.f.e(this.f1419d, s1Var.f1419d) && s3.f.e(this.f1420e, s1Var.f1420e) && this.f1421f == s1Var.f1421f;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        u1 u1Var = (u1) nVar;
        u1Var.H = this.f1417b;
        u1Var.I = this.f1418c;
        u1Var.J = this.f1419d;
        u1Var.K = this.f1420e;
        u1Var.L = this.f1421f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1421f) + gk.b.f(this.f1420e, gk.b.f(this.f1419d, gk.b.f(this.f1418c, Float.hashCode(this.f1417b) * 31, 31), 31), 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s1(float f10, float f11, float f12, float f13, boolean z2, int i10) {
        boolean z10;
        float f14;
        f10 = (i10 & 1) != 0 ? Float.NaN : f10;
        f11 = (i10 & 2) != 0 ? Float.NaN : f11;
        f12 = (i10 & 4) != 0 ? Float.NaN : f12;
        if ((i10 & 8) != 0) {
            z10 = z2;
            f14 = Float.NaN;
        } else {
            z10 = z2;
            f14 = f13;
        }
        this(f10, f11, f12, f14, z10);
    }
}
