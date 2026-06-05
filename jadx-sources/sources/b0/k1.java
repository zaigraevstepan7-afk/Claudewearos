package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1370a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1371b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1372c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1373d;

    public k1(float f10, float f11, float f12, float f13) {
        this.f1370a = f10;
        this.f1371b = f11;
        this.f1372c = f12;
        this.f1373d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            c0.a.a("Padding must be non-negative");
        }
    }

    @Override // b0.i1
    public final float a() {
        return this.f1373d;
    }

    @Override // b0.i1
    public final float b(s3.m mVar) {
        return mVar == s3.m.f14752a ? this.f1370a : this.f1372c;
    }

    @Override // b0.i1
    public final float c(s3.m mVar) {
        return mVar == s3.m.f14752a ? this.f1372c : this.f1370a;
    }

    @Override // b0.i1
    public final float d() {
        return this.f1371b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return s3.f.e(this.f1370a, k1Var.f1370a) && s3.f.e(this.f1371b, k1Var.f1371b) && s3.f.e(this.f1372c, k1Var.f1372c) && s3.f.e(this.f1373d, k1Var.f1373d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1373d) + gk.b.f(this.f1372c, gk.b.f(this.f1371b, Float.hashCode(this.f1370a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) s3.f.f(this.f1370a)) + ", top=" + ((Object) s3.f.f(this.f1371b)) + ", end=" + ((Object) s3.f.f(this.f1372c)) + ", bottom=" + ((Object) s3.f.f(this.f1373d)) + ')';
    }
}
