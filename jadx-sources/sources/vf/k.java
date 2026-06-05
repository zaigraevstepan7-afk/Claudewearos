package vf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends of.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f18050b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18051c;

    /* renamed from: d, reason: collision with root package name */
    public final c f18052d;

    /* renamed from: e, reason: collision with root package name */
    public final c f18053e;

    public k(int i10, int i11, c cVar, c cVar2) {
        this.f18050b = i10;
        this.f18051c = i11;
        this.f18052d = cVar;
        this.f18053e = cVar2;
    }

    public final int b() {
        c cVar = c.f18036o;
        int i10 = this.f18051c;
        c cVar2 = this.f18052d;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 == c.f18033l) {
            return i10 + 5;
        }
        if (cVar2 == c.f18034m) {
            return i10 + 5;
        }
        if (cVar2 == c.f18035n) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f18050b == this.f18050b && kVar.b() == b() && kVar.f18052d == this.f18052d && kVar.f18053e == this.f18053e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18050b), Integer.valueOf(this.f18051c), this.f18052d, this.f18053e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.f18052d);
        sb2.append(", hashType: ");
        sb2.append(this.f18053e);
        sb2.append(", ");
        sb2.append(this.f18051c);
        sb2.append("-byte tags, and ");
        return m6.a.h(sb2, this.f18050b, "-byte key)");
    }
}
