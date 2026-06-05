package e2;

import c2.j;
import c2.n;
import c2.p;
import c2.p0;
import c2.s;
import s3.m;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface d extends s3.c {
    static /* synthetic */ void A0(d dVar, c2.g gVar, n nVar, int i10) {
        if ((i10 & 16) != 0) {
            nVar = null;
        }
        dVar.Y0(gVar, nVar);
    }

    static /* synthetic */ void B0(d dVar, j jVar, s sVar, float f10, h hVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        e eVar = hVar;
        if ((i10 & 8) != 0) {
            eVar = g.f5743a;
        }
        dVar.T0(jVar, sVar, f11, eVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void F(d dVar, j jVar, long j, e eVar, int i10) {
        if ((i10 & 8) != 0) {
            eVar = g.f5743a;
        }
        dVar.S0(jVar, j, eVar);
    }

    static void H(h0 h0Var, s sVar, long j, long j4, long j10, e eVar, int i10) {
        if ((i10 & 2) != 0) {
            j = 0;
        }
        long j11 = j;
        h0Var.r(sVar, j11, (i10 & 4) != 0 ? m0(h0Var.f17669a.a(), j11) : j4, j10, 1.0f, (i10 & 32) != 0 ? g.f5743a : eVar);
    }

    static void K0(d dVar, c2.g gVar, long j, long j4, float f10, n nVar, int i10, int i11) {
        dVar.T(gVar, 0L, j, (i11 & 16) != 0 ? j : j4, (i11 & 32) != 0 ? 1.0f : f10, nVar, (i11 & 512) != 0 ? 1 : i10);
    }

    static /* synthetic */ void P(d dVar, s sVar, long j, long j4, float f10, e eVar, n nVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            j = 0;
        }
        long j10 = j;
        dVar.W(sVar, j10, (i11 & 4) != 0 ? m0(dVar.a(), j10) : j4, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? g.f5743a : eVar, (i11 & 32) != 0 ? null : nVar, (i11 & 64) != 0 ? 3 : i10);
    }

    static /* synthetic */ void V0(d dVar, long j, float f10, long j4, e eVar, int i10) {
        if ((i10 & 4) != 0) {
            j4 = dVar.L0();
        }
        long j10 = j4;
        if ((i10 & 16) != 0) {
            eVar = g.f5743a;
        }
        dVar.H0(j, f10, j10, eVar);
    }

    static /* synthetic */ void c1(d dVar, long j, long j4, long j10, float f10, h hVar, int i10, int i11) {
        long j11 = (i11 & 2) != 0 ? 0L : j4;
        dVar.e0(j, j11, (i11 & 4) != 0 ? m0(dVar.a(), j11) : j10, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? g.f5743a : hVar, (i11 & 64) != 0 ? 3 : i10);
    }

    static long m0(long j, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    static void s0(h0 h0Var, f2.b bVar, ej.c cVar) {
        h0Var.n0(bVar, cg.b.R(h0Var.f17669a.a()), cVar);
    }

    ac.d C0();

    void H0(long j, float f10, long j4, e eVar);

    default long L0() {
        return x8.a.z(C0().y());
    }

    void R(long j, long j4, long j10, float f10, int i10);

    void S(long j, float f10, float f11, long j4, long j10, e eVar);

    void S0(j jVar, long j, e eVar);

    void T(c2.g gVar, long j, long j4, long j10, float f10, n nVar, int i10);

    void T0(j jVar, s sVar, float f10, e eVar, int i10);

    void W(s sVar, long j, long j4, float f10, e eVar, n nVar, int i10);

    void Y0(c2.g gVar, n nVar);

    default long a() {
        return C0().y();
    }

    void e0(long j, long j4, long j10, float f10, e eVar, int i10);

    void f0(long j, long j4, long j10, long j11, e eVar);

    m getLayoutDirection();

    void k0(p0 p0Var, float f10, long j);

    default void n0(f2.b bVar, long j, ej.c cVar) {
        bVar.e(this, getLayoutDirection(), j, new p(2, this, cVar));
    }
}
