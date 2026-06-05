package p2;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final v2.l f12702b;

    public h0(v2.l lVar) {
        this.f12702b = lVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new i0(k0.s.f9248d, this.f12702b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        a aVar = k0.s.f9248d;
        return aVar.equals(aVar) && fj.l.b(this.f12702b, h0Var.f12702b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        i0 i0Var = (i0) nVar;
        a aVar = k0.s.f9248d;
        if (!fj.l.b(i0Var.I, aVar)) {
            i0Var.I = aVar;
            if (i0Var.J) {
                i0Var.s1();
            }
        }
        i0Var.H = this.f12702b;
    }

    public final int hashCode() {
        int i10 = gk.b.i(1022 * 31, 31, false);
        v2.l lVar = this.f12702b;
        return i10 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + k0.s.f9248d + ", overrideDescendants=false, touchBoundsExpansion=" + this.f12702b + ')';
    }
}
