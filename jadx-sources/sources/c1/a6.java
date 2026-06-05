package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1891a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1892b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1893c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1894d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1895e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1896f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1897g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1898h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1899i;
    public final long j;

    public a6(long j, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f1891a = j;
        this.f1892b = j4;
        this.f1893c = j10;
        this.f1894d = j11;
        this.f1895e = j12;
        this.f1896f = j13;
        this.f1897g = j14;
        this.f1898h = j15;
        this.f1899i = j16;
        this.j = j17;
    }

    public final long a(boolean z2, boolean z10) {
        return z2 ? z10 ? this.f1892b : this.f1894d : z10 ? this.f1897g : this.f1899i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return c2.w.d(this.f1891a, a6Var.f1891a) && c2.w.d(this.f1892b, a6Var.f1892b) && c2.w.d(this.f1893c, a6Var.f1893c) && c2.w.d(this.f1894d, a6Var.f1894d) && c2.w.d(this.f1895e, a6Var.f1895e) && c2.w.d(this.f1896f, a6Var.f1896f) && c2.w.d(this.f1897g, a6Var.f1897g) && c2.w.d(this.f1898h, a6Var.f1898h) && c2.w.d(this.f1899i, a6Var.f1899i) && c2.w.d(this.j, a6Var.j);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.j) + gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f1891a) * 31, this.f1892b, 31), this.f1893c, 31), this.f1894d, 31), this.f1895e, 31), this.f1896f, 31), this.f1897g, 31), this.f1898h, 31), this.f1899i, 31);
    }
}
