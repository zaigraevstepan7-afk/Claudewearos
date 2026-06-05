package m8;

import fj.l;
import k8.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final o f11429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11430b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.h f11431c;

    public h(o oVar, String str, k8.h hVar) {
        this.f11429a = oVar;
        this.f11430b = str;
        this.f11431c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.b(this.f11429a, hVar.f11429a) && l.b(this.f11430b, hVar.f11430b) && this.f11431c == hVar.f11431c;
    }

    public final int hashCode() {
        int iHashCode = this.f11429a.hashCode() * 31;
        String str = this.f11430b;
        return this.f11431c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f11429a + ", mimeType=" + this.f11430b + ", dataSource=" + this.f11431c + ')';
    }
}
