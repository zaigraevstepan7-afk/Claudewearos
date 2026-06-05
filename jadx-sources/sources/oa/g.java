package oa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f12440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12442c;

    public g(int i10, int i11, int i12) {
        this.f12440a = i10;
        this.f12441b = i11;
        this.f12442c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12440a == gVar.f12440a && this.f12441b == gVar.f12441b && this.f12442c == gVar.f12442c;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + gk.b.g(1, gk.b.g(this.f12442c, gk.b.g(this.f12441b, Integer.hashCode(this.f12440a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return m6.a.h(gk.b.q("GridLocation(page=", this.f12440a, ", row=", this.f12441b, ", column="), this.f12442c, ", widthSpan=1, heightSpan=1)");
    }
}
