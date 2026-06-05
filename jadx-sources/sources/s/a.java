package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f14559a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14560b;

    public a(float f10, float f11) {
        this.f14559a = f10;
        this.f14560b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f14559a, aVar.f14559a) == 0 && Float.compare(this.f14560b, aVar.f14560b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14560b) + (Float.hashCode(this.f14559a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f14559a);
        sb2.append(", velocityCoefficient=");
        return gk.b.o(sb2, this.f14560b, ')');
    }
}
