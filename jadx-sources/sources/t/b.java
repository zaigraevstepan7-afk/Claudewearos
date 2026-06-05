package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, ti.c cVar2) {
        super(1, cVar2);
        this.f15099a = cVar;
        this.f15100b = obj;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new b(this.f15099a, this.f15100b, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        b bVar = (b) create((ti.c) obj);
        pi.o oVar = pi.o.f13011a;
        bVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        c cVar = this.f15099a;
        c.b(cVar);
        Object objA = c.a(cVar, this.f15100b);
        cVar.f15109c.f15211b.setValue(objA);
        cVar.f15111e.setValue(objA);
        return pi.o.f13011a;
    }
}
