package h0;

import fj.l;
import v1.n;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class a extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final c f7557b;

    public a(c cVar) {
        this.f7557b = cVar;
    }

    @Override // v2.x0
    public final n d() {
        e eVar = new e();
        eVar.H = this.f7557b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return l.b(this.f7557b, ((a) obj).f7557b);
        }
        return false;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        e eVar = (e) nVar;
        c cVar = eVar.H;
        if (cVar != null) {
            cVar.f7565a.k(eVar);
        }
        c cVar2 = this.f7557b;
        if (cVar2 != null) {
            cVar2.f7565a.b(eVar);
        }
        eVar.H = cVar2;
    }

    public final int hashCode() {
        return this.f7557b.hashCode();
    }
}
