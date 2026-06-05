package y1;

import fj.l;
import u1.p;
import v1.n;
import v2.e2;
import v2.v;
import w8.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends n implements e2, v {
    public e H;
    public e I;
    public long J;

    @Override // v2.e2
    public final Object D() {
        return d.f20160a;
    }

    @Override // v2.v, v2.w0
    public final void f(long j) {
        this.J = j;
    }

    @Override // v1.n
    public final void j1() {
        this.I = null;
        this.H = null;
    }

    public final boolean q1(h hVar) {
        e eVar = this.H;
        if (eVar != null) {
            return eVar.q1(hVar);
        }
        e eVar2 = this.I;
        if (eVar2 != null) {
            return eVar2.q1(hVar);
        }
        return false;
    }

    public final void r1(h hVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.r1(hVar);
            return;
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.r1(hVar);
        }
    }

    public final void s1(h hVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.s1(hVar);
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.s1(hVar);
        }
        this.H = null;
    }

    public final void t1(h hVar) {
        e2 e2Var;
        e eVar;
        e eVar2 = this.H;
        if (eVar2 == null || !p.c(eVar2, u2.b.k(hVar))) {
            if (this.f17565a.G) {
                fj.v vVar = new fj.v();
                v2.n.E(this, new a2.n(vVar, this, hVar, 6));
                e2Var = (e2) vVar.f6807a;
            } else {
                e2Var = null;
            }
            eVar = (e) e2Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.r1(hVar);
            eVar.t1(hVar);
            e eVar3 = this.I;
            if (eVar3 != null) {
                eVar3.s1(hVar);
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.I;
            if (eVar4 != null) {
                eVar4.r1(hVar);
                eVar4.t1(hVar);
            }
            eVar2.s1(hVar);
        } else if (!l.b(eVar, eVar2)) {
            if (eVar != null) {
                eVar.r1(hVar);
                eVar.t1(hVar);
            }
            if (eVar2 != null) {
                eVar2.s1(hVar);
            }
        } else if (eVar != null) {
            eVar.t1(hVar);
        } else {
            e eVar5 = this.I;
            if (eVar5 != null) {
                eVar5.t1(hVar);
            }
        }
        this.H = eVar;
    }

    public final void u1(h hVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.u1(hVar);
            return;
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.u1(hVar);
        }
    }
}
