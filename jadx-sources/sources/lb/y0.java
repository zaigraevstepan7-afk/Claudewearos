package lb;

import c1.v7;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements ej.f {
    public final /* synthetic */ f1.f1 A;
    public final /* synthetic */ f1.f1 B;
    public final /* synthetic */ f1.f1 C;
    public final /* synthetic */ f1.f1 D;
    public final /* synthetic */ f1.a1 E;
    public final /* synthetic */ f1.a1 F;
    public final /* synthetic */ f1.a1 G;
    public final /* synthetic */ f1.f1 H;
    public final /* synthetic */ f1.f1 I;
    public final /* synthetic */ f1.f1 J;
    public final /* synthetic */ f1.a1 K;
    public final /* synthetic */ f1.f1 L;
    public final /* synthetic */ f1.a1 M;
    public final /* synthetic */ f1.a1 N;
    public final /* synthetic */ f1.a1 O;
    public final /* synthetic */ f1.a1 P;
    public final /* synthetic */ f1.a1 Q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10831f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10832z;

    public /* synthetic */ y0(g gVar, f1.a1 a1Var, f1.a1 a1Var2, f1.f1 f1Var, f1.a1 a1Var3, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.f1 f1Var6, f1.a1 a1Var4, f1.a1 a1Var5, f1.a1 a1Var6, f1.f1 f1Var7, f1.f1 f1Var8, f1.f1 f1Var9, f1.a1 a1Var7, f1.f1 f1Var10, f1.a1 a1Var8, f1.a1 a1Var9, f1.a1 a1Var10, f1.a1 a1Var11, f1.a1 a1Var12, int i10) {
        this.f10826a = i10;
        this.f10827b = gVar;
        this.f10828c = a1Var;
        this.f10829d = a1Var2;
        this.f10830e = f1Var;
        this.f10831f = a1Var3;
        this.f10832z = f1Var2;
        this.A = f1Var3;
        this.B = f1Var4;
        this.C = f1Var5;
        this.D = f1Var6;
        this.E = a1Var4;
        this.F = a1Var5;
        this.G = a1Var6;
        this.H = f1Var7;
        this.I = f1Var8;
        this.J = f1Var9;
        this.K = a1Var7;
        this.L = f1Var10;
        this.M = a1Var8;
        this.N = a1Var9;
        this.O = a1Var10;
        this.P = a1Var11;
        this.Q = a1Var12;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        f1.a1 a1Var;
        f1.a1 a1Var2;
        int i10 = this.f10826a;
        pi.o oVar = pi.o.f13011a;
        f1.f fVar = f1.m.f6385a;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                v1.f fVar2 = v1.b.D;
                fj.l.f((b0.c0) obj, "$this$MSCard");
                boolean z2 = (iIntValue & 17) != 16;
                v2.f2 f2Var = i0Var.f6313a;
                if (!i0Var.T(iIntValue & 1, z2)) {
                    i0Var.W();
                    break;
                } else {
                    q3.b(this.f10827b, q3.w(this.f10828c), ((Boolean) this.f10829d.getValue()).booleanValue(), this.f10830e.g(), new jb.d(((Boolean) this.f10831f.getValue()).booleanValue(), this.f10832z.g(), this.A.g(), this.B.g(), this.C.g(), this.D.g(), ((Boolean) this.E.getValue()).booleanValue(), ((Number) this.F.getValue()).floatValue(), ((Boolean) this.G.getValue()).booleanValue(), false, this.H.g(), this.I.g(), this.J.g(), ((Boolean) this.K.getValue()).booleanValue(), this.L.g(), 512), null, i0Var, 8);
                    f1.i0 i0Var2 = i0Var;
                    q3.k(0, i0Var2);
                    f1.a1 a1Var3 = this.M;
                    f fVar3 = (f) a1Var3.getValue();
                    f fVar4 = f.f10265b;
                    boolean z10 = fVar3 == fVar4;
                    Object objQ = i0Var2.Q();
                    f1.a1 a1Var4 = this.N;
                    f1.a1 a1Var5 = this.O;
                    f1.a1 a1Var6 = this.P;
                    if (objQ == fVar) {
                        objQ = new h1(a1Var4, a1Var5, a1Var6, 0);
                        i0Var2.l0(objQ);
                    }
                    q3.c("Ultra", z10, (ej.a) objQ, i0Var2, 390);
                    q3.k(0, i0Var2);
                    f fVar5 = (f) a1Var3.getValue();
                    f fVar6 = f.f10266c;
                    boolean z11 = fVar5 == fVar6;
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new h1(a1Var4, a1Var5, a1Var6, 1);
                        i0Var2.l0(objQ2);
                    }
                    q3.c("High", z11, (ej.a) objQ2, i0Var2, 390);
                    q3.k(0, i0Var2);
                    boolean z12 = ((f) a1Var3.getValue()) == f.f10267d;
                    Object objQ3 = i0Var2.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new h1(a1Var4, a1Var5, a1Var6, 2);
                        i0Var2.l0(objQ3);
                    }
                    q3.c("Medium", z12, (ej.a) objQ3, i0Var2, 390);
                    q3.k(0, i0Var2);
                    boolean z13 = ((f) a1Var3.getValue()) == f.f10268e;
                    Object objQ4 = i0Var2.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new h1(a1Var4, a1Var5, a1Var6, 3);
                        i0Var2.l0(objQ4);
                    }
                    q3.c("Low", z13, (ej.a) objQ4, i0Var2, 390);
                    q3.k(0, i0Var2);
                    f fVar7 = (f) a1Var3.getValue();
                    v1.l lVar = v1.l.f17564b;
                    if ((fVar7 == fVar4 || ((f) a1Var3.getValue()) == fVar6) && !((Boolean) this.Q.getValue()).booleanValue()) {
                        i0Var2.b0(1419125834);
                        float f10 = 16;
                        v1.o oVarU = b0.d.u(b0.t1.c(1.0f, lVar), f10, 10);
                        b0.q1 q1VarA = b0.o1.a(b0.j.g(8), fVar2, i0Var2, 54);
                        a1Var = a1Var4;
                        int iHashCode = Long.hashCode(i0Var2.T);
                        f1.n1 n1VarL = i0Var2.l();
                        v1.o oVarC = v1.a.c(i0Var2, oVarU);
                        v2.h.f17668w.getClass();
                        v2.f fVar8 = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(fVar8);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
                        f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
                        f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var2);
                        f1.s.M(v2.g.f17647d, i0Var2, oVarC);
                        i2.f fVarB = u0.b.f16480f;
                        if (fVarB == null) {
                            i2.e eVar = new i2.e("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = i2.h0.f8270a;
                            c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                            d8.e eVar2 = new d8.e(9);
                            eVar2.x(11.0f, 7.0f);
                            eVar2.u(2.0f);
                            eVar2.H(2.0f);
                            eVar2.u(-2.0f);
                            eVar2.k();
                            eVar2.x(11.0f, 11.0f);
                            eVar2.u(2.0f);
                            eVar2.H(6.0f);
                            eVar2.u(-2.0f);
                            eVar2.k();
                            eVar2.x(12.0f, 2.0f);
                            eVar2.n(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            eVar2.D(4.48f, 10.0f, 10.0f, 10.0f);
                            eVar2.D(10.0f, -4.48f, 10.0f, -10.0f);
                            eVar2.C(17.52f, 2.0f, 12.0f, 2.0f);
                            eVar2.k();
                            eVar2.x(12.0f, 20.0f);
                            eVar2.o(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                            eVar2.D(3.59f, -8.0f, 8.0f, -8.0f);
                            eVar2.D(8.0f, 3.59f, 8.0f, 8.0f);
                            eVar2.D(-3.59f, 8.0f, -8.0f, 8.0f);
                            eVar2.k();
                            i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
                            fVarB = eVar.b();
                            u0.b.f16480f = fVarB;
                        }
                        i2.f fVar9 = fVarB;
                        a1Var2 = a1Var3;
                        c1.a2.b(fVar9, null, b0.t1.k(f10, lVar), c2.e0.d(4294919482L), i0Var2, 3504, 0);
                        v7.a("Liquid Glass requires Pro. Switch is disabled.", null, c2.e0.d(4294919482L), hj.a.x(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 24966, 0, 262122);
                        i0Var2 = i0Var2;
                        i0Var2.p(true);
                        q3.k(0, i0Var2);
                        i0Var2.p(false);
                    } else {
                        a1Var2 = a1Var3;
                        a1Var = a1Var4;
                        i0Var2.b0(1420131040);
                        i0Var2.p(false);
                    }
                    v1.o oVarC2 = b0.t1.c(1.0f, lVar);
                    Object objQ5 = i0Var2.Q();
                    if (objQ5 == fVar) {
                        objQ5 = t.m1.p(i0Var2);
                    }
                    z.k kVar = (z.k) objQ5;
                    Object objQ6 = i0Var2.Q();
                    if (objQ6 == fVar) {
                        objQ6 = new h1(a1Var, a1Var5, a1Var6, 4);
                        i0Var2.l0(objQ6);
                    }
                    v1.o oVarU2 = b0.d.u(v.n.k(oVarC2, kVar, null, false, null, (ej.a) objQ6, 28), 16, 14);
                    b0.q1 q1VarA2 = b0.o1.a(b0.j.f1365g, fVar2, i0Var2, 54);
                    int iHashCode2 = Long.hashCode(i0Var2.T);
                    f1.n1 n1VarL2 = i0Var2.l();
                    v1.o oVarC3 = v1.a.c(i0Var2, oVarU2);
                    v2.h.f17668w.getClass();
                    v2.f fVar10 = v2.g.f17645b;
                    i0Var2.e0();
                    if (i0Var2.S) {
                        i0Var2.k(fVar10);
                    } else {
                        i0Var2.o0();
                    }
                    v2.e eVar3 = v2.g.f17649f;
                    f1.s.M(eVar3, i0Var2, q1VarA2);
                    v2.e eVar4 = v2.g.f17648e;
                    f1.s.M(eVar4, i0Var2, n1VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    v2.e eVar5 = v2.g.f17650g;
                    f1.s.w(i0Var2, numValueOf, eVar5);
                    v2.d dVar = v2.g.f17651h;
                    f1.s.I(dVar, i0Var2);
                    v2.e eVar6 = v2.g.f17647d;
                    f1.s.M(eVar6, i0Var2, oVarC3);
                    f1.i0 i0Var3 = i0Var2;
                    v7.a("Custom", null, q3.f10599c, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 24966, 0, 262122);
                    b0.q1 q1VarA3 = b0.o1.a(b0.j.g(12), fVar2, i0Var3, 54);
                    int iHashCode3 = Long.hashCode(i0Var3.T);
                    f1.n1 n1VarL3 = i0Var3.l();
                    v1.o oVarC4 = v1.a.c(i0Var3, lVar);
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar10);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(eVar3, i0Var3, q1VarA3);
                    f1.s.M(eVar4, i0Var3, n1VarL3);
                    gk.b.u(iHashCode3, i0Var3, eVar5, i0Var3, dVar);
                    f1.s.M(eVar6, i0Var3, oVarC4);
                    if (((f) a1Var2.getValue()) == f.f10269f) {
                        i0Var3.b0(1869266095);
                        c1.a2.b(u0.c.l(), null, b0.t1.k(20, lVar), q3.f10601e, i0Var3, 3504, 0);
                        i0Var3.p(false);
                    } else {
                        i0Var3.b0(1869581272);
                        i0Var3.p(false);
                    }
                    i2.f fVarB2 = u0.l.f16545b;
                    if (fVarB2 == null) {
                        i2.e eVar7 = new i2.e("Outlined.OpenInFull", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = i2.h0.f8270a;
                        c2.z0 z0Var2 = new c2.z0(c2.w.f3052b);
                        d8.e eVar8 = new d8.e(9);
                        eVar8.x(21.0f, 11.0f);
                        eVar8.w(0.0f, -8.0f);
                        eVar8.w(-8.0f, 0.0f);
                        eVar8.w(3.29f, 3.29f);
                        eVar8.w(-10.0f, 10.0f);
                        eVar8.w(-3.29f, -3.29f);
                        eVar8.w(0.0f, 8.0f);
                        eVar8.w(8.0f, 0.0f);
                        eVar8.w(-3.29f, -3.29f);
                        eVar8.w(10.0f, -10.0f);
                        eVar8.k();
                        i2.e.a(eVar7, (ArrayList) eVar8.f5001a, z0Var2);
                        fVarB2 = eVar7.b();
                        u0.l.f16545b = fVarB2;
                    }
                    c1.a2.b(fVarB2, "Open Liquid Glass Settings", b0.t1.k(20, lVar), q3.f10601e, i0Var3, 3504, 0);
                    i0Var3.p(true);
                    i0Var3.p(true);
                    break;
                }
                break;
            default:
                f1.i0 i0Var4 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (!i0Var4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i0Var4.W();
                    break;
                } else {
                    v1.l lVar2 = v1.l.f17564b;
                    v1.o oVarU3 = b0.d.u(b0.t1.c(1.0f, lVar2), 16, 6);
                    b0.q1 q1VarA4 = b0.o1.a(b0.j.f1365g, v1.b.D, i0Var4, 54);
                    int iHashCode4 = Long.hashCode(i0Var4.T);
                    f1.n1 n1VarL4 = i0Var4.l();
                    v1.o oVarC5 = v1.a.c(i0Var4, oVarU3);
                    v2.h.f17668w.getClass();
                    v2.f fVar11 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar11);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, q1VarA4);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL4);
                    f1.s.w(i0Var4, Integer.valueOf(iHashCode4), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var4);
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC5);
                    long jX = hj.a.x(12);
                    k3.s sVar = k3.s.f9400z;
                    v7.a("GRAPHIC", null, q3.f10600d, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262058);
                    long jX2 = hj.a.x(13);
                    long j = q3.f10601e;
                    Object objQ7 = i0Var4.Q();
                    if (objQ7 == fVar) {
                        objQ7 = t.m1.p(i0Var4);
                    }
                    z.k kVar2 = (z.k) objQ7;
                    Object objQ8 = i0Var4.Q();
                    if (objQ8 == fVar) {
                        objQ8 = new jb.e(13);
                        i0Var4.l0(objQ8);
                    }
                    v7.a("Auto Set", v.n.k(lVar2, kVar2, null, false, null, (ej.a) objQ8, 28), j, jX2, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262056);
                    i0Var4.p(true);
                    q3.j(0L, p1.j.d(-733633374, new y0(this.f10827b, this.f10828c, this.f10829d, this.f10830e, this.f10831f, this.f10832z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, 0), i0Var4), i0Var4, 48);
                    b0.d.e(i0Var4, b0.t1.e(24, lVar2));
                    break;
                }
        }
        return oVar;
    }
}
