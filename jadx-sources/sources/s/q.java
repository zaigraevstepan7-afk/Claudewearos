package s;

import t.e1;
import t.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends x0 {
    public f1 H;
    public f1.a1 I;
    public r J;
    public long K;

    @Override // v1.n
    public final void k1() {
        this.K = j.f14632a;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        long j4;
        t2.f1 f1VarY = p0Var.Y(j);
        if (s0Var.t0()) {
            j4 = (f1VarY.f15550a << 32) | (f1VarY.f15551b & 4294967295L);
        } else {
            f1 f1Var = this.H;
            if (f1Var == null) {
                j4 = (f1VarY.f15550a << 32) | (f1VarY.f15551b & 4294967295L);
                this.K = j4;
            } else {
                long j10 = (f1VarY.f15551b & 4294967295L) | (f1VarY.f15550a << 32);
                e1 e1VarA = f1Var.a(new c2.x0(this, j10), new p0(this, j10, 3));
                this.J.getClass();
                j4 = ((s3.l) e1VarA.getValue()).f14751a;
                this.K = ((s3.l) e1VarA.getValue()).f14751a;
            }
        }
        return s0Var.B((int) (j4 >> 32), (int) (4294967295L & j4), qi.t.f13521a, new p(this, f1VarY, j4));
    }
}
