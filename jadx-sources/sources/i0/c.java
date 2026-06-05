package i0;

import c1.b5;
import v.x0;
import v1.l;
import v1.o;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {
    public static o a(o oVar, boolean z2, k kVar, b5 b5Var, boolean z10, ej.a aVar) {
        o oVarC;
        if (b5Var != null) {
            oVarC = new a(z2, kVar, b5Var, z10, aVar);
        } else if (b5Var == null) {
            oVarC = new a(z2, kVar, null, z10, aVar);
        } else {
            l lVar = l.f17564b;
            oVarC = kVar != null ? x0.a(lVar, kVar, b5Var).c(new a(z2, kVar, null, z10, aVar)) : v1.a.a(lVar, new b(b5Var, z2, z10, aVar));
        }
        return oVar.c(oVarC);
    }

    public static final o b(o oVar, boolean z2, k kVar, boolean z10, d3.j jVar, ej.c cVar) {
        return oVar.c(new e(z2, kVar, z10, jVar, cVar));
    }

    public static final o c(f3.a aVar, b5 b5Var, boolean z2, d3.j jVar, ej.a aVar2) {
        if (b5Var != null) {
            return new i(aVar, null, b5Var, z2, jVar, aVar2);
        }
        if (b5Var == null) {
            return new i(aVar, null, null, z2, jVar, aVar2);
        }
        return v1.a.a(l.f17564b, new f(b5Var, aVar, z2, jVar, aVar2));
    }
}
