package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q4 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2606b;

    /* renamed from: c, reason: collision with root package name */
    public final q7 f2607c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.c1 f2608d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.i1 f2609e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2610f;

    public q4(ej.c cVar, boolean z2, q7 q7Var, d1.c1 c1Var, b0.i1 i1Var, float f10) {
        this.f2605a = cVar;
        this.f2606b = z2;
        this.f2607c = q7Var;
        this.f2608d = c1Var;
        this.f2609e = i1Var;
        this.f2610f = f10;
    }

    public static final int j(int i10, q4 q4Var, int i11, int i12, t2.f1 f1Var, t2.f1 f1Var2) {
        if (q4Var.f2606b) {
            i12 = m6.a.a(1, 0.0f, (i11 - f1Var2.f15551b) / 2.0f);
        }
        return Math.max(i10 + i12, (f1Var != null ? f1Var.f15551b : 0) / 2);
    }

    @Override // t2.q0
    public final t2.r0 a(final t2.s0 s0Var, List list, long j) {
        Object obj;
        Object obj2;
        t2.f1 f1Var;
        int i10;
        t2.f1 f1VarY;
        Object obj3;
        t2.f1 f1Var2;
        int i11;
        t2.f1 f1VarY2;
        Object obj4;
        t2.f1 f1Var3;
        int i12;
        t2.f1 f1VarY3;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        Object obj7;
        t2.f1 f1Var4;
        int i13;
        fj.v vVar;
        int i14;
        fj.v vVar2;
        t2.f1 f1Var5;
        int i15;
        long j4;
        int i16;
        t2.f1 f1Var6;
        t2.f1 f1Var7;
        int i17;
        t2.f1 f1Var8;
        t2.p0 p0Var;
        q4 q4Var;
        t2.s0 s0Var2;
        t2.f1 f1Var9;
        int i18;
        t2.f1 f1Var10;
        t2.f1 f1Var11;
        int i19;
        int i20;
        int i21;
        fj.v vVar3;
        int i22;
        q4 q4Var2;
        t2.f1 f1Var12;
        t2.f1 f1Var13;
        int i23;
        t2.f1 f1Var14;
        int i24;
        t2.s0 s0Var3;
        float f10;
        List list2 = list;
        float fA = this.f2608d.a();
        b0.i1 i1Var = this.f2609e;
        int iI0 = s0Var.I0(i1Var.a());
        long jA = s3.a.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i25);
            if (fj.l.b(t2.z.i((t2.p0) obj), "Leading")) {
                break;
            }
            i25++;
        }
        t2.p0 p0Var2 = (t2.p0) obj;
        t2.f1 f1VarY4 = p0Var2 != null ? p0Var2.Y(jA) : null;
        int i26 = f1VarY4 != null ? f1VarY4.f15550a : 0;
        int iMax = Math.max(0, f1VarY4 != null ? f1VarY4.f15551b : 0);
        int size2 = list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i27);
            if (fj.l.b(t2.z.i((t2.p0) obj2), "Trailing")) {
                break;
            }
            i27++;
        }
        t2.p0 p0Var3 = (t2.p0) obj2;
        if (p0Var3 != null) {
            f1Var = f1VarY4;
            i10 = i26;
            f1VarY = p0Var3.Y(s3.b.j(-i26, jA, 0, 2));
        } else {
            f1Var = f1VarY4;
            i10 = i26;
            f1VarY = null;
        }
        int i28 = i10 + (f1VarY != null ? f1VarY.f15550a : 0);
        int iMax2 = Math.max(iMax, f1VarY != null ? f1VarY.f15551b : 0);
        int size3 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i29);
            int i30 = size3;
            if (fj.l.b(t2.z.i((t2.p0) obj3), "Prefix")) {
                break;
            }
            i29++;
            size3 = i30;
        }
        t2.p0 p0Var4 = (t2.p0) obj3;
        if (p0Var4 != null) {
            f1Var2 = f1VarY;
            i11 = i28;
            f1VarY2 = p0Var4.Y(s3.b.j(-i28, jA, 0, 2));
        } else {
            f1Var2 = f1VarY;
            i11 = i28;
            f1VarY2 = null;
        }
        int i31 = i11 + (f1VarY2 != null ? f1VarY2.f15550a : 0);
        int iMax3 = Math.max(iMax2, f1VarY2 != null ? f1VarY2.f15551b : 0);
        int size4 = list2.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i32);
            int i33 = size4;
            if (fj.l.b(t2.z.i((t2.p0) obj4), "Suffix")) {
                break;
            }
            i32++;
            size4 = i33;
        }
        t2.p0 p0Var5 = (t2.p0) obj4;
        if (p0Var5 != null) {
            f1Var3 = f1VarY2;
            i12 = i31;
            f1VarY3 = p0Var5.Y(s3.b.j(-i31, jA, 0, 2));
        } else {
            f1Var3 = f1VarY2;
            i12 = i31;
            f1VarY3 = null;
        }
        int i34 = i12 + (f1VarY3 != null ? f1VarY3.f15550a : 0);
        int iMax4 = Math.max(iMax3, f1VarY3 != null ? f1VarY3.f15551b : 0);
        int size5 = list2.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i35);
            int i36 = size5;
            if (fj.l.b(t2.z.i((t2.p0) obj5), "Label")) {
                break;
            }
            i35++;
            size5 = i36;
        }
        t2.p0 p0Var6 = (t2.p0) obj5;
        fj.v vVar4 = new fj.v();
        int iI02 = s0Var.I0(i1Var.c(s0Var.getLayoutDirection())) + s0Var.I0(i1Var.b(s0Var.getLayoutDirection()));
        int i37 = -u3.c.m(fA, i34 + iI02, iI02);
        int i38 = -iI0;
        t2.f1 f1VarY5 = p0Var6 != null ? p0Var6.Y(s3.b.i(i37, jA, i38)) : null;
        vVar4.f6807a = f1VarY5;
        if (f1VarY5 != null) {
            jFloatToRawIntBits = (Float.floatToRawIntBits(f1VarY5.f15551b) & 4294967295L) | (Float.floatToRawIntBits(f1VarY5.f15550a) << 32);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.f2605a.invoke(new b2.e(jFloatToRawIntBits));
        int size6 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i39);
            if (fj.l.b(t2.z.i((t2.p0) obj6), "Supporting")) {
                break;
            }
            i39++;
        }
        t2.p0 p0Var7 = (t2.p0) obj6;
        int iV0 = p0Var7 != null ? p0Var7.v0(s3.a.j(j)) : 0;
        t2.f1 f1Var15 = (t2.f1) vVar4.f6807a;
        int iMax5 = Math.max((f1Var15 != null ? f1Var15.f15551b : 0) / 2, s0Var.I0(i1Var.d()));
        long j10 = j;
        long jI = s3.b.i(-i34, j10, (i38 - iMax5) - iV0);
        t2.p0 p0Var8 = p0Var7;
        long jA2 = s3.a.a(jI, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i40 = 0;
        while (i40 < size7) {
            t2.p0 p0Var9 = p0Var8;
            t2.p0 p0Var10 = (t2.p0) list2.get(i40);
            int i41 = iMax5;
            int i42 = size7;
            if (fj.l.b(t2.z.i(p0Var10), "TextField")) {
                t2.f1 f1VarY6 = p0Var10.Y(jA2);
                long jA3 = s3.a.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i43 = 0;
                while (true) {
                    if (i43 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i43);
                    int i44 = size8;
                    if (fj.l.b(t2.z.i((t2.p0) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i43++;
                    size8 = i44;
                }
                t2.p0 p0Var11 = (t2.p0) obj7;
                t2.f1 f1VarY7 = p0Var11 != null ? p0Var11.Y(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(f1VarY6.f15551b, f1VarY7 != null ? f1VarY7.f15551b : 0) + i41 + iI0);
                int i45 = f1Var != null ? f1Var.f15550a : 0;
                t2.f1 f1Var16 = f1Var2;
                int i46 = f1Var2 != null ? f1Var16.f15550a : 0;
                t2.f1 f1Var17 = f1Var3;
                int i47 = f1Var3 != null ? f1Var17.f15550a : 0;
                if (f1VarY3 != null) {
                    i13 = f1VarY3.f15550a;
                    f1Var4 = f1Var16;
                } else {
                    f1Var4 = f1Var16;
                    i13 = 0;
                }
                int i48 = f1VarY6.f15550a;
                t2.f1 f1Var18 = f1Var4;
                t2.f1 f1Var19 = (t2.f1) vVar4.f6807a;
                if (f1Var19 != null) {
                    i14 = f1Var19.f15550a;
                    vVar = vVar4;
                } else {
                    vVar = vVar4;
                    i14 = 0;
                }
                if (f1VarY7 != null) {
                    f1Var5 = f1VarY6;
                    i15 = i45;
                    vVar2 = vVar;
                    j4 = j10;
                    i16 = f1VarY7.f15550a;
                    f1Var6 = f1VarY7;
                    f1Var7 = f1VarY3;
                    i17 = i47;
                    f1Var8 = f1Var17;
                    p0Var = p0Var9;
                    q4Var = this;
                    f1Var9 = f1Var;
                    i18 = iMax6;
                    f1Var10 = f1Var18;
                    s0Var2 = s0Var;
                } else {
                    vVar2 = vVar;
                    f1Var5 = f1VarY6;
                    i15 = i45;
                    j4 = j10;
                    i16 = 0;
                    f1Var6 = f1VarY7;
                    f1Var7 = f1VarY3;
                    i17 = i47;
                    f1Var8 = f1Var17;
                    p0Var = p0Var9;
                    q4Var = this;
                    s0Var2 = s0Var;
                    f1Var9 = f1Var;
                    i18 = iMax6;
                    f1Var10 = f1Var18;
                }
                final int iC = q4Var.c(s0Var2, i15, i46, i17, i13, i48, i14, i16, j4, fA);
                final t2.f1 f1VarY8 = p0Var != null ? p0Var.Y(s3.a.a(s3.b.j(0, jA, -i18, 1), 0, iC, 0, 0, 9)) : null;
                int i49 = f1VarY8 != null ? f1VarY8.f15551b : 0;
                t2.f1 f1Var20 = f1Var9;
                int i50 = f1Var9 != null ? f1Var20.f15551b : 0;
                final t2.f1 f1Var21 = f1Var10;
                int i51 = f1Var10 != null ? f1Var21.f15551b : 0;
                t2.f1 f1Var22 = f1Var8;
                int i52 = f1Var22 != null ? f1Var22.f15551b : 0;
                t2.f1 f1Var23 = f1Var7;
                int i53 = f1Var23 != null ? f1Var23.f15551b : 0;
                t2.f1 f1Var24 = f1Var5;
                int i54 = f1Var24.f15551b;
                fj.v vVar5 = vVar2;
                t2.f1 f1Var25 = (t2.f1) vVar5.f6807a;
                int i55 = f1Var25 != null ? f1Var25.f15551b : 0;
                int i56 = i49;
                final t2.f1 f1Var26 = f1Var6;
                if (f1Var26 != null) {
                    f1Var11 = f1Var23;
                    i19 = i53;
                    i20 = i54;
                    i21 = f1Var26.f15551b;
                } else {
                    f1Var11 = f1Var23;
                    i19 = i53;
                    i20 = i54;
                    i21 = 0;
                }
                if (f1VarY8 != null) {
                    vVar3 = vVar5;
                    i22 = f1VarY8.f15551b;
                    f1Var12 = f1Var22;
                    f1Var13 = f1Var24;
                    i23 = i55;
                    f1Var14 = f1Var20;
                    i24 = 0;
                    s0Var3 = s0Var;
                    f10 = fA;
                    q4Var2 = this;
                } else {
                    vVar3 = vVar5;
                    i22 = 0;
                    q4Var2 = this;
                    f1Var12 = f1Var22;
                    f1Var13 = f1Var24;
                    i23 = i55;
                    f1Var14 = f1Var20;
                    i24 = 0;
                    s0Var3 = s0Var;
                    f10 = fA;
                }
                final int iB = q4Var2.b(s0Var3, i50, i51, i52, i19, i20, i23, i21, i22, j, f10);
                final float f11 = f10;
                int i57 = iB - i56;
                int size9 = list.size();
                int i58 = i24;
                while (i58 < size9) {
                    t2.p0 p0Var12 = (t2.p0) list.get(i58);
                    if (fj.l.b(t2.z.i(p0Var12), "Container")) {
                        final t2.f1 f1VarY9 = p0Var12.Y(s3.b.a(iC != Integer.MAX_VALUE ? iC : i24, iC, i57 != Integer.MAX_VALUE ? i57 : i24, i57));
                        final t2.f1 f1Var27 = f1Var14;
                        final t2.f1 f1Var28 = f1Var12;
                        final t2.f1 f1Var29 = f1Var11;
                        final fj.v vVar6 = vVar3;
                        final t2.f1 f1Var30 = f1Var13;
                        return s0Var.B(iC, iB, qi.t.f13521a, new ej.c() { // from class: c1.o4
                            @Override // ej.c
                            public final Object invoke(Object obj9) {
                                float f12;
                                int i59;
                                float f13;
                                q4 q4Var3;
                                int i60;
                                int i61;
                                q4 q4Var4;
                                int i62;
                                int iA;
                                float f14;
                                float f15;
                                float f16;
                                float f17;
                                t2.e1 e1Var = (t2.e1) obj9;
                                t2.f1 f1Var31 = (t2.f1) vVar6.f6807a;
                                t2.s0 s0Var4 = s0Var;
                                float fE = s0Var4.e();
                                s3.m layoutDirection = s0Var4.getLayoutDirection();
                                q4 q4Var5 = this.f2518a;
                                float fW0 = s0Var4.w0(q4Var5.f2610f);
                                q7 q7Var = q4Var5.f2607c;
                                b0.i1 i1Var2 = q4Var5.f2609e;
                                e1Var.z(f1VarY9, 0, 0, 0.0f);
                                t2.f1 f1Var32 = f1VarY8;
                                int i63 = iB - (f1Var32 != null ? f1Var32.f15551b : 0);
                                int iH = hj.a.H(i1Var2.d() * fE);
                                t2.f1 f1Var33 = f1Var27;
                                if (f1Var33 != null) {
                                    f12 = fW0;
                                    t2.e1.D(e1Var, f1Var33, 0, m6.a.a(1, 0.0f, (i63 - f1Var33.f15551b) / 2.0f));
                                } else {
                                    f12 = fW0;
                                }
                                int i64 = iC;
                                t2.f1 f1Var34 = f1Var21;
                                if (f1Var31 != null) {
                                    if (q4Var5.f2606b) {
                                        i59 = i64;
                                        iA = m6.a.a(1, 0.0f, (i63 - f1Var31.f15551b) / 2.0f);
                                    } else {
                                        i59 = i64;
                                        iA = iH;
                                    }
                                    int i65 = -(f1Var31.f15551b / 2);
                                    float f18 = f11;
                                    int iM = u3.c.m(f18, iA, i65);
                                    float fI = b0.d.i(i1Var2, layoutDirection) * fE;
                                    float fH = b0.d.h(i1Var2, layoutDirection) * fE;
                                    if (f1Var33 == null) {
                                        f15 = fI;
                                        f14 = 0.0f;
                                    } else {
                                        float f19 = f1Var33.f15550a;
                                        float f20 = fI - f12;
                                        f14 = 0.0f;
                                        if (f20 < 0.0f) {
                                            f20 = 0.0f;
                                        }
                                        f15 = f19 + f20;
                                    }
                                    if (f1Var34 == null) {
                                        f16 = fI;
                                        f17 = fH;
                                    } else {
                                        f16 = fI;
                                        float f21 = f1Var34.f15550a;
                                        float f22 = fH - f12;
                                        if (f22 < f14) {
                                            f22 = 0.0f;
                                        }
                                        f17 = f21 + f22;
                                    }
                                    s3.m mVar = s3.m.f14752a;
                                    float f23 = layoutDirection == mVar ? f16 : fH;
                                    float f24 = layoutDirection == mVar ? f15 : f17;
                                    float f25 = d1.d1.f4485a;
                                    q4Var3 = q4Var5;
                                    int iH2 = hj.a.H(u3.c.l(q7Var.f2617b.a(f1Var31.f15550a, i59 - hj.a.H(f15 + f17), layoutDirection) + f24, d1.d1.c(q7Var).a(f1Var31.f15550a, i59 - hj.a.H(f16 + fH), layoutDirection) + f23, f18));
                                    f13 = 0.0f;
                                    e1Var.z(f1Var31, iH2, iM, 0.0f);
                                } else {
                                    i59 = i64;
                                    f13 = 0.0f;
                                    q4Var3 = q4Var5;
                                }
                                t2.f1 f1Var35 = f1Var28;
                                if (f1Var35 != null) {
                                    i60 = iH;
                                    i61 = i63;
                                    q4Var4 = q4Var3;
                                    i62 = 0;
                                    t2.e1.D(e1Var, f1Var35, f1Var33 != null ? f1Var33.f15550a : 0, q4.j(0, q4Var4, i61, i60, f1Var31, f1Var35));
                                } else {
                                    i60 = iH;
                                    i61 = i63;
                                    q4Var4 = q4Var3;
                                    i62 = 0;
                                }
                                int i66 = (f1Var33 != null ? f1Var33.f15550a : 0) + (f1Var35 != null ? f1Var35.f15550a : 0);
                                t2.f1 f1Var36 = f1Var30;
                                t2.e1.D(e1Var, f1Var36, i66, q4.j(i62, q4Var4, i61, i60, f1Var31, f1Var36));
                                t2.f1 f1Var37 = f1Var26;
                                if (f1Var37 != null) {
                                    t2.e1.D(e1Var, f1Var37, i66, q4.j(i62, q4Var4, i61, i60, f1Var31, f1Var37));
                                }
                                t2.f1 f1Var38 = f1Var29;
                                if (f1Var38 != null) {
                                    t2.e1.D(e1Var, f1Var38, (i59 - (f1Var34 != null ? f1Var34.f15550a : 0)) - f1Var38.f15550a, q4.j(i62, q4Var4, i61, i60, f1Var31, f1Var38));
                                }
                                if (f1Var34 != null) {
                                    t2.e1.D(e1Var, f1Var34, i59 - f1Var34.f15550a, m6.a.a(1, f13, (i61 - f1Var34.f15551b) / 2.0f));
                                }
                                if (f1Var32 != null) {
                                    t2.e1.D(e1Var, f1Var32, 0, i61);
                                }
                                return pi.o.f13011a;
                            }
                        });
                    }
                    i58++;
                    iB = iB;
                }
                u3.b.b("Collection contains no element matching the predicate.");
                throw new b3.e();
            }
            i40++;
            j10 = j;
            p0Var8 = p0Var9;
            size7 = i42;
            f1Var3 = f1Var3;
            list2 = list2;
            iMax5 = i41;
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    public final int b(t2.r rVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j, float f10) {
        int[] iArr = {i16, i12, i13, u3.c.m(f10, i15, 0)};
        for (int i18 = 0; i18 < 4; i18++) {
            i14 = Math.max(i14, iArr[i18]);
        }
        b0.i1 i1Var = this.f2609e;
        float fW0 = rVar.w0(i1Var.d());
        return s3.b.f(Math.max(i10, Math.max(i11, hj.a.H(u3.c.l(fW0, Math.max(fW0, i15 / 2.0f), f10) + i14 + rVar.w0(i1Var.a())))) + i17, j);
    }

    public final int c(t2.r rVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, float f10) {
        int i17 = i12 + i13;
        int iMax = Math.max(i14 + i17, Math.max(i16 + i17, u3.c.m(f10, i15, 0))) + i10 + i11;
        s3.m mVar = s3.m.f14752a;
        b0.i1 i1Var = this.f2609e;
        return s3.b.g(Math.max(iMax, hj.a.H((i15 + rVar.w0(i1Var.c(mVar) + i1Var.b(mVar))) * f10)), j);
    }

    public final int d(t2.r rVar, List list, int i10, ej.e eVar) {
        Object obj;
        int iJ;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        q4 q4Var = this;
        float fA = q4Var.f2608d.a();
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (fj.l.b(d1.i.h((t2.p0) obj), "Leading")) {
                break;
            }
            i11++;
        }
        t2.p0 p0Var = (t2.p0) obj;
        if (p0Var != null) {
            iJ = d1.i.j(i10, p0Var.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            iIntValue = ((Number) eVar.invoke(p0Var, Integer.valueOf(i10))).intValue();
        } else {
            iJ = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (fj.l.b(d1.i.h((t2.p0) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        t2.p0 p0Var2 = (t2.p0) obj2;
        if (p0Var2 != null) {
            iJ = d1.i.j(iJ, p0Var2.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            iIntValue2 = ((Number) eVar.invoke(p0Var2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (fj.l.b(d1.i.h((t2.p0) obj3), "Label")) {
                break;
            }
            i13++;
        }
        Object obj8 = (t2.p0) obj3;
        int iIntValue5 = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(u3.c.m(fA, iJ, i10)))).intValue() : 0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (fj.l.b(d1.i.h((t2.p0) obj4), "Prefix")) {
                break;
            }
            i14++;
        }
        t2.p0 p0Var3 = (t2.p0) obj4;
        if (p0Var3 != null) {
            iIntValue3 = ((Number) eVar.invoke(p0Var3, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var3.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i15);
            if (fj.l.b(d1.i.h((t2.p0) obj5), "Suffix")) {
                break;
            }
            i15++;
        }
        t2.p0 p0Var4 = (t2.p0) obj5;
        if (p0Var4 != null) {
            iIntValue4 = ((Number) eVar.invoke(p0Var4, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var4.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj9 = list.get(i16);
            if (fj.l.b(d1.i.h((t2.p0) obj9), "TextField")) {
                int iIntValue6 = ((Number) eVar.invoke(obj9, Integer.valueOf(iJ))).intValue();
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (fj.l.b(d1.i.h((t2.p0) obj6), "Hint")) {
                        break;
                    }
                    i17++;
                }
                Object obj10 = (t2.p0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(iJ))).intValue() : 0;
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i18);
                    if (fj.l.b(d1.i.h((t2.p0) obj7), "Supporting")) {
                        break;
                    }
                    i18++;
                }
                Object obj11 = (t2.p0) obj7;
                return q4Var.b(rVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) eVar.invoke(obj11, Integer.valueOf(i10))).intValue() : 0, s3.b.b(0, 0, 0, 0, 15), fA);
            }
            i16++;
            iIntValue4 = iIntValue4;
            q4Var = this;
            iIntValue3 = iIntValue3;
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    public final int e(t2.r rVar, List list, int i10, ej.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj7 = list.get(i11);
            if (fj.l.b(d1.i.h((t2.p0) obj7), "TextField")) {
                int iIntValue = ((Number) eVar.invoke(obj7, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (fj.l.b(d1.i.h((t2.p0) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                t2.p0 p0Var = (t2.p0) obj2;
                int iIntValue2 = p0Var != null ? ((Number) eVar.invoke(p0Var, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (fj.l.b(d1.i.h((t2.p0) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                t2.p0 p0Var2 = (t2.p0) obj3;
                int iIntValue3 = p0Var2 != null ? ((Number) eVar.invoke(p0Var2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (fj.l.b(d1.i.h((t2.p0) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                t2.p0 p0Var3 = (t2.p0) obj4;
                int iIntValue4 = p0Var3 != null ? ((Number) eVar.invoke(p0Var3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i15);
                    if (fj.l.b(d1.i.h((t2.p0) obj5), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                t2.p0 p0Var4 = (t2.p0) obj5;
                int iIntValue5 = p0Var4 != null ? ((Number) eVar.invoke(p0Var4, Integer.valueOf(i10))).intValue() : 0;
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (fj.l.b(d1.i.h((t2.p0) obj6), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                t2.p0 p0Var5 = (t2.p0) obj6;
                int iIntValue6 = p0Var5 != null ? ((Number) eVar.invoke(p0Var5, Integer.valueOf(i10))).intValue() : 0;
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i17);
                    if (fj.l.b(d1.i.h((t2.p0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i17++;
                }
                t2.p0 p0Var6 = (t2.p0) obj;
                return c(rVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, p0Var6 != null ? ((Number) eVar.invoke(p0Var6, Integer.valueOf(i10))).intValue() : 0, s3.b.b(0, 0, 0, 0, 15), this.f2608d.a());
            }
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        return d(rVar, list, i10, new p4(0));
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        return e(rVar, list, i10, new p4(3));
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        return e(rVar, list, i10, new p4(1));
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        return d(rVar, list, i10, new p4(2));
    }
}
