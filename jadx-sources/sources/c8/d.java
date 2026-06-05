package c8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3114b;

    public d(String str, int i10) {
        this.f3113a = str;
        this.f3114b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3114b != dVar.f3114b) {
            return false;
        }
        return this.f3113a.equals(dVar.f3113a);
    }

    public final int hashCode() {
        return (this.f3113a.hashCode() * 31) + this.f3114b;
    }
}
