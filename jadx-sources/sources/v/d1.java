package v;

import android.view.View;
import c1.z2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 extends v1.n implements v2.o, v2.m, v2.z1, v2.m1 {
    public c1.l H;
    public ta.t I;
    public o1 J;
    public View K;
    public s3.c L;
    public n1 M;
    public f1.y O;
    public s3.l Q;
    public sj.c R;
    public final f1.j1 N = new f1.j1(null, f1.f.f6290d);
    public long P = 9205357640488583168L;

    public d1(c1.l lVar, ta.t tVar, o1 o1Var) {
        this.H = lVar;
        this.I = tVar;
        this.J = o1Var;
    }

    @Override // v2.m1
    public final void F0() {
        v2.n.t(this, new c1(this, 0));
    }

    @Override // v2.o
    public final void N0(v2.i1 i1Var) {
        this.N.setValue(i1Var);
    }

    @Override // v2.m
    public final void O0(v2.h0 h0Var) {
        h0Var.f();
        sj.c cVar = this.R;
        if (cVar != null) {
            cVar.h(pi.o.f13011a);
        }
    }

    @Override // v1.n
    public final void i1() {
        F0();
        this.R = u6.v.a(0, 7, null);
        qj.z zVarE1 = e1();
        qj.a0 a0Var = qj.a0.f13538a;
        qj.b0.w(zVarE1, null, new z2(this, null, 15), 1);
    }

    @Override // v1.n
    public final void j1() {
        n1 n1Var = this.M;
        if (n1Var != null) {
            ((p1) n1Var).b();
        }
        this.M = null;
    }

    public final long q1() {
        if (this.O == null) {
            this.O = f1.s.q(new c1(this, 2));
        }
        f1.y yVar = this.O;
        if (yVar != null) {
            return ((b2.b) yVar.getValue()).f1500a;
        }
        return 9205357640488583168L;
    }

    public final void r1() {
        n1 n1Var = this.M;
        if (n1Var != null) {
            ((p1) n1Var).b();
        }
        View viewA = this.K;
        if (viewA == null) {
            viewA = v2.n.A(this);
        }
        this.K = viewA;
        s3.c cVar = this.L;
        if (cVar == null) {
            cVar = v2.n.y(this).R;
        }
        this.L = cVar;
        this.M = this.J.b(viewA, cVar);
        t1();
    }

    public final void s1() {
        s3.c cVar = this.L;
        if (cVar == null) {
            cVar = v2.n.y(this).R;
            this.L = cVar;
        }
        long j = ((b2.b) this.H.invoke(cVar)).f1500a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & q1()) == 9205357640488583168L) {
            this.P = 9205357640488583168L;
            n1 n1Var = this.M;
            if (n1Var != null) {
                ((p1) n1Var).b();
                return;
            }
            return;
        }
        this.P = b2.b.f(q1(), j);
        if (this.M == null) {
            r1();
        }
        n1 n1Var2 = this.M;
        if (n1Var2 != null) {
            n1Var2.a(this.P, 9205357640488583168L);
        }
        t1();
    }

    public final void t1() {
        s3.c cVar;
        n1 n1Var = this.M;
        if (n1Var == null || (cVar = this.L) == null) {
            return;
        }
        p1 p1Var = (p1) n1Var;
        long jC = p1Var.c();
        s3.l lVar = this.Q;
        if (lVar != null && jC == lVar.f14751a) {
            return;
        }
        this.I.invoke(new s3.h(cVar.K(cg.b.S(p1Var.c()))));
        this.Q = new s3.l(p1Var.c());
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        zVar.b(e1.f17185a, new c1(this, 1));
    }
}
