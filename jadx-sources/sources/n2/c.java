package n2;

import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class c extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f11893b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.c f11894c;

    public c(ej.c cVar, ej.c cVar2) {
        this.f11893b = cVar;
        this.f11894c = cVar2;
    }

    @Override // v2.x0
    public final n d() {
        f fVar = new f();
        fVar.H = this.f11893b;
        fVar.I = this.f11894c;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11893b == cVar.f11893b && this.f11894c == cVar.f11894c;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        f fVar = (f) nVar;
        fVar.H = this.f11893b;
        fVar.I = this.f11894c;
    }

    public final int hashCode() {
        ej.c cVar = this.f11893b;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        ej.c cVar2 = this.f11894c;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
