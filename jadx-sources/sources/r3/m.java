package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f13689a;

    public static String a(int i10) {
        return i10 == 1 ? "Ltr" : i10 == 2 ? "Rtl" : i10 == 3 ? "Content" : i10 == 4 ? "ContentOrLtr" : i10 == 5 ? "ContentOrRtl" : i10 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f13689a == ((m) obj).f13689a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13689a);
    }

    public final String toString() {
        return a(this.f13689a);
    }
}
