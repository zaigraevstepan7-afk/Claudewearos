package wa;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f19133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19134b;

    public p0(List list, boolean z2) {
        fj.l.f(list, "slotPackages");
        this.f19133a = list;
        this.f19134b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return fj.l.b(this.f19133a, p0Var.f19133a) && this.f19134b == p0Var.f19134b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19134b) + (this.f19133a.hashCode() * 31);
    }

    public final String toString() {
        return "GridDragPreview(slotPackages=" + this.f19133a + ", canDrop=" + this.f19134b + ")";
    }
}
