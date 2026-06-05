package gi;

import c2.b0;
import c2.c0;
import c2.g0;
import f1.i0;
import f1.m;
import fj.l;
import g3.y;
import v1.o;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final y f7436a = new y(13);

    public static final o a(o oVar, d dVar) {
        l.f(oVar, "<this>");
        l.f(dVar, "backdrop");
        return oVar.c(new e(dVar));
    }

    public static final b b(ej.c cVar, i0 i0Var) {
        l.f(cVar, "onDraw");
        Object objQ = i0Var.Q();
        if (objQ == m.f6385a) {
            objQ = new b(cVar);
            i0Var.l0(objQ);
        }
        return (b) objQ;
    }

    public static final c c(fi.a aVar, fi.a aVar2, i0 i0Var) {
        l.f(aVar, "backdrop1");
        l.f(aVar2, "backdrop2");
        boolean zF = i0Var.f(aVar) | i0Var.f(aVar2);
        Object objQ = i0Var.Q();
        if (zF || objQ == m.f6385a) {
            objQ = new c(aVar, aVar2);
            i0Var.l0(objQ);
        }
        return (c) objQ;
    }

    public static final d d(ej.c cVar, i0 i0Var, int i10, int i11) {
        int i12 = g0.f2998b;
        b0 b0Var = (b0) i0Var.j(f1.f18261g);
        Object objQ = i0Var.Q();
        Object obj = m.f6385a;
        if (objQ == obj) {
            objQ = new c0(b0Var);
            i0Var.l0(objQ);
        }
        f2.b bVar = ((c0) objQ).f2970b;
        if ((i11 & 2) != 0) {
            cVar = f7436a;
        }
        boolean zF = ((((i10 & 112) ^ 48) > 32 && i0Var.f(cVar)) || (i10 & 48) == 32) | i0Var.f(bVar);
        Object objQ2 = i0Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new d(bVar, cVar);
            i0Var.l0(objQ2);
        }
        return (d) objQ2;
    }
}
