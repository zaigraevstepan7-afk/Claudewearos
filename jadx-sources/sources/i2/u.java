package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8323c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8324d;

    public u(float f10, float f11) {
        super(3);
        this.f8323c = f10;
        this.f8324d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f8323c, uVar.f8323c) == 0 && Float.compare(this.f8324d, uVar.f8324d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8324d) + (Float.hashCode(this.f8323c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f8323c);
        sb2.append(", dy=");
        return gk.b.o(sb2, this.f8324d, ')');
    }
}
