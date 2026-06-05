package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r6 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x6 f2649a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(x6 x6Var, ti.c cVar) {
        super(3, cVar);
        this.f2649a = x6Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        r6 r6Var = new r6(this.f2649a, (ti.c) obj3);
        pi.o oVar = pi.o.f13011a;
        r6Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        this.f2649a.f2881m.a();
        return pi.o.f13011a;
    }
}
