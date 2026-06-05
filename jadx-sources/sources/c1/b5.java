package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b5 implements v.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1939a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1940b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1941c;

    public b5(float f10, long j, boolean z2) {
        this.f1939a = z2;
        this.f1940b = f10;
        this.f1941c = j;
    }

    @Override // v.a1
    public final v2.j a(z.k kVar) {
        return new p1(kVar, this.f1939a, this.f1940b, new o1(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        if (this.f1939a == b5Var.f1939a && s3.f.e(this.f1940b, b5Var.f1940b)) {
            return c2.w.d(this.f1941c, b5Var.f1941c);
        }
        return false;
    }

    @Override // v.a1
    public final int hashCode() {
        int iF = gk.b.f(this.f1940b, Boolean.hashCode(this.f1939a) * 31, 961);
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f1941c) + iF;
    }
}
