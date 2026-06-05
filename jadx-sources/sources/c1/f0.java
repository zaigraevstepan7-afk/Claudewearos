package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2081a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2082b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2083c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2084d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2085e;

    public f0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f2081a = f10;
        this.f2082b = f11;
        this.f2083c = f12;
        this.f2084d = f13;
        this.f2085e = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return s3.f.e(this.f2081a, f0Var.f2081a) && s3.f.e(this.f2082b, f0Var.f2082b) && s3.f.e(this.f2083c, f0Var.f2083c) && s3.f.e(this.f2084d, f0Var.f2084d) && s3.f.e(this.f2085e, f0Var.f2085e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2085e) + gk.b.f(this.f2084d, gk.b.f(this.f2083c, gk.b.f(this.f2082b, Float.hashCode(this.f2081a) * 31, 31), 31), 31);
    }
}
