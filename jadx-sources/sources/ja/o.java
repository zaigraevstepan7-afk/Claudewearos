package ja;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f8793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8795c;

    public o(String str, int i10, int i11) {
        fj.l.f(str, "packageName");
        this.f8793a = str;
        this.f8794b = i10;
        this.f8795c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return fj.l.b(this.f8793a, oVar.f8793a) && this.f8794b == oVar.f8794b && this.f8795c == oVar.f8795c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8795c) + gk.b.g(this.f8794b, this.f8793a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetSize(packageName=");
        sb2.append(this.f8793a);
        sb2.append(", widthSpan=");
        sb2.append(this.f8794b);
        sb2.append(", heightSpan=");
        return m6.a.h(sb2, this.f8795c, ")");
    }
}
