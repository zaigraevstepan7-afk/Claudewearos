package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q2 extends vi.h implements ej.e {
    public final /* synthetic */ ej.f A;
    public final /* synthetic */ ej.c B;

    /* renamed from: b, reason: collision with root package name */
    public int f19690b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj.z f19692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f19693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.c f19694f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ej.c f19695z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(qj.z zVar, r1 r1Var, ej.c cVar, ej.c cVar2, ej.f fVar, ej.c cVar3, ti.c cVar4) {
        super(cVar4);
        this.f19692d = zVar;
        this.f19693e = r1Var;
        this.f19694f = cVar;
        this.f19695z = cVar2;
        this.A = fVar;
        this.B = cVar3;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        q2 q2Var = new q2(this.f19692d, this.f19693e, this.f19694f, this.f19695z, this.A, this.B, cVar);
        q2Var.f19691c = obj;
        return q2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q2) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f19690b;
        if (i10 == 0) {
            uk.c.R(obj);
            p2.o0 o0Var = (p2.o0) this.f19691c;
            this.f19690b = 1;
            if (v2.g(o0Var, this.f19692d, this.f19693e, this.f19694f, this.f19695z, this.A, this.B, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uk.c.R(obj);
        }
        return pi.o.f13011a;
    }
}
