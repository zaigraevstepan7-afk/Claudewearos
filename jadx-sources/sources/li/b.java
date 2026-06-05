package li;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f10988c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final c f10989a = c.f10991f;

    /* renamed from: b, reason: collision with root package name */
    public final c f10990b = c.f10992g;

    public final a a(c cVar) {
        c cVar2 = this.f10989a;
        if (cVar.equals(cVar2)) {
            return cVar2.a();
        }
        c cVar3 = this.f10990b;
        return cVar.equals(cVar3) ? cVar3.a() : cVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f10989a, bVar.f10989a) && l.b(this.f10990b, bVar.f10990b);
    }

    public final int hashCode() {
        return this.f10990b.hashCode() + (this.f10989a.hashCode() * 31);
    }

    public final String toString() {
        return "G2Continuity(profile=" + this.f10989a + ", capsuleProfile=" + this.f10990b + ")";
    }
}
