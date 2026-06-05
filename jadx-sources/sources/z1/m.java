package z1;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class m extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final h2.b f20362b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.c f20363c;

    /* renamed from: d, reason: collision with root package name */
    public final t2.i f20364d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20365e;

    /* renamed from: f, reason: collision with root package name */
    public final c2.n f20366f;

    public m(h2.b bVar, v1.c cVar, t2.i iVar, float f10, c2.n nVar) {
        this.f20362b = bVar;
        this.f20363c = cVar;
        this.f20364d = iVar;
        this.f20365e = f10;
        this.f20366f = nVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        n nVar = new n();
        nVar.H = this.f20362b;
        nVar.I = true;
        nVar.J = this.f20363c;
        nVar.K = this.f20364d;
        nVar.L = this.f20365e;
        nVar.M = this.f20366f;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return fj.l.b(this.f20362b, mVar.f20362b) && fj.l.b(this.f20363c, mVar.f20363c) && fj.l.b(this.f20364d, mVar.f20364d) && Float.compare(this.f20365e, mVar.f20365e) == 0 && fj.l.b(this.f20366f, mVar.f20366f);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        n nVar2 = (n) nVar;
        boolean z2 = nVar2.I;
        h2.b bVar = this.f20362b;
        boolean z10 = (z2 && b2.e.a(nVar2.H.h(), bVar.h())) ? false : true;
        nVar2.H = bVar;
        nVar2.I = true;
        nVar2.J = this.f20363c;
        nVar2.K = this.f20364d;
        nVar2.L = this.f20365e;
        nVar2.M = this.f20366f;
        if (z10) {
            v2.n.n(nVar2);
        }
        v2.n.m(nVar2);
    }

    public final int hashCode() {
        int iF = gk.b.f(this.f20365e, (this.f20364d.hashCode() + ((this.f20363c.hashCode() + gk.b.i(this.f20362b.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        c2.n nVar = this.f20366f;
        return iF + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f20362b + ", sizeToIntrinsics=true, alignment=" + this.f20363c + ", contentScale=" + this.f20364d + ", alpha=" + this.f20365e + ", colorFilter=" + this.f20366f + ')';
    }
}
