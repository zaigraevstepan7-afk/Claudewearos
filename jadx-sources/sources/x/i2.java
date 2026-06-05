package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i2 extends vi.i implements ej.e {
    public final /* synthetic */ long A;

    /* renamed from: a, reason: collision with root package name */
    public l2 f19563a;

    /* renamed from: b, reason: collision with root package name */
    public fj.u f19564b;

    /* renamed from: c, reason: collision with root package name */
    public long f19565c;

    /* renamed from: d, reason: collision with root package name */
    public int f19566d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2 f19568f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ fj.u f19569z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l2 l2Var, fj.u uVar, long j, ti.c cVar) {
        super(2, cVar);
        this.f19568f = l2Var;
        this.f19569z = uVar;
        this.A = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        i2 i2Var = new i2(this.f19568f, this.f19569z, this.A, cVar);
        i2Var.f19567e = obj;
        return i2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((j2) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        l2 l2Var;
        fj.u uVar;
        long j;
        l2 l2Var2;
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f19566d;
        if (i10 == 0) {
            uk.c.R(obj);
            j2 j2Var = (j2) this.f19567e;
            l2Var = this.f19568f;
            h2 h2Var = new h2(l2Var, j2Var);
            s0 s0Var = l2Var.f19615c;
            uVar = this.f19569z;
            long j4 = uVar.f6806a;
            o1 o1Var = l2Var.f19616d;
            o1 o1Var2 = o1.f19665b;
            long j10 = this.A;
            float fD = l2Var.d(o1Var == o1Var2 ? s3.q.b(j10) : s3.q.c(j10));
            this.f19567e = l2Var;
            this.f19563a = l2Var;
            this.f19564b = uVar;
            this.f19565c = j4;
            this.f19566d = 1;
            obj = s0Var.a(h2Var, fD, this);
            if (obj == aVar) {
                return aVar;
            }
            j = j4;
            l2Var2 = l2Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f19565c;
            uVar = this.f19564b;
            l2Var = this.f19563a;
            l2Var2 = (l2) this.f19567e;
            uk.c.R(obj);
        }
        float fD2 = l2Var2.d(((Number) obj).floatValue());
        uVar.f6806a = l2Var.f19616d == o1.f19665b ? s3.q.a(j, fD2, 0.0f, 2) : s3.q.a(j, 0.0f, fD2, 1);
        return pi.o.f13011a;
    }
}
