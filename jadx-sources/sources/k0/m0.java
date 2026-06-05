package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f9174b;

    public /* synthetic */ m0(n0 n0Var, int i10) {
        this.f9173a = i10;
        this.f9174b = n0Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f9173a) {
            case 0:
                k3.e0 e0Var = this.f9174b.O;
                if (e0Var == null) {
                    a0.a.b("Font resolution state is not set.");
                    throw new b3.e();
                }
                e0Var.getValue();
                break;
            default:
                k3.e0 e0Var2 = this.f9174b.O;
                if (e0Var2 == null) {
                    a0.a.b("Font resolution state is not set.");
                    throw new b3.e();
                }
                e0Var2.getValue();
                break;
        }
        return pi.o.f13011a;
    }
}
