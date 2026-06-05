package n9;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11965b;

    /* renamed from: c, reason: collision with root package name */
    public final a f11966c;

    public b(String str, String str2, a aVar) {
        l.f(str, "label");
        this.f11964a = str;
        this.f11965b = str2;
        this.f11966c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f11964a, bVar.f11964a) && l.b(this.f11965b, bVar.f11965b) && l.b(this.f11966c, bVar.f11966c);
    }

    public final int hashCode() {
        return this.f11966c.hashCode() + m1.c(this.f11964a.hashCode() * 31, 31, this.f11965b);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("App(label=", this.f11964a, ", packageName=", this.f11965b, ", icon=");
        sbM.append(this.f11966c);
        sbM.append(")");
        return sbM.toString();
    }
}
