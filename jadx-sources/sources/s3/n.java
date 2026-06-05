package s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements t3.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f14755a;

    public n(float f10) {
        this.f14755a = f10;
    }

    @Override // t3.a
    public final float a(float f10) {
        return f10 / this.f14755a;
    }

    @Override // t3.a
    public final float b(float f10) {
        return f10 * this.f14755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f14755a, ((n) obj).f14755a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14755a);
    }

    public final String toString() {
        return gk.b.o(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f14755a, ')');
    }
}
