package ug;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17075a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17076b;

    public g(Object obj, Object obj2) {
        this.f17075a = obj;
        this.f17076b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Object obj2 = gVar.f17076b;
        Object obj3 = gVar.f17075a;
        Object obj4 = this.f17075a;
        if (obj4 == null ? obj3 != null : !obj4.equals(obj3)) {
            return false;
        }
        Object obj5 = this.f17076b;
        return obj5 == null ? obj2 == null : obj5.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f17075a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f17076b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair(" + this.f17075a + "," + this.f17076b + ")";
    }
}
