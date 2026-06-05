package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2040a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2041b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2042c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2043d;

    public e0(long j, long j4, long j10, long j11) {
        this.f2040a = j;
        this.f2041b = j4;
        this.f2042c = j10;
        this.f2043d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return c2.w.d(this.f2040a, e0Var.f2040a) && c2.w.d(this.f2041b, e0Var.f2041b) && c2.w.d(this.f2042c, e0Var.f2042c) && c2.w.d(this.f2043d, e0Var.f2043d);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2043d) + gk.b.j(gk.b.j(Long.hashCode(this.f2040a) * 31, this.f2041b, 31), this.f2042c, 31);
    }
}
