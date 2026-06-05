package wa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f19075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19076b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19077c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19078d;

    public g(int i10, String str, float f10, float f11) {
        fj.l.f(str, "packageName");
        this.f19075a = str;
        this.f19076b = i10;
        this.f19077c = f10;
        this.f19078d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return fj.l.b(this.f19075a, gVar.f19075a) && this.f19076b == gVar.f19076b && Float.compare(this.f19077c, gVar.f19077c) == 0 && Float.compare(this.f19078d, gVar.f19078d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19078d) + gk.b.f(this.f19077c, gk.b.g(this.f19076b, this.f19075a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FolderBackgroundCacheKey(packageName=" + this.f19075a + ", sourceSize=" + this.f19076b + ", cornerRadiusPercent=" + this.f19077c + ", viewSizePercent=" + this.f19078d + ")";
    }
}
