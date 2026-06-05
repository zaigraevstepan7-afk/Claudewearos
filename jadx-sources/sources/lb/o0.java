package lb;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.a f10534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10536c;

    public o0(ej.a aVar, f1.f1 f1Var, f1.f1 f1Var2) {
        this.f10534a = aVar;
        this.f10535b = f1Var;
        this.f10536c = f1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        ej.a aVar = this.f10534a;
        f1.f1 f1Var = this.f10535b;
        f1.f1 f1Var2 = this.f10536c;
        Object objF = x.g0.f(a0Var, new c1.r3(aVar, f1Var, f1Var2, 7), new fb.c(f1Var, 12), new ab.g(12, f1Var, f1Var2), cVar, 1);
        return objF == ui.a.f17085a ? objF : pi.o.f13011a;
    }
}
