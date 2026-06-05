package v;

import android.view.KeyEvent;
import v2.e2;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g extends v2.k implements v2.w1, n2.e, v2.z1, e2, v2.i, v2.m1, m2.c, l0 {

    /* renamed from: e0, reason: collision with root package name */
    public static final b f17193e0 = new b();
    public z.k J;
    public a1 K;
    public boolean L;
    public String M;
    public d3.j N;
    public boolean O;
    public ej.a P;
    public final j0 Q;
    public a1 R;
    public p2.p0 S;
    public m0 T;
    public v2.j U;
    public z.m V;
    public z.h W;
    public final q.y X;
    public long Y;
    public z.m Z;

    /* renamed from: a0, reason: collision with root package name */
    public z.k f17194a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f17195b0;

    /* renamed from: c0, reason: collision with root package name */
    public qj.s1 f17196c0;

    /* renamed from: d0, reason: collision with root package name */
    public final b f17197d0;

    public g(z.k kVar, a1 a1Var, boolean z2, boolean z10, String str, d3.j jVar, ej.a aVar) {
        this.J = kVar;
        this.K = a1Var;
        this.L = z2;
        this.M = str;
        this.N = jVar;
        this.O = z10;
        this.P = aVar;
        this.Q = new j0(kVar, 0, new k0.h1(1, this, g.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 11));
        int i10 = q.n.f13107a;
        this.X = new q.y(6);
        this.Y = 0L;
        z.k kVar2 = this.J;
        this.f17194a0 = kVar2;
        this.f17195b0 = kVar2 == null;
        this.f17197d0 = f17193e0;
    }

    @Override // n2.e
    public final boolean A(KeyEvent keyEvent) {
        return false;
    }

    public final void A1(p2.w wVar) {
        boolean z2;
        z.k kVar = this.J;
        if (kVar != null) {
            z.m mVar = new z.m(wVar.f12762c);
            if (wVar == null) {
                z2 = n.o(this) != null;
            } else {
                fj.r rVar = new fj.r();
                v2.n.B(this, m0.I, new ab.n(new k0.t1(27, wVar, rVar), 15));
                z2 = rVar.f6803a;
            }
            ti.c cVar = null;
            if (z2 || y.a(this)) {
                this.f17196c0 = qj.b0.w(e1(), null, new d(kVar, mVar, this, cVar, 1), 3);
            } else {
                this.V = mVar;
                qj.b0.w(e1(), null, new c(kVar, mVar, cVar, 2), 3);
            }
        }
    }

    public final void B1() {
        if (this.U != null) {
            return;
        }
        a1 a1Var = this.L ? this.R : this.K;
        if (a1Var != null) {
            if (this.J == null) {
                this.J = new z.k();
            }
            this.Q.u1(this.J);
            z.k kVar = this.J;
            fj.l.c(kVar);
            v2.j jVarA = a1Var.a(kVar);
            q1(jVarA);
            this.U = jVarA;
        }
    }

    @Override // v2.e2
    public final Object D() {
        return this.f17197d0;
    }

    public abstract boolean D1(KeyEvent keyEvent);

    public abstract void E1(KeyEvent keyEvent);

    @Override // v2.m1
    public final void F0() {
        if (this.L) {
            v2.n.t(this, new a(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(z.k r4, v.a1 r5, boolean r6, boolean r7, java.lang.String r8, d3.j r9, ej.a r10) {
        /*
            r3 = this;
            z.k r0 = r3.f17194a0
            boolean r0 = fj.l.b(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.v1()
            r3.f17194a0 = r4
            r3.J = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            v.a1 r0 = r3.K
            boolean r0 = fj.l.b(r0, r5)
            if (r0 != 0) goto L1f
            r3.K = r5
            r4 = r1
        L1f:
            boolean r5 = r3.L
            if (r5 == r6) goto L2b
            r3.L = r6
            if (r6 == 0) goto L2a
            r3.F0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.O
            v.j0 r6 = r3.Q
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.q1(r6)
            goto L3d
        L37:
            r3.r1(r6)
            r3.v1()
        L3d:
            v2.n.o(r3)
            r3.O = r7
        L42:
            java.lang.String r5 = r3.M
            boolean r5 = fj.l.b(r5, r8)
            if (r5 != 0) goto L4f
            r3.M = r8
            v2.n.o(r3)
        L4f:
            d3.j r5 = r3.N
            boolean r5 = fj.l.b(r5, r9)
            if (r5 != 0) goto L5c
            r3.N = r9
            v2.n.o(r3)
        L5c:
            r3.P = r10
            boolean r5 = r3.f17195b0
            z.k r7 = r3.f17194a0
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.f17195b0 = r2
            if (r2 != 0) goto L75
            v2.j r5 = r3.U
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            v2.j r4 = r3.U
            if (r4 != 0) goto L80
            boolean r5 = r3.f17195b0
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.r1(r4)
        L85:
            r4 = 0
            r3.U = r4
            r3.B1()
        L8b:
            z.k r4 = r3.J
            r6.u1(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.F1(z.k, v.a1, boolean, boolean, java.lang.String, d3.j, ej.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    @Override // n2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.B1()
            long r0 = n2.d.b(r11)
            boolean r2 = r10.O
            r3 = 3
            r4 = 0
            q.y r5 = r10.X
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = n2.d.c(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = v.n.q(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L41
            z.m r2 = new z.m
            long r8 = r10.Y
            r2.<init>(r8)
            r5.g(r0, r2)
            z.k r0 = r10.J
            if (r0 == 0) goto L3f
            qj.z r0 = r10.e1()
            v.e r1 = new v.e
            r5 = 2
            r1.<init>(r10, r2, r4, r5)
            qj.b0.w(r0, r4, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.D1(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.O
            if (r2 == 0) goto L7a
            int r2 = n2.d.c(r11)
            if (r2 != r6) goto L7a
            boolean r2 = v.n.q(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.f(r0)
            z.m r0 = (z.m) r0
            if (r0 == 0) goto L77
            z.k r1 = r10.J
            if (r1 == 0) goto L74
            qj.z r1 = r10.e1()
            v.e r2 = new v.e
            r5 = 3
            r2.<init>(r10, r0, r4, r5)
            qj.b0.w(r1, r4, r2, r3)
        L74:
            r10.E1(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.Q(android.view.KeyEvent):boolean");
    }

    public void V() {
        z.h hVar;
        z.k kVar = this.J;
        if (kVar != null && (hVar = this.W) != null) {
            kVar.b(new z.i(hVar));
        }
        this.W = null;
        p2.p0 p0Var = this.S;
        if (p0Var != null) {
            p0Var.V();
        }
    }

    @Override // v2.z1
    public final boolean X0() {
        return true;
    }

    public void a0(p2.n nVar, p2.o oVar, long j) {
        p2.p0 p0VarU1;
        long j4 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.Y = (Float.floatToRawIntBits((int) (j4 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j4 & 4294967295L)) & 4294967295L);
        B1();
        if (this.O) {
            if (this.T == null) {
                m0 m0Var = new m0(this);
                q1(m0Var);
                this.T = m0Var;
            }
            if (oVar == p2.o.f12744b) {
                int i10 = nVar.f12739f;
                ti.c cVar = null;
                if (i10 == 4) {
                    qj.b0.w(e1(), null, new f(this, cVar, 0), 3);
                } else if (i10 == 5) {
                    qj.b0.w(e1(), null, new f(this, cVar, 1), 3);
                }
            }
        }
        if (this.S == null && (p0VarU1 = u1()) != null) {
            q1(p0VarU1);
            this.S = p0VarU1;
        }
        p2.p0 p0Var = this.S;
        if (p0Var != null) {
            p0Var.a0(nVar, oVar, j);
        }
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        F0();
        if (!this.f17195b0) {
            B1();
        }
        if (this.O) {
            q1(this.Q);
        }
    }

    @Override // v1.n
    public final void j1() {
        v1();
        if (this.f17194a0 == null) {
            this.J = null;
        }
        v2.j jVar = this.U;
        if (jVar != null) {
            r1(jVar);
        }
        this.U = null;
        m0 m0Var = this.T;
        if (m0Var != null) {
            r1(m0Var);
        }
        this.T = null;
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        d3.j jVar = this.N;
        if (jVar != null) {
            d3.x.d(zVar, jVar.f4723a);
        }
        String str = this.M;
        a aVar = new a(this, 1);
        lj.d[] dVarArr = d3.x.f4803a;
        zVar.b(d3.m.f4734b, new d3.a(str, aVar));
        if (this.O) {
            this.Q.u0(zVar);
        } else {
            zVar.b(d3.v.j, pi.o.f13011a);
        }
        t1(zVar);
    }

    public p2.p0 u1() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1() {
        /*
            r17 = this;
            r0 = r17
            z.k r1 = r0.J
            q.y r2 = r0.X
            if (r1 == 0) goto L76
            z.m r3 = r0.V
            if (r3 == 0) goto L14
            z.l r4 = new z.l
            r4.<init>(r3)
            r1.b(r4)
        L14:
            z.m r3 = r0.Z
            if (r3 == 0) goto L20
            z.l r4 = new z.l
            r4.<init>(r3)
            r1.b(r4)
        L20:
            z.h r3 = r0.W
            if (r3 == 0) goto L2c
            z.i r4 = new z.i
            r4.<init>(r3)
            r1.b(r4)
        L2c:
            java.lang.Object[] r3 = r2.f13148c
            long[] r4 = r2.f13146a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            z.m r13 = (z.m) r13
            z.l r14 = new z.l
            r14.<init>(r13)
            r1.b(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.V = r1
            r0.Z = r1
            r0.W = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.v1():void");
    }

    public final long w1(long j) {
        long jQ0 = v2.n.y(this).R.Q0(((h2) v2.n.h(this, w2.f1.f18273t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jQ0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jQ0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void x1(boolean z2) {
        z.k kVar = this.J;
        if (kVar != null) {
            qj.s1 s1Var = this.f17196c0;
            ti.c cVar = null;
            if (s1Var == null || !s1Var.b()) {
                z.m mVar = z2 ? this.Z : this.V;
                if (mVar != null) {
                    z.l lVar = new z.l(mVar);
                    qj.e1 e1Var = (qj.e1) ((vj.d) e1()).f18092a.C(qj.w.f13632b);
                    qj.b0.w(e1(), null, new ab.s(kVar, lVar, e1Var != null ? e1Var.T(new k0.t1(23, kVar, lVar)) : null, cVar, 25), 3);
                }
            } else {
                qj.s1 s1Var2 = this.f17196c0;
                if (s1Var2 != null) {
                    s1Var2.e(null);
                }
            }
            if (z2) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    public final void y1(long j, boolean z2) {
        z.k kVar = this.J;
        if (kVar != null) {
            qj.s1 s1Var = this.f17196c0;
            if (s1Var == null || !s1Var.b()) {
                z.m mVar = z2 ? this.Z : this.V;
                if (mVar != null) {
                    qj.b0.w(e1(), null, new c(mVar, kVar, null), 3);
                }
            } else {
                s1Var.e(null);
                qj.b0.w(e1(), null, new k0.j1(s1Var, j, kVar, (ti.c) null, 2), 3);
            }
            if (z2) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    public final void z1(m2.b bVar) {
        z.k kVar = this.J;
        if (kVar != null) {
            z.m mVar = new z.m(bVar.f11261c);
            fj.r rVar = new fj.r();
            v2.n.B(this, m0.I, new ab.n(new k0.t1(26, bVar, rVar), 15));
            ti.c cVar = null;
            if (rVar.f6803a || y.a(this)) {
                this.f17196c0 = qj.b0.w(e1(), null, new d(kVar, mVar, this, cVar, 0), 3);
            } else {
                this.Z = mVar;
                qj.b0.w(e1(), null, new c(kVar, mVar, cVar, 1), 3);
            }
        }
    }

    public void C1() {
    }

    public void t1(d3.z zVar) {
    }
}
