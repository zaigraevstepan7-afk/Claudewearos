package v2;

import c1.s3;
import f1.r2;
import java.util.List;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements f1.i, s1, h {

    /* renamed from: k0, reason: collision with root package name */
    public static final a0 f17619k0 = new a0("Undefined intrinsics block and it is required");

    /* renamed from: l0, reason: collision with root package name */
    public static final z f17620l0 = new z();

    /* renamed from: m0, reason: collision with root package name */
    public static final bk.b f17621m0 = new bk.b(6);
    public f0 A;
    public int B;
    public final qh.c C;
    public g1.e D;
    public boolean E;
    public f0 F;
    public r1 G;
    public v3.w H;
    public int I;
    public boolean J;
    public boolean K;
    public d3.n L;
    public boolean M;
    public final g1.e N;
    public boolean O;
    public t2.q0 P;
    public q5.b Q;
    public s3.c R;
    public s3.m S;
    public h2 T;
    public f1.u U;
    public d0 V;
    public d0 W;
    public boolean X;
    public final b1 Y;
    public final j0 Z;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17622a;

    /* renamed from: a0, reason: collision with root package name */
    public t2.m0 f17623a0;

    /* renamed from: b, reason: collision with root package name */
    public int f17624b;

    /* renamed from: b0, reason: collision with root package name */
    public i1 f17625b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17626c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f17627c0;

    /* renamed from: d, reason: collision with root package name */
    public long f17628d;

    /* renamed from: d0, reason: collision with root package name */
    public v1.o f17629d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17630e;

    /* renamed from: e0, reason: collision with root package name */
    public v1.o f17631e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17632f;

    /* renamed from: f0, reason: collision with root package name */
    public v3.c f17633f0;

    /* renamed from: g0, reason: collision with root package name */
    public p2.e0 f17634g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17635h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f17636i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f17637j0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17638z;

    public f0(int i10) {
        this((i10 & 1) == 0, d3.p.f4762a.addAndGet(1));
    }

    public static void T(f0 f0Var, boolean z2, int i10) {
        f0 f0VarU;
        if ((i10 & 1) != 0) {
            z2 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 4) != 0;
        if (f0Var.A == null) {
            s2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        r1 r1Var = f0Var.G;
        if (r1Var == null || f0Var.J || f0Var.f17622a) {
            return;
        }
        ((w2.t) r1Var).D(f0Var, true, z2, z10);
        if (z11) {
            r0 r0Var = f0Var.Z.f17704q;
            fj.l.c(r0Var);
            j0 j0Var = r0Var.f17748f;
            f0 f0VarU2 = j0Var.f17689a.u();
            d0 d0Var = j0Var.f17689a.V;
            if (f0VarU2 == null || d0Var == d0.f17604c) {
                return;
            }
            while (f0VarU2.V == d0Var && (f0VarU = f0VarU2.u()) != null) {
                f0VarU2 = f0VarU;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                if (f0VarU2.A != null) {
                    T(f0VarU2, z2, 6);
                    return;
                } else {
                    V(f0VarU2, z2, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (f0VarU2.A != null) {
                f0VarU2.S(z2);
            } else {
                f0VarU2.U(z2);
            }
        }
    }

    public static void V(f0 f0Var, boolean z2, int i10) {
        r1 r1Var;
        f0 f0VarU;
        if ((i10 & 1) != 0) {
            z2 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 4) != 0;
        if (f0Var.J || f0Var.f17622a || (r1Var = f0Var.G) == null) {
            return;
        }
        ((w2.t) r1Var).D(f0Var, false, z2, z10);
        if (z11) {
            j0 j0Var = f0Var.Z.f17703p.f17793f;
            f0 f0VarU2 = j0Var.f17689a.u();
            d0 d0Var = j0Var.f17689a.V;
            if (f0VarU2 == null || d0Var == d0.f17604c) {
                return;
            }
            while (f0VarU2.V == d0Var && (f0VarU = f0VarU2.u()) != null) {
                f0VarU2 = f0VarU;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                V(f0VarU2, z2, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                f0VarU2.U(z2);
            }
        }
    }

    public static void W(f0 f0Var) {
        j0 j0Var = f0Var.Z;
        if (e0.f17615a[j0Var.f17692d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + j0Var.f17692d);
        }
        if (j0Var.f17693e) {
            T(f0Var, true, 6);
            return;
        }
        if (j0Var.f17694f) {
            f0Var.S(true);
        }
        if (f0Var.q()) {
            V(f0Var, true, 6);
        } else if (f0Var.p()) {
            f0Var.U(true);
        }
    }

    private final String j(f0 f0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(f0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        f0 f0Var2 = f0Var.F;
        sb2.append(f0Var2 != null ? f0Var2.g(0) : null);
        return sb2.toString();
    }

    public final void A(int i10, f0 f0Var) {
        if (f0Var.F != null && f0Var.G != null) {
            s2.a.b(j(f0Var));
        }
        f0Var.F = this;
        qh.c cVar = this.C;
        ((g1.e) cVar.f13507b).a(i10, f0Var);
        ((a2.f0) cVar.f13508c).a();
        O();
        if (f0Var.f17622a) {
            this.B++;
        }
        F();
        r1 r1Var = this.G;
        if (r1Var != null) {
            f0Var.d(r1Var);
        }
        if (f0Var.Z.f17699l > 0) {
            j0 j0Var = this.Z;
            j0Var.d(j0Var.f17699l + 1);
        }
        if (f0Var.f17636i0 > 0) {
            a0(this.f17636i0 + 1);
        }
    }

    public final void B() {
        if (this.f17627c0) {
            b1 b1Var = this.Y;
            i1 i1Var = b1Var.f17583c;
            i1 i1Var2 = b1Var.f17584d.J;
            this.f17625b0 = null;
            while (true) {
                if (fj.l.b(i1Var, i1Var2)) {
                    break;
                }
                if ((i1Var != null ? i1Var.f17688e0 : null) != null) {
                    this.f17625b0 = i1Var;
                    break;
                }
                i1Var = i1Var != null ? i1Var.J : null;
            }
            this.f17627c0 = false;
        }
        i1 i1Var3 = this.f17625b0;
        if (i1Var3 != null && i1Var3.f17688e0 == null) {
            throw t.m1.e("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (i1Var3 != null) {
            i1Var3.D1();
            return;
        }
        f0 f0VarU = u();
        if (f0VarU != null) {
            f0VarU.B();
            return;
        }
        r1 r1Var = this.G;
        if (r1Var != null) {
            ((w2.t) r1Var).invalidate();
        }
    }

    public final void C() {
        b1 b1Var = this.Y;
        i1 i1Var = b1Var.f17584d;
        s sVar = b1Var.f17583c;
        while (i1Var != sVar) {
            fj.l.d(i1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) i1Var;
            q1 q1Var = yVar.f17688e0;
            if (q1Var != null) {
                q1Var.invalidate();
            }
            i1Var = yVar.I;
        }
        q1 q1Var2 = b1Var.f17583c.f17688e0;
        if (q1Var2 != null) {
            q1Var2.invalidate();
        }
    }

    public final void D() {
        if (this.f17622a) {
            f0 f0VarU = u();
            if (f0VarU != null) {
                f0VarU.D();
                return;
            }
            return;
        }
        if (this.A != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void E() {
        if (this.M) {
            return;
        }
        if (this.Y.f17582b.f17570f != null || this.f17631e0 != null) {
            this.K = true;
            return;
        }
        d3.n nVar = this.L;
        this.M = true;
        fj.v vVar = new fj.v();
        vVar.f6807a = new d3.n();
        t1 snapshotObserver = ((w2.t) i0.a(this)).getSnapshotObserver();
        a2.d0 d0Var = new a2.d0(this, vVar, 14);
        snapshotObserver.f17770a.c(this, snapshotObserver.f17773d, d0Var);
        this.M = false;
        this.L = (d3.n) vVar.f6807a;
        this.K = false;
        w2.t tVar = (w2.t) i0.a(this);
        tVar.getSemanticsOwner().b(this, nVar);
        tVar.F();
    }

    public final void F() {
        f0 f0Var;
        if (this.B > 0) {
            this.E = true;
        }
        if (!this.f17622a || (f0Var = this.F) == null) {
            return;
        }
        f0Var.F();
    }

    public final boolean G() {
        return this.G != null;
    }

    public final boolean H() {
        return this.Z.f17703p.L;
    }

    public final Boolean I() {
        r0 r0Var = this.Z.f17704q;
        if (r0Var != null) {
            return Boolean.valueOf(r0Var.J != p0.f17741c);
        }
        return null;
    }

    public final void J() {
        f0 f0VarU;
        if (this.V == d0.f17604c) {
            f();
        }
        r0 r0Var = this.Z.f17704q;
        fj.l.c(r0Var);
        boolean z2 = true;
        try {
            r0Var.f17749z = true;
            if (!r0Var.E) {
                s2.a.b("replace() called on item that was not placed");
            }
            r0Var.U = false;
            if (r0Var.J == p0.f17741c) {
                z2 = false;
            }
            r0Var.b1(r0Var.H, r0Var.I);
            if (z2 && !r0Var.U && (f0VarU = r0Var.f17748f.f17689a.u()) != null) {
                f0VarU.S(false);
            }
            r0Var.f17749z = false;
        } catch (Throwable th2) {
            r0Var.f17749z = false;
            throw th2;
        }
    }

    public final void K(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            qh.c cVar = this.C;
            g1.e eVar = (g1.e) cVar.f13507b;
            a2.f0 f0Var = (a2.f0) cVar.f13508c;
            Object objL = eVar.l(i14);
            f0Var.a();
            ((g1.e) cVar.f13507b).a(i15, (f0) objL);
            f0Var.a();
        }
        O();
        F();
        D();
    }

    public final void L(f0 f0Var) {
        if (f0Var.Z.f17699l > 0) {
            this.Z.d(r0.f17699l - 1);
        }
        if (this.G != null) {
            f0Var.h();
        }
        f0Var.F = null;
        if (f0Var.f17636i0 > 0) {
            a0(this.f17636i0 - 1);
        }
        f0Var.Y.f17584d.J = null;
        if (f0Var.f17622a) {
            this.B--;
            g1.e eVar = (g1.e) f0Var.C.f13507b;
            Object[] objArr = eVar.f7024a;
            int i10 = eVar.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((f0) objArr[i11]).Y.f17584d.J = null;
            }
        }
        F();
        O();
    }

    @Override // v2.s1
    public final boolean M() {
        return G();
    }

    public final void N(i1 i1Var) {
        r1 r1Var = this.G;
        e3.b rectManager = r1Var != null ? ((w2.t) r1Var).getRectManager() : null;
        j0 j0Var = this.Z;
        int i10 = 0;
        boolean z2 = j0Var.f17692d != b0.f17579e || q() || p();
        if (this.f17638z && rectManager != null) {
            if (i1Var == this.Y.f17584d) {
                this.f17632f = true;
                if (!z2) {
                    rectManager.e(this);
                }
            } else {
                this.f17630e = true;
                g1.e eVarY = y();
                Object[] objArr = eVarY.f7024a;
                int i11 = eVarY.f7026c;
                for (int i12 = 0; i12 < i11; i12++) {
                    f0 f0Var = (f0) objArr[i12];
                    f0Var.f17632f = true;
                    if (!z2) {
                        rectManager.e(f0Var);
                    }
                }
                if (this.f17638z) {
                    rectManager.f5755e = true;
                    ak.x xVar = rectManager.f5752b;
                    int i13 = this.f17624b & 33554431;
                    long[] jArr = (long[]) xVar.f743c;
                    int i14 = xVar.f742b;
                    while (true) {
                        if (i10 >= jArr.length - 2 || i10 >= i14) {
                            break;
                        }
                        int i15 = i10 + 2;
                        long j = jArr[i15];
                        if ((((int) j) & 33554431) == i13) {
                            jArr[i15] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i10 += 3;
                    }
                }
                rectManager.h();
            }
        }
        j0Var.f17703p.d1();
    }

    public final void O() {
        if (!this.f17622a) {
            this.O = true;
            return;
        }
        f0 f0VarU = u();
        if (f0VarU != null) {
            f0VarU.O();
        }
    }

    public final void P() {
        qh.c cVar = this.C;
        g1.e eVar = (g1.e) cVar.f13507b;
        g1.e eVar2 = (g1.e) cVar.f13507b;
        int i10 = eVar.f7026c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.h();
                ((a2.f0) cVar.f13508c).a();
                return;
            }
            L((f0) eVar2.f7024a[i10]);
        }
    }

    public final void Q(int i10, int i11) {
        if (i11 < 0) {
            s2.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            qh.c cVar = this.C;
            L((f0) ((g1.e) cVar.f13507b).f7024a[i12]);
            Object objL = ((g1.e) cVar.f13507b).l(i12);
            ((a2.f0) cVar.f13508c).a();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    public final void R() {
        f0 f0VarU;
        if (this.V == d0.f17604c) {
            f();
        }
        v0 v0Var = this.Z.f17703p;
        j0 j0Var = v0Var.f17793f;
        try {
            v0Var.f17794z = true;
            if (!v0Var.D) {
                s2.a.b("replace called on unplaced item");
            }
            boolean z2 = v0Var.L;
            v0Var.Z0(v0Var.G, v0Var.I, v0Var.H);
            if (z2 && !v0Var.Y && (f0VarU = j0Var.f17689a.u()) != null) {
                f0VarU.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z2) {
        r1 r1Var;
        if (this.f17622a || (r1Var = this.G) == null) {
            return;
        }
        ((w2.t) r1Var).E(this, true, z2);
    }

    public final void U(boolean z2) {
        r1 r1Var;
        if (this.f17622a || (r1Var = this.G) == null) {
            return;
        }
        ((w2.t) r1Var).E(this, false, z2);
    }

    public final void X() {
        g1.e eVarY = y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            d0 d0Var = f0Var.W;
            f0Var.V = d0Var;
            if (d0Var != d0.f17604c) {
                f0Var.X();
            }
        }
    }

    public final void Y(Throwable th2) {
        f1.u uVar = this.U;
        r2 r2Var = u1.g.f16572a;
        p1.i iVar = (p1.i) uVar;
        iVar.getClass();
        u1.f fVar = (u1.f) f1.s.H(iVar, r2Var);
        if (fVar == null) {
            throw th2;
        }
        u1.d.h(th2, new s3(25, fVar, this));
        throw th2;
    }

    public final void Z(s3.c cVar) {
        if (fj.l.b(this.R, cVar)) {
            return;
        }
        this.R = cVar;
        D();
        f0 f0VarU = u();
        if (f0VarU != null) {
            f0VarU.B();
        } else {
            r1 r1Var = this.G;
            if (r1Var != null) {
                ((w2.t) r1Var).invalidate();
            }
        }
        C();
        for (v1.n nVar = this.Y.f17586f; nVar != null; nVar = nVar.f17570f) {
            nVar.l();
        }
    }

    @Override // f1.i
    public final void a() {
        v3.w wVar = this.H;
        if (wVar != null) {
            wVar.a();
        }
        t2.m0 m0Var = this.f17623a0;
        if (m0Var != null) {
            m0Var.a();
        }
        b1 b1Var = this.Y;
        i1 i1Var = b1Var.f17583c.I;
        for (i1 i1Var2 = b1Var.f17584d; !fj.l.b(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.I) {
            i1Var2.I1();
        }
    }

    public final void a0(int i10) {
        f0 f0VarU;
        f0 f0VarU2;
        int i11 = this.f17636i0;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (f0VarU2 = u()) != null) {
                f0VarU2.a0(f0VarU2.f17636i0 + 1);
            }
            if (i10 == 0 && this.f17636i0 > 0 && (f0VarU = u()) != null) {
                f0VarU.a0(f0VarU.f17636i0 - 1);
            }
            this.f17636i0 = i10;
        }
    }

    @Override // f1.i
    public final void b() {
        w1.c cVar;
        v3.w wVar = this.H;
        if (wVar != null) {
            wVar.b();
        }
        t2.m0 m0Var = this.f17623a0;
        if (m0Var != null) {
            m0Var.i(true);
        }
        this.f17637j0 = true;
        v1.n nVar = this.Y.f17585e;
        for (v1.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f17569e) {
            if (nVar2.G) {
                nVar2.l1();
            }
        }
        for (v1.n nVar3 = nVar; nVar3 != null; nVar3 = nVar3.f17569e) {
            if (nVar3.G) {
                nVar3.n1();
            }
        }
        while (nVar != null) {
            if (nVar.G) {
                nVar.h1();
            }
            nVar = nVar.f17569e;
        }
        if (G()) {
            this.L = null;
            this.K = false;
        }
        r1 r1Var = this.G;
        if (r1Var == null || (cVar = ((w2.t) r1Var).f18402j0) == null || !cVar.A.f(this.f17624b)) {
            return;
        }
        cVar.f18168a.u(cVar.f18170c, this.f17624b, false);
    }

    public final void b0(f0 f0Var) {
        if (fj.l.b(f0Var, this.A)) {
            return;
        }
        this.A = f0Var;
        j0 j0Var = this.Z;
        if (f0Var != null) {
            if (j0Var.f17704q == null) {
                j0Var.f17704q = new r0(j0Var);
            }
            b1 b1Var = this.Y;
            i1 i1Var = b1Var.f17583c.I;
            for (i1 i1Var2 = b1Var.f17584d; !fj.l.b(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.I) {
                i1Var2.r1();
            }
        } else {
            j0Var.f17704q = null;
            j0Var.f17694f = false;
            j0Var.f17693e = false;
        }
        D();
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [v1.n, v2.i1] */
    public final void c(v1.o oVar) {
        ?? r72;
        b1 b1Var;
        a1 a1Var;
        g1.e eVar;
        boolean z2;
        boolean z10;
        boolean z11;
        g1.e eVar2;
        boolean z12;
        c2.x0 x0Var;
        b1 b1Var2 = this.Y;
        boolean zD = b1Var2.d(16);
        v1.n nVar = b1Var2.f17585e;
        boolean zD2 = b1Var2.d(1024);
        this.f17629d0 = oVar;
        s sVar = b1Var2.f17583c;
        f0 f0Var = b1Var2.f17581a;
        v1.n nVar2 = b1Var2.f17586f;
        a1 a1Var2 = b1Var2.f17582b;
        if (nVar2 == a1Var2) {
            s2.a.b("padChain called on already padded chain");
        }
        v1.n nVar3 = b1Var2.f17586f;
        nVar3.f17569e = a1Var2;
        a1Var2.f17570f = nVar3;
        g1.e eVar3 = b1Var2.f17587g;
        int i10 = eVar3 != null ? eVar3.f7026c : 0;
        g1.e eVar4 = b1Var2.f17588h;
        if (eVar4 == null) {
            eVar4 = new g1.e(new v1.m[16]);
        }
        g1.e eVar5 = b1Var2.f17589i;
        eVar5.b(oVar);
        c2.x0 x0Var2 = null;
        while (true) {
            int i11 = eVar5.f7026c;
            if (i11 == 0) {
                break;
            }
            v1.o oVar2 = (v1.o) eVar5.l(i11 - 1);
            if (oVar2 instanceof v1.i) {
                v1.i iVar = (v1.i) oVar2;
                eVar5.b(iVar.f17561c);
                eVar5.b(iVar.f17560b);
            } else if (oVar2 instanceof v1.m) {
                eVar4.b(oVar2);
            } else {
                if (x0Var2 == null) {
                    x0Var = new c2.x0(eVar4, 16);
                    x0Var2 = x0Var;
                } else {
                    x0Var = x0Var2;
                }
                oVar2.a(x0Var);
            }
        }
        int i12 = eVar4.f7026c;
        if (i12 == i10) {
            v1.n nVar4 = a1Var2.f17570f;
            int i13 = 0;
            while (nVar4 != null && i13 < i10) {
                if (eVar3 == null) {
                    throw t.m1.e("expected prior modifier list to be non-empty");
                }
                v1.m mVar = (v1.m) eVar3.f7024a[i13];
                v1.m mVar2 = (v1.m) eVar4.f7024a[i13];
                if (fj.l.b(mVar, mVar2)) {
                    eVar2 = eVar3;
                    z12 = 2;
                } else {
                    eVar2 = eVar3;
                    z12 = mVar.getClass() == mVar2.getClass();
                }
                if (!z12) {
                    nVar4 = nVar4.f17569e;
                    break;
                }
                if (z12) {
                    b1.h(mVar, mVar2, nVar4);
                }
                nVar4 = nVar4.f17570f;
                i13++;
                eVar3 = eVar2;
            }
            eVar2 = eVar3;
            if (i13 >= i10) {
                b1Var2 = b1Var2;
                eVar3 = eVar2;
                z10 = false;
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar4;
                z2 = false;
                r72 = z10;
            } else {
                if (eVar2 == null) {
                    throw t.m1.e("expected prior modifier list to be non-empty");
                }
                if (nVar4 == null) {
                    throw t.m1.e("structuralUpdate requires a non-null tail");
                }
                boolean z13 = f0Var.f17631e0 != null;
                v1.n nVar5 = nVar4;
                b1Var = b1Var2;
                eVar = eVar4;
                eVar3 = eVar2;
                z11 = false;
                b1Var.f(i13, eVar3, eVar, nVar5, !z13);
                a1Var = a1Var2;
                z2 = true;
                r72 = z11;
            }
        } else {
            r72 = 0;
            z11 = false;
            z10 = false;
            v1.o oVar3 = f0Var.f17631e0;
            if (oVar3 != null && i10 == 0) {
                v1.n nVarB = a1Var2;
                for (int i14 = 0; i14 < eVar4.f7026c; i14++) {
                    nVarB = b1.b((v1.m) eVar4.f7024a[i14], nVarB);
                }
                int i15 = 0;
                for (v1.n nVar6 = nVar.f17569e; nVar6 != null && nVar6 != a1Var2; nVar6 = nVar6.f17569e) {
                    i15 |= nVar6.f17567c;
                    nVar6.f17568d = i15;
                }
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar4;
                z2 = true;
                r72 = z11;
            } else if (i12 != 0) {
                if (eVar3 == null) {
                    eVar3 = new g1.e(new v1.m[16]);
                }
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar4;
                b1Var.f(0, eVar3, eVar, a1Var, !(oVar3 != null));
                z2 = true;
            } else {
                if (eVar3 == null) {
                    throw t.m1.e("expected prior modifier list to be non-empty");
                }
                v1.n nVar7 = a1Var2.f17570f;
                for (int i16 = 0; nVar7 != null && i16 < eVar3.f7026c; i16++) {
                    nVar7 = b1.c(nVar7).f17570f;
                }
                f0 f0VarU = f0Var.u();
                sVar.J = f0VarU != null ? f0VarU.Y.f17583c : null;
                b1Var2.f17584d = sVar;
                b1Var = b1Var2;
                a1Var = a1Var2;
                eVar = eVar4;
                z2 = false;
                r72 = z10;
            }
        }
        b1Var.f17587g = eVar;
        if (eVar3 != null) {
            eVar3.h();
        } else {
            eVar3 = r72;
        }
        b1Var.f17588h = eVar3;
        v1.n nVar8 = a1Var.f17570f;
        if (nVar8 != null) {
            nVar = nVar8;
        }
        nVar.f17569e = r72;
        a1Var.f17570f = r72;
        a1Var.f17568d = -1;
        a1Var.A = r72;
        if (nVar == a1Var) {
            s2.a.b("trimChain did not update the head");
        }
        b1Var.f17586f = nVar;
        if (z2) {
            b1Var.g();
        }
        boolean zD3 = b1Var.d(16);
        boolean zD4 = b1Var.d(1024);
        this.Z.j();
        if (this.A == null && b1Var.d(512)) {
            b0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        e3.b rectManager = ((w2.t) i0.a(this)).getRectManager();
        rectManager.getClass();
        if (G()) {
            ak.x xVar = rectManager.f5752b;
            int i17 = this.f17624b & 33554431;
            long[] jArr = (long[]) xVar.f743c;
            int i18 = xVar.f742b;
            for (int i19 = 0; i19 < jArr.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                long j = jArr[i20];
                if ((((int) j) & 33554431) == i17) {
                    jArr[i20] = ((zD3 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j) | ((zD4 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    public final void c0(t2.q0 q0Var) {
        if (fj.l.b(this.P, q0Var)) {
            return;
        }
        this.P = q0Var;
        q5.b bVar = this.Q;
        if (bVar != null) {
            ((f1.j1) bVar.f13236c).setValue(q0Var);
        }
        D();
    }

    public final void d(r1 r1Var) {
        f0 f0Var;
        d3.n nVarW;
        if (this.G != null) {
            s2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        f0 f0Var2 = this.F;
        if (f0Var2 != null && !fj.l.b(f0Var2.G, r1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(r1Var);
            sb2.append(") than the parent's owner(");
            f0 f0VarU = u();
            sb2.append(f0VarU != null ? f0VarU.G : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            f0 f0Var3 = this.F;
            sb2.append(f0Var3 != null ? f0Var3.g(0) : null);
            s2.a.b(sb2.toString());
        }
        f0 f0VarU2 = u();
        j0 j0Var = this.Z;
        if (f0VarU2 == null) {
            j0Var.f17703p.L = true;
            ((w2.t) r1Var).getRectManager().e(this);
            r0 r0Var = j0Var.f17704q;
            if (r0Var != null) {
                r0Var.J = p0.f17739a;
            }
        }
        b1 b1Var = this.Y;
        b1Var.f17584d.J = f0VarU2 != null ? f0VarU2.Y.f17583c : null;
        this.G = r1Var;
        this.I = (f0VarU2 != null ? f0VarU2.I : -1) + 1;
        v1.o oVar = this.f17631e0;
        if (oVar != null) {
            c(oVar);
        }
        this.f17631e0 = null;
        w2.t tVar = (w2.t) r1Var;
        tVar.getLayoutNodes().i(this.f17624b, this);
        f0 f0Var4 = this.F;
        if (f0Var4 == null || (f0Var = f0Var4.A) == null) {
            f0Var = this.A;
        }
        b0(f0Var);
        if (this.A == null && b1Var.d(512)) {
            b0(this);
        }
        if (!this.f17637j0) {
            for (v1.n nVar = b1Var.f17586f; nVar != null; nVar = nVar.f17570f) {
                nVar.g1();
            }
        }
        g1.e eVar = (g1.e) this.C.f13507b;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).d(r1Var);
        }
        if (!this.f17637j0) {
            b1Var.e();
        }
        D();
        if (f0VarU2 != null) {
            f0VarU2.D();
        }
        v3.c cVar = this.f17633f0;
        if (cVar != null) {
            cVar.invoke(r1Var);
        }
        j0Var.j();
        if (!this.f17637j0 && b1Var.d(8)) {
            E();
        }
        w1.c cVar2 = tVar.f18402j0;
        if (cVar2 == null || (nVarW = w()) == null || !nVarW.f4758a.b(d3.v.f4792r)) {
            return;
        }
        cVar2.A.a(this.f17624b);
        cVar2.f18168a.u(cVar2.f18170c, this.f17624b, true);
    }

    public final void d0(v1.o oVar) {
        if (this.f17622a && this.f17629d0 != v1.l.f17564b) {
            s2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f17637j0) {
            s2.a.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.f17631e0 = oVar;
            return;
        }
        c(oVar);
        if (this.K) {
            E();
        }
    }

    public final void e() {
        this.W = this.V;
        this.V = d0.f17604c;
        g1.e eVarY = y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.V != d0.f17604c) {
                f0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void e0(h2 h2Var) {
        if (fj.l.b(this.T, h2Var)) {
            return;
        }
        this.T = h2Var;
        v1.n nVar = this.Y.f17586f;
        if ((nVar.f17568d & 16) != 0) {
            while (nVar != null) {
                if ((nVar.f17567c & 16) != 0) {
                    k kVarE = nVar;
                    ?? eVar = 0;
                    while (kVarE != 0) {
                        if (kVarE instanceof w1) {
                            ((w1) kVarE).U0();
                        } else if ((kVarE.f17567c & 16) != 0 && (kVarE instanceof k)) {
                            v1.n nVar2 = kVarE.I;
                            int i10 = 0;
                            kVarE = kVarE;
                            eVar = eVar;
                            while (nVar2 != null) {
                                if ((nVar2.f17567c & 16) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        kVarE = nVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new g1.e(new v1.n[16]);
                                        }
                                        if (kVarE != 0) {
                                            eVar.b(kVarE);
                                            kVarE = 0;
                                        }
                                        eVar.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f17570f;
                                kVarE = kVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        kVarE = n.e(eVar);
                    }
                }
                if ((nVar.f17568d & 16) == 0) {
                    return;
                } else {
                    nVar = nVar.f17570f;
                }
            }
        }
    }

    public final void f() {
        this.W = this.V;
        this.V = d0.f17604c;
        g1.e eVarY = y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.V == d0.f17603b) {
                f0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.B <= 0 || !this.E) {
            return;
        }
        this.E = false;
        g1.e eVar = this.D;
        if (eVar == null) {
            eVar = new g1.e(new f0[16]);
            this.D = eVar;
        }
        eVar.h();
        g1.e eVar2 = (g1.e) this.C.f13507b;
        Object[] objArr = eVar2.f7024a;
        int i10 = eVar2.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.f17622a) {
                eVar.c(eVar.f7026c, f0Var.y());
            } else {
                eVar.b(f0Var);
            }
        }
        j0 j0Var = this.Z;
        j0Var.f17703p.S = true;
        r0 r0Var = j0Var.f17704q;
        if (r0Var != null) {
            r0Var.M = true;
        }
    }

    public final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        g1.e eVarY = y();
        Object[] objArr = eVarY.f7024a;
        int i12 = eVarY.f7026c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(((f0) objArr[i13]).g(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        fj.l.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void h() {
        g0 g0Var;
        r1 r1Var = this.G;
        if (r1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            f0 f0VarU = u();
            sb2.append(f0VarU != null ? f0VarU.g(0) : null);
            s2.a.c(sb2.toString());
            throw new b3.e();
        }
        f0 f0VarU2 = u();
        j0 j0Var = this.Z;
        if (f0VarU2 != null) {
            f0VarU2.B();
            f0VarU2.D();
            v0 v0Var = j0Var.f17703p;
            d0 d0Var = d0.f17604c;
            v0Var.E = d0Var;
            r0 r0Var = j0Var.f17704q;
            if (r0Var != null) {
                r0Var.C = d0Var;
            }
        }
        g0 g0Var2 = j0Var.f17703p.Q;
        g0Var2.f17653b = true;
        g0Var2.f17654c = false;
        g0Var2.f17656e = false;
        g0Var2.f17655d = false;
        g0Var2.f17657f = false;
        g0Var2.f17658g = false;
        g0Var2.f17659h = null;
        r0 r0Var2 = j0Var.f17704q;
        if (r0Var2 != null && (g0Var = r0Var2.K) != null) {
            g0Var.f17653b = true;
            g0Var.f17654c = false;
            g0Var.f17656e = false;
            g0Var.f17655d = false;
            g0Var.f17657f = false;
            g0Var.f17658g = false;
            g0Var.f17659h = null;
        }
        b1 b1Var = this.Y;
        v1.n nVar = b1Var.f17585e;
        i1 i1Var = b1Var.f17583c.I;
        for (i1 i1Var2 = b1Var.f17584d; !fj.l.b(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.I) {
            i1Var2.O1();
            if (i1Var2.H.H()) {
                i1Var2.J1();
            }
        }
        p2.e0 e0Var = this.f17634g0;
        if (e0Var != null) {
            e0Var.invoke(r1Var);
        }
        for (v1.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f17569e) {
            if (nVar2.G) {
                nVar2.n1();
            }
        }
        this.J = true;
        g1.e eVar = (g1.e) this.C.f13507b;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).h();
        }
        this.J = false;
        while (nVar != null) {
            if (nVar.G) {
                nVar.h1();
            }
            nVar = nVar.f17569e;
        }
        w2.t tVar = (w2.t) r1Var;
        tVar.getLayoutNodes().g(this.f17624b);
        t0 t0Var = tVar.f18411s0;
        p1.l lVar = t0Var.f17762b;
        ((p7.k) lVar.f12660b).k(this);
        ((p7.k) lVar.f12661c).k(this);
        ((p7.k) lVar.f12662d).k(this);
        ((g1.e) t0Var.f17765e.f13235b).k(this);
        tVar.f18403k0 = true;
        w1.c cVar = tVar.f18402j0;
        if (cVar != null && cVar.A.f(this.f17624b)) {
            cVar.f18168a.u(cVar.f18170c, this.f17624b, false);
        }
        tVar.getRectManager().f(this);
        this.G = null;
        b0(null);
        this.I = 0;
        v0 v0Var2 = j0Var.f17703p;
        v0Var2.B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        v0Var2.A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        v0Var2.L = false;
        r0 r0Var3 = j0Var.f17704q;
        if (r0Var3 != null) {
            r0Var3.B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            r0Var3.A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            r0Var3.J = p0.f17741c;
        }
        if (b1Var.d(8)) {
            d3.n nVar3 = this.L;
            this.L = null;
            this.K = false;
            tVar.getSemanticsOwner().b(this, nVar3);
            tVar.F();
        }
    }

    public final void i(c2.u uVar, f2.b bVar) {
        try {
            this.Y.f17584d.p1(uVar, bVar);
        } catch (Throwable th2) {
            Y(th2);
            throw null;
        }
    }

    public final void k() {
        if (this.A != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        v0 v0Var = this.Z.f17703p;
        s3.a aVar = v0Var.C ? new s3.a(v0Var.f15553d) : null;
        if (aVar != null) {
            r1 r1Var = this.G;
            if (r1Var != null) {
                ((w2.t) r1Var).y(this, aVar.f14736a);
                return;
            }
            return;
        }
        r1 r1Var2 = this.G;
        if (r1Var2 != null) {
            ((w2.t) r1Var2).x(true);
        }
    }

    public final List l() {
        r0 r0Var = this.Z.f17704q;
        fj.l.c(r0Var);
        g1.e eVar = r0Var.L;
        j0 j0Var = r0Var.f17748f;
        j0Var.f17689a.n();
        if (!r0Var.M) {
            return eVar.g();
        }
        f0 f0Var = j0Var.f17689a;
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (eVar.f7026c <= i11) {
                r0 r0Var2 = f0Var2.Z.f17704q;
                fj.l.c(r0Var2);
                eVar.b(r0Var2);
            } else {
                r0 r0Var3 = f0Var2.Z.f17704q;
                fj.l.c(r0Var3);
                Object[] objArr2 = eVar.f7024a;
                Object obj = objArr2[i11];
                objArr2[i11] = r0Var3;
            }
        }
        eVar.m(((g1.e) ((g1.b) f0Var.n()).f7016b).f7026c, eVar.f7026c);
        r0Var.M = false;
        return eVar.g();
    }

    public final List m() {
        return this.Z.f17703p.O0();
    }

    public final List n() {
        return y().g();
    }

    public final List o() {
        return ((g1.e) this.C.f13507b).g();
    }

    public final boolean p() {
        return this.Z.f17703p.O;
    }

    public final boolean q() {
        return this.Z.f17703p.N;
    }

    public final d0 r() {
        return this.Z.f17703p.E;
    }

    public final d0 s() {
        d0 d0Var;
        r0 r0Var = this.Z.f17704q;
        return (r0Var == null || (d0Var = r0Var.C) == null) ? d0.f17604c : d0Var;
    }

    public final q5.b t() {
        q5.b bVar = this.Q;
        if (bVar != null) {
            return bVar;
        }
        q5.b bVar2 = new q5.b(this, this.P);
        this.Q = bVar2;
        return bVar2;
    }

    public final String toString() {
        return w2.f0.t(this) + " children: " + ((g1.e) ((g1.b) n()).f7016b).f7026c + " measurePolicy: " + this.P + " deactivated: " + this.f17637j0;
    }

    public final f0 u() {
        f0 f0Var = this.F;
        while (f0Var != null && f0Var.f17622a) {
            f0Var = f0Var.F;
        }
        return f0Var;
    }

    public final int v() {
        return this.Z.f17703p.B;
    }

    public final d3.n w() {
        if (G() && !this.f17637j0 && this.Y.d(8)) {
            return this.L;
        }
        return null;
    }

    public final g1.e x() {
        boolean z2 = this.O;
        g1.e eVar = this.N;
        if (z2) {
            eVar.h();
            eVar.c(eVar.f7026c, y());
            eVar.o(f17621m0);
            this.O = false;
        }
        return eVar;
    }

    public final g1.e y() {
        f0();
        if (this.B == 0) {
            return (g1.e) this.C.f13507b;
        }
        g1.e eVar = this.D;
        fj.l.c(eVar);
        return eVar;
    }

    public final void z(long j, q qVar, int i10, boolean z2) {
        b1 b1Var = this.Y;
        i1 i1Var = b1Var.f17584d;
        c2.t0 t0Var = i1.f17679f0;
        b1Var.f17584d.B1(i1.f17682i0, i1Var.t1(j), qVar, i10, z2);
    }

    public f0(boolean z2, int i10) {
        this.f17622a = z2;
        this.f17624b = i10;
        this.f17628d = 9223372034707292159L;
        this.f17630e = true;
        this.f17632f = true;
        this.C = new qh.c(11, new g1.e(new f0[16]), new a2.f0(this, 12));
        this.N = new g1.e(new f0[16]);
        this.O = true;
        this.P = f17619k0;
        this.R = i0.f17678a;
        this.S = s3.m.f14752a;
        this.T = f17620l0;
        f1.u.f6462k.getClass();
        this.U = f1.t.f6450b;
        d0 d0Var = d0.f17604c;
        this.V = d0Var;
        this.W = d0Var;
        this.Y = new b1(this);
        this.Z = new j0(this);
        this.f17627c0 = true;
        this.f17629d0 = v1.l.f17564b;
    }
}
