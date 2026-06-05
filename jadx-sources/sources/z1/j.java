package z1;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class j extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f20358b;

    public j(ej.c cVar) {
        this.f20358b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        k kVar = new k();
        kVar.H = this.f20358b;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f20358b == ((j) obj).f20358b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((k) nVar).H = this.f20358b;
    }

    public final int hashCode() {
        return this.f20358b.hashCode();
    }
}
