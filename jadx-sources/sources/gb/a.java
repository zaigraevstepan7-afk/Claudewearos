package gb;

import b0.b0;
import b0.c0;
import b0.r1;
import b0.t1;
import b0.z;
import c2.e0;
import f1.i0;
import f1.n1;
import f1.r2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final r2 f7269a = new r2(new fa.a(11));

    public static final void a(r1 r1Var, ej.a aVar, v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        v1.o oVar2;
        fj.l.f(r1Var, "<this>");
        fj.l.f(aVar, "onClick");
        i0Var.c0(-809361474);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(r1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.h(eVar) ? 2048 : 1024;
        }
        int i13 = i12;
        if (i0Var.T(i13 & 1, (i13 & 1171) != 1170)) {
            ej.a aVar2 = (ej.a) i0Var.j(f7269a);
            ki.b bVar = ki.a.f9650a;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = z1.h.c(lVar, bVar);
            d3.j jVar = new d3.j(4);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = new fa.a(10);
                i0Var.l0(objQ);
            }
            v1.o oVarA = r1.a(r1Var, v.n.m(oVarC, null, jVar, (ej.a) objQ, aVar, 428).c(t1.f1432b));
            boolean zF = i0Var.f(aVar2);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new c1.l(5, aVar2);
                i0Var.l0(objQ2);
            }
            v1.o oVarQ = e0.q(oVarA, (ej.c) objQ2);
            b0.c cVar = b0.j.f1359a;
            int i14 = (i13 & 7168) | 432;
            b0 b0VarA = z.a(new b0.h(2.0f, false, new b0.b(2)), v1.b.F, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarQ);
            v2.h.f17668w.getClass();
            ej.a aVar3 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar3);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            eVar.c(c0.f1285a, i0Var, Integer.valueOf(((i14 >> 6) & 112) | 6));
            i0Var.p(true);
            oVar2 = lVar;
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(r1Var, aVar, oVar2, eVar, i10, 3);
        }
    }
}
