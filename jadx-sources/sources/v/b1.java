package v;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final c1.l f17147b;

    /* renamed from: c, reason: collision with root package name */
    public final ta.t f17148c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f17149d;

    public b1(c1.l lVar, ta.t tVar, o1 o1Var) {
        this.f17147b = lVar;
        this.f17148c = tVar;
        this.f17149d = o1Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new d1(this.f17147b, this.f17148c, this.f17149d);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        d1 d1Var = (d1) nVar;
        d1Var.getClass();
        o1 o1Var = d1Var.J;
        View view = d1Var.K;
        s3.c cVar = d1Var.L;
        d1Var.H = this.f17147b;
        d1Var.I = this.f17148c;
        o1 o1Var2 = this.f17149d;
        d1Var.J = o1Var2;
        View viewA = v2.n.A(d1Var);
        s3.c cVar2 = v2.n.y(d1Var).R;
        if (d1Var.M != null) {
            d3.y yVar = e1.f17185a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !o1Var2.a()) || !s3.f.e(Float.NaN, Float.NaN) || !s3.f.e(Float.NaN, Float.NaN) || !o1Var2.equals(o1Var) || !viewA.equals(view) || !fj.l.b(cVar2, cVar)) {
                d1Var.r1();
            }
        }
        d1Var.s1();
    }

    public final int hashCode() {
        return this.f17149d.hashCode() + ((this.f17148c.hashCode() + gk.b.i(gk.b.f(Float.NaN, gk.b.f(Float.NaN, gk.b.j(gk.b.i(gk.b.f(Float.NaN, this.f17147b.hashCode() * 961, 31), 31, true), 9205357640488583168L, 31), 31), 31), 31, true)) * 31);
    }
}
