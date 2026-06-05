package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x1 implements s1 {
    public p A;
    public p B;
    public p C;
    public float[] D;
    public float[] E;
    public p7.k F;

    /* renamed from: a, reason: collision with root package name */
    public final q.u f15319a;

    /* renamed from: b, reason: collision with root package name */
    public final q.v f15320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15321c;

    /* renamed from: d, reason: collision with root package name */
    public final w f15322d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15323e = r1.f15270a;

    /* renamed from: f, reason: collision with root package name */
    public float[] f15324f;

    /* renamed from: z, reason: collision with root package name */
    public p f15325z;

    public x1(q.u uVar, q.v vVar, int i10, w wVar) {
        this.f15319a = uVar;
        this.f15320b = vVar;
        this.f15321c = i10;
        this.f15322d = wVar;
        float[] fArr = r1.f15271b;
        this.f15324f = fArr;
        this.D = fArr;
        this.E = fArr;
        this.F = r1.f15272c;
    }

    public final int c(int i10) {
        int i11;
        q.u uVar = this.f15319a;
        int i12 = uVar.f13137b;
        uVar.getClass();
        if (i12 <= 0 || i12 > uVar.f13137b) {
            r.a.d("");
            throw null;
        }
        int i13 = i12 - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = uVar.f13136a[i11];
                if (i15 >= i10) {
                    if (i15 <= i10) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = -(i14 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    @Override // t.q1
    public final p d(long j, p pVar, p pVar2, p pVar3) {
        p pVar4;
        p pVar5;
        float f10;
        r[][] rVarArr;
        boolean z2;
        p pVar6 = pVar;
        p pVar7 = pVar2;
        int[] iArr = r1.f15270a;
        int i10 = 0;
        long j4 = (j / 1000000) - 0;
        int i11 = this.f15321c;
        long j10 = i11;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= j10) {
            j10 = j4;
        }
        int i12 = (int) j10;
        q.v vVar = this.f15320b;
        w1 w1Var = (w1) vVar.b(i12);
        if (w1Var != null) {
            return w1Var.f15307a;
        }
        if (i12 >= i11) {
            return pVar7;
        }
        if (i12 <= 0) {
            return pVar6;
        }
        f(pVar6, pVar7, pVar3);
        p pVar8 = this.f15325z;
        fj.l.c(pVar8);
        boolean z10 = true;
        if (this.F != r1.f15272c) {
            float fE = e(c(i12), i12, false);
            float[] fArr = this.D;
            r[][] rVarArr2 = (r[][]) this.F.f12813b;
            int length = rVarArr2.length - 1;
            float f11 = rVarArr2[0][0].f15251a;
            float f12 = rVarArr2[length][0].f15252b;
            int length2 = fArr.length;
            if (fE < f11 || fE > f12) {
                if (fE > f12) {
                    f11 = f12;
                } else {
                    length = 0;
                }
                float f13 = fE - f11;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2 - 1) {
                    r rVar = rVarArr2[length][i14];
                    boolean z11 = rVar.f15265p;
                    float f14 = rVar.f15267r;
                    float f15 = rVar.f15266q;
                    if (z11) {
                        float f16 = rVar.f15251a;
                        float f17 = rVar.f15260k;
                        f10 = f13;
                        float f18 = rVar.f15253c;
                        rVarArr = rVarArr2;
                        fArr[i13] = (f10 * f15) + gk.b.e(rVar.f15255e, f18, (f11 - f16) * f17, f18);
                        float f19 = (f11 - f16) * f17;
                        float f20 = rVar.f15254d;
                        fArr[i13 + 1] = (f10 * f14) + gk.b.e(rVar.f15256f, f20, f19, f20);
                    } else {
                        f10 = f13;
                        rVarArr = rVarArr2;
                        rVar.c(f11);
                        fArr[i13] = (rVar.a() * f10) + (rVar.f15263n * rVar.f15258h) + f15;
                        fArr[i13 + 1] = (rVar.b() * f10) + (rVar.f15264o * rVar.f15259i) + f14;
                    }
                    i13 += 2;
                    i14++;
                    f13 = f10;
                    rVarArr2 = rVarArr;
                }
            } else {
                int length3 = rVarArr2.length;
                int i15 = 0;
                boolean z12 = false;
                while (i15 < length3) {
                    int i16 = i10;
                    int i17 = i16;
                    while (i16 < length2 - 1) {
                        r rVar2 = rVarArr2[i15][i17];
                        if (fE <= rVar2.f15252b) {
                            if (rVar2.f15265p) {
                                float f21 = rVar2.f15251a;
                                float f22 = rVar2.f15260k;
                                float f23 = rVar2.f15253c;
                                z2 = z10;
                                fArr[i16] = gk.b.e(rVar2.f15255e, f23, (fE - f21) * f22, f23);
                                float f24 = rVar2.f15254d;
                                fArr[i16 + 1] = gk.b.e(rVar2.f15256f, f24, (fE - f21) * f22, f24);
                            } else {
                                z2 = z10;
                                rVar2.c(fE);
                                fArr[i16] = (rVar2.f15263n * rVar2.f15258h) + rVar2.f15266q;
                                fArr[i16 + 1] = (rVar2.f15264o * rVar2.f15259i) + rVar2.f15267r;
                            }
                            z12 = z2;
                        } else {
                            z2 = z10;
                        }
                        i16 += 2;
                        i17++;
                        z10 = z2;
                    }
                    boolean z13 = z10;
                    if (z12) {
                        break;
                    }
                    i15++;
                    z10 = z13;
                    i10 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i18 = 0; i18 < length4; i18++) {
                pVar8.e(fArr[i18], i18);
            }
        } else {
            int iC = c(i12);
            float fE2 = e(iC, i12, true);
            q.u uVar = this.f15319a;
            w1 w1Var2 = (w1) vVar.b(uVar.c(iC));
            if (w1Var2 != null && (pVar5 = w1Var2.f15307a) != null) {
                pVar6 = pVar5;
            }
            w1 w1Var3 = (w1) vVar.b(uVar.c(iC + 1));
            if (w1Var3 != null && (pVar4 = w1Var3.f15307a) != null) {
                pVar7 = pVar4;
            }
            int iB = pVar8.b();
            for (int i19 = 0; i19 < iB; i19++) {
                pVar8.e((pVar7.a(i19) * fE2) + ((1 - fE2) * pVar6.a(i19)), i19);
            }
        }
        return pVar8;
    }

    public final float e(int i10, int i11, boolean z2) {
        w wVar;
        float f10;
        q.u uVar = this.f15319a;
        if (i10 >= uVar.f13137b - 1) {
            f10 = i11;
        } else {
            int iC = uVar.c(i10);
            int iC2 = uVar.c(i10 + 1);
            if (i11 == iC) {
                f10 = iC;
            } else {
                int i12 = iC2 - iC;
                w1 w1Var = (w1) this.f15320b.b(iC);
                if (w1Var == null || (wVar = w1Var.f15308b) == null) {
                    wVar = this.f15322d;
                }
                float f11 = i12;
                float fC = wVar.c((i11 - iC) / f11);
                if (z2) {
                    return fC;
                }
                f10 = (f11 * fC) + iC;
            }
        }
        return f10 / 1000;
    }

    public final void f(p pVar, p pVar2, p pVar3) {
        float[] fArr;
        boolean z2 = this.F != r1.f15272c;
        p pVar4 = this.f15325z;
        q.v vVar = this.f15320b;
        q.u uVar = this.f15319a;
        if (pVar4 == null) {
            this.f15325z = pVar.c();
            this.A = pVar3.c();
            int i10 = uVar.f13137b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = uVar.c(i11) / 1000;
            }
            this.f15324f = fArr2;
            int i12 = uVar.f13137b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f15323e = iArr;
        }
        if (z2) {
            if (this.F != r1.f15272c && fj.l.b(this.B, pVar) && fj.l.b(this.C, pVar2)) {
                return;
            }
            this.B = pVar;
            this.C = pVar2;
            int iB = pVar.b() + (pVar.b() % 2);
            this.D = new float[iB];
            this.E = new float[iB];
            int i14 = uVar.f13137b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iC = uVar.c(i15);
                w1 w1Var = (w1) vVar.b(iC);
                if (iC == 0 && w1Var == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = pVar.a(i16);
                    }
                } else if (iC == this.f15321c && w1Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = pVar2.a(i17);
                    }
                } else {
                    fj.l.c(w1Var);
                    p pVar5 = w1Var.f15307a;
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = pVar5.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.F = new p7.k(this.f15323e, this.f15324f, fArr3);
        }
    }

    @Override // t.q1
    public final p k(long j, p pVar, p pVar2, p pVar3) {
        int[] iArr = r1.f15270a;
        int i10 = 0;
        long j4 = (j / 1000000) - 0;
        long j10 = this.f15321c;
        if (j4 < 0) {
            j4 = 0;
        }
        long j11 = j4 > j10 ? j10 : j4;
        if (j11 < 0) {
            return pVar3;
        }
        f(pVar, pVar2, pVar3);
        p pVar4 = this.A;
        fj.l.c(pVar4);
        if (this.F != r1.f15272c) {
            int i11 = (int) j11;
            float fE = e(c(i11), i11, false);
            float[] fArr = this.E;
            r[][] rVarArr = (r[][]) this.F.f12813b;
            float f10 = rVarArr[0][0].f15251a;
            float f11 = rVarArr[rVarArr.length - 1][0].f15252b;
            if (fE < f10) {
                fE = f10;
            }
            if (fE <= f11) {
                f11 = fE;
            }
            int length = fArr.length;
            boolean z2 = false;
            for (r[] rVarArr2 : rVarArr) {
                int i12 = 0;
                int i13 = 0;
                while (i12 < length - 1) {
                    r rVar = rVarArr2[i13];
                    if (f11 <= rVar.f15252b) {
                        if (rVar.f15265p) {
                            fArr[i12] = rVar.f15266q;
                            fArr[i12 + 1] = rVar.f15267r;
                        } else {
                            rVar.c(f11);
                            fArr[i12] = rVar.a();
                            fArr[i12 + 1] = rVar.b();
                        }
                        z2 = true;
                    }
                    i12 += 2;
                    i13++;
                }
                if (z2) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i10 < length2) {
                pVar4.e(fArr[i10], i10);
                i10++;
            }
        } else {
            p pVarD = d((j11 - 1) * 1000000, pVar, pVar2, pVar3);
            p pVarD2 = d(j11 * 1000000, pVar, pVar2, pVar3);
            int iB = pVarD.b();
            while (i10 < iB) {
                pVar4.e((pVarD.a(i10) - pVarD2.a(i10)) * 1000.0f, i10);
                i10++;
            }
        }
        return pVar4;
    }

    @Override // t.s1
    public final int o() {
        return 0;
    }

    @Override // t.s1
    public final int t() {
        return this.f15321c;
    }
}
