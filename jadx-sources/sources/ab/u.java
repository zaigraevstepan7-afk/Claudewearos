package ab;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.a1;
import f1.t2;
import k0.l1;
import x.b3;
import x.g0;
import x.o0;
import x.r1;
import x.v2;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f350e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f346a = i10;
        this.f347b = obj;
        this.f348c = obj2;
        this.f349d = obj3;
        this.f350e = obj4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(p2.a0 a0Var, ti.c cVar) {
        int i10 = this.f346a;
        Object obj = this.f350e;
        Object obj2 = this.f349d;
        Object obj3 = this.f348c;
        Object obj4 = this.f347b;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                Object objE = w2.e(a0Var, new t((w) obj4, (s3.c) obj3, (ej.a) obj2, (a1) obj, null), cVar);
                return objE == ui.a.f17085a ? objE : oVar;
            case 1:
                Object objE2 = w2.e(a0Var, new b3(new fb.f((t.c) obj4, (t.c) obj3, (t.c) obj2, (qj.z) obj), null), cVar);
                ui.a aVar = ui.a.f17085a;
                if (objE2 != aVar) {
                    objE2 = oVar;
                }
                return objE2 == aVar ? objE2 : oVar;
            case 2:
                l1 l1Var = new l1((qj.z) obj4, (a1) obj, (z.k) obj3, null);
                i iVar = new i((a1) obj2, 9);
                o0 o0Var = v2.f19742a;
                Object objH = qj.b0.h(new b6.c(a0Var, l1Var, iVar, new r1(a0Var), null, 16), cVar);
                ui.a aVar2 = ui.a.f17085a;
                if (objH != aVar2) {
                    objH = oVar;
                }
                return objH == aVar2 ? objH : oVar;
            default:
                if (!((mb.b) obj4).f11440c) {
                    return oVar;
                }
                c1.l lVar = new c1.l(6, (ej.a) obj3);
                ej.a aVar3 = (ej.a) obj2;
                t2 t2Var = new t2((ej.c) obj, 2);
                float f10 = g0.f19530a;
                Object objE3 = w2.e(a0Var, new sa.d(lVar, t2Var, aVar3, aVar3, null, 2), cVar);
                ui.a aVar4 = ui.a.f17085a;
                if (objE3 != aVar4) {
                    objE3 = oVar;
                }
                return objE3 == aVar4 ? objE3 : oVar;
        }
    }

    public u(mb.b bVar, ej.a aVar, ej.a aVar2, ej.c cVar) {
        this.f346a = 3;
        this.f347b = bVar;
        this.f349d = aVar;
        this.f348c = aVar2;
        this.f350e = cVar;
    }

    public u(qj.z zVar, a1 a1Var, z.k kVar, a1 a1Var2) {
        this.f346a = 2;
        this.f347b = zVar;
        this.f350e = a1Var;
        this.f348c = kVar;
        this.f349d = a1Var2;
    }
}
