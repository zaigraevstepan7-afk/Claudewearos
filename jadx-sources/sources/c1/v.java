package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2760d;

    public v(long j, long j4, long j10, long j11) {
        this.f2757a = j;
        this.f2758b = j4;
        this.f2759c = j10;
        this.f2760d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return c2.w.d(this.f2757a, vVar.f2757a) && c2.w.d(this.f2758b, vVar.f2758b) && c2.w.d(this.f2759c, vVar.f2759c) && c2.w.d(this.f2760d, vVar.f2760d);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2760d) + gk.b.j(gk.b.j(Long.hashCode(this.f2757a) * 31, this.f2758b, 31), this.f2759c, 31);
    }
}
