package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f17713a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17714b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17715c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17716d;

    public l(float f10, float f11, float f12, float f13) {
        this.f17713a = f10;
        this.f17714b = f11;
        this.f17715c = f12;
        this.f17716d = f13;
        if (f10 < 0.0f) {
            s2.a.a("Left must be non-negative");
        }
        if (f11 < 0.0f) {
            s2.a.a("Top must be non-negative");
        }
        if (f12 < 0.0f) {
            s2.a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        s2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s3.f.e(this.f17713a, lVar.f17713a) && s3.f.e(this.f17714b, lVar.f17714b) && s3.f.e(this.f17715c, lVar.f17715c) && s3.f.e(this.f17716d, lVar.f17716d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + gk.b.f(this.f17716d, gk.b.f(this.f17715c, gk.b.f(this.f17714b, Float.hashCode(this.f17713a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) s3.f.f(this.f17713a)) + ", top=" + ((Object) s3.f.f(this.f17714b)) + ", end=" + ((Object) s3.f.f(this.f17715c)) + ", bottom=" + ((Object) s3.f.f(this.f17716d)) + ", isLayoutDirectionAware=true)";
    }
}
