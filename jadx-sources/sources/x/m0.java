package x;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m0 extends v2.k implements v2.w1, m2.c, v2.i, v.l0 {
    public o1 J;
    public ej.c K;
    public boolean L;
    public z.k M;
    public v.m0 N;
    public sj.c O;
    public z.b P;
    public boolean Q;
    public boolean R;
    public p S;
    public s T;
    public r U;
    public q V;
    public w2 W;
    public p7.k X;
    public mc.e Z;

    /* renamed from: a0, reason: collision with root package name */
    public a1 f19627a0;
    public long Y = 9205357640488583168L;

    /* renamed from: b0, reason: collision with root package name */
    public long f19628b0 = 0;

    public m0(ej.c cVar, boolean z2, z.k kVar, o1 o1Var) {
        this.J = o1Var;
        this.K = cVar;
        this.L = z2;
        this.M = kVar;
    }

    public static void A1(m0 m0Var, p2.w wVar, long j, long j4, int i10) {
        if ((i10 & 4) != 0) {
            j4 = 0;
        }
        r rVar = m0Var.U;
        if (rVar == null) {
            rVar = new r();
            rVar.f19696b = null;
            rVar.f19697c = Long.MAX_VALUE;
            rVar.f19698d = false;
            m0Var.U = rVar;
        }
        rVar.f19696b = wVar;
        rVar.f19697c = j;
        mc.e eVar = m0Var.Z;
        if (eVar == null) {
            m0Var.Z = new mc.e(m0Var.J);
        } else {
            eVar.f11546c = m0Var.J;
            eVar.f11545b = j4;
        }
        rVar.f19698d = false;
        m0Var.W = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(x.m0 r5, vi.c r6) {
        /*
            boolean r0 = r6 instanceof x.i0
            if (r0 == 0) goto L13
            r0 = r6
            x.i0 r0 = (x.i0) r0
            int r1 = r0.f19555c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19555c = r1
            goto L18
        L13:
            x.i0 r0 = new x.i0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f19553a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19555c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r6)
            z.b r6 = r5.P
            if (r6 == 0) goto L4b
            z.k r2 = r5.M
            if (r2 == 0) goto L48
            z.a r4 = new z.a
            r4.<init>(r6)
            r0.f19555c = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r6 = 0
            r5.P = r6
        L4b:
            x.w r6 = new x.w
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.D1(r6)
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.m0.t1(x.m0, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(x.m0 r6, x.v r7, vi.c r8) {
        /*
            boolean r0 = r8 instanceof x.j0
            if (r0 == 0) goto L13
            r0 = r8
            x.j0 r0 = (x.j0) r0
            int r1 = r0.f19575e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19575e = r1
            goto L18
        L13:
            x.j0 r0 = new x.j0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f19573c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19575e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            z.b r7 = r0.f19572b
            x.v r0 = r0.f19571a
            uk.c.R(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            x.v r7 = r0.f19571a
            uk.c.R(r8)
            goto L57
        L3c:
            uk.c.R(r8)
            z.b r8 = r6.P
            if (r8 == 0) goto L57
            z.k r2 = r6.M
            if (r2 == 0) goto L57
            z.a r5 = new z.a
            r5.<init>(r8)
            r0.f19571a = r7
            r0.f19575e = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L57
            goto L6c
        L57:
            z.b r8 = new z.b
            r8.<init>()
            z.k r2 = r6.M
            if (r2 == 0) goto L71
            r0.f19571a = r7
            r0.f19572b = r8
            r0.f19575e = r3
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r8 = r7
            r7 = r0
        L71:
            r6.P = r8
            long r7 = r7.f19739a
            r6.C1(r7)
            pi.o r6 = pi.o.f13011a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.m0.u1(x.m0, x.v, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v1(x.m0 r5, x.w r6, vi.c r7) {
        /*
            boolean r0 = r7 instanceof x.k0
            if (r0 == 0) goto L13
            r0 = r7
            x.k0 r0 = (x.k0) r0
            int r1 = r0.f19590d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19590d = r1
            goto L18
        L13:
            x.k0 r0 = new x.k0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f19588b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19590d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x.w r6 = r0.f19587a
            uk.c.R(r7)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            uk.c.R(r7)
            z.b r7 = r5.P
            if (r7 == 0) goto L4f
            z.k r2 = r5.M
            if (r2 == 0) goto L4c
            z.c r4 = new z.c
            r4.<init>(r7)
            r0.f19587a = r6
            r0.f19590d = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r7 = 0
            r5.P = r7
        L4f:
            r5.D1(r6)
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.m0.v1(x.m0, x.w, vi.c):java.lang.Object");
    }

    public final void B1(x xVar) {
        if ((xVar instanceof v) && !this.Q) {
            this.Q = true;
            J1();
        }
        E1().h(xVar);
    }

    public abstract void C1(long j);

    public abstract void D1(w wVar);

    public final sj.g E1() {
        sj.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Events channel not initialized.");
    }

    public final p7.k F1() {
        p7.k kVar = this.X;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final void G1(long j, p2.w wVar) {
        long jX = v2.n.x(this.f17565a).X(0L);
        if (!b2.b.c(this.Y, 9205357640488583168L) && !b2.b.c(jX, this.Y)) {
            this.f19628b0 = b2.b.f(this.f19628b0, b2.b.e(jX, this.Y));
        }
        this.Y = jX;
        yd.f.e(F1(), wVar, this.f19628b0);
        E1().h(new u(j, false));
    }

    public final void H1(p2.w wVar, p2.w wVar2, long j) {
        if (this.X == null) {
            this.X = new p7.k(19);
        }
        yd.f.e(F1(), wVar, 0L);
        long jE = b2.b.e(wVar2.f12762c, j);
        this.f19628b0 = 0L;
        if (((Boolean) this.K.invoke(new p2.g0(wVar.f12768i))).booleanValue()) {
            if (!this.Q) {
                if (this.O == null) {
                    this.O = u6.v.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
                }
                J1();
            }
            this.Y = v2.n.x(this).X(0L);
            E1().h(new v(jE));
        }
    }

    @Override // v.l0
    public final boolean I(m2.b bVar) {
        return w2.h(bVar) && this.L;
    }

    public abstract boolean I1();

    public final void J1() {
        this.Q = true;
        if (this.O == null) {
            this.O = u6.v.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        }
        qj.b0.w(e1(), null, new l0(this, null), 3);
    }

    public final void K1(ej.c cVar, boolean z2, z.k kVar, o1 o1Var, boolean z10) {
        this.K = cVar;
        boolean z11 = true;
        if (this.L != z2) {
            this.L = z2;
            if (!z2) {
                w1();
                this.f19627a0 = null;
            }
            z10 = true;
        }
        if (!fj.l.b(this.M, kVar)) {
            w1();
            this.M = kVar;
        }
        if (this.J != o1Var) {
            this.J = o1Var;
        } else {
            z11 = z10;
        }
        if (z11) {
            boolean z12 = this.R;
            t tVar = t.f19716a;
            if (z12) {
                y1();
                if (this.Q) {
                    E1().h(tVar);
                }
                this.X = null;
            }
            a1 a1Var = this.f19627a0;
            if (a1Var != null) {
                a1Var.a();
                m0 m0Var = a1Var.f19432a;
                if (m0Var.Q) {
                    m0Var.B1(tVar);
                }
                a1Var.f19438g = null;
                k4.d dVar = a1Var.f19441k;
                dVar.f9420a = 0;
                ((q.x) dVar.f9421b).f13145b = 0;
            }
        }
    }

    @Override // v2.w1
    public final void V() {
        if (this.R) {
            y1();
            if (this.Q) {
                E1().h(t.f19716a);
            }
            this.X = null;
        }
        this.R = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [v.l0, v2.k, x.m0] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    @Override // m2.c
    public final void X(ak.x xVar, p2.o oVar) {
        Object obj;
        Object obj2;
        m2.b bVar;
        m2.b bVar2;
        m2.b bVar3;
        int i10 = xVar.f742b;
        ArrayList arrayList = (ArrayList) xVar.f743c;
        if (this.N == null) {
            v.m0 m0Var = new v.m0(this);
            q1(m0Var);
            this.N = m0Var;
        }
        if (this.L) {
            if (this.f19627a0 == null) {
                this.f19627a0 = new a1(this);
            }
            a1 a1Var = this.f19627a0;
            if (a1Var != null) {
                m0 m0Var2 = a1Var.f19432a;
                if (a1Var.f19437f == null) {
                    v0 v0Var = a1Var.f19433b;
                    if (v0Var == null) {
                        u0 u0Var = u0.f19733c;
                        v0Var = new v0();
                        v0Var.f19740b = u0Var;
                        v0Var.f19741c = false;
                        a1Var.f19433b = v0Var;
                    }
                    a1Var.f19437f = v0Var;
                }
                w2 w2Var = a1Var.f19437f;
                if (w2Var == null) {
                    throw new IllegalArgumentException("currentDragState should not be null");
                }
                boolean z2 = true;
                if (w2Var instanceof v0) {
                    v0 v0Var2 = (v0) w2Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (!w2.h((m2.b) arrayList.get(i11))) {
                            return;
                        }
                    }
                    m2.b bVar4 = (m2.b) qi.l.z0(arrayList);
                    u0 u0Var2 = z0.f19773a[v0Var2.f19740b.ordinal()] == 1 ? !m0Var2.I1() ? u0.f19731a : u0.f19732b : v0Var2.f19740b;
                    v0Var2.f19740b = u0Var2;
                    if (oVar == p2.o.f12743a && u0Var2 == u0.f19732b) {
                        bVar4.f11267i = true;
                        v0Var2.f19741c = true;
                    }
                    if (oVar == p2.o.f12744b) {
                        if (u0Var2 == u0.f19731a) {
                            a1.c(a1Var, bVar4, bVar4.f11259a, 0L, 12);
                            return;
                        }
                        if (v0Var2.f19741c) {
                            a1Var.f(bVar4, bVar4, new m2.a(i10), 0L);
                            a1Var.e(bVar4, new m2.a(i10), 0L);
                            long j = bVar4.f11259a;
                            y0 y0Var = a1Var.f19434c;
                            if (y0Var == null) {
                                y0Var = new y0();
                                y0Var.f19760b = Long.MAX_VALUE;
                                a1Var.f19434c = y0Var;
                            }
                            y0Var.f19760b = j;
                            a1Var.f19437f = y0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (w2Var instanceof x0) {
                    x0 x0Var = (x0) w2Var;
                    if (oVar == p2.o.f12743a) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            bVar = null;
                            break;
                        }
                        ?? r10 = arrayList.get(i12);
                        if (p2.v.e(((m2.b) r10).f11259a, x0Var.f19749c)) {
                            bVar = r10;
                            break;
                        }
                        i12++;
                    }
                    m2.b bVar5 = bVar;
                    if (bVar5 == null) {
                        int size3 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                bVar3 = 0;
                                break;
                            }
                            bVar3 = arrayList.get(i13);
                            if (((m2.b) bVar3).f11262d) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        bVar5 = bVar3;
                        if (bVar5 == null) {
                            a1Var.a();
                            return;
                        }
                        x0Var.f19749c = bVar5.f11259a;
                    }
                    m2.b bVar6 = bVar5;
                    if (oVar == p2.o.f12744b) {
                        if (bVar6.f11267i) {
                            m2.b bVar7 = x0Var.f19748b;
                            if (bVar7 == null) {
                                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                            }
                            long j4 = x0Var.f19749c;
                            mc.e eVar = a1Var.f19440i;
                            if (eVar == null) {
                                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                            }
                            a1Var.b(bVar7, j4, eVar);
                        } else if (w2.b(bVar6)) {
                            int size4 = arrayList.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size4) {
                                    bVar2 = null;
                                    break;
                                }
                                ?? r62 = arrayList.get(i14);
                                if (((m2.b) r62).f11262d) {
                                    bVar2 = r62;
                                    break;
                                }
                                i14++;
                            }
                            m2.b bVar8 = bVar2;
                            if (bVar8 == null) {
                                a1Var.a();
                            } else {
                                x0Var.f19749c = bVar8.f11259a;
                            }
                        } else {
                            w2.h2 h2Var = (w2.h2) v2.n.h(m0Var2, w2.f1.f18273t);
                            float f10 = g0.f19530a;
                            float f11 = h2Var.f();
                            mc.e eVar2 = a1Var.f19440i;
                            if (eVar2 == null) {
                                throw new IllegalArgumentException("Touch slop detector not initialized.");
                            }
                            long jE = eVar2.e(f11, w2.i(bVar6, m0Var2.J, new m2.a(i10), true), true);
                            if ((9223372034707292159L & jE) != 9205357640488583168L) {
                                bVar6.f11267i = true;
                                m2.b bVar9 = x0Var.f19748b;
                                fj.l.c(bVar9);
                                a1Var.f(bVar9, bVar6, new m2.a(i10), jE);
                                a1Var.e(bVar6, new m2.a(i10), jE);
                                long j10 = bVar6.f11259a;
                                y0 y0Var2 = a1Var.f19434c;
                                if (y0Var2 == null) {
                                    y0Var2 = new y0();
                                    y0Var2.f19760b = Long.MAX_VALUE;
                                    a1Var.f19434c = y0Var2;
                                }
                                y0Var2.f19760b = j10;
                                a1Var.f19437f = y0Var2;
                            } else {
                                x0Var.f19750d = true;
                            }
                        }
                    }
                    if (oVar == p2.o.f12745c && x0Var.f19750d) {
                        if (!bVar6.f11267i) {
                            x0Var.f19750d = false;
                            return;
                        }
                        m2.b bVar10 = x0Var.f19748b;
                        if (bVar10 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j11 = x0Var.f19749c;
                        mc.e eVar3 = a1Var.f19440i;
                        if (eVar3 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        a1Var.b(bVar10, j11, eVar3);
                        return;
                    }
                    return;
                }
                if (w2Var instanceof w0) {
                    w0 w0Var = (w0) w2Var;
                    if (oVar != p2.o.f12745c) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size5) {
                            break;
                        }
                        if (((m2.b) arrayList.get(i15)).f11267i) {
                            z2 = false;
                            break;
                        }
                        i15++;
                    }
                    int size6 = arrayList.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size6) {
                            break;
                        }
                        if (!((m2.b) arrayList.get(i16)).f11262d) {
                            i16++;
                        } else if (!arrayList.isEmpty()) {
                            if (z2) {
                                long j12 = w2.j((m2.b) qi.l.z0(arrayList), m0Var2.J, new m2.a(i10));
                                m2.b bVar11 = w0Var.f19745b;
                                fj.l.c(bVar11);
                                long jE2 = b2.b.e(j12, w2.j(bVar11, m0Var2.J, new m2.a(i10)));
                                m2.b bVar12 = w0Var.f19745b;
                                if (bVar12 == null) {
                                    throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                }
                                a1.c(a1Var, bVar12, w0Var.f19746c, jE2, 8);
                                return;
                            }
                            return;
                        }
                    }
                    a1Var.a();
                    return;
                }
                if (!(w2Var instanceof y0)) {
                    throw new b3.e();
                }
                y0 y0Var3 = (y0) w2Var;
                if (oVar != p2.o.f12744b) {
                    return;
                }
                long j13 = y0Var3.f19760b;
                int size7 = arrayList.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i17);
                    if (p2.v.e(((m2.b) obj).f11259a, j13)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                m2.b bVar13 = (m2.b) obj;
                if (bVar13 == null) {
                    return;
                }
                boolean zB = w2.b(bVar13);
                t tVar = t.f19716a;
                if (!zB) {
                    if (bVar13.f11267i) {
                        m0Var2.B1(tVar);
                        return;
                    } else {
                        if (b2.b.d(w2.i(bVar13, m0Var2.J, new m2.a(i10), true)) == 0.0f) {
                            return;
                        }
                        a1Var.e(bVar13, new m2.a(i10), w2.i(bVar13, m0Var2.J, new m2.a(i10), false));
                        bVar13.f11267i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i18);
                    if (((m2.b) obj2).f11262d) {
                        break;
                    } else {
                        i18++;
                    }
                }
                m2.b bVar14 = (m2.b) obj2;
                if (bVar14 != null) {
                    y0Var3.f19760b = bVar14.f11259a;
                    return;
                }
                if (bVar13.f11267i || !w2.b(bVar13)) {
                    m0Var2.B1(tVar);
                } else {
                    w2.a(a1Var.d(), bVar13, m0Var2.J, new m2.a(i10), a1Var.j, a1Var.f19442l);
                    float fE = ((w2.h2) v2.n.h(m0Var2, w2.f1.f18273t)).e();
                    long jH = a1Var.d().h(mk.b.f(fE, fE));
                    q2.b bVar15 = (q2.b) a1Var.d().f12813b;
                    q2.d dVar = (q2.d) bVar15.f13183b;
                    q2.a[] aVarArr = (q2.a[]) dVar.f13192e;
                    qi.k.m0(0, aVarArr.length, null, aVarArr);
                    dVar.f13189b = 0;
                    q2.d dVar2 = (q2.d) bVar15.f13184c;
                    q2.a[] aVarArr2 = (q2.a[]) dVar2.f13192e;
                    qi.k.m0(0, aVarArr2.length, null, aVarArr2);
                    dVar2.f13189b = 0;
                    bVar15.f13182a = 0L;
                    m0Var2.B1(new w(p0.c(jH), true));
                }
                a1Var.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.util.List] */
    public void a0(p2.n nVar, p2.o oVar, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z2 = true;
        this.R = true;
        if (this.N == null) {
            v.m0 m0Var = new v.m0(this);
            q1(m0Var);
            this.N = m0Var;
        }
        if (this.L) {
            int i10 = 0;
            if (this.W == null) {
                p pVar = this.S;
                if (pVar == null) {
                    o oVar2 = o.f19661c;
                    pVar = new p();
                    pVar.f19669b = oVar2;
                    pVar.f19670c = false;
                    this.S = pVar;
                }
                this.W = pVar;
            }
            w2 w2Var = this.W;
            if (w2Var == null) {
                throw new IllegalArgumentException("currentDragState should not be null");
            }
            if (w2Var instanceof p) {
                p pVar2 = (p) w2Var;
                if (!nVar.f12734a.isEmpty() && v2.e(nVar, false)) {
                    p2.w wVar = (p2.w) qi.l.z0(nVar.f12734a);
                    o oVar3 = h0.f19544a[pVar2.f19669b.ordinal()] == 1 ? !I1() ? o.f19659a : o.f19660b : pVar2.f19669b;
                    pVar2.f19669b = oVar3;
                    if (oVar == p2.o.f12743a && oVar3 == o.f19660b) {
                        wVar.a();
                        pVar2.f19670c = true;
                    }
                    if (oVar == p2.o.f12744b) {
                        if (oVar3 == o.f19659a) {
                            A1(this, wVar, wVar.f12760a, 0L, 12);
                            return;
                        }
                        if (pVar2.f19670c) {
                            H1(wVar, wVar, 0L);
                            G1(0L, wVar);
                            long j4 = wVar.f12760a;
                            s sVar = this.T;
                            if (sVar == null) {
                                sVar = new s();
                                sVar.f19710b = Long.MAX_VALUE;
                                this.T = sVar;
                            }
                            sVar.f19710b = j4;
                            this.W = sVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = null;
            if (w2Var instanceof r) {
                r rVar = (r) w2Var;
                if (oVar == p2.o.f12743a) {
                    return;
                }
                ?? r12 = nVar.f12734a;
                int size = r12.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r12.get(i11);
                    if (p2.v.e(((p2.w) obj3).f12760a, rVar.f19697c)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                p2.w wVar2 = (p2.w) obj3;
                if (wVar2 == null) {
                    int size2 = r12.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            obj4 = null;
                            break;
                        }
                        obj4 = r12.get(i12);
                        if (((p2.w) obj4).f12763d) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    wVar2 = (p2.w) obj4;
                    if (wVar2 == null) {
                        y1();
                        return;
                    }
                    rVar.f19697c = wVar2.f12760a;
                }
                if (oVar == p2.o.f12744b) {
                    if (wVar2.b()) {
                        p2.w wVar3 = rVar.f19696b;
                        if (wVar3 == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                        }
                        long j10 = rVar.f19697c;
                        mc.e eVar = this.Z;
                        if (eVar == null) {
                            throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                        }
                        z1(wVar3, j10, eVar);
                    } else if (p2.v.d(wVar2)) {
                        int size3 = r12.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                break;
                            }
                            Object obj6 = r12.get(i13);
                            if (((p2.w) obj6).f12763d) {
                                obj5 = obj6;
                                break;
                            }
                            i13++;
                        }
                        p2.w wVar4 = (p2.w) obj5;
                        if (wVar4 == null) {
                            y1();
                        } else {
                            rVar.f19697c = wVar4.f12760a;
                        }
                    } else {
                        float fI = g0.i((w2.h2) v2.n.h(this, w2.f1.f18273t), wVar2.f12768i);
                        mc.e eVar2 = this.Z;
                        if (eVar2 == null) {
                            throw new IllegalArgumentException("Touch slop detector not initialized.");
                        }
                        long jE = eVar2.e(fI, p2.v.h(wVar2, true), true);
                        if ((9223372034707292159L & jE) != 9205357640488583168L) {
                            boolean zX = x(wVar2);
                            v.l0 l0VarO = v.n.o(this);
                            boolean z10 = l0VarO != null && l0VarO.x(wVar2);
                            if (zX || !z10) {
                                wVar2.a();
                                p2.w wVar5 = rVar.f19696b;
                                fj.l.c(wVar5);
                                H1(wVar5, wVar2, jE);
                                G1(jE, wVar2);
                                long j11 = wVar2.f12760a;
                                s sVar2 = this.T;
                                if (sVar2 == null) {
                                    sVar2 = new s();
                                    sVar2.f19710b = Long.MAX_VALUE;
                                    this.T = sVar2;
                                }
                                sVar2.f19710b = j11;
                                this.W = sVar2;
                            } else {
                                rVar.f19698d = true;
                            }
                        } else {
                            rVar.f19698d = true;
                        }
                    }
                }
                if (oVar == p2.o.f12745c && rVar.f19698d) {
                    if (!wVar2.b()) {
                        rVar.f19698d = false;
                        return;
                    }
                    p2.w wVar6 = rVar.f19696b;
                    if (wVar6 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                    }
                    long j12 = rVar.f19697c;
                    mc.e eVar3 = this.Z;
                    if (eVar3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                    z1(wVar6, j12, eVar3);
                    return;
                }
                return;
            }
            if (w2Var instanceof q) {
                q qVar = (q) w2Var;
                if (oVar != p2.o.f12745c) {
                    return;
                }
                ?? r13 = nVar.f12734a;
                int size4 = r13.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        break;
                    }
                    if (((p2.w) r13.get(i14)).b()) {
                        z2 = false;
                        break;
                    }
                    i14++;
                }
                int size5 = r13.size();
                while (true) {
                    if (i10 >= size5) {
                        break;
                    }
                    if (!((p2.w) r13.get(i10)).f12763d) {
                        i10++;
                    } else if (!r13.isEmpty()) {
                        if (z2) {
                            long j13 = ((p2.w) qi.l.z0(r13)).f12762c;
                            p2.w wVar7 = qVar.f19679b;
                            fj.l.c(wVar7);
                            long jE2 = b2.b.e(j13, wVar7.f12762c);
                            p2.w wVar8 = qVar.f19679b;
                            if (wVar8 == null) {
                                throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                            }
                            A1(this, wVar8, qVar.f19680c, jE2, 8);
                            return;
                        }
                        return;
                    }
                }
                y1();
                return;
            }
            if (!(w2Var instanceof s)) {
                throw new b3.e();
            }
            s sVar3 = (s) w2Var;
            if (oVar != p2.o.f12744b) {
                return;
            }
            long j14 = sVar3.f19710b;
            ?? r2 = nVar.f12734a;
            int size6 = r2.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size6) {
                    obj = null;
                    break;
                }
                obj = r2.get(i15);
                if (p2.v.e(((p2.w) obj).f12760a, j14)) {
                    break;
                } else {
                    i15++;
                }
            }
            p2.w wVar9 = (p2.w) obj;
            if (wVar9 == null) {
                return;
            }
            boolean zD = p2.v.d(wVar9);
            Object obj7 = t.f19716a;
            if (!zD) {
                if (wVar9.b()) {
                    E1().h(obj7);
                    return;
                } else {
                    if (b2.b.d(p2.v.h(wVar9, true)) == 0.0f) {
                        return;
                    }
                    G1(p2.v.h(wVar9, false), wVar9);
                    wVar9.a();
                    return;
                }
            }
            ?? r14 = nVar.f12734a;
            int size7 = r14.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size7) {
                    obj2 = null;
                    break;
                }
                obj2 = r14.get(i16);
                if (((p2.w) obj2).f12763d) {
                    break;
                } else {
                    i16++;
                }
            }
            p2.w wVar10 = (p2.w) obj2;
            if (wVar10 != null) {
                sVar3.f19710b = wVar10.f12760a;
                return;
            }
            if (wVar9.b() || !p2.v.d(wVar9)) {
                E1().h(obj7);
            } else {
                yd.f.e(F1(), wVar9, 0L);
                float fE = ((w2.h2) v2.n.h(this, w2.f1.f18273t)).e();
                long jH = F1().h(mk.b.f(fE, fE));
                q2.b bVar = (q2.b) F1().f12813b;
                q2.d dVar = (q2.d) bVar.f13183b;
                q2.a[] aVarArr = (q2.a[]) dVar.f13192e;
                qi.k.m0(0, aVarArr.length, null, aVarArr);
                dVar.f13189b = 0;
                q2.d dVar2 = (q2.d) bVar.f13184c;
                q2.a[] aVarArr2 = (q2.a[]) dVar2.f13192e;
                qi.k.m0(0, aVarArr2.length, null, aVarArr2);
                dVar2.f13189b = 0;
                bVar.f13182a = 0L;
                E1().h(new w(p0.c(jH), false));
                this.R = false;
            }
            y1();
        }
    }

    @Override // v1.n
    public final void j1() {
        this.Q = false;
        w1();
        this.f19628b0 = 0L;
        v.m0 m0Var = this.N;
        if (m0Var != null) {
            r1(m0Var);
        }
        this.N = null;
    }

    public final void w1() {
        z.b bVar = this.P;
        if (bVar != null) {
            z.k kVar = this.M;
            if (kVar != null) {
                kVar.b(new z.a(bVar));
            }
            this.P = null;
        }
    }

    @Override // v.l0
    public final boolean x(p2.w wVar) {
        if (p2.v.b(wVar)) {
            return this.L;
        }
        if (!p2.v.d(wVar)) {
            if (this.Z == null) {
                this.Z = new mc.e(this.J);
            }
            float f10 = ((w2.h2) v2.n.h(this, w2.f1.f18273t)).f();
            long jH = p2.v.h(wVar, false);
            mc.e eVar = this.Z;
            if (eVar == null) {
                throw new IllegalArgumentException("Touch slop detector not initialized.");
            }
            if (!b2.b.c(eVar.e(f10, jH, false), 9205357640488583168L)) {
                long jF = b2.b.f(eVar.f11545b, jH);
                double dAtan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jF & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jF >> 32))))) * 180) / 3.141592653589793d;
                o1 o1Var = (o1) eVar.f11546c;
                int i10 = o1Var == null ? -1 : x2.f19755a[o1Var.ordinal()];
                if (i10 == 1 ? dAtan2 < 30.0d : !(i10 != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Object x1(l0 l0Var, l0 l0Var2);

    public final void y1() {
        p pVar = this.S;
        if (pVar == null) {
            o oVar = o.f19661c;
            pVar = new p();
            pVar.f19669b = oVar;
            pVar.f19670c = false;
            this.S = pVar;
        }
        pVar.f19669b = o.f19661c;
        pVar.f19670c = false;
        this.W = pVar;
    }

    @Override // m2.c
    public final void z0() {
        a1 a1Var = this.f19627a0;
        if (a1Var != null) {
            a1Var.a();
            m0 m0Var = a1Var.f19432a;
            if (m0Var.Q) {
                m0Var.B1(t.f19716a);
            }
            a1Var.f19438g = null;
            k4.d dVar = a1Var.f19441k;
            dVar.f9420a = 0;
            ((q.x) dVar.f9421b).f13145b = 0;
        }
    }

    public final void z1(p2.w wVar, long j, mc.e eVar) {
        q qVar = this.V;
        if (qVar == null) {
            qVar = new q();
            qVar.f19679b = null;
            qVar.f19680c = Long.MAX_VALUE;
            this.V = qVar;
        }
        qVar.f19679b = wVar;
        qVar.f19680c = j;
        eVar.f11545b = 0L;
        this.W = qVar;
    }
}
