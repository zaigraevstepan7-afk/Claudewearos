package ib;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f8447a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8448b;

    /* renamed from: c, reason: collision with root package name */
    public final wa.n0 f8449c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8450d;

    /* renamed from: e, reason: collision with root package name */
    public final List f8451e;

    public p0(List list, List list2, wa.n0 n0Var, int i10, List list3) {
        fj.l.f(list3, "folderDisplayables");
        this.f8447a = list;
        this.f8448b = list2;
        this.f8449c = n0Var;
        this.f8450d = i10;
        this.f8451e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return fj.l.b(this.f8447a, p0Var.f8447a) && fj.l.b(this.f8448b, p0Var.f8448b) && fj.l.b(this.f8449c, p0Var.f8449c) && this.f8450d == p0Var.f8450d && fj.l.b(this.f8451e, p0Var.f8451e);
    }

    public final int hashCode() {
        return this.f8451e.hashCode() + gk.b.g(this.f8450d, (this.f8449c.hashCode() + gk.b.h(this.f8447a.hashCode() * 31, 31, this.f8448b)) * 31, 31);
    }

    public final String toString() {
        return "HomeScreenGridState(displayablePages=" + this.f8447a + ", slotPackages=" + this.f8448b + ", gridDimensions=" + this.f8449c + ", pageCount=" + this.f8450d + ", folderDisplayables=" + this.f8451e + ")";
    }
}
