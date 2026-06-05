package d3;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends x0 implements o {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f4711b;

    public c(ej.c cVar) {
        this.f4711b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new e(false, true, this.f4711b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f4711b == ((c) obj).f4711b;
        }
        return false;
    }

    @Override // d3.o
    public final n f() {
        n nVar = new n();
        nVar.f4760c = false;
        nVar.f4761d = true;
        this.f4711b.invoke(nVar);
        return nVar;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        ((e) nVar).J = this.f4711b;
    }

    public final int hashCode() {
        return this.f4711b.hashCode();
    }
}
