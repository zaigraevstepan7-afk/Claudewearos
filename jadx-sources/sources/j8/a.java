package j8;

import fj.l;
import h8.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r8.g f8736a;

    /* renamed from: b, reason: collision with root package name */
    public final i8.b f8737b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8738c;

    public a(m mVar, i8.b bVar, r8.g gVar) {
        this.f8736a = gVar;
        this.f8737b = bVar;
        this.f8738c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        i8.b bVar = aVar.f8737b;
        i8.b bVar2 = this.f8737b;
        return l.b(bVar2, bVar) && bVar2.a(this.f8736a, aVar.f8736a) && this.f8738c.equals(aVar.f8738c);
    }

    public final int hashCode() {
        i8.b bVar = this.f8737b;
        return this.f8738c.hashCode() + ((bVar.b(this.f8736a) + (bVar.hashCode() * 31)) * 31);
    }
}
