package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8438a;

    public l(int i10) {
        this.f8438a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f8438a == ((l) obj).f8438a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8438a);
    }

    public final String toString() {
        return m6.a.e(this.f8438a, "AppLongClick(id=", ")");
    }
}
