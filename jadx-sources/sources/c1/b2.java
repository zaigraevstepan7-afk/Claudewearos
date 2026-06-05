package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b2 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1932b;

    /* renamed from: c, reason: collision with root package name */
    public final z.k f1933c;

    /* renamed from: d, reason: collision with root package name */
    public final g7 f1934d;

    /* renamed from: e, reason: collision with root package name */
    public final c2.w0 f1935e;

    public b2(boolean z2, z.k kVar, g7 g7Var, c2.w0 w0Var) {
        k7 k7Var = k7.f2344a;
        k7 k7Var2 = k7.f2344a;
        this.f1932b = z2;
        this.f1933c = kVar;
        this.f1934d = g7Var;
        this.f1935e = w0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        k7 k7Var = k7.f2344a;
        k7 k7Var2 = k7.f2344a;
        return new d2(this.f1932b, this.f1933c, this.f1934d, this.f1935e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (this.f1932b != b2Var.f1932b || !fj.l.b(this.f1933c, b2Var.f1933c) || !this.f1934d.equals(b2Var.f1934d) || !fj.l.b(this.f1935e, b2Var.f1935e)) {
            return false;
        }
        float f10 = k7.f2348e;
        if (!s3.f.e(f10, f10)) {
            return false;
        }
        float f11 = k7.f2347d;
        return s3.f.e(f11, f11);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        boolean z2;
        d2 d2Var = (d2) nVar;
        float f10 = k7.f2348e;
        float f11 = k7.f2347d;
        boolean z10 = d2Var.J;
        boolean z11 = this.f1932b;
        boolean z12 = true;
        if (z10 != z11) {
            d2Var.J = z11;
            z2 = true;
        } else {
            z2 = false;
        }
        z.k kVar = d2Var.K;
        z.k kVar2 = this.f1933c;
        if (kVar != kVar2) {
            d2Var.K = kVar2;
            qj.s1 s1Var = d2Var.O;
            ti.c cVar = null;
            if (s1Var != null) {
                s1Var.e(null);
            }
            d2Var.O = qj.b0.w(d2Var.e1(), null, new c2(d2Var, cVar, 3), 3);
        }
        g7 g7Var = d2Var.P;
        g7 g7Var2 = this.f1934d;
        if (!fj.l.b(g7Var, g7Var2)) {
            d2Var.P = g7Var2;
            z2 = true;
        }
        c2.w0 w0Var = d2Var.R;
        c2.w0 w0Var2 = this.f1935e;
        if (!fj.l.b(w0Var, w0Var2)) {
            if (!fj.l.b(d2Var.R, w0Var2)) {
                d2Var.R = w0Var2;
                d2Var.T.q1();
            }
            z2 = true;
        }
        if (!s3.f.e(d2Var.L, f10)) {
            d2Var.L = f10;
            z2 = true;
        }
        if (s3.f.e(d2Var.M, f11)) {
            z12 = z2;
        } else {
            d2Var.M = f11;
        }
        if (z12) {
            d2Var.u1();
        }
    }

    public final int hashCode() {
        int iHashCode = (this.f1934d.hashCode() + ((this.f1933c.hashCode() + gk.b.i(Boolean.hashCode(this.f1932b) * 31, 31, false)) * 31)) * 31;
        c2.w0 w0Var = this.f1935e;
        return Float.hashCode(k7.f2347d) + gk.b.f(k7.f2348e, (iHashCode + (w0Var != null ? w0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.f1932b + ", isError=false, interactionSource=" + this.f1933c + ", colors=" + this.f1934d + ", textFieldShape=" + this.f1935e + ", focusedIndicatorLineThickness=" + ((Object) s3.f.f(k7.f2348e)) + ", unfocusedIndicatorLineThickness=" + ((Object) s3.f.f(k7.f2347d)) + ')';
    }
}
