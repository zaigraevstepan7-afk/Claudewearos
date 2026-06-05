package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2910a = c2.w.f3058h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y4) {
            return c2.w.d(this.f2910a, ((y4) obj).f2910a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f2910a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) c2.w.j(this.f2910a)) + ", rippleAlpha=null)";
    }
}
