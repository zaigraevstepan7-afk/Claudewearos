package sa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f14832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z2, boolean z10, ej.c cVar, ti.c cVar2) {
        super(2, cVar2);
        this.f14830a = z2;
        this.f14831b = z10;
        this.f14832c = cVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new d0(this.f14830a, this.f14831b, this.f14832c, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((qj.z) obj, (ti.c) obj2);
        pi.o oVar = pi.o.f13011a;
        d0Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        if (this.f14830a && this.f14831b) {
            this.f14832c.invoke(Boolean.FALSE);
        }
        return pi.o.f13011a;
    }
}
