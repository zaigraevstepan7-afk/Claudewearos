package rc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f14348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14349b;

    /* renamed from: c, reason: collision with root package name */
    public final double f14350c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14351d;

    public j(int i10, int i11, double d10, boolean z2) {
        this.f14348a = i10;
        this.f14349b = i11;
        this.f14350c = d10;
        this.f14351d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            j jVar = (j) ((r) obj);
            if (this.f14348a == jVar.f14348a && this.f14349b == jVar.f14349b && Double.doubleToLongBits(this.f14350c) == Double.doubleToLongBits(jVar.f14350c) && this.f14351d == jVar.f14351d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d10 = this.f14350c;
        return ((((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32))) ^ ((((this.f14348a ^ 1000003) * 1000003) ^ this.f14349b) * 1000003)) * 1000003) ^ (true != this.f14351d ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f14348a + ", initialBackoffMs=" + this.f14349b + ", backoffMultiplier=" + this.f14350c + ", bufferAfterMaxAttempts=" + this.f14351d + "}";
    }
}
