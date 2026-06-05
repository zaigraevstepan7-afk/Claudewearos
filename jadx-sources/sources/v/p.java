package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public c2.g f17251a = null;

    /* renamed from: b, reason: collision with root package name */
    public c2.b f17252b = null;

    /* renamed from: c, reason: collision with root package name */
    public e2.b f17253c = null;

    /* renamed from: d, reason: collision with root package name */
    public c2.j f17254d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return fj.l.b(this.f17251a, pVar.f17251a) && fj.l.b(this.f17252b, pVar.f17252b) && fj.l.b(this.f17253c, pVar.f17253c) && fj.l.b(this.f17254d, pVar.f17254d);
    }

    public final int hashCode() {
        c2.g gVar = this.f17251a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        c2.b bVar = this.f17252b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e2.b bVar2 = this.f17253c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        c2.j jVar = this.f17254d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f17251a + ", canvas=" + this.f17252b + ", canvasDrawScope=" + this.f17253c + ", borderPath=" + this.f17254d + ')';
    }
}
