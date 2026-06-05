package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h2.b f8381a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.p f8382b;

    public g(h2.b bVar, r8.p pVar) {
        this.f8381a = bVar;
        this.f8382b = pVar;
    }

    @Override // i8.h
    public final h2.b a() {
        return this.f8381a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return fj.l.b(this.f8381a, gVar.f8381a) && fj.l.b(this.f8382b, gVar.f8382b);
    }

    public final int hashCode() {
        return this.f8382b.hashCode() + (this.f8381a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f8381a + ", result=" + this.f8382b + ")";
    }
}
