package l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9877a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f9877a == ((a) obj).f9877a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9877a);
    }

    public final String toString() {
        int i10 = this.f9877a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
