package e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public final float f5744a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5747d;

    public h(int i10, int i11, float f10, float f11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f5744a = f10;
        this.f5745b = f11;
        this.f5746c = i10;
        this.f5747d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5744a == hVar.f5744a && this.f5745b == hVar.f5745b && this.f5746c == hVar.f5746c && this.f5747d == hVar.f5747d;
    }

    public final int hashCode() {
        return gk.b.g(this.f5747d, gk.b.g(this.f5746c, gk.b.f(this.f5745b, Float.hashCode(this.f5744a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f5744a);
        sb2.append(", miter=");
        sb2.append(this.f5745b);
        sb2.append(", cap=");
        String str = "Unknown";
        int i10 = this.f5746c;
        sb2.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i11 = this.f5747d;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
