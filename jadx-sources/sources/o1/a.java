package o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f12369a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12369a == ((a) obj).f12369a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12369a);
    }

    public final String toString() {
        return m6.a.g(new StringBuilder("DeltaCounter(count="), this.f12369a, ')');
    }
}
