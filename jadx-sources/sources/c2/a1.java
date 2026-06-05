package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2962b = e0.h(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2963c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2964a;

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a1) {
            return this.f2964a == ((a1) obj).f2964a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2964a);
    }

    public final String toString() {
        return d(this.f2964a);
    }
}
