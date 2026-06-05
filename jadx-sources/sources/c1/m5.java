package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2433a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2434b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2435c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2436d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2437e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2438f;

    public m5(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f2433a = f10;
        this.f2434b = f11;
        this.f2435c = f12;
        this.f2436d = f13;
        this.f2437e = f14;
        this.f2438f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return s3.f.e(this.f2433a, m5Var.f2433a) && s3.f.e(this.f2434b, m5Var.f2434b) && s3.f.e(this.f2435c, m5Var.f2435c) && s3.f.e(this.f2436d, m5Var.f2436d) && s3.f.e(this.f2438f, m5Var.f2438f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2438f) + gk.b.f(this.f2436d, gk.b.f(this.f2435c, gk.b.f(this.f2434b, Float.hashCode(this.f2433a) * 31, 31), 31), 31);
    }
}
