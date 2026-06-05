package i0;

import fj.l;
import v.a1;
import v1.n;
import v2.x0;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class i extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final f3.a f8093b;

    /* renamed from: c, reason: collision with root package name */
    public final k f8094c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f8095d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8096e;

    /* renamed from: f, reason: collision with root package name */
    public final d3.j f8097f;

    /* renamed from: g, reason: collision with root package name */
    public final ej.a f8098g;

    public i(f3.a aVar, k kVar, a1 a1Var, boolean z2, d3.j jVar, ej.a aVar2) {
        this.f8093b = aVar;
        this.f8094c = kVar;
        this.f8095d = a1Var;
        this.f8096e = z2;
        this.f8097f = jVar;
        this.f8098g = aVar2;
    }

    @Override // v2.x0
    public final n d() {
        j jVar = new j(this.f8094c, this.f8095d, false, this.f8096e, null, this.f8097f, this.f8098g);
        jVar.f8099h0 = this.f8093b;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8093b == iVar.f8093b && l.b(this.f8094c, iVar.f8094c) && l.b(this.f8095d, iVar.f8095d) && this.f8096e == iVar.f8096e && this.f8097f.equals(iVar.f8097f) && this.f8098g == iVar.f8098g;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        j jVar = (j) nVar;
        f3.a aVar = jVar.f8099h0;
        f3.a aVar2 = this.f8093b;
        if (aVar != aVar2) {
            jVar.f8099h0 = aVar2;
            v2.n.o(jVar);
        }
        jVar.F1(this.f8094c, this.f8095d, false, this.f8096e, null, this.f8097f, this.f8098g);
    }

    public final int hashCode() {
        int iHashCode = this.f8093b.hashCode() * 31;
        k kVar = this.f8094c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        a1 a1Var = this.f8095d;
        return this.f8098g.hashCode() + gk.b.g(this.f8097f.f4723a, gk.b.i(gk.b.i((iHashCode2 + (a1Var != null ? a1Var.hashCode() : 0)) * 31, 31, false), 31, this.f8096e), 31);
    }
}
