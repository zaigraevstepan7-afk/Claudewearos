package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j2 extends v1.n implements v2.w {
    public g0 H;
    public ej.e I;

    @Override // v2.w
    public final t2.r0 r(final t2.s0 s0Var, t2.p0 p0Var, long j) {
        final t2.f1 f1VarY = p0Var.Y(s3.b.a(this.H != g0.f1333a ? 0 : s3.a.j(j), s3.a.h(j), this.H == g0.f1334b ? s3.a.i(j) : 0, s3.a.g(j)));
        final int iP = cg.b.p(f1VarY.f15550a, s3.a.j(j), s3.a.h(j));
        final int iP2 = cg.b.p(f1VarY.f15551b, s3.a.i(j), s3.a.g(j));
        return s0Var.B(iP, iP2, qi.t.f13521a, new ej.c() { // from class: b0.i2
            @Override // ej.c
            public final Object invoke(Object obj) {
                ej.e eVar = this.f1354a.I;
                t2.e1.C((t2.e1) obj, f1VarY, ((s3.j) eVar.invoke(new s3.l(((iP - r1.f15550a) << 32) | ((iP2 - r1.f15551b) & 4294967295L)), s0Var.getLayoutDirection())).f14745a);
                return pi.o.f13011a;
            }
        });
    }
}
