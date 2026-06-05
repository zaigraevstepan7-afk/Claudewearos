package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17375a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17379e;

    public /* synthetic */ e(v1.o oVar, ej.a aVar, boolean z2, int i10) {
        this.f17378d = oVar;
        this.f17379e = aVar;
        this.f17376b = z2;
        this.f17377c = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17375a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(this.f17377c | 1);
                u3.c.e((v1.o) this.f17378d, (ej.a) this.f17379e, this.f17376b, (f1.i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(this.f17377c | 1);
                u2.b.a(this.f17376b, (r3.j) this.f17378d, (u0) this.f17379e, (f1.i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ e(boolean z2, r3.j jVar, u0 u0Var, int i10) {
        this.f17376b = z2;
        this.f17378d = jVar;
        this.f17379e = u0Var;
        this.f17377c = i10;
    }
}
