package c1;

import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o7 implements ej.e {
    public final /* synthetic */ k0.r0 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ b0.b E;
    public final /* synthetic */ z.k F;
    public final /* synthetic */ ej.e G;
    public final /* synthetic */ c2.w0 H;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f2535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g7 f2536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f2538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g3.n0 f2540f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k0.s0 f2541z;

    public o7(v1.o oVar, g7 g7Var, String str, ej.c cVar, boolean z2, g3.n0 n0Var, k0.s0 s0Var, k0.r0 r0Var, boolean z10, int i10, int i11, b0.b bVar, z.k kVar, ej.e eVar, c2.w0 w0Var) {
        this.f2535a = oVar;
        this.f2536b = g7Var;
        this.f2537c = str;
        this.f2538d = cVar;
        this.f2539e = z2;
        this.f2540f = n0Var;
        this.f2541z = s0Var;
        this.A = r0Var;
        this.B = z10;
        this.C = i10;
        this.D = i11;
        this.E = bVar;
        this.F = kVar;
        this.G = eVar;
        this.H = w0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            d1.i.i(R.string.default_error_message, i0Var);
            float f10 = d1.d1.f4485a;
            v1.o oVarA = b0.t1.a(this.f2535a, k7.f2346c, k7.f2345b);
            g7 g7Var = this.f2536b;
            c2.z0 z0Var = new c2.z0(g7Var.f2154i);
            ej.e eVar = this.G;
            c2.w0 w0Var = this.H;
            String str = this.f2537c;
            boolean z2 = this.f2539e;
            boolean z10 = this.B;
            b0.b bVar = this.E;
            z.k kVar = this.F;
            k0.i.a(str, this.f2538d, oVarA, z2, this.f2540f, this.f2541z, this.A, z10, this.C, this.D, bVar, null, kVar, z0Var, p1.j.d(1451491557, new n7(str, z2, z10, bVar, kVar, eVar, w0Var, g7Var), i0Var), i0Var, 0, 196608, 4096);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
