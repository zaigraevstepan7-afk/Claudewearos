package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6414a;

    /* renamed from: b, reason: collision with root package name */
    public int f6415b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f6417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f6418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(ej.e eVar, a1 a1Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f6414a = i10;
        this.f6417d = eVar;
        this.f6418e = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f6414a) {
            case 0:
                p2 p2Var = new p2(this.f6417d, this.f6418e, cVar, 0);
                p2Var.f6416c = obj;
                return p2Var;
            case 1:
                p2 p2Var2 = new p2(this.f6417d, this.f6418e, cVar, 1);
                p2Var2.f6416c = obj;
                return p2Var2;
            case 2:
                p2 p2Var3 = new p2(this.f6417d, this.f6418e, cVar, 2);
                p2Var3.f6416c = obj;
                return p2Var3;
            case 3:
                p2 p2Var4 = new p2(this.f6417d, this.f6418e, cVar, 3);
                p2Var4.f6416c = obj;
                return p2Var4;
            default:
                p2 p2Var5 = new p2(this.f6417d, this.f6418e, cVar, 4);
                p2Var5.f6416c = obj;
                return p2Var5;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f6414a) {
        }
        return ((p2) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6414a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f6415b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    p1 p1Var = new p1(this.f6418e, ((qj.z) this.f6416c).Q());
                    this.f6415b = 1;
                    if (this.f6417d.invoke(p1Var, this) == aVar) {
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
                int i11 = this.f6415b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    p1 p1Var2 = new p1(this.f6418e, ((qj.z) this.f6416c).Q());
                    this.f6415b = 1;
                    if (this.f6417d.invoke(p1Var2, this) == aVar2) {
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
                int i12 = this.f6415b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    p1 p1Var3 = new p1(this.f6418e, ((qj.z) this.f6416c).Q());
                    this.f6415b = 1;
                    if (this.f6417d.invoke(p1Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                int i13 = this.f6415b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    p1 p1Var4 = new p1(this.f6418e, ((qj.z) this.f6416c).Q());
                    this.f6415b = 1;
                    if (this.f6417d.invoke(p1Var4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f6415b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    p1 p1Var5 = new p1(this.f6418e, ((qj.z) this.f6416c).Q());
                    this.f6415b = 1;
                    if (this.f6417d.invoke(p1Var5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
