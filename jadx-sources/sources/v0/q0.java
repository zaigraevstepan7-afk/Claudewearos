package v0;

import k0.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 implements k0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f17459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17460b;

    public q0(u0 u0Var, boolean z2) {
        this.f17459a = u0Var;
        this.f17460b = z2;
    }

    @Override // k0.b1
    public final void b() {
        u0 u0Var = this.f17459a;
        u0Var.f17501q.setValue(null);
        u0Var.f17502r.setValue(null);
        u0Var.t(true);
    }

    @Override // k0.b1
    public final void c() {
        u0 u0Var = this.f17459a;
        u0Var.f17501q.setValue(null);
        u0Var.f17502r.setValue(null);
        u0Var.t(true);
    }

    @Override // k0.b1
    public final void d() {
        s1 s1VarD;
        boolean z2 = this.f17460b;
        k0.j0 j0Var = z2 ? k0.j0.f9134b : k0.j0.f9135c;
        u0 u0Var = this.f17459a;
        u0Var.f17501q.setValue(j0Var);
        long jA = f0.a(u0Var.l(z2));
        k0.t0 t0Var = u0Var.f17489d;
        if (t0Var == null || (s1VarD = t0Var.d()) == null) {
            return;
        }
        long jE = s1VarD.e(jA);
        u0Var.f17498n = jE;
        u0Var.f17502r.setValue(new b2.b(jE));
        u0Var.f17500p = 0L;
        u0Var.f17503s = -1;
        k0.t0 t0Var2 = u0Var.f17489d;
        if (t0Var2 != null) {
            t0Var2.f9279q.setValue(Boolean.TRUE);
        }
        u0Var.t(false);
    }

    @Override // k0.b1
    public final void e(long j) {
        u0 u0Var = this.f17459a;
        long jF = b2.b.f(u0Var.f17500p, j);
        u0Var.f17500p = jF;
        u0Var.f17502r.setValue(new b2.b(b2.b.f(u0Var.f17498n, jF)));
        l3.t tVarN = u0Var.n();
        b2.b bVarI = u0Var.i();
        fj.l.c(bVarI);
        u0.c(u0Var, tVarN, bVarI.f1500a, false, this.f17460b, v.f17516g, true, new k2.b(9));
        u0Var.t(false);
    }

    @Override // k0.b1
    public final void onCancel() {
    }

    @Override // k0.b1
    public final void a(long j, l7.n nVar) {
    }
}
