package t2;

import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 implements f1.i {
    public final g0 A;
    public final d0 B;
    public final q.g0 C;
    public final q.r0 D;
    public final q.g0 E;
    public final g1.e F;
    public int G;
    public int H;
    public final String I;

    /* renamed from: a, reason: collision with root package name */
    public final v2.f0 f15600a;

    /* renamed from: b, reason: collision with root package name */
    public f1.p f15601b;

    /* renamed from: c, reason: collision with root package name */
    public r1 f15602c;

    /* renamed from: d, reason: collision with root package name */
    public int f15603d;

    /* renamed from: e, reason: collision with root package name */
    public int f15604e;

    /* renamed from: f, reason: collision with root package name */
    public final q.g0 f15605f;

    /* renamed from: z, reason: collision with root package name */
    public final q.g0 f15606z;

    public m0(v2.f0 f0Var, r1 r1Var) {
        this.f15600a = f0Var;
        this.f15602c = r1Var;
        long[] jArr = q.n0.f13108a;
        this.f15605f = new q.g0();
        this.f15606z = new q.g0();
        this.A = new g0(this);
        this.B = new d0(this);
        this.C = new q.g0();
        this.D = new q.r0();
        this.E = new q.g0();
        this.F = new g1.e(new Object[16]);
        this.I = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(m0 m0Var, Object obj) {
        v2.f0 f0Var = m0Var.f15600a;
        m0Var.h();
        v2.f0 f0Var2 = (v2.f0) m0Var.C.k(obj);
        if (f0Var2 != null) {
            if (m0Var.H <= 0) {
                s2.a.b("No pre-composed items to dispose");
            }
            int iJ = ((g1.e) ((g1.b) f0Var.o()).f7016b).j(f0Var2);
            if (iJ < ((g1.e) ((g1.b) f0Var.o()).f7016b).f7026c - m0Var.H) {
                s2.a.b("Item is not in pre-composed item range");
            }
            m0Var.G++;
            m0Var.H--;
            e0 e0Var = (e0) m0Var.f15605f.g(f0Var2);
            if (e0Var != null) {
                e(e0Var);
            }
            int i10 = (((g1.e) ((g1.b) f0Var.o()).f7016b).f7026c - m0Var.H) - m0Var.G;
            m0Var.j(iJ, i10);
            m0Var.g(i10);
        }
        if (m0Var.F.i(obj)) {
            v2.f0.V(f0Var, true, 6);
        }
    }

    public static void e(e0 e0Var) {
        q.h0 h0Var;
        f1.l1 l1Var = e0Var.f15538f;
        if (l1Var != null) {
            l1Var.f6380h.set(f1.m1.f6388b);
            p1.k kVar = l1Var.f6382k;
            if (kVar.f12652d.h()) {
                h0Var = kVar.f12652d;
                q.h0 h0Var2 = q.o0.f13110a;
                kVar.f12652d = new q.h0();
                kVar.f12651c.h();
            } else {
                h0Var = null;
            }
            kVar.b();
            f1.r rVar = l1Var.f6373a;
            rVar.J = null;
            if (h0Var != null) {
                rVar.N.f12658k = h0Var;
                rVar.P = 2;
            }
            e0Var.f15538f = null;
            f1.r rVar2 = e0Var.f15535c;
            if (rVar2 != null) {
                rVar2.m();
            }
            e0Var.f15535c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // f1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            v2.f0 r2 = r0.f15600a
            r2.J = r1
            q.g0 r1 = r0.f15605f
            java.lang.Object[] r3 = r1.f13075c
            long[] r4 = r1.f13073a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            t2.e0 r13 = (t2.e0) r13
            f1.r r13 = r13.f15535c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.J = r6
            r1.a()
            q.g0 r1 = r0.f15606z
            r1.a()
            r0.H = r6
            r0.G = r6
            q.g0 r1 = r0.C
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.m0.a():void");
    }

    @Override // f1.i
    public final void b() {
        i(true);
    }

    public final void d(e0 e0Var, boolean z2) {
        f1.l1 l1Var = e0Var.f15538f;
        if (l1Var != null) {
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            try {
                v2.f0 f0Var = this.f15600a;
                f0Var.J = true;
                if (z2) {
                    while (!l1Var.c()) {
                        try {
                            l1Var.e(new l7.n(20));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                l1Var.a();
                e0Var.f15538f = null;
                f0Var.J = false;
            } finally {
                t1.r.n(gVarF, gVarK, cVarE);
            }
        }
    }

    public final n1 f(Object obj) {
        return !this.f15600a.G() ? new j0() : new k0(this, obj);
    }

    public final void g(int i10) {
        boolean z2;
        boolean z10 = false;
        this.G = 0;
        List listO = this.f15600a.o();
        g1.b bVar = (g1.b) listO;
        int i11 = (((g1.e) bVar.f7016b).f7026c - this.H) - 1;
        if (i10 <= i11) {
            this.D.clear();
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    Object objG = this.f15605f.g((v2.f0) bVar.get(i12));
                    fj.l.c(objG);
                    ((q.d0) this.D.f13125b).a(((e0) objG).f15533a);
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f15602c.d(this.D);
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            z2 = false;
            while (i11 >= i10) {
                try {
                    v2.f0 f0Var = (v2.f0) ((g1.b) listO).get(i11);
                    Object objG2 = this.f15605f.g(f0Var);
                    fj.l.c(objG2);
                    e0 e0Var = (e0) objG2;
                    Object obj = e0Var.f15533a;
                    if (((q.d0) this.D.f13125b).c(obj)) {
                        this.G++;
                        if (((Boolean) e0Var.f15539g.getValue()).booleanValue()) {
                            v2.j0 j0Var = f0Var.Z;
                            v2.v0 v0Var = j0Var.f17703p;
                            v2.d0 d0Var = v2.d0.f17604c;
                            v0Var.E = d0Var;
                            v2.r0 r0Var = j0Var.f17704q;
                            if (r0Var != null) {
                                r0Var.C = d0Var;
                            }
                            l(e0Var, false);
                            if (e0Var.f15540h) {
                                z2 = true;
                            }
                        }
                    } else {
                        v2.f0 f0Var2 = this.f15600a;
                        f0Var2.J = true;
                        this.f15605f.k(f0Var);
                        f1.r rVar = e0Var.f15535c;
                        if (rVar != null) {
                            rVar.m();
                        }
                        this.f15600a.Q(i11, 1);
                        f0Var2.J = false;
                    }
                    this.f15606z.k(obj);
                    i11--;
                } catch (Throwable th2) {
                    t1.r.n(gVarF, gVarK, cVarE);
                    throw th2;
                }
            }
            t1.r.n(gVarF, gVarK, cVarE);
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (t1.m.f15471c) {
                q.h0 h0Var = t1.m.j.f15411h;
                if (h0Var != null) {
                    if (h0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                t1.m.a();
            }
        }
        h();
    }

    public final void h() {
        int i10 = ((g1.e) ((g1.b) this.f15600a.o()).f7016b).f7026c;
        q.g0 g0Var = this.f15605f;
        if (g0Var.f13077e != i10) {
            s2.a.a("Inconsistency between the count of nodes tracked by the state (" + g0Var.f13077e + ") and the children count on the SubcomposeLayout (" + i10 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i10 - this.G) - this.H < 0) {
            StringBuilder sbP = gk.b.p(i10, "Incorrect state. Total children ", ". Reusable children ");
            sbP.append(this.G);
            sbP.append(". Precomposed children ");
            sbP.append(this.H);
            s2.a.a(sbP.toString());
        }
        q.g0 g0Var2 = this.C;
        if (g0Var2.f13077e == this.H) {
            return;
        }
        s2.a.a("Incorrect state. Precomposed children " + this.H + ". Map size " + g0Var2.f13077e);
    }

    public final void i(boolean z2) {
        this.H = 0;
        this.C.a();
        List listO = this.f15600a.o();
        int i10 = ((g1.e) ((g1.b) listO).f7016b).f7026c;
        if (this.G != i10) {
            this.G = i10;
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    v2.f0 f0Var = (v2.f0) ((g1.b) listO).get(i11);
                    e0 e0Var = (e0) this.f15605f.g(f0Var);
                    if (e0Var != null && ((Boolean) e0Var.f15539g.getValue()).booleanValue()) {
                        v2.j0 j0Var = f0Var.Z;
                        v2.v0 v0Var = j0Var.f17703p;
                        v2.d0 d0Var = v2.d0.f17604c;
                        v0Var.E = d0Var;
                        v2.r0 r0Var = j0Var.f17704q;
                        if (r0Var != null) {
                            r0Var.C = d0Var;
                        }
                        l(e0Var, z2);
                        e0Var.f15533a = z.f15683a;
                    }
                } catch (Throwable th2) {
                    t1.r.n(gVarF, gVarK, cVarE);
                    throw th2;
                }
            }
            t1.r.n(gVarF, gVarK, cVarE);
            this.f15606z.a();
        }
        h();
    }

    public final void j(int i10, int i11) {
        v2.f0 f0Var = this.f15600a;
        f0Var.J = true;
        f0Var.K(i10, i11, 1);
        f0Var.J = false;
    }

    public final void k(Object obj, ej.e eVar, boolean z2) {
        v2.f0 f0Var = this.f15600a;
        if (f0Var.G()) {
            h();
            if (this.f15606z.c(obj)) {
                return;
            }
            this.E.k(obj);
            q.g0 g0Var = this.C;
            Object objG = g0Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((g1.e) ((g1.b) f0Var.o()).f7016b).j(objG), ((g1.e) ((g1.b) f0Var.o()).f7016b).f7026c);
                    this.H++;
                } else {
                    int i10 = ((g1.e) ((g1.b) f0Var.o()).f7016b).f7026c;
                    v2.f0 f0Var2 = new v2.f0(2);
                    f0Var.J = true;
                    f0Var.A(i10, f0Var2);
                    f0Var.J = false;
                    this.H++;
                    objG = f0Var2;
                }
                g0Var.m(obj, objG);
            }
            m((v2.f0) objG, obj, z2, eVar);
        }
    }

    public final void l(e0 e0Var, boolean z2) {
        f1.r rVar;
        if (z2 || !e0Var.f15540h) {
            e0Var.f15539g = f1.s.A(Boolean.FALSE);
        } else {
            e0Var.f15539g.setValue(Boolean.FALSE);
        }
        if (e0Var.f15538f != null) {
            e(e0Var);
            return;
        }
        if (z2) {
            f1.r rVar2 = e0Var.f15535c;
            if (rVar2 != null) {
                rVar2.l();
                return;
            }
            return;
        }
        v2.p1 outOfFrameExecutor = ((w2.t) v2.i0.a(this.f15600a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (e0Var.f15540h || (rVar = e0Var.f15535c) == null) {
                return;
            }
            rVar.l();
            return;
        }
        a2.f0 f0Var = new a2.f0(e0Var, 10);
        w2.t tVar = (w2.t) outOfFrameExecutor;
        qi.j jVar = tVar.B;
        boolean zIsEmpty = jVar.isEmpty();
        jVar.addLast(f0Var);
        if (zIsEmpty) {
            Handler handler = tVar.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(tVar.C);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(v2.f0 r10, java.lang.Object r11, boolean r12, ej.e r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.m0.m(v2.f0, java.lang.Object, boolean, ej.e):void");
    }

    public final v2.f0 n(Object obj) {
        q.g0 g0Var;
        int i10;
        if (this.G == 0) {
            return null;
        }
        g1.b bVar = (g1.b) this.f15600a.o();
        int i11 = ((g1.e) bVar.f7016b).f7026c - this.H;
        int i12 = i11 - this.G;
        int i13 = i11 - 1;
        int i14 = i13;
        while (true) {
            g0Var = this.f15605f;
            if (i14 < i12) {
                i10 = -1;
                break;
            }
            Object objG = g0Var.g((v2.f0) bVar.get(i14));
            fj.l.c(objG);
            if (fj.l.b(((e0) objG).f15533a, obj)) {
                i10 = i14;
                break;
            }
            i14--;
        }
        if (i10 == -1) {
            while (i13 >= i12) {
                Object objG2 = g0Var.g((v2.f0) bVar.get(i13));
                fj.l.c(objG2);
                e0 e0Var = (e0) objG2;
                Object obj2 = e0Var.f15533a;
                if (obj2 == z.f15683a || this.f15602c.b(obj, obj2)) {
                    e0Var.f15533a = obj;
                    i14 = i13;
                    i10 = i14;
                    break;
                }
                i13--;
            }
            i14 = i13;
        }
        if (i10 == -1) {
            return null;
        }
        if (i14 != i12) {
            j(i14, i12);
        }
        this.G--;
        v2.f0 f0Var = (v2.f0) bVar.get(i12);
        Object objG3 = g0Var.g(f0Var);
        fj.l.c(objG3);
        e0 e0Var2 = (e0) objG3;
        e0Var2.f15539g = f1.s.A(Boolean.TRUE);
        e0Var2.f15537e = true;
        e0Var2.f15536d = true;
        return f0Var;
    }
}
