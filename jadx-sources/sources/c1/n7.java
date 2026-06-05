package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n7 implements ej.f {
    public final /* synthetic */ g7 A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.b f2487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.k f2488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.e f2489f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2490z;

    public n7(String str, boolean z2, boolean z10, b0.b bVar, z.k kVar, ej.e eVar, c2.w0 w0Var, g7 g7Var) {
        this.f2484a = str;
        this.f2485b = z2;
        this.f2486c = z10;
        this.f2487d = bVar;
        this.f2488e = kVar;
        this.f2489f = eVar;
        this.f2490z = w0Var;
        this.A = g7Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        ej.e eVar = (ej.e) obj;
        f1.i0 i0Var = (f1.i0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= i0Var.h(eVar) ? 4 : 2;
        }
        if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            k7.f2344a.b(this.f2484a, eVar, this.f2485b, this.f2486c, this.f2487d, this.f2488e, this.f2489f, this.f2490z, this.A, null, null, i0Var, (iIntValue << 3) & 112);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
