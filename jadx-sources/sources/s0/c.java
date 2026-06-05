package s0;

import a2.b0;
import a2.g;
import a2.y;
import c1.u6;
import p2.k0;
import p2.n;
import p2.o;
import p2.p0;
import v2.c2;
import v2.d1;
import v2.k;
import v2.l;
import v2.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends k implements w1, g, y {
    public ej.a J;
    public boolean K;
    public final p0 L;

    public c(ej.a aVar) {
        this.J = aVar;
        u6 u6Var = new u6(this, 6);
        n nVar = k0.f12716a;
        p0 p0Var = new p0(null, null, u6Var);
        q1(p0Var);
        this.L = p0Var;
    }

    @Override // a2.g
    public final void E(b0 b0Var) {
        this.K = b0Var.a();
    }

    @Override // v2.w1
    public final long G() {
        l lVar = b.f14712a;
        s3.c cVar = v2.n.y(this).R;
        lVar.getClass();
        int i10 = c2.f17594b;
        return d1.h(cVar.I0(lVar.f17713a), cVar.I0(lVar.f17714b), cVar.I0(lVar.f17715c), cVar.I0(lVar.f17716d));
    }

    @Override // v2.w1
    public final void V() {
        this.L.V();
    }

    @Override // v2.w1
    public final void a0(n nVar, o oVar, long j) {
        this.L.a0(nVar, oVar, j);
    }
}
