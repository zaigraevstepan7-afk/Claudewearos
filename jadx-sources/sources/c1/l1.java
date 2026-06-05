package c1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f2364a = new l1();

    public final void a(final z5 z5Var, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2 = i0Var;
        float f10 = z5Var.f2950f;
        i0Var2.c0(2137486921);
        int i11 = 2;
        int i12 = i10 | (i0Var2.f(z5Var) ? 4 : 2);
        if (i0Var2.T(i12 & 1, (i12 & 3) != 2)) {
            k8 k8Var = z5Var.f2952h;
            if (Float.isNaN(f10) || (Float.floatToRawIntBits(f10) & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            boolean zF = i0Var2.f(k8Var) | i0Var2.f(null);
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (zF || objQ == fVar) {
                objQ = f1.s.q(new k1(z5Var, 0));
                i0Var2.l0(objQ);
            }
            f1.q2 q2VarA = s.z0.a(((c2.w) ((f1.q2) objQ).getValue()).f3060a, z4.l(e1.u.f5671c, i0Var2), null, i0Var2, 0, 12);
            p1.e eVarD = p1.j.d(-1658896622, new g0(z5Var, i11), i0Var2);
            i0Var2.b0(690108113);
            i0Var2.p(false);
            v1.o oVar = z5Var.f2945a;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = oVar.c(lVar);
            boolean zF2 = i0Var2.f(q2VarA);
            Object objQ2 = i0Var2.Q();
            if (zF2 || objQ2 == fVar) {
                objQ2 = new ab.z(q2VarA, 2);
                i0Var2.l0(objQ2);
            }
            v1.o oVarE = z1.h.e(oVarC, (ej.c) objQ2);
            Object objQ3 = i0Var2.Q();
            if (objQ3 == fVar) {
                objQ3 = new ab.d(10);
                i0Var2.l0(objQ3);
            }
            v1.o oVarA = d3.p.a(oVarE, false, (ej.c) objQ3);
            Object objQ4 = i0Var2.Q();
            if (objQ4 == fVar) {
                objQ4 = j1.f2262b;
                i0Var2.l0(objQ4);
            }
            v1.o oVarA2 = p2.k0.a(oVarA, pi.o.f13011a, (PointerInputEventHandler) objQ4);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarA2);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            v2.e eVar = v2.g.f17650g;
            if (i0Var2.S || !fj.l.b(i0Var2.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var2, iHashCode, eVar);
            }
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            v1.o oVarD = z1.h.d(b0.d.B(lVar, z5Var.f2951g));
            f1.v vVar = p.f2567a;
            boolean z2 = (i12 & 14) == 4;
            Object objQ5 = i0Var2.Q();
            if (z2 || objQ5 == fVar) {
                objQ5 = new d1.j0() { // from class: c1.i1
                    @Override // d1.j0
                    public final float a() {
                        z5Var.getClass();
                        return 0.0f;
                    }
                };
                i0Var2.l0(objQ5);
            }
            d1.j0 j0Var = (d1.j0) objQ5;
            long j = k8Var.f2351c;
            long j4 = k8Var.f2352d;
            long j10 = k8Var.f2353e;
            long j11 = k8Var.f2354f;
            g3.n0 n0Var = z5Var.f2946b;
            g3.n0 n0Var2 = z5Var.f2947c;
            b0.f fVar3 = b0.j.f1363e;
            p1.e eVar2 = z5Var.f2948d;
            float f11 = z5Var.f2950f;
            Object objQ6 = i0Var2.Q();
            if (objQ6 == fVar) {
                objQ6 = new b6.j(7);
                i0Var2.l0(objQ6);
            }
            p.c(oVarD, j0Var, j, j4, j11, j10, n0Var, n0Var2, (ej.a) objQ6, fVar3, eVar2, eVarD, f11, i0Var2, 0);
            i0Var2 = i0Var2;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(this, i10, 4, z5Var);
        }
    }
}
