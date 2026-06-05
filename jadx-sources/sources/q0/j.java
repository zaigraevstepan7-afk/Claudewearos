package q0;

import c1.i8;
import k0.v;
import v0.n0;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class j extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final t0.j f13164b;

    /* renamed from: c, reason: collision with root package name */
    public final i8 f13165c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f13166d;

    /* renamed from: e, reason: collision with root package name */
    public final v f13167e;

    public j(t0.j jVar, i8 i8Var, n0 n0Var, v vVar) {
        this.f13164b = jVar;
        this.f13165c = i8Var;
        this.f13166d = n0Var;
        this.f13167e = vVar;
    }

    @Override // v2.x0
    public final n d() {
        return new l(this.f13164b, this.f13165c, this.f13166d, this.f13167e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13164b == jVar.f13164b && this.f13165c == jVar.f13165c && this.f13166d == jVar.f13166d && this.f13167e == jVar.f13167e;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        l lVar = (l) nVar;
        lVar.J.f15363b = null;
        t0.j jVar = this.f13164b;
        lVar.J = jVar;
        jVar.f15363b = lVar;
        jVar.f15364c = lVar.G ? m.f13172c : m.f13171b;
        lVar.K = this.f13165c;
        lVar.L = this.f13166d;
        lVar.M = this.f13167e;
    }

    public final int hashCode() {
        return this.f13167e.hashCode() + ((this.f13166d.hashCode() + ((this.f13165c.hashCode() + (this.f13164b.hashCode() * 31)) * 31)) * 31);
    }
}
