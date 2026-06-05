package s;

import t.f1;
import t.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class h0 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final j1 f14612b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f14613c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f14614d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f14615e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f14616f;

    /* renamed from: g, reason: collision with root package name */
    public final t0 f14617g;

    /* renamed from: h, reason: collision with root package name */
    public final ej.a f14618h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f14619i;

    public h0(j1 j1Var, f1 f1Var, f1 f1Var2, f1 f1Var3, s0 s0Var, t0 t0Var, ej.a aVar, i0 i0Var) {
        this.f14612b = j1Var;
        this.f14613c = f1Var;
        this.f14614d = f1Var2;
        this.f14615e = f1Var3;
        this.f14616f = s0Var;
        this.f14617g = t0Var;
        this.f14618h = aVar;
        this.f14619i = i0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new r0(this.f14612b, this.f14613c, this.f14614d, this.f14615e, this.f14616f, this.f14617g, this.f14618h, this.f14619i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return fj.l.b(h0Var.f14612b, this.f14612b) && fj.l.b(h0Var.f14613c, this.f14613c) && fj.l.b(h0Var.f14614d, this.f14614d) && fj.l.b(h0Var.f14615e, this.f14615e) && fj.l.b(h0Var.f14616f, this.f14616f) && fj.l.b(h0Var.f14617g, this.f14617g) && h0Var.f14618h == this.f14618h && fj.l.b(h0Var.f14619i, this.f14619i);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        r0 r0Var = (r0) nVar;
        r0Var.H = this.f14612b;
        r0Var.I = this.f14613c;
        r0Var.J = this.f14614d;
        r0Var.K = this.f14615e;
        r0Var.L = this.f14616f;
        r0Var.M = this.f14617g;
        r0Var.N = this.f14618h;
        r0Var.O = this.f14619i;
    }

    public final int hashCode() {
        int iHashCode = this.f14612b.hashCode() * 31;
        f1 f1Var = this.f14613c;
        int iHashCode2 = (iHashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 31;
        f1 f1Var2 = this.f14614d;
        int iHashCode3 = (iHashCode2 + (f1Var2 != null ? f1Var2.hashCode() : 0)) * 31;
        f1 f1Var3 = this.f14615e;
        return this.f14619i.hashCode() + ((this.f14618h.hashCode() + ((this.f14617g.f14677a.hashCode() + ((this.f14616f.f14672a.hashCode() + ((iHashCode3 + (f1Var3 != null ? f1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
