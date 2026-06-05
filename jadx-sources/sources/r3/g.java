package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f13675a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f13675a == ((g) obj).f13675a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13675a);
    }

    public final String toString() {
        int i10 = this.f13675a;
        return i10 == 0 ? "LineHeightStyle.Mode.Fixed" : i10 == 1 ? "LineHeightStyle.Mode.Minimum" : i10 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
