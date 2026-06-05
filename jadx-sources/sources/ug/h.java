package ug;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public rg.l f17077a;

    /* renamed from: b, reason: collision with root package name */
    public rg.h f17078b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f17077a.equals(hVar.f17077a)) {
            return this.f17078b.equals(hVar.f17078b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17078b.hashCode() + (this.f17077a.hashCode() * 31);
    }
}
