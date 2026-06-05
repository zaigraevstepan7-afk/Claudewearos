package d1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c1.j8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8 f4615b;

    public /* synthetic */ z(j8 j8Var, int i10) {
        this.f4614a = i10;
        this.f4615b = j8Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        switch (this.f4614a) {
            case 0:
                Object objH = qj.b0.h(new y(a0Var, this.f4615b, null, 0), cVar);
                if (objH != ui.a.f17085a) {
                    break;
                }
                break;
            default:
                Object objH2 = qj.b0.h(new y(a0Var, this.f4615b, null, 1), cVar);
                if (objH2 != ui.a.f17085a) {
                    break;
                }
                break;
        }
        return pi.o.f13011a;
    }
}
