package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2349a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2350b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2351c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2352d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2353e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2354f;

    public k8(long j, long j4, long j10, long j11, long j12, long j13) {
        this.f2349a = j;
        this.f2350b = j4;
        this.f2351c = j10;
        this.f2352d = j11;
        this.f2353e = j12;
        this.f2354f = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return c2.w.d(this.f2349a, k8Var.f2349a) && c2.w.d(this.f2350b, k8Var.f2350b) && c2.w.d(this.f2351c, k8Var.f2351c) && c2.w.d(this.f2352d, k8Var.f2352d) && c2.w.d(this.f2353e, k8Var.f2353e) && c2.w.d(this.f2354f, k8Var.f2354f);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2354f) + gk.b.j(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f2349a) * 31, this.f2350b, 31), this.f2351c, 31), this.f2352d, 31), this.f2353e, 31);
    }
}
