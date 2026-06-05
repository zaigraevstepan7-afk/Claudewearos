package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f2356b;

    public /* synthetic */ l(int i10, ej.a aVar) {
        this.f2355a = i10;
        this.f2356b = aVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f2355a;
        pi.o oVar = pi.o.f13011a;
        ej.a aVar = this.f2356b;
        switch (i10) {
            case 0:
                ((c2.f0) obj).m(((Number) aVar.a()).floatValue());
                return oVar;
            case 1:
                aVar.a();
                return oVar;
            case 2:
                aVar.a();
                return oVar;
            case 3:
                d3.z zVar = (d3.z) obj;
                Object objA = aVar.a();
                if (Float.isNaN(((Number) objA).floatValue())) {
                    objA = null;
                }
                Float f10 = (Float) objA;
                d3.i iVar = new d3.i(f10 != null ? f10.floatValue() : 0.0f, new kj.d(0.0f, 1.0f));
                lj.d[] dVarArr = d3.x.f4803a;
                d3.y yVar = d3.v.f4778c;
                lj.d dVar = d3.x.f4803a[1];
                zVar.b(yVar, iVar);
                return oVar;
            case 4:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) aVar.a()).floatValue());
            case 5:
                c2.f0 f0Var = (c2.f0) obj;
                fj.l.f(f0Var, "$this$graphicsLayer");
                float fFloatValue = ((Number) aVar.a()).floatValue();
                f0Var.p(fFloatValue);
                f0Var.j(fFloatValue);
                return oVar;
            case 6:
                aVar.a();
                return oVar;
            case 7:
                aVar.a();
                return oVar;
            case 8:
                return (b2.b) aVar.a();
            default:
                aVar.a();
                return oVar;
        }
    }
}
