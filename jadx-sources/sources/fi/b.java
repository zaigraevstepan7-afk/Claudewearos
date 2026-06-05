package fi;

import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class b extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final a f6742b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6743c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.c f6744d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f6745e;

    /* renamed from: f, reason: collision with root package name */
    public final gi.d f6746f;

    /* renamed from: g, reason: collision with root package name */
    public final ej.e f6747g;

    /* renamed from: h, reason: collision with root package name */
    public final ej.c f6748h;

    public b(a aVar, k kVar, ej.c cVar, ej.c cVar2, gi.d dVar, ej.e eVar, ej.c cVar3) {
        l.f(aVar, "backdrop");
        l.f(cVar, "effects");
        this.f6742b = aVar;
        this.f6743c = kVar;
        this.f6744d = cVar;
        this.f6745e = cVar2;
        this.f6746f = dVar;
        this.f6747g = eVar;
        this.f6748h = cVar3;
    }

    @Override // v2.x0
    public final n d() {
        return new f(this.f6742b, this.f6743c, this.f6744d, this.f6745e, this.f6746f, this.f6747g, this.f6748h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f6742b, bVar.f6742b) && this.f6743c.equals(bVar.f6743c) && l.b(this.f6744d, bVar.f6744d) && l.b(this.f6745e, bVar.f6745e) && l.b(this.f6746f, bVar.f6746f) && this.f6747g.equals(bVar.f6747g) && l.b(this.f6748h, bVar.f6748h);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        f fVar = (f) nVar;
        l.f(fVar, "node");
        a aVar = this.f6742b;
        l.f(aVar, "<set-?>");
        fVar.H = aVar;
        fVar.I = this.f6743c;
        ej.c cVar = this.f6744d;
        l.f(cVar, "<set-?>");
        fVar.J = cVar;
        fVar.K = this.f6745e;
        fVar.L = this.f6746f;
        fVar.M = this.f6747g;
        fVar.N = this.f6748h;
        v2.n.t(fVar, new a7.e(fVar, 7));
    }

    public final int hashCode() {
        int iHashCode = (this.f6744d.hashCode() + ((this.f6743c.hashCode() + (this.f6742b.hashCode() * 31)) * 31)) * 31;
        ej.c cVar = this.f6745e;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        gi.d dVar = this.f6746f;
        int iHashCode3 = (this.f6747g.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 961)) * 31;
        ej.c cVar2 = this.f6748h;
        return (iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
    }
}
