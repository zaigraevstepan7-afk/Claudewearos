package k0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f9116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.u0 f9117b;

    public h0(b1 b1Var, v0.u0 u0Var) {
        this.f9116a = b1Var;
        this.f9117b = u0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        Object objH = qj.b0.h(new g0(a0Var, this.f9116a, this.f9117b, null, 0), cVar);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }
}
