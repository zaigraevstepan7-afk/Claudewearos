package ra;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f14070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(r0 r0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f14069a = i10;
        this.f14070b = r0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14069a) {
            case 0:
                return new l0(this.f14070b, cVar, 0);
            case 1:
                return new l0(this.f14070b, cVar, 1);
            case 2:
                return new l0(this.f14070b, cVar, 2);
            case 3:
                return new l0(this.f14070b, cVar, 3);
            default:
                return new l0(this.f14070b, cVar, 4);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14069a) {
            case 0:
                l0 l0Var = (l0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                l0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                l0 l0Var2 = (l0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                l0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                l0 l0Var3 = (l0) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                l0Var3.invokeSuspend(oVar3);
                return oVar3;
            case 3:
                l0 l0Var4 = (l0) create(zVar, cVar);
                pi.o oVar4 = pi.o.f13011a;
                l0Var4.invokeSuspend(oVar4);
                return oVar4;
            default:
                l0 l0Var5 = (l0) create(zVar, cVar);
                pi.o oVar5 = pi.o.f13011a;
                l0Var5.invokeSuspend(oVar5);
                return oVar5;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f14069a;
        ib.h hVar = ib.h.f8432a;
        pi.o oVar = pi.o.f13011a;
        r0 r0Var = this.f14070b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                LinkedHashMap linkedHashMap = r0Var.B;
                int i11 = (int) (r0Var.f14149f.getResources().getDisplayMetrics().density * 96);
                for (ja.j jVar : r0Var.A.values()) {
                    if (linkedHashMap.get(jVar.f8784a) == null) {
                        linkedHashMap.put(jVar.f8784a, va.a.d(qi.s.f13520a, i11, ((Number) r0Var.f14167y.getValue()).floatValue(), ((Number) r0Var.f14168z.getValue()).floatValue()));
                    }
                }
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                r0Var.j(false);
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                r0.e(r0Var, hVar);
                r0Var.n(new la.a(28));
                break;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                r0.e(r0Var, hVar);
                r0Var.n(new la.a(29));
                break;
            default:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                r0.e(r0Var, hVar);
                r0Var.n(new p0(0));
                break;
        }
        return oVar;
    }
}
