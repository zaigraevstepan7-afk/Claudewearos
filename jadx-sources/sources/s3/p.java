package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f14759a;

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static String b(long j) {
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f14759a == ((p) obj).f14759a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14759a);
    }

    public final String toString() {
        return b(this.f14759a);
    }
}
