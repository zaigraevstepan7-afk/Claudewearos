package rg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f14444a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14445b;

    /* renamed from: c, reason: collision with root package name */
    public String f14446c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f14445b == lVar.f14445b && this.f14444a.equals(lVar.f14444a)) {
            return this.f14446c.equals(lVar.f14446c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14446c.hashCode() + (((this.f14444a.hashCode() * 31) + (this.f14445b ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("http");
        sb2.append(this.f14445b ? "s" : "");
        sb2.append("://");
        sb2.append(this.f14444a);
        return sb2.toString();
    }
}
