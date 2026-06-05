package aa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a f244a;

    /* renamed from: b, reason: collision with root package name */
    public final b f245b;

    /* renamed from: c, reason: collision with root package name */
    public final int f246c;

    /* renamed from: d, reason: collision with root package name */
    public final int f247d;

    public g(a aVar, b bVar, int i10, int i11) {
        this.f244a = aVar;
        this.f245b = bVar;
        this.f246c = i10;
        this.f247d = i11;
        new kj.h(841, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f244a == gVar.f244a && this.f245b == gVar.f245b && this.f246c == gVar.f246c && this.f247d == gVar.f247d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f247d) + gk.b.g(this.f246c, (this.f245b.hashCode() + (this.f244a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Large(configuration=" + this.f244a + ", density=" + this.f245b + ", dpWidth=" + this.f246c + ", dpHeight=" + this.f247d + ")";
    }
}
