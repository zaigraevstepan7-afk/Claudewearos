package nb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12072a;

    /* renamed from: b, reason: collision with root package name */
    public int f12073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, ti.c cVar, int i11) {
        super(i10, cVar);
        this.f12072a = i11;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f12072a) {
            case 0:
                return new u(2, cVar, 0);
            default:
                u uVar = new u(2, cVar, 1);
                uVar.f12073b = ((Number) obj).intValue();
                return uVar;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12072a) {
            case 0:
                return ((u) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((u) create(Integer.valueOf(((Number) obj).intValue()), (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f12072a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f12073b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    o oVar = o.f12026a;
                    this.f12073b = 1;
                    if (oVar.f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                return Boolean.valueOf(this.f12073b > 0);
        }
    }
}
