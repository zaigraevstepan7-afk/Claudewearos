package cb;

import b0.o1;
import b0.q1;
import b0.r;
import b0.r1;
import b0.t1;
import c1.a2;
import c1.v7;
import c2.e0;
import c2.w;
import c2.z0;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.s;
import g3.n0;
import i2.h0;
import java.util.ArrayList;
import lb.q3;
import pi.o;
import t2.q0;
import u1.p;
import v.n;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f3164b;

    public /* synthetic */ e(a1 a1Var, int i10) {
        this.f3163a = i10;
        this.f3164b = a1Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        i0 i0Var;
        int i10 = this.f3163a;
        o oVar = o.f13011a;
        a1 a1Var = this.f3164b;
        switch (i10) {
            case 0:
                i0 i0Var2 = (i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (!i0Var2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i0Var2.W();
                    break;
                } else {
                    v7.a(((Boolean) a1Var.getValue()).booleanValue() ? "Collapse" : "Expand", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 0, 0, 262142);
                    break;
                }
            case 1:
                i0 i0Var3 = (i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                boolean z2 = (iIntValue2 & 17) != 16;
                f2 f2Var = i0Var3.f6313a;
                if (!i0Var3.T(iIntValue2 & 1, z2)) {
                    i0Var3.W();
                    break;
                } else {
                    float f10 = 8;
                    v1.l lVar = v1.l.f17564b;
                    b0.d.e(i0Var3, t1.e(f10, lVar));
                    float f11 = 12;
                    v1.o oVarF = n.f(y8.f.c(f11, b0.d.v(t1.c(1.0f, lVar), 16, 0.0f, 2)), e0.d(4293256682L), e0.f2986b);
                    q0 q0VarD = r.d(v1.b.f17550d, false);
                    int iHashCode = Long.hashCode(i0Var3.T);
                    n1 n1VarL = i0Var3.l();
                    v1.o oVarC = v1.a.c(i0Var3, oVarF);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar);
                    } else {
                        i0Var3.o0();
                    }
                    v2.e eVar = v2.g.f17649f;
                    s.M(eVar, i0Var3, q0VarD);
                    v2.e eVar2 = v2.g.f17648e;
                    s.M(eVar2, i0Var3, n1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    v2.e eVar3 = v2.g.f17650g;
                    s.w(i0Var3, numValueOf, eVar3);
                    v2.d dVar = v2.g.f17651h;
                    s.I(dVar, i0Var3);
                    v2.e eVar4 = v2.g.f17647d;
                    s.M(eVar4, i0Var3, oVarC);
                    v1.f fVar2 = v1.b.D;
                    v1.o oVarU = b0.d.u(lVar, f11, 10);
                    q1 q1VarA = o1.a(b0.j.f1359a, fVar2, i0Var3, 48);
                    int iHashCode2 = Long.hashCode(i0Var3.T);
                    n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC2 = v1.a.c(i0Var3, oVarU);
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar);
                    } else {
                        i0Var3.o0();
                    }
                    s.M(eVar, i0Var3, q1VarA);
                    s.M(eVar2, i0Var3, n1VarL2);
                    gk.b.u(iHashCode2, i0Var3, eVar3, i0Var3, dVar);
                    s.M(eVar4, i0Var3, oVarC2);
                    i2.f fVarB = p.f16585b;
                    if (fVarB == null) {
                        i2.e eVar5 = new i2.e("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = h0.f8270a;
                        z0 z0Var = new z0(w.f3052b);
                        d8.e eVar6 = new d8.e(9);
                        eVar6.x(15.5f, 14.0f);
                        eVar6.u(-0.79f);
                        eVar6.w(-0.28f, -0.27f);
                        eVar6.n(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                        eVar6.n(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                        eVar6.C(3.0f, 5.91f, 3.0f, 9.5f);
                        eVar6.C(5.91f, 16.0f, 9.5f, 16.0f);
                        eVar6.o(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                        eVar6.w(0.27f, 0.28f);
                        eVar6.H(0.79f);
                        eVar6.w(5.0f, 4.99f);
                        eVar6.v(20.49f, 19.0f);
                        eVar6.w(-4.99f, -5.0f);
                        eVar6.k();
                        eVar6.x(9.5f, 14.0f);
                        eVar6.n(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                        eVar6.C(7.01f, 5.0f, 9.5f, 5.0f);
                        eVar6.C(14.0f, 7.01f, 14.0f, 9.5f);
                        eVar6.C(11.99f, 14.0f, 9.5f, 14.0f);
                        eVar6.k();
                        i2.e.a(eVar5, (ArrayList) eVar6.f5001a, z0Var);
                        fVarB = eVar5.b();
                        p.f16585b = fVarB;
                    }
                    a2.b(fVarB, null, t1.k(18, lVar), q3.f10600d, i0Var3, 3504, 0);
                    b0.d.e(i0Var3, t1.o(f10, lVar));
                    String str = (String) a1Var.getValue();
                    n0 n0Var = new n0(q3.f10599c, hj.a.x(16), null, null, null, 0L, null, 0, 0L, null, 16777212);
                    z0 z0Var2 = new z0(q3.f10601e);
                    v1.o oVarC3 = t1.c(1.0f, lVar);
                    Object objQ = i0Var3.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new ab.i(a1Var, 13);
                        i0Var3.l0(objQ);
                    }
                    k0.i.a(str, (ej.c) objQ, oVarC3, false, n0Var, null, null, true, 0, 0, null, null, null, z0Var2, p1.j.d(-572290226, new e(a1Var, 2), i0Var3), i0Var3, 100663728, 221184, 16088);
                    i0Var3.p(true);
                    i0Var3.p(true);
                    b0.d.e(i0Var3, t1.e(24, lVar));
                    break;
                }
            default:
                ej.e eVar7 = (ej.e) obj;
                i0 i0Var4 = (i0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fj.l.f(eVar7, "inner");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= i0Var4.h(eVar7) ? 4 : 2;
                }
                int i12 = iIntValue3;
                if (!i0Var4.T(i12 & 1, (i12 & 19) != 18)) {
                    i0Var4.W();
                    break;
                } else {
                    if (((String) a1Var.getValue()).length() == 0) {
                        i0Var4.b0(1922115857);
                        v7.a("Search settings", null, q3.f10600d, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 24966, 0, 262122);
                        i0Var = i0Var4;
                        i0Var.p(false);
                    } else {
                        i0Var = i0Var4;
                        i0Var.b0(1922241748);
                        i0Var.p(false);
                    }
                    eVar7.invoke(i0Var, Integer.valueOf(i12 & 14));
                    break;
                }
        }
        return oVar;
    }
}
