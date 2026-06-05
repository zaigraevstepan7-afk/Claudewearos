package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f4701a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4702b;

    public s(float f10, float f11) {
        this.f4701a = f10;
        this.f4702b = f11;
    }

    public final float[] a() {
        float f10 = this.f4701a;
        float f11 = this.f4702b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f4701a, sVar.f4701a) == 0 && Float.compare(this.f4702b, sVar.f4702b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4702b) + (Float.hashCode(this.f4701a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f4701a);
        sb2.append(", y=");
        return gk.b.o(sb2, this.f4702b, ')');
    }
}
