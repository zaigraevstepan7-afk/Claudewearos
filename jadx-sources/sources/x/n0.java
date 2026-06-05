package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends v2.x0 {
    public static final ta.n j = new ta.n(26);

    /* renamed from: b, reason: collision with root package name */
    public final r0 f19643b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f19644c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19645d;

    /* renamed from: e, reason: collision with root package name */
    public final z.k f19646e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19647f;

    /* renamed from: g, reason: collision with root package name */
    public final ej.f f19648g;

    /* renamed from: h, reason: collision with root package name */
    public final ej.f f19649h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19650i;

    public n0(r0 r0Var, o1 o1Var, boolean z2, z.k kVar, boolean z10, o0 o0Var, ej.f fVar, boolean z11) {
        this.f19643b = r0Var;
        this.f19644c = o1Var;
        this.f19645d = z2;
        this.f19646e = kVar;
        this.f19647f = z10;
        this.f19648g = o0Var;
        this.f19649h = fVar;
        this.f19650i = z11;
    }

    @Override // v2.x0
    public final v1.n d() {
        ta.n nVar = j;
        boolean z2 = this.f19645d;
        z.k kVar = this.f19646e;
        o1 o1Var = this.f19644c;
        q0 q0Var = new q0(nVar, z2, kVar, o1Var);
        q0Var.f19681c0 = this.f19643b;
        q0Var.f19682d0 = o1Var;
        q0Var.f19683e0 = this.f19647f;
        q0Var.f19684f0 = this.f19648g;
        q0Var.f19685g0 = this.f19649h;
        q0Var.f19686h0 = this.f19650i;
        return q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return fj.l.b(this.f19643b, n0Var.f19643b) && this.f19644c == n0Var.f19644c && this.f19645d == n0Var.f19645d && fj.l.b(this.f19646e, n0Var.f19646e) && this.f19647f == n0Var.f19647f && fj.l.b(this.f19648g, n0Var.f19648g) && fj.l.b(this.f19649h, n0Var.f19649h) && this.f19650i == n0Var.f19650i;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        boolean z2;
        boolean z10;
        q0 q0Var = (q0) nVar;
        r0 r0Var = q0Var.f19681c0;
        r0 r0Var2 = this.f19643b;
        if (fj.l.b(r0Var, r0Var2)) {
            z2 = false;
        } else {
            q0Var.f19681c0 = r0Var2;
            z2 = true;
        }
        o1 o1Var = q0Var.f19682d0;
        o1 o1Var2 = this.f19644c;
        if (o1Var != o1Var2) {
            q0Var.f19682d0 = o1Var2;
            z2 = true;
        }
        boolean z11 = q0Var.f19686h0;
        boolean z12 = this.f19650i;
        if (z11 != z12) {
            q0Var.f19686h0 = z12;
            z10 = true;
        } else {
            z10 = z2;
        }
        q0Var.f19684f0 = this.f19648g;
        q0Var.f19685g0 = this.f19649h;
        q0Var.f19683e0 = this.f19647f;
        q0Var.K1(j, this.f19645d, this.f19646e, o1Var2, z10);
    }

    public final int hashCode() {
        int i10 = gk.b.i((this.f19644c.hashCode() + (this.f19643b.hashCode() * 31)) * 31, 31, this.f19645d);
        z.k kVar = this.f19646e;
        return Boolean.hashCode(this.f19650i) + ((this.f19649h.hashCode() + ((this.f19648g.hashCode() + gk.b.i((i10 + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.f19647f)) * 31)) * 31);
    }
}
