package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends v1.n implements v2.w {
    public float H;

    @Override // v2.w
    public final int C(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.H) : p0Var.v0(i10);
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.H) : p0Var.l(i10);
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.H) : p0Var.V(i10);
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.H) : p0Var.O(i10);
    }

    public final long q1(long j, boolean z2) {
        int iRound;
        int iG = s3.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.H)) <= 0) {
            return 0L;
        }
        if (!z2 || d.m(iRound, j, iG)) {
            return (iRound << 32) | (iG & 4294967295L);
        }
        return 0L;
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        long jR1 = r1(j, true);
        if (s3.l.b(jR1, 0L)) {
            jR1 = q1(j, true);
            if (s3.l.b(jR1, 0L)) {
                jR1 = t1(j, true);
                if (s3.l.b(jR1, 0L)) {
                    jR1 = s1(j, true);
                    if (s3.l.b(jR1, 0L)) {
                        jR1 = r1(j, false);
                        if (s3.l.b(jR1, 0L)) {
                            jR1 = q1(j, false);
                            if (s3.l.b(jR1, 0L)) {
                                jR1 = t1(j, false);
                                if (s3.l.b(jR1, 0L)) {
                                    jR1 = s1(j, false);
                                    if (s3.l.b(jR1, 0L)) {
                                        jR1 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!s3.l.b(jR1, 0L)) {
            int i10 = (int) (jR1 >> 32);
            int i11 = (int) (jR1 & 4294967295L);
            if (!((i11 >= 0) & (i10 >= 0))) {
                s3.i.a("width and height must be >= 0");
            }
            j = s3.b.h(i10, i10, i11, i11);
        }
        t2.f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new l(f1VarY, 0));
    }

    public final long r1(long j, boolean z2) {
        int iRound;
        int iH = s3.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.H)) <= 0) {
            return 0L;
        }
        if (!z2 || d.m(iH, j, iRound)) {
            return (iH << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    public final long s1(long j, boolean z2) {
        int i10 = s3.a.i(j);
        int iRound = Math.round(i10 * this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z2 || d.m(iRound, j, i10)) {
            return (iRound << 32) | (i10 & 4294967295L);
        }
        return 0L;
    }

    public final long t1(long j, boolean z2) {
        int iJ = s3.a.j(j);
        int iRound = Math.round(iJ / this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z2 || d.m(iJ, j, iRound)) {
            return (iJ << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }
}
