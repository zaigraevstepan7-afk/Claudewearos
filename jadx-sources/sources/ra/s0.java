package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14180a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14181b;

    public /* synthetic */ s0() {
        this(0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return b2.b.c(this.f14180a, s0Var.f14180a) && b2.e.a(this.f14181b, s0Var.f14181b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14181b) + (Long.hashCode(this.f14180a) * 31);
    }

    public final String toString() {
        return t.m1.k("ImagePosition(offset=", b2.b.h(this.f14180a), ", size=", b2.e.h(this.f14181b), ")");
    }

    public s0(long j, long j4) {
        this.f14180a = j;
        this.f14181b = j4;
    }
}
