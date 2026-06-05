package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2238a = 16;

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.o r24, ej.e r25, ej.e r26, ej.e r27, ej.e r28, int r29, long r30, long r32, b0.d2 r34, final p1.e r35, f1.i0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.i5.a(v1.o, ej.e, ej.e, ej.e, ej.e, int, long, long, b0.d2, p1.e, f1.i0, int, int):void");
    }

    public static final void b(final int i10, ej.e eVar, p1.e eVar2, ej.e eVar3, ej.e eVar4, final b0.d2 d2Var, ej.e eVar5, f1.i0 i0Var, int i11) {
        int i12;
        i0Var.c0(-280287501);
        int i13 = i11 | (i0Var.d(i10) ? 4 : 2) | (i0Var.h(eVar) ? 32 : 16) | (i0Var.h(eVar2) ? 256 : 128) | (i0Var.h(eVar3) ? 2048 : 1024) | (i0Var.h(eVar4) ? 16384 : 8192) | (i0Var.f(d2Var) ? 131072 : 65536) | (i0Var.h(eVar5) ? 1048576 : 524288);
        if (i0Var.T(i13 & 1, (599187 & i13) != 599186)) {
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = new h5();
                i0Var.l0(objQ);
            }
            final h5 h5Var = (h5) objQ;
            boolean z2 = (i13 & 112) == 32;
            Object objQ2 = i0Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new p1.e(new e(5, eVar), true, 605195056);
                i0Var.l0(objQ2);
            }
            final ej.e eVar6 = (ej.e) objQ2;
            boolean z10 = (i13 & 7168) == 2048;
            Object objQ3 = i0Var.Q();
            if (z10 || objQ3 == obj) {
                objQ3 = new p1.e(new e(4, eVar3), true, 418899191);
                i0Var.l0(objQ3);
            }
            final ej.e eVar7 = (ej.e) objQ3;
            boolean z11 = (57344 & i13) == 16384;
            Object objQ4 = i0Var.Q();
            if (z11 || objQ4 == obj) {
                objQ4 = new p1.e(new e(3, eVar4), true, 338600263);
                i0Var.l0(objQ4);
            }
            final ej.e eVar8 = (ej.e) objQ4;
            boolean z12 = (i13 & 896) == 256;
            Object objQ5 = i0Var.Q();
            if (z12 || objQ5 == obj) {
                i12 = i13;
                objQ5 = new p1.e(new c0(2, eVar2, h5Var), true, -1776388365);
                i0Var.l0(objQ5);
            } else {
                i12 = i13;
            }
            final ej.e eVar9 = (ej.e) objQ5;
            boolean z13 = (i12 & 3670016) == 1048576;
            Object objQ6 = i0Var.Q();
            if (z13 || objQ6 == obj) {
                objQ6 = new p1.e(new e(2, eVar5), true, -1731662488);
                i0Var.l0(objQ6);
            }
            final ej.e eVar10 = (ej.e) objQ6;
            boolean zF = ((i12 & 458752) == 131072) | i0Var.f(eVar6) | i0Var.f(eVar7) | i0Var.f(eVar8) | ((i12 & 14) == 4) | i0Var.f(eVar10) | i0Var.f(eVar9);
            Object objQ7 = i0Var.Q();
            if (zF || objQ7 == obj) {
                Object obj2 = new ej.e() { // from class: c1.d5
                    @Override // ej.e
                    public final Object invoke(Object obj3, Object obj4) {
                        int iI0;
                        int iI02;
                        int i14;
                        u1 u1Var;
                        Integer numValueOf;
                        int i15;
                        int iIntValue;
                        final t2.q1 q1Var = (t2.q1) obj3;
                        s3.a aVar = (s3.a) obj4;
                        float f10 = i5.f2238a;
                        final int iH = s3.a.h(aVar.f14736a);
                        final int iG = s3.a.g(aVar.f14736a);
                        long jA = s3.a.a(aVar.f14736a, 0, 0, 0, 0, 10);
                        s3.m layoutDirection = q1Var.getLayoutDirection();
                        final b0.d2 d2Var2 = d2Var;
                        int iC = d2Var2.c(q1Var, layoutDirection);
                        int iA = d2Var2.a(q1Var, q1Var.getLayoutDirection());
                        int iB = d2Var2.b(q1Var);
                        final t2.f1 f1VarY = ((t2.p0) qi.l.z0(q1Var.L(eVar6, j5.f2286a))).Y(jA);
                        int i16 = (-iC) - iA;
                        int i17 = -iB;
                        final t2.f1 f1VarY2 = ((t2.p0) qi.l.z0(q1Var.L(eVar7, j5.f2288c))).Y(s3.b.i(i16, jA, i17));
                        final t2.f1 f1VarY3 = ((t2.p0) qi.l.z0(q1Var.L(eVar8, j5.f2289d))).Y(s3.b.i(i16, jA, i17));
                        int i18 = f1VarY3.f15550a;
                        int i19 = i10;
                        if (i18 == 0 && f1VarY3.f15551b == 0) {
                            u1Var = null;
                        } else {
                            int i20 = f1VarY3.f15551b;
                            if (i19 == 0) {
                                if (q1Var.getLayoutDirection() == s3.m.f14752a) {
                                    iI0 = q1Var.I0(f10);
                                    i14 = iI0 + iC;
                                } else {
                                    iI02 = q1Var.I0(f10);
                                    i14 = ((iH - iI02) - i18) - iA;
                                }
                            } else if (i19 != 2 && i19 != 3) {
                                i14 = (((iH - i18) + iC) - iA) / 2;
                            } else if (q1Var.getLayoutDirection() == s3.m.f14752a) {
                                iI02 = q1Var.I0(f10);
                                i14 = ((iH - iI02) - i18) - iA;
                            } else {
                                iI0 = q1Var.I0(f10);
                                i14 = iI0 + iC;
                            }
                            u1Var = new u1(i14, i20);
                        }
                        final t2.f1 f1VarY4 = ((t2.p0) qi.l.z0(q1Var.L(eVar10, j5.f2290e))).Y(jA);
                        boolean z14 = f1VarY4.f15550a == 0 && f1VarY4.f15551b == 0;
                        if (u1Var != null) {
                            int i21 = u1Var.f2737b;
                            numValueOf = Integer.valueOf((z14 || i19 == 3) ? q1Var.I0(f10) + i21 + d2Var2.b(q1Var) : q1Var.I0(f10) + f1VarY4.f15551b + i21);
                        } else {
                            numValueOf = null;
                        }
                        int i22 = f1VarY2.f15551b;
                        if (i22 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(f1VarY4.f15551b);
                                if (z14) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : d2Var2.b(q1Var);
                            }
                            i15 = iIntValue + i22;
                        } else {
                            i15 = 0;
                        }
                        b0.t0 t0Var = new b0.t0(d2Var2, q1Var);
                        final u1 u1Var2 = u1Var;
                        final Integer num = numValueOf;
                        h5Var.f2195a.setValue(new b0.k1(b0.d.i(t0Var, q1Var.getLayoutDirection()), (f1VarY.f15550a == 0 && f1VarY.f15551b == 0) ? t0Var.d() : q1Var.h0(f1VarY.f15551b), b0.d.h(t0Var, q1Var.getLayoutDirection()), z14 ? t0Var.a() : q1Var.h0(f1VarY4.f15551b)));
                        final t2.f1 f1VarY5 = ((t2.p0) qi.l.z0(q1Var.L(eVar9, j5.f2287b))).Y(jA);
                        final int i23 = i15;
                        return q1Var.B(iH, iG, qi.t.f13521a, new ej.c() { // from class: c1.f5
                            @Override // ej.c
                            public final Object invoke(Object obj5) {
                                t2.e1 e1Var = (t2.e1) obj5;
                                e1Var.z(f1VarY5, 0, 0, 0.0f);
                                e1Var.z(f1VarY, 0, 0, 0.0f);
                                t2.f1 f1Var = f1VarY2;
                                int i24 = iH - f1Var.f15550a;
                                t2.q1 q1Var2 = q1Var;
                                s3.m layoutDirection2 = q1Var2.getLayoutDirection();
                                b0.d2 d2Var3 = d2Var2;
                                int iC2 = ((d2Var3.c(q1Var2, layoutDirection2) + i24) - d2Var3.a(q1Var2, q1Var2.getLayoutDirection())) / 2;
                                int i25 = iG;
                                e1Var.z(f1Var, iC2, i25 - i23, 0.0f);
                                t2.f1 f1Var2 = f1VarY4;
                                e1Var.z(f1Var2, 0, i25 - f1Var2.f15551b, 0.0f);
                                u1 u1Var3 = u1Var2;
                                if (u1Var3 != null) {
                                    int i26 = u1Var3.f2736a;
                                    Integer num2 = num;
                                    fj.l.c(num2);
                                    e1Var.z(f1VarY3, i26, i25 - num2.intValue(), 0.0f);
                                }
                                return pi.o.f13011a;
                            }
                        });
                    }
                };
                i0Var.l0(obj2);
                objQ7 = obj2;
            }
            t2.z.b(null, (ej.e) objQ7, i0Var, 0, 1);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e5(i10, eVar, eVar2, eVar3, eVar4, d2Var, eVar5, i11);
        }
    }
}
