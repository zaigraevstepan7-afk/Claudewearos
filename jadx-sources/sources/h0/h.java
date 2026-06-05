package h0;

import a2.d0;
import c1.r3;
import pi.o;
import qj.b0;
import t2.w;
import v1.n;
import v2.i1;
import v2.v;
import x.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends n implements a3.a, v {
    public i H;
    public boolean I;

    public static final b2.c q1(h hVar, i1 i1Var, d0 d0Var) {
        b2.c cVar;
        if (hVar.G && hVar.I) {
            i1 i1VarX = v2.n.x(hVar);
            if (!i1Var.w1().G) {
                i1Var = null;
            }
            if (i1Var != null && (cVar = (b2.c) d0Var.a()) != null) {
                return cVar.i(i1VarX.z(i1Var, false).d());
            }
        }
        return null;
    }

    @Override // a3.a
    public final Object d1(i1 i1Var, d0 d0Var, vi.c cVar) {
        Object objH = b0.h(new g(this, i1Var, d0Var, new r3(this, i1Var, d0Var, 5), null), cVar);
        return objH == ui.a.f17085a ? objH : o.f13011a;
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v2.v
    public final void o0(w wVar) {
        this.I = true;
    }
}
