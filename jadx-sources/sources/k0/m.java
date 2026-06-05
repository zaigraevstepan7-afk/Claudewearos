package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f9172b;

    public /* synthetic */ m(u1 u1Var, int i10) {
        this.f9171a = i10;
        this.f9172b = u1Var;
    }

    @Override // ej.a
    public final Object a() {
        g3.j0 j0Var;
        switch (this.f9171a) {
            case 0:
                u1 u1Var = this.f9172b;
                return Boolean.valueOf(u1Var != null ? ((Boolean) new m(u1Var, 2).a()).booleanValue() : false);
            case 1:
                u1 u1Var2 = this.f9172b;
                return Boolean.valueOf(u1Var2 != null ? ((Boolean) new m(u1Var2, 2).a()).booleanValue() : false);
            default:
                u1 u1Var3 = this.f9172b;
                g3.f fVar = u1Var3.f9301b;
                g3.k0 k0Var = (g3.k0) u1Var3.f9300a.getValue();
                return Boolean.valueOf(fj.l.b(fVar, (k0Var == null || (j0Var = k0Var.f7128a) == null) ? null : j0Var.f7117a));
        }
    }
}
