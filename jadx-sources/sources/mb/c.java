package mb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11441a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11442b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11443c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11444d;

    public c(String str, float f10, boolean z2, boolean z10) {
        fj.l.f(str, "fileName");
        this.f11441a = str;
        this.f11442b = f10;
        this.f11443c = z2;
        this.f11444d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return fj.l.b(this.f11441a, cVar.f11441a) && Float.compare(this.f11442b, cVar.f11442b) == 0 && this.f11443c == cVar.f11443c && this.f11444d == cVar.f11444d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11444d) + gk.b.i(gk.b.f(this.f11442b, this.f11441a.hashCode() * 31, 31), 31, this.f11443c);
    }

    public final String toString() {
        return "WallpaperCustomization(fileName=" + this.f11441a + ", blurRadiusDp=" + this.f11442b + ", depthEnabled=" + this.f11443c + ", rainEnabled=" + this.f11444d + ")";
    }
}
