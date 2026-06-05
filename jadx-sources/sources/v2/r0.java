package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 extends t2.f1 implements t2.p0, a, y0 {
    public boolean D;
    public boolean E;
    public boolean F;
    public s3.a G;
    public ej.c I;
    public boolean N;
    public Object Q;
    public boolean U;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f17748f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17749z;
    public int A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public int B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public d0 C = d0.f17604c;
    public long H = 0;
    public p0 J = p0.f17741c;
    public final g0 K = new g0(this, 1);
    public final g1.e L = new g1.e(new r0[16]);
    public boolean M = true;
    public final q0 O = new q0(this, 0);
    public boolean P = true;
    public long R = s3.b.b(0, 0, 0, 0, 15);
    public final q0 S = new q0(this, 2);
    public final q0 T = new q0(this, 1);

    public r0(j0 j0Var) {
        this.f17748f = j0Var;
        this.Q = j0Var.f17703p.K;
    }

    @Override // v2.a
    public final s A() {
        return this.f17748f.f17689a.Y.f17583c;
    }

    @Override // v2.a
    public final a D() {
        j0 j0Var;
        f0 f0VarU = this.f17748f.f17689a.u();
        if (f0VarU == null || (j0Var = f0VarU.Z) == null) {
            return null;
        }
        return j0Var.f17704q;
    }

    @Override // t2.f1
    public final void G0(long j, float f10, ej.c cVar) {
        b1(j, cVar);
    }

    @Override // t2.p0
    public final int O(int i10) {
        X0();
        o0 o0VarU1 = this.f17748f.a().u1();
        fj.l.c(o0VarU1);
        return o0VarU1.O(i10);
    }

    public final boolean O0() {
        j0 j0Var = this.f17748f;
        return n.s(j0Var.f17689a) || j0Var.f17691c;
    }

    public final void P0(boolean z2) {
        if (z2 && O0()) {
            return;
        }
        if (z2 || O0()) {
            this.J = p0.f17741c;
            g1.e eVarY = this.f17748f.f17689a.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                r0 r0Var = ((f0) objArr[i11]).Z.f17704q;
                fj.l.c(r0Var);
                r0Var.P0(true);
            }
        }
    }

    @Override // v2.a
    public final int Q() {
        return this.B;
    }

    public final void R0() {
        p0 p0Var = this.J;
        j0 j0Var = this.f17748f;
        boolean z2 = j0Var.f17691c;
        f0 f0Var = j0Var.f17689a;
        if (z2) {
            this.J = p0.f17740b;
        } else {
            this.J = p0.f17739a;
        }
        if (p0Var != p0.f17739a && j0Var.f17693e) {
            f0.T(f0Var, true, 6);
        }
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            r0 r0Var = f0Var2.Z.f17704q;
            if (r0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (r0Var.B != Integer.MAX_VALUE) {
                r0Var.R0();
                f0.W(f0Var2);
            }
        }
    }

    public final void U0() {
        j0 j0Var = this.f17748f;
        if (j0Var.f17702o > 0) {
            g1.e eVarY = j0Var.f17689a.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var = (f0) objArr[i11];
                j0 j0Var2 = f0Var.Z;
                if ((j0Var2.f17700m || j0Var2.f17701n) && !j0Var2.f17694f) {
                    f0Var.S(false);
                }
                r0 r0Var = j0Var2.f17704q;
                if (r0Var != null) {
                    r0Var.U0();
                }
            }
        }
    }

    @Override // t2.p0
    public final int V(int i10) {
        X0();
        o0 o0VarU1 = this.f17748f.a().u1();
        fj.l.c(o0VarU1);
        return o0VarU1.V(i10);
    }

    public final void X0() {
        j0 j0Var = this.f17748f;
        f0.T(j0Var.f17689a, false, 7);
        f0 f0Var = j0Var.f17689a;
        f0 f0VarU = f0Var.u();
        if (f0VarU == null || f0Var.V != d0.f17604c) {
            return;
        }
        int iOrdinal = f0VarU.Z.f17692d.ordinal();
        f0Var.V = iOrdinal != 0 ? iOrdinal != 2 ? f0VarU.V : d0.f17603b : d0.f17602a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // t2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t2.f1 Y(long r6) {
        /*
            r5 = this;
            v2.j0 r0 = r5.f17748f
            v2.f0 r1 = r0.f17689a
            v2.f0 r1 = r1.u()
            r2 = 0
            if (r1 == 0) goto L10
            v2.j0 r1 = r1.Z
            v2.b0 r1 = r1.f17692d
            goto L11
        L10:
            r1 = r2
        L11:
            v2.b0 r3 = v2.b0.f17576b
            if (r1 == r3) goto L25
            v2.f0 r1 = r0.f17689a
            v2.f0 r1 = r1.u()
            if (r1 == 0) goto L21
            v2.j0 r1 = r1.Z
            v2.b0 r2 = r1.f17692d
        L21:
            v2.b0 r1 = v2.b0.f17578d
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f17690b = r1
        L28:
            v2.f0 r1 = r0.f17689a
            v2.f0 r2 = r1.u()
            if (r2 == 0) goto L72
            v2.j0 r2 = r2.Z
            v2.d0 r3 = r5.C
            v2.d0 r4 = v2.d0.f17604c
            if (r3 == r4) goto L42
            boolean r1 = r1.X
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            s2.a.b(r1)
        L42:
            v2.b0 r1 = r2.f17692d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            v2.b0 r0 = r2.f17692d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            v2.d0 r1 = v2.d0.f17603b
            goto L6f
        L6d:
            v2.d0 r1 = v2.d0.f17602a
        L6f:
            r5.C = r1
            goto L76
        L72:
            v2.d0 r1 = v2.d0.f17604c
            r5.C = r1
        L76:
            v2.f0 r0 = r0.f17689a
            v2.d0 r1 = r0.V
            v2.d0 r2 = v2.d0.f17604c
            if (r1 != r2) goto L81
            r0.e()
        L81:
            r5.d1(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.r0.Y(long):t2.f1");
    }

    public final void Z0() {
        b0 b0Var;
        this.U = true;
        j0 j0Var = this.f17748f;
        f0 f0VarU = j0Var.f17689a.u();
        p0 p0Var = this.J;
        if ((p0Var != p0.f17739a && !j0Var.f17691c) || (p0Var != p0.f17740b && j0Var.f17691c)) {
            R0();
            if (this.f17749z && f0VarU != null) {
                f0VarU.S(false);
            }
        }
        if (f0VarU != null) {
            j0 j0Var2 = f0VarU.Z;
            if (!this.f17749z && ((b0Var = j0Var2.f17692d) == b0.f17577c || b0Var == b0.f17578d)) {
                if (this.B != Integer.MAX_VALUE) {
                    s2.a.b("Place was called on a node which was placed already");
                }
                int i10 = j0Var2.f17696h;
                this.B = i10;
                j0Var2.f17696h = i10 + 1;
            }
        } else {
            this.B = 0;
        }
        j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b1(long r10, ej.c r12) {
        /*
            r9 = this;
            v2.j0 r0 = r9.f17748f
            v2.f0 r1 = r0.f17689a
            v2.f0 r2 = r0.f17689a
            r3 = 0
            v2.f0 r4 = r1.u()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            v2.j0 r4 = r4.Z     // Catch: java.lang.Throwable -> L1b
            v2.b0 r4 = r4.f17692d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            v2.b0 r5 = v2.b0.f17578d     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1d
            r0.f17691c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r10 = move-exception
            goto L8b
        L1d:
            boolean r4 = r2.f17637j0     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L26
            java.lang.String r4 = "place is called on a deactivated node"
            s2.a.a(r4)     // Catch: java.lang.Throwable -> L1b
        L26:
            r0.f17692d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.E = r4     // Catch: java.lang.Throwable -> L1b
            r9.U = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.H     // Catch: java.lang.Throwable -> L1b
            boolean r5 = s3.j.a(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L42
            boolean r5 = r0.f17701n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3d
            boolean r5 = r0.f17700m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L3f
        L3d:
            r0.f17694f = r4     // Catch: java.lang.Throwable -> L1b
        L3f:
            r9.U0()     // Catch: java.lang.Throwable -> L1b
        L42:
            v2.r1 r5 = v2.i0.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.H = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f17694f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6e
            v2.p0 r7 = r9.J     // Catch: java.lang.Throwable -> L1b
            v2.p0 r8 = v2.p0.f17741c     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == 0) goto L6e
            v2.i1 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            v2.o0 r2 = r2.u1()     // Catch: java.lang.Throwable -> L1b
            fj.l.c(r2)     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f15554e     // Catch: java.lang.Throwable -> L1b
            long r10 = s3.j.c(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.n1(r10)     // Catch: java.lang.Throwable -> L1b
            r9.Z0()     // Catch: java.lang.Throwable -> L1b
            goto L84
        L6e:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            v2.g0 r10 = r9.K     // Catch: java.lang.Throwable -> L1b
            r10.f17658g = r6     // Catch: java.lang.Throwable -> L1b
            w2.t r5 = (w2.t) r5     // Catch: java.lang.Throwable -> L1b
            v2.t1 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            v2.q0 r11 = r9.T     // Catch: java.lang.Throwable -> L1b
            v2.d r4 = r10.f17776g     // Catch: java.lang.Throwable -> L1b
            t1.v r10 = r10.f17770a     // Catch: java.lang.Throwable -> L1b
            r10.c(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L84:
            r9.I = r12     // Catch: java.lang.Throwable -> L1b
            v2.b0 r10 = v2.b0.f17579e     // Catch: java.lang.Throwable -> L1b
            r0.f17692d = r10     // Catch: java.lang.Throwable -> L1b
            return
        L8b:
            r1.Y(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.r0.b1(long, ej.c):void");
    }

    @Override // t2.f1, t2.p0
    public final Object c0() {
        return this.Q;
    }

    public final boolean d1(long j) {
        long j4;
        j0 j0Var = this.f17748f;
        f0 f0Var = j0Var.f17689a;
        f0 f0Var2 = j0Var.f17689a;
        try {
            if (f0Var.f17637j0) {
                s2.a.a("measure is called on a deactivated node");
            }
            f0 f0VarU = f0Var2.u();
            f0Var2.X = f0Var2.X || (f0VarU != null && f0VarU.X);
            if (!f0Var2.Z.f17693e) {
                s3.a aVar = this.G;
                if (aVar == null ? false : s3.a.b(aVar.f14736a, j)) {
                    r1 r1Var = f0Var2.G;
                    if (r1Var != null) {
                        ((w2.t) r1Var).m(f0Var2, true);
                    }
                    f0Var2.X();
                    return false;
                }
            }
            this.G = new s3.a(j);
            N0(j);
            this.K.f17657f = false;
            g1.e eVarY = f0Var2.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                r0 r0Var = ((f0) objArr[i11]).Z.f17704q;
                fj.l.c(r0Var);
                r0Var.K.f17654c = false;
            }
            if (this.F) {
                j4 = this.f15552c;
            } else {
                long j10 = Integer.MIN_VALUE;
                j4 = (j10 & 4294967295L) | (j10 << 32);
            }
            this.F = true;
            o0 o0VarU1 = j0Var.a().u1();
            if (!(o0VarU1 != null)) {
                s2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            j0Var.c(j);
            M0((o0VarU1.f15551b & 4294967295L) | (o0VarU1.f15550a << 32));
            return (((int) (j4 >> 32)) == o0VarU1.f15550a && ((int) (j4 & 4294967295L)) == o0VarU1.f15551b) ? false : true;
        } catch (Throwable th2) {
            f0Var.Y(th2);
            throw null;
        }
    }

    @Override // v2.a
    public final g0 f() {
        return this.K;
    }

    @Override // v2.y0
    public final void g0(boolean z2) {
        o0 o0VarU1;
        j0 j0Var = this.f17748f;
        o0 o0VarU12 = j0Var.a().u1();
        if (Boolean.valueOf(z2).equals(o0VarU12 != null ? Boolean.valueOf(o0VarU12.B) : null) || (o0VarU1 = j0Var.a().u1()) == null) {
            return;
        }
        o0VarU1.B = z2;
    }

    @Override // v2.a
    public final void j0() {
        this.N = true;
        g0 g0Var = this.K;
        g0Var.h();
        j0 j0Var = this.f17748f;
        boolean z2 = j0Var.f17694f;
        f0 f0Var = j0Var.f17689a;
        if (z2) {
            g1.e eVarY = f0Var.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var2 = (f0) objArr[i11];
                j0 j0Var2 = f0Var2.Z;
                if (j0Var2.f17693e && f0Var2.s() == d0.f17602a) {
                    r0 r0Var = j0Var2.f17704q;
                    fj.l.c(r0Var);
                    r0 r0Var2 = j0Var2.f17704q;
                    s3.a aVar = r0Var2 != null ? r0Var2.G : null;
                    fj.l.c(aVar);
                    if (r0Var.d1(aVar.f14736a)) {
                        f0.T(f0Var, false, 7);
                    }
                }
            }
        }
        r rVar = A().f17752l0;
        fj.l.c(rVar);
        if (j0Var.f17695g || (!this.D && !rVar.D && j0Var.f17694f)) {
            j0Var.f17694f = false;
            b0 b0Var = j0Var.f17692d;
            j0Var.f17692d = b0.f17578d;
            j0Var.i(false);
            t1 snapshotObserver = ((w2.t) i0.a(f0Var)).getSnapshotObserver();
            snapshotObserver.f17770a.c(f0Var, snapshotObserver.f17777h, this.O);
            j0Var.f17692d = b0Var;
            if (j0Var.f17700m && rVar.D) {
                requestLayout();
            }
            j0Var.f17695g = false;
        }
        if (g0Var.f17655d) {
            g0Var.f17656e = true;
        }
        if (g0Var.f17653b && g0Var.e()) {
            g0Var.g();
        }
        this.N = false;
    }

    @Override // t2.p0
    public final int l(int i10) {
        X0();
        o0 o0VarU1 = this.f17748f.a().u1();
        fj.l.c(o0VarU1);
        return o0VarU1.l(i10);
    }

    @Override // v2.a
    public final void r(c2.x0 x0Var) {
        g1.e eVarY = this.f17748f.f17689a.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            r0 r0Var = ((f0) objArr[i11]).Z.f17704q;
            fj.l.c(r0Var);
            x0Var.invoke(r0Var);
        }
    }

    @Override // v2.a
    public final void requestLayout() {
        this.f17748f.f17689a.S(false);
    }

    @Override // v2.a
    public final void u0() {
        f0.T(this.f17748f.f17689a, false, 7);
    }

    @Override // t2.p0
    public final int v0(int i10) {
        X0();
        o0 o0VarU1 = this.f17748f.a().u1();
        fj.l.c(o0VarU1);
        return o0VarU1.v0(i10);
    }

    @Override // t2.f1
    public final int x0(t2.a aVar) {
        j0 j0Var = this.f17748f;
        f0 f0VarU = j0Var.f17689a.u();
        b0 b0Var = f0VarU != null ? f0VarU.Z.f17692d : null;
        b0 b0Var2 = b0.f17576b;
        g0 g0Var = this.K;
        if (b0Var == b0Var2) {
            g0Var.f17654c = true;
        } else {
            f0 f0VarU2 = j0Var.f17689a.u();
            if ((f0VarU2 != null ? f0VarU2.Z.f17692d : null) == b0.f17578d) {
                g0Var.f17655d = true;
            }
        }
        this.D = true;
        o0 o0VarU1 = j0Var.a().u1();
        fj.l.c(o0VarU1);
        int iX0 = o0VarU1.x0(aVar);
        this.D = false;
        return iX0;
    }
}
