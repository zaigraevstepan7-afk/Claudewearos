package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8303c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8304d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8305e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8306f;

    public p(float f10, float f11, float f12, float f13) {
        super(2);
        this.f8303c = f10;
        this.f8304d = f11;
        this.f8305e = f12;
        this.f8306f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f8303c, pVar.f8303c) == 0 && Float.compare(this.f8304d, pVar.f8304d) == 0 && Float.compare(this.f8305e, pVar.f8305e) == 0 && Float.compare(this.f8306f, pVar.f8306f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8306f) + gk.b.f(this.f8305e, gk.b.f(this.f8304d, Float.hashCode(this.f8303c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f8303c);
        sb2.append(", y1=");
        sb2.append(this.f8304d);
        sb2.append(", x2=");
        sb2.append(this.f8305e);
        sb2.append(", y2=");
        return gk.b.o(sb2, this.f8306f, ')');
    }
}
