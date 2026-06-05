package v2;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 extends t2.f1 implements t2.p0, a, y0 {
    public boolean C;
    public boolean D;
    public boolean F;
    public ej.c H;
    public float I;
    public Object K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean T;
    public float X;
    public boolean Y;
    public ej.c Z;

    /* renamed from: b0, reason: collision with root package name */
    public float f17790b0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f17792d0;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f17793f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17794z;
    public int A = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public int B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public d0 E = d0.f17604c;
    public long G = 0;
    public boolean J = true;
    public final g0 Q = new g0(this, 0);
    public final g1.e R = new g1.e(new v0[16]);
    public boolean S = true;
    public long U = s3.b.b(0, 0, 0, 0, 15);
    public final u0 V = new u0(this, 1);
    public final u0 W = new u0(this, 0);

    /* renamed from: a0, reason: collision with root package name */
    public long f17789a0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final u0 f17791c0 = new u0(this, 2);

    public v0(j0 j0Var) {
        this.f17793f = j0Var;
    }

    @Override // v2.a
    public final s A() {
        return this.f17793f.f17689a.Y.f17583c;
    }

    @Override // v2.a
    public final a D() {
        j0 j0Var;
        f0 f0VarU = this.f17793f.f17689a.u();
        if (f0VarU == null || (j0Var = f0VarU.Z) == null) {
            return null;
        }
        return j0Var.f17703p;
    }

    @Override // t2.f1
    public final void G0(long j, float f10, ej.c cVar) {
        t2.e1 placementScope;
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        f0 f0Var2 = j0Var.f17689a;
        try {
            this.M = true;
            if (!s3.j.a(j, this.G) || cVar != this.H || this.f17792d0) {
                if (j0Var.f17698k || j0Var.j || this.f17792d0) {
                    this.O = true;
                    this.f17792d0 = false;
                }
            }
            r0 r0Var = j0Var.f17704q;
            if (r0Var != null) {
                j0 j0Var2 = r0Var.f17748f;
                if (r0Var.J == p0.f17741c && !n.s(j0Var2.f17689a)) {
                    j0Var2.f17691c = true;
                }
            }
            r0 r0Var2 = j0Var.f17704q;
            if (r0Var2 != null && r0Var2.O0()) {
                i1 i1Var = j0Var.a().J;
                if (i1Var == null || (placementScope = i1Var.E) == null) {
                    placementScope = ((w2.t) i0.a(f0Var2)).getPlacementScope();
                }
                r0 r0Var3 = j0Var.f17704q;
                fj.l.c(r0Var3);
                f0 f0VarU = f0Var2.u();
                if (f0VarU != null) {
                    f0VarU.Z.f17696h = 0;
                }
                r0Var3.B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                placementScope.z(r0Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            r0 r0Var4 = j0Var.f17704q;
            if (r0Var4 != null && !r0Var4.E) {
                s2.a.b("Error: Placement happened before lookahead.");
            }
            Z0(j, f10, cVar);
        } catch (Throwable th2) {
            f0Var.Y(th2);
            throw null;
        }
    }

    @Override // t2.p0
    public final int O(int i10) {
        j0 j0Var = this.f17793f;
        if (!n.s(j0Var.f17689a)) {
            U0();
            return j0Var.a().O(i10);
        }
        r0 r0Var = j0Var.f17704q;
        fj.l.c(r0Var);
        return r0Var.O(i10);
    }

    public final List O0() {
        j0 j0Var = this.f17793f;
        j0Var.f17689a.f0();
        boolean z2 = this.S;
        g1.e eVar = this.R;
        if (!z2) {
            return eVar.g();
        }
        f0 f0Var = j0Var.f17689a;
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (eVar.f7026c <= i11) {
                eVar.b(f0Var2.Z.f17703p);
            } else {
                v0 v0Var = f0Var2.Z.f17703p;
                Object[] objArr2 = eVar.f7024a;
                Object obj = objArr2[i11];
                objArr2[i11] = v0Var;
            }
        }
        eVar.m(((g1.e) ((g1.b) f0Var.n()).f7016b).f7026c, eVar.f7026c);
        this.S = false;
        return eVar.g();
    }

    public final void P0() {
        boolean z2 = this.L;
        this.L = true;
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        b1 b1Var = f0Var.Y;
        if (!z2) {
            b1Var.f17583c.H1();
            ((w2.t) i0.a(f0Var)).getRectManager().e(j0Var.f17689a);
            if (f0Var.q()) {
                f0.V(f0Var, true, 6);
            } else if (f0Var.Z.f17693e) {
                f0.T(f0Var, true, 6);
            }
        }
        i1 i1Var = b1Var.f17583c.I;
        for (i1 i1Var2 = b1Var.f17584d; !fj.l.b(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.I) {
            if (i1Var2.f17687d0) {
                i1Var2.D1();
            }
        }
        g1.e eVarY = f0Var.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.v() != Integer.MAX_VALUE) {
                f0Var2.Z.f17703p.P0();
                f0.W(f0Var2);
            }
        }
    }

    @Override // v2.a
    public final int Q() {
        return this.B;
    }

    public final void R0() {
        if (this.L) {
            this.L = false;
            j0 j0Var = this.f17793f;
            f0 f0Var = j0Var.f17689a;
            f0 f0Var2 = j0Var.f17689a;
            ((w2.t) i0.a(f0Var)).getRectManager().f(f0Var2);
            b1 b1Var = f0Var2.Y;
            i1 i1Var = b1Var.f17583c.I;
            for (i1 i1Var2 = b1Var.f17584d; !fj.l.b(i1Var2, i1Var) && i1Var2 != null; i1Var2 = i1Var2.I) {
                i1Var2.J1();
                i1Var2.O1();
            }
            g1.e eVarY = f0Var2.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((f0) objArr[i11]).Z.f17703p.R0();
            }
        }
    }

    public final void U0() {
        j0 j0Var = this.f17793f;
        f0.V(j0Var.f17689a, false, 7);
        f0 f0Var = j0Var.f17689a;
        f0 f0VarU = f0Var.u();
        if (f0VarU == null || f0Var.V != d0.f17604c) {
            return;
        }
        int iOrdinal = f0VarU.Z.f17692d.ordinal();
        f0Var.V = iOrdinal != 0 ? iOrdinal != 2 ? f0VarU.V : d0.f17603b : d0.f17602a;
    }

    @Override // t2.p0
    public final int V(int i10) {
        j0 j0Var = this.f17793f;
        if (!n.s(j0Var.f17689a)) {
            U0();
            return j0Var.a().V(i10);
        }
        r0 r0Var = j0Var.f17704q;
        fj.l.c(r0Var);
        return r0Var.V(i10);
    }

    public final void X0() {
        this.Y = true;
        j0 j0Var = this.f17793f;
        f0 f0VarU = j0Var.f17689a.u();
        float f10 = A().T;
        f0 f0Var = j0Var.f17689a;
        b1 b1Var = f0Var.Y;
        i1 i1Var = b1Var.f17584d;
        s sVar = b1Var.f17583c;
        while (i1Var != sVar) {
            fj.l.d(i1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            y yVar = (y) i1Var;
            f10 += yVar.T;
            i1Var = yVar.I;
        }
        if (f10 != this.X) {
            this.X = f10;
            if (f0VarU != null) {
                f0VarU.O();
            }
            if (f0VarU != null) {
                f0VarU.B();
            }
        }
        if (!A().D) {
            boolean z2 = this.L;
            if (!z2 || this.Q.d()) {
                P0();
            }
            if (z2) {
                f0Var.Y.f17583c.H1();
            } else {
                if (f0VarU != null) {
                    f0VarU.B();
                }
                if (this.f17794z && f0VarU != null) {
                    f0VarU.U(false);
                }
            }
        }
        if (f0VarU != null) {
            j0 j0Var2 = f0VarU.Z;
            if (!this.f17794z && j0Var2.f17692d == b0.f17577c) {
                if (this.B != Integer.MAX_VALUE) {
                    s2.a.b("Place was called on a node which was placed already");
                }
                int i10 = j0Var2.f17697i;
                this.B = i10;
                j0Var2.f17697i = i10 + 1;
            }
        } else {
            this.B = 0;
        }
        j0();
    }

    @Override // t2.p0
    public final t2.f1 Y(long j) {
        d0 d0Var;
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        d0 d0Var2 = f0Var.V;
        d0 d0Var3 = d0.f17604c;
        if (d0Var2 == d0Var3) {
            f0Var.e();
        }
        if (n.s(j0Var.f17689a)) {
            r0 r0Var = j0Var.f17704q;
            fj.l.c(r0Var);
            r0Var.C = d0Var3;
            r0Var.Y(j);
        }
        f0 f0Var2 = j0Var.f17689a;
        f0 f0VarU = f0Var2.u();
        if (f0VarU != null) {
            j0 j0Var2 = f0VarU.Z;
            if (this.E != d0Var3 && !f0Var2.X) {
                s2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.f17692d.ordinal();
            if (iOrdinal == 0) {
                d0Var = d0.f17602a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + j0Var2.f17692d);
                }
                d0Var = d0.f17603b;
            }
            this.E = d0Var;
        } else {
            this.E = d0Var3;
        }
        b1(j);
        return this;
    }

    public final void Z0(long j, float f10, ej.c cVar) {
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        f0 f0Var2 = j0Var.f17689a;
        if (f0Var.f17637j0) {
            s2.a.a("place is called on a deactivated node");
        }
        j0Var.f17692d = b0.f17577c;
        this.G = j;
        this.I = f10;
        this.H = cVar;
        this.Y = false;
        r1 r1VarA = i0.a(f0Var2);
        if (this.O || !this.L) {
            this.Q.f17658g = false;
            j0Var.f(false);
            this.Z = cVar;
            this.f17789a0 = j;
            this.f17790b0 = f10;
            t1 snapshotObserver = ((w2.t) r1VarA).getSnapshotObserver();
            snapshotObserver.f17770a.c(f0Var2, snapshotObserver.f17775f, this.f17791c0);
        } else {
            i1 i1VarA = j0Var.a();
            i1VarA.M1(s3.j.c(j, i1VarA.f15554e), f10, cVar);
            X0();
        }
        j0Var.f17692d = b0.f17579e;
        if (j0Var.a().D && (j0Var.f17698k || j0Var.j)) {
            requestLayout();
        }
        this.D = true;
    }

    public final boolean b1(long j) {
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        f0 f0Var2 = j0Var.f17689a;
        try {
            if (f0Var.f17637j0) {
                s2.a.a("measure is called on a deactivated node");
            }
            r1 r1VarA = i0.a(f0Var2);
            f0 f0VarU = f0Var2.u();
            boolean z2 = true;
            f0Var2.X = f0Var2.X || (f0VarU != null && f0VarU.X);
            if (!f0Var2.q() && s3.a.b(this.f15553d, j)) {
                ((w2.t) r1VarA).m(f0Var2, false);
                f0Var2.X();
                return false;
            }
            this.Q.f17657f = false;
            g1.e eVarY = f0Var2.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((f0) objArr[i11]).Z.f17703p.Q.f17654c = false;
            }
            this.C = true;
            long j4 = j0Var.a().f15552c;
            N0(j);
            b0 b0Var = j0Var.f17692d;
            b0 b0Var2 = b0.f17579e;
            if (b0Var != b0Var2) {
                s2.a.b("layout state is not idle before measure starts");
            }
            this.U = j;
            b0 b0Var3 = b0.f17575a;
            j0Var.f17692d = b0Var3;
            this.N = false;
            t1 snapshotObserver = ((w2.t) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.f17770a.c(f0Var2, snapshotObserver.f17772c, this.V);
            if (j0Var.f17692d == b0Var3) {
                this.O = true;
                this.P = true;
                j0Var.f17692d = b0Var2;
            }
            if (s3.l.b(j0Var.a().f15552c, j4) && j0Var.a().f15550a == this.f15550a && j0Var.a().f15551b == this.f15551b) {
                z2 = false;
            }
            M0((j0Var.a().f15551b & 4294967295L) | (j0Var.a().f15550a << 32));
            return z2;
        } catch (Throwable th2) {
            f0Var.Y(th2);
            throw null;
        }
    }

    @Override // t2.f1, t2.p0
    public final Object c0() {
        return this.K;
    }

    public final void d1() {
        j0 j0Var = this.f17793f;
        f0 f0Var = j0Var.f17689a;
        f0 f0Var2 = j0Var.f17689a;
        if (!f0Var.H() || j0Var.f17699l <= 0) {
            return;
        }
        j0 j0Var2 = f0Var2.Z;
        if ((j0Var2.j || j0Var2.f17698k) && !j0Var2.f17703p.O) {
            f0Var2.U(false);
        }
        g1.e eVarY = f0Var2.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).Z.f17703p.d1();
        }
    }

    @Override // v2.a
    public final g0 f() {
        return this.Q;
    }

    @Override // v2.y0
    public final void g0(boolean z2) {
        j0 j0Var = this.f17793f;
        if (z2 != j0Var.a().B) {
            j0Var.a().B = z2;
            this.f17792d0 = true;
        }
    }

    @Override // v2.a
    public final void j0() {
        boolean zB1;
        this.T = true;
        g0 g0Var = this.Q;
        g0Var.h();
        boolean z2 = this.O;
        j0 j0Var = this.f17793f;
        if (z2) {
            g1.e eVarY = j0Var.f17689a.y();
            Object[] objArr = eVarY.f7024a;
            int i10 = eVarY.f7026c;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var = (f0) objArr[i11];
                boolean zQ = f0Var.q();
                j0 j0Var2 = f0Var.Z;
                if (zQ && f0Var.r() == d0.f17602a) {
                    v0 v0Var = j0Var2.f17703p;
                    s3.a aVar = v0Var.C ? new s3.a(v0Var.f15553d) : null;
                    if (aVar != null) {
                        if (f0Var.V == d0.f17604c) {
                            f0Var.e();
                        }
                        zB1 = j0Var2.f17703p.b1(aVar.f14736a);
                    } else {
                        zB1 = false;
                    }
                    if (zB1) {
                        f0.V(j0Var.f17689a, false, 7);
                    }
                }
            }
        }
        if (this.P || (!this.F && !A().D && this.O)) {
            this.O = false;
            b0 b0Var = j0Var.f17692d;
            j0Var.f17692d = b0.f17577c;
            j0Var.g(false);
            f0 f0Var2 = j0Var.f17689a;
            t1 snapshotObserver = ((w2.t) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.f17770a.c(f0Var2, snapshotObserver.f17774e, this.W);
            j0Var.f17692d = b0Var;
            this.P = false;
        }
        if (g0Var.f17655d) {
            g0Var.f17656e = true;
        }
        if (g0Var.f17653b && g0Var.e()) {
            g0Var.g();
        }
        this.T = false;
    }

    @Override // t2.p0
    public final int l(int i10) {
        j0 j0Var = this.f17793f;
        if (!n.s(j0Var.f17689a)) {
            U0();
            return j0Var.a().l(i10);
        }
        r0 r0Var = j0Var.f17704q;
        fj.l.c(r0Var);
        return r0Var.l(i10);
    }

    @Override // v2.a
    public final void r(c2.x0 x0Var) {
        g1.e eVarY = this.f17793f.f17689a.y();
        Object[] objArr = eVarY.f7024a;
        int i10 = eVarY.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            x0Var.invoke(((f0) objArr[i11]).Z.f17703p);
        }
    }

    @Override // v2.a
    public final void requestLayout() {
        this.f17793f.f17689a.U(false);
    }

    @Override // v2.a
    public final void u0() {
        f0.V(this.f17793f.f17689a, false, 7);
    }

    @Override // t2.p0
    public final int v0(int i10) {
        j0 j0Var = this.f17793f;
        if (!n.s(j0Var.f17689a)) {
            U0();
            return j0Var.a().v0(i10);
        }
        r0 r0Var = j0Var.f17704q;
        fj.l.c(r0Var);
        return r0Var.v0(i10);
    }

    @Override // t2.f1
    public final int x0(t2.a aVar) {
        j0 j0Var = this.f17793f;
        f0 f0VarU = j0Var.f17689a.u();
        b0 b0Var = f0VarU != null ? f0VarU.Z.f17692d : null;
        b0 b0Var2 = b0.f17575a;
        g0 g0Var = this.Q;
        if (b0Var == b0Var2) {
            g0Var.f17654c = true;
        } else {
            f0 f0VarU2 = j0Var.f17689a.u();
            if ((f0VarU2 != null ? f0VarU2.Z.f17692d : null) == b0.f17577c) {
                g0Var.f17655d = true;
            }
        }
        this.F = true;
        int iX0 = j0Var.a().x0(aVar);
        this.F = false;
        return iX0;
    }

    @Override // t2.f1
    public final int y0() {
        return this.f17793f.a().y0();
    }

    @Override // t2.f1
    public final int z0() {
        return this.f17793f.a().z0();
    }
}
