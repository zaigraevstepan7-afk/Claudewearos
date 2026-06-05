package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final db.d f8413a;

    public d(db.d dVar) {
        fj.l.f(dVar, "action");
        this.f8413a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && fj.l.b(this.f8413a, ((d) obj).f8413a);
    }

    public final int hashCode() {
        return this.f8413a.hashCode();
    }

    public final String toString() {
        return "TopBarAction(action=" + this.f8413a + ")";
    }
}
