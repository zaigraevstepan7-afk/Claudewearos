package of;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f12473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12475d;

    /* renamed from: e, reason: collision with root package name */
    public final j f12476e;

    public k(int i10, int i11, int i12, j jVar) {
        this.f12473b = i10;
        this.f12474c = i11;
        this.f12475d = i12;
        this.f12476e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f12473b == this.f12473b && kVar.f12474c == this.f12474c && kVar.f12475d == this.f12475d && kVar.f12476e == this.f12476e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12473b), Integer.valueOf(this.f12474c), Integer.valueOf(this.f12475d), this.f12476e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(this.f12476e);
        sb2.append(", ");
        sb2.append(this.f12474c);
        sb2.append("-byte IV, ");
        sb2.append(this.f12475d);
        sb2.append("-byte tag, and ");
        return m6.a.h(sb2, this.f12473b, "-byte key)");
    }
}
