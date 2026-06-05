package c2;

import t2.f1;
import v2.i1;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends v1.n implements v2.w, z1 {
    public ej.c H;

    public q(ej.c cVar) {
        this.H = cVar;
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new p(0, f1VarY, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.H + ')';
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        boolean z2;
        w0 w0Var;
        i1 i1VarV = v2.n.v(this, 2);
        if (i1VarV.Y) {
            w0 w0Var2 = i1VarV.W;
            z2 = i1VarV.X;
            w0Var = w0Var2;
        } else {
            t0 t0Var = e0.f2985a;
            if (t0Var == null) {
                e0.f2985a = new t0();
            } else {
                t0Var.f();
            }
            t0 t0Var2 = e0.f2985a;
            fj.l.c(t0Var2);
            t0Var2.L = i1VarV.H.R;
            t0Var2.K = cg.b.S(i1VarV.f15552c);
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            try {
                this.H.invoke(t0Var2);
                t1.r.n(gVarF, gVarK, cVarE);
                w0Var = t0Var2.H;
                z2 = t0Var2.I;
            } catch (Throwable th2) {
                t1.r.n(gVarF, gVarK, cVarE);
                throw th2;
            }
        }
        if (z2) {
            d3.x.e(zVar, w0Var);
        }
    }

    @Override // v2.z1
    public final boolean z() {
        return false;
    }
}
