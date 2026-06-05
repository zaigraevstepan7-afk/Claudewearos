package r8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final h8.j f13910a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13911b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.h f13912c;

    /* renamed from: d, reason: collision with root package name */
    public final q8.a f13913d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13914e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13915f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13916g;

    public p(h8.j jVar, g gVar, k8.h hVar, q8.a aVar, String str, boolean z2, boolean z10) {
        this.f13910a = jVar;
        this.f13911b = gVar;
        this.f13912c = hVar;
        this.f13913d = aVar;
        this.f13914e = str;
        this.f13915f = z2;
        this.f13916g = z10;
    }

    @Override // r8.j
    public final h8.j a() {
        return this.f13910a;
    }

    @Override // r8.j
    public final g b() {
        return this.f13911b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return fj.l.b(this.f13910a, pVar.f13910a) && fj.l.b(this.f13911b, pVar.f13911b) && this.f13912c == pVar.f13912c && fj.l.b(this.f13913d, pVar.f13913d) && fj.l.b(this.f13914e, pVar.f13914e) && this.f13915f == pVar.f13915f && this.f13916g == pVar.f13916g;
    }

    public final int hashCode() {
        int iHashCode = (this.f13912c.hashCode() + ((this.f13911b.hashCode() + (this.f13910a.hashCode() * 31)) * 31)) * 31;
        q8.a aVar = this.f13913d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f13914e;
        return Boolean.hashCode(this.f13916g) + gk.b.i((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f13915f);
    }

    public final String toString() {
        return "SuccessResult(image=" + this.f13910a + ", request=" + this.f13911b + ", dataSource=" + this.f13912c + ", memoryCacheKey=" + this.f13913d + ", diskCacheKey=" + this.f13914e + ", isSampled=" + this.f13915f + ", isPlaceholderCached=" + this.f13916g + ')';
    }
}
