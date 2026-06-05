package mb;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11440c;

    public b(String str, String str2, boolean z2) {
        fj.l.f(str, "id");
        fj.l.f(str2, "fileName");
        this.f11438a = str;
        this.f11439b = str2;
        this.f11440c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return fj.l.b(this.f11438a, bVar.f11438a) && fj.l.b(this.f11439b, bVar.f11439b) && this.f11440c == bVar.f11440c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11440c) + m1.c(this.f11438a.hashCode() * 31, 31, this.f11439b);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("WallpaperCollectionItem(id=", this.f11438a, ", fileName=", this.f11439b, ", isUserAdded=");
        sbM.append(this.f11440c);
        sbM.append(")");
        return sbM.toString();
    }
}
