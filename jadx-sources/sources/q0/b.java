package q0;

import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ab.g f13157b;

    public b(ab.g gVar) {
        this.f13157b = gVar;
    }

    @Override // v2.x0
    public final n d() {
        c cVar = new c();
        cVar.J = this.f13157b;
        ab.k kVar = new ab.k(cVar, 28);
        a aVar = new a();
        aVar.H = kVar;
        cVar.q1(aVar);
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f13157b == ((b) obj).f13157b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        ((c) nVar).J = this.f13157b;
    }

    public final int hashCode() {
        return this.f13157b.hashCode();
    }
}
