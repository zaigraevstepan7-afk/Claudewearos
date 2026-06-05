package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u1 extends v1.n implements v2.w {
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;

    @Override // v2.w
    public final int C(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        long jQ1 = q1(n0Var);
        if (s3.a.e(jQ1)) {
            return s3.a.g(jQ1);
        }
        if (!this.L) {
            i10 = s3.b.g(i10, jQ1);
        }
        return s3.b.f(p0Var.v0(i10), jQ1);
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        long jQ1 = q1(n0Var);
        if (s3.a.e(jQ1)) {
            return s3.a.g(jQ1);
        }
        if (!this.L) {
            i10 = s3.b.g(i10, jQ1);
        }
        return s3.b.f(p0Var.l(i10), jQ1);
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        long jQ1 = q1(n0Var);
        if (s3.a.f(jQ1)) {
            return s3.a.h(jQ1);
        }
        if (!this.L) {
            i10 = s3.b.f(i10, jQ1);
        }
        return s3.b.g(p0Var.V(i10), jQ1);
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        long jQ1 = q1(n0Var);
        if (s3.a.f(jQ1)) {
            return s3.a.h(jQ1);
        }
        if (!this.L) {
            i10 = s3.b.f(i10, jQ1);
        }
        return s3.b.g(p0Var.O(i10), jQ1);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q1(t2.s0 r7) {
        /*
            r6 = this;
            float r0 = r6.J
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.J
            int r0 = r7.I0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.K
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.K
            int r3 = r7.I0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.H
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.H
            int r4 = r7.I0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.I
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.I
            int r7 = r7.I0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = s3.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.u1.q1(t2.s0):long");
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        int iJ;
        int iH;
        int i10;
        int iG;
        long jA;
        long jQ1 = q1(s0Var);
        if (this.L) {
            jA = s3.b.e(j, jQ1);
        } else {
            if (Float.isNaN(this.H)) {
                iJ = s3.a.j(j);
                int iH2 = s3.a.h(jQ1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = s3.a.j(jQ1);
            }
            if (Float.isNaN(this.J)) {
                iH = s3.a.h(j);
                int iJ2 = s3.a.j(jQ1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = s3.a.h(jQ1);
            }
            if (Float.isNaN(this.I)) {
                i10 = s3.a.i(j);
                int iG2 = s3.a.g(jQ1);
                if (i10 > iG2) {
                    i10 = iG2;
                }
            } else {
                i10 = s3.a.i(jQ1);
            }
            if (Float.isNaN(this.K)) {
                iG = s3.a.g(j);
                int i11 = s3.a.i(jQ1);
                if (iG < i11) {
                    iG = i11;
                }
            } else {
                iG = s3.a.g(jQ1);
            }
            jA = s3.b.a(iJ, iH, i10, iG);
        }
        t2.f1 f1VarY = p0Var.Y(jA);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new l(f1VarY, 3));
    }
}
