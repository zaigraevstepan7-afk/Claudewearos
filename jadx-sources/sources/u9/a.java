package u9;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16869a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16870b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16871c;

    public a(String str, e eVar, b bVar) {
        l.f(str, "name");
        this.f16869a = str;
        this.f16870b = eVar;
        this.f16871c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f16869a, aVar.f16869a) && this.f16870b.equals(aVar.f16870b) && this.f16871c.equals(aVar.f16871c);
    }

    public final int hashCode() {
        return this.f16871c.hashCode() + ((this.f16870b.hashCode() + (this.f16869a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AppDisplayableInfo(name=" + this.f16869a + ", packageName=" + this.f16870b + ", displayableIcon=" + this.f16871c + ")";
    }
}
