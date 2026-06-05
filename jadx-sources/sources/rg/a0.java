package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14381a;

    public a0(long j) {
        this.f14381a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a0.class == obj.getClass() && this.f14381a == ((a0) obj).f14381a;
    }

    public final int hashCode() {
        long j = this.f14381a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f14381a + '}';
    }
}
