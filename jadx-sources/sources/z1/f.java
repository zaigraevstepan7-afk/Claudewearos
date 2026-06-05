package z1;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class f extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f20356b;

    public f(ej.c cVar) {
        this.f20356b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        e eVar = new e();
        eVar.H = this.f20356b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f20356b == ((f) obj).f20356b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((e) nVar).H = this.f20356b;
    }

    public final int hashCode() {
        return this.f20356b.hashCode();
    }
}
