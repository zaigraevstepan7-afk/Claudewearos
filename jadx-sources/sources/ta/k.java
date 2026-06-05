package ta;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final int f16167a;

    public k(int i10) {
        this.f16167a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f16167a == ((k) obj).f16167a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16167a);
    }

    public final String toString() {
        return m6.a.e(this.f16167a, "PageRequested(page=", ")");
    }
}
