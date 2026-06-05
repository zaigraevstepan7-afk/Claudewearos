package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0.j0 f17380a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17381b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f17382c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17383d;

    public e0(k0.j0 j0Var, long j, d0 d0Var, boolean z2) {
        this.f17380a = j0Var;
        this.f17381b = j;
        this.f17382c = d0Var;
        this.f17383d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f17380a == e0Var.f17380a && b2.b.c(this.f17381b, e0Var.f17381b) && this.f17382c == e0Var.f17382c && this.f17383d == e0Var.f17383d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17383d) + ((this.f17382c.hashCode() + gk.b.j(this.f17380a.hashCode() * 31, this.f17381b, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f17380a + ", position=" + ((Object) b2.b.h(this.f17381b)) + ", anchor=" + this.f17382c + ", visible=" + this.f17383d + ')';
    }
}
