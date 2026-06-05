package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19676a;

    /* renamed from: b, reason: collision with root package name */
    public int f19677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f19678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(r1 r1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f19676a = i10;
        this.f19678c = r1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19676a) {
            case 0:
                return new p2(this.f19678c, cVar, 0);
            default:
                return new p2(this.f19678c, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f19676a) {
        }
        return ((p2) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19676a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f19677b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f19677b = 1;
                    if (this.f19678c.r(this) == aVar) {
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
                int i11 = this.f19677b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f19677b = 1;
                    if (this.f19678c.r(this) == aVar2) {
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
