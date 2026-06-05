package c2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3003a;

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.f3003a == ((h0) obj).f3003a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3003a);
    }

    public final String toString() {
        int i10 = this.f3003a;
        return i10 == 0 ? "Argb8888" : i10 == 1 ? "Alpha8" : i10 == 2 ? "Rgb565" : i10 == 3 ? "F16" : i10 == 4 ? "Gpu" : "Unknown";
    }
}
