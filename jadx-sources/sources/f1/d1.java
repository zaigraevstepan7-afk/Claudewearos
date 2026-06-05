package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6279a;

    public d1(String str) {
        this.f6279a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && fj.l.b(this.f6279a, ((d1) obj).f6279a);
    }

    public final int hashCode() {
        return this.f6279a.hashCode();
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("OpaqueKey(key="), this.f6279a, ')');
    }
}
