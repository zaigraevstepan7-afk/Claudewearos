package c2;

import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class o extends v2.x0 {

    /* renamed from: b, reason: collision with root package name */
    public final ej.c f3024b;

    public o(ej.c cVar) {
        this.f3024b = cVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new q(this.f3024b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f3024b == ((o) obj).f3024b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        i1 i1Var;
        q qVar = (q) nVar;
        ej.c cVar = this.f3024b;
        qVar.H = cVar;
        if (qVar.f17565a.G && (i1Var = v2.n.v(qVar, 2).I) != null) {
            i1Var.V1(cVar, true);
        }
    }

    public final int hashCode() {
        return this.f3024b.hashCode();
    }
}
