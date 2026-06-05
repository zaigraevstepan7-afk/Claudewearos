package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f10429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f10430c;

    public /* synthetic */ l(v1.o oVar, p1.e eVar, int i10, int i11) {
        this.f10428a = i11;
        this.f10429b = oVar;
        this.f10430c = eVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10428a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                r.b(this.f10429b, this.f10430c, i0Var, f1.s.O(55));
                break;
            default:
                u1.p.b(this.f10429b, this.f10430c, i0Var, f1.s.O(49));
                break;
        }
        return pi.o.f13011a;
    }
}
