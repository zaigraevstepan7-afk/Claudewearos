package p2;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final a f12753b;

    public q(a aVar) {
        this.f12753b = aVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new r(this.f12753b, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f12753b.equals(((q) obj).f12753b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        r rVar = (r) nVar;
        a aVar = rVar.I;
        a aVar2 = this.f12753b;
        if (fj.l.b(aVar, aVar2)) {
            return;
        }
        rVar.I = aVar2;
        if (rVar.J) {
            rVar.s1();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f12753b.f12667b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f12753b + ", overrideDescendants=false)";
    }
}
