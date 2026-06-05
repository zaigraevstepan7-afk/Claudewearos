package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.u0 f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f9242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9243d;

    public /* synthetic */ r(v0.u0 u0Var, p1.e eVar, int i10, int i11) {
        this.f9240a = i11;
        this.f9241b = u0Var;
        this.f9242c = eVar;
        this.f9243d = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f9240a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                s.c(this.f9241b, this.f9242c, i0Var, f1.s.O(this.f9243d | 1));
                break;
            default:
                s.d(this.f9241b, this.f9242c, i0Var, f1.s.O(this.f9243d | 1));
                break;
        }
        return pi.o.f13011a;
    }
}
