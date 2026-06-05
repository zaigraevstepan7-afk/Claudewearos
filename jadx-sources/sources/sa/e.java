package sa;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.f1;
import f1.g1;
import java.util.List;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f14834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f14835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f14836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f14837e;

    public e(List list, ej.c cVar, g1 g1Var, f1 f1Var, f1 f1Var2) {
        this.f14833a = list;
        this.f14834b = cVar;
        this.f14835c = g1Var;
        this.f14836d = f1Var;
        this.f14837e = f1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        Object objE = w2.e(a0Var, new d(this.f14833a, this.f14834b, this.f14835c, this.f14836d, this.f14837e, null, 0), cVar);
        return objE == ui.a.f17085a ? objE : pi.o.f13011a;
    }
}
