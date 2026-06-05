package v3;

import p2.e0;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class n extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final e0 f17855b;

    public n(e0 e0Var) {
        this.f17855b = e0Var;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new o(this.f17855b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f17855b == ((n) obj).f17855b;
        }
        return false;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        o oVar = (o) nVar;
        e0 e0Var = this.f17855b;
        oVar.H = e0Var;
        if (oVar.G) {
            e0Var.invoke(oVar.I);
        }
    }

    public final int hashCode() {
        return this.f17855b.hashCode();
    }
}
