package e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5218a;

    public a(int i10) {
        this.f5218a = i10;
        if (i10 > 0) {
            return;
        }
        a0.a.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5218a == ((a) obj).f5218a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f5218a;
    }
}
