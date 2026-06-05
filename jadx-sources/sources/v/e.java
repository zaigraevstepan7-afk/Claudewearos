package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17181a;

    /* renamed from: b, reason: collision with root package name */
    public int f17182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f17183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.m f17184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, z.m mVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f17181a = i10;
        this.f17183c = gVar;
        this.f17184d = mVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17181a) {
            case 0:
                return new e(this.f17183c, this.f17184d, cVar, 0);
            case 1:
                return new e(this.f17183c, this.f17184d, cVar, 1);
            case 2:
                return new e(this.f17183c, this.f17184d, cVar, 2);
            default:
                return new e(this.f17183c, this.f17184d, cVar, 3);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17181a) {
        }
        return ((e) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17181a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f17182b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    z.k kVar = this.f17183c.J;
                    if (kVar != null) {
                        z.l lVar = new z.l(this.f17184d);
                        this.f17182b = 1;
                        if (kVar.a(lVar, this) == aVar) {
                            return aVar;
                        }
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
                int i11 = this.f17182b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    z.k kVar2 = this.f17183c.J;
                    if (kVar2 != null) {
                        z.l lVar2 = new z.l(this.f17184d);
                        this.f17182b = 1;
                        if (kVar2.a(lVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f17182b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    z.k kVar3 = this.f17183c.J;
                    if (kVar3 != null) {
                        this.f17182b = 1;
                        if (kVar3.a(this.f17184d, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f17182b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    z.k kVar4 = this.f17183c.J;
                    if (kVar4 != null) {
                        z.n nVar = new z.n(this.f17184d);
                        this.f17182b = 1;
                        if (kVar4.a(nVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
