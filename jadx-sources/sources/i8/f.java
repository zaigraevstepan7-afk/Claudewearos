package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h2.b f8380a;

    public f(h2.b bVar) {
        this.f8380a = bVar;
    }

    @Override // i8.h
    public final h2.b a() {
        return this.f8380a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && fj.l.b(this.f8380a, ((f) obj).f8380a);
    }

    public final int hashCode() {
        h2.b bVar = this.f8380a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f8380a + ")";
    }
}
