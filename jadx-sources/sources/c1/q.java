package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2589b;

    public /* synthetic */ q(String str, int i10) {
        this.f2588a = i10;
        this.f2589b = str;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10 = this.f2588a;
        pi.o oVar = pi.o.f13011a;
        String str = this.f2589b;
        d3.z zVar = (d3.z) obj;
        switch (i10) {
            case 0:
                d3.x.c(zVar, str);
                break;
            case 1:
                lj.d[] dVarArr = d3.x.f4803a;
                d3.y yVar = d3.v.f4779d;
                lj.d dVar = d3.x.f4803a[2];
                zVar.b(yVar, str);
                break;
            case 2:
                d3.x.c(zVar, str);
                d3.x.d(zVar, 5);
                break;
            case 3:
                lj.d[] dVarArr2 = d3.x.f4803a;
                d3.y yVar2 = d3.v.f4779d;
                lj.d[] dVarArr3 = d3.x.f4803a;
                lj.d dVar2 = dVarArr3[2];
                zVar.b(yVar2, str);
                d3.y yVar3 = d3.v.f4795u;
                lj.d dVar3 = dVarArr3[11];
                zVar.b(yVar3, Float.valueOf(0.0f));
                break;
            case 4:
                lj.d[] dVarArr4 = d3.x.f4803a;
                d3.y yVar4 = d3.v.f4785k;
                lj.d[] dVarArr5 = d3.x.f4803a;
                lj.d dVar4 = dVarArr5[3];
                zVar.b(yVar4, new d3.g());
                d3.y yVar5 = d3.v.f4779d;
                lj.d dVar5 = dVarArr5[2];
                zVar.b(yVar5, str);
                break;
            case 5:
                lj.d[] dVarArr6 = d3.x.f4803a;
                zVar.b(d3.v.M, str);
                break;
            default:
                d3.x.c(zVar, str);
                d3.x.d(zVar, 5);
                break;
        }
        return oVar;
    }
}
