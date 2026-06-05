package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1979a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1981c;

    public /* synthetic */ c6(a6 a6Var, boolean z2) {
        this.f1981c = a6Var;
        this.f1980b = z2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f1979a;
        boolean z2 = this.f1980b;
        pi.o oVar = pi.o.f13011a;
        Object obj3 = this.f1981c;
        switch (i10) {
            case 0:
                e2.d dVar = (e2.d) obj;
                h6 h6Var = h6.f2196a;
                e2.d.V0(dVar, ((a6) obj3).a(z2, true), dVar.w0(h6.f2197b) / 2.0f, ((b2.b) obj2).f1500a, null, 120);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ha.d.a(z2, (p1.e) obj3, (f1.i0) obj, f1.s.O(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                k0.s.h((v0.u0) obj3, z2, (f1.i0) obj, f1.s.O(1));
                break;
            default:
                ej.c cVar = (ej.c) obj3;
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                    break;
                } else {
                    f7.a(this.f1980b, cVar, null, false, null, i0Var, 0);
                    break;
                }
        }
        return oVar;
    }

    public /* synthetic */ c6(ej.c cVar, boolean z2) {
        this.f1980b = z2;
        this.f1981c = cVar;
    }

    public /* synthetic */ c6(v0.u0 u0Var, boolean z2, int i10) {
        this.f1981c = u0Var;
        this.f1980b = z2;
    }

    public /* synthetic */ c6(boolean z2, p1.e eVar, int i10) {
        this.f1980b = z2;
        this.f1981c = eVar;
    }
}
