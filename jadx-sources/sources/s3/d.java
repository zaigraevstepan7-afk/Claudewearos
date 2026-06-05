package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f14737a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14738b;

    public d(float f10, float f11) {
        this.f14737a = f10;
        this.f14738b = f11;
    }

    @Override // s3.c
    public final float e() {
        return this.f14737a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f14737a, dVar.f14737a) == 0 && Float.compare(this.f14738b, dVar.f14738b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14738b) + (Float.hashCode(this.f14737a) * 31);
    }

    @Override // s3.c
    public final float r0() {
        return this.f14738b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f14737a);
        sb2.append(", fontScale=");
        return gk.b.o(sb2, this.f14738b, ')');
    }
}
