package d1;

import b0.o1;
import b0.q1;
import b0.t1;
import c1.a2;
import c1.d3;
import c1.v7;
import f1.n1;
import java.util.ArrayList;
import lb.q3;
import t.m1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f4582b;

    public /* synthetic */ u0(int i10, ej.a aVar) {
        this.f4581a = i10;
        this.f4582b = aVar;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        z.k kVar;
        int i10 = this.f4581a;
        pi.o oVar = pi.o.f13011a;
        v1.l lVar = v1.l.f17564b;
        ej.a aVar = this.f4582b;
        f1.f fVar = f1.m.f6385a;
        switch (i10) {
            case 0:
                t2.s0 s0Var = (t2.s0) obj;
                t2.p0 p0Var = (t2.p0) obj2;
                s3.a aVar2 = (s3.a) obj3;
                float f10 = ((s3.f) aVar.a()).f14742a;
                f1 f1VarY = p0Var.Y(s3.a.a(aVar2.f14736a, 0, 0, s3.b.f(s3.f.e(f10, Float.NaN) ? 0 : s0Var.I0(f10), aVar2.f14736a), 0, 11));
                return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, qi.t.f13521a, new b0.l(f1VarY, 6));
            case 1:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v1.f fVar2 = v1.b.D;
                    float f11 = 8;
                    v1.o oVarU = b0.d.u(lVar, f11, f11);
                    q1 q1VarA = o1.a(b0.j.f1359a, fVar2, i0Var, 48);
                    int iHashCode = Long.hashCode(i0Var.T);
                    n1 n1VarL = i0Var.l();
                    v1.o oVarC = v1.a.c(i0Var, oVarU);
                    v2.h.f17668w.getClass();
                    v2.f fVar3 = v2.g.f17645b;
                    i0Var.e0();
                    if (i0Var.S) {
                        i0Var.k(fVar3);
                    } else {
                        i0Var.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                    f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var);
                    f1.s.M(v2.g.f17647d, i0Var, oVarC);
                    i2.f fVarH = u2.b.h();
                    long j = q3.f10601e;
                    v1.o oVarC2 = y8.f.c(10, t1.k(36, lVar));
                    Object objQ = i0Var.Q();
                    if (objQ == fVar) {
                        objQ = m1.p(i0Var);
                    }
                    a2.b(fVarH, "Back", b0.d.t(6, v.n.k(oVarC2, (z.k) objQ, null, false, null, this.f4582b, 28)), j, i0Var, 3120, 0);
                    i0Var.p(true);
                    v7.a("Icon Pack", b0.d.u(lVar, 20, 4), q3.f10599c, hj.a.x(34), k3.s.B, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597878, 0, 262056);
                } else {
                    i0Var.W();
                }
                return oVar;
            case 2:
                f1.i0 i0Var2 = (f1.i0) obj2;
                ((Integer) obj3).getClass();
                i0Var2.b0(-756081143);
                v.a1 a1Var = (v.a1) i0Var2.j(v.x0.f17331a);
                if (a1Var != null) {
                    i0Var2.b0(-1604682242);
                    i0Var2.p(false);
                    kVar = null;
                } else {
                    i0Var2.b0(-1604549624);
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = m1.p(i0Var2);
                    }
                    kVar = (z.k) objQ2;
                    i0Var2.p(false);
                }
                v1.o oVarJ = v.n.j(v1.l.f17564b, kVar, a1Var, true, null, this.f4582b);
                i0Var2.p(false);
                return oVarJ;
            default:
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$ModalBottomSheet");
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v1.o oVarC3 = t1.c(1.0f, lVar);
                    Object objQ3 = i0Var3.Q();
                    if (objQ3 == fVar) {
                        objQ3 = m1.p(i0Var3);
                    }
                    z.k kVar2 = (z.k) objQ3;
                    boolean zF = i0Var3.f(aVar);
                    Object objQ4 = i0Var3.Q();
                    if (zF || objQ4 == fVar) {
                        objQ4 = new d3(11, aVar);
                        i0Var3.l0(objQ4);
                    }
                    v1.o oVarC4 = b0.d.C(b0.d.u(v.n.k(oVarC3, kVar2, null, false, null, (ej.a) objQ4, 28), 20, 18), b0.d.f1297g);
                    q1 q1VarA2 = o1.a(b0.j.g(16), v1.b.D, i0Var3, 54);
                    int iHashCode2 = Long.hashCode(i0Var3.T);
                    n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC5 = v1.a.c(i0Var3, oVarC4);
                    v2.h.f17668w.getClass();
                    v2.f fVar4 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar4);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var3, q1VarA2);
                    f1.s.M(v2.g.f17648e, i0Var3, n1VarL2);
                    f1.s.w(i0Var3, Integer.valueOf(iHashCode2), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var3);
                    f1.s.M(v2.g.f17647d, i0Var3, oVarC5);
                    i2.f fVarB = mk.b.f11831a;
                    if (fVarB == null) {
                        i2.e eVar = new i2.e("Rounded.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = i2.h0.f8270a;
                        c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                        d8.e eVar2 = new d8.e(9);
                        eVar2.x(20.0f, 6.0f);
                        eVar2.u(-8.0f);
                        eVar2.w(-1.41f, -1.41f);
                        eVar2.n(10.21f, 4.21f, 9.7f, 4.0f, 9.17f, 4.0f);
                        eVar2.v(4.0f, 4.0f);
                        eVar2.o(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                        eVar2.v(2.0f, 18.0f);
                        eVar2.o(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        eVar2.u(16.0f);
                        eVar2.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVar2.v(22.0f, 8.0f);
                        eVar2.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        eVar2.k();
                        eVar2.x(18.0f, 14.0f);
                        eVar2.u(-2.0f);
                        eVar2.H(2.0f);
                        eVar2.o(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        eVar2.D(-1.0f, -0.45f, -1.0f, -1.0f);
                        eVar2.H(-2.0f);
                        eVar2.u(-2.0f);
                        eVar2.o(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVar2.D(0.45f, -1.0f, 1.0f, -1.0f);
                        eVar2.u(2.0f);
                        eVar2.H(-2.0f);
                        eVar2.o(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        eVar2.D(1.0f, 0.45f, 1.0f, 1.0f);
                        eVar2.H(2.0f);
                        eVar2.u(2.0f);
                        eVar2.o(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        eVar2.D(-0.45f, 1.0f, -1.0f, 1.0f);
                        eVar2.k();
                        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
                        fVarB = eVar.b();
                        mk.b.f11831a = fVarB;
                    }
                    i2.f fVar5 = fVarB;
                    long j4 = c2.w.f3054d;
                    a2.b(fVar5, "Create folder", t1.k(24, lVar), j4, i0Var3, 3504, 0);
                    v7.a("Create Folder", null, j4, hj.a.x(17), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 24966, 0, 262122);
                    i0Var3.p(true);
                } else {
                    i0Var3.W();
                }
                return oVar;
        }
    }
}
