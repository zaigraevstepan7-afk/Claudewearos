package c1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u3 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f2740b;

    public /* synthetic */ u3(int i10, ej.a aVar) {
        this.f2739a = i10;
        this.f2740b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        switch (this.f2739a) {
            case 0:
                Object objD = x.v2.d(a0Var, null, null, new l(2, this.f2740b), cVar, 7);
                if (objD != ui.a.f17085a) {
                    break;
                }
                break;
            default:
                Object objD2 = x.v2.d(a0Var, new l(7, this.f2740b), null, null, cVar, 13);
                if (objD2 != ui.a.f17085a) {
                    break;
                }
                break;
        }
        return pi.o.f13011a;
    }
}
