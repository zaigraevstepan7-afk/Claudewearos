package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 extends v1.n implements v2.w {
    public v0 H;
    public boolean I;

    @Override // v2.w
    public final int C(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return p0Var.v0(i10);
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return p0Var.l(i10);
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return this.H == v0.f1446a ? p0Var.O(i10) : p0Var.V(i10);
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return this.H == v0.f1446a ? p0Var.O(i10) : p0Var.V(i10);
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        int iO = this.H == v0.f1446a ? p0Var.O(s3.a.g(j)) : p0Var.V(s3.a.g(j));
        if (iO < 0) {
            iO = 0;
        }
        if (iO < 0) {
            s3.i.a("width must be >= 0");
        }
        long jH = s3.b.h(iO, iO, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.I) {
            jH = s3.b.e(j, jH);
        }
        t2.f1 f1VarY = p0Var.Y(jH);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new l(f1VarY, 2));
    }
}
