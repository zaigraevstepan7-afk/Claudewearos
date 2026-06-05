package sa;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.a1;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f14862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qj.z f14863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f14864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.c f14865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f14866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f14867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f14868h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f14869i;
    public final /* synthetic */ float j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ej.c f14870k;

    public h0(boolean z2, ej.a aVar, qj.z zVar, a1 a1Var, t.c cVar, float f10, a1 a1Var2, float f11, boolean z10, float f12, ej.c cVar2) {
        this.f14861a = z2;
        this.f14862b = aVar;
        this.f14863c = zVar;
        this.f14864d = a1Var;
        this.f14865e = cVar;
        this.f14866f = f10;
        this.f14867g = a1Var2;
        this.f14868h = f11;
        this.f14869i = z10;
        this.j = f12;
        this.f14870k = cVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        boolean z2 = this.f14861a;
        pi.o oVar = pi.o.f13011a;
        if (!z2) {
            return oVar;
        }
        Object objE = w2.e(a0Var, new g0(this.f14862b, this.f14863c, this.f14864d, this.f14865e, this.f14866f, this.f14867g, this.f14868h, this.f14869i, this.j, this.f14870k, null), cVar);
        return objE == ui.a.f17085a ? objE : oVar;
    }
}
