package n8;

import fj.l;
import h8.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f11911a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11912b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.h f11913c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11914d;

    public a(j jVar, boolean z2, k8.h hVar, String str) {
        this.f11911a = jVar;
        this.f11912b = z2;
        this.f11913c = hVar;
        this.f11914d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f11911a, aVar.f11911a) && this.f11912b == aVar.f11912b && this.f11913c == aVar.f11913c && l.b(this.f11914d, aVar.f11914d);
    }

    public final int hashCode() {
        int iHashCode = (this.f11913c.hashCode() + gk.b.i(this.f11911a.hashCode() * 31, 31, this.f11912b)) * 31;
        String str = this.f11914d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExecuteResult(image=");
        sb2.append(this.f11911a);
        sb2.append(", isSampled=");
        sb2.append(this.f11912b);
        sb2.append(", dataSource=");
        sb2.append(this.f11913c);
        sb2.append(", diskCacheKey=");
        return m6.a.i(sb2, this.f11914d, ')');
    }
}
