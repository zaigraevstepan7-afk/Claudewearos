package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f15150b;

    public /* synthetic */ d1(j1 j1Var, int i10) {
        this.f15149a = i10;
        this.f15150b = j1Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f15149a) {
            case 0:
                j1 j1Var = this.f15150b;
                return Boolean.valueOf((fj.l.b(j1Var.f15203d.getValue(), j1Var.c()) && j1Var.f15206g.g() == Long.MIN_VALUE && !((Boolean) j1Var.f15207h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f15150b.b());
        }
    }
}
