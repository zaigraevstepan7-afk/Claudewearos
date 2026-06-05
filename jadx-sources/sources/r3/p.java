package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f13691c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f13692a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13693b;

    public p(float f10, float f11) {
        this.f13692a = f10;
        this.f13693b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f13692a == pVar.f13692a && this.f13693b == pVar.f13693b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13693b) + (Float.hashCode(this.f13692a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f13692a);
        sb2.append(", skewX=");
        return gk.b.o(sb2, this.f13693b, ')');
    }
}
