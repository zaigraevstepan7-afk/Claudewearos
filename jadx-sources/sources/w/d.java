package w;

import ab.g;
import f1.i0;
import f1.t1;
import k0.c1;
import t1.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final q f18147a = new q();

    public static void b(d dVar, ej.e eVar, p1.e eVar2, ej.a aVar, int i10) {
        if ((i10 & 8) != 0) {
            eVar2 = null;
        }
        dVar.f18147a.add(new p1.e(new c1(eVar, dVar, eVar2, aVar), true, -1789283891));
    }

    public final void a(c cVar, i0 i0Var, int i10) {
        i0Var.c0(-798501095);
        int i11 = (i0Var.f(cVar) ? 4 : 2) | i10 | (i0Var.f(this) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            q qVar = this.f18147a;
            int size = qVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((ej.f) qVar.get(i12)).c(cVar, i0Var, Integer.valueOf(i11 & 14));
            }
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g(this, i10, 25, cVar);
        }
    }
}
