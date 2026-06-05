package s;

import t.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14702a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f14703b;

    public y0(long j, o1 o1Var) {
        this.f14702a = j;
        this.f14703b = o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Float.compare(0.92f, 0.92f) == 0 && c2.a1.a(this.f14702a, y0Var.f14702a) && this.f14703b.equals(y0Var.f14703b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(0.92f) * 31;
        int i10 = c2.a1.f2963c;
        return this.f14703b.hashCode() + gk.b.j(iHashCode, this.f14702a, 31);
    }

    public final String toString() {
        return "Scale(scale=0.92, transformOrigin=" + ((Object) c2.a1.d(this.f14702a)) + ", animationSpec=" + this.f14703b + ')';
    }
}
