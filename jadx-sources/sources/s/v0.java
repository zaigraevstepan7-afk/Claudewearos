package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14694b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14695c;

    public v0(float f10, float f11, long j) {
        this.f14693a = f10;
        this.f14694b = f11;
        this.f14695c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Float.compare(this.f14693a, v0Var.f14693a) == 0 && Float.compare(this.f14694b, v0Var.f14694b) == 0 && this.f14695c == v0Var.f14695c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14695c) + gk.b.f(this.f14694b, Float.hashCode(this.f14693a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f14693a + ", distance=" + this.f14694b + ", duration=" + this.f14695c + ')';
    }
}
