package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f14744a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f14744a == ((h) obj).f14744a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14744a);
    }

    public final String toString() {
        long j = this.f14744a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.f(b(j))) + " x " + ((Object) f.f(a(j)));
    }
}
