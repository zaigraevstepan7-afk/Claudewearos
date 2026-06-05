package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class t1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final f2 f19721b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f19722c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19723d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19724e;

    /* renamed from: f, reason: collision with root package name */
    public final z.k f19725f;

    public t1(f2 f2Var, o1 o1Var, boolean z2, boolean z10, z.k kVar) {
        this.f19721b = f2Var;
        this.f19722c = o1Var;
        this.f19723d = z2;
        this.f19724e = z10;
        this.f19725f = kVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new e2(null, null, null, this.f19722c, this.f19721b, this.f19725f, this.f19723d, this.f19724e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return fj.l.b(this.f19721b, t1Var.f19721b) && this.f19722c == t1Var.f19722c && this.f19723d == t1Var.f19723d && this.f19724e == t1Var.f19724e && fj.l.b(this.f19725f, t1Var.f19725f);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((e2) nVar).L1(null, null, null, this.f19722c, this.f19721b, this.f19725f, this.f19723d, this.f19724e);
    }

    public final int hashCode() {
        int i10 = gk.b.i(gk.b.i((this.f19722c.hashCode() + (this.f19721b.hashCode() * 31)) * 961, 31, this.f19723d), 961, this.f19724e);
        z.k kVar = this.f19725f;
        return (i10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
    }
}
