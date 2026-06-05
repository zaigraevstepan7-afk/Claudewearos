package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f13697a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f13697a == ((r) obj).f13697a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13697a);
    }

    public final String toString() {
        int i10 = this.f13697a;
        return i10 == 1 ? "Linearity.Linear" : i10 == 2 ? "Linearity.FontHinting" : i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
