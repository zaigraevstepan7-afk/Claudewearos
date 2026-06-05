package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f2463b;

    public /* synthetic */ n1(p1 p1Var, int i10) {
        this.f2462a = i10;
        this.f2463b = p1Var;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f2462a;
        p1 p1Var = this.f2463b;
        switch (i10) {
            case 0:
                if (((y4) v2.n.h(p1Var, a5.f1888a)) == null) {
                    b1.a aVar = p1Var.N;
                    if (aVar != null) {
                        p1Var.r1(aVar);
                    }
                    p1Var.N = null;
                } else if (p1Var.N == null) {
                    o1 o1Var = new o1(p1Var, 0);
                    n1 n1Var = new n1(p1Var, 1);
                    z.k kVar = p1Var.J;
                    boolean z2 = p1Var.K;
                    float f10 = p1Var.L;
                    t.o1 o1Var2 = b1.f.f1478a;
                    b1.a aVar2 = new b1.a(kVar, z2, f10, o1Var, n1Var);
                    p1Var.q1(aVar2);
                    p1Var.N = aVar2;
                }
                return pi.o.f13011a;
            default:
                return z4.f2944a;
        }
    }
}
