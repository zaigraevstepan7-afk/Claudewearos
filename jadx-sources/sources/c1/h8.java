package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h8 extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2207a;

    /* renamed from: b, reason: collision with root package name */
    public int f2208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(1, cVar);
        this.f2207a = i10;
        this.f2209c = obj;
        this.f2210d = obj2;
        this.f2211e = obj3;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        switch (this.f2207a) {
            case 0:
                return new h8((j8) this.f2209c, (i8) this.f2210d, (v.f1) this.f2211e, cVar, 0);
            default:
                return new h8((d1.q) this.f2209c, this.f2210d, (ej.g) this.f2211e, cVar, 1);
        }
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        ti.c cVar = (ti.c) obj;
        switch (this.f2207a) {
        }
        return ((h8) create(cVar)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2207a) {
            case 0:
                v.f1 f1Var = (v.f1) this.f2211e;
                i8 i8Var = (i8) this.f2210d;
                j8 j8Var = (j8) this.f2209c;
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f2208b;
                try {
                    if (i10 == 0) {
                        uk.c.R(obj);
                        z2 z2Var = new z2(i8Var, null, 2);
                        this.f2208b = 2;
                        if (qj.b0.H(1500L, z2Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1 && i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                    }
                    if (f1Var != v.f1.f17191c) {
                        j8Var.a();
                    }
                    return pi.o.f13011a;
                } finally {
                    if (f1Var != v.f1.f17191c) {
                        j8Var.a();
                    }
                }
            default:
                d1.q qVar = (d1.q) this.f2209c;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f2208b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    qVar.h(this.f2210d);
                    d1.j jVar = new d1.j(qVar, 4);
                    ab.s sVar = new ab.s((ej.g) this.f2211e, qVar, null, 5);
                    this.f2208b = 1;
                    if (d1.i.e(jVar, sVar, this) == aVar2) {
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
