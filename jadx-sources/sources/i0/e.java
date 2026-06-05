package i0;

import fj.l;
import v1.n;
import v2.x0;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class e extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8077b;

    /* renamed from: c, reason: collision with root package name */
    public final k f8078c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8079d;

    /* renamed from: e, reason: collision with root package name */
    public final d3.j f8080e;

    /* renamed from: f, reason: collision with root package name */
    public final ej.c f8081f;

    public e(boolean z2, k kVar, boolean z10, d3.j jVar, ej.c cVar) {
        this.f8077b = z2;
        this.f8078c = kVar;
        this.f8079d = z10;
        this.f8080e = jVar;
        this.f8081f = cVar;
    }

    @Override // v2.x0
    public final n d() {
        return new h(this.f8077b, this.f8078c, this.f8079d, this.f8080e, this.f8081f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8077b == eVar.f8077b && l.b(this.f8078c, eVar.f8078c) && this.f8079d == eVar.f8079d && this.f8080e.equals(eVar.f8080e) && this.f8081f == eVar.f8081f;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        h hVar = (h) nVar;
        boolean z2 = hVar.f8090h0;
        boolean z10 = this.f8077b;
        if (z2 != z10) {
            hVar.f8090h0 = z10;
            v2.n.o(hVar);
        }
        hVar.f8091i0 = this.f8081f;
        hVar.F1(this.f8078c, null, false, this.f8079d, null, this.f8080e, hVar.f8092j0);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8077b) * 31;
        k kVar = this.f8078c;
        return this.f8081f.hashCode() + gk.b.g(this.f8080e.f4723a, gk.b.i(gk.b.i((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, false), 31, this.f8079d), 31);
    }
}
