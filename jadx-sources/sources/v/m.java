package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class m extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f17244b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.s f17245c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17246d;

    /* renamed from: e, reason: collision with root package name */
    public final c2.w0 f17247e;

    public m(long j, c2.j0 j0Var, c2.w0 w0Var, int i10) {
        j = (i10 & 1) != 0 ? c2.w.f3058h : j;
        j0Var = (i10 & 2) != 0 ? null : j0Var;
        this.f17244b = j;
        this.f17245c = j0Var;
        this.f17246d = 1.0f;
        this.f17247e = w0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        o oVar = new o();
        oVar.H = this.f17244b;
        oVar.I = this.f17245c;
        oVar.J = this.f17246d;
        oVar.K = this.f17247e;
        oVar.L = 9205357640488583168L;
        return oVar;
    }

    public final boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && c2.w.d(this.f17244b, mVar.f17244b) && fj.l.b(this.f17245c, mVar.f17245c) && this.f17246d == mVar.f17246d && fj.l.b(this.f17247e, mVar.f17247e);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        o oVar = (o) nVar;
        oVar.H = this.f17244b;
        oVar.I = this.f17245c;
        oVar.J = this.f17246d;
        c2.w0 w0Var = oVar.K;
        c2.w0 w0Var2 = this.f17247e;
        if (!fj.l.b(w0Var, w0Var2)) {
            oVar.K = w0Var2;
            v2.n.o(oVar);
        }
        v2.n.m(oVar);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        int iHashCode = Long.hashCode(this.f17244b) * 31;
        c2.s sVar = this.f17245c;
        return this.f17247e.hashCode() + gk.b.f(this.f17246d, (iHashCode + (sVar != null ? sVar.hashCode() : 0)) * 31, 31);
    }
}
