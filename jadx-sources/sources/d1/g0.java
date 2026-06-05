package d1;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class g0<T> extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final q f4508b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.e f4509c;

    public g0(q qVar, ej.e eVar) {
        o1 o1Var = o1.f19664a;
        this.f4508b = qVar;
        this.f4509c = eVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        o1 o1Var = o1.f19664a;
        h0 h0Var = new h0();
        h0Var.H = this.f4508b;
        h0Var.I = this.f4509c;
        h0Var.J = o1Var;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!fj.l.b(this.f4508b, g0Var.f4508b) || this.f4509c != g0Var.f4509c) {
            return false;
        }
        o1 o1Var = o1.f19664a;
        return true;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        h0 h0Var = (h0) nVar;
        h0Var.H = this.f4508b;
        h0Var.I = this.f4509c;
        h0Var.J = o1.f19664a;
    }

    public final int hashCode() {
        return o1.f19664a.hashCode() + ((this.f4509c.hashCode() + (this.f4508b.hashCode() * 31)) * 31);
    }
}
