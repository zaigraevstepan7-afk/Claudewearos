package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8331c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8332d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8333e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8334f;

    public x(float f10, float f11, float f12, float f13) {
        super(2);
        this.f8331c = f10;
        this.f8332d = f11;
        this.f8333e = f12;
        this.f8334f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f8331c, xVar.f8331c) == 0 && Float.compare(this.f8332d, xVar.f8332d) == 0 && Float.compare(this.f8333e, xVar.f8333e) == 0 && Float.compare(this.f8334f, xVar.f8334f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8334f) + gk.b.f(this.f8333e, gk.b.f(this.f8332d, Float.hashCode(this.f8331c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f8331c);
        sb2.append(", dy1=");
        sb2.append(this.f8332d);
        sb2.append(", dx2=");
        sb2.append(this.f8333e);
        sb2.append(", dy2=");
        return gk.b.o(sb2, this.f8334f, ')');
    }
}
