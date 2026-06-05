package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends v1.n implements v2.i, v2.w0 {
    public o1 H;
    public final l2 I;
    public boolean J;
    public d K;
    public final b2 L;
    public boolean N;
    public boolean P;
    public final yh.c M = new yh.c(25);
    public long O = j.f19570a;

    public i(o1 o1Var, l2 l2Var, boolean z2, d dVar, b2 b2Var) {
        this.H = o1Var;
        this.I = l2Var;
        this.J = z2;
        this.K = dVar;
        this.L = b2Var;
    }

    public static final float q1(i iVar, d dVar, long j) {
        char c6;
        b2.c cVar;
        int iCompare;
        long j4 = iVar.O;
        g1.e eVar = (g1.e) iVar.M.f20314b;
        int i10 = eVar.f7026c - 1;
        Object[] objArr = eVar.f7024a;
        if (i10 < objArr.length) {
            cVar = null;
            while (true) {
                if (i10 < 0) {
                    c6 = ' ';
                    break;
                }
                b2.c cVar2 = (b2.c) ((g) objArr[i10]).f19528a.a();
                if (cVar2 != null) {
                    long jC = cVar2.c();
                    long jS = cg.b.S(iVar.r1());
                    c6 = ' ';
                    int iOrdinal = iVar.H.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jS & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new b3.e();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jS >> 32)));
                    }
                    if (iCompare <= 0) {
                        cVar = cVar2;
                    } else if (cVar == null) {
                        cVar = cVar2;
                    }
                }
                i10--;
            }
        } else {
            c6 = ' ';
            cVar = null;
        }
        if (cVar == null) {
            b2.c cVar3 = iVar.N ? (b2.c) iVar.L.a() : null;
            if (cVar3 == null) {
                return 0.0f;
            }
            cVar = cVar3;
        }
        long jS2 = cg.b.S(j4);
        int iOrdinal2 = iVar.H.ordinal();
        if (iOrdinal2 == 0) {
            float f10 = cVar.f1503b;
            return dVar.a(f10 - ((int) (j & 4294967295L)), cVar.f1505d - f10, Float.intBitsToFloat((int) (jS2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new b3.e();
        }
        float f11 = cVar.f1502a;
        return dVar.a(f11 - ((int) (j >> c6)), cVar.f1504c - f11, Float.intBitsToFloat((int) (jS2 >> c6)));
    }

    public static boolean s1(i iVar, b2.c cVar, long j, long j4, int i10) {
        if ((i10 & 1) != 0) {
            j = iVar.r1();
        }
        long j10 = j;
        if ((i10 & 2) != 0) {
            j4 = 0;
        }
        long jU1 = iVar.u1(cVar, j10, j4);
        return Math.abs(Float.intBitsToFloat((int) (jU1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jU1 & 4294967295L))) <= 0.5f;
    }

    @Override // v2.w0
    public final void f(long j) {
        int iH;
        long j4;
        long j10;
        long j11;
        long jR1 = r1();
        this.O = j;
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            iH = fj.l.h((int) (j & 4294967295L), (int) (jR1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                throw new b3.e();
            }
            iH = fj.l.h((int) (j >> 32), (int) (jR1 >> 32));
        }
        if (iH >= 0) {
            return;
        }
        if (this.J) {
            j4 = 0;
        } else {
            if (this.H == o1.f19664a) {
                j10 = 0 << 32;
                j11 = ((int) (jR1 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j10 = (((int) (jR1 >> 32)) - ((int) (j >> 32))) << 32;
                j11 = 0;
            }
            j4 = j10 | (j11 & 4294967295L);
        }
        long j12 = j4;
        b2.c cVar = (b2.c) this.L.a();
        if (cVar == null || this.P || this.N || !s1(this, cVar, jR1, 0L, 2) || s1(this, cVar, 0L, j12, 1)) {
            return;
        }
        this.N = true;
        t1(j12);
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    public final long r1() {
        long j = this.O;
        if (s3.l.b(j, j.f19570a)) {
            return 0L;
        }
        return j;
    }

    public final void t1(long j) {
        d dVar = this.K;
        if (dVar == null) {
            dVar = (d) v2.n.h(this, f.f19517a);
        }
        d dVar2 = dVar;
        if (this.P) {
            a0.a.c("launchAnimation called when previous animation was running");
        }
        d dVar3 = this.K;
        if (dVar3 == null) {
            dVar3 = (d) v2.n.h(this, f.f19517a);
        }
        dVar3.getClass();
        d.f19482a.getClass();
        d3 d3Var = new d3(c.f19464b);
        qj.z zVarE1 = e1();
        qj.a0 a0Var = qj.a0.f13538a;
        qj.b0.w(zVarE1, null, new h(this, d3Var, dVar2, j, null), 1);
    }

    public final long u1(b2.c cVar, long j, long j4) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long jS = cg.b.S(j);
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            d dVar = this.K;
            if (dVar == null) {
                dVar = (d) v2.n.h(this, f.f19517a);
            }
            float f10 = cVar.f1503b;
            float fA = dVar.a(f10 - ((int) (j4 & 4294967295L)), cVar.f1505d - f10, Float.intBitsToFloat((int) (jS & 4294967295L)));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new b3.e();
            }
            d dVar2 = this.K;
            if (dVar2 == null) {
                dVar2 = (d) v2.n.h(this, f.f19517a);
            }
            float f11 = cVar.f1502a;
            jFloatToRawIntBits = Float.floatToRawIntBits(dVar2.a(f11 - ((int) (j4 >> 32)), cVar.f1504c - f11, Float.intBitsToFloat((int) (jS >> 32)))) << 32;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f) & 4294967295L;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }
}
