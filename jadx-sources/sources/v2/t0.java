package v2;

import android.os.Trace;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f17761a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17763c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17764d;

    /* renamed from: i, reason: collision with root package name */
    public s3.a f17769i;

    /* renamed from: b, reason: collision with root package name */
    public final p1.l f17762b = new p1.l(13);

    /* renamed from: e, reason: collision with root package name */
    public final q5.b f17765e = new q5.b(13);

    /* renamed from: f, reason: collision with root package name */
    public final g1.e f17766f = new g1.e(new f0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f17767g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final g1.e f17768h = new g1.e(new s0[16]);

    public t0(f0 f0Var) {
        this.f17761a = f0Var;
    }

    public static final boolean a(t0 t0Var, f0 f0Var, boolean z2) {
        s3.a aVar;
        t2.e1 placementScope;
        s sVar;
        f0 f0VarU;
        f0 f0Var2 = t0Var.f17761a;
        boolean z10 = f0Var.f17637j0;
        j0 j0Var = f0Var.Z;
        if (!z10 && k(f0Var)) {
            if (f0Var == f0Var2) {
                aVar = t0Var.f17769i;
                fj.l.c(aVar);
            } else {
                aVar = null;
            }
            if (z2) {
                zC = j0Var.f17693e ? c(f0Var, aVar) : false;
                if ((zC || j0Var.f17694f) && fj.l.b(f0Var.I(), Boolean.TRUE)) {
                    f0Var.J();
                }
            } else {
                boolean zD = f0Var.q() ? d(f0Var, aVar) : false;
                if (f0Var.p() && (f0Var == f0Var2 || ((f0VarU = f0Var.u()) != null && f0VarU.H() && j0Var.f17703p.M))) {
                    if (f0Var == f0Var2) {
                        if (f0Var.V == d0.f17604c) {
                            f0Var.f();
                        }
                        f0 f0VarU2 = f0Var.u();
                        if (f0VarU2 == null || (sVar = f0VarU2.Y.f17583c) == null || (placementScope = sVar.E) == null) {
                            placementScope = ((w2.t) i0.a(f0Var)).getPlacementScope();
                        }
                        t2.e1.D(placementScope, j0Var.f17703p, 0, 0);
                    } else {
                        f0Var.R();
                    }
                    q5.b bVar = t0Var.f17765e;
                    bVar.getClass();
                    if (f0Var.f17636i0 > 0) {
                        ((g1.e) bVar.f13235b).b(f0Var);
                        f0Var.f17635h0 = true;
                    }
                }
                zC = zD;
            }
            t0Var.e();
        }
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(v2.f0 r5, s3.a r6) {
        /*
            v2.f0 r0 = r5.A
            v2.j0 r1 = r5.Z
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            v2.r0 r0 = r1.f17704q
            fj.l.c(r0)
            long r3 = r6.f14736a
            boolean r6 = r0.d1(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            v2.r0 r6 = r1.f17704q
            if (r6 == 0) goto L21
            s3.a r1 = r6.G
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            fj.l.c(r6)
            long r0 = r1.f14736a
            boolean r6 = r6.d1(r0)
        L2f:
            v2.f0 r0 = r5.u()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            v2.f0 r1 = r0.A
            r3 = 3
            if (r1 != 0) goto L40
            v2.f0.V(r0, r2, r3)
            return r6
        L40:
            v2.d0 r1 = r5.s()
            v2.d0 r4 = v2.d0.f17602a
            if (r1 != r4) goto L4c
            v2.f0.T(r0, r2, r3)
            return r6
        L4c:
            v2.d0 r5 = r5.s()
            v2.d0 r1 = v2.d0.f17603b
            if (r5 != r1) goto L57
            r0.S(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.t0.c(v2.f0, s3.a):boolean");
    }

    public static boolean d(f0 f0Var, s3.a aVar) {
        boolean zB1;
        if (aVar != null) {
            if (f0Var.V == d0.f17604c) {
                f0Var.e();
            }
            zB1 = f0Var.Z.f17703p.b1(aVar.f14736a);
        } else {
            v0 v0Var = f0Var.Z.f17703p;
            s3.a aVar2 = v0Var.C ? new s3.a(v0Var.f15553d) : null;
            if (aVar2 != null) {
                if (f0Var.V == d0.f17604c) {
                    f0Var.e();
                }
                zB1 = f0Var.Z.f17703p.b1(aVar2.f14736a);
            } else {
                f0Var.getClass();
                zB1 = false;
            }
        }
        f0 f0VarU = f0Var.u();
        if (zB1 && f0VarU != null) {
            if (f0Var.r() == d0.f17602a) {
                f0.V(f0VarU, false, 3);
                return zB1;
            }
            if (f0Var.r() == d0.f17603b) {
                f0VarU.U(false);
            }
        }
        return zB1;
    }

    public static boolean i(f0 f0Var) {
        r0 r0Var;
        g0 g0Var;
        if (f0Var.Z.f17693e) {
            return (f0Var.s() == d0.f17604c && ((r0Var = f0Var.Z.f17704q) == null || (g0Var = r0Var.K) == null || !g0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(f0 f0Var) {
        if (!f0Var.q()) {
            return false;
        }
        do {
            if (f0Var.r() == d0.f17604c && !f0Var.Z.f17703p.Q.e()) {
                f0 f0VarU = f0Var.u();
                if ((f0VarU != null ? f0VarU.Z.f17692d : null) != b0.f17575a) {
                    return false;
                }
            }
            f0Var = f0Var.u();
            if (f0Var == null) {
                return false;
            }
        } while (!f0Var.H());
        return true;
    }

    public static boolean k(f0 f0Var) {
        r0 r0Var;
        g0 g0Var;
        j0 j0Var = f0Var.Z;
        return f0Var.H() || j0Var.f17703p.M || j(f0Var) || fj.l.b(f0Var.I(), Boolean.TRUE) || i(f0Var) || j0Var.f17703p.Q.e() || !((r0Var = j0Var.f17704q) == null || (g0Var = r0Var.K) == null || !g0Var.e());
    }

    public final void b(boolean z2) {
        q5.b bVar = this.f17765e;
        if (z2) {
            g1.e eVar = (g1.e) bVar.f13235b;
            f0 f0Var = this.f17761a;
            if (f0Var.f17636i0 > 0) {
                eVar.h();
                eVar.b(f0Var);
                f0Var.f17635h0 = true;
            }
        }
        if (((g1.e) bVar.f13235b).f7026c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                bVar.i();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        g1.e eVar = this.f17768h;
        int i10 = eVar.f7026c;
        if (i10 != 0) {
            Object[] objArr = eVar.f7024a;
            for (int i11 = 0; i11 < i10; i11++) {
                s0 s0Var = (s0) objArr[i11];
                f0 f0Var = s0Var.f17753a;
                boolean z2 = s0Var.f17755c;
                f0 f0Var2 = s0Var.f17753a;
                if (f0Var.G()) {
                    if (s0Var.f17754b) {
                        f0.T(f0Var2, z2, 2);
                    } else {
                        f0.V(f0Var2, z2, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void f(f0 f0Var) {
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (fj.l.b(f0Var2.I(), Boolean.TRUE) && !f0Var2.f17637j0) {
                if (this.f17762b.k(f0Var2)) {
                    f0Var2.J();
                }
                f(f0Var2);
            }
        }
    }

    public final void g(f0 f0Var, boolean z2) {
        if (!this.f17763c) {
            s2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z2 ? f0Var.Z.f17693e : f0Var.q()) {
            s2.a.a("node not yet measured");
        }
        h(f0Var, z2);
    }

    public final void h(f0 f0Var, boolean z2) {
        r0 r0Var;
        g0 g0Var;
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if ((!z2 && (f0Var2.r() == d0.f17602a || f0Var2.Z.f17703p.Q.e())) || (z2 && (f0Var2.s() == d0.f17602a || ((r0Var = f0Var2.Z.f17704q) != null && (g0Var = r0Var.K) != null && g0Var.e())))) {
                boolean zS = n.s(f0Var2);
                j0 j0Var = f0Var2.Z;
                if (zS && !z2) {
                    if (j0Var.f17693e && this.f17762b.k(f0Var2)) {
                        o(f0Var2, true);
                    } else {
                        g(f0Var2, true);
                    }
                }
                if (z2 ? j0Var.f17693e : f0Var2.q()) {
                    o(f0Var2, z2);
                }
                if (!(z2 ? j0Var.f17693e : f0Var2.q())) {
                    h(f0Var2, z2);
                }
            }
        }
        if (z2 ? f0Var.Z.f17693e : f0Var.q()) {
            o(f0Var, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [v1.n] */
    public final boolean l(w2.n nVar) {
        boolean z2;
        v1.n nVar2;
        g1.e eVar;
        v1.n nVarE;
        int i10;
        boolean z10;
        f0 f0Var;
        boolean z11;
        boolean zO;
        p1.l lVar = this.f17762b;
        f0 f0Var2 = this.f17761a;
        if (!f0Var2.G()) {
            s2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.H()) {
            s2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f17763c) {
            s2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (this.f17769i != null) {
            this.f17763c = true;
            this.f17764d = true;
            try {
                boolean z16 = lVar.z();
                p7.k kVar = (p7.k) lVar.f12660b;
                if (z16) {
                    z2 = false;
                    while (true) {
                        p7.k kVar2 = (p7.k) lVar.f12662d;
                        p7.k kVar3 = (p7.k) lVar.f12661c;
                        if (!((a2) kVar.f12813b).isEmpty()) {
                            f0Var = (f0) ((a2) kVar.f12813b).first();
                            kVar.k(f0Var);
                            z11 = f0Var.A != null;
                            z10 = false;
                        } else if (!((a2) kVar3.f12813b).isEmpty()) {
                            f0Var = (f0) ((a2) kVar3.f12813b).first();
                            kVar3.k(f0Var);
                            z11 = f0Var.A != null;
                            z10 = true;
                        } else {
                            if (((a2) kVar2.f12813b).isEmpty()) {
                                break;
                            }
                            f0 f0Var3 = (f0) ((a2) kVar2.f12813b).first();
                            kVar2.k(f0Var3);
                            z10 = true;
                            f0Var = f0Var3;
                            z11 = false;
                        }
                        if (z10) {
                            zO = a(this, f0Var, z11);
                        } else {
                            zO = o(f0Var, z11);
                            if (f0Var.Z.f17694f) {
                                lVar.b(f0Var, t.f17757b);
                            }
                            if (f0Var.p()) {
                                lVar.b(f0Var, t.f17759d);
                            }
                        }
                        if (f0Var == f0Var2 && zO) {
                            z2 = true;
                        }
                    }
                    if (nVar != null) {
                        nVar.a();
                    }
                } else {
                    z2 = false;
                }
            } finally {
            }
        } else {
            z2 = false;
        }
        g1.e eVar2 = this.f17766f;
        Object[] objArr = eVar2.f7024a;
        int i12 = eVar2.f7026c;
        int i13 = 0;
        while (i13 < i12) {
            b1 b1Var = ((f0) objArr[i13]).Y;
            s sVar = b1Var.f17583c;
            int i14 = 4194304;
            boolean zG = j1.g(4194304);
            if (zG) {
                nVar2 = sVar.f17751k0;
            } else {
                nVar2 = sVar.f17751k0.f17569e;
                if (nVar2 == null) {
                }
                i13++;
                i11 = 0;
            }
            c2.t0 t0Var = i1.f17679f0;
            v1.n nVarY1 = sVar.y1(zG);
            while (nVarY1 != null && (nVarY1.f17568d & i14) != 0) {
                if ((nVarY1.f17567c & i14) != 0) {
                    k kVar4 = nVarY1;
                    g1.e eVar3 = null;
                    while (kVar4 != 0) {
                        if (kVar4 instanceof v) {
                            ((v) kVar4).o0(b1Var.f17583c);
                        } else {
                            if ((kVar4.f17567c & i14) != 0 && (kVar4 instanceof k)) {
                                v1.n nVar3 = kVar4.I;
                                nVarE = kVar4;
                                eVar = eVar3;
                                while (nVar3 != null) {
                                    int i15 = i14;
                                    if ((nVar3.f17567c & i15) != 0) {
                                        i11++;
                                        eVar = eVar;
                                        if (i11 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f17570f;
                                    i14 = i15;
                                    nVarE = nVarE;
                                    eVar = eVar;
                                }
                                i10 = i14;
                                eVar = eVar;
                                if (i11 == 1) {
                                }
                                i14 = i10;
                                i11 = 0;
                                kVar4 = nVarE;
                                eVar3 = eVar;
                            }
                            nVarE = n.e(eVar);
                            i14 = i10;
                            i11 = 0;
                            kVar4 = nVarE;
                            eVar3 = eVar;
                        }
                        i10 = i14;
                        eVar = eVar3;
                        nVarE = n.e(eVar);
                        i14 = i10;
                        i11 = 0;
                        kVar4 = nVarE;
                        eVar3 = eVar;
                    }
                }
                int i16 = i14;
                if (nVarY1 != nVar2) {
                    nVarY1 = nVarY1.f17570f;
                    i14 = i16;
                    i11 = 0;
                }
            }
            i13++;
            i11 = 0;
        }
        eVar2.h();
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, v2.f0] */
    public final void m(f0 f0Var, long j) {
        v1.n nVar;
        v1.n nVarE;
        boolean z2 = f0Var.f17637j0;
        j0 j0Var = f0Var.Z;
        if (z2) {
            return;
        }
        f0 f0Var2 = this.f17761a;
        if (f0Var.equals(f0Var2)) {
            s2.a.a("measureAndLayout called on root");
        }
        if (!f0Var2.G()) {
            s2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.H()) {
            s2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f17763c) {
            s2.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z10 = false;
        if (this.f17769i != null) {
            this.f17763c = true;
            this.f17764d = false;
            try {
                p1.l lVar = this.f17762b;
                ((p7.k) lVar.f12660b).k(f0Var);
                ((p7.k) lVar.f12661c).k(f0Var);
                ((p7.k) lVar.f12662d).k(f0Var);
                if (c(f0Var, new s3.a(j)) || j0Var.f17694f) {
                    if (fj.l.b(f0Var.I(), Boolean.TRUE)) {
                        f0Var.J();
                    }
                }
                f(f0Var);
                if (f0Var.V == d0.f17604c) {
                    f0Var.e();
                }
                boolean zB1 = j0Var.f17703p.b1(j);
                f0 f0VarU = f0Var.u();
                if (zB1 && f0VarU != null) {
                    if (f0Var.r() == d0.f17602a) {
                        f0.V(f0VarU, false, 3);
                    } else if (f0Var.r() == d0.f17603b) {
                        f0VarU.U(false);
                    }
                }
                if (f0Var.p() && f0Var.H()) {
                    f0Var.R();
                    q5.b bVar = this.f17765e;
                    bVar.getClass();
                    if (f0Var.f17636i0 > 0) {
                        ((g1.e) bVar.f13235b).b(f0Var);
                        f0Var.f17635h0 = true;
                    }
                }
                e();
            } finally {
            }
        }
        g1.e eVar = this.f17766f;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        int i11 = 0;
        while (i11 < i10) {
            b1 b1Var = ((f0) objArr[i11]).Y;
            s sVar = b1Var.f17583c;
            boolean zG = j1.g(4194304);
            if (zG) {
                nVar = sVar.f17751k0;
            } else {
                nVar = sVar.f17751k0.f17569e;
                if (nVar == null) {
                }
                i11++;
                z10 = false;
            }
            c2.t0 t0Var = i1.f17679f0;
            v1.n nVarY1 = sVar.y1(zG);
            while (nVarY1 != null && (nVarY1.f17568d & 4194304) != 0) {
                if ((nVarY1.f17567c & 4194304) != 0) {
                    k kVar = nVarY1;
                    g1.e eVar2 = null;
                    while (kVar != 0) {
                        if (kVar instanceof v) {
                            ((v) kVar).o0(b1Var.f17583c);
                        } else {
                            if ((kVar.f17567c & 4194304) != 0 && (kVar instanceof k)) {
                                v1.n nVar2 = kVar.I;
                                ?? r15 = z10;
                                nVarE = kVar;
                                eVar2 = eVar2;
                                while (nVar2 != null) {
                                    if ((nVar2.f17567c & 4194304) != 0) {
                                        r15++;
                                        eVar2 = eVar2;
                                        if (r15 == 1) {
                                            nVarE = nVar2;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar2.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar2.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f17570f;
                                    nVarE = nVarE;
                                    eVar2 = eVar2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z10 = false;
                            kVar = nVarE;
                            eVar2 = eVar2;
                        }
                        nVarE = n.e(eVar2);
                        z10 = false;
                        kVar = nVarE;
                        eVar2 = eVar2;
                    }
                }
                if (nVarY1 != nVar) {
                    nVarY1 = nVarY1.f17570f;
                    z10 = false;
                }
            }
            i11++;
            z10 = false;
        }
        eVar.h();
    }

    public final void n() {
        p1.l lVar = this.f17762b;
        if (lVar.z()) {
            f0 f0Var = this.f17761a;
            if (!f0Var.G()) {
                s2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!f0Var.H()) {
                s2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f17763c) {
                s2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f17769i != null) {
                this.f17763c = true;
                this.f17764d = false;
                try {
                    if ((((a2) ((p7.k) lVar.f12662d).f12813b).isEmpty() || ((a2) ((p7.k) lVar.f12660b).f12813b).isEmpty()) ? false : true) {
                        if (f0Var.A != null) {
                            q(f0Var, true);
                        } else {
                            p(f0Var);
                        }
                    }
                    q(f0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f17763c = false;
                        this.f17764d = false;
                    }
                }
            }
        }
    }

    public final boolean o(f0 f0Var, boolean z2) {
        s3.a aVar;
        boolean zD = false;
        if (!f0Var.f17637j0 && k(f0Var)) {
            if (f0Var == this.f17761a) {
                aVar = this.f17769i;
                fj.l.c(aVar);
            } else {
                aVar = null;
            }
            if (z2) {
                if (f0Var.Z.f17693e) {
                    zD = c(f0Var, aVar);
                }
            } else if (f0Var.q()) {
                zD = d(f0Var, aVar);
            }
            e();
        }
        return zD;
    }

    public final void p(f0 f0Var) {
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.r() == d0.f17602a || f0Var2.Z.f17703p.Q.e()) {
                if (n.s(f0Var2)) {
                    q(f0Var2, true);
                } else {
                    p(f0Var2);
                }
            }
        }
    }

    public final void q(f0 f0Var, boolean z2) {
        s3.a aVar;
        if (f0Var.f17637j0) {
            return;
        }
        if (f0Var == this.f17761a) {
            aVar = this.f17769i;
            fj.l.c(aVar);
        } else {
            aVar = null;
        }
        if (z2) {
            c(f0Var, aVar);
        } else {
            d(f0Var, aVar);
        }
    }

    public final boolean r(f0 f0Var, boolean z2) {
        int iOrdinal = f0Var.Z.f17692d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f17768h.b(new s0(f0Var, false, z2));
            } else {
                if (iOrdinal != 4) {
                    throw new b3.e();
                }
                if (!f0Var.q() || z2) {
                    f0Var.Z.f17703p.N = true;
                    if (!f0Var.f17637j0 && (f0Var.H() || j(f0Var))) {
                        f0 f0VarU = f0Var.u();
                        if (f0VarU == null || !f0VarU.q()) {
                            this.f17762b.b(f0Var, t.f17758c);
                        }
                        if (!this.f17764d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        s3.a aVar = this.f17769i;
        if (aVar == null ? false : s3.a.b(aVar.f14736a, j)) {
            return;
        }
        if (this.f17763c) {
            s2.a.a("updateRootConstraints called while measuring");
        }
        this.f17769i = new s3.a(j);
        f0 f0Var = this.f17761a;
        f0 f0Var2 = f0Var.A;
        j0 j0Var = f0Var.Z;
        if (f0Var2 != null) {
            j0Var.f17693e = true;
        }
        j0Var.f17703p.N = true;
        this.f17762b.b(f0Var, f0Var2 != null ? t.f17756a : t.f17758c);
    }
}
