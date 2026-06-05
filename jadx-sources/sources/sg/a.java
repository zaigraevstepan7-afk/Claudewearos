package sg;

import r5.g;
import rg.h;
import ug.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15030d;

    /* renamed from: e, reason: collision with root package name */
    public final ug.e f15031e;

    public a(h hVar, ug.e eVar, boolean z2) {
        super(3, d.f15033d, hVar);
        this.f15031e = eVar;
        this.f15030d = z2;
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((h) this.f13732c) + ", revert=" + this.f15030d + ", affectedTree=" + this.f15031e + " }";
    }

    @Override // r5.g
    public final g w(zg.c cVar) {
        h hVar = (h) this.f13732c;
        boolean zIsEmpty = hVar.isEmpty();
        boolean z2 = this.f15030d;
        ug.e eVar = this.f15031e;
        if (!zIsEmpty) {
            l.b("operationForChild called for unrelated child.", hVar.z().equals(cVar));
            return new a(hVar.C(), eVar, z2);
        }
        if (eVar.f17072a != null) {
            l.b("affectedTree should not have overlapping affected paths.", eVar.f17073b.isEmpty());
            return this;
        }
        return new a(h.f14414d, eVar.A(new h(cVar)), z2);
    }
}
