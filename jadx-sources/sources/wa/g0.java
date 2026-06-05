package wa;

import f0.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f19080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f19081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.c f19083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f19084f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t.c f19085z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(t.c cVar, float f10, int i10, t.c cVar2, float f11, t.c cVar3, ti.c cVar4) {
        super(2, cVar4);
        this.f19080b = cVar;
        this.f19081c = f10;
        this.f19082d = i10;
        this.f19083e = cVar2;
        this.f19084f = f11;
        this.f19085z = cVar3;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        g0 g0Var = new g0(this.f19080b, this.f19081c, this.f19082d, this.f19083e, this.f19084f, this.f19085z, cVar);
        g0Var.f19079a = obj;
        return g0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        qj.z zVar = (qj.z) this.f19079a;
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        t.c cVar = this.f19080b;
        float f10 = this.f19081c;
        int i10 = this.f19082d;
        qj.b0.w(zVar, null, new f0(cVar, f10, i10, null, 0), 3);
        qj.b0.w(zVar, null, new f0(this.f19083e, this.f19084f, i10, null, 1), 3);
        return qj.b0.w(zVar, null, new v0(this.f19085z, i10, null, 3), 3);
    }
}
