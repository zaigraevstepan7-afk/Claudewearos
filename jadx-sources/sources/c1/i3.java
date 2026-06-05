package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2232a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5 f2233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.a f2234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj.z f2235d;

    public /* synthetic */ i3(x5 x5Var, ej.a aVar, qj.z zVar) {
        this.f2233b = x5Var;
        this.f2234c = aVar;
        this.f2235d = zVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f2232a) {
            case 0:
                x5 x5Var = this.f2233b;
                if (((Boolean) x5Var.f2867d.f4557d.invoke(y5.f2911a)).booleanValue()) {
                    qj.b0.w(this.f2235d, null, new l3(x5Var, null, 3), 3).T(new k3(x5Var, this.f2234c, 0));
                }
                break;
            default:
                x5 x5Var2 = this.f2233b;
                int iOrdinal = ((y5) x5Var2.f2867d.f4560g.getValue()).ordinal();
                if (iOrdinal != 1) {
                    qj.z zVar = this.f2235d;
                    if (iOrdinal != 2) {
                        qj.b0.w(zVar, null, new l3(x5Var2, null, 5), 3);
                    } else {
                        qj.b0.w(zVar, null, new l3(x5Var2, null, 4), 3);
                    }
                } else {
                    this.f2234c.a();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ i3(x5 x5Var, qj.z zVar, ej.a aVar) {
        this.f2233b = x5Var;
        this.f2235d = zVar;
        this.f2234c = aVar;
    }
}
