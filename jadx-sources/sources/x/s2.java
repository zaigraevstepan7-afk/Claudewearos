package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19711a;

    /* renamed from: b, reason: collision with root package name */
    public int f19712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.f f19713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f19714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.w f19715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(ej.f fVar, r1 r1Var, p2.w wVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f19711a = i10;
        this.f19713c = fVar;
        this.f19714d = r1Var;
        this.f19715e = wVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19711a) {
            case 0:
                return new s2(this.f19713c, this.f19714d, this.f19715e, cVar, 0);
            default:
                return new s2(this.f19713c, this.f19714d, this.f19715e, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f19711a) {
        }
        return ((s2) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19711a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f19712b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    b2.b bVar = new b2.b(this.f19715e.f12762c);
                    this.f19712b = 1;
                    if (this.f19713c.c(this.f19714d, bVar, this) == aVar) {
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
                int i11 = this.f19712b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    b2.b bVar2 = new b2.b(this.f19715e.f12762c);
                    this.f19712b = 1;
                    if (this.f19713c.c(this.f19714d, bVar2, this) == aVar2) {
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
