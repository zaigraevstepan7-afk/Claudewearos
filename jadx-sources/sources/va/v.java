package va;

import java.util.ArrayList;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f18007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18008b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18009c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18010d;

    public v(String str, String str2, ArrayList arrayList, boolean z2) {
        fj.l.f(str, "slotId");
        this.f18007a = str;
        this.f18008b = str2;
        this.f18009c = arrayList;
        this.f18010d = z2;
    }

    public final String a() {
        return this.f18007a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return fj.l.b(this.f18007a, vVar.f18007a) && this.f18008b.equals(vVar.f18008b) && this.f18009c.equals(vVar.f18009c) && this.f18010d == vVar.f18010d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18010d) + ((this.f18009c.hashCode() + m1.c(this.f18007a.hashCode() * 31, 31, this.f18008b)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("PresentationFolderData(slotId=", this.f18007a, ", name=", this.f18008b, ", apps=");
        sbM.append(this.f18009c);
        sbM.append(", locked=");
        sbM.append(this.f18010d);
        sbM.append(")");
        return sbM.toString();
    }
}
