package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f7143b = e0.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7144c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f7145a;

    public /* synthetic */ m0(long j) {
        this.f7145a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof m0) && j == ((m0) obj).f7145a;
    }

    public static final boolean b(long j, long j4) {
        return j == j4;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String h(long j) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return m6.a.g(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f7145a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7145a);
    }

    public final String toString() {
        return h(this.f7145a);
    }
}
