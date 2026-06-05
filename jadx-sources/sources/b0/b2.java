package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b2 extends v1.n implements v2.w {
    public float H;
    public float I;

    @Override // v2.w
    public final int C(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        int iV0 = p0Var.v0(i10);
        int iI0 = !Float.isNaN(this.I) ? n0Var.I0(this.I) : 0;
        return iV0 < iI0 ? iI0 : iV0;
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        int iL = p0Var.l(i10);
        int iI0 = !Float.isNaN(this.I) ? n0Var.I0(this.I) : 0;
        return iL < iI0 ? iI0 : iL;
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        int iV = p0Var.V(i10);
        int iI0 = !Float.isNaN(this.H) ? n0Var.I0(this.H) : 0;
        return iV < iI0 ? iI0 : iV;
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        int iO = p0Var.O(i10);
        int iI0 = !Float.isNaN(this.H) ? n0Var.I0(this.H) : 0;
        return iO < iI0 ? iI0 : iO;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        int iJ;
        int i10;
        if (Float.isNaN(this.H) || s3.a.j(j) != 0) {
            iJ = s3.a.j(j);
        } else {
            int iI0 = s0Var.I0(this.H);
            iJ = s3.a.h(j);
            if (iI0 < 0) {
                iI0 = 0;
            }
            if (iI0 <= iJ) {
                iJ = iI0;
            }
        }
        int iH = s3.a.h(j);
        if (Float.isNaN(this.I) || s3.a.i(j) != 0) {
            i10 = s3.a.i(j);
        } else {
            int iI02 = s0Var.I0(this.I);
            i10 = s3.a.g(j);
            int i11 = iI02 >= 0 ? iI02 : 0;
            if (i11 <= i10) {
                i10 = i11;
            }
        }
        t2.f1 f1VarY = p0Var.Y(s3.b.a(iJ, iH, i10, s3.a.g(j)));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new l(f1VarY, 4));
    }
}
