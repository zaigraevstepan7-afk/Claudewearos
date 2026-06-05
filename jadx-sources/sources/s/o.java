package s;

import t.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class o<S> extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f14651b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.a1 f14652c;

    /* renamed from: d, reason: collision with root package name */
    public final r f14653d;

    public o(f1 f1Var, f1.a1 a1Var, r rVar) {
        this.f14651b = f1Var;
        this.f14652c = a1Var;
        this.f14653d = rVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        q qVar = new q();
        qVar.H = this.f14651b;
        qVar.I = this.f14652c;
        qVar.J = this.f14653d;
        qVar.K = j.f14632a;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return fj.l.b(oVar.f14651b, this.f14651b) && oVar.f14652c.equals(this.f14652c);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        q qVar = (q) nVar;
        qVar.H = this.f14651b;
        qVar.I = this.f14652c;
        qVar.J = this.f14653d;
    }

    public final int hashCode() {
        int iHashCode = this.f14653d.hashCode() * 31;
        f1 f1Var = this.f14651b;
        return this.f14652c.hashCode() + ((iHashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 31);
    }
}
