package wa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.f f19158a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19159b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19161d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19162e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19163f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19164g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19165h;

    public s0(xa.f fVar, float f10, float f11, int i10, int i11, int i12, int i13, String str) {
        fj.l.f(fVar, "app");
        this.f19158a = fVar;
        this.f19159b = f10;
        this.f19160c = f11;
        this.f19161d = i10;
        this.f19162e = i11;
        this.f19163f = i12;
        this.f19164g = i13;
        this.f19165h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return fj.l.b(this.f19158a, s0Var.f19158a) && Float.compare(this.f19159b, s0Var.f19159b) == 0 && Float.compare(this.f19160c, s0Var.f19160c) == 0 && this.f19161d == s0Var.f19161d && this.f19162e == s0Var.f19162e && this.f19163f == s0Var.f19163f && this.f19164g == s0Var.f19164g && fj.l.b(this.f19165h, s0Var.f19165h);
    }

    public final int hashCode() {
        return this.f19165h.hashCode() + gk.b.g(this.f19164g, gk.b.g(this.f19163f, gk.b.g(this.f19162e, gk.b.g(this.f19161d, gk.b.f(this.f19160c, gk.b.f(this.f19159b, this.f19158a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "GridSettlingClone(app=" + this.f19158a + ", startLeft=" + this.f19159b + ", startTop=" + this.f19160c + ", width=" + this.f19161d + ", height=" + this.f19162e + ", iconWidth=" + this.f19163f + ", iconHeight=" + this.f19164g + ", targetPackageName=" + this.f19165h + ")";
    }
}
