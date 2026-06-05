package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12697a;

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f12697a == ((g0) obj).f12697a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12697a);
    }

    public final String toString() {
        return a(this.f12697a);
    }
}
