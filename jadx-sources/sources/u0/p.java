package u0;

import android.os.Trace;
import d3.v;
import d3.x;
import d3.y;
import d3.z;
import g3.n0;
import java.util.HashMap;
import k0.s;
import t2.f1;
import t2.p0;
import t2.r0;
import t2.s0;
import v2.w;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends v1.n implements w, v2.m, z1 {
    public String H;
    public n0 I;
    public k3.i J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public HashMap O;
    public g P;
    public n0 Q;
    public n R;
    public o S;

    @Override // v2.w
    public final int C(v2.n0 n0Var, p0 p0Var, int i10) {
        return r1(n0Var).a(i10, n0Var.getLayoutDirection());
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, p0 p0Var, int i10) {
        return r1(n0Var).a(i10, n0Var.getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // v2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(v2.h0 r12) {
        /*
            r11 = this;
            boolean r0 = r11.G
            if (r0 != 0) goto L6
            goto L9b
        L6:
            u0.o r0 = r11.S
            if (r0 == 0) goto L16
            boolean r1 = r0.f16557c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            u0.g r0 = r0.f16558d
            if (r0 != 0) goto L1a
        L16:
            u0.g r0 = r11.q1()
        L1a:
            fk.g r1 = r0.j
            if (r1 == 0) goto La2
            e2.b r12 = r12.f17669a
            ac.d r12 = r12.f5738b
            c2.u r2 = r12.h()
            boolean r12 = r0.f16519k
            if (r12 == 0) goto L43
            long r3 = r0.f16520l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.f()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.o(r3, r4, r5, r6, r7)
        L43:
            r0 = 2
            r11.s1(r0)     // Catch: java.lang.Throwable -> L4e
            g3.n0 r0 = r11.Q     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            g3.n0 r0 = r11.I     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r0 = move-exception
            goto L9c
        L50:
            g3.f0 r3 = r0.f7151a     // Catch: java.lang.Throwable -> L4e
            r3.l r4 = r3.f7095m     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L58
            r3.l r4 = r3.l.f13685b     // Catch: java.lang.Throwable -> L4e
        L58:
            r6 = r4
            c2.v0 r4 = r3.f7096n     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L5f
            c2.v0 r4 = c2.v0.f3048d     // Catch: java.lang.Throwable -> L4e
        L5f:
            r5 = r4
            e2.e r4 = r3.f7098p     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L66
            e2.g r4 = e2.g.f5743a     // Catch: java.lang.Throwable -> L4e
        L66:
            r7 = r4
            r3.o r3 = r3.f7084a     // Catch: java.lang.Throwable -> L4e
            c2.s r3 = r3.b()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L7b
            g3.f0 r0 = r0.f7151a     // Catch: java.lang.Throwable -> L4e
            r3.o r0 = r0.f7084a     // Catch: java.lang.Throwable -> L4e
            float r4 = r0.e()     // Catch: java.lang.Throwable -> L4e
            r1.p(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto L96
        L7b:
            long r3 = c2.w.f3058h     // Catch: java.lang.Throwable -> L4e
            r8 = 16
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L84
            goto L93
        L84:
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4e
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L91
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4e
            goto L93
        L91:
            long r3 = c2.w.f3052b     // Catch: java.lang.Throwable -> L4e
        L93:
            r1.o(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
        L96:
            if (r12 == 0) goto L9b
            r2.q()
        L9b:
            return
        L9c:
            if (r12 == 0) goto La1
            r2.q()
        La1:
            throw r0
        La2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r12.<init>(r0)
            u0.g r0 = r11.P
            r12.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r12.append(r0)
            u0.o r0 = r11.S
            r12.append(r0)
            r0 = 41
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            a0.a.b(r12)
            b3.e r12 = new b3.e
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.O0(v2.h0):void");
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, p0 p0Var, int i10) {
        return s.m(r1(n0Var).e(n0Var.getLayoutDirection()).c());
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, p0 p0Var, int i10) {
        return s.m(r1(n0Var).e(n0Var.getLayoutDirection()).b());
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    public final g q1() {
        n0 n0Var = this.Q;
        if (n0Var == null) {
            n0Var = this.I;
        }
        n0 n0Var2 = n0Var;
        if (this.P == null) {
            this.P = new g(this.H, n0Var2, this.J, this.K, this.L, this.M, this.N);
        }
        g gVar = this.P;
        fj.l.c(gVar);
        return gVar;
    }

    @Override // v2.w
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            g gVarR1 = r1(s0Var);
            boolean zB = gVarR1.b(j, s0Var.getLayoutDirection());
            g3.s sVar = gVarR1.f16522n;
            if (sVar != null) {
                sVar.a();
            }
            fk.g gVar = gVarR1.j;
            fj.l.c(gVar);
            h3.j jVar = (h3.j) gVar.f6828d;
            long j4 = gVarR1.f16520l;
            if (zB) {
                v2.n.v(this, 2).D1();
                HashMap map = this.O;
                if (map == null) {
                    map = new HashMap(2);
                    this.O = map;
                }
                map.put(t2.d.f15528a, Integer.valueOf(Math.round(jVar.d(0))));
                map.put(t2.d.f15529b, Integer.valueOf(Math.round(jVar.d(jVar.f7608g - 1))));
            }
            int i10 = (int) (j4 >> 32);
            int i11 = (int) (j4 & 4294967295L);
            f1 f1VarY = p0Var.Y(uk.c.B(i10, i10, i11, i11));
            HashMap map2 = this.O;
            fj.l.c(map2);
            r0 r0VarB = s0Var.B(i10, i11, map2, new b0.l(f1VarY, 14));
            Trace.endSection();
            return r0VarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u0.g r1(t2.s0 r10) {
        /*
            r9 = this;
            r0 = 1
            boolean r0 = r9.s1(r0)
            if (r0 == 0) goto L21
            g3.n0 r0 = r9.Q
            if (r0 != 0) goto Ld
            g3.n0 r0 = r9.I
        Ld:
            r3 = r0
            u0.g r1 = r9.q1()
            java.lang.String r2 = r9.H
            k3.i r4 = r9.J
            int r5 = r9.K
            boolean r6 = r9.L
            int r7 = r9.M
            int r8 = r9.N
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L21:
            u0.o r0 = r9.S
            if (r0 == 0) goto L31
            boolean r1 = r0.f16557c
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L31
            u0.g r0 = r0.f16558d
            if (r0 != 0) goto L35
        L31:
            u0.g r0 = r9.q1()
        L35:
            r0.d(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p.r1(t2.s0):u0.g");
    }

    public final boolean s1(int i10) {
        n0 n0Var = this.Q;
        n0 n0Var2 = this.I;
        v2.n.B(this, "StyleOuterNode", new ta.n(4));
        this.Q = n0Var2;
        if (n0Var == null) {
            return false;
        }
        return !n0Var.equals(n0Var2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u0.n] */
    @Override // v2.z1
    public final void u0(z zVar) {
        n nVar = this.R;
        n nVar2 = nVar;
        if (nVar == null) {
            final int i10 = 0;
            ?? r02 = new ej.c(this) { // from class: u0.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f16554b;

                {
                    this.f16554b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
                @Override // ej.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r30) {
                    /*
                        Method dump skipped, instructions count: 286
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u0.n.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.R = r02;
            nVar2 = r02;
        }
        g3.f fVar = new g3.f(this.H);
        lj.d[] dVarArr = x.f4803a;
        zVar.b(v.C, yd.f.K(fVar));
        o oVar = this.S;
        if (oVar != null) {
            boolean z2 = oVar.f16557c;
            y yVar = v.E;
            lj.d[] dVarArr2 = x.f4803a;
            lj.d dVar = dVarArr2[17];
            zVar.b(yVar, Boolean.valueOf(z2));
            g3.f fVar2 = new g3.f(oVar.f16556b);
            y yVar2 = v.D;
            lj.d dVar2 = dVarArr2[16];
            zVar.b(yVar2, fVar2);
        }
        final int i11 = 1;
        zVar.b(d3.m.f4743l, new d3.a(null, new ej.c(this) { // from class: u0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f16554b;

            {
                this.f16554b = this;
            }

            @Override // ej.c
            public final Object invoke(Object v9) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.n.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i12 = 2;
        zVar.b(d3.m.f4744m, new d3.a(null, new ej.c(this) { // from class: u0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f16554b;

            {
                this.f16554b = this;
            }

            @Override // ej.c
            public final Object invoke(Object v9) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.n.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        zVar.b(d3.m.f4745n, new d3.a(null, new q0.k(this, 13)));
        x.a(zVar, nVar2);
    }
}
