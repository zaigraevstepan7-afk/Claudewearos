package gi;

import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class e extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final d f7435b;

    public e(d dVar) {
        l.f(dVar, "backdrop");
        this.f7435b = dVar;
    }

    @Override // v2.x0
    public final n d() {
        d dVar = this.f7435b;
        l.f(dVar, "backdrop");
        g gVar = new g();
        gVar.H = dVar;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return l.b(this.f7435b, ((e) obj).f7435b);
        }
        return false;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        g gVar = (g) nVar;
        l.f(gVar, "node");
        d dVar = this.f7435b;
        l.f(dVar, "<set-?>");
        gVar.H = dVar;
        v2.n.m(gVar);
    }

    public final int hashCode() {
        return this.f7435b.hashCode();
    }
}
