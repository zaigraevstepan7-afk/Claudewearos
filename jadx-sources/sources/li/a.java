package li;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f10984a;

    /* renamed from: b, reason: collision with root package name */
    public final d f10985b;

    /* renamed from: c, reason: collision with root package name */
    public final d f10986c;

    /* renamed from: d, reason: collision with root package name */
    public final d f10987d;

    public a(d dVar, d dVar2, d dVar3, d dVar4) {
        this.f10984a = dVar;
        this.f10985b = dVar2;
        this.f10986c = dVar3;
        this.f10987d = dVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f10984a, aVar.f10984a) && l.b(this.f10985b, aVar.f10985b) && l.b(this.f10986c, aVar.f10986c) && l.b(this.f10987d, aVar.f10987d);
    }

    public final int hashCode() {
        return this.f10987d.hashCode() + ((this.f10986c.hashCode() + ((this.f10985b.hashCode() + (this.f10984a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CubicBezier(p0=" + this.f10984a + ", p1=" + this.f10985b + ", p2=" + this.f10986c + ", p3=" + this.f10987d + ")";
    }
}
