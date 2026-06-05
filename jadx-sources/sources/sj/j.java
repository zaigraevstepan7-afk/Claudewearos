package sj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final i f15075b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final Object f15076a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return fj.l.b(this.f15076a, ((j) obj).f15076a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f15076a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f15076a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
