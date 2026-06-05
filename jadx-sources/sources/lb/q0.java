package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i10, f1.a1 a1Var, ti.c cVar) {
        super(2, cVar);
        this.f10583a = i10;
        this.f10584b = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f10583a) {
            case 0:
                return new q0(0, this.f10584b, cVar);
            case 1:
                return new q0(1, this.f10584b, cVar);
            case 2:
                return new q0(2, this.f10584b, cVar);
            default:
                return new q0(3, this.f10584b, cVar);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f10583a) {
            case 0:
                q0 q0Var = (q0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                q0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                q0 q0Var2 = (q0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                q0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                q0 q0Var3 = (q0) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                q0Var3.invokeSuspend(oVar3);
                return oVar3;
            default:
                q0 q0Var4 = (q0) create(zVar, cVar);
                pi.o oVar4 = pi.o.f13011a;
                q0Var4.invokeSuspend(oVar4);
                return oVar4;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10583a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.f10584b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                a1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                a1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                a1Var.setValue(Boolean.TRUE);
                break;
            default:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                j0.d dVar = ra.o1.f14113a;
                a1Var.setValue(Boolean.TRUE);
                break;
        }
        return oVar;
    }
}
