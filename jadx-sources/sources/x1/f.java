package x1;

import fj.l;
import w2.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19796a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19797b;

    /* renamed from: c, reason: collision with root package name */
    public final g f19798c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f19799d;

    public f(int i10, long j, g gVar, s1 s1Var) {
        this.f19796a = i10;
        this.f19797b = j;
        this.f19798c = gVar;
        this.f19799d = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19796a == fVar.f19796a && this.f19797b == fVar.f19797b && this.f19798c == fVar.f19798c && l.b(this.f19799d, fVar.f19799d);
    }

    public final int hashCode() {
        int iHashCode = (this.f19798c.hashCode() + gk.b.j(Integer.hashCode(this.f19796a) * 31, this.f19797b, 31)) * 31;
        s1 s1Var = this.f19799d;
        return iHashCode + (s1Var == null ? 0 : s1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f19796a + ", timestamp=" + this.f19797b + ", type=" + this.f19798c + ", structureCompat=" + this.f19799d + ')';
    }
}
