package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8299c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8300d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8301e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8302f;

    public o(float f10, float f11, float f12, float f13) {
        super(1);
        this.f8299c = f10;
        this.f8300d = f11;
        this.f8301e = f12;
        this.f8302f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f8299c, oVar.f8299c) == 0 && Float.compare(this.f8300d, oVar.f8300d) == 0 && Float.compare(this.f8301e, oVar.f8301e) == 0 && Float.compare(this.f8302f, oVar.f8302f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8302f) + gk.b.f(this.f8301e, gk.b.f(this.f8300d, Float.hashCode(this.f8299c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f8299c);
        sb2.append(", y1=");
        sb2.append(this.f8300d);
        sb2.append(", x2=");
        sb2.append(this.f8301e);
        sb2.append(", y2=");
        return gk.b.o(sb2, this.f8302f, ')');
    }
}
