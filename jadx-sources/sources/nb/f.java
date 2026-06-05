package nb;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i2.f f11995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11996b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11997c;

    public f(i2.f fVar, String str, String str2) {
        this.f11995a = fVar;
        this.f11996b = str;
        this.f11997c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(this.f11995a, fVar.f11995a) && fj.l.b(this.f11996b, fVar.f11996b) && fj.l.b(this.f11997c, fVar.f11997c);
    }

    public final int hashCode() {
        return this.f11997c.hashCode() + m1.c(this.f11995a.hashCode() * 31, 31, this.f11996b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProFeature(icon=");
        sb2.append(this.f11995a);
        sb2.append(", title=");
        sb2.append(this.f11996b);
        sb2.append(", subtitle=");
        return m6.a.j(sb2, this.f11997c, ")");
    }
}
