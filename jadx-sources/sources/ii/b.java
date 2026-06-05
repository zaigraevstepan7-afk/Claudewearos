package ii;

import fi.k;
import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f8582b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.a f8583c;

    public b(k kVar, ej.a aVar) {
        this.f8582b = kVar;
        this.f8583c = aVar;
    }

    @Override // v2.x0
    public final n d() {
        return new c(this.f8582b, this.f8583c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f8582b, bVar.f8582b) && l.b(this.f8583c, bVar.f8583c);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        c cVar = (c) nVar;
        l.f(cVar, "node");
        cVar.H = this.f8582b;
        cVar.I = this.f8583c;
        v2.n.m(cVar);
    }

    public final int hashCode() {
        return this.f8583c.hashCode() + (this.f8582b.hashCode() * 31);
    }
}
