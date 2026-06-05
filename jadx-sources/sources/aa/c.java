package aa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f232a;

    /* renamed from: b, reason: collision with root package name */
    public final b f233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234c;

    /* renamed from: d, reason: collision with root package name */
    public final int f235d;

    public c(a aVar, b bVar, int i10, int i11) {
        this.f232a = aVar;
        this.f233b = bVar;
        this.f234c = i10;
        this.f235d = i11;
        new kj.h(481, 600, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f232a == cVar.f232a && this.f233b == cVar.f233b && this.f234c == cVar.f234c && this.f235d == cVar.f235d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f235d) + gk.b.g(this.f234c, (this.f233b.hashCode() + (this.f232a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Large(configuration=" + this.f232a + ", density=" + this.f233b + ", dpWidth=" + this.f234c + ", dpHeight=" + this.f235d + ")";
    }
}
