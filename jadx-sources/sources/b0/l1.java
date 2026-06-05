package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 extends v1.n implements v2.w {
    public i1 H;

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        float fB = this.H.b(s0Var.getLayoutDirection());
        float fD = this.H.d();
        float fC = this.H.c(s0Var.getLayoutDirection());
        float fA = this.H.a();
        float f10 = 0;
        if (!((s3.f.b(fA, f10) >= 0) & (s3.f.b(fB, f10) >= 0) & (s3.f.b(fD, f10) >= 0) & (s3.f.b(fC, f10) >= 0))) {
            c0.a.a("Padding must be non-negative");
        }
        int iI0 = s0Var.I0(fB);
        int iI02 = s0Var.I0(fC) + iI0;
        int iI03 = s0Var.I0(fD);
        int iI04 = s0Var.I0(fA) + iI03;
        t2.f1 f1VarY = p0Var.Y(s3.b.i(-iI02, j, -iI04));
        return s0Var.B(s3.b.g(f1VarY.f15550a + iI02, j), s3.b.f(f1VarY.f15551b + iI04, j), qi.t.f13521a, new r0(f1VarY, iI0, iI03, 1));
    }
}
