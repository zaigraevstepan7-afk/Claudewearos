package cg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3353a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3355c;

    public a(long j, long j4, long j10) {
        this.f3353a = j;
        this.f3354b = j4;
        this.f3355c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3353a == aVar.f3353a && this.f3354b == aVar.f3354b && this.f3355c == aVar.f3355c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3353a;
        long j4 = this.f3354b;
        int i10 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f3355c;
        return i10 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f3353a + ", elapsedRealtime=" + this.f3354b + ", uptimeMillis=" + this.f3355c + "}";
    }
}
