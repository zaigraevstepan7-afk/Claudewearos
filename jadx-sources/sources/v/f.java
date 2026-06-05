package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f17187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17186a = i10;
        this.f17187b = gVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17186a) {
            case 0:
                return new f(this.f17187b, cVar, 0);
            default:
                return new f(this.f17187b, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17186a) {
            case 0:
                f fVar = (f) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                fVar.invokeSuspend(oVar);
                return oVar;
            default:
                f fVar2 = (f) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                fVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f17186a;
        pi.o oVar = pi.o.f13011a;
        ti.c cVar = null;
        g gVar = this.f17187b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                if (gVar.W == null) {
                    z.h hVar = new z.h();
                    z.k kVar = gVar.J;
                    if (kVar != null) {
                        qj.b0.w(gVar.e1(), null, new t0.f(kVar, hVar, cVar, 5), 3);
                    }
                    gVar.W = hVar;
                    break;
                }
                break;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                z.h hVar2 = gVar.W;
                if (hVar2 != null) {
                    z.i iVar = new z.i(hVar2);
                    z.k kVar2 = gVar.J;
                    if (kVar2 != null) {
                        qj.b0.w(gVar.e1(), null, new t0.f(kVar2, iVar, cVar, 6), 3);
                    }
                    gVar.W = null;
                    break;
                }
                break;
        }
        return oVar;
    }
}
