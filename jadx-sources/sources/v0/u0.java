package v0;

import f1.j1;
import java.util.ArrayList;
import k0.x1;
import qj.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final x1 f17486a;

    /* renamed from: d, reason: collision with root package name */
    public k0.t0 f17489d;

    /* renamed from: f, reason: collision with root package name */
    public ej.a f17491f;

    /* renamed from: g, reason: collision with root package name */
    public w2.w0 f17492g;

    /* renamed from: h, reason: collision with root package name */
    public qj.z f17493h;

    /* renamed from: i, reason: collision with root package name */
    public p f17494i;
    public k2.a j;

    /* renamed from: k, reason: collision with root package name */
    public a2.w f17495k;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f17496l;

    /* renamed from: m, reason: collision with root package name */
    public final j1 f17497m;

    /* renamed from: n, reason: collision with root package name */
    public long f17498n;

    /* renamed from: o, reason: collision with root package name */
    public g3.m0 f17499o;

    /* renamed from: p, reason: collision with root package name */
    public long f17500p;

    /* renamed from: q, reason: collision with root package name */
    public final j1 f17501q;

    /* renamed from: r, reason: collision with root package name */
    public final j1 f17502r;

    /* renamed from: s, reason: collision with root package name */
    public int f17503s;

    /* renamed from: t, reason: collision with root package name */
    public l3.t f17504t;

    /* renamed from: u, reason: collision with root package name */
    public p2.h f17505u;

    /* renamed from: v, reason: collision with root package name */
    public g3.m0 f17506v;

    /* renamed from: w, reason: collision with root package name */
    public final j1 f17507w;

    /* renamed from: x, reason: collision with root package name */
    public final t0.j f17508x;

    /* renamed from: y, reason: collision with root package name */
    public final s0 f17509y;

    /* renamed from: z, reason: collision with root package name */
    public final p2.h f17510z;

    /* renamed from: b, reason: collision with root package name */
    public l3.n f17487b = k0.s.f9249e;

    /* renamed from: c, reason: collision with root package name */
    public ej.c f17488c = new g3.y(17);

    /* renamed from: e, reason: collision with root package name */
    public final j1 f17490e = f1.s.A(new l3.t((String) null, 0, 7));

    public u0(x1 x1Var) {
        this.f17486a = x1Var;
        Boolean bool = Boolean.TRUE;
        this.f17496l = f1.s.A(bool);
        this.f17497m = f1.s.A(bool);
        this.f17498n = 0L;
        this.f17500p = 0L;
        this.f17501q = f1.s.A(null);
        this.f17502r = f1.s.A(null);
        this.f17503s = -1;
        this.f17504t = new l3.t((String) null, 0L, 7);
        this.f17507w = f1.s.A(Boolean.FALSE);
        t0.j jVar = new t0.j(27, false);
        jVar.f15364c = q0.m.f13170a;
        this.f17508x = jVar;
        this.f17509y = new s0(this);
        this.f17510z = new p2.h(this);
    }

    public static final pi.h a(u0 u0Var) {
        String str;
        g3.m0 m0Var;
        g3.f fVarM = u0Var.m();
        if (fVarM == null || (str = fVarM.f7081b) == null || (m0Var = u0Var.f17506v) == null) {
            return null;
        }
        long j = m0Var.f7145a;
        return new pi.h(str, new g3.m0(g3.e0.b(u0Var.f17487b.b((int) (j >> 32)), u0Var.f17487b.b((int) (j & 4294967295L)))));
    }

    public static final void b(u0 u0Var, g3.m0 m0Var) {
        g3.f fVarM;
        String str;
        qj.z zVar;
        if (m0Var == null) {
            return;
        }
        long j = m0Var.f7145a;
        p pVar = u0Var.f17494i;
        if (pVar == null || (fVarM = u0Var.m()) == null || (str = fVarM.f7081b) == null) {
            return;
        }
        l3.n nVar = u0Var.f17487b;
        long jB = g3.e0.b(nVar.b((int) (j >> 32)), nVar.b((int) (j & 4294967295L)));
        if (str.length() <= 0 || g3.m0.c(jB) || (zVar = u0Var.f17493h) == null) {
            return;
        }
        qj.b0.w(zVar, null, new r0(pVar, str, jB, m0Var, u0Var, nVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(v0.u0 r21, l3.t r22, long r23, boolean r25, boolean r26, l7.n r27, boolean r28, k2.b r29) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.u0.c(v0.u0, l3.t, long, boolean, boolean, l7.n, boolean, k2.b):long");
    }

    public static l3.t e(g3.f fVar, long j) {
        return new l3.t(fVar, j, (g3.m0) null);
    }

    public final s1 d(boolean z2) {
        qj.z zVar = this.f17493h;
        if (zVar == null) {
            return null;
        }
        qj.a0 a0Var = qj.a0.f13538a;
        return qj.b0.w(zVar, null, new o0(this, z2, null), 1);
    }

    public final void f() {
        qj.z zVar = this.f17493h;
        if (zVar != null) {
            qj.a0 a0Var = qj.a0.f13538a;
            qj.b0.w(zVar, null, new m0(this, null, 1), 1);
        }
    }

    public final void g(b2.b bVar) {
        if (!g3.m0.c(n().f9938b)) {
            k0.t0 t0Var = this.f17489d;
            k0.s1 s1VarD = t0Var != null ? t0Var.d() : null;
            int iE = (bVar == null || s1VarD == null) ? g3.m0.e(n().f9938b) : this.f17487b.a(s1VarD.b(bVar.f1500a, true));
            l3.t tVarA = l3.t.a(n(), null, g3.e0.b(iE, iE), 5);
            this.f17488c.invoke(tVarA);
            this.f17506v = new g3.m0(tVarA.f9938b);
        }
        q((bVar == null || n().f9937a.f7081b.length() <= 0) ? k0.k0.f9150a : k0.k0.f9152c);
        t(false);
    }

    public final void h(boolean z2) {
        a2.w wVar;
        k0.t0 t0Var = this.f17489d;
        if (t0Var != null && !t0Var.b() && (wVar = this.f17495k) != null) {
            a2.w.a(wVar);
        }
        this.f17504t = n();
        t(z2);
        q(k0.k0.f9151b);
    }

    public final b2.b i() {
        return (b2.b) this.f17502r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f17496l.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.f17497m.getValue()).booleanValue();
    }

    public final long l(boolean z2) {
        k0.s1 s1VarD;
        long j;
        k0.t0 t0Var = this.f17489d;
        if (t0Var == null || (s1VarD = t0Var.d()) == null) {
            return 9205357640488583168L;
        }
        g3.k0 k0Var = s1VarD.f9254a;
        g3.o oVar = k0Var.f7129b;
        g3.f fVarM = m();
        if (fVarM == null) {
            return 9205357640488583168L;
        }
        if (!fj.l.b(fVarM.f7081b, k0Var.f7128a.f7117a.f7081b)) {
            return 9205357640488583168L;
        }
        l3.t tVarN = n();
        if (z2) {
            long j4 = tVarN.f9938b;
            int i10 = g3.m0.f7144c;
            j = j4 >> 32;
        } else {
            long j10 = tVarN.f9938b;
            int i11 = g3.m0.f7144c;
            j = j10 & 4294967295L;
        }
        int iB = this.f17487b.b((int) j);
        boolean zG = g3.m0.g(n().f9938b);
        long j11 = k0Var.f7130c;
        if (oVar.d(iB) >= oVar.f7159f) {
            return 9205357640488583168L;
        }
        boolean z10 = k0Var.a(((!z2 || zG) && (z2 || !zG)) ? Math.max(iB + (-1), 0) : iB) == k0Var.g(iB);
        ArrayList arrayList = oVar.f7161h;
        oVar.l(iB);
        g3.q qVar = (g3.q) arrayList.get(iB == ((g3.f) oVar.f7154a.f730a).f7081b.length() ? yd.f.B(arrayList) : g3.e0.d(iB, arrayList));
        fk.g gVar = qVar.f7166a;
        int iD = qVar.d(iB);
        h3.j jVar = (h3.j) gVar.f6828d;
        return (Float.floatToRawIntBits(cg.b.o(oVar.b(r9), 0.0f, (int) (j11 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(cg.b.o(z10 ? jVar.h(iD, false) : jVar.i(iD, false), 0.0f, (int) (j11 >> 32))) << 32);
    }

    public final g3.f m() {
        k0.a1 a1Var;
        k0.t0 t0Var = this.f17489d;
        if (t0Var == null || (a1Var = t0Var.f9264a) == null) {
            return null;
        }
        return a1Var.f9037a;
    }

    public final l3.t n() {
        return (l3.t) this.f17490e.getValue();
    }

    public final void o() {
        s1 s1Var;
        q0.l lVar = (q0.l) this.f17508x.f15363b;
        if (lVar == null || (s1Var = lVar.N) == null) {
            return;
        }
        s1Var.e(null);
        lVar.N = null;
    }

    public final void p() {
        qj.z zVar = this.f17493h;
        if (zVar != null) {
            qj.a0 a0Var = qj.a0.f13538a;
            qj.b0.w(zVar, null, new m0(this, null, 2), 1);
        }
    }

    public final void q(k0.k0 k0Var) {
        k0.t0 t0Var = this.f17489d;
        if (t0Var != null) {
            if (t0Var.a() == k0Var) {
                t0Var = null;
            }
            if (t0Var != null) {
                t0Var.f9273k.setValue(k0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.f9279q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r7 = this;
            t1.g r0 = t1.r.f()
            r1 = 0
            if (r0 == 0) goto Lc
            ej.c r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            t1.g r3 = t1.r.k(r0)
            boolean r4 = r7.k()     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L74
            k0.t0 r4 = r7.f17489d     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L2a
            f1.j1 r4 = r4.f9279q     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L72
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L72
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L72
            if (r4 != 0) goto L2a
            goto L74
        L2a:
            t1.r.n(r0, r3, r2)
            t0.j r0 = r7.f17508x
            java.lang.Object r2 = r0.f15364c
            q0.m r2 = (q0.m) r2
            q0.m r3 = q0.m.f13170a
            if (r2 == r3) goto L38
            goto L3d
        L38:
            java.lang.String r2 = "ToolbarRequester is not initialized."
            a0.a.c(r2)
        L3d:
            java.lang.Object r0 = r0.f15363b
            q0.l r0 = (q0.l) r0
            if (r0 == 0) goto L71
            boolean r2 = r0.G
            if (r2 == 0) goto L71
            qj.s1 r2 = r0.N
            r3 = 1
            if (r2 == 0) goto L53
            boolean r2 = r2.b()
            if (r2 != r3) goto L53
            goto L71
        L53:
            f1.v r2 = r0.g.f13663b
            java.lang.Object r2 = v2.n.h(r0, r2)
            r0.f r2 = (r0.f) r2
            if (r2 != 0) goto L5e
            goto L71
        L5e:
            qj.z r4 = r0.e1()
            qj.a0 r5 = qj.a0.f13538a
            ab.s r5 = new ab.s
            r6 = 16
            r5.<init>(r0, r2, r1, r6)
            qj.s1 r1 = qj.b0.w(r4, r1, r5, r3)
            r0.N = r1
        L71:
            return
        L72:
            r1 = move-exception
            goto L78
        L74:
            t1.r.n(r0, r3, r2)
            return
        L78:
            t1.r.n(r0, r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.u0.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(vi.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof v0.t0
            if (r0 == 0) goto L13
            r0 = r5
            v0.t0 r0 = (v0.t0) r0
            int r1 = r0.f17482d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17482d = r1
            goto L18
        L13:
            v0.t0 r0 = new v0.t0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17480b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f17482d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            v0.u0 r0 = r0.f17479a
            uk.c.R(r5)
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            uk.c.R(r5)
            w2.w0 r5 = r4.f17492g
            if (r5 == 0) goto L67
            r0.f17479a = r4
            r0.f17482d = r3
            w2.h r5 = (w2.h) r5
            w2.i r5 = r5.f18287a
            android.content.ClipboardManager r5 = r5.a()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L54
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L54
            goto L55
        L54:
            r3 = r0
        L55:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            r0 = r4
        L5d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            f1.j1 r0 = r0.f17507w
            r0.setValue(r5)
        L67:
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.u0.s(vi.c):java.lang.Object");
    }

    public final void t(boolean z2) {
        k0.t0 t0Var = this.f17489d;
        if (t0Var != null) {
            t0Var.f9274l.setValue(Boolean.valueOf(z2));
        }
        if (z2) {
            r();
        } else {
            o();
        }
    }
}
