package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l4 implements ej.f {
    public final /* synthetic */ g7 A;
    public final /* synthetic */ c2.w0 B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.b f2378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.k f2379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2380f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ej.e f2381z;

    public l4(String str, boolean z2, boolean z10, b0.b bVar, z.k kVar, boolean z11, ej.e eVar, g7 g7Var, c2.w0 w0Var) {
        this.f2375a = str;
        this.f2376b = z2;
        this.f2377c = z10;
        this.f2378d = bVar;
        this.f2379e = kVar;
        this.f2380f = z11;
        this.f2381z = eVar;
        this.A = g7Var;
        this.B = w0Var;
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
            g4 g4Var = g4.f2127a;
            c2.w0 w0Var = this.B;
            boolean z2 = this.f2376b;
            boolean z10 = this.f2380f;
            z.k kVar = this.f2379e;
            g7 g7Var = this.A;
            g4Var.b(this.f2375a, eVar, z2, this.f2377c, this.f2378d, kVar, z10, this.f2381z, g7Var, null, p1.j.d(-656940872, new k4(z2, z10, kVar, g7Var, w0Var), i0Var), i0Var, (iIntValue << 3) & 112);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
