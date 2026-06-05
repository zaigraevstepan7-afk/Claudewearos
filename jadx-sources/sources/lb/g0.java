package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qj.z f10291b;

    public /* synthetic */ g0(qj.z zVar, int i10) {
        this.f10290a = i10;
        this.f10291b = zVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f10290a) {
            case 0:
                qj.b0.w(this.f10291b, null, new k0(2, null, 0), 3);
                return pi.o.f13011a;
            default:
                return Float.valueOf(t.d.p(this.f10291b.Q()));
        }
    }
}
