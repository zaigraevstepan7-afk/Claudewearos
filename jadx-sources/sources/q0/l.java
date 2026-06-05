package q0;

import c1.i8;
import f1.s;
import f1.y;
import k0.v;
import qj.s1;
import t2.w;
import v0.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends v2.k implements v2.i, r0.e {
    public t0.j J;
    public i8 K;
    public n0 L;
    public v M;
    public s1 N;
    public final y O = s.q(new k(this, 0));
    public b2.c P = b2.c.f1501e;

    public l(t0.j jVar, i8 i8Var, n0 n0Var, v vVar) {
        this.J = jVar;
        this.K = i8Var;
        this.L = n0Var;
        this.M = vVar;
    }

    @Override // r0.e
    public final n0.c i0() {
        return (n0.c) this.O.getValue();
    }

    @Override // v1.n
    public final void i1() {
        t0.j jVar = this.J;
        jVar.f15364c = m.f13172c;
        jVar.f15363b = this;
    }

    @Override // v1.n
    public final void j1() {
        t0.j jVar = this.J;
        jVar.f15364c = m.f13171b;
        jVar.f15363b = null;
    }

    @Override // r0.e
    public final long q0(w wVar) {
        return x0(wVar).d();
    }

    @Override // r0.e
    public final b2.c x0(w wVar) {
        if (!this.G) {
            return this.P;
        }
        b2.c cVar = (b2.c) this.M.invoke(wVar);
        if (cVar == null) {
            return this.P;
        }
        this.P = cVar;
        return cVar;
    }
}
