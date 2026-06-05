package ji;

import fi.k;
import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f8964b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.a f8965c;

    public b(k kVar, ej.a aVar) {
        this.f8964b = kVar;
        this.f8965c = aVar;
    }

    @Override // v2.x0
    public final n d() {
        return new e(this.f8964b, this.f8965c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f8964b, bVar.f8964b) && l.b(this.f8965c, bVar.f8965c);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        e eVar = (e) nVar;
        l.f(eVar, "node");
        eVar.H = this.f8964b;
        eVar.I = this.f8965c;
        v2.n.m(eVar);
    }

    public final int hashCode() {
        return this.f8965c.hashCode() + (this.f8964b.hashCode() * 31);
    }
}
