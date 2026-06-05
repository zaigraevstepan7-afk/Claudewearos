package aa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f240a;

    /* renamed from: b, reason: collision with root package name */
    public final b f241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f242c;

    /* renamed from: d, reason: collision with root package name */
    public final int f243d;

    public e(a aVar, b bVar, int i10, int i11) {
        this.f240a = aVar;
        this.f241b = bVar;
        this.f242c = i10;
        this.f243d = i11;
        new kj.h(280, 360, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f240a == eVar.f240a && this.f241b == eVar.f241b && this.f242c == eVar.f242c && this.f243d == eVar.f243d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f243d) + gk.b.g(this.f242c, (this.f241b.hashCode() + (this.f240a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Small(configuration=" + this.f240a + ", density=" + this.f241b + ", dpWidth=" + this.f242c + ", dpHeight=" + this.f243d + ")";
    }
}
