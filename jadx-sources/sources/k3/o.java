package k3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f9392a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f9392a == ((o) obj).f9392a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9392a);
    }

    public final String toString() {
        int i10 = this.f9392a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
