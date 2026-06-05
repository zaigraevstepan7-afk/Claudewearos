package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f2173c;

    public /* synthetic */ h(ej.e eVar, p1.e eVar2, int i10) {
        this.f2171a = i10;
        this.f2172b = eVar;
        this.f2173c = eVar2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2171a;
        pi.o oVar = pi.o.f13011a;
        p1.e eVar = this.f2173c;
        ej.e eVar2 = this.f2172b;
        int i11 = 0;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    if (eVar2 == null) {
                        i0Var.b0(-1102039173);
                    } else {
                        i0Var.b0(795734342);
                        eVar2.invoke(i0Var, 0);
                    }
                    i0Var.p(false);
                    eVar.invoke(i0Var, 0);
                    break;
                }
            default:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                    break;
                } else {
                    float f10 = j.f2253a;
                    j.b(p1.j.d(-459506658, new h(eVar2, eVar, i11), i0Var2), i0Var2, 438);
                    break;
                }
        }
        return oVar;
    }
}
