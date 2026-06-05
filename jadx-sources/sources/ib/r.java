package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8453a;

    public r(int i10) {
        this.f8453a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f8453a == ((r) obj).f8453a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8453a);
    }

    public final String toString() {
        return m6.a.e(this.f8453a, "DockAppClickEvent(id=", ")");
    }
}
