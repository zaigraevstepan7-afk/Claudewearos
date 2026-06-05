package gb;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.a1;
import p2.a0;
import qj.b0;
import x.v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.d f7356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7358c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hb.h f7359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.c f7360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.a f7361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f7362g;

    public u(kj.d dVar, int i10, boolean z2, hb.h hVar, ej.c cVar, ej.a aVar, a1 a1Var) {
        this.f7356a = dVar;
        this.f7357b = i10;
        this.f7358c = z2;
        this.f7359d = hVar;
        this.f7360e = cVar;
        this.f7361f = aVar;
        this.f7362g = a1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(a0 a0Var, ti.c cVar) {
        final kj.d dVar = this.f7356a;
        final int i10 = this.f7357b;
        final boolean z2 = this.f7358c;
        final hb.h hVar = this.f7359d;
        final ej.c cVar2 = this.f7360e;
        final ej.a aVar = this.f7361f;
        final a1 a1Var = this.f7362g;
        Object objD = v2.d(a0Var, null, null, new ej.c() { // from class: gb.t
            @Override // ej.c
            public final Object invoke(Object obj) {
                kj.d dVar2 = dVar;
                float f10 = dVar2.f9664b;
                float f11 = dVar2.f9663a;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (((b2.b) obj).f1500a >> 32)) / i10) * (f10 - f11);
                float fFloatValue = ((Number) cg.b.r(Float.valueOf(z2 ? f11 + fIntBitsToFloat : f10 - fIntBitsToFloat), dVar2)).floatValue();
                a1Var.setValue(Float.valueOf(fFloatValue));
                hb.h hVar2 = hVar;
                b0.w(hVar2.f7797a, null, new b1.h(hVar2, fFloatValue, null), 3);
                cVar2.invoke(Float.valueOf(fFloatValue));
                ej.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return pi.o.f13011a;
            }
        }, cVar, 7);
        return objD == ui.a.f17085a ? objD : pi.o.f13011a;
    }
}
