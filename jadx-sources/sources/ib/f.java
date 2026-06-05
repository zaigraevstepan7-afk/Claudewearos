package ib;

import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f8416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8418c;

    public f(List list, String str, int i10) {
        this.f8416a = list;
        this.f8417b = str;
        this.f8418c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(this.f8416a, fVar.f8416a) && fj.l.b(this.f8417b, fVar.f8417b) && this.f8418c == fVar.f8418c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8418c) + m1.c(this.f8416a.hashCode() * 31, 31, this.f8417b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HomeScreenBottomBarState(dockDisplayables=");
        sb2.append(this.f8416a);
        sb2.append(", searchQuery=");
        sb2.append(this.f8417b);
        sb2.append(", currentPage=");
        return m6.a.h(sb2, this.f8418c, ")");
    }
}
