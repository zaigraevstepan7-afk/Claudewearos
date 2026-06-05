package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends v1.n implements v2.i, v2.w, v2.m1 {
    public g3.n0 H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public g3.n0 N;
    public k3.e0 O;

    @Override // v2.m1
    public final void F0() {
        if (this.O != null) {
            v2.n.t(this, new m0(this, 1));
        }
        this.K = true;
        v2.n.n(this);
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        k3.i iVar = (k3.i) v2.n.h(this, w2.f1.f18264k);
        this.N = g3.e0.h(this.H, v2.n.y(this).S);
        k3.j jVar = q1().f7151a.f7089f;
        k3.s sVar = q1().f7151a.f7086c;
        if (sVar == null) {
            sVar = k3.s.f9399f;
        }
        k3.o oVar = q1().f7151a.f7087d;
        int i10 = oVar != null ? oVar.f9392a : 0;
        k3.p pVar = q1().f7151a.f7088e;
        this.O = ((k3.k) iVar).b(jVar, sVar, i10, pVar != null ? pVar.f9393a : 65535);
        v2.n.t(this, new m0(this, 0));
        this.K = true;
    }

    @Override // v2.j
    public final void j0() {
        this.N = g3.e0.h(this.H, v2.n.y(this).S);
        this.K = true;
        v2.n.n(this);
    }

    @Override // v1.n
    public final void j1() {
        this.N = null;
        this.O = null;
        this.K = false;
    }

    @Override // v2.j
    public final void l() {
        this.K = true;
        v2.n.n(this);
    }

    public final g3.n0 q1() {
        g3.n0 n0Var = this.N;
        if (n0Var != null) {
            return n0Var;
        }
        a0.a.b("Resolved style is not set.");
        throw new b3.e();
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        if (this.K) {
            g3.n0 n0VarQ1 = q1();
            k3.i iVar = (k3.i) v2.n.h(this, w2.f1.f18264k);
            String str = e1.f9075a;
            int iA = (int) (e1.a(n0VarQ1, s0Var, iVar, str, 1) & 4294967295L);
            int iA2 = ((int) (e1.a(n0VarQ1, s0Var, iVar, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i10 = this.I;
            this.L = i10 == 1 ? -1 : ((i10 - 1) * iA2) + iA;
            int i11 = this.J;
            this.M = i11 == Integer.MAX_VALUE ? -1 : ((i11 - 1) * iA2) + iA;
            this.K = false;
        }
        int i12 = this.L;
        int iP = i12 != -1 ? cg.b.p(i12, s3.a.i(j), s3.a.g(j)) : s3.a.i(j);
        int i13 = this.M;
        t2.f1 f1VarY = p0Var.Y(s3.a.a(j, 0, 0, iP, i13 != -1 ? cg.b.p(i13, s3.a.i(j), s3.a.g(j)) : s3.a.g(j), 3));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new b0.l(f1VarY, 11));
    }
}
