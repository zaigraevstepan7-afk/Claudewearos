package k3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f9393a;

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f9393a == ((p) obj).f9393a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9393a);
    }

    public final String toString() {
        int i10 = this.f9393a;
        return i10 == 0 ? "None" : i10 == 1 ? "Weight" : i10 == 2 ? "Style" : i10 == 65535 ? "All" : "Invalid";
    }
}
