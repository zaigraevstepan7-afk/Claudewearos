package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11324a;

    /* renamed from: b, reason: collision with root package name */
    public int f11325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f11326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f11324a = i10;
        this.f11326c = zVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f11324a) {
            case 0:
                return new k(this.f11326c, cVar, 0);
            case 1:
                return new k(this.f11326c, cVar, 1);
            default:
                return new k(this.f11326c, cVar, 2);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11324a) {
        }
        return ((k) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f11324a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f11325b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f11325b = 1;
                    if (z.c(this.f11326c, this) == aVar) {
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
                int i11 = this.f11325b;
                pi.o oVar = pi.o.f13011a;
                z zVar = this.f11326c;
                if (i11 == 0) {
                    uk.c.R(obj);
                    a8.j jVar = zVar.f11414g;
                    this.f11325b = 1;
                    Object objK = ((qj.r) jVar.f216b).k(this);
                    if (objK != aVar2) {
                        objK = oVar;
                    }
                    if (objK == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        return oVar;
                    }
                    uk.c.R(obj);
                }
                tj.e eVarE = tj.i0.e(zVar.g().f11356c, -1);
                r rVar = new r(zVar, 0);
                this.f11325b = 2;
                if (eVarE.c(rVar, this) == aVar2) {
                    return aVar2;
                }
                return oVar;
            default:
                z zVar2 = this.f11326c;
                a0 a0Var = zVar2.f11413f;
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f11325b;
                try {
                    if (i12 == 0) {
                        uk.c.R(obj);
                        if (((p0) a0Var.f11268a.getValue()) instanceof j0) {
                            return (p0) a0Var.f11268a.getValue();
                        }
                        this.f11325b = 1;
                        if (z.d(zVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uk.c.R(obj);
                            return (p0) obj;
                        }
                        uk.c.R(obj);
                    }
                    this.f11325b = 2;
                    obj = z.e(zVar2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (p0) obj;
                } catch (Throwable th2) {
                    return new k0(th2, -1);
                }
        }
    }
}
