package c1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u6 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2749b;

    public /* synthetic */ u6(Object obj, int i10) {
        this.f2748a = i10;
        this.f2749b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        switch (this.f2748a) {
            case 0:
                x6 x6Var = (x6) this.f2749b;
                Object objD = x.v2.d(a0Var, null, new t6(x6Var, null), new k6(x6Var, 2), cVar, 3);
                return objD == ui.a.f17085a ? objD : pi.o.f13011a;
            case 1:
                Object objH = qj.b0.h(new androidx.lifecycle.h0(a0Var, (g0.h0) this.f2749b, null, 7), cVar);
                return objH == ui.a.f17085a ? objH : pi.o.f13011a;
            case 2:
                hb.h hVar = (hb.h) this.f2749b;
                Object objE = x.w2.e(a0Var, new hb.i(new gb.h(hVar, 4), new ab.g(11, hVar, a0Var), new gb.b(hVar, 7), new gb.h(hVar, 5), null), cVar);
                ui.a aVar = ui.a.f17085a;
                pi.o oVar = pi.o.f13011a;
                if (objE != aVar) {
                    objE = oVar;
                }
                return objE == aVar ? objE : oVar;
            case 3:
                hb.n nVar = (hb.n) this.f2749b;
                Object objE2 = x.w2.e(a0Var, new hb.i(new hb.k(nVar, 1), new b0.g2(nVar, 13), new a7.e(nVar, 12), new hb.k(nVar, 2), null), cVar);
                ui.a aVar2 = ui.a.f17085a;
                pi.o oVar2 = pi.o.f13011a;
                if (objE2 != aVar2) {
                    objE2 = oVar2;
                }
                return objE2 == aVar2 ? objE2 : oVar2;
            case 4:
                v0.u0 u0Var = (v0.u0) this.f2749b;
                p2.h hVar2 = u0Var.f17510z;
                v0.s0 s0Var = u0Var.f17509y;
                p2.p0 p0Var = (p2.p0) a0Var;
                p0Var.getClass();
                Object objE3 = x.w2.e(a0Var, new d1.a0(new ak.x(v2.n.y(p0Var).T), hVar2, s0Var, null), cVar);
                if (objE3 != ui.a.f17085a) {
                    objE3 = pi.o.f13011a;
                }
                return objE3 == ui.a.f17085a ? objE3 : pi.o.f13011a;
            case 5:
                Object objE4 = x.w2.e(a0Var, new d1.v(new k0.h1(1, (q0.g) this.f2749b, q0.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 1), null, 1), cVar);
                ui.a aVar3 = ui.a.f17085a;
                pi.o oVar3 = pi.o.f13011a;
                if (objE4 != aVar3) {
                    objE4 = oVar3;
                }
                return objE4 == aVar3 ? objE4 : oVar3;
            case 6:
                Object objE5 = x.w2.e(a0Var, new d1.a0((s0.c) this.f2749b, (ti.c) null, 3), cVar);
                return objE5 == ui.a.f17085a ? objE5 : pi.o.f13011a;
            case 7:
                Object objE6 = x.w2.e(a0Var, new d1.v((v.i) this.f2749b, null, 2), cVar);
                return objE6 == ui.a.f17085a ? objE6 : pi.o.f13011a;
            case 8:
                Object objQ1 = ((p2.p0) a0Var).q1(new d1.v((k0.z) this.f2749b, null, 3), cVar);
                return objQ1 == ui.a.f17085a ? objQ1 : pi.o.f13011a;
            default:
                Object objH2 = qj.b0.h(new ab.p(a0Var, (k0.b1) this.f2749b, null, 2), cVar);
                ui.a aVar4 = ui.a.f17085a;
                pi.o oVar4 = pi.o.f13011a;
                if (objH2 != aVar4) {
                    objH2 = oVar4;
                }
                return objH2 == aVar4 ? objH2 : oVar4;
        }
    }
}
