package vf;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends of.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f18039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18040c;

    /* renamed from: d, reason: collision with root package name */
    public final c f18041d;

    public d(int i10, int i11, c cVar) {
        this.f18039b = i10;
        this.f18040c = i11;
        this.f18041d = cVar;
    }

    public final int b() {
        c cVar = c.f18028f;
        int i10 = this.f18040c;
        c cVar2 = this.f18041d;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 == c.f18025c) {
            return i10 + 5;
        }
        if (cVar2 == c.f18026d) {
            return i10 + 5;
        }
        if (cVar2 == c.f18027e) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f18039b == this.f18039b && dVar.b() == b() && dVar.f18041d == this.f18041d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18039b), Integer.valueOf(this.f18040c), this.f18041d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.f18041d);
        sb2.append(", ");
        sb2.append(this.f18040c);
        sb2.append("-byte tags, and ");
        return m6.a.h(sb2, this.f18039b, "-byte key)");
    }
}
