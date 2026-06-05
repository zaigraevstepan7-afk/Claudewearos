package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18416a;

    /* renamed from: b, reason: collision with root package name */
    public int f18417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f18418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(u2 u2Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f18416a = i10;
        this.f18418c = u2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f18416a) {
            case 0:
                return new t2(this.f18418c, cVar, 0);
            default:
                return new t2(this.f18418c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f18416a) {
        }
        return ((t2) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f18416a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f18417b;
                pi.o oVar = pi.o.f13011a;
                if (i10 == 0) {
                    uk.c.R(obj);
                    t tVar = this.f18418c.f18431a;
                    this.f18417b = 1;
                    Object objL = tVar.S.l(this);
                    if (objL != aVar) {
                        objL = oVar;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f18417b;
                pi.o oVar2 = pi.o.f13011a;
                if (i11 == 0) {
                    uk.c.R(obj);
                    t tVar2 = this.f18418c.f18431a;
                    this.f18417b = 1;
                    Object objA = tVar2.T.a(this);
                    if (objA != aVar2) {
                        objA = oVar2;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return oVar2;
        }
    }
}
