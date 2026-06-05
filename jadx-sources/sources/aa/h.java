package aa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a f248a;

    /* renamed from: b, reason: collision with root package name */
    public final b f249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f251d;

    public h(a aVar, b bVar, int i10, int i11) {
        this.f248a = aVar;
        this.f249b = bVar;
        this.f250c = i10;
        this.f251d = i11;
        new kj.h(601, 840, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f248a == hVar.f248a && this.f249b == hVar.f249b && this.f250c == hVar.f250c && this.f251d == hVar.f251d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251d) + gk.b.g(this.f250c, (this.f249b.hashCode() + (this.f248a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Small(configuration=" + this.f248a + ", density=" + this.f249b + ", dpWidth=" + this.f250c + ", dpHeight=" + this.f251d + ")";
    }
}
