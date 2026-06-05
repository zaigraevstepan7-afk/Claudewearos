package v;

import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class w1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final f2 f17321b;

    /* renamed from: c, reason: collision with root package name */
    public final x.o1 f17322c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17323d;

    /* renamed from: e, reason: collision with root package name */
    public final x.s0 f17324e;

    /* renamed from: f, reason: collision with root package name */
    public final z.k f17325f;

    /* renamed from: g, reason: collision with root package name */
    public final x.d f17326g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17327h;

    /* renamed from: i, reason: collision with root package name */
    public final i f17328i;

    public w1(i iVar, x.d dVar, x.s0 s0Var, x.o1 o1Var, f2 f2Var, z.k kVar, boolean z2, boolean z10) {
        this.f17321b = f2Var;
        this.f17322c = o1Var;
        this.f17323d = z2;
        this.f17324e = s0Var;
        this.f17325f = kVar;
        this.f17326g = dVar;
        this.f17327h = z10;
        this.f17328i = iVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        x1 x1Var = new x1();
        x1Var.J = this.f17321b;
        x1Var.K = this.f17322c;
        x1Var.L = this.f17323d;
        x1Var.M = this.f17324e;
        x1Var.N = this.f17325f;
        x1Var.O = this.f17326g;
        x1Var.P = this.f17327h;
        x1Var.Q = this.f17328i;
        return x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1.class != obj.getClass()) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return fj.l.b(this.f17321b, w1Var.f17321b) && this.f17322c == w1Var.f17322c && this.f17323d == w1Var.f17323d && fj.l.b(this.f17324e, w1Var.f17324e) && fj.l.b(this.f17325f, w1Var.f17325f) && fj.l.b(this.f17326g, w1Var.f17326g) && this.f17327h == w1Var.f17327h && fj.l.b(this.f17328i, w1Var.f17328i);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        z.k kVar = this.f17325f;
        ((x1) nVar).v1(this.f17328i, this.f17326g, this.f17324e, this.f17322c, this.f17321b, kVar, this.f17327h, this.f17323d);
    }

    public final int hashCode() {
        int i10 = gk.b.i(gk.b.i((this.f17322c.hashCode() + (this.f17321b.hashCode() * 31)) * 31, 31, this.f17323d), 31, false);
        x.s0 s0Var = this.f17324e;
        int iHashCode = (i10 + (s0Var != null ? s0Var.hashCode() : 0)) * 31;
        z.k kVar = this.f17325f;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        x.d dVar = this.f17326g;
        int i11 = gk.b.i((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f17327h);
        i iVar = this.f17328i;
        return i11 + (iVar != null ? iVar.hashCode() : 0);
    }
}
