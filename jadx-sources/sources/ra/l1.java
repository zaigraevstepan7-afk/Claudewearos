package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14071a;

    /* renamed from: b, reason: collision with root package name */
    public int f14072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f14073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f14074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(t.c cVar, n1 n1Var, long j, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f14071a = i10;
        this.f14073c = cVar;
        this.f14074d = n1Var;
        this.f14075e = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f14071a) {
            case 0:
                return new l1(this.f14073c, this.f14074d, this.f14075e, cVar, 0);
            default:
                return new l1(this.f14073c, this.f14074d, this.f14075e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f14071a) {
        }
        return ((l1) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14071a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f14072b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    Float f10 = new Float(n1.a(this.f14074d, this.f14075e));
                    this.f14072b = 1;
                    if (this.f14073c.f(f10, this) == aVar) {
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
                int i11 = this.f14072b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    Float f11 = new Float(n1.a(this.f14074d, this.f14075e));
                    this.f14072b = 1;
                    if (this.f14073c.f(f11, this) == aVar2) {
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
