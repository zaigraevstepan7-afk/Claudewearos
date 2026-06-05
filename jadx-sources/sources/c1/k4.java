package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k4 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z.k f2327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g7 f2328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2329e;

    public k4(boolean z2, boolean z10, z.k kVar, g7 g7Var, c2.w0 w0Var) {
        this.f2325a = z2;
        this.f2326b = z10;
        this.f2327c = kVar;
        this.f2328d = g7Var;
        this.f2329e = w0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            g4.f2127a.a(this.f2325a, this.f2326b, this.f2327c, null, this.f2328d, this.f2329e, 0.0f, 0.0f, i0Var, 100663296, 200);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
