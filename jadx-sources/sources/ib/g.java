package ib;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f8420a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8421b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8422c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8423d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f8424e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8425f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f8426g;

    /* renamed from: h, reason: collision with root package name */
    public final va.v f8427h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8428i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8429k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8430l;

    public g(p0 p0Var, f fVar, List list, List list2, Set set, List list3, Map map, va.v vVar, boolean z2, String str, boolean z10, boolean z11) {
        fj.l.f(list3, "filteredApps");
        fj.l.f(map, "folders");
        this.f8420a = p0Var;
        this.f8421b = fVar;
        this.f8422c = list;
        this.f8423d = list2;
        this.f8424e = set;
        this.f8425f = list3;
        this.f8426g = map;
        this.f8427h = vVar;
        this.f8428i = z2;
        this.j = str;
        this.f8429k = z10;
        this.f8430l = z11;
    }

    public final List a() {
        return this.f8425f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return fj.l.b(this.f8420a, gVar.f8420a) && fj.l.b(this.f8421b, gVar.f8421b) && fj.l.b(this.f8422c, gVar.f8422c) && fj.l.b(this.f8423d, gVar.f8423d) && fj.l.b(this.f8424e, gVar.f8424e) && fj.l.b(this.f8425f, gVar.f8425f) && fj.l.b(this.f8426g, gVar.f8426g) && fj.l.b(this.f8427h, gVar.f8427h) && this.f8428i == gVar.f8428i && fj.l.b(this.j, gVar.j) && this.f8429k == gVar.f8429k && this.f8430l == gVar.f8430l;
    }

    public final int hashCode() {
        int iHashCode = (this.f8426g.hashCode() + gk.b.h((this.f8424e.hashCode() + gk.b.h(gk.b.h((this.f8421b.hashCode() + (this.f8420a.hashCode() * 31)) * 31, 31, this.f8422c), 31, this.f8423d)) * 31, 31, this.f8425f)) * 31;
        va.v vVar = this.f8427h;
        int i10 = gk.b.i((iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31, 31, this.f8428i);
        String str = this.j;
        return Boolean.hashCode(this.f8430l) + gk.b.i((i10 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f8429k);
    }

    public final String toString() {
        return "HomeScreenContentState(gridState=" + this.f8420a + ", bottomBarState=" + this.f8421b + ", allApps=" + this.f8422c + ", devSheetApps=" + this.f8423d + ", visibleGridAppPackageNames=" + this.f8424e + ", filteredApps=" + this.f8425f + ", folders=" + this.f8426g + ", openFolderData=" + this.f8427h + ", showPinCodeOverlay=" + this.f8428i + ", pinCodeFolderId=" + this.j + ", pinCodeVerifyMode=" + this.f8429k + ", pinCodeError=" + this.f8430l + ")";
    }
}
