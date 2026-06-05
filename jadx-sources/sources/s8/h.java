package s8;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f14786c;

    /* renamed from: a, reason: collision with root package name */
    public final c f14787a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14788b;

    static {
        b bVar = b.f14779a;
        f14786c = new h(bVar, bVar);
    }

    public h(c cVar, c cVar2) {
        this.f14787a = cVar;
        this.f14788b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.b(this.f14787a, hVar.f14787a) && l.b(this.f14788b, hVar.f14788b);
    }

    public final int hashCode() {
        return this.f14788b.hashCode() + (this.f14787a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f14787a + ", height=" + this.f14788b + ')';
    }
}
