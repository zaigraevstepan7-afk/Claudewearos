package k9;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f9500a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9501b;

    public a(float f10, float f11) {
        this.f9500a = f10;
        this.f9501b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f9500a, aVar.f9500a) == 0 && Float.compare(this.f9501b, aVar.f9501b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9501b) + (Float.hashCode(this.f9500a) * 31);
    }

    public final String toString() {
        return "IconLayerOpacity(background=" + this.f9500a + ", foreground=" + this.f9501b + ")";
    }
}
