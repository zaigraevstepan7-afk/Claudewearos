package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o3 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f2516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f2517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(ej.c cVar, ti.c cVar2) {
        super(3, cVar2);
        this.f2517b = cVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        o3 o3Var = new o3(this.f2517b, (ti.c) obj3);
        o3Var.f2516a = fFloatValue;
        pi.o oVar = pi.o.f13011a;
        o3Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        this.f2517b.invoke(new Float(this.f2516a));
        return pi.o.f13011a;
    }
}
