package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 implements f0 {
    public long A;
    public long B;
    public float C;
    public float D;
    public float E;
    public float F;
    public long G;
    public w0 H;
    public boolean I;
    public int J;
    public long K;
    public s3.c L;
    public s3.m M;
    public r0 N;
    public n O;
    public int P;
    public e0 Q;

    /* renamed from: a, reason: collision with root package name */
    public int f3038a;

    /* renamed from: b, reason: collision with root package name */
    public float f3039b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f3040c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3041d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3042e;

    /* renamed from: f, reason: collision with root package name */
    public float f3043f;

    /* renamed from: z, reason: collision with root package name */
    public float f3044z;

    public t0() {
        long j = g0.f2997a;
        this.A = j;
        this.B = j;
        this.F = 8.0f;
        this.G = a1.f2962b;
        this.H = e0.f2986b;
        this.J = 0;
        this.K = 9205357640488583168L;
        this.L = wd.a.c();
        this.M = s3.m.f14752a;
        this.P = 3;
    }

    @Override // c2.f0
    public final void J0(long j) {
        if (a1.a(this.G, j)) {
            return;
        }
        this.f3038a |= 4096;
        this.G = j;
    }

    @Override // c2.f0
    public final void U(int i10) {
        if (this.J == i10) {
            return;
        }
        this.f3038a |= 32768;
        this.J = i10;
    }

    @Override // c2.f0
    public final long a() {
        return this.K;
    }

    @Override // c2.f0
    public final void b(float f10) {
        if (this.D == f10) {
            return;
        }
        this.f3038a |= 512;
        this.D = f10;
    }

    @Override // c2.f0
    public final float c() {
        return this.f3039b;
    }

    @Override // c2.f0
    public final void d(float f10) {
        if (this.f3044z == f10) {
            return;
        }
        this.f3038a |= 32;
        this.f3044z = f10;
    }

    @Override // s3.c
    public final float e() {
        return this.L.e();
    }

    public final void f() {
        p(1.0f);
        j(1.0f);
        m(1.0f);
        s(0.0f);
        h(0.0f);
        d(0.0f);
        long j = g0.f2997a;
        n(j);
        t(j);
        w(0.0f);
        b(0.0f);
        g(0.0f);
        u(8.0f);
        J0(a1.f2962b);
        y(e0.f2986b);
        q(false);
        k(null);
        o(null);
        i(3);
        U(0);
        this.K = 9205357640488583168L;
        this.Q = null;
        this.f3038a = 0;
    }

    @Override // c2.f0
    public final void g(float f10) {
        if (this.E == f10) {
            return;
        }
        this.f3038a |= 1024;
        this.E = f10;
    }

    @Override // c2.f0
    public final void h(float f10) {
        if (this.f3043f == f10) {
            return;
        }
        this.f3038a |= 16;
        this.f3043f = f10;
    }

    @Override // c2.f0
    public final void i(int i10) {
        if (this.P == i10) {
            return;
        }
        this.f3038a |= 524288;
        this.P = i10;
    }

    @Override // c2.f0
    public final void j(float f10) {
        if (this.f3040c == f10) {
            return;
        }
        this.f3038a |= 2;
        this.f3040c = f10;
    }

    @Override // c2.f0
    public final void k(r0 r0Var) {
        if (fj.l.b(this.N, r0Var)) {
            return;
        }
        this.f3038a |= 131072;
        this.N = r0Var;
    }

    @Override // c2.f0
    public final void m(float f10) {
        if (this.f3041d == f10) {
            return;
        }
        this.f3038a |= 4;
        this.f3041d = f10;
    }

    @Override // c2.f0
    public final void n(long j) {
        if (w.d(this.A, j)) {
            return;
        }
        this.f3038a |= 64;
        this.A = j;
    }

    @Override // c2.f0
    public final void o(n nVar) {
        if (fj.l.b(this.O, nVar)) {
            return;
        }
        this.f3038a |= 262144;
        this.O = nVar;
    }

    @Override // c2.f0
    public final void p(float f10) {
        if (this.f3039b == f10) {
            return;
        }
        this.f3038a |= 1;
        this.f3039b = f10;
    }

    @Override // c2.f0
    public final void q(boolean z2) {
        if (this.I != z2) {
            this.f3038a |= 16384;
            this.I = z2;
        }
    }

    @Override // s3.c
    public final float r0() {
        return this.L.r0();
    }

    @Override // c2.f0
    public final void s(float f10) {
        if (this.f3042e == f10) {
            return;
        }
        this.f3038a |= 8;
        this.f3042e = f10;
    }

    @Override // c2.f0
    public final void t(long j) {
        if (w.d(this.B, j)) {
            return;
        }
        this.f3038a |= 128;
        this.B = j;
    }

    @Override // c2.f0
    public final void u(float f10) {
        if (this.F == f10) {
            return;
        }
        this.f3038a |= 2048;
        this.F = f10;
    }

    @Override // c2.f0
    public final float v() {
        return this.f3040c;
    }

    @Override // c2.f0
    public final void w(float f10) {
        if (this.C == f10) {
            return;
        }
        this.f3038a |= 256;
        this.C = f10;
    }

    @Override // c2.f0
    public final void y(w0 w0Var) {
        if (fj.l.b(this.H, w0Var)) {
            return;
        }
        this.f3038a |= 8192;
        this.H = w0Var;
    }
}
