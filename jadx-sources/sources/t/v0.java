package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f15300a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15301b;

    public v0(z zVar, long j) {
        this.f15300a = zVar;
        this.f15301b = j;
    }

    @Override // t.j
    public final q1 a(p1 p1Var) {
        return new w0(this.f15300a.a(p1Var), this.f15301b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return v0Var.f15301b == this.f15301b && fj.l.b(v0Var.f15300a, this.f15300a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15301b) + (this.f15300a.hashCode() * 31);
    }
}
