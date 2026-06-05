package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8309c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8310d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8311e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8312f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8313g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8314h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8315i;

    public r(float f10, float f11, float f12, boolean z2, boolean z10, float f13, float f14) {
        super(3);
        this.f8309c = f10;
        this.f8310d = f11;
        this.f8311e = f12;
        this.f8312f = z2;
        this.f8313g = z10;
        this.f8314h = f13;
        this.f8315i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f8309c, rVar.f8309c) == 0 && Float.compare(this.f8310d, rVar.f8310d) == 0 && Float.compare(this.f8311e, rVar.f8311e) == 0 && this.f8312f == rVar.f8312f && this.f8313g == rVar.f8313g && Float.compare(this.f8314h, rVar.f8314h) == 0 && Float.compare(this.f8315i, rVar.f8315i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8315i) + gk.b.f(this.f8314h, gk.b.i(gk.b.i(gk.b.f(this.f8311e, gk.b.f(this.f8310d, Float.hashCode(this.f8309c) * 31, 31), 31), 31, this.f8312f), 31, this.f8313g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f8309c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f8310d);
        sb2.append(", theta=");
        sb2.append(this.f8311e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f8312f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f8313g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f8314h);
        sb2.append(", arcStartDy=");
        return gk.b.o(sb2, this.f8315i, ')');
    }
}
