package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k5 f2659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2661c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.e f2662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g3.n0 f2663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2664f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b0.i1 f2665z;

    public s0(k5 k5Var, boolean z2, boolean z10, p1.e eVar, g3.n0 n0Var, float f10, b0.i1 i1Var) {
        this.f2659a = k5Var;
        this.f2660b = z2;
        this.f2661c = z10;
        this.f2662d = eVar;
        this.f2663e = n0Var;
        this.f2664f = f10;
        this.f2665z = i1Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            k5 k5Var = this.f2659a;
            boolean z2 = this.f2660b;
            boolean z10 = this.f2661c;
            t0.a(this.f2662d, this.f2663e, !z2 ? k5Var.f2335f : !z10 ? k5Var.f2331b : k5Var.f2339k, !z2 ? k5Var.f2336g : !z10 ? k5Var.f2332c : k5Var.f2340l, !z2 ? k5Var.f2337h : !z10 ? k5Var.f2333d : k5Var.f2341m, this.f2664f, this.f2665z, i0Var, 0);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
