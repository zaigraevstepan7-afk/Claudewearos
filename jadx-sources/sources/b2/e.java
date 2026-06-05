package b2;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1514a;

    public /* synthetic */ e(long j) {
        this.f1514a = j;
    }

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float d(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean f(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final long g(long j, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f10;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static String h(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + v.j0(Float.intBitsToFloat((int) (j >> 32))) + ", " + v.j0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1514a == ((e) obj).f1514a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1514a);
    }

    public final String toString() {
        return h(this.f1514a);
    }
}
