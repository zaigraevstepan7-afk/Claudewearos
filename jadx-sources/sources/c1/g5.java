package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g5 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f2134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.e f2135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej.e f2136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d1.p0 f2137f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ej.e f2138z;

    public g5(int i10, ej.e eVar, p1.e eVar2, ej.e eVar3, ej.e eVar4, d1.p0 p0Var, ej.e eVar5) {
        this.f2132a = i10;
        this.f2133b = eVar;
        this.f2134c = eVar2;
        this.f2135d = eVar3;
        this.f2136e = eVar4;
        this.f2137f = p0Var;
        this.f2138z = eVar5;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            i5.b(this.f2132a, this.f2133b, this.f2134c, this.f2135d, this.f2136e, this.f2137f, this.f2138z, i0Var, 0);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
