package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class w7 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final z.k f2840b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2841c;

    /* renamed from: d, reason: collision with root package name */
    public final t.u0 f2842d;

    public w7(z.k kVar, boolean z2, t.u0 u0Var) {
        this.f2840b = kVar;
        this.f2841c = z2;
        this.f2842d = u0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        y7 y7Var = new y7();
        y7Var.H = this.f2840b;
        y7Var.I = this.f2841c;
        y7Var.J = this.f2842d;
        y7Var.N = Float.NaN;
        y7Var.O = Float.NaN;
        return y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return fj.l.b(this.f2840b, w7Var.f2840b) && this.f2841c == w7Var.f2841c && this.f2842d.equals(w7Var.f2842d);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        y7 y7Var = (y7) nVar;
        y7Var.H = this.f2840b;
        boolean z2 = y7Var.I;
        boolean z10 = this.f2841c;
        if (z2 != z10) {
            v2.n.n(y7Var);
        }
        y7Var.I = z10;
        y7Var.J = this.f2842d;
        if (y7Var.M == null && !Float.isNaN(y7Var.O)) {
            y7Var.M = t.d.a(y7Var.O, 0.01f);
        }
        if (y7Var.L != null || Float.isNaN(y7Var.N)) {
            return;
        }
        y7Var.L = t.d.a(y7Var.N, 0.01f);
    }

    public final int hashCode() {
        return this.f2842d.hashCode() + gk.b.i(this.f2840b.hashCode() * 31, 31, this.f2841c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f2840b + ", checked=" + this.f2841c + ", animationSpec=" + this.f2842d + ')';
    }
}
