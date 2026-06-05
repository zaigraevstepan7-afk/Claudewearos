package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2818b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2819c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2820d;

    public w1(long j, long j4, long j10, long j11) {
        this.f2817a = j;
        this.f2818b = j4;
        this.f2819c = j10;
        this.f2820d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return c2.w.d(this.f2817a, w1Var.f2817a) && c2.w.d(this.f2818b, w1Var.f2818b) && c2.w.d(this.f2819c, w1Var.f2819c) && c2.w.d(this.f2820d, w1Var.f2820d);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2820d) + gk.b.j(gk.b.j(Long.hashCode(this.f2817a) * 31, this.f2818b, 31), this.f2819c, 31);
    }
}
