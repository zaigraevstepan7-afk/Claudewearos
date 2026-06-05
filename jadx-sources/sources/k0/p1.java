package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: g, reason: collision with root package name */
    public static final qh.c f9229g = s1.k.b(new g3.z(14), new g3.y(24));

    /* renamed from: a, reason: collision with root package name */
    public final f1.f1 f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.f1 f9231b = new f1.f1(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public final f1.g1 f9232c = new f1.g1(0);

    /* renamed from: d, reason: collision with root package name */
    public b2.c f9233d = b2.c.f1501e;

    /* renamed from: e, reason: collision with root package name */
    public long f9234e = g3.m0.f7143b;

    /* renamed from: f, reason: collision with root package name */
    public final f1.j1 f9235f;

    public p1(x.o1 o1Var, float f10) {
        this.f9230a = new f1.f1(f10);
        this.f9235f = new f1.j1(o1Var, f1.f.f6293z);
    }

    public final void a(x.o1 o1Var, b2.c cVar, int i10, int i11) {
        float f10 = i11 - i10;
        this.f9231b.h(f10);
        float f11 = cVar.f1502a;
        float f12 = cVar.f1503b;
        b2.c cVar2 = this.f9233d;
        float f13 = cVar2.f1502a;
        f1.f1 f1Var = this.f9230a;
        if (f11 != f13 || f12 != cVar2.f1503b) {
            boolean z2 = o1Var == x.o1.f19664a;
            if (z2) {
                f11 = f12;
            }
            float f14 = z2 ? cVar.f1505d : cVar.f1504c;
            float fG = f1Var.g();
            float f15 = i10;
            float f16 = fG + f15;
            f1Var.h(f1Var.g() + ((f14 <= f16 && (f11 >= fG || f14 - f11 <= f15)) ? (f11 >= fG || f14 - f11 > f15) ? 0.0f : f11 - fG : f14 - f16));
            this.f9233d = cVar;
        }
        f1Var.h(cg.b.o(f1Var.g(), 0.0f, f10));
        this.f9232c.h(i10);
    }
}
