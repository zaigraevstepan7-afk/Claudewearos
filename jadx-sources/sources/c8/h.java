package c8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public String f3119a;

    /* renamed from: b, reason: collision with root package name */
    public int f3120b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3120b != hVar.f3120b) {
            return false;
        }
        return this.f3119a.equals(hVar.f3119a);
    }

    public final int hashCode() {
        return y3.e.b(this.f3120b) + (this.f3119a.hashCode() * 31);
    }
}
