package ya;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.f1;
import p2.a0;
import pi.o;
import ti.c;
import uj.r;
import v0.y0;
import x.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f20268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f20269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f20270c;

    public b(boolean z2, ej.a aVar, f1 f1Var) {
        this.f20268a = z2;
        this.f20269b = aVar;
        this.f20270c = f1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(a0 a0Var, c cVar) {
        if (!this.f20268a) {
            ej.a aVar = this.f20269b;
            f1 f1Var = this.f20270c;
            Object objF = g0.f(a0Var, new y0(aVar, f1Var), null, new r(f1Var, 4), cVar, 5);
            if (objF == ui.a.f17085a) {
                return objF;
            }
        }
        return o.f13011a;
    }
}
