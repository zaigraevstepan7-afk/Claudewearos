package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10885b;

    public /* synthetic */ z0(String str, int i10, int i11) {
        this.f10884a = i11;
        this.f10885b = str;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10884a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                q3.l(this.f10885b, i0Var, f1.s.O(7));
                break;
            case 1:
                nb.e.b(this.f10885b, i0Var, f1.s.O(7));
                break;
            case 2:
                nb.v.i(this.f10885b, i0Var, f1.s.O(1));
                break;
            default:
                nb.v.b(this.f10885b, i0Var, f1.s.O(1));
                break;
        }
        return pi.o.f13011a;
    }
}
