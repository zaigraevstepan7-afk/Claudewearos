package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final wa.p f8411a;

    public c(wa.p pVar) {
        fj.l.f(pVar, "action");
        this.f8411a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && fj.l.b(this.f8411a, ((c) obj).f8411a);
    }

    public final int hashCode() {
        return this.f8411a.hashCode();
    }

    public final String toString() {
        return "GridAction(action=" + this.f8411a + ")";
    }
}
