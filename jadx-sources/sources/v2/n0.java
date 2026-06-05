package v2;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n0 extends t2.f1 implements y0, t2.s0 {
    public v1 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final t2.n0 E = new t2.n0(this, 0);
    public m.m F;
    public q.g0 G;

    /* renamed from: f, reason: collision with root package name */
    public k0 f17731f;

    /* renamed from: z, reason: collision with root package name */
    public ej.c f17732z;

    public static void i1(i1 i1Var) {
        g0 g0Var;
        i1 i1Var2 = i1Var.I;
        f0 f0Var = i1Var.H;
        if (!fj.l.b(i1Var2 != null ? i1Var2.H : null, f0Var)) {
            f0Var.Z.f17703p.Q.f();
            return;
        }
        a aVarD = f0Var.Z.f17703p.D();
        if (aVarD == null || (g0Var = ((v0) aVarD).Q) == null) {
            return;
        }
        g0Var.f();
    }

    @Override // t2.s0
    public final t2.r0 D0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            s2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new m0(i10, i11, map, cVar, cVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(v2.f0 r32, t2.o r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.n0.O0(v2.f0, t2.o):void");
    }

    public abstract int P0(t2.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(v1 v1Var, long j, long j4) {
        boolean z2;
        char c6;
        long j10;
        long j11;
        long j12;
        f0 f0Var;
        boolean z10;
        int i10;
        char c10;
        long j13;
        t1 snapshotObserver;
        q.g0 g0Var = this.G;
        m.m mVar = this.F;
        if (mVar == null) {
            mVar = new m.m();
            this.F = mVar;
        }
        m.m mVar2 = mVar;
        r1 r1Var = d1().G;
        if (r1Var != null && (snapshotObserver = ((w2.t) r1Var).getSnapshotObserver()) != null) {
            snapshotObserver.f17770a.c(v1Var, d.f17596c, new l0(this, j, j4, v1Var));
        }
        boolean zT0 = t0();
        q.h0 h0Var = (q.h0) mVar2.f11128e;
        q.h0 h0Var2 = (q.h0) mVar2.f11129f;
        int i11 = mVar2.f11124a;
        for (int i12 = 0; i12 < i11; i12++) {
            byte b10 = ((byte[]) mVar2.f11127d)[i12];
            if (b10 == 3) {
                t2.o oVar = ((t2.o[]) mVar2.f11125b)[i12];
                fj.l.c(oVar);
                h0Var2.j(oVar);
            } else if (b10 != 0 && g0Var != null) {
                t2.o oVar2 = ((t2.o[]) mVar2.f11125b)[i12];
                fj.l.c(oVar2);
                q.h0 h0Var3 = (q.h0) g0Var.k(oVar2);
                if (h0Var3 != null) {
                    h0Var.k(h0Var3);
                }
            }
        }
        int i13 = mVar2.f11124a;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte[] bArr = (byte[]) mVar2.f11127d;
            if (bArr[i15] == 2) {
                i14++;
            } else if (i14 > 0) {
                t2.o[] oVarArr = (t2.o[]) mVar2.f11125b;
                oVarArr[i15 - i14] = oVarArr[i15];
            }
            bArr[i15] = 2;
        }
        int i16 = mVar2.f11124a;
        for (int i17 = i16 - i14; i17 < i16; i17++) {
            ((t2.o[]) mVar2.f11125b)[i17] = null;
        }
        mVar2.f11124a -= i14;
        n0 n0VarF1 = f1();
        Object[] objArr = h0Var2.f13082b;
        long[] jArr = h0Var2.f13081a;
        int length = jArr.length - 2;
        char c11 = 7;
        long j14 = -9187201950435737472L;
        int i18 = 8;
        if (length >= 0) {
            j11 = 128;
            int i19 = 0;
            while (true) {
                long j15 = jArr[i19];
                j12 = 255;
                if ((((~j15) << c11) & j15 & j14) != j14) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j15 & 255) < 128) {
                            c10 = c11;
                            t2.o oVar3 = (t2.o) objArr[(i19 << 3) + i21];
                            j13 = j14;
                            n0 n0Var = n0VarF1 == null ? this : n0VarF1;
                            i10 = i18;
                            n0 n0Var2 = n0Var;
                            while (true) {
                                m.m mVar3 = n0Var2.F;
                                if (mVar3 != null) {
                                    z10 = zT0;
                                    if (!qi.k.d0((t2.o[]) mVar3.f11125b, oVar3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z10 = zT0;
                                n0 n0VarF12 = n0Var2.f1();
                                if (n0VarF12 == null) {
                                    break;
                                }
                                n0Var2 = n0VarF12;
                                zT0 = z10;
                            }
                            q.g0 g0Var2 = n0Var2.G;
                            q.h0 h0Var4 = g0Var2 != null ? (q.h0) g0Var2.k(oVar3) : null;
                            if (h0Var4 != null) {
                                n0Var.j1(h0Var4);
                            }
                        } else {
                            z10 = zT0;
                            i10 = i18;
                            c10 = c11;
                            j13 = j14;
                        }
                        j15 >>= i10;
                        i21++;
                        c11 = c10;
                        j14 = j13;
                        i18 = i10;
                        zT0 = z10;
                    }
                    z2 = zT0;
                    c6 = c11;
                    j10 = j14;
                    if (i20 != i18) {
                        break;
                    }
                } else {
                    z2 = zT0;
                    c6 = c11;
                    j10 = j14;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                c11 = c6;
                j14 = j10;
                zT0 = z2;
                i18 = 8;
            }
        } else {
            z2 = zT0;
            c6 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        h0Var2.b();
        Object[] objArr2 = h0Var.f13082b;
        long[] jArr2 = h0Var.f13081a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i22 = 0;
            while (true) {
                long j16 = jArr2[i22];
                if ((((~j16) << c6) & j16 & j10) != j10) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j16 & j12) < j11 && (f0Var = (f0) ((g2) objArr2[(i22 << 3) + i24]).get()) != null) {
                            if (z2) {
                                f0Var.S(false);
                            } else {
                                f0Var.U(false);
                            }
                        }
                        j16 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        h0Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(t2.r0 r15) {
        /*
            r14 = this;
            q.g0 r0 = r14.G
            boolean r1 = r14.D
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            ej.c r1 = r15.h()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f13075c
            long[] r1 = r0.f13073a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            q.h0 r10 = (q.h0) r10
            r14.j1(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            ej.c r0 = r14.f17732z
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            v2.k0 r1 = r14.h1()
            boolean r1 = r1.f17706a
            if (r1 == 0) goto L9b
            t2.w r0 = r14.Z0()
            long r4 = r0.X(r4)
            long r4 = yd.f.d0(r4)
            long r0 = r0.I()
            v2.k0 r6 = r14.h1()
            long r6 = r6.f17707b
            boolean r6 = s3.j.a(r4, r6)
            if (r6 == 0) goto L96
            v2.k0 r6 = r14.h1()
            long r6 = r6.f17708c
            boolean r6 = s3.l.b(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            v2.v1 r0 = r14.A
            if (r0 == 0) goto Lad
            r0.f17795a = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            v2.v1 r0 = new v2.v1
            r0.<init>(r15, r14)
            r14.A = r0
            goto Laa
        Lb5:
            r1.R0(r2, r3, r5)
            ej.c r15 = r15.h()
            r1.f17732z = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.n0.U0(t2.r0):void");
    }

    public abstract n0 X0();

    public abstract t2.w Z0();

    public abstract boolean b1();

    public abstract f0 d1();

    public abstract t2.r0 e1();

    public abstract n0 f1();

    @Override // v2.y0
    public final void g0(boolean z2) {
        n0 n0VarF1 = f1();
        f0 f0VarD1 = n0VarF1 != null ? n0VarF1.d1() : null;
        if (fj.l.b(f0VarD1, d1())) {
            this.B = z2;
            return;
        }
        if ((f0VarD1 != null ? f0VarD1.Z.f17692d : null) != b0.f17577c) {
            if ((f0VarD1 != null ? f0VarD1.Z.f17692d : null) != b0.f17578d) {
                return;
            }
        }
        this.B = z2;
    }

    public abstract long g1();

    public final k0 h1() {
        k0 k0Var = this.f17731f;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(this);
        this.f17731f = k0Var2;
        return k0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j1(q.h0 h0Var) {
        f0 f0Var;
        Object[] objArr = h0Var.f13082b;
        long[] jArr = h0Var.f13081a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128 && (f0Var = (f0) ((g2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (t0()) {
                            f0Var.S(false);
                        } else {
                            f0Var.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public abstract void k1();

    @Override // t2.r
    public boolean t0() {
        return false;
    }

    @Override // t2.f1
    public final int x0(t2.a aVar) {
        int iP0;
        if (b1() && (iP0 = P0(aVar)) != Integer.MIN_VALUE) {
            return iP0 + ((int) (aVar instanceof t2.s1 ? this.f15554e >> 32 : this.f15554e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }
}
