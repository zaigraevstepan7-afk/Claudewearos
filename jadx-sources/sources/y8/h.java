package y8;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f20262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20264c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20265d;

    public h(String str, String str2, String str3, float f10) {
        this.f20262a = str;
        this.f20263b = str2;
        this.f20264c = str3;
        this.f20265d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.b(this.f20262a, hVar.f20262a) && l.b(this.f20263b, hVar.f20263b) && l.b(this.f20264c, hVar.f20264c) && Float.compare(this.f20265d, hVar.f20265d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20265d) + m1.c(m1.c(this.f20262a.hashCode() * 31, 31, this.f20263b), 31, this.f20264c);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("CardData(number=", this.f20262a, ", title=", this.f20263b, ", description=");
        sbM.append(this.f20264c);
        sbM.append(", alpha=");
        sbM.append(this.f20265d);
        sbM.append(")");
        return sbM.toString();
    }
}
