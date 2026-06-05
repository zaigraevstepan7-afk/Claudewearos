package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8308d;

    public q(float f10, float f11) {
        super(1);
        this.f8307c = f10;
        this.f8308d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f8307c, qVar.f8307c) == 0 && Float.compare(this.f8308d, qVar.f8308d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8308d) + (Float.hashCode(this.f8307c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f8307c);
        sb2.append(", y=");
        return gk.b.o(sb2, this.f8308d, ')');
    }
}
