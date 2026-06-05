package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8327c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8328d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8329e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8330f;

    public w(float f10, float f11, float f12, float f13) {
        super(1);
        this.f8327c = f10;
        this.f8328d = f11;
        this.f8329e = f12;
        this.f8330f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f8327c, wVar.f8327c) == 0 && Float.compare(this.f8328d, wVar.f8328d) == 0 && Float.compare(this.f8329e, wVar.f8329e) == 0 && Float.compare(this.f8330f, wVar.f8330f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8330f) + gk.b.f(this.f8329e, gk.b.f(this.f8328d, Float.hashCode(this.f8327c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f8327c);
        sb2.append(", dy1=");
        sb2.append(this.f8328d);
        sb2.append(", dx2=");
        sb2.append(this.f8329e);
        sb2.append(", dy2=");
        return gk.b.o(sb2, this.f8330f, ')');
    }
}
