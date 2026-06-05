package xa;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19863b;

    /* renamed from: c, reason: collision with root package name */
    public final d f19864c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f19865d;

    public f(int i10, String str, d dVar, Boolean bool) {
        l.f(str, "packageName");
        l.f(dVar, "displayableIcon");
        this.f19862a = i10;
        this.f19863b = str;
        this.f19864c = dVar;
        this.f19865d = bool;
    }

    public static f a(f fVar, d dVar, Boolean bool, int i10) {
        int i11 = fVar.f19862a;
        String str = fVar.f19863b;
        if ((i10 & 4) != 0) {
            dVar = fVar.f19864c;
        }
        if ((i10 & 8) != 0) {
            bool = fVar.f19865d;
        }
        fVar.getClass();
        l.f(str, "packageName");
        l.f(dVar, "displayableIcon");
        return new f(i11, str, dVar, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f19862a == fVar.f19862a && l.b(this.f19863b, fVar.f19863b) && l.b(this.f19864c, fVar.f19864c) && l.b(this.f19865d, fVar.f19865d);
    }

    public final int hashCode() {
        int iHashCode = (this.f19864c.hashCode() + m1.c(Integer.hashCode(this.f19862a) * 31, 31, this.f19863b)) * 31;
        Boolean bool = this.f19865d;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "DisplayableItemData(id=" + this.f19862a + ", packageName=" + this.f19863b + ", displayableIcon=" + this.f19864c + ", isSelected=" + this.f19865d + ")";
    }
}
