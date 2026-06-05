package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f2578b;

    public /* synthetic */ p3(t.c cVar, int i10) {
        this.f2577a = i10;
        this.f2578b = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f2577a) {
            case 0:
                c2.f0 f0Var = (c2.f0) obj;
                float fFloatValue = ((Number) this.f2578b.e()).floatValue();
                float fD = v3.d(f0Var, fFloatValue);
                float fE = v3.e(f0Var, fFloatValue);
                f0Var.j(fE == 0.0f ? 1.0f : fD / fE);
                f0Var.J0(v3.f2765c);
                break;
            case 1:
                fj.l.f((s3.c) obj, "$this$offset");
                break;
            case 2:
                c2.f0 f0Var2 = (c2.f0) obj;
                fj.l.f(f0Var2, "$this$graphicsLayer");
                f0Var2.m(((Number) this.f2578b.e()).floatValue());
                break;
            default:
                c2.f0 f0Var3 = (c2.f0) obj;
                fj.l.f(f0Var3, "$this$graphicsLayer");
                t.c cVar = this.f2578b;
                f0Var3.p(((Number) cVar.e()).floatValue());
                f0Var3.j(((Number) cVar.e()).floatValue());
                f0Var3.J0(c2.a1.f2962b);
                break;
        }
        return pi.o.f13011a;
    }
}
