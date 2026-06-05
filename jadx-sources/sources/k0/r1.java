package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r1 extends v1.n implements v2.i, v2.w {
    public final g3.n0 H;
    public k3.e0 I;
    public fi.k J;

    public r1(g3.n0 n0Var) {
        this.H = n0Var;
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        g3.n0 n0VarH = g3.e0.h(this.H, v2.n.y(this).S);
        k3.i iVar = (k3.i) v2.n.h(this, w2.f1.f18264k);
        q1(n0VarH, iVar);
        s3.m mVar = v2.n.y(this).S;
        s3.c cVar = v2.n.y(this).R;
        k3.e0 e0Var = this.I;
        if (e0Var != null) {
            this.J = new fi.k(mVar, cVar, iVar, n0VarH, e0Var.getValue());
        } else {
            a0.a.b("Font resolution state is not set.");
            throw new b3.e();
        }
    }

    @Override // v2.j
    public final void j0() {
        fi.k kVar = this.J;
        if (kVar != null) {
            fi.k.a(kVar, v2.n.y(this).S, null, null, 30);
        }
        v2.n.n(this);
    }

    @Override // v1.n
    public final void j1() {
        this.I = null;
        this.J = null;
    }

    @Override // v2.j
    public final void l() {
        fi.k kVar = this.J;
        if (kVar != null) {
            fi.k.a(kVar, null, v2.n.y(this).R, null, 29);
        }
        v2.n.n(this);
    }

    public final void q1(g3.n0 n0Var, k3.i iVar) {
        g3.f0 f0Var = n0Var.f7151a;
        k3.j jVar = f0Var.f7089f;
        k3.s sVar = f0Var.f7086c;
        if (sVar == null) {
            sVar = k3.s.f9399f;
        }
        k3.o oVar = f0Var.f7087d;
        int i10 = oVar != null ? oVar.f9392a : 0;
        k3.p pVar = f0Var.f7088e;
        this.I = ((k3.k) iVar).b(jVar, sVar, i10, pVar != null ? pVar.f9393a : 65535);
        v2.n.n(this);
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        fi.k kVar = this.J;
        if (kVar == null) {
            a0.a.b("Min size state is not set.");
            throw new b3.e();
        }
        f1.j1 j1Var = (f1.j1) kVar.f6779g;
        k3.e0 e0Var = this.I;
        if (e0Var == null) {
            a0.a.b("Font resolution state is not set.");
            throw new b3.e();
        }
        Object value = e0Var.getValue();
        if (!fj.l.b(value, kVar.f6778f)) {
            kVar.f6778f = value;
            j1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) j1Var.getValue()).booleanValue()) {
            kVar.f6774b = e1.a((g3.n0) kVar.f6777e, (s3.c) kVar.f6775c, (k3.i) kVar.f6776d, e1.f9075a, 1);
            j1Var.setValue(Boolean.FALSE);
        }
        long j4 = kVar.f6774b;
        t2.f1 f1VarY = p0Var.Y(s3.b.e(j, s3.b.b((int) (j4 >> 32), 0, (int) (j4 & 4294967295L), 0, 10)));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new b0.l(f1VarY, 12));
    }
}
