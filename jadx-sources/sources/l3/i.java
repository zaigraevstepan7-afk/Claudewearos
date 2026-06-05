package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f9912a;

    public static String a(int i10) {
        return i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f9912a == ((i) obj).f9912a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9912a);
    }

    public final String toString() {
        return a(this.f9912a);
    }
}
