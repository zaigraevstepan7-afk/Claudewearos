package v;

import x.e2;
import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x1 extends v2.k implements v2.i, v2.m1 {
    public f2 J;
    public x.o1 K;
    public boolean L;
    public x.s0 M;
    public z.k N;
    public x.d O;
    public boolean P;
    public i Q;
    public e2 R;
    public v2.j S;
    public j T;
    public i U;
    public boolean V;

    @Override // v2.m1
    public final void F0() {
        j jVar = (j) v2.n.h(this, m1.f17248a);
        if (fj.l.b(jVar, this.T)) {
            return;
        }
        this.T = jVar;
        this.U = null;
        v2.j jVar2 = this.S;
        if (jVar2 != null) {
            r1(jVar2);
        }
        this.S = null;
        t1();
        e2 e2Var = this.R;
        if (e2Var != null) {
            f2 f2Var = this.J;
            x.o1 o1Var = this.K;
            i iVar = this.P ? this.U : this.Q;
            e2Var.L1(iVar, this.O, this.M, o1Var, f2Var, this.N, this.L, this.V);
        }
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        this.V = u1();
        t1();
        if (this.R == null) {
            f2 f2Var = this.J;
            i iVar = this.P ? this.U : this.Q;
            e2 e2Var = new e2(iVar, this.O, this.M, this.K, f2Var, this.N, this.L, this.V);
            q1(e2Var);
            this.R = e2Var;
        }
    }

    @Override // v2.j
    public final void j0() {
        boolean zU1 = u1();
        if (this.V != zU1) {
            this.V = zU1;
            f2 f2Var = this.J;
            x.o1 o1Var = this.K;
            boolean z2 = this.P;
            i iVar = z2 ? this.U : this.Q;
            v1(iVar, this.O, this.M, o1Var, f2Var, this.N, z2, this.L);
        }
    }

    @Override // v1.n
    public final void j1() {
        v2.j jVar = this.S;
        if (jVar != null) {
            r1(jVar);
        }
    }

    public final void t1() {
        v2.j jVar = this.S;
        if (jVar != null) {
            if (((v1.n) jVar).f17565a.G) {
                return;
            }
            q1(jVar);
            return;
        }
        if (this.P) {
            v2.n.t(this, new q0.k(this, 16));
        }
        i iVar = this.P ? this.U : this.Q;
        if (iVar != null) {
            v2.k kVar = iVar.f17225i;
            if (kVar.f17565a.G) {
                return;
            }
            q1(kVar);
            this.S = kVar;
        }
    }

    public final boolean u1() {
        s3.m mVar = s3.m.f14752a;
        if (this.G) {
            mVar = v2.n.y(this).S;
        }
        return mVar != s3.m.f14753b || this.K == x.o1.f19664a;
    }

    public final void v1(i iVar, x.d dVar, x.s0 s0Var, x.o1 o1Var, f2 f2Var, z.k kVar, boolean z2, boolean z10) {
        boolean z11;
        this.J = f2Var;
        this.K = o1Var;
        boolean z12 = true;
        if (this.P != z2) {
            this.P = z2;
            z11 = true;
        } else {
            z11 = false;
        }
        if (fj.l.b(this.Q, iVar)) {
            z12 = false;
        } else {
            this.Q = iVar;
        }
        if (z11 || (z12 && !z2)) {
            v2.j jVar = this.S;
            if (jVar != null) {
                r1(jVar);
            }
            this.S = null;
            t1();
        }
        this.L = z10;
        this.M = s0Var;
        this.N = kVar;
        this.O = dVar;
        boolean zU1 = u1();
        this.V = zU1;
        e2 e2Var = this.R;
        if (e2Var != null) {
            e2Var.L1(this.P ? this.U : this.Q, dVar, s0Var, o1Var, f2Var, kVar, z10, zU1);
        }
    }
}
