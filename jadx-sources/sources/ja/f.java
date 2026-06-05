package ja;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8771b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f8770a = i10;
        this.f8771b = hVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f8770a) {
            case 0:
                return new f(this.f8771b, cVar, 0);
            default:
                return new f(this.f8771b, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        pi.o oVar = (pi.o) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f8770a) {
            case 0:
                f fVar = (f) create(oVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                fVar.invokeSuspend(oVar2);
                return oVar2;
            default:
                f fVar2 = (f) create(oVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                fVar2.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8770a;
        pi.o oVar = pi.o.f13011a;
        h hVar = this.f8771b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                hVar.b();
                break;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                hVar.b();
                break;
        }
        return oVar;
    }
}
