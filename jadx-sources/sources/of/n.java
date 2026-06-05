package of;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: b, reason: collision with root package name */
    public final int f12481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12483d;

    /* renamed from: e, reason: collision with root package name */
    public final j f12484e;

    public n(int i10, int i11, int i12, j jVar) {
        this.f12481b = i10;
        this.f12482c = i11;
        this.f12483d = i12;
        this.f12484e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f12481b == this.f12481b && nVar.f12482c == this.f12482c && nVar.f12483d == this.f12483d && nVar.f12484e == this.f12484e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f12481b), Integer.valueOf(this.f12482c), Integer.valueOf(this.f12483d), this.f12484e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.f12484e);
        sb2.append(", ");
        sb2.append(this.f12482c);
        sb2.append("-byte IV, ");
        sb2.append(this.f12483d);
        sb2.append("-byte tag, and ");
        return m6.a.h(sb2, this.f12481b, "-byte key)");
    }
}
