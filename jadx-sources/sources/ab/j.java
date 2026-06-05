package ab;

import android.graphics.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.t1;
import c1.v7;
import c2.e0;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.q2;
import lb.l0;
import p2.k0;
import t2.q0;
import v2.f2;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ej.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f305f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f306z;

    public /* synthetic */ j(a aVar, a aVar2, ej.a aVar3, a1 a1Var, a1 a1Var2, ej.a aVar4, ej.a aVar5, ej.a aVar6, ej.a aVar7, ej.a aVar8, ej.a aVar9) {
        this.f303d = aVar;
        this.f304e = aVar2;
        this.f305f = aVar3;
        this.f301b = a1Var;
        this.f302c = a1Var2;
        this.f306z = aVar4;
        this.A = aVar5;
        this.B = aVar6;
        this.C = aVar7;
        this.D = aVar8;
        this.E = aVar9;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        t.c cVar;
        ej.a aVar;
        ej.a aVar2;
        ej.a aVar3;
        ej.a aVar4;
        s3.c cVar2;
        a aVar5;
        i0 i0Var;
        boolean z2;
        float f10;
        t.c cVar3;
        a1 a1Var;
        ti.c cVar4;
        Object sVar;
        Boolean bool;
        w wVar;
        boolean z10;
        switch (this.f300a) {
            case 0:
                a aVar6 = (a) this.f303d;
                a aVar7 = (a) this.f304e;
                ej.a aVar8 = (ej.a) this.f305f;
                ej.a aVar9 = (ej.a) this.f306z;
                ej.a aVar10 = (ej.a) this.A;
                ej.a aVar11 = (ej.a) this.B;
                ej.a aVar12 = (ej.a) this.C;
                ej.a aVar13 = (ej.a) this.D;
                ej.a aVar14 = (ej.a) this.E;
                b0.y yVar = (b0.y) obj;
                i0 i0Var2 = (i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(yVar, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var2.f(yVar) ? 4 : 2;
                }
                boolean z11 = (iIntValue & 19) != 18;
                f2 f2Var = i0Var2.f6313a;
                if (i0Var2.T(iIntValue & 1, z11)) {
                    s3.c cVar5 = (s3.c) i0Var2.j(f1.f18262h);
                    a aVar15 = aVar7 == null ? aVar6 : aVar7;
                    Object objQ = i0Var2.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ == fVar) {
                        objQ = t.d.a(0.9f, 0.01f);
                        i0Var2.l0(objQ);
                    }
                    t.c cVar6 = (t.c) objQ;
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = t.d.a(1.0f, 0.01f);
                        i0Var2.l0(objQ2);
                    }
                    t.c cVar7 = (t.c) objQ2;
                    Object objQ3 = i0Var2.Q();
                    if (objQ3 == fVar) {
                        objQ3 = f1.s.A(Boolean.FALSE);
                        i0Var2.l0(objQ3);
                    }
                    a1 a1Var2 = (a1) objQ3;
                    Object objQ4 = i0Var2.Q();
                    if (objQ4 == fVar) {
                        objQ4 = f1.s.A(Boolean.FALSE);
                        i0Var2.l0(objQ4);
                    }
                    a1 a1Var3 = (a1) objQ4;
                    Integer numValueOf = aVar6 != null ? Integer.valueOf(aVar6.f252a) : null;
                    boolean zH = i0Var2.h(aVar6) | i0Var2.h(cVar6) | i0Var2.h(cVar7);
                    Object objQ5 = i0Var2.Q();
                    if (zH || objQ5 == fVar) {
                        a aVar16 = aVar15;
                        cVar = cVar7;
                        aVar = aVar8;
                        aVar2 = aVar11;
                        aVar3 = aVar12;
                        aVar4 = aVar13;
                        cVar2 = cVar5;
                        aVar5 = aVar16;
                        i0Var = i0Var2;
                        z2 = false;
                        f10 = 0.9f;
                        objQ5 = new q(aVar6, cVar6, cVar, a1Var2, null, 0);
                        cVar3 = cVar6;
                        a1Var = a1Var2;
                        i0Var.l0(objQ5);
                    } else {
                        a1Var = a1Var2;
                        aVar = aVar8;
                        aVar2 = aVar11;
                        aVar3 = aVar12;
                        aVar4 = aVar13;
                        i0Var = i0Var2;
                        z2 = false;
                        f10 = 0.9f;
                        cVar2 = cVar5;
                        aVar5 = aVar15;
                        cVar = cVar7;
                        cVar3 = cVar6;
                    }
                    f1.s.f((ej.e) objQ5, i0Var, numValueOf);
                    Boolean boolValueOf = Boolean.valueOf(aVar7 != null ? true : z2);
                    boolean zH2 = i0Var.h(aVar7);
                    Object objQ6 = i0Var.Q();
                    if (zH2 || objQ6 == fVar) {
                        cVar4 = null;
                        objQ6 = new r(aVar7, a1Var3, null, 0);
                        i0Var.l0(objQ6);
                    } else {
                        cVar4 = null;
                    }
                    f1.s.f((ej.e) objQ6, i0Var, boolValueOf);
                    Object objValueOf = aVar6 != null ? Integer.valueOf(aVar6.f252a) : cVar4;
                    Boolean boolValueOf2 = Boolean.valueOf(aVar7 != null ? true : z2);
                    boolean zH3 = i0Var.h(aVar6) | i0Var.h(aVar7) | i0Var.h(cVar);
                    Object objQ7 = i0Var.Q();
                    if (zH3 || objQ7 == fVar) {
                        bool = boolValueOf2;
                        sVar = new s(aVar6, aVar7, cVar, cVar4, 0);
                        i0Var.l0(sVar);
                    } else {
                        bool = boolValueOf2;
                        sVar = objQ7;
                    }
                    f1.s.g(objValueOf, bool, (ej.e) sVar, i0Var);
                    v1.l lVar = v1.l.f17564b;
                    a1 a1Var4 = this.f301b;
                    if (aVar6 != null) {
                        Rect rect = aVar6.f255d;
                        i0Var.b0(1222709316);
                        Rect rectF = v.f(aVar6.f254c, (Rect) a1Var4.getValue());
                        Rect rectF2 = v.f(rect, (Rect) a1Var4.getValue());
                        int iMax = Math.max(1, rect.width());
                        int iMax2 = Math.max(1, rect.height());
                        float fFloatValue = ((Boolean) a1Var.getValue()).booleanValue() ? ((Number) cVar3.e()).floatValue() : f10;
                        float fFloatValue2 = ((Boolean) a1Var.getValue()).booleanValue() ? ((Number) cVar.e()).floatValue() : 1.0f;
                        boolean zH4 = i0Var.h(rectF);
                        Object objQ8 = i0Var.Q();
                        if (zH4 || objQ8 == fVar) {
                            objQ8 = new k(rectF, 0);
                            i0Var.l0(objQ8);
                        }
                        v1.o oVarO = b0.d.o(lVar, (ej.c) objQ8);
                        boolean zC = i0Var.c(fFloatValue) | i0Var.h(rectF) | i0Var.h(rectF2);
                        Object objQ9 = i0Var.Q();
                        if (zC || objQ9 == fVar) {
                            objQ9 = new l(fFloatValue, rectF, rectF2, 0);
                            i0Var.l0(objQ9);
                        }
                        v.e(t1.l(e0.q(oVarO, (ej.c) objQ9), cVar2.h0(Math.max(1, rectF.width())), cVar2.h0(Math.max(1, rectF.height()))), aVar6.f253b, iMax, iMax2, fFloatValue2, i0Var, 0);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(1224094117);
                        i0Var.p(z2);
                    }
                    a1 a1Var5 = this.f302c;
                    if (aVar5 != null) {
                        int iI0 = cVar2.I0(v.f352b);
                        int iI02 = cVar2.I0(260);
                        Integer num = (Integer) a1Var5.getValue();
                        if (num != null) {
                            iI02 = num.intValue();
                        }
                        int iI03 = cVar2.I0(v.f353c);
                        int iI04 = cVar2.I0(v.f354d);
                        int iI05 = cVar2.I0(yVar.c());
                        int iI06 = cVar2.I0(yVar.b());
                        Rect rectF3 = v.f(aVar5.f254c, (Rect) a1Var4.getValue());
                        Rect rectF4 = v.f(aVar5.f255d, (Rect) a1Var4.getValue());
                        boolean z12 = rectF3.centerX() < iI05 / 2;
                        boolean z13 = rectF3.centerY() < ((int) (((float) iI06) * 0.6f)) && rectF3.centerY() < iI06 / 2;
                        wVar = new w(cg.b.p(z12 ? rectF4.left : rectF4.right - iI0, iI04, Math.max(iI04, (iI05 - iI0) - iI04)), e0.h(z12 ? 0.0f : 1.0f, z13 ? 0.0f : 1.0f), cg.b.p(z13 ? rectF4.bottom + iI03 : (rectF4.top - iI02) - iI03, iI04, Math.max(iI04, (iI06 - iI02) - iI04)));
                    } else {
                        wVar = null;
                    }
                    q2 q2VarB = t.e.b(((Boolean) a1Var3.getValue()).booleanValue() ? 1.0f : 0.0f, t.d.s(0.82f, 320.0f, null, 4), "context_menu_fraction", null, i0Var, 3120, 20);
                    q2 q2VarB2 = t.e.b(((Boolean) a1Var3.getValue()).booleanValue() ? 1.0f : 0.0f, t.d.t(210, 0, null, 6), "context_menu_alpha", null, i0Var, 3120, 20);
                    if (aVar5 == null || wVar == null) {
                        i0Var.b0(1229696933);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(1227056105);
                        b0.i0 i0Var3 = t1.f1433c;
                        ej.a aVar17 = aVar;
                        boolean zF = i0Var.f(wVar) | i0Var.f(cVar2) | i0Var.f(aVar17);
                        Object objQ10 = i0Var.Q();
                        if (zF || objQ10 == fVar) {
                            z10 = false;
                            u uVar = new u(wVar, cVar2, aVar17, a1Var5, 0);
                            i0Var.l0(uVar);
                            objQ10 = uVar;
                        } else {
                            z10 = false;
                        }
                        v1.o oVarA = k0.a(i0Var3, wVar, (PointerInputEventHandler) objQ10);
                        q0 q0VarD = b0.r.d(v1.b.f17547a, z10);
                        int iHashCode = Long.hashCode(i0Var.T);
                        n1 n1VarL = i0Var.l();
                        v1.o oVarC = v1.a.c(i0Var, oVarA);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var.e0();
                        if (i0Var.S) {
                            i0Var.k(fVar2);
                        } else {
                            i0Var.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        f1.s.M(eVar, i0Var, q0VarD);
                        v2.e eVar2 = v2.g.f17648e;
                        f1.s.M(eVar2, i0Var, n1VarL);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        v2.e eVar3 = v2.g.f17650g;
                        f1.s.w(i0Var, numValueOf2, eVar3);
                        v2.d dVar = v2.g.f17651h;
                        f1.s.I(dVar, i0Var);
                        v2.e eVar4 = v2.g.f17647d;
                        f1.s.M(eVar4, i0Var, oVarC);
                        boolean zF2 = i0Var.f(wVar);
                        Object objQ11 = i0Var.Q();
                        if (zF2 || objQ11 == fVar) {
                            objQ11 = new k(wVar, 1);
                            i0Var.l0(objQ11);
                        }
                        v1.o oVarO2 = b0.d.o(lVar, (ej.c) objQ11);
                        boolean zF3 = i0Var.f(wVar) | i0Var.f(q2VarB) | i0Var.f(q2VarB2);
                        Object objQ12 = i0Var.Q();
                        if (zF3 || objQ12 == fVar) {
                            objQ12 = new m(wVar, q2VarB, q2VarB2, 0);
                            i0Var.l0(objQ12);
                        }
                        v1.o oVarQ = e0.q(oVarO2, (ej.c) objQ12);
                        b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.F, i0Var, 48);
                        int iHashCode2 = Long.hashCode(i0Var.T);
                        n1 n1VarL2 = i0Var.l();
                        v1.o oVarC2 = v1.a.c(i0Var, oVarQ);
                        i0Var.e0();
                        if (i0Var.S) {
                            i0Var.k(fVar2);
                        } else {
                            i0Var.o0();
                        }
                        f1.s.M(eVar, i0Var, b0VarA);
                        f1.s.M(eVar2, i0Var, n1VarL2);
                        gk.b.u(iHashCode2, i0Var, eVar3, i0Var, dVar);
                        f1.s.M(eVar4, i0Var, oVarC2);
                        xa.f fVar3 = aVar5.f253b;
                        Object objQ13 = i0Var.Q();
                        if (objQ13 == fVar) {
                            objQ13 = new i(a1Var5, 1);
                            i0Var.l0(objQ13);
                        }
                        i0 i0Var4 = i0Var;
                        v.b(fVar3, aVar9, aVar10, aVar2, aVar3, aVar4, aVar14, (ej.c) objQ13, aVar5.f256e, i0Var4, 12582912);
                        i0Var4.p(true);
                        i0Var4.p(true);
                        i0Var4.p(false);
                    }
                } else {
                    i0Var2.W();
                }
                break;
            default:
                final lb.g gVar = (lb.g) this.f303d;
                final f1.f1 f1Var = (f1.f1) this.f304e;
                final f1.f1 f1Var2 = (f1.f1) this.f305f;
                final f1.f1 f1Var3 = (f1.f1) this.f306z;
                final f1.f1 f1Var4 = (f1.f1) this.A;
                final f1.f1 f1Var5 = (f1.f1) this.B;
                final f1.f1 f1Var6 = (f1.f1) this.C;
                final f1.f1 f1Var7 = (f1.f1) this.D;
                final a1 a1Var6 = (a1) this.E;
                i0 i0Var5 = (i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l0.c("SLIDER", null, i0Var5, 6, 2);
                    final a1 a1Var7 = this.f301b;
                    final a1 a1Var8 = this.f302c;
                    l0.a(p1.j.d(14436335, new ej.e() { // from class: lb.x
                        @Override // ej.e
                        public final Object invoke(Object obj4, Object obj5) {
                            g gVar2;
                            f1.f1 f1Var8;
                            f1.f1 f1Var9;
                            f1.f1 f1Var10;
                            f1.f1 f1Var11;
                            f1.f1 f1Var12;
                            f1.a1 a1Var9;
                            final f1.a1 a1Var10;
                            f1.a1 a1Var11;
                            f1.f1 f1Var13;
                            f1.f1 f1Var14;
                            final f1.f1 f1Var15;
                            final f1.a1 a1Var12;
                            final f1.f1 f1Var16;
                            final f1.f1 f1Var17;
                            final f1.f1 f1Var18;
                            final f1.f1 f1Var19;
                            final f1.f1 f1Var20;
                            final f1.f1 f1Var21;
                            f1.a1 a1Var13;
                            f1.a1 a1Var14;
                            f1.f1 f1Var22;
                            f1.f1 f1Var23;
                            f1.f1 f1Var24;
                            f1.f1 f1Var25;
                            f1.f1 f1Var26;
                            f1.a1 a1Var15;
                            f1.f1 f1Var27;
                            f1.f1 f1Var28;
                            v2.f fVar4;
                            f1.i0 i0Var6 = (f1.i0) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            boolean z14 = (iIntValue3 & 3) != 2;
                            v2.f2 f2Var2 = i0Var6.f6313a;
                            if (i0Var6.T(iIntValue3 & 1, z14)) {
                                v1.l lVar2 = v1.l.f17564b;
                                v1.o oVarC3 = b0.t1.c(1.0f, lVar2);
                                Object objQ14 = i0Var6.Q();
                                Object obj6 = f1.m.f6385a;
                                if (objQ14 == obj6) {
                                    objQ14 = t.m1.p(i0Var6);
                                }
                                z.k kVar = (z.k) objQ14;
                                g gVar3 = gVar;
                                boolean zH5 = i0Var6.h(gVar3);
                                Object objQ15 = i0Var6.Q();
                                f1.a1 a1Var16 = a1Var7;
                                f1.a1 a1Var17 = a1Var8;
                                f1.f1 f1Var29 = f1Var;
                                f1.f1 f1Var30 = f1Var2;
                                f1.f1 f1Var31 = f1Var3;
                                f1.f1 f1Var32 = f1Var4;
                                f1.f1 f1Var33 = f1Var5;
                                f1.f1 f1Var34 = f1Var6;
                                f1.f1 f1Var35 = f1Var7;
                                f1.a1 a1Var18 = a1Var6;
                                if (zH5 || objQ15 == obj6) {
                                    gVar2 = gVar3;
                                    y yVar2 = new y(a1Var16, gVar2, a1Var17, f1Var29, f1Var30, f1Var31, f1Var32, f1Var33, f1Var34, f1Var35, a1Var18, 1);
                                    f1Var8 = f1Var31;
                                    f1Var9 = f1Var32;
                                    f1Var10 = f1Var33;
                                    f1Var11 = f1Var34;
                                    f1Var12 = f1Var35;
                                    a1Var9 = a1Var18;
                                    a1Var10 = a1Var16;
                                    a1Var11 = a1Var17;
                                    f1Var13 = f1Var29;
                                    f1Var14 = f1Var30;
                                    i0Var6.l0(yVar2);
                                    objQ15 = yVar2;
                                } else {
                                    a1Var9 = a1Var18;
                                    gVar2 = gVar3;
                                    f1Var8 = f1Var31;
                                    f1Var9 = f1Var32;
                                    a1Var10 = a1Var16;
                                    f1Var10 = f1Var33;
                                    f1Var11 = f1Var34;
                                    f1Var12 = f1Var35;
                                    a1Var11 = a1Var17;
                                    f1Var13 = f1Var29;
                                    f1Var14 = f1Var30;
                                }
                                float f11 = 16;
                                float f12 = 14;
                                v1.o oVarU = b0.d.u(v.n.k(oVarC3, kVar, null, false, null, (ej.a) objQ15, 28), f11, f12);
                                b0.f fVar5 = b0.j.f1365g;
                                v1.f fVar6 = v1.b.D;
                                b0.q1 q1VarA = b0.o1.a(fVar5, fVar6, i0Var6, 54);
                                int iHashCode3 = Long.hashCode(i0Var6.T);
                                f1.n1 n1VarL3 = i0Var6.l();
                                v1.o oVarC4 = v1.a.c(i0Var6, oVarU);
                                v2.h.f17668w.getClass();
                                v2.f fVar7 = v2.g.f17645b;
                                i0Var6.e0();
                                if (i0Var6.S) {
                                    i0Var6.k(fVar7);
                                } else {
                                    i0Var6.o0();
                                }
                                v2.e eVar5 = v2.g.f17649f;
                                f1.s.M(eVar5, i0Var6, q1VarA);
                                v2.e eVar6 = v2.g.f17648e;
                                f1.s.M(eVar6, i0Var6, n1VarL3);
                                Integer numValueOf3 = Integer.valueOf(iHashCode3);
                                v2.e eVar7 = v2.g.f17650g;
                                f1.s.w(i0Var6, numValueOf3, eVar7);
                                v2.d dVar2 = v2.g.f17651h;
                                f1.s.I(dVar2, i0Var6);
                                v2.e eVar8 = v2.g.f17647d;
                                f1.s.M(eVar8, i0Var6, oVarC4);
                                long jX = hj.a.x(16);
                                long j = l0.f10433c;
                                if (1.0f <= 0.0d) {
                                    c0.a.a("invalid weight; must be greater than zero");
                                }
                                final g gVar4 = gVar2;
                                v7.a("Velocity Squish", new b0.y0(1.0f, true), j, jX, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var6, 24966, 0, 262120);
                                boolean zBooleanValue = ((Boolean) a1Var10.getValue()).booleanValue();
                                boolean zH6 = i0Var6.h(gVar4);
                                Object objQ16 = i0Var6.Q();
                                if (zH6 || objQ16 == obj6) {
                                    f1Var15 = f1Var8;
                                    final int i10 = 0;
                                    a1Var12 = a1Var11;
                                    f1Var16 = f1Var13;
                                    f1Var17 = f1Var14;
                                    final f1.a1 a1Var19 = a1Var10;
                                    f1Var18 = f1Var9;
                                    f1Var19 = f1Var10;
                                    f1Var20 = f1Var11;
                                    f1Var21 = f1Var12;
                                    final f1.a1 a1Var20 = a1Var9;
                                    ej.c cVar8 = new ej.c() { // from class: lb.b0
                                        @Override // ej.c
                                        public final Object invoke(Object obj7) {
                                            int i11 = i10;
                                            Boolean bool2 = (Boolean) obj7;
                                            bool2.booleanValue();
                                            switch (i11) {
                                                case 0:
                                                    f1.a1 a1Var21 = a1Var19;
                                                    a1Var21.setValue(bool2);
                                                    l0.f(a1Var12, a1Var20, a1Var21, f1Var16, f1Var17, f1Var15, f1Var18, f1Var19, f1Var20, f1Var21, gVar4);
                                                    break;
                                                default:
                                                    f1.a1 a1Var22 = a1Var19;
                                                    a1Var22.setValue(bool2);
                                                    l0.f(a1Var12, a1Var22, a1Var20, f1Var16, f1Var17, f1Var15, f1Var18, f1Var19, f1Var20, f1Var21, gVar4);
                                                    break;
                                            }
                                            return pi.o.f13011a;
                                        }
                                    };
                                    a1Var10 = a1Var19;
                                    a1Var13 = a1Var20;
                                    gVar4 = gVar4;
                                    i0Var6.l0(cVar8);
                                    objQ16 = cVar8;
                                } else {
                                    a1Var12 = a1Var11;
                                    f1Var16 = f1Var13;
                                    f1Var17 = f1Var14;
                                    f1Var15 = f1Var8;
                                    f1Var18 = f1Var9;
                                    f1Var19 = f1Var10;
                                    f1Var20 = f1Var11;
                                    f1Var21 = f1Var12;
                                    a1Var13 = a1Var9;
                                }
                                sa.l0.a(zBooleanValue, (ej.c) objQ16, null, false, i0Var6, 0, 12);
                                i0Var6.p(true);
                                l0.b(0, i0Var6);
                                v1.o oVarC5 = b0.t1.c(1.0f, lVar2);
                                Object objQ17 = i0Var6.Q();
                                if (objQ17 == obj6) {
                                    objQ17 = t.m1.p(i0Var6);
                                }
                                z.k kVar2 = (z.k) objQ17;
                                boolean zH7 = i0Var6.h(gVar4);
                                Object objQ18 = i0Var6.Q();
                                if (zH7 || objQ18 == obj6) {
                                    y yVar3 = new y(a1Var13, gVar4, a1Var12, f1Var16, f1Var17, f1Var15, f1Var18, f1Var19, f1Var20, f1Var21, a1Var10, 2);
                                    a1Var14 = a1Var13;
                                    f1Var22 = f1Var15;
                                    f1Var23 = f1Var18;
                                    f1Var24 = f1Var19;
                                    f1Var25 = f1Var20;
                                    f1Var26 = f1Var21;
                                    a1Var15 = a1Var12;
                                    f1Var27 = f1Var16;
                                    f1Var28 = f1Var17;
                                    i0Var6.l0(yVar3);
                                    objQ18 = yVar3;
                                } else {
                                    a1Var14 = a1Var13;
                                    f1Var22 = f1Var15;
                                    f1Var23 = f1Var18;
                                    f1Var24 = f1Var19;
                                    f1Var25 = f1Var20;
                                    f1Var26 = f1Var21;
                                    a1Var15 = a1Var12;
                                    f1Var27 = f1Var16;
                                    f1Var28 = f1Var17;
                                }
                                v1.o oVarU2 = b0.d.u(v.n.k(oVarC5, kVar2, null, false, null, (ej.a) objQ18, 28), f11, f12);
                                b0.q1 q1VarA2 = b0.o1.a(fVar5, fVar6, i0Var6, 54);
                                int iHashCode4 = Long.hashCode(i0Var6.T);
                                f1.n1 n1VarL4 = i0Var6.l();
                                v1.o oVarC6 = v1.a.c(i0Var6, oVarU2);
                                i0Var6.e0();
                                if (i0Var6.S) {
                                    fVar4 = fVar7;
                                    i0Var6.k(fVar4);
                                } else {
                                    fVar4 = fVar7;
                                    i0Var6.o0();
                                }
                                f1.s.M(eVar5, i0Var6, q1VarA2);
                                f1.s.M(eVar6, i0Var6, n1VarL4);
                                gk.b.u(iHashCode4, i0Var6, eVar7, i0Var6, dVar2);
                                f1.s.M(eVar8, i0Var6, oVarC6);
                                b0.b0 b0VarA2 = b0.z.a(b0.j.f1361c, v1.b.E, i0Var6, 0);
                                int iHashCode5 = Long.hashCode(i0Var6.T);
                                f1.n1 n1VarL5 = i0Var6.l();
                                v1.o oVarC7 = v1.a.c(i0Var6, lVar2);
                                i0Var6.e0();
                                if (i0Var6.S) {
                                    i0Var6.k(fVar4);
                                } else {
                                    i0Var6.o0();
                                }
                                f1.s.M(eVar5, i0Var6, b0VarA2);
                                f1.s.M(eVar6, i0Var6, n1VarL5);
                                gk.b.u(iHashCode5, i0Var6, eVar7, i0Var6, dVar2);
                                f1.s.M(eVar8, i0Var6, oVarC7);
                                final g gVar5 = gVar4;
                                v7.a("Disable Glass Thumb", null, j, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var6, 24966, 0, 262122);
                                v7.a("Use a plain solid thumb instead of liquid glass", null, l0.f10434d, hj.a.x(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var6, 24966, 0, 262122);
                                i0Var6.p(true);
                                boolean zBooleanValue2 = ((Boolean) a1Var14.getValue()).booleanValue();
                                boolean zH8 = i0Var6.h(gVar5);
                                Object objQ19 = i0Var6.Q();
                                if (zH8 || objQ19 == obj6) {
                                    final int i11 = 1;
                                    final f1.a1 a1Var21 = a1Var15;
                                    final f1.f1 f1Var36 = f1Var27;
                                    final f1.f1 f1Var37 = f1Var28;
                                    final f1.f1 f1Var38 = f1Var22;
                                    final f1.f1 f1Var39 = f1Var23;
                                    final f1.f1 f1Var40 = f1Var24;
                                    final f1.f1 f1Var41 = f1Var25;
                                    final f1.f1 f1Var42 = f1Var26;
                                    final f1.a1 a1Var22 = a1Var14;
                                    ej.c cVar9 = new ej.c() { // from class: lb.b0
                                        @Override // ej.c
                                        public final Object invoke(Object obj7) {
                                            int i112 = i11;
                                            Boolean bool2 = (Boolean) obj7;
                                            bool2.booleanValue();
                                            switch (i112) {
                                                case 0:
                                                    f1.a1 a1Var212 = a1Var22;
                                                    a1Var212.setValue(bool2);
                                                    l0.f(a1Var21, a1Var10, a1Var212, f1Var36, f1Var37, f1Var38, f1Var39, f1Var40, f1Var41, f1Var42, gVar5);
                                                    break;
                                                default:
                                                    f1.a1 a1Var222 = a1Var22;
                                                    a1Var222.setValue(bool2);
                                                    l0.f(a1Var21, a1Var222, a1Var10, f1Var36, f1Var37, f1Var38, f1Var39, f1Var40, f1Var41, f1Var42, gVar5);
                                                    break;
                                            }
                                            return pi.o.f13011a;
                                        }
                                    };
                                    i0Var6.l0(cVar9);
                                    objQ19 = cVar9;
                                }
                                sa.l0.a(zBooleanValue2, (ej.c) objQ19, null, false, i0Var6, 0, 12);
                                i0Var6.p(true);
                            } else {
                                i0Var6.W();
                            }
                            return pi.o.f13011a;
                        }
                    }, i0Var5), i0Var5, 6);
                    b0.d.e(i0Var5, t1.e(24, v1.l.f17564b));
                } else {
                    i0Var5.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ j(a1 a1Var, a1 a1Var2, a1 a1Var3, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, lb.g gVar) {
        this.f303d = gVar;
        this.f301b = a1Var;
        this.f302c = a1Var2;
        this.f304e = f1Var;
        this.f305f = f1Var2;
        this.f306z = f1Var3;
        this.A = f1Var4;
        this.B = f1Var5;
        this.C = f1Var6;
        this.D = f1Var7;
        this.E = a1Var3;
    }
}
