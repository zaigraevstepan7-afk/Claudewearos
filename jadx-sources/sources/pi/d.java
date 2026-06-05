package pi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final d f12995b = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f12996a = 131840;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        fj.l.f(dVar, "other");
        return this.f12996a - dVar.f12996a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f12996a == dVar.f12996a;
    }

    public final int hashCode() {
        return this.f12996a;
    }

    public final String toString() {
        return "2.3.0";
    }
}
