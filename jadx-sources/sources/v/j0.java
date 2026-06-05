package v;

import c1.s3;
import v2.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends v2.k implements v2.z1, v2.o, v2.i, v2.m1, e2 {
    public static final b P = new b();
    public z.k J;
    public final ej.c K;
    public z.d L;
    public f0.k0 M;
    public v2.i1 N;
    public final a2.e0 O;

    public j0(z.k kVar, int i10, k0.h1 h1Var) {
        this.J = kVar;
        this.K = h1Var;
        a2.e0 e0Var = new a2.e0(i10, new u6.t(2, this, j0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 2), 10);
        q1(e0Var);
        this.O = e0Var;
    }

    @Override // v2.e2
    public final Object D() {
        return P;
    }

    @Override // v2.m1
    public final void F0() {
        fj.v vVar = new fj.v();
        v2.n.t(this, new s3(28, vVar, this));
        f0.k0 k0Var = (f0.k0) vVar.f6807a;
        if (this.O.v1().a()) {
            f0.k0 k0Var2 = this.M;
            if (k0Var2 != null) {
                k0Var2.b();
            }
            if (k0Var != null) {
                k0Var.a();
            } else {
                k0Var = null;
            }
            this.M = k0Var;
        }
    }

    @Override // v2.o
    public final void N0(v2.i1 i1Var) {
        this.N = i1Var;
        if (this.O.v1().a()) {
            boolean z2 = i1Var.w1().G;
            b bVar = k0.H;
            if (!z2) {
                if (this.G) {
                    v2.n.j(this, bVar);
                }
            } else {
                v2.i1 i1Var2 = this.N;
                if (i1Var2 != null && i1Var2.w1().G && this.G) {
                    v2.n.j(this, bVar);
                }
            }
        }
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void k1() {
        f0.k0 k0Var = this.M;
        if (k0Var != null) {
            k0Var.b();
        }
        this.M = null;
    }

    public final void t1(z.k kVar, z.j jVar) {
        if (!this.G) {
            kVar.b(jVar);
            return;
        }
        qj.e1 e1Var = (qj.e1) ((vj.d) e1()).f18092a.C(qj.w.f13632b);
        qj.b0.w(e1(), null, new ab.s(kVar, jVar, e1Var != null ? e1Var.T(new k0.t1(28, kVar, jVar)) : null, (ti.c) null, 26), 3);
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        boolean zA = this.O.v1().a();
        lj.d[] dVarArr = d3.x.f4803a;
        d3.y yVar = d3.v.f4786l;
        lj.d dVar = d3.x.f4803a[4];
        zVar.b(yVar, Boolean.valueOf(zA));
        zVar.b(d3.m.f4754w, new d3.a(null, new a2.i(0, this, j0.class, "requestFocus", "requestFocus()Z", 0, 0, 11)));
    }

    public final void u1(z.k kVar) {
        z.d dVar;
        if (fj.l.b(this.J, kVar)) {
            return;
        }
        z.k kVar2 = this.J;
        if (kVar2 != null && (dVar = this.L) != null) {
            kVar2.b(new z.e(dVar));
        }
        this.L = null;
        this.J = kVar;
    }
}
