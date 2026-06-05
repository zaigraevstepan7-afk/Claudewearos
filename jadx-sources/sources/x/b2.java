package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f19456b;

    public /* synthetic */ b2(e2 e2Var, int i10) {
        this.f19455a = i10;
        this.f19456b = e2Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f19455a) {
            case 0:
                return Boolean.valueOf(this.f19456b.G);
            default:
                a2.e0 e0Var = this.f19456b.f19511i0;
                if (!e0Var.f17565a.G) {
                    return null;
                }
                a2.b0 b0VarV1 = e0Var.v1();
                int iOrdinal = b0VarV1.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    throw new b3.e();
                }
                if (b0VarV1.a()) {
                    return e0Var.t1(null);
                }
                a2.e0 e0VarF = ((a2.q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f();
                if (e0VarF != null) {
                    return e0VarF.t1(v2.n.x(e0Var));
                }
                return null;
        }
    }
}
