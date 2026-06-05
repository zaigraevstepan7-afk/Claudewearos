package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x6 implements x.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final kj.d f2870a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.f1 f2871b;

    /* renamed from: c, reason: collision with root package name */
    public ej.c f2872c;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2877h;

    /* renamed from: n, reason: collision with root package name */
    public final f1.f1 f2882n;

    /* renamed from: o, reason: collision with root package name */
    public final f1.f1 f2883o;

    /* renamed from: p, reason: collision with root package name */
    public final w6 f2884p;

    /* renamed from: q, reason: collision with root package name */
    public final v.j1 f2885q;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2873d = true;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f2874e = new float[0];

    /* renamed from: f, reason: collision with root package name */
    public final f1.g1 f2875f = new f1.g1(0);

    /* renamed from: g, reason: collision with root package name */
    public final f1.g1 f2876g = new f1.g1(0);

    /* renamed from: i, reason: collision with root package name */
    public final f1.g1 f2878i = new f1.g1(0);
    public final f1.g1 j = new f1.g1(0);

    /* renamed from: k, reason: collision with root package name */
    public final x.o1 f2879k = x.o1.f19665b;

    /* renamed from: l, reason: collision with root package name */
    public final f1.j1 f2880l = f1.s.A(Boolean.FALSE);

    /* renamed from: m, reason: collision with root package name */
    public final a7.e f2881m = new a7.e(this, 5);

    public x6(float f10, kj.d dVar) {
        this.f2870a = dVar;
        this.f2871b = new f1.f1(f10);
        float f11 = dVar.f9663a;
        float f12 = dVar.f9664b - f11;
        this.f2882n = new f1.f1(u3.c.l(0.0f, 0.0f, cg.b.o(f12 == 0.0f ? 0.0f : (f10 - f11) / f12, 0.0f, 1.0f)));
        this.f2883o = new f1.f1(0.0f);
        this.f2884p = new w6(this, 0);
        this.f2885q = new v.j1();
    }

    @Override // x.r0
    public final Object a(w6.z zVar, x.l0 l0Var) {
        v.f1 f1Var = v.f1.f17189a;
        Object objH = qj.b0.h(new androidx.lifecycle.h0(this, zVar, (ti.c) null), l0Var);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }

    public final void b(float f10) {
        float fMax;
        float fMin;
        if (this.f2879k == x.o1.f19664a) {
            float fG = this.f2876g.g();
            f1.g1 g1Var = this.j;
            fMax = Math.max(fG - (g1Var.g() / 2.0f), 0.0f);
            fMin = Math.min(g1Var.g() / 2.0f, fMax);
        } else {
            float fG2 = this.f2875f.g();
            f1.g1 g1Var2 = this.f2878i;
            fMax = Math.max(fG2 - (g1Var2.g() / 2.0f), 0.0f);
            fMin = Math.min(g1Var2.g() / 2.0f, fMax);
        }
        f1.f1 f1Var = this.f2882n;
        float fG3 = f1Var.g() + f10;
        f1.f1 f1Var2 = this.f2883o;
        f1Var.h(f1Var2.g() + fG3);
        f1Var2.h(0.0f);
        float fE = v6.e(f1Var.g(), this.f2874e, fMin, fMax);
        kj.d dVar = this.f2870a;
        float f11 = fMax - fMin;
        float fL = u3.c.l(dVar.f9663a, dVar.f9664b, cg.b.o(f11 == 0.0f ? 0.0f : (fE - fMin) / f11, 0.0f, 1.0f));
        if (fL == this.f2871b.g()) {
            return;
        }
        ej.c cVar = this.f2872c;
        if (cVar != null) {
            cVar.invoke(Float.valueOf(fL));
        } else {
            d(fL);
        }
    }

    public final float c() {
        kj.d dVar = this.f2870a;
        float f10 = dVar.f9663a;
        float f11 = dVar.f9664b;
        float fO = cg.b.o(this.f2871b.g(), f10, f11);
        float f12 = f11 - f10;
        return cg.b.o(f12 == 0.0f ? 0.0f : (fO - f10) / f12, 0.0f, 1.0f);
    }

    public final void d(float f10) {
        if (this.f2873d) {
            kj.d dVar = this.f2870a;
            float f11 = dVar.f9663a;
            float f12 = dVar.f9664b;
            f10 = v6.e(cg.b.o(f10, f11, f12), this.f2874e, f11, f12);
        }
        this.f2871b.h(f10);
    }
}
