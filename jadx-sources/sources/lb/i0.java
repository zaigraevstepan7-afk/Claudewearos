package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.a f10345c;

    public /* synthetic */ i0(g gVar, ej.a aVar, int i10, int i11) {
        this.f10343a = i11;
        this.f10344b = gVar;
        this.f10345c = aVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10343a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                l0.e(this.f10344b, this.f10345c, i0Var, f1.s.O(1));
                break;
            default:
                ra.a2.c(this.f10344b, this.f10345c, i0Var, f1.s.O(9));
                break;
        }
        return pi.o.f13011a;
    }
}
