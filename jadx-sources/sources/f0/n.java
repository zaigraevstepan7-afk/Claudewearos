package f0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class n extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final s f6172b;

    /* renamed from: c, reason: collision with root package name */
    public final d8.e f6173c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f6174d;

    public n(s sVar, d8.e eVar, o1 o1Var) {
        this.f6172b = sVar;
        this.f6173c = eVar;
        this.f6174d = o1Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        r rVar = new r();
        rVar.H = this.f6172b;
        rVar.I = this.f6173c;
        rVar.J = this.f6174d;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return fj.l.b(this.f6172b, nVar.f6172b) && fj.l.b(this.f6173c, nVar.f6173c) && this.f6174d == nVar.f6174d;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        r rVar = (r) nVar;
        rVar.H = this.f6172b;
        rVar.I = this.f6173c;
        rVar.J = this.f6174d;
    }

    public final int hashCode() {
        return this.f6174d.hashCode() + gk.b.i((this.f6173c.hashCode() + (this.f6172b.hashCode() * 31)) * 31, 31, false);
    }
}
