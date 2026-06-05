package sg;

import r5.g;
import rg.h;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: d, reason: collision with root package name */
    public final rg.b f15032d;

    public c(d dVar, h hVar, rg.b bVar) {
        super(2, dVar, hVar);
        this.f15032d = bVar;
    }

    public final String toString() {
        return "Merge { path=" + ((h) this.f13732c) + ", source=" + ((d) this.f13731b) + ", children=" + this.f15032d + " }";
    }

    @Override // r5.g
    public final g w(zg.c cVar) {
        d dVar = (d) this.f13731b;
        h hVar = (h) this.f13732c;
        boolean zIsEmpty = hVar.isEmpty();
        rg.b bVar = this.f15032d;
        if (!zIsEmpty) {
            if (hVar.z().equals(cVar)) {
                return new c(dVar, hVar.C(), bVar);
            }
            return null;
        }
        rg.b bVarX = bVar.x(new h(cVar));
        ug.e eVar = bVarX.f14383a;
        if (eVar.isEmpty()) {
            return null;
        }
        Object obj = eVar.f17072a;
        return ((r) obj) != null ? new e(dVar, h.f14414d, (r) obj) : new c(dVar, h.f14414d, bVarX);
    }
}
