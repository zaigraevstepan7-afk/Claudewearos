package c1;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d2 extends v2.k implements v2.i {
    public boolean J;
    public z.k K;
    public float L;
    public float M;
    public boolean N;
    public qj.s1 O;
    public g7 P;
    public t.c Q;
    public c2.w0 R;
    public final t.c S;
    public final z1.c T;

    public d2(boolean z2, z.k kVar, g7 g7Var, c2.w0 w0Var) {
        float f10 = k7.f2348e;
        float f11 = k7.f2347d;
        this.J = z2;
        this.K = kVar;
        this.L = f10;
        this.M = f11;
        this.P = g7Var;
        this.R = w0Var;
        this.S = new t.c(new s3.f((this.N && z2) ? f10 : f11), t.d.f15138l, null, 12);
        z1.c cVar = new z1.c(new z1.d(), new ab.k(this, 3));
        q1(cVar);
        this.T = cVar;
    }

    public static final void t1(d2 d2Var, vi.i iVar) throws Throwable {
        d2Var.N = false;
        ArrayList arrayList = new ArrayList();
        tj.h0 h0Var = d2Var.K.f20346a;
        b1.g gVar = new b1.g(1, arrayList, d2Var);
        h0Var.getClass();
        tj.h0.k(h0Var, gVar, iVar);
        ui.a aVar = ui.a.f17085a;
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        this.O = qj.b0.w(e1(), null, new c2(this, null, 2), 3);
        if (this.Q == null) {
            g7 g7VarD = this.P;
            if (g7VarD == null) {
                k7 k7Var = k7.f2344a;
                g7VarD = k7.d((w0) v2.n.h(this, x0.f2845a), (v0.a1) v2.n.h(this, v0.b1.f17363a));
            }
            long jC = g7VarD.c(this.J, false, this.N);
            this.Q = new t.c(new c2.w(jC), new t.p1(s.c.f14568e, new c2.x0(c2.w.g(jC), 14)), null, 12);
        }
    }

    public final void u1() {
        ti.c cVar = null;
        qj.b0.w(e1(), null, new c2(this, cVar, 0), 3);
        qj.b0.w(e1(), null, new c2(this, cVar, 1), 3);
    }
}
