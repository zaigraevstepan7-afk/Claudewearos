package ya;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p2.a0;
import pi.o;
import ti.c;
import va.k;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20267a = new a();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(a0 a0Var, c cVar) {
        Object objE = w2.e(a0Var, new k(1, null), cVar);
        return objE == ui.a.f17085a ? objE : o.f13011a;
    }
}
