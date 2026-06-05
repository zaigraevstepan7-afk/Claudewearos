package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f14756b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f14757c = hj.a.D(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f14758a;

    public /* synthetic */ o(long j) {
        this.f14758a = j;
    }

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static final long b(long j) {
        return f14756b[(int) ((j & 1095216660480L) >>> 32)].f14759a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (p.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!p.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f14758a == ((o) obj).f14758a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14758a);
    }

    public final String toString() {
        return d(this.f14758a);
    }
}
