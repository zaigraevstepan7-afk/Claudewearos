package d1;

import t2.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends v1.n implements v2.w {
    public q H;
    public ej.e I;
    public o1 J;
    public boolean K;

    @Override // v1.n
    public final void j1() {
        this.K = false;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        f1 f1VarY = p0Var.Y(j);
        if (!s0Var.t0() || !this.K) {
            pi.h hVar = (pi.h) this.I.invoke(new s3.l((f1VarY.f15551b & 4294967295L) | (f1VarY.f15550a << 32)), new s3.a(j));
            q qVar = this.H;
            o0 o0Var = (o0) hVar.f13000a;
            Object obj = hVar.f13001b;
            if (!fj.l.b(qVar.d(), o0Var)) {
                qVar.f4565m.setValue(o0Var);
                yj.c cVar = qVar.f4558e.f4545b;
                boolean zG = cVar.g();
                if (zG) {
                    try {
                        n nVar = qVar.f4566n;
                        float fD = qVar.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            n.a(nVar, fD);
                            qVar.h(null);
                        }
                        qVar.g(obj);
                    } finally {
                        cVar.e(null);
                    }
                }
                if (!zG) {
                    qVar.h(obj);
                }
            }
        }
        this.K = s0Var.t0() || this.K;
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new ab.m(s0Var, this, f1VarY, 5));
    }
}
