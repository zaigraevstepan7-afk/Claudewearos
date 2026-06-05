package sg;

import r5.g;
import rg.h;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public final r f15038d;

    public e(d dVar, h hVar, r rVar) {
        super(1, dVar, hVar);
        this.f15038d = rVar;
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (h) this.f13732c, (d) this.f13731b, this.f15038d);
    }

    @Override // r5.g
    public final g w(zg.c cVar) {
        d dVar = (d) this.f13731b;
        h hVar = (h) this.f13732c;
        boolean zIsEmpty = hVar.isEmpty();
        r rVar = this.f15038d;
        return zIsEmpty ? new e(dVar, h.f14414d, rVar.t(cVar)) : new e(dVar, hVar.C(), rVar);
    }
}
