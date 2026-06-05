package li;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f10998a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10999b;

    public d(float f10, float f11) {
        this.f10998a = f10;
        this.f10999b = f11;
    }

    public final d a(float f10) {
        return new d(this.f10998a * f10, this.f10999b * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f10998a, dVar.f10998a) == 0 && Float.compare(this.f10999b, dVar.f10999b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10999b) + (Float.hashCode(this.f10998a) * 31);
    }

    public final String toString() {
        return "Point(x=" + this.f10998a + ", y=" + this.f10999b + ")";
    }
}
