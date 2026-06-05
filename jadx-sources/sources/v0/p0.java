package v0;

import k0.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements k0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f17458a;

    public p0(u0 u0Var) {
        this.f17458a = u0Var;
    }

    @Override // k0.b1
    public final void a(long j, l7.n nVar) {
        s1 s1VarD;
        u0 u0Var = this.f17458a;
        long jA = f0.a(u0Var.l(true));
        k0.t0 t0Var = u0Var.f17489d;
        if (t0Var == null || (s1VarD = t0Var.d()) == null) {
            return;
        }
        long jE = s1VarD.e(jA);
        u0Var.f17498n = jE;
        u0Var.f17502r.setValue(new b2.b(jE));
        u0Var.f17500p = 0L;
        u0Var.f17501q.setValue(k0.j0.f9133a);
        u0Var.t(false);
    }

    @Override // k0.b1
    public final void b() {
        u0 u0Var = this.f17458a;
        u0Var.f17501q.setValue(null);
        u0Var.f17502r.setValue(null);
    }

    @Override // k0.b1
    public final void c() {
        u0 u0Var = this.f17458a;
        u0Var.f17501q.setValue(null);
        u0Var.f17502r.setValue(null);
    }

    @Override // k0.b1
    public final void e(long j) {
        s1 s1VarD;
        k2.a aVar;
        u0 u0Var = this.f17458a;
        u0Var.f17500p = b2.b.f(u0Var.f17500p, j);
        k0.t0 t0Var = u0Var.f17489d;
        if (t0Var == null || (s1VarD = t0Var.d()) == null) {
            return;
        }
        u0Var.f17502r.setValue(new b2.b(b2.b.f(u0Var.f17498n, u0Var.f17500p)));
        l3.n nVar = u0Var.f17487b;
        b2.b bVarI = u0Var.i();
        fj.l.c(bVarI);
        int iA = nVar.a(s1VarD.b(bVarI.f1500a, true));
        long jB = g3.e0.b(iA, iA);
        if (g3.m0.b(jB, u0Var.n().f9938b)) {
            return;
        }
        k0.t0 t0Var2 = u0Var.f17489d;
        if ((t0Var2 == null || ((Boolean) t0Var2.f9279q.getValue()).booleanValue()) && (aVar = u0Var.j) != null) {
            ((k2.c) aVar).a(9);
        }
        u0Var.f17488c.invoke(u0.e(u0Var.n().f9937a, jB));
        u0Var.f17506v = new g3.m0(jB);
    }

    @Override // k0.b1
    public final void d() {
    }

    @Override // k0.b1
    public final void onCancel() {
    }
}
