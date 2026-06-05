package a2;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class x extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final w f71b;

    public x(w wVar) {
        this.f71b = wVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        z zVar = new z();
        zVar.H = this.f71b;
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && fj.l.b(this.f71b, ((x) obj).f71b);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        z zVar = (z) nVar;
        zVar.H.f70a.k(zVar);
        w wVar = this.f71b;
        zVar.H = wVar;
        wVar.f70a.b(zVar);
    }

    public final int hashCode() {
        return this.f71b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f71b + ')';
    }
}
