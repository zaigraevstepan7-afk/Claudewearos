package k0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pi.h f9071a;

    static {
        qi.s sVar = qi.s.f13520a;
        f9071a = new pi.h(sVar, sVar);
    }

    public static final void a(g3.f fVar, List list, f1.i0 i0Var, int i10) {
        i0Var.c0(-1794596951);
        int i11 = (i10 & 6) == 0 ? (i0Var.f(fVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(list) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g3.d dVar = (g3.d) list.get(i12);
                ej.f fVar2 = (ej.f) dVar.f7045a;
                int i13 = dVar.f7046b;
                int i14 = dVar.f7047c;
                Object objQ = i0Var.Q();
                if (objQ == f1.m.f6385a) {
                    objQ = c.f9056b;
                    i0Var.l0(objQ);
                }
                t2.q0 q0Var = (t2.q0) objQ;
                int iHashCode = Long.hashCode(i0Var.T);
                f1.n1 n1VarL = i0Var.l();
                v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
                v2.h.f17668w.getClass();
                v2.f fVar3 = v2.g.f17645b;
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(fVar3);
                } else {
                    i0Var.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var, q0Var);
                f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
                f1.s.I(v2.g.f17651h, i0Var);
                f1.s.M(v2.g.f17647d, i0Var, oVarC);
                fVar2.c(fVar.subSequence(i13, i14).f7081b, i0Var, 0);
                i0Var.p(true);
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(fVar, i10, 6, list);
        }
    }
}
