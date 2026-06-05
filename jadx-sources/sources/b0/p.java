package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1385a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f1386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1387c;

    public /* synthetic */ p(v1.o oVar, int i10) {
        this.f1386b = oVar;
        this.f1387c = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f1385a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                r.a(this.f1386b, i0Var, f1.s.O(this.f1387c | 1));
                break;
            default:
                k0.b.b(this.f1386b, i0Var, f1.s.O(1), this.f1387c);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ p(v1.o oVar, int i10, int i11) {
        this.f1386b = oVar;
        this.f1387c = i11;
    }
}
