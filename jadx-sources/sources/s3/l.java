package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f14751a;

    public /* synthetic */ l(long j) {
        this.f14751a = j;
    }

    public static final /* synthetic */ l a() {
        return new l(0L);
    }

    public static final boolean b(long j, long j4) {
        return j == j4;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f14751a == ((l) obj).f14751a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14751a);
    }

    public final String toString() {
        return c(this.f14751a);
    }
}
