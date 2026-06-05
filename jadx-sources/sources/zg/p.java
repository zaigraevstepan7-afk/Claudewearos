package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f20612c = new p(c.f20589b, j.f20603e);

    /* renamed from: d, reason: collision with root package name */
    public static final p f20613d = new p(c.f20590c, r.f20616y);

    /* renamed from: a, reason: collision with root package name */
    public final c f20614a;

    /* renamed from: b, reason: collision with root package name */
    public final r f20615b;

    public p(c cVar, r rVar) {
        this.f20614a = cVar;
        this.f20615b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20614a.equals(pVar.f20614a) && this.f20615b.equals(pVar.f20615b);
    }

    public final int hashCode() {
        return this.f20615b.hashCode() + (this.f20614a.f20592a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f20614a + ", node=" + this.f20615b + '}';
    }
}
