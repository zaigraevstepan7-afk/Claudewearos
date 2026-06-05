package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s7 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final q7 f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.c1 f2688c;

    /* renamed from: d, reason: collision with root package name */
    public final b0.i1 f2689d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2690e;

    public s7(boolean z2, q7 q7Var, d1.c1 c1Var, b0.i1 i1Var, float f10) {
        this.f2686a = z2;
        this.f2687b = q7Var;
        this.f2688c = c1Var;
        this.f2689d = i1Var;
        this.f2690e = f10;
    }

    public static int d(List list, int i10, ej.e eVar) {
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
                    if (fj.l.b(d1.i.h((t2.p0) obj4), "Prefix")) {
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
                    if (fj.l.b(d1.i.h((t2.p0) obj5), "Suffix")) {
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
                    if (fj.l.b(d1.i.h((t2.p0) obj6), "Leading")) {
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
                int i18 = iIntValue4 + iIntValue5;
                return s3.b.g(Math.max(iIntValue + i18, Math.max((p0Var6 != null ? ((Number) eVar.invoke(p0Var6, Integer.valueOf(i10))).intValue() : 0) + i18, iIntValue2)) + iIntValue6 + iIntValue3, s3.b.b(0, 0, 0, 0, 15));
            }
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    public static final int e(s7 s7Var, int i10, int i11, t2.f1 f1Var) {
        if (!s7Var.f2686a) {
            return i11;
        }
        return m6.a.a(1, 0.0f, (i10 - f1Var.f15551b) / 2.0f);
    }

    @Override // t2.q0
    public final t2.r0 a(final t2.s0 s0Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i10;
        t2.f1 f1VarY;
        Object obj4;
        int i11;
        t2.f1 f1VarY2;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        t2.f1 f1Var;
        int i13;
        int i14;
        int i15;
        int i16;
        t2.f1 f1Var2;
        int i17;
        t2.f1 f1Var3;
        int i18;
        t2.f1 f1Var4;
        int i19;
        float f10;
        t2.f1 f1Var5;
        fj.v vVar;
        int i20;
        t2.f1 f1Var6;
        t2.f1 f1Var7;
        int i21;
        int i22;
        s7 s7Var;
        int i23;
        float fA = this.f2688c.a();
        b0.i1 i1Var = this.f2689d;
        final int iI0 = s0Var.I0(i1Var.d());
        int iI02 = s0Var.I0(i1Var.a());
        long jA = s3.a.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i24);
            if (fj.l.b(t2.z.i((t2.p0) obj), "Leading")) {
                break;
            }
            i24++;
        }
        t2.p0 p0Var = (t2.p0) obj;
        t2.f1 f1VarY3 = p0Var != null ? p0Var.Y(jA) : null;
        int i25 = f1VarY3 != null ? f1VarY3.f15550a : 0;
        int iMax = Math.max(0, f1VarY3 != null ? f1VarY3.f15551b : 0);
        int size2 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i26);
            if (fj.l.b(t2.z.i((t2.p0) obj2), "Trailing")) {
                break;
            }
            i26++;
        }
        t2.p0 p0Var2 = (t2.p0) obj2;
        t2.f1 f1VarY4 = p0Var2 != null ? p0Var2.Y(s3.b.j(-i25, jA, 0, 2)) : null;
        int i27 = i25 + (f1VarY4 != null ? f1VarY4.f15550a : 0);
        int iMax2 = Math.max(iMax, f1VarY4 != null ? f1VarY4.f15551b : 0);
        int size3 = list.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i28);
            if (fj.l.b(t2.z.i((t2.p0) obj3), "Prefix")) {
                break;
            }
            i28++;
        }
        t2.p0 p0Var3 = (t2.p0) obj3;
        if (p0Var3 != null) {
            i10 = i27;
            f1VarY = p0Var3.Y(s3.b.j(-i27, jA, 0, 2));
        } else {
            i10 = i27;
            f1VarY = null;
        }
        int i29 = (f1VarY != null ? f1VarY.f15550a : 0) + i10;
        int iMax3 = Math.max(iMax2, f1VarY != null ? f1VarY.f15551b : 0);
        int size4 = list.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i30);
            if (fj.l.b(t2.z.i((t2.p0) obj4), "Suffix")) {
                break;
            }
            i30++;
        }
        t2.p0 p0Var4 = (t2.p0) obj4;
        if (p0Var4 != null) {
            i11 = i29;
            f1VarY2 = p0Var4.Y(s3.b.j(-i29, jA, 0, 2));
        } else {
            i11 = i29;
            f1VarY2 = null;
        }
        int i31 = i11 + (f1VarY2 != null ? f1VarY2.f15550a : 0);
        int iMax4 = Math.max(iMax3, f1VarY2 != null ? f1VarY2.f15551b : 0);
        int size5 = list.size();
        int i32 = 0;
        while (true) {
            if (i32 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i32);
            int i33 = size5;
            if (fj.l.b(t2.z.i((t2.p0) obj5), "Label")) {
                break;
            }
            i32++;
            size5 = i33;
        }
        t2.p0 p0Var5 = (t2.p0) obj5;
        fj.v vVar2 = new fj.v();
        int i34 = -i31;
        vVar2.f6807a = p0Var5 != null ? p0Var5.Y(s3.b.i(i34, jA, -iI02)) : null;
        int size6 = list.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size6) {
                i12 = iI02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i35);
            i12 = iI02;
            if (fj.l.b(t2.z.i((t2.p0) obj6), "Supporting")) {
                break;
            }
            i35++;
            iI02 = i12;
        }
        t2.p0 p0Var6 = (t2.p0) obj6;
        int iV0 = p0Var6 != null ? p0Var6.v0(s3.a.j(j)) : 0;
        t2.f1 f1Var8 = (t2.f1) vVar2.f6807a;
        int i36 = iI0 + (f1Var8 != null ? f1Var8.f15551b : 0);
        long jI = s3.b.i(i34, s3.a.a(j, 0, 0, 0, 0, 11), ((-i36) - i12) - iV0);
        int size7 = list.size();
        int i37 = 0;
        while (i37 < size7) {
            int i38 = i36;
            t2.p0 p0Var7 = (t2.p0) list.get(i37);
            int i39 = size7;
            float f11 = fA;
            if (fj.l.b(t2.z.i(p0Var7), "TextField")) {
                t2.f1 f1VarY5 = p0Var7.Y(jI);
                long jA2 = s3.a.a(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i40 = 0;
                while (true) {
                    if (i40 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i40);
                    int i41 = size8;
                    int i42 = i40;
                    if (fj.l.b(t2.z.i((t2.p0) obj7), "Hint")) {
                        break;
                    }
                    i40 = i42 + 1;
                    size8 = i41;
                }
                t2.p0 p0Var8 = (t2.p0) obj7;
                t2.f1 f1VarY6 = p0Var8 != null ? p0Var8.Y(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(f1VarY5.f15551b, f1VarY6 != null ? f1VarY6.f15551b : 0) + i38 + i12);
                int i43 = f1VarY3 != null ? f1VarY3.f15550a : 0;
                int i44 = f1VarY4 != null ? f1VarY4.f15550a : 0;
                int i45 = f1VarY != null ? f1VarY.f15550a : 0;
                int i46 = f1VarY2 != null ? f1VarY2.f15550a : 0;
                int i47 = i44;
                int i48 = f1VarY5.f15550a;
                t2.f1 f1Var9 = (t2.f1) vVar2.f6807a;
                int i49 = i45 + i46;
                int iG = s3.b.g(Math.max(i48 + i49, Math.max((f1VarY6 != null ? f1VarY6.f15550a : 0) + i49, f1Var9 != null ? f1Var9.f15550a : 0)) + i43 + i47, j);
                t2.f1 f1VarY7 = p0Var6 != null ? p0Var6.Y(s3.a.a(s3.b.j(0, jA, -iMax5, 1), 0, iG, 0, 0, 9)) : null;
                int i50 = f1VarY7 != null ? f1VarY7.f15551b : 0;
                int i51 = f1VarY5.f15551b;
                t2.f1 f1Var10 = (t2.f1) vVar2.f6807a;
                int i52 = f1Var10 != null ? f1Var10.f15551b : 0;
                int i53 = f1VarY3 != null ? f1VarY3.f15551b : 0;
                if (f1VarY4 != null) {
                    f1Var = f1VarY3;
                    i13 = i52;
                    i14 = f1VarY4.f15551b;
                } else {
                    f1Var = f1VarY3;
                    i13 = i52;
                    i14 = 0;
                }
                if (f1VarY != null) {
                    i15 = i53;
                    i16 = f1VarY.f15551b;
                } else {
                    i15 = i53;
                    i16 = 0;
                }
                final t2.f1 f1Var11 = f1VarY4;
                if (f1VarY2 != null) {
                    f1Var2 = f1VarY;
                    i17 = f1VarY2.f15551b;
                } else {
                    f1Var2 = f1VarY;
                    i17 = 0;
                }
                if (f1VarY6 != null) {
                    t2.f1 f1Var12 = f1Var;
                    i18 = f1VarY6.f15551b;
                    f1Var3 = f1Var12;
                } else {
                    f1Var3 = f1Var;
                    i18 = 0;
                }
                if (f1VarY7 != null) {
                    f1Var5 = f1Var3;
                    f1Var4 = f1VarY2;
                    i19 = i15;
                    f10 = f11;
                    vVar = vVar2;
                    i20 = f1VarY7.f15551b;
                    f1Var6 = f1VarY6;
                    f1Var7 = f1VarY7;
                    i21 = iG;
                    i22 = 0;
                    i23 = i51;
                    s7Var = this;
                } else {
                    f1Var4 = f1VarY2;
                    i19 = i15;
                    f10 = f11;
                    f1Var5 = f1Var3;
                    vVar = vVar2;
                    i20 = 0;
                    f1Var6 = f1VarY6;
                    f1Var7 = f1VarY7;
                    i21 = iG;
                    i22 = 0;
                    s7Var = this;
                    i23 = i51;
                }
                final int iB = s7Var.b(s0Var, i23, i13, i19, i14, i16, i17, i18, i20, j, f10);
                final int i54 = iB - i50;
                int size9 = list.size();
                int i55 = i22;
                while (i55 < size9) {
                    t2.p0 p0Var9 = (t2.p0) list.get(i55);
                    if (fj.l.b(t2.z.i(p0Var9), "Container")) {
                        final t2.f1 f1VarY8 = p0Var9.Y(s3.b.a(i21 != Integer.MAX_VALUE ? i21 : i22, i21, i54 != Integer.MAX_VALUE ? i54 : i22, i54));
                        final int i56 = i21;
                        final float f12 = f10;
                        final t2.f1 f1Var13 = f1VarY5;
                        final t2.f1 f1Var14 = f1Var5;
                        final t2.f1 f1Var15 = f1Var4;
                        final fj.v vVar3 = vVar;
                        final t2.f1 f1Var16 = f1Var2;
                        final t2.f1 f1Var17 = f1Var6;
                        final t2.f1 f1Var18 = f1Var7;
                        return s0Var.B(i56, iB, qi.t.f13521a, new ej.c() { // from class: c1.r7
                            /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
                            /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
                            @Override // ej.c
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r22) {
                                /*
                                    Method dump skipped, instructions count: 466
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: c1.r7.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                    i55++;
                    i54 = i54;
                    f1VarY5 = f1VarY5;
                }
                u3.b.b("Collection contains no element matching the predicate.");
                throw new b3.e();
            }
            fA = f11;
            i37++;
            f1VarY3 = f1VarY3;
            size7 = i39;
            i36 = i38;
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    public final int b(t2.r rVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j, float f10) {
        b0.i1 i1Var = this.f2689d;
        int iI0 = rVar.I0(i1Var.a() + i1Var.d());
        int[] iArr = {i16, i14, i15, u3.c.m(f10, i11, 0)};
        for (int i18 = 0; i18 < 4; i18++) {
            i10 = Math.max(i10, iArr[i18]);
        }
        return s3.b.f(Math.max(i12, Math.max(i13, iI0 + (i11 > 0 ? Math.max(rVar.I0(this.f2690e * 2), u3.c.m(e1.v.f5675a.c(f10), 0, i11)) : 0) + i10)) + i17, j);
    }

    public final int c(t2.r rVar, List list, int i10, ej.e eVar) {
        Object obj;
        int i11;
        int iIntValue;
        int iJ;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i12;
        Object obj5;
        int i13;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i14);
            if (fj.l.b(d1.i.h((t2.p0) obj), "Leading")) {
                break;
            }
            i14++;
        }
        t2.p0 p0Var = (t2.p0) obj;
        if (p0Var != null) {
            i11 = i10;
            iJ = d1.i.j(i11, p0Var.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            iIntValue = ((Number) eVar.invoke(p0Var, Integer.valueOf(i11))).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
            iJ = i11;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (fj.l.b(d1.i.h((t2.p0) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        t2.p0 p0Var2 = (t2.p0) obj2;
        if (p0Var2 != null) {
            iJ = d1.i.j(iJ, p0Var2.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            iIntValue2 = ((Number) eVar.invoke(p0Var2, Integer.valueOf(i11))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i16);
            if (fj.l.b(d1.i.h((t2.p0) obj3), "Label")) {
                break;
            }
            i16++;
        }
        Object obj8 = (t2.p0) obj3;
        int iIntValue3 = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(iJ))).intValue() : 0;
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i17);
            if (fj.l.b(d1.i.h((t2.p0) obj4), "Prefix")) {
                break;
            }
            i17++;
        }
        t2.p0 p0Var3 = (t2.p0) obj4;
        if (p0Var3 != null) {
            int iIntValue4 = ((Number) eVar.invoke(p0Var3, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var3.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            i12 = iIntValue4;
        } else {
            i12 = 0;
        }
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i18);
            if (fj.l.b(d1.i.h((t2.p0) obj5), "Suffix")) {
                break;
            }
            i18++;
        }
        t2.p0 p0Var4 = (t2.p0) obj5;
        if (p0Var4 != null) {
            int iIntValue5 = ((Number) eVar.invoke(p0Var4, Integer.valueOf(iJ))).intValue();
            iJ = d1.i.j(iJ, p0Var4.V(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
            i13 = iIntValue5;
        } else {
            i13 = 0;
        }
        int size6 = list.size();
        for (int i19 = 0; i19 < size6; i19++) {
            Object obj9 = list.get(i19);
            if (fj.l.b(d1.i.h((t2.p0) obj9), "TextField")) {
                int iIntValue6 = ((Number) eVar.invoke(obj9, Integer.valueOf(iJ))).intValue();
                int size7 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i20);
                    if (fj.l.b(d1.i.h((t2.p0) obj6), "Hint")) {
                        break;
                    }
                    i20++;
                }
                Object obj10 = (t2.p0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(iJ))).intValue() : 0;
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i21);
                    if (fj.l.b(d1.i.h((t2.p0) obj7), "Supporting")) {
                        break;
                    }
                    i21++;
                }
                Object obj11 = (t2.p0) obj7;
                return b(rVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i12, i13, iIntValue7, obj11 != null ? ((Number) eVar.invoke(obj11, Integer.valueOf(i11))).intValue() : 0, s3.b.b(0, 0, 0, 0, 15), this.f2688c.a());
            }
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        return c(rVar, list, i10, new p4(7));
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        return d(list, i10, new p4(5));
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        return d(list, i10, new p4(6));
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        return c(rVar, list, i10, new p4(8));
    }
}
