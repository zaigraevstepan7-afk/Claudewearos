package wa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f19119a;

    public l(int i10) {
        this.f19119a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f19119a == ((l) obj).f19119a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19119a);
    }

    public final String toString() {
        return m6.a.e(this.f19119a, "AppLongPressed(appId=", ")");
    }
}
