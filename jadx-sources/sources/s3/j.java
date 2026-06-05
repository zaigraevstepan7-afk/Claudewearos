package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f14745a;

    public /* synthetic */ j(long j) {
        this.f14745a = j;
    }

    public static final boolean a(long j, long j4) {
        return j == j4;
    }

    public static final long b(long j, long j4) {
        return ((((int) (j >> 32)) - ((int) (j4 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j, long j4) {
        return ((((int) (j >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return m6.a.g(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f14745a == ((j) obj).f14745a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14745a);
    }

    public final String toString() {
        return d(this.f14745a);
    }
}
