package e3;

import a2.f0;
import ak.x;
import c2.e0;
import q.b0;
import s3.j;
import v2.b1;
import v2.i1;
import v2.q1;
import v2.v0;
import w2.l1;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t f5751a;

    /* renamed from: b, reason: collision with root package name */
    public final x f5752b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5753c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f5754d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5755e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5756f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5757g;

    /* renamed from: h, reason: collision with root package name */
    public p0.c f5758h;

    /* renamed from: i, reason: collision with root package name */
    public long f5759i;
    public final f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final b2.a f5760k;

    public b(t tVar) {
        this.f5751a = tVar;
        x xVar = new x(1);
        xVar.f743c = new long[192];
        xVar.f744d = new long[192];
        this.f5752b = xVar;
        this.f5753c = new e();
        this.f5754d = new b0();
        this.f5759i = -1L;
        this.j = new f0(this, 1);
        this.f5760k = new b2.a();
    }

    public static long d(v2.f0 f0Var) {
        b1 b1Var = f0Var.Y;
        i1 i1Var = b1Var.f17584d;
        long jC = 0;
        for (i1 i1Var2 = b1Var.f17583c; i1Var2 != null && i1Var2 != i1Var; i1Var2 = i1Var2.J) {
            q1 q1Var = i1Var2.f17688e0;
            if (q1Var != null && !e0.t(((l1) q1Var).b())) {
                return 9223372034707292159L;
            }
            jC = j.c(jC, i1Var2.S);
        }
        return jC;
    }

    public static void g(v2.f0 f0Var) {
        if (f0Var.f17626c) {
            q1 q1Var = f0Var.Y.f17584d.f17688e0;
            if (q1Var == null || e0.t(((l1) q1Var).b())) {
                f0Var.f17626c = false;
                if (f0Var.f17630e) {
                    f0Var.f17628d = d(f0Var);
                    f0Var.f17630e = false;
                }
                if (j.a(f0Var.f17628d, 9223372034707292159L)) {
                    return;
                }
                g1.e eVarY = f0Var.y();
                Object[] objArr = eVarY.f7024a;
                int i10 = eVarY.f7026c;
                for (int i11 = 0; i11 < i10; i11++) {
                    g((v2.f0) objArr[i11]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.a():void");
    }

    public final long b(v2.f0 f0Var) {
        long j;
        int i10 = f0Var.f17624b & 33554431;
        x xVar = this.f5752b;
        long[] jArr = (long[]) xVar.f743c;
        int i11 = xVar.f742b;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 33554431) == i10) {
                j = jArr[i12];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(v2.f0 r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.c(v2.f0):void");
    }

    public final void e(v2.f0 f0Var) {
        long j;
        q1 q1Var;
        boolean zH = f0Var.H();
        b1 b1Var = f0Var.Y;
        if (zH && f0Var.f17632f) {
            v2.f0 f0VarU = f0Var.u();
            if (f0VarU == null || f0VarU.f17626c) {
                j = f0VarU == null ? 0L : 9223372034707292159L;
            } else {
                if (f0VarU.f17630e) {
                    f0VarU.f17630e = false;
                    f0VarU.f17628d = d(f0VarU);
                }
                j = f0VarU.f17628d;
            }
            i1 i1Var = b1Var.f17584d;
            if (j.a(j, 9223372034707292159L) || !((q1Var = i1Var.f17688e0) == null || e0.t(((l1) q1Var).b()))) {
                c(f0Var);
            } else if (f0Var.f17626c) {
                c(f0Var);
                g(f0Var);
            } else {
                long jC = j.c(j, i1Var.S);
                v0 v0Var = f0Var.Z.f17703p;
                int iZ0 = v0Var.z0();
                int iY0 = v0Var.y0();
                int i10 = f0Var.f17624b;
                boolean z2 = f0Var.f17638z;
                x xVar = this.f5752b;
                long j4 = 4294967295L;
                if (!z2) {
                    f0Var.f17638z = true;
                    boolean zD = b1Var.d(1024);
                    boolean zD2 = b1Var.d(16);
                    boolean zA = this.f5753c.f5776a.a(i10);
                    if (f0VarU != null) {
                        int i11 = f0VarU.f17624b;
                        int i12 = (int) (jC >> 32);
                        int i13 = (int) (jC & 4294967295L);
                        int i14 = i10 & 33554431;
                        long[] jArr = (long[]) xVar.f743c;
                        int i15 = xVar.f742b - 3;
                        while (true) {
                            if (i15 < 0) {
                                break;
                            }
                            if ((((int) jArr[i15 + 2]) & 33554431) == i11) {
                                long j10 = jArr[i15];
                                int i16 = ((int) (j10 >> 32)) + i12;
                                int i17 = ((int) j10) + i13;
                                xVar.g(i14, i16, i17, iZ0 + i16, i17 + iY0, i11, zD, zD2, zA, i15);
                                break;
                            }
                            i15 -= 3;
                        }
                    } else {
                        int i18 = (int) (jC >> 32);
                        int i19 = (int) (jC & 4294967295L);
                        xVar.g(i10, i18, i19, i18 + iZ0, i19 + iY0, (512 & 32) != 0 ? -1 : 0, zD, zD2, zA, -1);
                    }
                } else if (f0VarU != null) {
                    int i20 = f0VarU.f17624b;
                    int i21 = (int) (jC >> 32);
                    int i22 = (int) (jC & 4294967295L);
                    int i23 = i10 & 33554431;
                    long[] jArr2 = (long[]) xVar.f743c;
                    int i24 = xVar.f742b;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= jArr2.length - 2 || i25 >= i24) {
                            break;
                        }
                        long j11 = j4;
                        if ((((int) jArr2[i25 + 2]) & 33554431) == i20) {
                            long j12 = jArr2[i25];
                            int i26 = ((int) (j12 >> 32)) + i21;
                            int i27 = ((int) j12) + i22;
                            int i28 = i26 + iZ0;
                            int i29 = i27 + iY0;
                            i25 += 3;
                            while (i25 < jArr2.length - 2 && i25 < i24) {
                                int i30 = i25 + 2;
                                int i31 = i20;
                                int i32 = i21;
                                long j13 = jArr2[i30];
                                int i33 = i22;
                                if ((((int) j13) & 33554431) == i23) {
                                    long j14 = jArr2[i25];
                                    long[] jArr3 = jArr2;
                                    int i34 = i26 - ((int) (j14 >> 32));
                                    int i35 = i27 - ((int) j14);
                                    jArr3[i25] = (i27 & j11) | (i26 << 32);
                                    jArr3[i25 + 1] = (i28 << 32) | (i29 & j11);
                                    jArr3[i30] = j13 | (((j13 >> 63) & 1) << 60);
                                    if (i34 != 0 || i35 != 0) {
                                        xVar.l(i34, (j13 & a.f5749b) | (((i25 + 3) & 33554431) << 25), i35);
                                    }
                                } else {
                                    i25 += 3;
                                    i20 = i31;
                                    i21 = i32;
                                    i22 = i33;
                                }
                            }
                        }
                        i25 += 3;
                        jArr2 = jArr2;
                        j4 = j11;
                        i20 = i20;
                        i21 = i21;
                        i22 = i22;
                    }
                } else {
                    int i36 = (int) (jC >> 32);
                    int i37 = (int) (jC & 4294967295L);
                    int i38 = iZ0 + i36;
                    int i39 = i37 + iY0;
                    int i40 = i10 & 33554431;
                    long[] jArr4 = (long[]) xVar.f743c;
                    int i41 = xVar.f742b;
                    int i42 = 0;
                    while (true) {
                        if (i42 >= jArr4.length - 2 || i42 >= i41) {
                            break;
                        }
                        int i43 = i42 + 2;
                        long j15 = jArr4[i43];
                        if ((((int) j15) & 33554431) == i40) {
                            long j16 = jArr4[i42];
                            jArr4[i42] = (i36 << 32) | (i37 & 4294967295L);
                            jArr4[i42 + 1] = (i39 & 4294967295L) | (i38 << 32);
                            jArr4[i43] = (((j15 >> 63) & 1) << 60) | j15;
                            int i44 = i36 - ((int) (j16 >> 32));
                            int i45 = i37 - ((int) j16);
                            if ((i44 != 0) | (i45 != 0)) {
                                xVar.l(i44, (a.f5749b & j15) | (((i42 + 3) & 33554431) << 25), i45);
                            }
                        } else {
                            i42 += 3;
                        }
                    }
                }
            }
            f0Var.f17632f = false;
            this.f5755e = true;
            h();
        }
    }

    public final void f(v2.f0 f0Var) {
        if (f0Var.f17638z) {
            int i10 = f0Var.f17624b & 33554431;
            x xVar = this.f5752b;
            long[] jArr = (long[]) xVar.f743c;
            int i11 = xVar.f742b;
            int i12 = 0;
            while (true) {
                if (i12 >= jArr.length - 2 || i12 >= i11) {
                    break;
                }
                int i13 = i12 + 2;
                if ((((int) jArr[i13]) & 33554431) == i10) {
                    jArr[i12] = -1;
                    jArr[i12 + 1] = -1;
                    jArr[i13] = a.f5750c;
                    break;
                }
                i12 += 3;
            }
            f0Var.f17638z = false;
            f0Var.f17632f = true;
            this.f5755e = true;
            this.f5757g = true;
        }
    }

    public final void h() {
        p0.c cVar = this.f5758h;
        boolean z2 = cVar != null;
        long j = this.f5753c.f5778c;
        if (j >= 0 || !z2) {
            if (this.f5759i == j && z2) {
                return;
            }
            t tVar = this.f5751a;
            if (cVar != null) {
                tVar.removeCallbacks(cVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f5759i = jMax;
            p0.c cVar2 = new p0.c(3, this.j);
            tVar.postDelayed(cVar2, jMax - jCurrentTimeMillis);
            this.f5758h = cVar2;
        }
    }
}
