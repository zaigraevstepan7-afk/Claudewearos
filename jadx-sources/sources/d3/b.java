package d3;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends x0 implements o {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4707b;

    /* renamed from: c, reason: collision with root package name */
    public final ej.c f4708c;

    public b(ej.c cVar, boolean z2) {
        this.f4707b = z2;
        this.f4708c = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new e(this.f4707b, false, this.f4708c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4707b == bVar.f4707b && this.f4708c == bVar.f4708c;
    }

    @Override // d3.o
    public final n f() {
        n nVar = new n();
        nVar.f4760c = this.f4707b;
        this.f4708c.invoke(nVar);
        return nVar;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        e eVar = (e) nVar;
        eVar.H = this.f4707b;
        eVar.J = this.f4708c;
    }

    public final int hashCode() {
        return this.f4708c.hashCode() + (Boolean.hashCode(this.f4707b) * 31);
    }
}
