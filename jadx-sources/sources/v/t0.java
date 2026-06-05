package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17286a;

    /* renamed from: b, reason: collision with root package name */
    public int f17287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f17288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17286a = i10;
        this.f17288c = u0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17286a) {
            case 0:
                return new t0(this.f17288c, cVar, 0);
            default:
                return new t0(this.f17288c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17286a) {
        }
        return ((t0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17286a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17287b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f17287b = 1;
                    if (u0.q1(this.f17288c, this) == aVar) {
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
                int i11 = this.f17287b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f17287b = 1;
                    if (u0.r1(this.f17288c, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
