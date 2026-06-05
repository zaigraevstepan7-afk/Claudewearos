package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends v1.n implements v2.w {
    public g0 H;
    public float I;

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!s3.a.d(j) || this.H == g0.f1333a) {
            iJ = s3.a.j(j);
            iH = s3.a.h(j);
        } else {
            int iRound = Math.round(s3.a.h(j) * this.I);
            int iJ2 = s3.a.j(j);
            iJ = s3.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!s3.a.c(j) || this.H == g0.f1334b) {
            int i10 = s3.a.i(j);
            iG = s3.a.g(j);
            iG2 = i10;
        } else {
            int iRound2 = Math.round(s3.a.g(j) * this.I);
            int i11 = s3.a.i(j);
            iG2 = s3.a.g(j);
            if (iRound2 < i11) {
                iRound2 = i11;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        t2.f1 f1VarY = p0Var.Y(s3.b.a(iJ, iH, iG2, iG));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new l(f1VarY, 1));
    }
}
