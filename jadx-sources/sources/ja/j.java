package ja;

import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8784a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8785b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8787d;

    public j(String str, String str2, List list, boolean z2) {
        fj.l.f(list, "packageNames");
        this.f8784a = str;
        this.f8785b = str2;
        this.f8786c = list;
        this.f8787d = z2;
    }

    public static j a(j jVar, boolean z2) {
        String str = jVar.f8784a;
        String str2 = jVar.f8785b;
        List list = jVar.f8786c;
        fj.l.f(list, "packageNames");
        return new j(str, str2, list, z2);
    }

    public final String b() {
        return m1.i("folder:", this.f8784a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return fj.l.b(this.f8784a, jVar.f8784a) && fj.l.b(this.f8785b, jVar.f8785b) && fj.l.b(this.f8786c, jVar.f8786c) && this.f8787d == jVar.f8787d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8787d) + gk.b.h(m1.c(this.f8784a.hashCode() * 31, 31, this.f8785b), 31, this.f8786c);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("FolderData(id=", this.f8784a, ", name=", this.f8785b, ", packageNames=");
        sbM.append(this.f8786c);
        sbM.append(", locked=");
        sbM.append(this.f8787d);
        sbM.append(")");
        return sbM.toString();
    }
}
