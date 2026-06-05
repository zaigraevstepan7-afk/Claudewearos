package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h8.m f8374a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.g f8375b;

    /* renamed from: c, reason: collision with root package name */
    public final b f8376c;

    public c(h8.m mVar, b bVar, r8.g gVar) {
        this.f8374a = mVar;
        this.f8375b = gVar;
        this.f8376c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f8374a.equals(cVar.f8374a)) {
            return false;
        }
        b bVar = cVar.f8376c;
        b bVar2 = this.f8376c;
        return fj.l.b(bVar2, bVar) && bVar2.a(this.f8375b, cVar.f8375b);
    }

    public final int hashCode() {
        int iHashCode = this.f8374a.hashCode() * 31;
        b bVar = this.f8376c;
        return bVar.b(this.f8375b) + ((bVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f8374a + ", request=" + this.f8375b + ", modelEqualityDelegate=" + this.f8376c + ")";
    }
}
