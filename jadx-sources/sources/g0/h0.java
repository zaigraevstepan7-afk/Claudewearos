package g0;

import f0.o0;
import f1.a1;
import f1.f1;
import f1.g1;
import f1.j1;
import t.o1;
import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h0 implements f2 {
    public final a1 A;
    public final a1 B;
    public final j1 C;
    public final j1 D;
    public final j1 E;
    public final j1 F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6890a;

    /* renamed from: b, reason: collision with root package name */
    public z f6891b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f6892c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.i0 f6893d;

    /* renamed from: e, reason: collision with root package name */
    public int f6894e;

    /* renamed from: f, reason: collision with root package name */
    public int f6895f;

    /* renamed from: g, reason: collision with root package name */
    public long f6896g;

    /* renamed from: h, reason: collision with root package name */
    public long f6897h;

    /* renamed from: i, reason: collision with root package name */
    public float f6898i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public final x.n f6899k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6900l;

    /* renamed from: m, reason: collision with root package name */
    public final j1 f6901m;

    /* renamed from: n, reason: collision with root package name */
    public s3.c f6902n;

    /* renamed from: o, reason: collision with root package name */
    public int f6903o;

    /* renamed from: p, reason: collision with root package name */
    public final z.k f6904p;

    /* renamed from: q, reason: collision with root package name */
    public final g1 f6905q;

    /* renamed from: r, reason: collision with root package name */
    public final g1 f6906r;

    /* renamed from: s, reason: collision with root package name */
    public final f1.y f6907s;

    /* renamed from: t, reason: collision with root package name */
    public final o0 f6908t;

    /* renamed from: u, reason: collision with root package name */
    public final o f6909u;

    /* renamed from: v, reason: collision with root package name */
    public final d8.e f6910v;

    /* renamed from: w, reason: collision with root package name */
    public final f0.e f6911w;

    /* renamed from: x, reason: collision with root package name */
    public final j1 f6912x;

    /* renamed from: y, reason: collision with root package name */
    public final d0.s f6913y;

    /* renamed from: z, reason: collision with root package name */
    public final f0.l0 f6914z;

    public h0(int i10, float f10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            a0.a.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f6892c = f1.s.A(new b2.b(0L));
        com.google.android.gms.common.api.internal.i0 i0Var = new com.google.android.gms.common.api.internal.i0();
        i0Var.f3552b = this;
        i0Var.f3553c = new g1(i10);
        i0Var.f3554d = new f1(f10);
        i0Var.f3556f = new f0.j0(i10, 30, 100);
        this.f6893d = i0Var;
        this.f6894e = i10;
        this.f6896g = Long.MAX_VALUE;
        final int i11 = 0;
        this.f6899k = new x.n(new ej.c(this) { // from class: g0.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f6857b;

            {
                this.f6857b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // ej.c
            public final Object invoke(Object obj) {
                z zVar;
                switch (i11) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        h0 h0Var = this.f6857b;
                        long jT = x8.a.t(h0Var);
                        float f11 = h0Var.f6898i + fFloatValue;
                        long jI = hj.a.I(f11);
                        h0Var.f6898i = f11 - jI;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jT + jI;
                            long jQ = cg.b.q(j, h0Var.f6897h, h0Var.f6896g);
                            boolean z2 = j != jQ;
                            long j4 = jQ - jT;
                            float f12 = j4;
                            h0Var.j = f12;
                            if (Math.abs(j4) != 0) {
                                h0Var.E.setValue(Boolean.valueOf(f12 > 0.0f));
                                h0Var.F.setValue(Boolean.valueOf(f12 < 0.0f));
                            }
                            int i12 = (int) j4;
                            int i13 = -i12;
                            z zVarA = ((z) h0Var.f6901m.getValue()).a(i13);
                            if (zVarA != null && (zVar = h0Var.f6891b) != null) {
                                z zVarA2 = zVar.a(i13);
                                if (zVarA2 != null) {
                                    h0Var.f6891b = zVarA2;
                                } else {
                                    zVarA = null;
                                }
                            }
                            if (zVarA != null) {
                                h0Var.h(zVarA, h0Var.f6890a, true);
                                h0Var.A.setValue(pi.o.f13011a);
                            } else {
                                com.google.android.gms.common.api.internal.i0 i0Var2 = h0Var.f6893d;
                                h0 h0Var2 = (h0) i0Var2.f3552b;
                                f1 f1Var = (f1) i0Var2.f3554d;
                                f1Var.h(f1Var.g() + (h0Var2.n() != 0 ? i12 / h0Var2.n() : 0.0f));
                                v2.f0 f0Var = (v2.f0) h0Var.f6912x.getValue();
                                if (f0Var != null) {
                                    f0Var.k();
                                }
                            }
                            if (z2) {
                                ValueOf = Long.valueOf(j4);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        h0 h0Var3 = this.f6857b;
                        f0.m0 m0Var = (f0.m0) obj;
                        t1.g gVarF = t1.r.f();
                        ej.c cVarE = gVarF != null ? gVarF.e() : null;
                        t1.g gVarK = t1.r.k(gVarF);
                        try {
                            m0Var.a(h0Var3.f6894e);
                            t1.r.n(gVarF, gVarK, cVarE);
                            return pi.o.f13011a;
                        } catch (Throwable th2) {
                            t1.r.n(gVarF, gVarK, cVarE);
                            throw th2;
                        }
                }
            }
        });
        this.f6900l = true;
        this.f6901m = new j1(l0.f6932c, f1.f.f6290d);
        this.f6902n = l0.f6931b;
        this.f6904p = new z.k();
        this.f6905q = new g1(-1);
        this.f6906r = new g1(i10);
        f1.f fVar = f1.f.f6293z;
        this.f6907s = f1.s.r(new e(this, 2), fVar);
        f1.s.r(new e(this, 3), fVar);
        final int i12 = 1;
        o0 o0Var = new o0(new ej.c(this) { // from class: g0.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f6857b;

            {
                this.f6857b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // ej.c
            public final Object invoke(Object obj) {
                z zVar;
                switch (i12) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        h0 h0Var = this.f6857b;
                        long jT = x8.a.t(h0Var);
                        float f11 = h0Var.f6898i + fFloatValue;
                        long jI = hj.a.I(f11);
                        h0Var.f6898i = f11 - jI;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jT + jI;
                            long jQ = cg.b.q(j, h0Var.f6897h, h0Var.f6896g);
                            boolean z2 = j != jQ;
                            long j4 = jQ - jT;
                            float f12 = j4;
                            h0Var.j = f12;
                            if (Math.abs(j4) != 0) {
                                h0Var.E.setValue(Boolean.valueOf(f12 > 0.0f));
                                h0Var.F.setValue(Boolean.valueOf(f12 < 0.0f));
                            }
                            int i122 = (int) j4;
                            int i13 = -i122;
                            z zVarA = ((z) h0Var.f6901m.getValue()).a(i13);
                            if (zVarA != null && (zVar = h0Var.f6891b) != null) {
                                z zVarA2 = zVar.a(i13);
                                if (zVarA2 != null) {
                                    h0Var.f6891b = zVarA2;
                                } else {
                                    zVarA = null;
                                }
                            }
                            if (zVarA != null) {
                                h0Var.h(zVarA, h0Var.f6890a, true);
                                h0Var.A.setValue(pi.o.f13011a);
                            } else {
                                com.google.android.gms.common.api.internal.i0 i0Var2 = h0Var.f6893d;
                                h0 h0Var2 = (h0) i0Var2.f3552b;
                                f1 f1Var = (f1) i0Var2.f3554d;
                                f1Var.h(f1Var.g() + (h0Var2.n() != 0 ? i122 / h0Var2.n() : 0.0f));
                                v2.f0 f0Var = (v2.f0) h0Var.f6912x.getValue();
                                if (f0Var != null) {
                                    f0Var.k();
                                }
                            }
                            if (z2) {
                                ValueOf = Long.valueOf(j4);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        h0 h0Var3 = this.f6857b;
                        f0.m0 m0Var = (f0.m0) obj;
                        t1.g gVarF = t1.r.f();
                        ej.c cVarE = gVarF != null ? gVarF.e() : null;
                        t1.g gVarK = t1.r.k(gVarF);
                        try {
                            m0Var.a(h0Var3.f6894e);
                            t1.r.n(gVarF, gVarK, cVarE);
                            return pi.o.f13011a;
                        } catch (Throwable th2) {
                            t1.r.n(gVarF, gVarK, cVarE);
                            throw th2;
                        }
                }
            }
        });
        this.f6908t = o0Var;
        this.f6909u = new o(new ag.i(this, 6), o0Var, new e(this, 4));
        this.f6910v = new d8.e(6);
        this.f6911w = new f0.e();
        this.f6912x = f1.s.A(null);
        this.f6913y = new d0.s(this, 2);
        s3.b.b(0, 0, 0, 0, 15);
        this.f6914z = new f0.l0();
        this.A = f0.o.h();
        this.B = f0.o.h();
        Boolean bool = Boolean.FALSE;
        this.C = f1.s.A(bool);
        this.D = f1.s.A(bool);
        this.E = f1.s.A(bool);
        this.F = f1.s.A(bool);
    }

    public static /* synthetic */ Object g(h0 h0Var, int i10, o1 o1Var, vi.i iVar, int i11) {
        t.j jVarS = o1Var;
        if ((i11 & 4) != 0) {
            jVarS = t.d.s(0.0f, 0.0f, null, 7);
        }
        return h0Var.f(i10, jVarS, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(g0.h0 r5, v.f1 r6, ej.e r7, vi.c r8) {
        /*
            boolean r0 = r8 instanceof g0.g0
            if (r0 == 0) goto L13
            r0 = r8
            g0.g0 r0 = (g0.g0) r0
            int r1 = r0.f6887f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6887f = r1
            goto L18
        L13:
            g0.g0 r0 = new g0.g0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f6885d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f6887f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            g0.h0 r5 = r0.f6882a
            uk.c.R(r8)
            goto L7f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            vi.i r5 = r0.f6884c
            r7 = r5
            ej.e r7 = (ej.e) r7
            v.f1 r6 = r0.f6883b
            g0.h0 r5 = r0.f6882a
            uk.c.R(r8)
            goto L56
        L41:
            uk.c.R(r8)
            r0.f6882a = r5
            r0.f6883b = r6
            r8 = r7
            vi.i r8 = (vi.i) r8
            r0.f6884c = r8
            r0.f6887f = r4
            java.lang.Object r8 = r5.i(r0)
            if (r8 != r1) goto L56
            goto L7e
        L56:
            x.n r8 = r5.f6899k
            boolean r8 = r8.a()
            if (r8 != 0) goto L6d
            com.google.android.gms.common.api.internal.i0 r8 = r5.f6893d
            java.lang.Object r8 = r8.f3553c
            f1.g1 r8 = (f1.g1) r8
            int r8 = r8.g()
            f1.g1 r2 = r5.f6906r
            r2.h(r8)
        L6d:
            x.n r8 = r5.f6899k
            r0.f6882a = r5
            r2 = 0
            r0.f6883b = r2
            r0.f6884c = r2
            r0.f6887f = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r6 = -1
            f1.g1 r5 = r5.f6905q
            r5.h(r6)
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h0.r(g0.h0, v.f1, ej.e, vi.c):java.lang.Object");
    }

    @Override // x.f2
    public final boolean a() {
        return this.f6899k.a();
    }

    @Override // x.f2
    public final Object b(v.f1 f1Var, ej.e eVar, vi.c cVar) {
        return r(this, f1Var, eVar, cVar);
    }

    @Override // x.f2
    public final boolean c() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // x.f2
    public final boolean d() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // x.f2
    public final float e(float f10) {
        return this.f6899k.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, t.j r14, vi.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof g0.e0
            if (r0 == 0) goto L13
            r0 = r15
            g0.e0 r0 = (g0.e0) r0
            int r1 = r0.f6864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6864e = r1
            goto L18
        L13:
            g0.e0 r0 = new g0.e0
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f6862c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f6864e
            r3 = 0
            pi.o r4 = pi.o.f13011a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            uk.c.R(r15)
            return r4
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.f6860a
            t.j r14 = r0.f6861b
            uk.c.R(r15)
        L3c:
            r10 = r14
            goto L70
        L3e:
            uk.c.R(r15)
            com.google.android.gms.common.api.internal.i0 r15 = r12.f6893d
            java.lang.Object r2 = r15.f3553c
            f1.g1 r2 = (f1.g1) r2
            int r2 = r2.g()
            if (r13 != r2) goto L5b
            java.lang.Object r15 = r15.f3554d
            f1.f1 r15 = (f1.f1) r15
            float r15 = r15.g()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 != 0) goto L5b
        L59:
            r7 = r12
            goto Lb4
        L5b:
            int r15 = r12.l()
            if (r15 != 0) goto L62
            goto L59
        L62:
            r0.f6861b = r14
            r0.f6860a = r13
            r0.f6864e = r6
            java.lang.Object r15 = r12.i(r0)
            if (r15 != r1) goto L3c
            r7 = r12
            goto Lb3
        L70:
            double r14 = (double) r3
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto L7e
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L7e
            goto L94
        L7e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r3)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            a0.a.a(r14)
        L94:
            int r8 = r12.j(r13)
            int r13 = r12.n()
            float r13 = (float) r13
            float r9 = r3 * r13
            g0.f0 r6 = new g0.f0
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.f6861b = r13
            r0.f6864e = r5
            v.f1 r13 = v.f1.f17189a
            java.lang.Object r13 = r12.b(r13, r6, r0)
            if (r13 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h0.f(int, t.j, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338 A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:157:0x0343, B:151:0x0338, B:148:0x0320), top: B:172:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0343 A[Catch: all -> 0x0383, TRY_LEAVE, TryCatch #0 {all -> 0x0383, blocks: (B:137:0x02e6, B:140:0x02ef, B:143:0x02fc, B:145:0x0308, B:157:0x0343, B:151:0x0338, B:148:0x0320), top: B:172:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(g0.z r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h0.h(g0.z, boolean, boolean):void");
    }

    public final Object i(vi.c cVar) {
        Object objH;
        return (this.f6901m.getValue() == l0.f6932c && (objH = this.f6911w.h(cVar)) == ui.a.f17085a) ? objH : pi.o.f13011a;
    }

    public final int j(int i10) {
        if (l() > 0) {
            return cg.b.p(i10, 0, l() - 1);
        }
        return 0;
    }

    public final z k() {
        return (z) this.f6901m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((z) this.f6901m.getValue()).f6995b;
    }

    public final int n() {
        return ((z) this.f6901m.getValue()).f6996c + m();
    }

    public final int o() {
        return ((Number) this.f6907s.getValue()).intValue();
    }

    public final long p() {
        return ((b2.b) this.f6892c.getValue()).f1500a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void s(int i10, float f10, boolean z2) {
        com.google.android.gms.common.api.internal.i0 i0Var = this.f6893d;
        g1 g1Var = (g1) i0Var.f3553c;
        f1 f1Var = (f1) i0Var.f3554d;
        if (g1Var.g() != i10 || f1Var.g() != f10) {
            this.f6909u.g();
        }
        ((g1) i0Var.f3553c).h(i10);
        ((f0.j0) i0Var.f3556f).b(i10);
        f1Var.h(f10);
        i0Var.f3555e = null;
        if (!z2) {
            this.B.setValue(pi.o.f13011a);
            return;
        }
        v2.f0 f0Var = (v2.f0) this.f6912x.getValue();
        if (f0Var != null) {
            f0Var.k();
        }
    }
}
