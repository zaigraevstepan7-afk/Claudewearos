package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static int f8228k;

    /* renamed from: l, reason: collision with root package name */
    public static final h9.a f8229l = new h9.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8231b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8232c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8233d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8234e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f8235f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8236g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8237h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8238i;
    public final int j;

    public f(String str, float f10, float f11, float f12, float f13, g0 g0Var, long j, int i10, boolean z2) {
        int i11;
        synchronized (f8229l) {
            i11 = f8228k;
            f8228k = i11 + 1;
        }
        this.f8230a = str;
        this.f8231b = f10;
        this.f8232c = f11;
        this.f8233d = f12;
        this.f8234e = f13;
        this.f8235f = g0Var;
        this.f8236g = j;
        this.f8237h = i10;
        this.f8238i = z2;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(this.f8230a, fVar.f8230a) && s3.f.e(this.f8231b, fVar.f8231b) && s3.f.e(this.f8232c, fVar.f8232c) && this.f8233d == fVar.f8233d && this.f8234e == fVar.f8234e && this.f8235f.equals(fVar.f8235f) && c2.w.d(this.f8236g, fVar.f8236g) && this.f8237h == fVar.f8237h && this.f8238i == fVar.f8238i;
    }

    public final int hashCode() {
        int iHashCode = (this.f8235f.hashCode() + gk.b.f(this.f8234e, gk.b.f(this.f8233d, gk.b.f(this.f8232c, gk.b.f(this.f8231b, this.f8230a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = c2.w.f3059i;
        return Boolean.hashCode(this.f8238i) + gk.b.g(this.f8237h, gk.b.j(iHashCode, this.f8236g, 31), 31);
    }
}
