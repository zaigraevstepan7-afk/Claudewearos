package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8295c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8296d;

    public m(float f10, float f11) {
        super(3);
        this.f8295c = f10;
        this.f8296d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f8295c, mVar.f8295c) == 0 && Float.compare(this.f8296d, mVar.f8296d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8296d) + (Float.hashCode(this.f8295c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f8295c);
        sb2.append(", y=");
        return gk.b.o(sb2, this.f8296d, ')');
    }
}
