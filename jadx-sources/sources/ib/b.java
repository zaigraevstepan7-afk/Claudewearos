package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final cg.b f8409a;

    public b(cg.b bVar) {
        this.f8409a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && fj.l.b(this.f8409a, ((b) obj).f8409a);
    }

    public final int hashCode() {
        return this.f8409a.hashCode();
    }

    public final String toString() {
        return "GeneralAction(action=" + this.f8409a + ")";
    }
}
