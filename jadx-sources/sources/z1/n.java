package z1;

import qi.t;
import t2.f1;
import t2.p0;
import t2.r0;
import t2.s0;
import t2.z;
import v2.h0;
import v2.n0;
import v2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends v1.n implements w, v2.m {
    public h2.b H;
    public boolean I;
    public v1.c J;
    public t2.i K;
    public float L;
    public c2.n M;

    public static boolean r1(long j) {
        return !b2.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040;
    }

    public static boolean s1(long j) {
        return !b2.e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) < 2139095040;
    }

    @Override // v2.w
    public final int C(n0 n0Var, p0 p0Var, int i10) {
        if (!q1()) {
            return p0Var.v0(i10);
        }
        long jT1 = t1(s3.b.b(0, i10, 0, 0, 13));
        return Math.max(s3.a.i(jT1), p0Var.v0(i10));
    }

    @Override // v2.w
    public final int O(n0 n0Var, p0 p0Var, int i10) {
        if (!q1()) {
            return p0Var.l(i10);
        }
        long jT1 = t1(s3.b.b(0, i10, 0, 0, 13));
        return Math.max(s3.a.i(jT1), p0Var.l(i10));
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        long jH = this.H.h();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(s1(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.a() >> 32))) << 32) | (Float.floatToRawIntBits(r1(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.a() & 4294967295L))) & 4294967295L);
        long jO = (Float.intBitsToFloat((int) (bVar.a() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) == 0.0f) ? 0L : z.o(jFloatToRawIntBits, this.K.a(jFloatToRawIntBits, bVar.a()));
        long jA = this.J.a((Math.round(Float.intBitsToFloat((int) (jO >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jO & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.a() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.a() & 4294967295L))) & 4294967295L), h0Var.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        ((ld.i) bVar.f5738b.f373b).U(f10, f11);
        try {
            this.H.g(h0Var, jO, this.L, this.M);
            ((ld.i) bVar.f5738b.f373b).U(-f10, -f11);
            h0Var.f();
        } catch (Throwable th2) {
            ((ld.i) bVar.f5738b.f373b).U(-f10, -f11);
            throw th2;
        }
    }

    @Override // v2.w
    public final int R0(n0 n0Var, p0 p0Var, int i10) {
        if (!q1()) {
            return p0Var.V(i10);
        }
        long jT1 = t1(s3.b.b(0, 0, 0, i10, 7));
        return Math.max(s3.a.j(jT1), p0Var.V(i10));
    }

    @Override // v2.w
    public final int b1(n0 n0Var, p0 p0Var, int i10) {
        if (!q1()) {
            return p0Var.O(i10);
        }
        long jT1 = t1(s3.b.b(0, 0, 0, i10, 7));
        return Math.max(s3.a.j(jT1), p0Var.O(i10));
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    public final boolean q1() {
        return this.I && this.H.h() != 9205357640488583168L;
    }

    @Override // v2.w
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        f1 f1VarY = p0Var.Y(t1(j));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, t.f13521a, new s.w(f1VarY, 6));
    }

    public final long t1(long j) {
        boolean z2 = false;
        boolean z10 = s3.a.d(j) && s3.a.c(j);
        if (s3.a.f(j) && s3.a.e(j)) {
            z2 = true;
        }
        if ((!q1() && z10) || z2) {
            return s3.a.a(j, s3.a.h(j), 0, s3.a.g(j), 0, 10);
        }
        long jH = this.H.h();
        int iRound = s1(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : s3.a.j(j);
        int iRound2 = r1(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : s3.a.i(j);
        int iG = s3.b.g(iRound, j);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(s3.b.f(iRound2, j)) & 4294967295L) | (Float.floatToRawIntBits(iG) << 32);
        if (q1()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!s1(this.H.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.H.h() >> 32))) << 32) | (Float.floatToRawIntBits(!r1(this.H.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.H.h() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : z.o(jFloatToRawIntBits2, this.K.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return s3.a.a(j, s3.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, s3.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.H + ", sizeToIntrinsics=" + this.I + ", alignment=" + this.J + ", alpha=" + this.L + ", colorFilter=" + this.M + ')';
    }
}
