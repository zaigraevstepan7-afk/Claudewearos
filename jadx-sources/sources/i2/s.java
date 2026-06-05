package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8316c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8317d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8318e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8319f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8320g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8321h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f8316c = f10;
        this.f8317d = f11;
        this.f8318e = f12;
        this.f8319f = f13;
        this.f8320g = f14;
        this.f8321h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f8316c, sVar.f8316c) == 0 && Float.compare(this.f8317d, sVar.f8317d) == 0 && Float.compare(this.f8318e, sVar.f8318e) == 0 && Float.compare(this.f8319f, sVar.f8319f) == 0 && Float.compare(this.f8320g, sVar.f8320g) == 0 && Float.compare(this.f8321h, sVar.f8321h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8321h) + gk.b.f(this.f8320g, gk.b.f(this.f8319f, gk.b.f(this.f8318e, gk.b.f(this.f8317d, Float.hashCode(this.f8316c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f8316c);
        sb2.append(", dy1=");
        sb2.append(this.f8317d);
        sb2.append(", dx2=");
        sb2.append(this.f8318e);
        sb2.append(", dy2=");
        sb2.append(this.f8319f);
        sb2.append(", dx3=");
        sb2.append(this.f8320g);
        sb2.append(", dy3=");
        return gk.b.o(sb2, this.f8321h, ')');
    }
}
