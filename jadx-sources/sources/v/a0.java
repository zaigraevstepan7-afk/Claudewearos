package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class a0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f17143b;

    /* renamed from: c, reason: collision with root package name */
    public final d3.j f17144c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.a f17145d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.a f17146e;

    public a0(d3.j jVar, ej.a aVar, ej.a aVar2, z.k kVar) {
        this.f17143b = kVar;
        this.f17144c = jVar;
        this.f17145d = aVar;
        this.f17146e = aVar2;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new d0(this.f17144c, this.f17145d, this.f17146e, this.f17143b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return fj.l.b(this.f17143b, a0Var.f17143b) && fj.l.b(this.f17144c, a0Var.f17144c) && this.f17145d == a0Var.f17145d && this.f17146e == a0Var.f17146e;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        boolean z2;
        d0 d0Var = (d0) nVar;
        d0Var.f17165g0 = true;
        boolean z10 = d0Var.f17164f0 == null;
        ej.a aVar = this.f17146e;
        if (z10 != (aVar == null)) {
            d0Var.v1();
            v2.n.o(d0Var);
            z2 = true;
        } else {
            z2 = false;
        }
        d0Var.f17164f0 = aVar;
        boolean z11 = !d0Var.O ? true : z2;
        d0Var.F1(this.f17143b, null, false, true, null, this.f17144c, this.f17145d);
        if (z11) {
            p2.p0 p0Var = d0Var.S;
            if (p0Var != null) {
                p0Var.s1();
            }
            d0Var.G1(false);
            d0Var.G1(true);
        }
    }

    public final int hashCode() {
        z.k kVar = this.f17143b;
        int i10 = gk.b.i(gk.b.i((kVar != null ? kVar.hashCode() : 0) * 961, 31, false), 961, true);
        d3.j jVar = this.f17144c;
        int iHashCode = (this.f17145d.hashCode() + ((i10 + (jVar != null ? Integer.hashCode(jVar.f4723a) : 0)) * 31)) * 961;
        ej.a aVar = this.f17146e;
        return Boolean.hashCode(true) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 961);
    }
}
