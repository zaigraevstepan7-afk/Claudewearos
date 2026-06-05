package i2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f8297c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8298d;

    public n(float f10, float f11) {
        super(3);
        this.f8297c = f10;
        this.f8298d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f8297c, nVar.f8297c) == 0 && Float.compare(this.f8298d, nVar.f8298d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8298d) + (Float.hashCode(this.f8297c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f8297c);
        sb2.append(", y=");
        return gk.b.o(sb2, this.f8298d, ')');
    }
}
