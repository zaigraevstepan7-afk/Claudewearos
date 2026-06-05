package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8335c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8336d;

    public y(float f10, float f11) {
        super(1);
        this.f8335c = f10;
        this.f8336d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f8335c, yVar.f8335c) == 0 && Float.compare(this.f8336d, yVar.f8336d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8336d) + (Float.hashCode(this.f8335c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f8335c);
        sb2.append(", dy=");
        return gk.b.o(sb2, this.f8336d, ')');
    }
}
