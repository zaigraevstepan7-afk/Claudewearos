package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public int f11281a;

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new e(1, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        e eVar = (e) create((ti.c) obj);
        pi.o oVar = pi.o.f13011a;
        eVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f11281a;
        if (i10 == 0) {
            uk.c.R(obj);
            this.f11281a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uk.c.R(obj);
        return pi.o.f13011a;
    }
}
