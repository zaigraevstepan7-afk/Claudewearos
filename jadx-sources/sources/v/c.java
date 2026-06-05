package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17150a;

    /* renamed from: b, reason: collision with root package name */
    public int f17151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z.k f17152c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.m f17153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z.k kVar, z.m mVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17150a = i10;
        this.f17152c = kVar;
        this.f17153d = mVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17150a) {
            case 0:
                return new c(this.f17153d, this.f17152c, cVar);
            case 1:
                return new c(this.f17152c, this.f17153d, cVar, 1);
            default:
                return new c(this.f17152c, this.f17153d, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17150a) {
        }
        return ((c) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17150a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17151b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    z.n nVar = new z.n(this.f17153d);
                    this.f17151b = 1;
                    if (this.f17152c.a(nVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f17151b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f17151b = 1;
                    if (this.f17152c.a(this.f17153d, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f17151b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f17151b = 1;
                    if (this.f17152c.a(this.f17153d, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z.m mVar, z.k kVar, ti.c cVar) {
        super(2, cVar);
        this.f17150a = 0;
        this.f17153d = mVar;
        this.f17152c = kVar;
    }
}
