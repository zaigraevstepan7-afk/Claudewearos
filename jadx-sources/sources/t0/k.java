package t0;

import k0.t0;
import v0.u0;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class k extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final a f15365b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f15366c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f15367d;

    public k(a aVar, t0 t0Var, u0 u0Var) {
        this.f15365b = aVar;
        this.f15366c = t0Var;
        this.f15367d = u0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new l(this.f15365b, this.f15366c, this.f15367d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return fj.l.b(this.f15365b, kVar.f15365b) && fj.l.b(this.f15366c, kVar.f15366c) && fj.l.b(this.f15367d, kVar.f15367d);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        l lVar = (l) nVar;
        if (lVar.G) {
            lVar.H.e();
            lVar.H.k(lVar);
        }
        a aVar = this.f15365b;
        lVar.H = aVar;
        if (lVar.G) {
            if (aVar.f15338a != null) {
                a0.a.c("Expected textInputModifierNode to be null");
            }
            aVar.f15338a = lVar;
        }
        lVar.I = this.f15366c;
        lVar.J = this.f15367d;
    }

    public final int hashCode() {
        return this.f15367d.hashCode() + ((this.f15366c.hashCode() + (this.f15365b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f15365b + ", legacyTextFieldState=" + this.f15366c + ", textFieldSelectionManager=" + this.f15367d + ')';
    }
}
