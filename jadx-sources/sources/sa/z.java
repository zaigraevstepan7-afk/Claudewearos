package sa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14957c;

    public /* synthetic */ z(int i10, int i11, long j, boolean z2) {
        this.f14955a = i11;
        this.f14956b = z2;
        this.f14957c = j;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f14955a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a.a.b(this.f14956b, this.f14957c, i0Var, f1.s.O(1));
                break;
            default:
                a.a.a(this.f14956b, this.f14957c, i0Var, f1.s.O(1));
                break;
        }
        return pi.o.f13011a;
    }
}
