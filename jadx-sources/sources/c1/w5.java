package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w5 extends vi.i implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public int f2831a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ d1.n f2832b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ d1.o0 f2833c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ y5 f2834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5 f2835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2836f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t.z f2837z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(x5 x5Var, float f10, t.z zVar, ti.c cVar) {
        super(4, cVar);
        this.f2835e = x5Var;
        this.f2836f = f10;
        this.f2837z = zVar;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        float f10 = this.f2836f;
        t.z zVar = this.f2837z;
        w5 w5Var = new w5(this.f2835e, f10, zVar, (ti.c) obj4);
        w5Var.f2832b = (d1.n) obj;
        w5Var.f2833c = (d1.o0) obj2;
        w5Var.f2834d = (y5) obj3;
        return w5Var.invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        int i10 = this.f2831a;
        if (i10 == 0) {
            uk.c.R(obj);
            d1.n nVar = this.f2832b;
            float fD = this.f2833c.d(this.f2834d);
            if (!Float.isNaN(fD)) {
                fj.s sVar = new fj.s();
                x5 x5Var = this.f2835e;
                float fG = Float.isNaN(x5Var.f2867d.j.g()) ? 0.0f : x5Var.f2867d.j.g();
                sVar.f6804a = fG;
                v5 v5Var = new v5(nVar, sVar, 0);
                this.f2832b = null;
                this.f2833c = null;
                this.f2831a = 1;
                if (t.d.d(fG, fD, this.f2836f, this.f2837z, v5Var, this) == aVar) {
                    return aVar;
                }
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
