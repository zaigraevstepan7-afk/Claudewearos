package c1;

import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m4 implements ej.e {
    public final /* synthetic */ g3.n0 A;
    public final /* synthetic */ k0.s0 B;
    public final /* synthetic */ k0.r0 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ b0.b G;
    public final /* synthetic */ z.k H;
    public final /* synthetic */ c2.w0 I;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f2426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g7 f2429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej.c f2431f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f2432z;

    public m4(v1.o oVar, ej.e eVar, boolean z2, g7 g7Var, String str, ej.c cVar, boolean z10, g3.n0 n0Var, k0.s0 s0Var, k0.r0 r0Var, boolean z11, int i10, int i11, b0.b bVar, z.k kVar, c2.w0 w0Var) {
        this.f2426a = oVar;
        this.f2427b = eVar;
        this.f2428c = z2;
        this.f2429d = g7Var;
        this.f2430e = str;
        this.f2431f = cVar;
        this.f2432z = z10;
        this.A = n0Var;
        this.B = s0Var;
        this.C = r0Var;
        this.D = z11;
        this.E = i10;
        this.F = i11;
        this.G = bVar;
        this.H = kVar;
        this.I = w0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            ej.e eVar = this.f2427b;
            v1.o oVarX = v1.l.f17564b;
            if (eVar != null) {
                i0Var.b0(-903490605);
                Object objQ = i0Var.Q();
                if (objQ == f1.m.f6385a) {
                    objQ = new ab.d(15);
                    i0Var.l0(objQ);
                }
                oVarX = b0.d.x(d3.p.a(oVarX, true, (ej.c) objQ), 0.0f, d1.d1.d(i0Var), 0.0f, 0.0f, 13);
                i0Var.p(false);
            } else {
                i0Var.b0(-903106918);
                i0Var.p(false);
            }
            v1.o oVarC = this.f2426a.c(oVarX);
            String strI = d1.i.i(R.string.default_error_message, i0Var);
            float f10 = d1.d1.f4485a;
            boolean z2 = this.f2428c;
            if (z2) {
                oVarC = d3.p.a(oVarC, false, new q(strI, 5));
            }
            v1.o oVarA = b0.t1.a(oVarC, g4.f2129c, g4.f2128b);
            g7 g7Var = this.f2429d;
            c2.z0 z0Var = new c2.z0(z2 ? g7Var.j : g7Var.f2154i);
            ej.e eVar2 = this.f2427b;
            c2.w0 w0Var = this.I;
            String str = this.f2430e;
            boolean z10 = this.f2432z;
            boolean z11 = this.D;
            b0.b bVar = this.G;
            z.k kVar = this.H;
            k0.i.a(str, this.f2431f, oVarA, z10, this.A, this.B, this.C, z11, this.E, this.F, bVar, null, kVar, z0Var, p1.j.d(-1189274459, new l4(str, z10, z11, bVar, kVar, this.f2428c, eVar2, g7Var, w0Var), i0Var), i0Var, 0, 196608, 4096);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
