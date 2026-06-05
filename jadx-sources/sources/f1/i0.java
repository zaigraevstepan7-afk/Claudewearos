package f1;

import android.os.Trace;
import c1.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 {
    public int A;
    public int B;
    public boolean C;
    public final h0 D;
    public final ArrayList E;
    public boolean F;
    public i1.g G;
    public i1.h H;
    public i1.k I;
    public boolean J;
    public n1 K;
    public j1.a L;
    public final j1.b M;
    public i1.b N;
    public j1.c O;
    public h2 P;
    public final u1.f Q;
    public final ti.h R;
    public boolean S;
    public long T;
    public j0 U;

    /* renamed from: a, reason: collision with root package name */
    public final v2.f2 f6313a;

    /* renamed from: b, reason: collision with root package name */
    public final p f6314b;

    /* renamed from: c, reason: collision with root package name */
    public final i1.h f6315c;

    /* renamed from: d, reason: collision with root package name */
    public final q.j0 f6316d;

    /* renamed from: e, reason: collision with root package name */
    public final j1.a f6317e;

    /* renamed from: f, reason: collision with root package name */
    public final j1.a f6318f;

    /* renamed from: g, reason: collision with root package name */
    public final ld.i f6319g;

    /* renamed from: h, reason: collision with root package name */
    public final r f6320h;
    public k0 j;

    /* renamed from: k, reason: collision with root package name */
    public int f6322k;

    /* renamed from: l, reason: collision with root package name */
    public int f6323l;

    /* renamed from: m, reason: collision with root package name */
    public int f6324m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f6326o;

    /* renamed from: p, reason: collision with root package name */
    public q.t f6327p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6328q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6329r;

    /* renamed from: v, reason: collision with root package name */
    public q.v f6333v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6334w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6336y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6321i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final n0 f6325n = new n0(0, false);

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f6330s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final n0 f6331t = new n0(0, false);

    /* renamed from: u, reason: collision with root package name */
    public n1 f6332u = p1.i.f12646d;

    /* renamed from: x, reason: collision with root package name */
    public final n0 f6335x = new n0(0, false);

    /* renamed from: z, reason: collision with root package name */
    public int f6337z = -1;

    public i0(v2.f2 f2Var, p pVar, i1.h hVar, q.j0 j0Var, j1.a aVar, j1.a aVar2, ld.i iVar, r rVar) {
        this.f6313a = f2Var;
        this.f6314b = pVar;
        this.f6315c = hVar;
        this.f6316d = j0Var;
        this.f6317e = aVar;
        this.f6318f = aVar2;
        this.f6319g = iVar;
        this.f6320h = rVar;
        this.C = pVar.f() || pVar.d();
        this.D = new h0(this, 0);
        this.E = new ArrayList();
        i1.g gVarW = hVar.w();
        gVarW.c();
        this.G = gVarW;
        i1.h hVar2 = new i1.h();
        if (pVar.f()) {
            hVar2.e();
        }
        if (pVar.d()) {
            hVar2.D = new q.v();
        }
        this.H = hVar2;
        i1.k kVarX = hVar2.x();
        kVarX.e(true);
        this.I = kVarX;
        this.M = new j1.b(this, aVar);
        i1.g gVarW2 = this.H.w();
        try {
            i1.b bVarA = gVarW2.a(0);
            gVarW2.c();
            this.N = bVarA;
            this.O = new j1.c();
            this.Q = new u1.f(this);
            ti.h hVarJ = pVar.j();
            ti.h hVarD = D();
            this.R = hVarJ.V(hVarD == null ? ti.i.f16336a : hVarD);
        } catch (Throwable th2) {
            gVarW2.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int S(int r19, int r20, f1.i0 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.S(int, int, f1.i0, boolean):int");
    }

    public final u A() {
        return l();
    }

    public final t1 B() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (s.x(arrayList)) {
            return (t1) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final boolean C() {
        if (!F() || this.f6334w) {
            return true;
        }
        t1 t1VarB = B();
        return (t1VarB == null || (t1VarB.f6454b & 4) == 0) ? false : true;
    }

    public final u1.f D() {
        if (this.f6314b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        t1 t1VarB;
        return (this.S || this.f6336y || this.f6334w || (t1VarB = B()) == null || (t1VarB.f6454b & 8) != 0) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        i0 i0Var = this;
        j1.a aVar = i0Var.f6318f;
        j1.b bVar = i0Var.M;
        j1.a aVar2 = bVar.f8609b;
        try {
            bVar.f8609b = aVar;
            aVar.f8606d.f0(j1.a0.f8607c);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                pi.h hVar = (pi.h) arrayList.get(i10);
                v0 v0Var = (v0) hVar.f13000a;
                v0Var.getClass();
                i1.b bVarG = cg.b.g(null);
                i1.h hVarD = i1.j.d(null);
                int iB = hVarD.b(bVarG);
                p1.f fVar = new p1.f();
                bVar.b();
                j1.l0 l0Var = bVar.f8609b.f8606d;
                l0Var.f0(j1.j.f8635c);
                wd.a.P(l0Var, 0, fVar, 1, bVarG);
                if (hVarD.equals(i0Var.H)) {
                    if (!i0Var.I.f8157w) {
                        n.a("Check failed");
                    }
                    i0Var.y();
                }
                i1.g gVarW = hVarD.w();
                try {
                    gVarW.r(iB);
                    bVar.f8613f = iB;
                    j1.a aVar3 = new j1.a();
                    i0Var.L(null, null, null, qi.s.f13520a, new r3(i0Var, aVar3, gVarW, v0Var));
                    j1.a aVar4 = bVar.f8609b;
                    aVar4.getClass();
                    if (!aVar3.f8606d.e0()) {
                        j1.l0 l0Var2 = aVar4.f8606d;
                        l0Var2.f0(j1.f.f8627c);
                        wd.a.P(l0Var2, 0, aVar3, 1, fVar);
                    }
                    gVarW.c();
                    bVar.f8609b.f8606d.f0(j1.c0.f8622c);
                    i10++;
                    i0Var = this;
                } catch (Throwable th2) {
                    gVarW.c();
                    throw th2;
                }
            }
            bVar.b();
            bVar.f8609b.f8606d.f0(j1.n.f8647c);
            bVar.f8613f = 0;
            bVar.f8609b = aVar2;
        } catch (Throwable th3) {
            bVar.f8609b = aVar2;
            throw th3;
        }
    }

    public final void H(n1 n1Var, Object obj) {
        X(null, 126665345, 0, null);
        I();
        m0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                i1.k.z(this.I);
            }
            boolean z2 = (this.S || fj.l.b(this.G.f(), n1Var)) ? false : true;
            if (z2) {
                O(n1Var);
            }
            X(n.f6397c, 202, 0, n1Var);
            this.K = null;
            boolean z10 = this.f6334w;
            this.f6334w = z2;
            p1.j.c(this, new p1.e(new b0.g2(obj, 6), true, -59194059));
            this.f6334w = z10;
        } finally {
        }
    }

    public final Object I() {
        boolean z2 = this.S;
        f fVar = m.f6385a;
        if (!z2) {
            Object objM = this.G.m();
            if (!this.f6336y || (objM instanceof g2)) {
                return objM;
            }
        } else if (this.f6329r) {
            n.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final List J() {
        p pVar = this.f6314b;
        o oVarH = pVar.h();
        r rVar = oVarH instanceof r ? (r) oVarH : null;
        if (rVar != null) {
            i1.h hVar = rVar.f6428f;
            i1.g gVarW = i1.j.d(hVar).w();
            try {
                Integer numN = u1.b.n(gVarW, pVar, 0, gVarW.f8115c);
                if (numN != null) {
                    gVarW = i1.j.d(hVar).w();
                    try {
                        ArrayList arrayListV = u1.b.v(gVarW, numN.intValue(), 0);
                        gVarW.c();
                        return qi.l.I0(arrayListV, rVar.O.J());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return qi.s.f13520a;
    }

    public final int K(int i10) {
        int iQ = this.G.q(i10) + 1;
        int i11 = 0;
        while (iQ < i10) {
            if (!this.G.k(iQ)) {
                i11++;
            }
            iQ += this.G.f8114b[(iQ * 5) + 3];
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(f1.r r9, f1.r r10, java.lang.Integer r11, java.util.List r12, ej.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f6322k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f6322k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            pi.h r6 = (pi.h) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f13000a     // Catch: java.lang.Throwable -> L24
            f1.t1 r7 = (f1.t1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f13001b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.g0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.g0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.K = r10     // Catch: java.lang.Throwable -> L24
            r9.L = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4d
            r9.K = r5     // Catch: java.lang.Throwable -> L24
            r9.L = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.K = r5     // Catch: java.lang.Throwable -> L24
            r9.L = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.f6322k = r1
            return r10
        L62:
            r8.F = r0
            r8.f6322k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.L(f1.r, f1.r, java.lang.Integer, java.util.List, ej.a):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.M():void");
    }

    public final void N() {
        int i10;
        R(this.G.f8119g);
        j1.b bVar = this.M;
        bVar.d(false);
        n0 n0Var = bVar.f8611d;
        i0 i0Var = bVar.f8608a;
        i1.g gVar = i0Var.G;
        if (gVar.f8115c > 0 && n0Var.b(-2) != (i10 = gVar.f8121i)) {
            if (!bVar.f8610c && bVar.f8612e) {
                bVar.d(false);
                bVar.f8609b.f8606d.f0(j1.q.f8650c);
                bVar.f8610c = true;
            }
            if (i10 > 0) {
                i1.b bVarA = gVar.a(i10);
                n0Var.d(i10);
                bVar.d(false);
                j1.l0 l0Var = bVar.f8609b.f8606d;
                l0Var.f0(j1.p.f8649c);
                wd.a.O(l0Var, 0, bVarA);
                bVar.f8610c = true;
            }
        }
        bVar.f8609b.f8606d.f0(j1.y.f8662c);
        int i11 = bVar.f8613f;
        i1.g gVar2 = i0Var.G;
        bVar.f8613f = gVar2.f8114b[(gVar2.f8119g * 5) + 3] + i11;
    }

    public final void O(n1 n1Var) {
        q.v vVar = this.f6333v;
        if (vVar == null) {
            vVar = new q.v();
            this.f6333v = vVar;
        }
        vVar.i(this.G.f8119g, n1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(int r7, int r8, int r9) {
        /*
            r6 = this;
            i1.g r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            j1.b r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.P(int, int, int):void");
    }

    public final Object Q() {
        boolean z2 = this.S;
        f fVar = m.f6385a;
        if (!z2) {
            Object objM = this.G.m();
            if (!this.f6336y || (objM instanceof g2)) {
                return objM instanceof d2 ? ((d2) objM).a() : objM;
            }
        } else if (this.f6329r) {
            n.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final void R(int i10) {
        boolean zL = this.G.l(i10);
        j1.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i10);
            bVar.c();
            bVar.f8615h.add(objN);
        }
        S(i10, 0, this, zL);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean T(int i10, boolean z2) {
        t1 t1VarB;
        if ((i10 & 1) == 0 && (this.S || this.f6336y)) {
            h2 h2Var = this.P;
            if (h2Var == null || (t1VarB = B()) == null || !h2Var.b() || (t1VarB.f6454b & 512) != 0) {
                return true;
            }
            t1VarB.f();
            boolean z10 = this.f6336y;
            int i11 = t1VarB.f6454b;
            t1VarB.f6454b = (z10 ? i11 | 128 : i11 & (-129)) | 256;
            j1.l0 l0Var = this.M.f8609b.f8606d;
            l0Var.f0(j1.x.f8661c);
            wd.a.O(l0Var, 0, t1VarB);
            this.f6314b.q(t1VarB);
            return false;
        }
        if (!z2 && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.U():void");
    }

    public final void V() {
        i1.g gVar = this.G;
        int i10 = gVar.f8121i;
        this.f6323l = i10 >= 0 ? gVar.f8114b[(i10 * 5) + 1] & 67108863 : 0;
        gVar.t();
    }

    public final void W() {
        if (this.f6323l != 0) {
            n.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        t1 t1VarB = B();
        if (t1VarB != null) {
            int i10 = t1VarB.f6454b;
            if ((i10 & 128) == 0) {
                t1VarB.f6454b = i10 | 16;
            }
        }
        if (this.f6330s.isEmpty()) {
            V();
        } else {
            M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(java.lang.Object r27, int r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.X(java.lang.Object, int, int, java.lang.Object):void");
    }

    public final void Y() {
        X(null, -127, 0, null);
    }

    public final void Z(int i10, d1 d1Var) {
        X(d1Var, i10, 0, null);
    }

    public final void a() {
        i();
        this.f6321i.clear();
        this.f6325n.f6400a = 0;
        this.f6331t.f6400a = 0;
        this.f6335x.f6400a = 0;
        this.f6333v = null;
        j1.c cVar = this.O;
        cVar.f8621c.c0();
        cVar.f8620b.c0();
        this.T = 0;
        this.A = 0;
        this.f6329r = false;
        this.S = false;
        this.f6336y = false;
        this.F = false;
        this.f6337z = -1;
        i1.g gVar = this.G;
        if (!gVar.f8118f) {
            gVar.c();
        }
        if (this.I.f8157w) {
            return;
        }
        y();
    }

    public final void a0(Object obj, boolean z2) {
        if (z2) {
            i1.g gVar = this.G;
            if (gVar.f8122k <= 0) {
                if ((gVar.f8114b[(gVar.f8119g * 5) + 1] & 1073741824) == 0) {
                    o1.a("Expected a node group");
                }
                gVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            j1.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            j1.l0 l0Var = bVar.f8609b.f8606d;
            l0Var.f0(j1.f0.f8628c);
            wd.a.O(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void b(ej.e eVar, Object obj) {
        if (this.S) {
            j1.l0 l0Var = this.O.f8620b;
            l0Var.f0(j1.g0.f8630c);
            wd.a.O(l0Var, 0, obj);
            fj.l.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            fj.y.c(2, eVar);
            wd.a.O(l0Var, 1, eVar);
            return;
        }
        j1.b bVar = this.M;
        bVar.b();
        j1.l0 l0Var2 = bVar.f8609b.f8606d;
        l0Var2.f0(j1.g0.f8630c);
        fj.l.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        fj.y.c(2, eVar);
        wd.a.P(l0Var2, 0, obj, 1, eVar);
    }

    public final void b0(int i10) {
        int i11;
        int i12;
        if (this.j != null) {
            X(null, i10, 0, null);
            return;
        }
        if (this.f6329r) {
            n.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i10, 3) ^ this.f6324m;
        this.f6324m++;
        i1.g gVar = this.G;
        boolean z2 = this.S;
        f fVar = m.f6385a;
        if (z2) {
            gVar.f8122k++;
            this.I.Q(i10, fVar, fVar, false);
            x(false, null);
            return;
        }
        if (gVar.g() == i10 && ((i12 = gVar.f8119g) >= gVar.f8120h || (gVar.f8114b[(i12 * 5) + 1] & 536870912) == 0)) {
            gVar.u();
            x(false, null);
            return;
        }
        if (gVar.f8122k <= 0 && (i11 = gVar.f8119g) != gVar.f8120h) {
            int i13 = this.f6322k;
            N();
            this.M.e(i13, gVar.s());
            s.k(i11, gVar.f8119g, this.f6330s);
        }
        gVar.f8122k++;
        this.S = true;
        this.K = null;
        if (this.I.f8157w) {
            i1.k kVarX = this.H.x();
            this.I = kVarX;
            kVarX.M();
            this.J = false;
            this.K = null;
        }
        i1.k kVar = this.I;
        kVar.d();
        int i14 = kVar.f8154t;
        kVar.Q(i10, fVar, fVar, false);
        this.N = kVar.b(i14);
        x(false, null);
    }

    public final boolean c(float f10) {
        Object objI = I();
        if ((objI instanceof Float) && f10 == ((Number) objI).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f10));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.i0 c0(int r7) {
        /*
            r6 = this;
            r6.b0(r7)
            boolean r7 = r6.S
            ld.i r0 = r6.f6319g
            java.util.ArrayList r1 = r6.E
            f1.r r2 = r6.f6320h
            if (r7 == 0) goto L26
            f1.t1 r7 = new f1.t1
            r7.<init>(r2)
            r1.add(r7)
            r6.m0(r7)
            int r1 = r6.B
            r7.f6457e = r1
            int r1 = r7.f6454b
            r1 = r1 & (-17)
            r7.f6454b = r1
            r0.y()
            return r6
        L26:
            i1.g r7 = r6.G
            int r7 = r7.f8121i
            java.util.ArrayList r3 = r6.f6330s
            int r7 = f1.s.s(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            f1.o0 r7 = (f1.o0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            i1.g r3 = r6.G
            java.lang.Object r3 = r3.m()
            f1.f r4 = f1.m.f6385a
            boolean r4 = fj.l.b(r3, r4)
            if (r4 == 0) goto L51
            f1.t1 r3 = new f1.t1
            r3.<init>(r2)
            r6.m0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            fj.l.d(r3, r2)
            f1.t1 r3 = (f1.t1) r3
        L58:
            r2 = 1
            r4 = 0
            if (r7 != 0) goto L70
            int r7 = r3.f6454b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r2
            goto L65
        L64:
            r5 = r4
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.f6454b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r4
            goto L71
        L70:
            r7 = r2
        L71:
            int r5 = r3.f6454b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.f6454b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f6457e = r7
            int r7 = r3.f6454b
            r7 = r7 & (-17)
            r3.f6454b = r7
            r0.y()
            int r7 = r3.f6454b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lbc
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f6454b = r7
            j1.b r7 = r6.M
            j1.a r7 = r7.f8609b
            j1.l0 r7 = r7.f8606d
            j1.d0 r0 = j1.d0.f8624c
            r7.f0(r0)
            wd.a.O(r7, r4, r3)
            boolean r7 = r6.f6336y
            if (r7 != 0) goto Lbc
            int r7 = r3.f6454b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lbc
            r6.f6336y = r2
            i1.g r0 = r6.G
            int r0 = r0.f8121i
            r6.f6337z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f6454b = r7
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.c0(int):f1.i0");
    }

    public final boolean d(int i10) {
        Object objI = I();
        if ((objI instanceof Integer) && i10 == ((Number) objI).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i10));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !fj.l.b(this.G.f(), obj) && this.f6337z < 0) {
            this.f6337z = this.G.f8119g;
            this.f6336y = true;
        }
        X(null, 207, 0, obj);
    }

    public final boolean e(long j) {
        Object objI = I();
        if ((objI instanceof Long) && j == ((Number) objI).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        X(null, 125, 2, null);
        this.f6329r = true;
    }

    public final boolean f(Object obj) {
        if (fj.l.b(I(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    public final void f0() {
        this.f6324m = 0;
        this.G = this.f6315c.w();
        X(null, 100, 0, null);
        p pVar = this.f6314b;
        pVar.t();
        n1 n1VarI = pVar.i();
        this.f6335x.d(this.f6334w ? 1 : 0);
        this.f6334w = f(n1VarI);
        this.K = null;
        if (!this.f6328q) {
            this.f6328q = pVar.e();
        }
        if (!this.C) {
            this.C = pVar.f();
        }
        if (this.C) {
            r2 r2Var = u1.g.f16572a;
            fj.l.d(r2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            n1VarI = ((p1.i) n1VarI).d(r2Var, new s2(D()));
        }
        this.f6332u = n1VarI;
        Set set = (Set) s.H(n1VarI, u1.i.f16574a);
        if (set != null) {
            set.add(z());
            pVar.o(set);
        }
        X(null, Long.hashCode(pVar.g()), 0, null);
    }

    public final boolean g(boolean z2) {
        Object objI = I();
        if ((objI instanceof Boolean) && z2 == ((Boolean) objI).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z2));
        return true;
    }

    public final boolean g0(t1 t1Var, Object obj) {
        i1.b bVar = t1Var.f6455c;
        if (bVar == null) {
            return false;
        }
        int iB = this.G.f8113a.b(cg.b.g(bVar));
        if (!this.F || iB < this.G.f8119g) {
            return false;
        }
        ArrayList arrayList = this.f6330s;
        int iS = s.s(iB, arrayList);
        if (iS < 0) {
            int i10 = -(iS + 1);
            if (!(obj instanceof y)) {
                obj = null;
            }
            arrayList.add(i10, new o0(t1Var, iB, obj));
            return true;
        }
        o0 o0Var = (o0) arrayList.get(iS);
        if (!(obj instanceof y)) {
            o0Var.f6404c = null;
            return true;
        }
        Object obj2 = o0Var.f6404c;
        if (obj2 == null) {
            o0Var.f6404c = obj;
            return true;
        }
        if (obj2 instanceof q.h0) {
            ((q.h0) obj2).a(obj);
            return true;
        }
        q.h0 h0Var = q.o0.f13110a;
        q.h0 h0Var2 = new q.h0(2);
        h0Var2.j(obj2);
        h0Var2.j(obj);
        o0Var.f6404c = h0Var2;
        return true;
    }

    public final boolean h(Object obj) {
        if (I() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(q.g0 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.ArrayList r2 = r0.f6330s
            int r3 = yd.f.B(r2)
        La:
            r5 = -1
            if (r5 >= r3) goto L36
            java.lang.Object r5 = r2.get(r3)
            f1.o0 r5 = (f1.o0) r5
            f1.t1 r6 = r5.f6402a
            i1.b r6 = r6.f6455c
            if (r6 == 0) goto L1e
            i1.b r4 = cg.b.g(r6)
            goto L1f
        L1e:
            r4 = 0
        L1f:
            if (r4 == 0) goto L30
            boolean r6 = r4.a()
            if (r6 == 0) goto L30
            int r6 = r5.f6403b
            int r4 = r4.f8101a
            if (r6 == r4) goto L33
            r5.f6403b = r4
            goto L33
        L30:
            r2.remove(r3)
        L33:
            int r3 = r3 + (-1)
            goto La
        L36:
            java.lang.Object[] r3 = r1.f13074b
            java.lang.Object[] r5 = r1.f13075c
            long[] r1 = r1.f13073a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L97
            r8 = 0
        L42:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L92
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L5c:
            if (r13 >= r11) goto L90
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            fj.l.d(r15, r4)
            f1.t1 r15 = (f1.t1) r15
            i1.b r4 = r15.f6455c
            if (r4 == 0) goto L8c
            i1.b r4 = cg.b.g(r4)
            int r4 = r4.f8101a
            f1.f r7 = f1.f.f6292f
            if (r14 != r7) goto L84
            r14 = 0
        L84:
            f1.o0 r7 = new f1.o0
            r7.<init>(r15, r4, r14)
            r2.add(r7)
        L8c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L5c
        L90:
            if (r11 != r12) goto L97
        L92:
            if (r8 == r6) goto L97
            int r8 = r8 + 1
            goto L42
        L97:
            bk.b r1 = f1.s.f6442c
            qi.p.t0(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.h0(q.g0):void");
    }

    public final void i() {
        this.j = null;
        this.f6322k = 0;
        this.f6323l = 0;
        this.T = 0L;
        this.f6329r = false;
        j1.b bVar = this.M;
        bVar.f8610c = false;
        bVar.f8611d.f6400a = 0;
        bVar.f8613f = 0;
        bVar.f8612e = true;
        bVar.f8614g = 0;
        bVar.f8615h.clear();
        bVar.f8616i = -1;
        bVar.j = -1;
        bVar.f8617k = -1;
        bVar.f8618l = 0;
        this.E.clear();
        this.f6326o = null;
        this.f6327p = null;
    }

    public final void i0(int i10, int i11) {
        if (n0(i10) != i11) {
            if (i10 < 0) {
                q.t tVar = this.f6327p;
                if (tVar == null) {
                    tVar = new q.t();
                    this.f6327p = tVar;
                }
                tVar.f(i10, i11);
                return;
            }
            int[] iArr = this.f6326o;
            if (iArr == null) {
                int i12 = this.G.f8115c;
                int[] iArr2 = new int[i12];
                Arrays.fill(iArr2, 0, i12, -1);
                this.f6326o = iArr2;
                iArr = iArr2;
            }
            iArr[i10] = i11;
        }
    }

    public final Object j(q1 q1Var) {
        return s.H(l(), q1Var);
    }

    public final void j0(int i10, int i11) {
        int iN0 = n0(i10);
        if (iN0 != i11) {
            int i12 = i11 - iN0;
            ArrayList arrayList = this.f6321i;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iN02 = n0(i10) + i12;
                i0(i10, iN02);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        k0 k0Var = (k0) arrayList.get(i13);
                        if (k0Var != null && k0Var.a(i10, iN02)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.G.f8121i;
                } else if (this.G.l(i10)) {
                    return;
                } else {
                    i10 = this.G.q(i10);
                }
            }
        }
    }

    public final void k(ej.a aVar) {
        if (!this.f6329r) {
            n.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f6329r = false;
        if (!this.S) {
            n.a("createNode() can only be called when inserting");
        }
        n0 n0Var = this.f6325n;
        int i10 = n0Var.f6401b[n0Var.f6400a - 1];
        i1.k kVar = this.I;
        i1.b bVarB = kVar.b(kVar.f8156v);
        this.f6323l++;
        j1.c cVar = this.O;
        j1.l0 l0Var = cVar.f8620b;
        l0Var.f0(j1.r.f8651d);
        wd.a.O(l0Var, 0, aVar);
        l0Var.f8642d[l0Var.f8643e - l0Var.f8640b[l0Var.f8641c - 1].f8636a] = i10;
        wd.a.O(l0Var, 1, bVarB);
        j1.l0 l0Var2 = cVar.f8621c;
        l0Var2.f0(j1.r.f8652e);
        l0Var2.f8642d[l0Var2.f8643e - l0Var2.f8640b[l0Var2.f8641c - 1].f8636a] = i10;
        wd.a.O(l0Var2, 0, bVarB);
    }

    public final p1.i k0(n1 n1Var, p1.i iVar) {
        p1.h hVarA = ((p1.i) n1Var).a();
        hVarA.putAll(iVar);
        p1.i iVarC = hVarA.build();
        Z(204, n.f6398d);
        I();
        m0(iVarC);
        I();
        m0(iVar);
        p(false);
        return iVarC;
    }

    public final n1 l() {
        n1 n1Var;
        n1 n1Var2 = this.K;
        if (n1Var2 != null) {
            return n1Var2;
        }
        int iQ = this.G.f8121i;
        boolean z2 = this.S;
        d1 d1Var = n.f6397c;
        if (z2 && this.J) {
            int iE = this.I.f8156v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && fj.l.b(this.I.t(iE), d1Var)) {
                    Object objQ = this.I.q(iE);
                    fj.l.d(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    n1 n1Var3 = (n1) objQ;
                    this.K = n1Var3;
                    return n1Var3;
                }
                i1.k kVar = this.I;
                iE = kVar.E(kVar.f8137b, iE);
            }
        }
        if (this.G.f8115c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    i1.g gVar = this.G;
                    if (fj.l.b(gVar.p(gVar.f8114b, iQ), d1Var)) {
                        q.v vVar = this.f6333v;
                        if (vVar == null || (n1Var = (n1) vVar.b(iQ)) == null) {
                            i1.g gVar2 = this.G;
                            Object objB = gVar2.b(gVar2.f8114b, iQ);
                            fj.l.d(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            n1Var = (n1) objB;
                        }
                        this.K = n1Var;
                        return n1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        n1 n1Var4 = this.f6332u;
        this.K = n1Var4;
        return n1Var4;
    }

    public final void l0(Object obj) {
        if (obj instanceof c2) {
            l0 l0Var = new l0((c2) obj, this.f6324m - 1);
            if (this.S) {
                j1.l0 l0Var2 = this.M.f8609b.f8606d;
                l0Var2.f0(j1.w.f8660c);
                wd.a.O(l0Var2, 0, l0Var);
            }
            this.f6316d.add(obj);
            obj = l0Var;
        }
        m0(obj);
    }

    public final u1.a m() {
        Collection collection;
        if (!this.f6314b.k()) {
            return null;
        }
        ri.c cVarR = yd.f.r();
        i1.k kVar = this.I;
        cVarR.addAll(u1.b.i(kVar, null, kVar.f8154t, null));
        i1.g gVar = this.G;
        boolean z2 = gVar.f8118f;
        int[] iArr = gVar.f8114b;
        if (z2 || gVar.f8115c == 0) {
            collection = qi.s.f13520a;
        } else {
            u1.n nVar = new u1.n(gVar, 0);
            int iQ = gVar.f8121i;
            Object objValueOf = Integer.valueOf(gVar.f8123l - i1.j.b(iArr, iQ));
            while (iQ >= 0) {
                nVar.n(gVar.i(iQ), gVar.k(iQ) ? gVar.p(iArr, iQ) : m.f6385a, gVar.f8113a.z(iQ), objValueOf);
                objValueOf = gVar.a(iQ);
                iQ = gVar.q(iQ);
            }
            collection = (ArrayList) nVar.f6149a;
        }
        cVarR.addAll(collection);
        cVarR.addAll(J());
        return new u1.a(yd.f.m(cVarR), this.C);
    }

    public final void m0(Object obj) {
        if (this.S) {
            i1.k kVar = this.I;
            if (kVar.f8148n <= 0 || kVar.f8144i == kVar.f8145k) {
                kVar.F(obj);
                return;
            }
            q.v vVar = kVar.f8153s;
            if (vVar == null) {
                vVar = new q.v();
            }
            kVar.f8153s = vVar;
            int i10 = kVar.f8156v;
            Object objB = vVar.b(i10);
            if (objB == null) {
                objB = new q.b0();
                vVar.i(i10, objB);
            }
            ((q.b0) objB).a(obj);
            return;
        }
        i1.g gVar = this.G;
        boolean z2 = gVar.f8125n;
        j1.b bVar = this.M;
        if (!z2) {
            i1.b bVarA = gVar.a(gVar.f8121i);
            j1.l0 l0Var = bVar.f8609b.f8606d;
            l0Var.f0(j1.e.f8625c);
            wd.a.P(l0Var, 0, bVarA, 1, obj);
            return;
        }
        int iB = (gVar.f8123l - i1.j.b(gVar.f8114b, gVar.f8121i)) - 1;
        if (bVar.f8608a.G.f8121i - bVar.f8613f >= 0) {
            bVar.d(true);
            j1.l0 l0Var2 = bVar.f8609b.f8606d;
            l0Var2.f0(j1.r.f8654g);
            wd.a.O(l0Var2, 0, obj);
            l0Var2.f8642d[l0Var2.f8643e - l0Var2.f8640b[l0Var2.f8641c - 1].f8636a] = iB;
            return;
        }
        i1.g gVar2 = this.G;
        i1.b bVarA2 = gVar2.a(gVar2.f8121i);
        j1.l0 l0Var3 = bVar.f8609b.f8606d;
        l0Var3.f0(j1.r.f8653f);
        wd.a.P(l0Var3, 0, obj, 1, bVarA2);
        l0Var3.f8642d[l0Var3.f8643e - l0Var3.f8640b[l0Var3.f8641c - 1].f8636a] = iB;
    }

    public final void n(q.g0 g0Var, ej.e eVar) {
        ArrayList arrayList = this.f6330s;
        if (this.F) {
            n.a("Reentrant composition is not supported");
        }
        this.f6319g.y();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(t1.m.j().g());
            this.f6333v = null;
            h0(g0Var);
            this.f6322k = 0;
            this.F = true;
            try {
                f0();
                Object objI = I();
                if (objI != eVar && eVar != null) {
                    m0(eVar);
                }
                h0 h0Var = this.D;
                g1.e eVarP = s.p();
                try {
                    eVarP.b(h0Var);
                    d1 d1Var = n.f6395a;
                    if (eVar != null) {
                        Z(200, d1Var);
                        p1.j.c(this, eVar);
                        p(false);
                    } else if (!this.f6334w || objI == null || objI.equals(m.f6385a)) {
                        U();
                    } else {
                        Z(200, d1Var);
                        fj.y.c(2, objI);
                        p1.j.c(this, (ej.e) objI);
                        p(false);
                    }
                    eVarP.l(eVarP.f7026c - 1);
                    w();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f8157w) {
                        n.a("Check failed");
                    }
                    y();
                } catch (Throwable th2) {
                    eVarP.l(eVarP.f7026c - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final int n0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f6326o;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.G.o(i10) : i11;
        }
        q.t tVar = this.f6327p;
        if (tVar == null || tVar.c(i10) < 0) {
            return 0;
        }
        int iC = tVar.c(i10);
        if (iC >= 0) {
            return tVar.f13132c[iC];
        }
        r.a.e("Cannot find value for key " + i10);
        throw null;
    }

    public final void o(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        o(this.G.q(i10), i11);
        if (this.G.l(i10)) {
            Object objN = this.G.n(i10);
            j1.b bVar = this.M;
            bVar.c();
            bVar.f8615h.add(objN);
        }
    }

    public final void o0() {
        if (!this.f6329r) {
            n.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f6329r = false;
        if (this.S) {
            n.a("useNode() called while inserting");
        }
        i1.g gVar = this.G;
        Object objN = gVar.n(gVar.f8121i);
        j1.b bVar = this.M;
        bVar.c();
        bVar.f8615h.add(objN);
        if (this.f6336y && (objN instanceof i)) {
            bVar.b();
            bVar.f8609b.f8606d.f0(j1.i0.f8634c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0517  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.p(boolean):void");
    }

    public final void q() {
        p(false);
        t1 t1VarB = B();
        if (t1VarB != null) {
            int i10 = t1VarB.f6454b;
            if ((i10 & 1) != 0) {
                t1VarB.f6454b = i10 | 2;
            }
        }
    }

    public final void r() {
        p(false);
    }

    public final void s() {
        p(true);
    }

    public final void t() {
        p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[EDGE_INSN: B:60:0x0031->B:11:0x0031 BREAK  A[LOOP:0: B:15:0x003f->B:27:0x0081], EDGE_INSN: B:61:0x0031->B:11:0x0031 BREAK  A[LOOP:0: B:15:0x003f->B:27:0x0081]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.t1 u() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i0.u():f1.t1");
    }

    public final void v() {
        if (this.F || this.f6337z != 0) {
            o1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f6337z = -1;
        this.f6336y = false;
    }

    public final void w() {
        p(false);
        this.f6314b.c();
        p(false);
        j1.b bVar = this.M;
        if (bVar.f8610c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f8609b.f8606d.f0(j1.m.f8646c);
            bVar.f8610c = false;
        }
        bVar.b();
        if (bVar.f8611d.f6400a != 0) {
            n.a("Missed recording an endGroup()");
        }
        if (!this.f6321i.isEmpty()) {
            n.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f6334w = this.f6335x.c() != 0;
    }

    public final void x(boolean z2, k0 k0Var) {
        this.f6321i.add(this.j);
        this.j = k0Var;
        int i10 = this.f6323l;
        n0 n0Var = this.f6325n;
        n0Var.d(i10);
        n0Var.d(this.f6324m);
        n0Var.d(this.f6322k);
        if (z2) {
            this.f6322k = 0;
        }
        this.f6323l = 0;
        this.f6324m = 0;
    }

    public final void y() {
        i1.h hVar = new i1.h();
        if (this.C) {
            hVar.e();
        }
        if (this.f6314b.d()) {
            hVar.D = new q.v();
        }
        this.H = hVar;
        i1.k kVarX = hVar.x();
        kVarX.e(true);
        this.I = kVarX;
    }

    public final u1.e z() {
        j0 j0Var = this.U;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(this.f6320h);
        this.U = j0Var2;
        return j0Var2;
    }
}
