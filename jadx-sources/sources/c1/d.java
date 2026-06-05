package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.e f2001b;

    public /* synthetic */ d(p1.e eVar) {
        this.f2000a = 4;
        this.f2001b = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2000a;
        pi.o oVar = pi.o.f13011a;
        p1.e eVar = this.f2001b;
        switch (i10) {
            case 0:
                float f10 = j.f2253a;
                float f11 = j.f2253a;
                ((Integer) obj2).getClass();
                j.b(eVar, (f1.i0) obj, f1.s.O(439));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t5.a(eVar, (f1.i0) obj, f1.s.O(55));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f0.o.c(eVar, (f1.i0) obj, f1.s.O(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lb.l0.a(eVar, (f1.i0) obj, f1.s.O(7));
                break;
            default:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    eVar.c(b0.w.f1450a, i0Var, 0);
                    break;
                }
        }
        return oVar;
    }

    public /* synthetic */ d(p1.e eVar, int i10) {
        this.f2000a = 0;
        float f10 = j.f2253a;
        float f11 = j.f2253a;
        this.f2001b = eVar;
    }

    public /* synthetic */ d(p1.e eVar, int i10, int i11) {
        this.f2000a = i11;
        this.f2001b = eVar;
    }
}
