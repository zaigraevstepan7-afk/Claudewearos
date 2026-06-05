package z1;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class i extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f20357b;

    public i(ej.c cVar) {
        this.f20357b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new c(new d(), this.f20357b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f20357b == ((i) obj).f20357b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        c cVar = (c) nVar;
        cVar.J = this.f20357b;
        cVar.q1();
    }

    public final int hashCode() {
        return this.f20357b.hashCode();
    }
}
