package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i7 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.k f2247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g7 f2248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2249d;

    public i7(boolean z2, z.k kVar, g7 g7Var, c2.w0 w0Var) {
        this.f2246a = z2;
        this.f2247b = kVar;
        this.f2248c = g7Var;
        this.f2249d = w0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            k7.f2344a.a(this.f2246a, this.f2247b, this.f2248c, this.f2249d, i0Var, 114822144);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
