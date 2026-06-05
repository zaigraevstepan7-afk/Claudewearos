package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f17689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17690b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17691c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17693e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17695g;

    /* renamed from: h, reason: collision with root package name */
    public int f17696h;

    /* renamed from: i, reason: collision with root package name */
    public int f17697i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17698k;

    /* renamed from: l, reason: collision with root package name */
    public int f17699l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17700m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17701n;

    /* renamed from: o, reason: collision with root package name */
    public int f17702o;

    /* renamed from: q, reason: collision with root package name */
    public r0 f17704q;

    /* renamed from: d, reason: collision with root package name */
    public b0 f17692d = b0.f17579e;

    /* renamed from: p, reason: collision with root package name */
    public final v0 f17703p = new v0(this);

    public j0(f0 f0Var) {
        this.f17689a = f0Var;
    }

    public final i1 a() {
        return this.f17689a.Y.f17584d;
    }

    public final void b() {
        b0 b0Var = this.f17689a.Z.f17692d;
        if (b0Var == b0.f17577c || b0Var == b0.f17578d) {
            if (this.f17703p.T) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b0Var == b0.f17578d) {
            r0 r0Var = this.f17704q;
            if (r0Var == null || !r0Var.N) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        r0 r0Var = this.f17704q;
        if (r0Var != null) {
            b0 b0Var = b0.f17576b;
            j0 j0Var = r0Var.f17748f;
            j0Var.f17692d = b0Var;
            v0 v0Var = j0Var.f17703p;
            f0 f0Var = j0Var.f17689a;
            j0Var.f17693e = false;
            r0Var.R = j;
            t1 snapshotObserver = ((w2.t) i0.a(f0Var)).getSnapshotObserver();
            q0 q0Var = r0Var.S;
            snapshotObserver.f17770a.c(f0Var, snapshotObserver.f17771b, q0Var);
            j0Var.f17694f = true;
            j0Var.f17695g = true;
            if (n.s(f0Var)) {
                v0Var.O = true;
                v0Var.P = true;
            } else {
                v0Var.N = true;
            }
            j0Var.f17692d = b0.f17579e;
        }
    }

    public final void d(int i10) {
        int i11 = this.f17699l;
        this.f17699l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            f0 f0VarU = this.f17689a.u();
            j0 j0Var = f0VarU != null ? f0VarU.Z : null;
            if (j0Var != null) {
                if (i10 == 0) {
                    j0Var.d(j0Var.f17699l - 1);
                } else {
                    j0Var.d(j0Var.f17699l + 1);
                }
            }
        }
    }

    public final void e(int i10) {
        int i11 = this.f17702o;
        this.f17702o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            f0 f0VarU = this.f17689a.u();
            j0 j0Var = f0VarU != null ? f0VarU.Z : null;
            if (j0Var != null) {
                if (i10 == 0) {
                    j0Var.e(j0Var.f17702o - 1);
                } else {
                    j0Var.e(j0Var.f17702o + 1);
                }
            }
        }
    }

    public final void f(boolean z2) {
        if (this.f17698k != z2) {
            this.f17698k = z2;
            if (z2 && !this.j) {
                d(this.f17699l + 1);
            } else {
                if (z2 || this.j) {
                    return;
                }
                d(this.f17699l - 1);
            }
        }
    }

    public final void g(boolean z2) {
        if (this.j != z2) {
            this.j = z2;
            if (z2 && !this.f17698k) {
                d(this.f17699l + 1);
            } else {
                if (z2 || this.f17698k) {
                    return;
                }
                d(this.f17699l - 1);
            }
        }
    }

    public final void h(boolean z2) {
        if (this.f17701n != z2) {
            this.f17701n = z2;
            if (z2 && !this.f17700m) {
                e(this.f17702o + 1);
            } else {
                if (z2 || this.f17700m) {
                    return;
                }
                e(this.f17702o - 1);
            }
        }
    }

    public final void i(boolean z2) {
        if (this.f17700m != z2) {
            this.f17700m = z2;
            if (z2 && !this.f17701n) {
                e(this.f17702o + 1);
            } else {
                if (z2 || this.f17701n) {
                    return;
                }
                e(this.f17702o - 1);
            }
        }
    }

    public final void j() {
        v0 v0Var = this.f17703p;
        j0 j0Var = v0Var.f17793f;
        Object obj = v0Var.K;
        f0 f0Var = this.f17689a;
        if ((obj != null || j0Var.a().c0() != null) && v0Var.J) {
            v0Var.J = false;
            v0Var.K = j0Var.a().c0();
            f0 f0VarU = f0Var.u();
            if (f0VarU != null) {
                f0.V(f0VarU, false, 7);
            }
        }
        r0 r0Var = this.f17704q;
        if (r0Var != null) {
            j0 j0Var2 = r0Var.f17748f;
            if (r0Var.Q == null) {
                o0 o0VarU1 = j0Var2.a().u1();
                fj.l.c(o0VarU1);
                if (o0VarU1.H.c0() == null) {
                    return;
                }
            }
            if (r0Var.P) {
                r0Var.P = false;
                o0 o0VarU12 = j0Var2.a().u1();
                fj.l.c(o0VarU12);
                r0Var.Q = o0VarU12.H.c0();
                if (n.s(f0Var)) {
                    f0 f0VarU2 = f0Var.u();
                    if (f0VarU2 != null) {
                        f0.V(f0VarU2, false, 7);
                        return;
                    }
                    return;
                }
                f0 f0VarU3 = f0Var.u();
                if (f0VarU3 != null) {
                    f0.T(f0VarU3, false, 7);
                }
            }
        }
    }
}
