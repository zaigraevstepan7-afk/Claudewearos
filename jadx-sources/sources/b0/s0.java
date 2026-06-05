package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class s0 extends o0 implements v2.w {
    public d2 J;

    public s0(d2 d2Var) {
        this.J = d2Var;
    }

    @Override // b0.o0
    public final d2 q1(d2 d2Var) {
        return new x1(d2Var, this.J);
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        int iC = this.I.c(s0Var, s0Var.getLayoutDirection()) - this.H.c(s0Var, s0Var.getLayoutDirection());
        int iD = this.I.d(s0Var) - this.H.d(s0Var);
        int iA = (this.I.a(s0Var, s0Var.getLayoutDirection()) - this.H.a(s0Var, s0Var.getLayoutDirection())) + iC;
        int iB = (this.I.b(s0Var) - this.H.b(s0Var)) + iD;
        t2.f1 f1VarY = p0Var.Y(s3.b.i(-iA, j, -iB));
        return s0Var.B(s3.b.g(f1VarY.f15550a + iA, j), s3.b.f(f1VarY.f15551b + iB, j), qi.t.f13521a, new r0(f1VarY, iC, iD, 0));
    }

    @Override // b0.o0
    public final void r1() {
        super.r1();
        v2.n.n(this);
    }
}
