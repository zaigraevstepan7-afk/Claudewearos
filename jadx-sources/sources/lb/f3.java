package lb;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f3 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f10288b;

    public /* synthetic */ f3(ej.c cVar, int i10) {
        this.f10287a = i10;
        this.f10288b = cVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        switch (this.f10287a) {
            case 0:
                ej.c cVar2 = this.f10288b;
                Object objE = x.g0.e(a0Var, new k0.t1(6, a0Var, cVar2), new s1.g(19), new s1.g(19), new ab.g(14, a0Var, cVar2), cVar);
                if (objE != ui.a.f17085a) {
                    break;
                }
                break;
            case 1:
                Object objQ1 = ((p2.p0) a0Var).q1(new ra.c0(this.f10288b, null), cVar);
                if (objQ1 != ui.a.f17085a) {
                    break;
                }
                break;
            default:
                Object objD = x.v2.d(a0Var, new ab.n(this.f10288b, 16), null, null, cVar, 13);
                if (objD != ui.a.f17085a) {
                    break;
                }
                break;
        }
        return pi.o.f13011a;
    }
}
