package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f13996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f13997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(ej.c cVar, f1.a1 a1Var, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f13995a = i10;
        this.f13996b = cVar;
        this.f13997c = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f13995a) {
            case 0:
                return new f0(this.f13996b, this.f13997c, cVar, 0);
            default:
                return new f0(this.f13996b, this.f13997c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f13995a) {
            case 0:
                f0 f0Var = (f0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                f0Var.invokeSuspend(oVar);
                return oVar;
            default:
                f0 f0Var2 = (f0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                f0Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f13995a;
        pi.o oVar = pi.o.f13011a;
        f1.a1 a1Var = this.f13997c;
        ej.c cVar = this.f13996b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                if (cVar != null) {
                    c2.g gVar = (c2.g) a1Var.getValue();
                    cVar.invoke(gVar != null ? c2.e0.j(gVar) : null);
                    break;
                }
                break;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                if (((Number) a1Var.getValue()).intValue() != 1) {
                    cVar.invoke(ta.g.f16164a);
                    break;
                } else {
                    cVar.invoke(ta.h.f16165a);
                    break;
                }
        }
        return oVar;
    }
}
