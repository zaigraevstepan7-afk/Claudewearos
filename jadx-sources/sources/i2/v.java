package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8325c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8326d;

    public v(float f10, float f11) {
        super(3);
        this.f8325c = f10;
        this.f8326d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f8325c, vVar.f8325c) == 0 && Float.compare(this.f8326d, vVar.f8326d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8326d) + (Float.hashCode(this.f8325c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f8325c);
        sb2.append(", dy=");
        return gk.b.o(sb2, this.f8326d, ')');
    }
}
