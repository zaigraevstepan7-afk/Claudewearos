package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f14743a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.f(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.f(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f14743a == ((g) obj).f14743a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14743a);
    }

    public final String toString() {
        return a(this.f14743a);
    }
}
