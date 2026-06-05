package aa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f236a;

    /* renamed from: b, reason: collision with root package name */
    public final b f237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f238c;

    /* renamed from: d, reason: collision with root package name */
    public final int f239d;

    public d(a aVar, b bVar, int i10, int i11) {
        this.f236a = aVar;
        this.f237b = bVar;
        this.f238c = i10;
        this.f239d = i11;
        new kj.h(361, 480, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f236a == dVar.f236a && this.f237b == dVar.f237b && this.f238c == dVar.f238c && this.f239d == dVar.f239d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f239d) + gk.b.g(this.f238c, (this.f237b.hashCode() + (this.f236a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Medium(configuration=" + this.f236a + ", density=" + this.f237b + ", dpWidth=" + this.f238c + ", dpHeight=" + this.f239d + ")";
    }
}
