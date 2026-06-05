package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8271c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8272d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8273e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8274f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8275g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8276h;

    /* renamed from: i, reason: collision with root package name */
    public final float f8277i;

    public i(float f10, float f11, float f12, boolean z2, boolean z10, float f13, float f14) {
        super(3);
        this.f8271c = f10;
        this.f8272d = f11;
        this.f8273e = f12;
        this.f8274f = z2;
        this.f8275g = z10;
        this.f8276h = f13;
        this.f8277i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f8271c, iVar.f8271c) == 0 && Float.compare(this.f8272d, iVar.f8272d) == 0 && Float.compare(this.f8273e, iVar.f8273e) == 0 && this.f8274f == iVar.f8274f && this.f8275g == iVar.f8275g && Float.compare(this.f8276h, iVar.f8276h) == 0 && Float.compare(this.f8277i, iVar.f8277i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8277i) + gk.b.f(this.f8276h, gk.b.i(gk.b.i(gk.b.f(this.f8273e, gk.b.f(this.f8272d, Float.hashCode(this.f8271c) * 31, 31), 31), 31, this.f8274f), 31, this.f8275g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f8271c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f8272d);
        sb2.append(", theta=");
        sb2.append(this.f8273e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f8274f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f8275g);
        sb2.append(", arcStartX=");
        sb2.append(this.f8276h);
        sb2.append(", arcStartY=");
        return gk.b.o(sb2, this.f8277i, ')');
    }
}
