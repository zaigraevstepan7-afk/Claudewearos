package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2390c;

    public /* synthetic */ l6(Object obj, boolean z2, int i10) {
        this.f2388a = i10;
        this.f2390c = obj;
        this.f2389b = z2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f2388a;
        boolean z2 = true;
        z2 = true;
        pi.o oVar = pi.o.f13011a;
        boolean z10 = this.f2389b;
        Object obj2 = this.f2390c;
        switch (i10) {
            case 0:
                x6 x6Var = (x6) obj2;
                d3.z zVar = (d3.z) obj;
                if (!z10) {
                    lj.d[] dVarArr = d3.x.f4803a;
                    zVar.b(d3.v.j, oVar);
                }
                String strValueOf = String.valueOf(hj.a.H(x6Var.f2871b.g() * 100) / 100.0f);
                lj.d[] dVarArr2 = d3.x.f4803a;
                d3.y yVar = d3.v.f4777b;
                lj.d dVar = d3.x.f4803a[0];
                zVar.b(yVar, strValueOf);
                zVar.b(d3.m.f4741i, new d3.a(null, new k6(x6Var, z2 ? 1 : 0)));
                return oVar;
            case 1:
                d.h hVar = (d.h) obj2;
                hVar.f4331a.f(z10);
                hVar.f4332b.f(z10);
                return new d.f((b6.i) obj, hVar);
            case 2:
                ej.a aVar = (ej.a) obj2;
                y5 y5Var = (y5) obj;
                fj.l.f(y5Var, "value");
                if (z10 && y5Var == y5.f2911a) {
                    if (aVar != null) {
                        aVar.a();
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                t.c cVar = (t.c) obj2;
                c2.f0 f0Var = (c2.f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                f0Var.p(((Number) cVar.e()).floatValue());
                f0Var.j(((Number) cVar.e()).floatValue());
                f0Var.m(z10 ? 1.0f : 0.6f);
                return oVar;
        }
    }

    public /* synthetic */ l6(boolean z2, Object obj, int i10) {
        this.f2388a = i10;
        this.f2389b = z2;
        this.f2390c = obj;
    }
}
