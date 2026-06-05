package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public static final h6 f2196a = new h6();

    /* renamed from: b, reason: collision with root package name */
    public static final float f2197b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2198c;

    /* renamed from: d, reason: collision with root package name */
    public static final c2.j f2199d;

    static {
        float f10 = e1.e0.f5392o;
        f2197b = f10;
        f2198c = f10;
        f2199d = c2.l.a();
    }

    public static a6 d(f1.i0 i0Var) {
        w0 w0Var = (w0) i0Var.j(x0.f2845a);
        a6 a6Var = w0Var.f2792d0;
        if (a6Var != null) {
            return a6Var;
        }
        long jC = x0.c(w0Var, e1.e0.f5387i);
        e1.l lVar = e1.e0.f5380b;
        long jC2 = x0.c(w0Var, lVar);
        e1.l lVar2 = e1.e0.f5390m;
        long jC3 = x0.c(w0Var, lVar2);
        long jC4 = x0.c(w0Var, lVar2);
        long jC5 = x0.c(w0Var, lVar);
        long jK = c2.e0.k(c2.w.c(x0.c(w0Var, e1.e0.f5383e), e1.e0.f5384f), w0Var.f2806p);
        e1.l lVar3 = e1.e0.f5381c;
        long jC6 = x0.c(w0Var, lVar3);
        float f10 = e1.e0.f5382d;
        long jC7 = c2.w.c(jC6, f10);
        e1.l lVar4 = e1.e0.f5385g;
        long jC8 = x0.c(w0Var, lVar4);
        float f11 = e1.e0.f5386h;
        a6 a6Var2 = new a6(jC, jC2, jC3, jC4, jC5, jK, jC7, c2.w.c(jC8, f11), c2.w.c(x0.c(w0Var, lVar4), f11), c2.w.c(x0.c(w0Var, lVar3), f10));
        w0Var.f2792d0 = a6Var2;
        return a6Var2;
    }

    public static void e(e2.d dVar, x.o1 o1Var, long j, long j4, long j10, float f10, float f11) {
        b2.d dVar2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
        if (o1Var == x.o1.f19664a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            b2.c cVarG = uk.c.g(j, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            dVar2 = new b2.d(cVarG.f1502a, cVarG.f1503b, cVarG.f1504c, cVarG.f1505d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            b2.c cVarG2 = uk.c.g(j, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
            dVar2 = new b2.d(cVarG2.f1502a, cVarG2.f1503b, cVarG2.f1504c, cVarG2.f1505d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        c2.j jVar = f2199d;
        c2.j.c(jVar, dVar2);
        e2.d.F(dVar, jVar, j10, null, 60);
        jVar.k();
    }

    public final void a(final z.k kVar, v1.o oVar, final a6 a6Var, final boolean z2, long j, f1.i0 i0Var, final int i10) {
        final v1.o oVar2;
        final long j4;
        long j10;
        v1.o oVar3;
        i0Var.c0(-290277409);
        int i11 = 2;
        int i12 = i10 | (i0Var.f(kVar) ? 4 : 2) | 48 | (i0Var.f(a6Var) ? 256 : 128) | (i0Var.g(z2) ? 2048 : 1024) | 24576;
        if (i0Var.T(i12 & 1, (74899 & i12) != 74898)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                j10 = v6.f2777c;
                oVar3 = v1.l.f17564b;
            } else {
                i0Var.W();
                oVar3 = oVar;
                j10 = j;
            }
            i0Var.q();
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = new t1.q();
                i0Var.l0(objQ);
            }
            t1.q qVar = (t1.q) objQ;
            boolean z10 = (i12 & 14) == 4;
            Object objQ2 = i0Var.Q();
            if (z10 || objQ2 == fVar) {
                objQ2 = new y(kVar, qVar, null, i11);
                i0Var.l0(objQ2);
            }
            f1.s.f((ej.e) objQ2, i0Var, kVar);
            long jFloatToRawIntBits = !qVar.isEmpty() ? (Float.floatToRawIntBits(s3.h.b(j10) / 2) << 32) | (Float.floatToRawIntBits(s3.h.a(j10)) & 4294967295L) : j10;
            b0.i0 i0Var2 = b0.t1.f1431a;
            b0.d.e(i0Var, v.n.f(v.n.p(b0.t1.l(oVar3, s3.h.b(jFloatToRawIntBits), s3.h.a(jFloatToRawIntBits)), kVar), z2 ? a6Var.f1891a : a6Var.f1896f, p5.b(e1.e0.f5388k, i0Var)));
            j4 = j10;
            oVar2 = oVar3;
        } else {
            i0Var.W();
            oVar2 = oVar;
            j4 = j;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(kVar, oVar2, a6Var, z2, j4, i10) { // from class: c1.e6

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z.k f2059b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ v1.o f2060c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a6 f2061d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f2062e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f2063f;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(196609);
                    this.f2058a.a(this.f2059b, this.f2060c, this.f2061d, this.f2062e, this.f2063f, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public final void b(final x6 x6Var, v1.o oVar, final boolean z2, final a6 a6Var, ej.e eVar, ej.f fVar, float f10, float f11, f1.i0 i0Var, final int i10) {
        int i11;
        final v1.o oVar2;
        final ej.e eVar2;
        final ej.f fVar2;
        final float f12;
        final float f13;
        int i12;
        ej.e eVar3;
        float f14;
        ej.f fVar3;
        v1.o oVar3;
        float f15;
        i0Var.c0(49984771);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(x6Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 48;
        if ((i10 & 384) == 0) {
            i13 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= i0Var.f(a6Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        int i14 = i13 | 14352384;
        if ((100663296 & i10) == 0) {
            i14 |= i0Var.f(this) ? 67108864 : 33554432;
        }
        if (i0Var.T(i14 & 1, (38347923 & i14) != 38347922)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                boolean z10 = ((((i14 & 7168) ^ 3072) > 2048 && i0Var.f(a6Var)) || (i14 & 3072) == 2048) | ((i14 & 896) == 256);
                Object objQ = i0Var.Q();
                f1.f fVar4 = f1.m.f6385a;
                if (z10 || objQ == fVar4) {
                    objQ = new c6(a6Var, z2);
                    i0Var.l0(objQ);
                }
                ej.e eVar4 = (ej.e) objQ;
                i12 = i14 & (-57345);
                Object objQ2 = i0Var.Q();
                if (objQ2 == fVar4) {
                    objQ2 = y0.f2895c;
                    i0Var.l0(objQ2);
                }
                float f16 = v6.f2778d;
                eVar3 = eVar4;
                f14 = v6.f2779e;
                fVar3 = (ej.f) objQ2;
                oVar3 = v1.l.f17564b;
                f15 = f16;
            } else {
                i0Var.W();
                i12 = i14 & (-57345);
                oVar3 = oVar;
                eVar3 = eVar;
                fVar3 = fVar;
                f15 = f10;
                f14 = f11;
            }
            i0Var.q();
            int i15 = i12 << 3;
            c(x6Var, oVar3, z2, a6Var, eVar3, fVar3, f15, f14, i0Var, 805306416 | (i12 & 14) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024), ((i12 >> 21) & 112) | 6);
            oVar2 = oVar3;
            f13 = f14;
            f12 = f15;
            fVar2 = fVar3;
            eVar2 = eVar3;
        } else {
            i0Var.W();
            oVar2 = oVar;
            eVar2 = eVar;
            fVar2 = fVar;
            f12 = f10;
            f13 = f11;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.d6
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f2022a.b(x6Var, oVar2, z2, a6Var, eVar2, fVar2, f12, f13, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public final void c(final x6 x6Var, final v1.o oVar, final boolean z2, final a6 a6Var, final ej.e eVar, final ej.f fVar, final float f10, final float f11, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        float f12;
        int i13;
        f1.i0 i0Var2;
        long j;
        long j4;
        v1.o oVar2;
        i0Var.c0(133396521);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.h(x6Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.c(Float.NaN) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.g(z2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.f(a6Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= i0Var.h(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= i0Var.h(fVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            f12 = f10;
            i12 |= i0Var.c(f12) ? 8388608 : 4194304;
        } else {
            f12 = f10;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= i0Var.c(f11) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= i0Var.g(false) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (i0Var.g(false) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (i0Var.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            final long jA = a6Var.a(z2, false);
            long jA2 = a6Var.a(z2, true);
            if (z2) {
                j = jA2;
                j4 = a6Var.f1895e;
            } else {
                j = jA2;
                j4 = a6Var.j;
            }
            long j10 = z2 ? a6Var.f1893c : a6Var.f1898h;
            v1.o oVarC = x6Var.f2879k == x.o1.f19664a ? b0.t1.o(v6.f2775a, oVar).c(b0.t1.f1432b) : b0.t1.e(v6.f2775a, b0.t1.c(1.0f, oVar));
            int i14 = i12 & 112;
            int i15 = i12;
            boolean zH = (i14 == 32) | i0Var.h(x6Var);
            Object objQ = i0Var.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (zH || objQ == fVar2) {
                objQ = new ab.a0(x6Var, 1);
                i0Var.l0(objQ);
            }
            v1.o oVarC2 = oVarC.c(t2.z.k(v1.l.f17564b, (ej.f) objQ));
            boolean zH2 = ((i15 & 29360128) == 8388608) | (i14 == 32) | i0Var.h(x6Var) | i0Var.e(jA) | i0Var.e(j) | i0Var.e(j4) | i0Var.e(j10) | ((i15 & 234881024) == 67108864) | ((i15 & 458752) == 131072) | ((i15 & 3670016) == 1048576) | ((i15 & 1879048192) == 536870912) | ((i13 & 14) == 4);
            Object objQ2 = i0Var.Q();
            if (zH2 || objQ2 == fVar2) {
                final long j11 = j10;
                i0Var2 = i0Var;
                final long j12 = j4;
                oVar2 = oVarC2;
                final float f13 = f12;
                final long j13 = j;
                ej.c cVar = new ej.c() { // from class: c1.f6
                    /* JADX WARN: Removed duplicated region for block: B:127:0x0336  */
                    @Override // ej.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 971
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: c1.f6.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                i0Var2.l0(cVar);
                objQ2 = cVar;
            } else {
                i0Var2 = i0Var;
                oVar2 = oVarC2;
            }
            v.n.a(oVar2, (ej.c) objQ2, i0Var2, 0);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.g6
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f2139a.c(x6Var, oVar, z2, a6Var, eVar, fVar, f10, f11, (f1.i0) obj, f1.s.O(i10 | 1), f1.s.O(i11));
                    return pi.o.f13011a;
                }
            };
        }
    }
}
