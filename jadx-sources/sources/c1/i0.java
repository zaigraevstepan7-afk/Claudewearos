package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2219a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2220b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2221c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2222d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2223e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2224f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2225g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2226h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2227i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f2228k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2229l;

    public i0(long j, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f2219a = j;
        this.f2220b = j4;
        this.f2221c = j10;
        this.f2222d = j11;
        this.f2223e = j12;
        this.f2224f = j13;
        this.f2225g = j14;
        this.f2226h = j15;
        this.f2227i = j16;
        this.j = j17;
        this.f2228k = j18;
        this.f2229l = j19;
    }

    public static t.u0 a(f3.a aVar, f1.i0 i0Var) {
        if (aVar == f3.a.f6619b) {
            i0Var.b0(1539262271);
            t.u0 u0VarL = z4.l(e1.u.f5672d, i0Var);
            i0Var.p(false);
            return u0VarL;
        }
        i0Var.b0(1539355581);
        t.u0 u0VarL2 = z4.l(e1.u.f5671c, i0Var);
        i0Var.p(false);
        return u0VarL2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return c2.w.d(this.f2219a, i0Var.f2219a) && c2.w.d(this.f2220b, i0Var.f2220b) && c2.w.d(this.f2221c, i0Var.f2221c) && c2.w.d(this.f2222d, i0Var.f2222d) && c2.w.d(this.f2223e, i0Var.f2223e) && c2.w.d(this.f2224f, i0Var.f2224f) && c2.w.d(this.f2225g, i0Var.f2225g) && c2.w.d(this.f2226h, i0Var.f2226h) && c2.w.d(this.f2227i, i0Var.f2227i) && c2.w.d(this.j, i0Var.j) && c2.w.d(this.f2228k, i0Var.f2228k) && c2.w.d(this.f2229l, i0Var.f2229l);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2229l) + gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f2219a) * 31, this.f2220b, 31), this.f2221c, 31), this.f2222d, 31), this.f2223e, 31), this.f2224f, 31), this.f2225g, 31), this.f2226h, 31), this.f2227i, 31), this.j, 31), this.f2228k, 31);
    }
}
