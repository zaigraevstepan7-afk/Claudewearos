package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class v extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f17293b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f17294c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17295d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17296e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17297f;

    /* renamed from: g, reason: collision with root package name */
    public final d3.j f17298g;

    /* renamed from: h, reason: collision with root package name */
    public final ej.a f17299h;

    public v(z.k kVar, a1 a1Var, boolean z2, boolean z10, String str, d3.j jVar, ej.a aVar) {
        this.f17293b = kVar;
        this.f17294c = a1Var;
        this.f17295d = z2;
        this.f17296e = z10;
        this.f17297f = str;
        this.f17298g = jVar;
        this.f17299h = aVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new x(this.f17293b, this.f17294c, this.f17295d, this.f17296e, this.f17297f, this.f17298g, this.f17299h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return fj.l.b(this.f17293b, vVar.f17293b) && fj.l.b(this.f17294c, vVar.f17294c) && this.f17295d == vVar.f17295d && this.f17296e == vVar.f17296e && fj.l.b(this.f17297f, vVar.f17297f) && fj.l.b(this.f17298g, vVar.f17298g) && this.f17299h == vVar.f17299h;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((x) nVar).F1(this.f17293b, this.f17294c, this.f17295d, this.f17296e, this.f17297f, this.f17298g, this.f17299h);
    }

    public final int hashCode() {
        z.k kVar = this.f17293b;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        a1 a1Var = this.f17294c;
        int i10 = gk.b.i(gk.b.i((iHashCode + (a1Var != null ? a1Var.hashCode() : 0)) * 31, 31, this.f17295d), 31, this.f17296e);
        String str = this.f17297f;
        int iHashCode2 = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        d3.j jVar = this.f17298g;
        return this.f17299h.hashCode() + ((iHashCode2 + (jVar != null ? Integer.hashCode(jVar.f4723a) : 0)) * 31);
    }
}
