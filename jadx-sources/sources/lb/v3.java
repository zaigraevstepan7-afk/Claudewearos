package lb;

import c1.v7;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10747a = c2.e0.d(4281628918L);

    public static final void a(t3 t3Var, boolean z2, ej.a aVar, f1.i0 i0Var, int i10) {
        t3 t3Var2;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-804938627);
        int i11 = i10 | (i0Var2.d(t3Var.ordinal()) ? 4 : 2) | (i0Var2.g(z2) ? 32 : 16) | (i0Var2.h(aVar) ? 256 : 128);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            ga.c cVar = new ga.c(17, 1);
            v1.e eVar = v1.b.F;
            float f10 = 100;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarO = b0.t1.o(f10, lVar);
            Object objQ = i0Var2.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var2);
            }
            v1.o oVarK = v.n.k(oVarO, (z.k) objQ, null, false, null, aVar, 28);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, eVar, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarK);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar2 = v2.g.f17649f;
            f1.s.M(eVar2, i0Var2, b0VarA);
            v2.e eVar3 = v2.g.f17648e;
            f1.s.M(eVar3, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar4 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar4);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar5 = v2.g.f17647d;
            f1.s.M(eVar5, i0Var2, oVarC);
            v1.o oVarF = v.n.f(z1.h.c(b0.t1.l(lVar, f10, 125), cVar), c2.e0.d(4293256682L), c2.e0.f2986b);
            long j = f10747a;
            v1.o oVarC2 = oVarF.c(z2 ? v.n.h(lVar, (float) 2.5d, j, cVar) : lVar);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var.T);
            f1.n1 n1VarL2 = i0Var.l();
            v1.o oVarC3 = v1.a.c(i0Var, oVarC2);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar2, i0Var, q0VarD);
            f1.s.M(eVar3, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar4, i0Var, dVar);
            f1.s.M(eVar5, i0Var, oVarC3);
            i2.f fVarB = wd.a.f19279c;
            if (fVarB == null) {
                i2.e eVar6 = new i2.e("Rounded.QuestionMark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = i2.h0.f8270a;
                c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                d8.e eVar7 = new d8.e(9);
                eVar7.x(7.92f, 7.54f);
                eVar7.n(7.12f, 7.2f, 6.78f, 6.21f, 7.26f, 5.49f);
                eVar7.n(8.23f, 4.05f, 9.85f, 3.0f, 11.99f, 3.0f);
                eVar7.o(2.35f, 0.0f, 3.96f, 1.07f, 4.78f, 2.41f);
                eVar7.o(0.7f, 1.15f, 1.11f, 3.3f, 0.03f, 4.9f);
                eVar7.o(-1.2f, 1.77f, -2.35f, 2.31f, -2.97f, 3.45f);
                eVar7.o(-0.15f, 0.27f, -0.24f, 0.49f, -0.3f, 0.94f);
                eVar7.o(-0.09f, 0.73f, -0.69f, 1.3f, -1.43f, 1.3f);
                eVar7.o(-0.87f, 0.0f, -1.58f, -0.75f, -1.48f, -1.62f);
                eVar7.o(0.06f, -0.51f, 0.18f, -1.04f, 0.46f, -1.54f);
                eVar7.o(0.77f, -1.39f, 2.25f, -2.21f, 3.11f, -3.44f);
                eVar7.o(0.91f, -1.29f, 0.4f, -3.7f, -2.18f, -3.7f);
                eVar7.o(-1.17f, 0.0f, -1.93f, 0.61f, -2.4f, 1.34f);
                eVar7.n(9.26f, 7.61f, 8.53f, 7.79f, 7.92f, 7.54f);
                eVar7.k();
                eVar7.x(14.0f, 20.0f);
                eVar7.o(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                eVar7.D(-2.0f, -0.9f, -2.0f, -2.0f);
                eVar7.o(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                eVar7.C(14.0f, 18.9f, 14.0f, 20.0f);
                eVar7.k();
                i2.e.a(eVar6, (ArrayList) eVar7.f5001a, z0Var);
                fVarB = eVar6.b();
                wd.a.f19279c = fVarB;
            }
            c1.a2.b(fVarB, null, b0.t1.k(48, lVar), c2.e0.d(4291282892L), i0Var, 3504, 0);
            i0Var.p(true);
            b0.d.e(i0Var, b0.t1.e(8, lVar));
            t3Var2 = t3Var;
            v7.a(t3Var2.f10679a, null, z2 ? j : c2.w.f3052b, hj.a.x(13), z2 ? k3.s.A : k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24576, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            t3Var2 = t3Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r1(t3Var2, z2, aVar, i10, 1);
        }
    }

    public static final void b(t3 t3Var, mi.p pVar, ej.a aVar, ej.c cVar, f1.i0 i0Var, int i10) {
        fj.l.f(t3Var, "current");
        fj.l.f(aVar, "onDismiss");
        fj.l.f(cVar, "onEffectSelected");
        i0Var.c0(-1299067754);
        int i11 = i10 | (i0Var.d(t3Var.ordinal()) ? 4 : 2) | (i0Var.f(pVar) ? 32 : 16) | (i0Var.h(cVar) ? 2048 : 1024);
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = f1.s.A(t3Var);
                i0Var.l0(objQ);
            }
            c.b(pVar, aVar, false, null, false, 0.0f, 0L, false, false, 0.0f, null, null, false, false, 16, p1.j.d(-825576913, new u3(cVar, (f1.a1) objQ, 0), i0Var), i0Var, (i11 >> 3) & 126, 1769472, 32764);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.c(t3Var, pVar, aVar, cVar, i10, 2);
        }
    }
}
