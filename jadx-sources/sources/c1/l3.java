package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2372a;

    /* renamed from: b, reason: collision with root package name */
    public int f2373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x5 f2374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(x5 x5Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f2372a = i10;
        this.f2374c = x5Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f2372a) {
            case 0:
                return new l3(this.f2374c, cVar, 0);
            case 1:
                return new l3(this.f2374c, cVar, 1);
            case 2:
                return new l3(this.f2374c, cVar, 2);
            case 3:
                return new l3(this.f2374c, cVar, 3);
            case 4:
                return new l3(this.f2374c, cVar, 4);
            case 5:
                return new l3(this.f2374c, cVar, 5);
            case 6:
                return new l3(this.f2374c, cVar, 6);
            case 7:
                return new l3(this.f2374c, cVar, 7);
            default:
                return new l3(this.f2374c, cVar, 8);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f2372a) {
        }
        return ((l3) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2372a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f2373b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.e(this) == aVar) {
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
                int i11 = this.f2373b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.c(this) == aVar2) {
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
                int i12 = this.f2373b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.f(this) == aVar3) {
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
                int i13 = this.f2373b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.c(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                int i14 = this.f2373b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.b(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 5:
                ui.a aVar6 = ui.a.f17085a;
                int i15 = this.f2373b;
                if (i15 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.f(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 6:
                ui.a aVar7 = ui.a.f17085a;
                int i16 = this.f2373b;
                if (i16 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.b(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            case 7:
                ui.a aVar8 = ui.a.f17085a;
                int i17 = this.f2373b;
                if (i17 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.e(this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
            default:
                ui.a aVar9 = ui.a.f17085a;
                int i18 = this.f2373b;
                if (i18 == 0) {
                    uk.c.R(obj);
                    this.f2373b = 1;
                    if (this.f2374c.c(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return pi.o.f13011a;
        }
    }
}
