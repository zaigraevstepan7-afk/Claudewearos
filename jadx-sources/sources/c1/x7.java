package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x7 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2886a;

    /* renamed from: b, reason: collision with root package name */
    public int f2887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y7 f2888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f2889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(y7 y7Var, float f10, ti.c cVar, int i10) {
        super(2, cVar);
        this.f2886a = i10;
        this.f2888c = y7Var;
        this.f2889d = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f2886a) {
            case 0:
                return new x7(this.f2888c, this.f2889d, cVar, 0);
            default:
                return new x7(this.f2888c, this.f2889d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f2886a) {
        }
        return ((x7) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2886a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f2887b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    y7 y7Var = this.f2888c;
                    t.c cVar = y7Var.M;
                    if (cVar != null) {
                        Float f10 = new Float(this.f2889d);
                        t.j jVar = y7Var.K ? f7.f2112f : y7Var.J;
                        this.f2887b = 1;
                        obj = t.c.d(cVar, f10, jVar, null, null, this, 12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return pi.o.f13011a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uk.c.R(obj);
                return pi.o.f13011a;
            default:
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f2887b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    y7 y7Var2 = this.f2888c;
                    t.c cVar2 = y7Var2.L;
                    if (cVar2 == null) {
                        return pi.o.f13011a;
                    }
                    Float f11 = new Float(this.f2889d);
                    t.j jVar2 = y7Var2.K ? f7.f2112f : y7Var2.J;
                    this.f2887b = 1;
                    obj = t.c.d(cVar2, f11, jVar2, null, null, this, 12);
                    if (obj == aVar2) {
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
