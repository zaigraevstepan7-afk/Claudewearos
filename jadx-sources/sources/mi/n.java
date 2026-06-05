package mi;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f11770b;

    public n(p pVar) {
        this.f11770b = pVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new o(this.f11770b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f11770b.equals(((n) obj).f11770b) && Float.compare(0.0f, 0.0f) == 0;
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        o oVar = (o) nVar;
        fj.l.f(oVar, "node");
        t1.q qVar = oVar.I.f11771a;
        c cVar = oVar.H;
        boolean zContains = qVar.contains(cVar);
        if (zContains) {
            p pVar = oVar.I;
            pVar.getClass();
            fj.l.f(cVar, "area");
            pVar.f11771a.remove(cVar);
        }
        p pVar2 = this.f11770b;
        oVar.I = pVar2;
        if (zContains) {
            fj.l.f(cVar, "area");
            pVar2.f11771a.add(cVar);
        }
        cVar.f11739c.h(0.0f);
    }

    public final int hashCode() {
        return gk.b.f(0.0f, this.f11770b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HazeSourceElement(state=" + this.f11770b + ", zIndex=0.0, key=null)";
    }
}
