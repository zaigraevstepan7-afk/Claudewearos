package ji;

import fi.k;
import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f8978b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.a f8979c;

    public g(k kVar, ej.a aVar) {
        this.f8978b = kVar;
        this.f8979c = aVar;
    }

    @Override // v2.x0
    public final n d() {
        return new j(this.f8978b, this.f8979c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.b(this.f8978b, gVar.f8978b) && l.b(this.f8979c, gVar.f8979c);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        j jVar = (j) nVar;
        l.f(jVar, "node");
        jVar.H = this.f8978b;
        jVar.I = this.f8979c;
        v2.n.m(jVar);
    }

    public final int hashCode() {
        return this.f8979c.hashCode() + (this.f8978b.hashCode() * 31);
    }
}
