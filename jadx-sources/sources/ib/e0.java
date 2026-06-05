package ib;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8415a;

    public e0(int i10) {
        this.f8415a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.f8415a == ((e0) obj).f8415a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8415a);
    }

    public final String toString() {
        return m6.a.e(this.f8415a, "PageRequestedEvent(page=", ")");
    }
}
