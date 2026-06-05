package ib;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 implements b9.a {

    /* renamed from: w, reason: collision with root package name */
    public static final v0 f8461w;

    /* renamed from: a, reason: collision with root package name */
    public final List f8462a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8463b;

    /* renamed from: c, reason: collision with root package name */
    public final wa.n0 f8464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8465d;

    /* renamed from: e, reason: collision with root package name */
    public final List f8466e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8467f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8468g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f8469h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8470i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final float f8471k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f8472l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8473m;

    /* renamed from: n, reason: collision with root package name */
    public final Map f8474n;

    /* renamed from: o, reason: collision with root package name */
    public final List f8475o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f8476p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8477q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8478r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8479s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8480t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8481u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8482v;

    static {
        qi.s sVar = qi.s.f13520a;
        qi.u uVar = qi.u.f13522a;
        s0 s0Var = s0.f8456a;
        qi.t tVar = qi.t.f13521a;
        f8461w = new v0(sVar, sVar, new wa.n0(), 1, sVar, sVar, sVar, uVar, "", sVar, 68, s0Var, 0, tVar, sVar, tVar, null, false, null, false, false, false);
    }

    public v0(List list, List list2, wa.n0 n0Var, int i10, List list3, List list4, List list5, Set set, String str, List list6, float f10, q0 q0Var, int i11, Map map, List list7, Map map2, String str2, boolean z2, String str3, boolean z10, boolean z11, boolean z12) {
        fj.l.f(list6, "filteredApps");
        fj.l.f(map, "folders");
        fj.l.f(list7, "folderDisplayables");
        fj.l.f(map2, "presentationFolders");
        this.f8462a = list;
        this.f8463b = list2;
        this.f8464c = n0Var;
        this.f8465d = i10;
        this.f8466e = list3;
        this.f8467f = list4;
        this.f8468g = list5;
        this.f8469h = set;
        this.f8470i = str;
        this.j = list6;
        this.f8471k = f10;
        this.f8472l = q0Var;
        this.f8473m = i11;
        this.f8474n = map;
        this.f8475o = list7;
        this.f8476p = map2;
        this.f8477q = str2;
        this.f8478r = z2;
        this.f8479s = str3;
        this.f8480t = z10;
        this.f8481u = z11;
        this.f8482v = z12;
    }

    public static v0 a(v0 v0Var, ArrayList arrayList, List list, wa.n0 n0Var, int i10, ArrayList arrayList2, ArrayList arrayList3, List list2, LinkedHashSet linkedHashSet, String str, List list3, float f10, u0 u0Var, int i11, Map map, ArrayList arrayList4, LinkedHashMap linkedHashMap, String str2, boolean z2, String str3, boolean z10, boolean z11, boolean z12, int i12) {
        List list4 = (i12 & 1) != 0 ? v0Var.f8462a : arrayList;
        List list5 = (i12 & 2) != 0 ? v0Var.f8463b : list;
        wa.n0 n0Var2 = (i12 & 4) != 0 ? v0Var.f8464c : n0Var;
        int i13 = (i12 & 8) != 0 ? v0Var.f8465d : i10;
        List list6 = (i12 & 16) != 0 ? v0Var.f8466e : arrayList2;
        List list7 = (i12 & 32) != 0 ? v0Var.f8467f : arrayList3;
        List list8 = (i12 & 64) != 0 ? v0Var.f8468g : list2;
        Set set = (i12 & 128) != 0 ? v0Var.f8469h : linkedHashSet;
        String str4 = (i12 & 256) != 0 ? v0Var.f8470i : str;
        List list9 = (i12 & 512) != 0 ? v0Var.j : list3;
        float f11 = (i12 & 1024) != 0 ? v0Var.f8471k : f10;
        q0 q0Var = (i12 & 2048) != 0 ? v0Var.f8472l : u0Var;
        int i14 = (i12 & 4096) != 0 ? v0Var.f8473m : i11;
        Map map2 = (i12 & 8192) != 0 ? v0Var.f8474n : map;
        List list10 = list4;
        List list11 = (i12 & 16384) != 0 ? v0Var.f8475o : arrayList4;
        Map map3 = (i12 & 32768) != 0 ? v0Var.f8476p : linkedHashMap;
        List list12 = list5;
        String str5 = (i12 & 65536) != 0 ? v0Var.f8477q : str2;
        boolean z13 = (i12 & 131072) != 0 ? v0Var.f8478r : z2;
        String str6 = (i12 & 262144) != 0 ? v0Var.f8479s : str3;
        boolean z14 = (i12 & 524288) != 0 ? v0Var.f8480t : z10;
        boolean z15 = (i12 & 1048576) != 0 ? v0Var.f8481u : z11;
        v0Var.getClass();
        boolean z16 = z15;
        boolean z17 = (i12 & 4194304) != 0 ? v0Var.f8482v : z12;
        v0Var.getClass();
        fj.l.f(str4, "query");
        fj.l.f(list9, "filteredApps");
        fj.l.f(map2, "folders");
        fj.l.f(list11, "folderDisplayables");
        fj.l.f(map3, "presentationFolders");
        return new v0(list10, list12, n0Var2, i13, list6, list7, list8, set, str4, list9, f11, q0Var, i14, map2, list11, map3, str5, z13, str6, z14, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f8462a.equals(v0Var.f8462a) && this.f8463b.equals(v0Var.f8463b) && this.f8464c.equals(v0Var.f8464c) && this.f8465d == v0Var.f8465d && this.f8466e.equals(v0Var.f8466e) && this.f8467f.equals(v0Var.f8467f) && this.f8468g.equals(v0Var.f8468g) && this.f8469h.equals(v0Var.f8469h) && this.f8470i.equals(v0Var.f8470i) && fj.l.b(this.j, v0Var.j) && s3.f.e(this.f8471k, v0Var.f8471k) && this.f8472l.equals(v0Var.f8472l) && this.f8473m == v0Var.f8473m && fj.l.b(this.f8474n, v0Var.f8474n) && fj.l.b(this.f8475o, v0Var.f8475o) && fj.l.b(this.f8476p, v0Var.f8476p) && fj.l.b(this.f8477q, v0Var.f8477q) && this.f8478r == v0Var.f8478r && fj.l.b(this.f8479s, v0Var.f8479s) && this.f8480t == v0Var.f8480t && this.f8481u == v0Var.f8481u && this.f8482v == v0Var.f8482v;
    }

    public final int hashCode() {
        int iHashCode = (this.f8476p.hashCode() + gk.b.h((this.f8474n.hashCode() + gk.b.g(this.f8473m, (this.f8472l.hashCode() + gk.b.f(this.f8471k, gk.b.h(m1.c((this.f8469h.hashCode() + gk.b.h(gk.b.h(gk.b.h(gk.b.g(this.f8465d, (this.f8464c.hashCode() + gk.b.h(this.f8462a.hashCode() * 31, 31, this.f8463b)) * 31, 31), 31, this.f8466e), 31, this.f8467f), 31, this.f8468g)) * 31, 31, this.f8470i), 31, this.j), 31)) * 31, 31)) * 31, 31, this.f8475o)) * 31;
        String str = this.f8477q;
        int i10 = gk.b.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8478r);
        String str2 = this.f8479s;
        return Boolean.hashCode(this.f8482v) + gk.b.i(gk.b.i((i10 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f8480t), 961, this.f8481u);
    }

    public final String toString() {
        return "HomeScreenState(displayablePages=" + this.f8462a + ", gridSlotPackages=" + this.f8463b + ", gridDimensions=" + this.f8464c + ", gridPageCount=" + this.f8465d + ", dockDisplayables=" + this.f8466e + ", allApps=" + this.f8467f + ", devSheetApps=" + this.f8468g + ", visibleGridAppPackageNames=" + this.f8469h + ", query=" + this.f8470i + ", filteredApps=" + this.j + ", displayableCellSize=" + s3.f.f(this.f8471k) + ", screenMode=" + this.f8472l + ", currentPage=" + this.f8473m + ", folders=" + this.f8474n + ", folderDisplayables=" + this.f8475o + ", presentationFolders=" + this.f8476p + ", openFolderSlotId=" + this.f8477q + ", showPinCodeOverlay=" + this.f8478r + ", pinCodeFolderId=" + this.f8479s + ", pinCodeVerifyMode=" + this.f8480t + ", pinCodeError=" + this.f8481u + ", pinCodeErrorMessage=null, pinCodeRemoveLockMode=" + this.f8482v + ")";
    }
}
