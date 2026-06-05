package j8;

import fj.l;
import qj.u;
import qj.v;
import ti.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f8747a;

    public d(h hVar) {
        this.f8747a = hVar;
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        return this.f8747a.C(gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return this.f8747a.F(eVar, obj);
    }

    @Override // ti.h
    public final h V(h hVar) {
        h hVarV = this.f8747a.V(hVar);
        int i10 = g.f8753b;
        u uVar = v.f13628b;
        v vVar = (v) C(uVar);
        v vVar2 = (v) hVarV.C(uVar);
        if ((vVar instanceof e) && !vVar.equals(vVar2)) {
            ((e) vVar).f8750d = 0;
        }
        return new d(hVarV);
    }

    public final boolean equals(Object obj) {
        return l.b(this.f8747a, obj);
    }

    public final int hashCode() {
        return this.f8747a.hashCode();
    }

    @Override // ti.h
    public final h s(ti.g gVar) {
        h hVarS = this.f8747a.s(gVar);
        int i10 = g.f8753b;
        u uVar = v.f13628b;
        v vVar = (v) C(uVar);
        v vVar2 = (v) hVarS.C(uVar);
        if ((vVar instanceof e) && !vVar.equals(vVar2)) {
            ((e) vVar).f8750d = 0;
        }
        return new d(hVarS);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f8747a + ")";
    }
}
