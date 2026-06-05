package r8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ti.h f13859a;

    /* renamed from: b, reason: collision with root package name */
    public final ti.h f13860b;

    /* renamed from: c, reason: collision with root package name */
    public final ti.h f13861c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.c f13862d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f13863e;

    /* renamed from: f, reason: collision with root package name */
    public final ej.c f13864f;

    /* renamed from: g, reason: collision with root package name */
    public final s8.i f13865g;

    /* renamed from: h, reason: collision with root package name */
    public final s8.g f13866h;

    /* renamed from: i, reason: collision with root package name */
    public final s8.d f13867i;

    public f(ti.h hVar, ti.h hVar2, ti.h hVar3, ej.c cVar, ej.c cVar2, ej.c cVar3, s8.i iVar, s8.g gVar, s8.d dVar) {
        this.f13859a = hVar;
        this.f13860b = hVar2;
        this.f13861c = hVar3;
        this.f13862d = cVar;
        this.f13863e = cVar2;
        this.f13864f = cVar3;
        this.f13865g = iVar;
        this.f13866h = gVar;
        this.f13867i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(this.f13859a, fVar.f13859a) && fj.l.b(this.f13860b, fVar.f13860b) && fj.l.b(this.f13861c, fVar.f13861c) && fj.l.b(this.f13862d, fVar.f13862d) && fj.l.b(this.f13863e, fVar.f13863e) && fj.l.b(this.f13864f, fVar.f13864f) && fj.l.b(this.f13865g, fVar.f13865g) && this.f13866h == fVar.f13866h && this.f13867i == fVar.f13867i;
    }

    public final int hashCode() {
        ti.h hVar = this.f13859a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        ti.h hVar2 = this.f13860b;
        int iHashCode2 = (iHashCode + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        ti.h hVar3 = this.f13861c;
        int iHashCode3 = (iHashCode2 + (hVar3 == null ? 0 : hVar3.hashCode())) * 923521;
        ej.c cVar = this.f13862d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ej.c cVar2 = this.f13863e;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        ej.c cVar3 = this.f13864f;
        int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        s8.i iVar = this.f13865g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        s8.g gVar = this.f13866h;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        s8.d dVar = this.f13867i;
        return iHashCode8 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f13859a + ", fetcherCoroutineContext=" + this.f13860b + ", decoderCoroutineContext=" + this.f13861c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f13862d + ", errorFactory=" + this.f13863e + ", fallbackFactory=" + this.f13864f + ", sizeResolver=" + this.f13865g + ", scale=" + this.f13866h + ", precision=" + this.f13867i + ')';
    }
}
