package o2;

import a2.f0;
import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class e extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final a f12381b;

    /* renamed from: c, reason: collision with root package name */
    public final d f12382c;

    public e(a aVar, d dVar) {
        this.f12381b = aVar;
        this.f12382c = dVar;
    }

    @Override // v2.x0
    public final n d() {
        return new i(this.f12381b, this.f12382c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.b(eVar.f12381b, this.f12381b) && l.b(eVar.f12382c, this.f12382c);
    }

    @Override // v2.x0
    public final void g(n nVar) {
        i iVar = (i) nVar;
        iVar.H = this.f12381b;
        d dVar = iVar.I;
        if (dVar.f12377a == iVar) {
            dVar.f12377a = null;
        }
        d dVar2 = this.f12382c;
        if (dVar2 == null) {
            iVar.I = new d();
        } else if (!dVar2.equals(dVar)) {
            iVar.I = dVar2;
        }
        if (iVar.G) {
            d dVar3 = iVar.I;
            dVar3.f12377a = iVar;
            dVar3.f12378b = null;
            iVar.J = null;
            dVar3.f12379c = new f0(iVar, 8);
            dVar3.f12380d = iVar.e1();
        }
    }

    public final int hashCode() {
        int iHashCode = this.f12381b.hashCode() * 31;
        d dVar = this.f12382c;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
