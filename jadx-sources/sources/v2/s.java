package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends i1 {

    /* renamed from: m0, reason: collision with root package name */
    public static final c2.h f17750m0;

    /* renamed from: k0, reason: collision with root package name */
    public final b2 f17751k0;

    /* renamed from: l0, reason: collision with root package name */
    public r f17752l0;

    static {
        c2.h hVarG = c2.e0.g();
        hVarG.e(c2.w.f3055e);
        hVarG.k(1.0f);
        hVarG.l(1);
        f17750m0 = hVarG;
    }

    public s(f0 f0Var) {
        super(f0Var);
        b2 b2Var = new b2();
        b2Var.f17568d = 0;
        this.f17751k0 = b2Var;
        b2Var.A = this;
        this.f17752l0 = f0Var.A != null ? new r(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // v2.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(v2.e1 r12, long r13, v2.q r15, int r16, boolean r17) {
        /*
            r11 = this;
            v2.f0 r0 = r11.H
            boolean r1 = r12.c(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.X1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.v1()
            float r1 = r11.o1(r13, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r1 = r15.f17745c
            g1.e r0 = r0.x()
            java.lang.Object[] r3 = r0.f7024a
            int r0 = r0.f7026c
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r3[r0]
            r5 = r2
            v2.f0 r5 = (v2.f0) r5
            boolean r2 = r5.H()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.f(r5, r6, r8, r9, r10)
            long r6 = r15.b()
            float r2 = v2.n.l(r6)
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L73
            boolean r2 = v2.n.q(r6)
            if (r2 == 0) goto L73
            boolean r2 = v2.n.p(r6)
            if (r2 != 0) goto L73
            boolean r2 = r12.b(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f17745c = r1
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.s.C1(v2.e1, long, v2.q, int, boolean):void");
    }

    @Override // t2.f1
    public final void G0(long j, float f10, ej.c cVar) {
        M1(j, f10, cVar);
        if (this.C) {
            return;
        }
        this.H.Z.f17703p.X0();
    }

    @Override // v2.i1
    public final void L1(c2.u uVar, f2.b bVar) {
        f0 f0Var = this.H;
        r1 r1VarA = i0.a(f0Var);
        g1.e eVarX = f0Var.x();
        Object[] objArr = eVarX.f7024a;
        int i10 = eVarX.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.H()) {
                f0Var2.i(uVar, bVar);
            }
        }
        if (((w2.t) r1VarA).getShowLayoutBounds()) {
            long j = this.f15552c;
            uVar.k(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f17750m0);
        }
    }

    @Override // t2.p0
    public final int O(int i10) {
        q5.b bVarT = this.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.g(f0Var.Y.f17584d, f0Var.m(), i10);
    }

    @Override // v2.n0
    public final int P0(t2.a aVar) {
        r rVar = this.f17752l0;
        if (rVar != null) {
            return rVar.P0(aVar);
        }
        v0 v0Var = this.H.Z.f17703p;
        g0 g0Var = v0Var.Q;
        if (!v0Var.F) {
            if (v0Var.f17793f.f17692d == b0.f17575a) {
                g0Var.f17657f = true;
                if (g0Var.f17653b) {
                    v0Var.O = true;
                    v0Var.P = true;
                }
            } else {
                g0Var.f17658g = true;
            }
        }
        s sVarA = v0Var.A();
        boolean z2 = sVarA.D;
        sVarA.D = true;
        v0Var.j0();
        sVarA.D = z2;
        Integer num = (Integer) g0Var.f17660i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // t2.p0
    public final int V(int i10) {
        q5.b bVarT = this.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.h(f0Var.Y.f17584d, f0Var.m(), i10);
    }

    @Override // t2.p0
    public final t2.f1 Y(long j) {
        N0(j);
        f0 f0Var = this.H;
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).Z.f17703p.E = d0.f17604c;
        }
        P1(f0Var.P.a(this, f0Var.m(), j));
        G1();
        return this;
    }

    @Override // t2.p0
    public final int l(int i10) {
        q5.b bVarT = this.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.i(f0Var.Y.f17584d, f0Var.m(), i10);
    }

    @Override // v2.i1
    public final void r1() {
        if (this.f17752l0 == null) {
            this.f17752l0 = new r(this);
        }
    }

    @Override // v2.i1
    public final o0 u1() {
        return this.f17752l0;
    }

    @Override // t2.p0
    public final int v0(int i10) {
        q5.b bVarT = this.H.t();
        t2.q0 q0VarO = bVarT.o();
        f0 f0Var = (f0) bVarT.f13235b;
        return q0VarO.f(f0Var.Y.f17584d, f0Var.m(), i10);
    }

    @Override // v2.i1
    public final v1.n w1() {
        return this.f17751k0;
    }
}
