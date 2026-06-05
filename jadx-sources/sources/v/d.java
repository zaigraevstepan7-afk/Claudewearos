package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17159a;

    /* renamed from: b, reason: collision with root package name */
    public int f17160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z.k f17161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.m f17162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f17163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(z.k kVar, z.m mVar, g gVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17159a = i10;
        this.f17161c = kVar;
        this.f17162d = mVar;
        this.f17163e = gVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17159a) {
            case 0:
                return new d(this.f17161c, this.f17162d, this.f17163e, cVar, 0);
            default:
                return new d(this.f17161c, this.f17162d, this.f17163e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17159a) {
        }
        return ((d) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17159a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17160b;
                z.m mVar = this.f17162d;
                if (i10 == 0) {
                    uk.c.R(obj);
                    long j = y.f17332a;
                    this.f17160b = 1;
                    if (qj.b0.i(j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        this.f17163e.Z = mVar;
                        return pi.o.f13011a;
                    }
                    uk.c.R(obj);
                }
                this.f17160b = 2;
                if (this.f17161c.a(mVar, this) == aVar) {
                    return aVar;
                }
                this.f17163e.Z = mVar;
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f17160b;
                z.m mVar2 = this.f17162d;
                if (i11 == 0) {
                    uk.c.R(obj);
                    long j4 = y.f17332a;
                    this.f17160b = 1;
                    if (qj.b0.i(j4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        this.f17163e.V = mVar2;
                        return pi.o.f13011a;
                    }
                    uk.c.R(obj);
                }
                this.f17160b = 2;
                if (this.f17161c.a(mVar2, this) == aVar2) {
                    return aVar2;
                }
                this.f17163e.V = mVar2;
                return pi.o.f13011a;
        }
    }
}
