package t1;

import java.util.HashMap;
import ra.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f15469a = new p0(29);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.l f15470b = new p1.l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15471c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static k f15472d;

    /* renamed from: e, reason: collision with root package name */
    public static long f15473e;

    /* renamed from: f, reason: collision with root package name */
    public static final mh.d f15474f;

    /* renamed from: g, reason: collision with root package name */
    public static final ak.x f15475g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f15476h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f15477i;
    public static final a j;

    /* renamed from: k, reason: collision with root package name */
    public static final p1.a f15478k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        k kVar = k.f15461e;
        f15472d = kVar;
        long j4 = 1;
        f15473e = j4 + j4;
        mh.d dVar = new mh.d();
        dVar.f11695b = new long[16];
        dVar.f11696c = new int[16];
        ?? r52 = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            r52[i10] = i11;
            i10 = i11;
        }
        dVar.f11697d = r52;
        f15474f = dVar;
        ak.x xVar = new ak.x(8);
        xVar.f743c = new int[16];
        xVar.f744d = new p1.o[16];
        f15475g = xVar;
        qi.s sVar = qi.s.f13520a;
        f15476h = sVar;
        f15477i = sVar;
        long j10 = f15473e;
        f15473e = j4 + j10;
        a aVar = new a(j10, kVar, null, new p0(28));
        f15472d = f15472d.x(aVar.f15439b);
        j = aVar;
        f15478k = new p1.a(0);
    }

    public static final void a() {
        e(f15469a);
    }

    public static final HashMap b(long j4, b bVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        int i10;
        int i11;
        c0 c0VarS;
        q.h0 h0VarX = bVar.x();
        if (h0VarX != null) {
            long jG = bVar.g();
            k kVarW = bVar.d().x(jG).w(bVar.j);
            Object[] objArr = h0VarX.f13082b;
            long[] jArr3 = h0VarX.f13081a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                HashMap map = null;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                a0 a0Var = (a0) objArr[(i12 << 3) + i15];
                                c0 c0VarB = a0Var.b();
                                jArr2 = jArr3;
                                i10 = i13;
                                i11 = i15;
                                c0 c0VarS2 = s(c0VarB, j4, kVar);
                                if (c0VarS2 == null || (c0VarS = s(c0VarB, jG, kVarW)) == null || c0VarS2.equals(c0VarS)) {
                                    kVar3 = kVarW;
                                } else {
                                    kVar3 = kVarW;
                                    c0 c0VarS3 = s(c0VarB, jG, bVar.d());
                                    if (c0VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    c0 c0VarI = a0Var.i(c0VarS, c0VarS2, c0VarS3);
                                    if (c0VarI == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(c0VarS2, c0VarI);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = kVarW;
                                i10 = i13;
                                i11 = i15;
                            }
                            j10 >>= i10;
                            i15 = i11 + 1;
                            i13 = i10;
                            jArr3 = jArr2;
                            kVarW = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = kVarW;
                        if (i14 != i13) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = kVarW;
                    }
                    if (i12 == length) {
                        return map;
                    }
                    i12++;
                    jArr3 = jArr;
                    kVarW = kVar2;
                }
            }
        }
        return null;
    }

    public static final void c(g gVar) {
        long j4;
        if (f15472d.i(gVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(gVar.g());
        sb2.append(", disposed=");
        sb2.append(gVar.f15440c);
        sb2.append(", applied=");
        b bVar = gVar instanceof b ? (b) gVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.f15415m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f15471c) {
            mh.d dVar = f15474f;
            j4 = dVar.f11698e > 0 ? ((long[]) dVar.f11695b)[0] : -1L;
        }
        sb2.append(j4);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final k d(k kVar, long j4, long j10) {
        while (fj.l.i(j4, j10) < 0) {
            kVar = kVar.x(j4);
            j4++;
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(ej.c r15) {
        /*
            t1.a r0 = t1.m.j
            java.lang.Object r1 = t1.m.f15471c
            monitor-enter(r1)
            q.h0 r2 = r0.f15411h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            p1.a r3 = t1.m.f15478k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = t1.m.f15476h     // Catch: java.lang.Throwable -> L36
            g1.h r5 = new g1.h     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            ej.e r8 = (ej.e) r8     // Catch: java.lang.Throwable -> L36
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            p1.a r0 = t1.m.f15478k
            r0.addAndGet(r3)
            goto L44
        L3e:
            p1.a r0 = t1.m.f15478k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = t1.m.f15471c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f13082b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f13081a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            t1.a0 r11 = (t1.a0) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.m.e(ej.c):java.lang.Object");
    }

    public static final void f() {
        ak.x xVar = f15475g;
        int i10 = xVar.f742b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            p1.o oVar = ((p1.o[]) xVar.f744d)[i11];
            Object obj = oVar != null ? oVar.get() : null;
            if (obj != null && p((a0) obj)) {
                if (i12 != i11) {
                    ((p1.o[]) xVar.f744d)[i12] = oVar;
                    int[] iArr = (int[]) xVar.f743c;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((p1.o[]) xVar.f744d)[i13] = null;
            ((int[]) xVar.f743c)[i13] = 0;
        }
        if (i12 != i10) {
            xVar.f742b = i12;
        }
    }

    public static final g g(g gVar, ej.c cVar, boolean z2) {
        boolean z10 = gVar instanceof b;
        if (z10 || gVar == null) {
            return new g0(z10 ? (b) gVar : null, cVar, null, false, z2);
        }
        return new h0(gVar, cVar, false, z2);
    }

    public static final c0 h(c0 c0Var) {
        c0 c0VarS;
        g gVarJ = j();
        c0 c0VarS2 = s(c0Var, gVarJ.g(), gVarJ.d());
        if (c0VarS2 != null) {
            return c0VarS2;
        }
        synchronized (f15471c) {
            g gVarJ2 = j();
            c0VarS = s(c0Var, gVarJ2.g(), gVarJ2.d());
        }
        if (c0VarS != null) {
            return c0VarS;
        }
        r();
        throw null;
    }

    public static final c0 i(c0 c0Var, g gVar) {
        c0 c0VarS;
        c0 c0VarS2 = s(c0Var, gVar.g(), gVar.d());
        if (c0VarS2 != null) {
            return c0VarS2;
        }
        synchronized (f15471c) {
            c0VarS = s(c0Var, gVar.g(), gVar.d());
        }
        if (c0VarS != null) {
            return c0VarS;
        }
        r();
        throw null;
    }

    public static final g j() {
        g gVar = (g) f15470b.get();
        return gVar == null ? j : gVar;
    }

    public static final ej.c k(ej.c cVar, ej.c cVar2, boolean z2) {
        if (!z2) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 0);
    }

    public static final ej.c l(ej.c cVar, ej.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new l(cVar, cVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final t1.c0 m(t1.c0 r10, t1.a0 r11) {
        /*
            t1.c0 r0 = r11.b()
            long r1 = t1.m.f15473e
            mh.d r3 = t1.m.f15474f
            int r4 = r3.f11698e
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f11695b
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f15419a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = fj.l.i(r5, r1)
            if (r7 > 0) goto L48
            t1.k r7 = t1.k.f15461e
            boolean r5 = r7.i(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f15419a
            long r5 = r4.f15419a
            int r1 = fj.l.i(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            t1.c0 r0 = r0.f15420b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f15419a = r0
            return r3
        L55:
            t1.c0 r10 = r10.b(r0)
            t1.c0 r0 = r11.b()
            r10.f15420b = r0
            r11.e(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.m.m(t1.c0, t1.a0):t1.c0");
    }

    public static final void n(g gVar, a0 a0Var) {
        gVar.t(gVar.h() + 1);
        ej.c cVarI = gVar.i();
        if (cVarI != null) {
            cVarI.invoke(a0Var);
        }
    }

    public static final c0 o(c0 c0Var, b0 b0Var, g gVar, c0 c0Var2) {
        c0 c0VarM;
        if (gVar.f()) {
            gVar.n(b0Var);
        }
        long jG = gVar.g();
        if (c0Var2.f15419a == jG) {
            return c0Var2;
        }
        synchronized (f15471c) {
            c0VarM = m(c0Var, b0Var);
        }
        c0VarM.f15419a = jG;
        if (c0Var2.f15419a != 1) {
            gVar.n(b0Var);
        }
        return c0VarM;
    }

    public static final boolean p(a0 a0Var) {
        c0 c0Var;
        long j4 = f15473e;
        mh.d dVar = f15474f;
        if (dVar.f11698e > 0) {
            j4 = ((long[]) dVar.f11695b)[0];
        }
        c0 c0Var2 = null;
        c0 c0VarB = null;
        int i10 = 0;
        for (c0 c0VarB2 = a0Var.b(); c0VarB2 != null; c0VarB2 = c0VarB2.f15420b) {
            long j10 = c0VarB2.f15419a;
            if (j10 != 0) {
                if (fj.l.i(j10, j4) >= 0) {
                    i10++;
                } else if (c0Var2 == null) {
                    i10++;
                    c0Var2 = c0VarB2;
                } else {
                    if (fj.l.i(c0VarB2.f15419a, c0Var2.f15419a) < 0) {
                        c0Var = c0Var2;
                        c0Var2 = c0VarB2;
                    } else {
                        c0Var = c0VarB2;
                    }
                    if (c0VarB == null) {
                        c0VarB = a0Var.b();
                        c0 c0Var3 = c0VarB;
                        while (true) {
                            if (c0VarB == null) {
                                c0VarB = c0Var3;
                                break;
                            }
                            if (fj.l.i(c0VarB.f15419a, j4) >= 0) {
                                break;
                            }
                            if (fj.l.i(c0Var3.f15419a, c0VarB.f15419a) < 0) {
                                c0Var3 = c0VarB;
                            }
                            c0VarB = c0VarB.f15420b;
                        }
                    }
                    c0Var2.f15419a = 0L;
                    c0Var2.a(c0VarB);
                    c0Var2 = c0Var;
                }
            }
        }
        return i10 > 1;
    }

    public static final void q(a0 a0Var) {
        if (p(a0Var)) {
            ak.x xVar = f15475g;
            int i10 = xVar.f742b;
            int iIdentityHashCode = System.identityHashCode(a0Var);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = xVar.f742b - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) xVar.f743c)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        p1.o oVar = ((p1.o[]) xVar.f744d)[i14];
                        if (a0Var == (oVar != null ? oVar.get() : null)) {
                            i11 = i14;
                        } else {
                            for (int i16 = i14 - 1; -1 < i16 && ((int[]) xVar.f743c)[i16] == iIdentityHashCode; i16--) {
                                p1.o oVar2 = ((p1.o[]) xVar.f744d)[i16];
                                if ((oVar2 != null ? oVar2.get() : null) == a0Var) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = xVar.f742b;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(xVar.f742b + 1);
                                    break;
                                } else {
                                    if (((int[]) xVar.f743c)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    p1.o oVar3 = ((p1.o[]) xVar.f744d)[i14];
                                    if ((oVar3 != null ? oVar3.get() : null) == a0Var) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            p1.o[] oVarArr = (p1.o[]) xVar.f744d;
            int length = oVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                p1.o[] oVarArr2 = new p1.o[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(oVarArr, i18, oVarArr2, i20, i10 - i18);
                System.arraycopy((p1.o[]) xVar.f744d, 0, oVarArr2, 0, i18);
                qi.k.e0(i20, i18, i10, (int[]) xVar.f743c, iArr);
                qi.k.j0(0, i18, 6, (int[]) xVar.f743c, iArr);
                xVar.f744d = oVarArr2;
                xVar.f743c = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(oVarArr, i18, oVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) xVar.f743c;
                qi.k.e0(i21, i18, i10, iArr2, iArr2);
            }
            ((p1.o[]) xVar.f744d)[i18] = new p1.o(a0Var);
            ((int[]) xVar.f743c)[i18] = iIdentityHashCode;
            xVar.f742b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final c0 s(c0 c0Var, long j4, k kVar) {
        c0 c0Var2 = null;
        while (c0Var != null) {
            long j10 = c0Var.f15419a;
            if (j10 != 0 && fj.l.i(j10, j4) <= 0 && !kVar.i(j10) && (c0Var2 == null || fj.l.i(c0Var2.f15419a, c0Var.f15419a) < 0)) {
                c0Var2 = c0Var;
            }
            c0Var = c0Var.f15420b;
        }
        if (c0Var2 != null) {
            return c0Var2;
        }
        return null;
    }

    public static final c0 t(c0 c0Var, a0 a0Var) {
        c0 c0VarS;
        g gVarJ = j();
        ej.c cVarE = gVarJ.e();
        if (cVarE != null) {
            cVarE.invoke(a0Var);
        }
        c0 c0VarS2 = s(c0Var, gVarJ.g(), gVarJ.d());
        if (c0VarS2 != null) {
            return c0VarS2;
        }
        synchronized (f15471c) {
            g gVarJ2 = j();
            c0 c0VarB = a0Var.b();
            fj.l.d(c0VarB, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            c0VarS = s(c0VarB, gVarJ2.g(), gVarJ2.d());
            if (c0VarS == null) {
                r();
                throw null;
            }
        }
        return c0VarS;
    }

    public static final void u(int i10) {
        mh.d dVar = f15474f;
        int i11 = ((int[]) dVar.f11697d)[i10];
        dVar.h(i11, dVar.f11698e - 1);
        dVar.f11698e--;
        long[] jArr = (long[]) dVar.f11695b;
        long j4 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (fj.l.i(jArr[i13], j4) <= 0) {
                break;
            }
            dVar.h(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) dVar.f11695b;
        int i14 = dVar.f11698e >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < dVar.f11698e && fj.l.i(jArr2[i15], jArr2[i16]) < 0) {
                if (fj.l.i(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                dVar.h(i15, i11);
                i11 = i15;
            } else {
                if (fj.l.i(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                dVar.h(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) dVar.f11697d)[i10] = dVar.f11699f;
        dVar.f11699f = i10;
    }

    public static final Object v(a aVar, ej.c cVar) {
        long j4 = aVar.f15439b;
        Object objInvoke = cVar.invoke(f15472d.e(j4));
        long j10 = f15473e;
        f15473e = 1 + j10;
        k kVarE = f15472d.e(j4);
        f15472d = kVarE;
        aVar.f15439b = j10;
        aVar.f15438a = kVarE;
        aVar.f15410g = 0;
        aVar.f15411h = null;
        aVar.o();
        f15472d = f15472d.x(j10);
        return objInvoke;
    }

    public static final c0 w(c0 c0Var, a0 a0Var, g gVar) {
        c0 c0VarS;
        if (gVar.f()) {
            gVar.n(a0Var);
        }
        long jG = gVar.g();
        c0 c0VarS2 = s(c0Var, jG, gVar.d());
        if (c0VarS2 == null) {
            r();
            throw null;
        }
        if (c0VarS2.f15419a == gVar.g()) {
            return c0VarS2;
        }
        synchronized (f15471c) {
            c0VarS = s(a0Var.b(), jG, gVar.d());
            if (c0VarS == null) {
                r();
                throw null;
            }
            if (c0VarS.f15419a != jG) {
                c0 c0VarM = m(c0VarS, a0Var);
                c0VarM.a(c0VarS);
                c0VarM.f15419a = gVar.g();
                c0VarS = c0VarM;
            }
        }
        if (c0VarS2.f15419a != 1) {
            gVar.n(a0Var);
        }
        return c0VarS;
    }
}
