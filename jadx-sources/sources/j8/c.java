package j8;

import b0.l;
import d3.x;
import i8.h;
import i8.o;
import qi.t;
import qj.z;
import t.m1;
import t2.f1;
import t2.i;
import t2.p0;
import t2.r0;
import t2.s0;
import v1.n;
import v2.h0;
import v2.m;
import v2.n0;
import v2.w;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends n implements m, w, z1 {
    public v1.c H;
    public i I;
    public float J = 1.0f;
    public boolean K = true;
    public String L;
    public o M;
    public final i8.i N;

    public c(i8.i iVar, v1.c cVar, i iVar2, String str, o oVar) {
        this.H = cVar;
        this.I = iVar2;
        this.L = str;
        this.M = oVar;
        this.N = iVar;
    }

    @Override // v2.w
    public final int C(n0 n0Var, p0 p0Var, int i10) {
        long jB = s3.b.b(0, i10, 0, 0, 13);
        o oVar = this.M;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.N.h() == 9205357640488583168L) {
            return p0Var.v0(i10);
        }
        long jR1 = r1(jB);
        return Math.max(s3.a.i(jR1), p0Var.v0(i10));
    }

    @Override // v2.w
    public final int O(n0 n0Var, p0 p0Var, int i10) {
        long jB = s3.b.b(0, i10, 0, 0, 13);
        o oVar = this.M;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.N.h() == 9205357640488583168L) {
            return p0Var.l(i10);
        }
        long jR1 = r1(jB);
        return Math.max(s3.a.i(jR1), p0Var.l(i10));
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        long jQ1 = q1(bVar.a());
        long jA = this.H.a(g.a(jQ1), g.a(bVar.a()), h0Var.getLayoutDirection());
        int i10 = (int) (jA >> 32);
        int i11 = (int) (jA & 4294967295L);
        ac.d dVar = bVar.f5738b;
        long jY = dVar.y();
        dVar.h().f();
        try {
            ld.i iVar = (ld.i) dVar.f373b;
            ac.d dVar2 = (ac.d) iVar.f10924b;
            if (this.K) {
                iVar.w(0.0f, 0.0f, Float.intBitsToFloat((int) (dVar2.y() >> 32)), Float.intBitsToFloat((int) (dVar2.y() & 4294967295L)), 1);
            }
            iVar.U(i10, i11);
            this.N.g(h0Var, jQ1, this.J, null);
            dVar.h().q();
            dVar.Q(jY);
            h0Var.f();
        } catch (Throwable th2) {
            m1.r(dVar, jY);
            throw th2;
        }
    }

    @Override // v2.w
    public final int R0(n0 n0Var, p0 p0Var, int i10) {
        long jB = s3.b.b(0, 0, 0, i10, 7);
        o oVar = this.M;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.N.h() == 9205357640488583168L) {
            return p0Var.V(i10);
        }
        long jR1 = r1(jB);
        return Math.max(s3.a.j(jR1), p0Var.V(i10));
    }

    @Override // v2.w
    public final int b1(n0 n0Var, p0 p0Var, int i10) {
        long jB = s3.b.b(0, 0, 0, i10, 7);
        o oVar = this.M;
        if (oVar != null) {
            oVar.g(jB);
        }
        if (this.N.h() == 9205357640488583168L) {
            return p0Var.O(i10);
        }
        long jR1 = r1(jB);
        return Math.max(s3.a.j(jR1), p0Var.O(i10));
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        z zVarE1 = e1();
        i8.i iVar = this.N;
        iVar.E = zVarE1;
        iVar.d();
    }

    @Override // v1.n
    public final void j1() {
        this.N.c();
    }

    @Override // v1.n
    public final void k1() {
        this.N.m(null);
    }

    public final long q1(long j) {
        if (b2.e.f(j)) {
            return 0L;
        }
        long jH = this.N.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        long jA = this.I.a(jFloatToRawIntBits, j);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) > Float.MAX_VALUE) ? j : t2.z.o(jFloatToRawIntBits, jA);
    }

    @Override // v2.w
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        o oVar = this.M;
        if (oVar != null) {
            oVar.g(j);
        }
        f1 f1VarY = p0Var.Y(r1(j));
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, t.f13521a, new l(f1VarY, 10));
    }

    public final long r1(long j) {
        float fJ;
        int i10;
        float fO;
        boolean zF = s3.a.f(j);
        boolean zE = s3.a.e(j);
        if (zF && zE) {
            return j;
        }
        boolean z2 = s3.a.d(j) && s3.a.c(j);
        i8.i iVar = this.N;
        long jH = iVar.h();
        if (jH == 9205357640488583168L) {
            return (!z2 || ((h) iVar.M.f16351a.getValue()).a() == null) ? j : s3.a.a(j, s3.a.h(j), 0, s3.a.g(j), 0, 10);
        }
        if (z2 && (zF || zE)) {
            fJ = s3.a.h(j);
            i10 = s3.a.g(j);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i11 = g.f8753b;
                fJ = cg.b.o(fIntBitsToFloat, s3.a.j(j), s3.a.h(j));
            } else {
                fJ = s3.a.j(j);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i12 = g.f8753b;
                fO = cg.b.o(fIntBitsToFloat2, s3.a.i(j), s3.a.g(j));
                long jQ1 = q1((Float.floatToRawIntBits(fO) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
                return s3.a.a(j, s3.b.g(hj.a.H(Float.intBitsToFloat((int) (jQ1 >> 32))), j), 0, s3.b.f(hj.a.H(Float.intBitsToFloat((int) (jQ1 & 4294967295L))), j), 0, 10);
            }
            i10 = s3.a.i(j);
        }
        fO = i10;
        long jQ12 = q1((Float.floatToRawIntBits(fO) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32));
        return s3.a.a(j, s3.b.g(hj.a.H(Float.intBitsToFloat((int) (jQ12 >> 32))), j), 0, s3.b.f(hj.a.H(Float.intBitsToFloat((int) (jQ12 & 4294967295L))), j), 0, 10);
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        String str = this.L;
        if (str != null) {
            x.c(zVar, str);
            x.d(zVar, 5);
        }
    }
}
