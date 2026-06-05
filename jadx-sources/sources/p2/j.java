package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f12703a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f12703a == ((j) obj).f12703a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12703a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f12703a + ')';
    }
}
