package mi;

import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class j extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f11765b;

    /* renamed from: c, reason: collision with root package name */
    public final q f11766c;

    public j(p pVar, q qVar) {
        this.f11765b = pVar;
        this.f11766c = qVar;
    }

    @Override // v2.x0
    public final v1.n d() {
        return new i(this.f11765b, this.f11766c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return fj.l.b(this.f11765b, jVar.f11765b) && this.f11766c.equals(jVar.f11766c);
    }

    @Override // v2.x0
    public final void g(v1.n nVar) {
        i iVar = (i) nVar;
        fj.l.f(iVar, "node");
        iVar.H = this.f11765b;
        q qVar = iVar.L;
        q qVar2 = this.f11766c;
        if (!fj.l.b(qVar, qVar2)) {
            iVar.s1(iVar.L, qVar2);
            iVar.L = qVar2;
        }
        iVar.F0();
    }

    public final int hashCode() {
        p pVar = this.f11765b;
        return (this.f11766c.hashCode() + ((pVar == null ? 0 : pVar.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.f11765b + ", style=" + this.f11766c + ", block=null)";
    }
}
