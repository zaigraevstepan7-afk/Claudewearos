package sg;

import r5.g;
import rg.h;
import ug.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends g {
    public b(d dVar, h hVar) {
        super(4, dVar, hVar);
        l.b("Can't have a listen complete from a user source", !(dVar.f15035a == 1));
    }

    public final String toString() {
        return "ListenComplete { path=" + ((h) this.f13732c) + ", source=" + ((d) this.f13731b) + " }";
    }

    @Override // r5.g
    public final g w(zg.c cVar) {
        d dVar = (d) this.f13731b;
        h hVar = (h) this.f13732c;
        return hVar.isEmpty() ? new b(dVar, h.f14414d) : new b(dVar, hVar.C());
    }
}
