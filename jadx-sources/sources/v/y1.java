package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final v1 f17335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17336c;

    public y1(v1 v1Var, boolean z2) {
        this.f17335b = v1Var;
        this.f17336c = z2;
    }

    @Override // v2.x0
    public final v1.n d() {
        t1 t1Var = new t1();
        t1Var.H = this.f17335b;
        t1Var.I = this.f17336c;
        return t1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return fj.l.b(this.f17335b, y1Var.f17335b) && this.f17336c == y1Var.f17336c;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        t1 t1Var = (t1) nVar;
        t1Var.H = this.f17335b;
        t1Var.I = this.f17336c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17336c) + gk.b.i(this.f17335b.hashCode() * 31, 31, false);
    }
}
