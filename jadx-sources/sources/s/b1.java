package s;

import t.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final fj.m f14563a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f14564b;

    /* JADX WARN: Multi-variable type inference failed */
    public b1(ej.c cVar, o1 o1Var) {
        this.f14563a = (fj.m) cVar;
        this.f14564b = o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f14563a.equals(b1Var.f14563a) && this.f14564b.equals(b1Var.f14564b);
    }

    public final int hashCode() {
        return this.f14564b.hashCode() + (this.f14563a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f14563a + ", animationSpec=" + this.f14564b + ')';
    }
}
