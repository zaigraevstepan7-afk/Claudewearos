package s8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f14778a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f14778a == ((a) obj).f14778a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14778a);
    }

    public final String toString() {
        return "Pixels(px=" + this.f14778a + ')';
    }
}
