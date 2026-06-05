package na;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11968a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11970c;

    public b(int i10, String str, String str2) {
        this.f11968a = str;
        this.f11969b = str2;
        this.f11970c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f11968a, bVar.f11968a) && l.b(this.f11969b, bVar.f11969b) && this.f11970c == bVar.f11970c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11970c) + m1.c(this.f11968a.hashCode() * 31, 31, this.f11969b);
    }

    public final String toString() {
        return m6.a.h(m1.m("AppCategory(id=", this.f11968a, ", name=", this.f11969b, ", appCount="), this.f11970c, ")");
    }
}
