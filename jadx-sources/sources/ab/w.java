package ab;

import c2.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f357b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358c;

    public w(int i10, long j, int i11) {
        this.f356a = i10;
        this.f357b = i11;
        this.f358c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f356a == wVar.f356a && this.f357b == wVar.f357b && a1.a(this.f358c, wVar.f358c);
    }

    public final int hashCode() {
        int iG = gk.b.g(this.f357b, Integer.hashCode(this.f356a) * 31, 31);
        int i10 = a1.f2963c;
        return Long.hashCode(this.f358c) + iG;
    }

    public final String toString() {
        return m6.a.j(gk.b.q("ContextMenuLayoutMetrics(cardLeft=", this.f356a, ", cardTop=", this.f357b, ", transformOrigin="), a1.d(this.f358c), ")");
    }
}
