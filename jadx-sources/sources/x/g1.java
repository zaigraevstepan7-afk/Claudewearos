package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f19531a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19532b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19533c;

    public g1(long j, long j4, boolean z2) {
        this.f19531a = j;
        this.f19532b = j4;
        this.f19533c = z2;
    }

    public final g1 a(g1 g1Var) {
        return new g1(b2.b.f(this.f19531a, g1Var.f19531a), Math.max(this.f19532b, g1Var.f19532b), this.f19533c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return b2.b.c(this.f19531a, g1Var.f19531a) && this.f19532b == g1Var.f19532b && this.f19533c == g1Var.f19533c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19533c) + gk.b.j(Long.hashCode(this.f19531a) * 31, this.f19532b, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) b2.b.h(this.f19531a)) + ", timeMillis=" + this.f19532b + ", shouldApplyImmediately=" + this.f19533c + ')';
    }
}
