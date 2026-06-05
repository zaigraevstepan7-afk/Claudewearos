package m8;

import fj.l;
import h8.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j f11426a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11427b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.h f11428c;

    public g(j jVar, boolean z2, k8.h hVar) {
        this.f11426a = jVar;
        this.f11427b = z2;
        this.f11428c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.b(this.f11426a, gVar.f11426a) && this.f11427b == gVar.f11427b && this.f11428c == gVar.f11428c;
    }

    public final int hashCode() {
        return this.f11428c.hashCode() + gk.b.i(this.f11426a.hashCode() * 31, 31, this.f11427b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f11426a + ", isSampled=" + this.f11427b + ", dataSource=" + this.f11428c + ')';
    }
}
