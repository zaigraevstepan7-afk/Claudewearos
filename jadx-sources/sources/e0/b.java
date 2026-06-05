package e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5219a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f5219a == ((b) obj).f5219a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5219a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f5219a + ')';
    }
}
