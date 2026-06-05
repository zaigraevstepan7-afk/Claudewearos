package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public int f9165a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ x.r1 f9166b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f9167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj.z f9168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f9169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.k f9170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(qj.z zVar, f1.a1 a1Var, z.k kVar, ti.c cVar) {
        super(3, cVar);
        this.f9168d = zVar;
        this.f9169e = a1Var;
        this.f9170f = kVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((b2.b) obj2).f1500a;
        f1.a1 a1Var = this.f9169e;
        z.k kVar = this.f9170f;
        l1 l1Var = new l1(this.f9168d, a1Var, kVar, (ti.c) obj3);
        l1Var.f9166b = (x.r1) obj;
        l1Var.f9167c = j;
        return l1Var.invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f9165a;
        qj.z zVar = this.f9168d;
        if (i10 == 0) {
            uk.c.R(obj);
            x.r1 r1Var = this.f9166b;
            qj.b0.w(zVar, null, new j1(this.f9169e, this.f9167c, this.f9170f, (ti.c) null, 0), 3);
            this.f9165a = 1;
            obj = r1Var.x(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        qj.b0.w(zVar, null, new k1(this.f9169e, ((Boolean) obj).booleanValue(), this.f9170f, null), 3);
        return pi.o.f13011a;
    }
}
