package ta;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final xa.f f16163a;

    public f(xa.f fVar) {
        this.f16163a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && fj.l.b(this.f16163a, ((f) obj).f16163a);
    }

    public final int hashCode() {
        return this.f16163a.hashCode();
    }

    public final String toString() {
        return "DockDisplayableItem(displayableItemData=" + this.f16163a + ")";
    }
}
