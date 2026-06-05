package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19488a;

    /* renamed from: b, reason: collision with root package name */
    public int f19489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f19490c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f19491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(e2 e2Var, long j, ti.c cVar, int i10) {
        super(2, cVar);
        this.f19488a = i10;
        this.f19490c = e2Var;
        this.f19491d = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19488a) {
            case 0:
                return new d2(this.f19490c, this.f19491d, cVar, 0);
            case 1:
                return new d2(this.f19490c, this.f19491d, cVar, 1);
            case 2:
                return new d2(this.f19490c, this.f19491d, cVar, 2);
            default:
                d2 d2Var = new d2(this.f19490c, cVar);
                d2Var.f19491d = ((b2.b) obj).f1500a;
                return d2Var;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19488a) {
            case 0:
                return ((d2) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((d2) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((d2) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                long j = ((b2.b) obj).f1500a;
                d2 d2Var = new d2(this.f19490c, (ti.c) obj2);
                d2Var.f19491d = j;
                return d2Var.invokeSuspend(pi.o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19488a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f19489b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    l2 l2Var = this.f19490c.f19509g0;
                    v.f1 f1Var = v.f1.f17190b;
                    c2 c2Var = new c2(this.f19491d, null);
                    this.f19489b = 1;
                    if (l2Var.f(f1Var, c2Var, this) == aVar) {
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
                int i11 = this.f19489b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    l2 l2Var2 = this.f19490c.f19509g0;
                    long j = this.f19491d;
                    this.f19489b = 1;
                    if (l2Var2.b(j, false, this) == aVar2) {
                        return aVar2;
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
                int i12 = this.f19489b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    l2 l2Var3 = this.f19490c.f19509g0;
                    long j4 = this.f19491d;
                    this.f19489b = 1;
                    if (l2Var3.b(j4, true, this) == aVar3) {
                        return aVar3;
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
                int i13 = this.f19489b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                    return obj;
                }
                uk.c.R(obj);
                long j10 = this.f19491d;
                l2 l2Var4 = this.f19490c.f19509g0;
                this.f19489b = 1;
                Object objA = y1.a(l2Var4, j10, this);
                return objA == aVar4 ? aVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, ti.c cVar) {
        super(2, cVar);
        this.f19488a = 3;
        this.f19490c = e2Var;
    }
}
