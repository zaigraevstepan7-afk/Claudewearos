package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public f1.a1 f9154a;

    /* renamed from: b, reason: collision with root package name */
    public int f9155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f9156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.k f9158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(f1.a1 a1Var, boolean z2, z.k kVar, ti.c cVar) {
        super(2, cVar);
        this.f9156c = a1Var;
        this.f9157d = z2;
        this.f9158e = kVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new k1(this.f9156c, this.f9157d, this.f9158e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        f1.a1 a1Var;
        f1.a1 a1Var2;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f9155b;
        if (i10 == 0) {
            uk.c.R(obj);
            a1Var = this.f9156c;
            z.m mVar = (z.m) a1Var.getValue();
            if (mVar != null) {
                z.j nVar = this.f9157d ? new z.n(mVar) : new z.l(mVar);
                z.k kVar = this.f9158e;
                if (kVar != null) {
                    this.f9154a = a1Var;
                    this.f9155b = 1;
                    if (kVar.a(nVar, this) == aVar) {
                        return aVar;
                    }
                    a1Var2 = a1Var;
                }
                a1Var.setValue(null);
            }
            return pi.o.f13011a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a1Var2 = this.f9154a;
        uk.c.R(obj);
        a1Var = a1Var2;
        a1Var.setValue(null);
        return pi.o.f13011a;
    }
}
