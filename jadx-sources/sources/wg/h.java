package wg;

import zg.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final rg.h f19305a;

    /* renamed from: b, reason: collision with root package name */
    public final g f19306b;

    public h(rg.h hVar, g gVar) {
        this.f19305a = hVar;
        this.f19306b = gVar;
    }

    public static h a(rg.h hVar) {
        return new h(hVar, g.f19299f);
    }

    public final boolean b() {
        g gVar = this.f19306b;
        return gVar.d() && gVar.f19304e.equals(s.f20617a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19305a.equals(hVar.f19305a) && this.f19306b.equals(hVar.f19306b);
    }

    public final int hashCode() {
        return this.f19306b.hashCode() + (this.f19305a.hashCode() * 31);
    }

    public final String toString() {
        return this.f19305a + ":" + this.f19306b;
    }
}
