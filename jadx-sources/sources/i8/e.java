package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h2.b f8378a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.c f8379b;

    public e(h2.b bVar, r8.c cVar) {
        this.f8378a = bVar;
        this.f8379b = cVar;
    }

    @Override // i8.h
    public final h2.b a() {
        return this.f8378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return fj.l.b(this.f8378a, eVar.f8378a) && fj.l.b(this.f8379b, eVar.f8379b);
    }

    public final int hashCode() {
        h2.b bVar = this.f8378a;
        return this.f8379b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f8378a + ", result=" + this.f8379b + ")";
    }
}
