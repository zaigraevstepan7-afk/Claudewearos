package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f15171a;

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        g0 g0Var = new g0(2, cVar);
        g0Var.f15171a = ((Number) obj).floatValue();
        return g0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create(Float.valueOf(((Number) obj).floatValue()), (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        return Boolean.valueOf(this.f15171a > 0.0f);
    }
}
