package va;

import android.graphics.Rect;
import androidx.lifecycle.j0;
import b0.q1;
import b0.t1;
import b0.y;
import c1.a2;
import c1.p3;
import c1.v7;
import c1.z4;
import c2.e0;
import c2.w;
import c2.z0;
import f1.a1;
import f1.i0;
import f1.n1;
import i2.h0;
import java.util.ArrayList;
import java.util.List;
import t.m1;
import t.o1;
import t.u0;
import t2.q0;
import v2.f2;
import w2.f1;
import wa.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f17932a = t.d.t(480, 0, new t.s(0.16f, 1.0f, 0.3f, 1.0f), 2);

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f17933b = t.d.s(1.0f, 1500.0f, null, 4);

    public static final void a(final v vVar, final Rect rect, mi.p pVar, final ej.c cVar, ej.a aVar, final ej.a aVar2, final ej.a aVar3, i0 i0Var, int i10) {
        a1 a1Var;
        s3.c cVar2;
        boolean z2;
        Object obj;
        fj.l.f(cVar, "onAppClick");
        fj.l.f(aVar2, "onClose");
        i0Var.c0(151872479);
        int i11 = i10 | (i0Var.f(vVar) ? 4 : 2) | (i0Var.h(rect) ? 32 : 16) | (i0Var.h(cVar) ? 2048 : 1024) | (i0Var.h(aVar2) ? 131072 : 65536) | (i0Var.h(aVar3) ? 1048576 : 524288);
        if (i0Var.T(i11 & 1, (599059 & i11) != 599058)) {
            s3.c cVar3 = (s3.c) i0Var.j(f1.f18262h);
            boolean zBooleanValue = ((Boolean) i0Var.j(jb.f.f8824d)).booleanValue();
            final float fFloatValue = ((Number) i0Var.j(jb.f.f8823c)).floatValue();
            final float fW0 = cVar3.w0(300.0f);
            float fO = rect != null ? cg.b.o((rect != null ? rect.width() : fW0) / fW0, 0.05f, 1.0f) : 0.15f;
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (objQ == obj2) {
                objQ = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ);
            }
            final a1 a1Var2 = (a1) objQ;
            boolean zF = i0Var.f(vVar.f18007a);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj2) {
                objQ2 = f1.s.A(Boolean.TRUE);
                i0Var.l0(objQ2);
            }
            a1 a1Var3 = (a1) objQ2;
            boolean zG = i0Var.g(((Boolean) a1Var2.getValue()).booleanValue());
            Object objQ3 = i0Var.Q();
            if (zG || objQ3 == obj2) {
                objQ3 = new g0.g(aVar, a1Var2, a1Var3);
                i0Var.l0(objQ3);
            }
            ej.a aVar4 = (ej.a) objQ3;
            boolean z10 = (i11 & 14) == 4;
            Object objQ4 = i0Var.Q();
            if (z10 || objQ4 == obj2) {
                ArrayList arrayList = vVar.f18009c;
                ArrayList arrayList2 = new ArrayList(qi.m.s0(arrayList));
                int size = arrayList.size();
                a1Var = a1Var3;
                int i12 = 0;
                int i13 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    int i14 = i12 + 1;
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        yd.f.i0();
                        throw null;
                    }
                    float f10 = 1;
                    arrayList2.add(new o0((xa.f) obj3, new ca.a(i13 % 3, i13 / 3), new ca.b(f10, f10)));
                    size = size;
                    i13 = i15;
                    arrayList = arrayList;
                    i12 = i14;
                    cVar3 = cVar3;
                    zBooleanValue = zBooleanValue;
                }
                cVar2 = cVar3;
                z2 = zBooleanValue;
                i0Var.l0(arrayList2);
                obj = arrayList2;
            } else {
                a1Var = a1Var3;
                cVar2 = cVar3;
                z2 = zBooleanValue;
                obj = objQ4;
            }
            final List list = (List) obj;
            b0.i0 i0Var2 = t1.f1433c;
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj2) {
                objQ5 = m1.p(i0Var);
            }
            final float f11 = fO;
            final a1 a1Var4 = a1Var;
            final boolean z11 = z2;
            final s3.c cVar4 = cVar2;
            b0.d.a(v.n.k(i0Var2, (z.k) objQ5, null, false, null, aVar4, 28), v1.b.f17548b, p1.j.d(1326016181, new ej.f() { // from class: va.b
                @Override // ej.f
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    float f12;
                    a1 a1Var5;
                    Object eVar;
                    float f13;
                    float f14;
                    a1 a1Var6;
                    t.c cVar5;
                    t.c cVar6;
                    a1 a1Var7;
                    float f15;
                    int i16;
                    ga.c cVar7;
                    boolean z12;
                    boolean z13;
                    y yVar = (y) obj4;
                    i0 i0Var3 = (i0) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    fj.l.f(yVar, "$this$BoxWithConstraints");
                    long j = yVar.f1460b;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var3.f(yVar) ? 4 : 2;
                    }
                    boolean z14 = (iIntValue & 19) != 18;
                    f2 f2Var = i0Var3.f6313a;
                    if (i0Var3.T(iIntValue & 1, z14)) {
                        float fG = s3.a.g(j) * 0.25f;
                        Rect rect2 = rect;
                        float fExactCenterX = rect2 != null ? rect2.exactCenterX() - (s3.a.h(j) / 2.0f) : 0.0f;
                        float f16 = fW0;
                        float f17 = f11;
                        float fExactCenterY = rect2 != null ? (rect2.exactCenterY() - fG) - ((f16 / 2.0f) * f17) : 0.0f;
                        float fHypot = (float) Math.hypot(fExactCenterX, fExactCenterY);
                        float f18 = fHypot > 10.0f ? fExactCenterX / fHypot : 0.0f;
                        float f19 = fHypot > 10.0f ? fExactCenterY / fHypot : 0.0f;
                        v vVar2 = vVar;
                        Object obj7 = vVar2.f18007a;
                        boolean zF2 = i0Var3.f(obj7);
                        Object objQ6 = i0Var3.Q();
                        Object obj8 = f1.m.f6385a;
                        if (zF2 || objQ6 == obj8) {
                            objQ6 = t.d.a(f17, 0.01f);
                            i0Var3.l0(objQ6);
                        }
                        t.c cVar8 = (t.c) objQ6;
                        boolean zF3 = i0Var3.f(obj7);
                        Object objQ7 = i0Var3.Q();
                        if (zF3 || objQ7 == obj8) {
                            objQ7 = t.d.a(fExactCenterX, 0.01f);
                            i0Var3.l0(objQ7);
                        }
                        t.c cVar9 = (t.c) objQ7;
                        boolean zF4 = i0Var3.f(obj7);
                        Object objQ8 = i0Var3.Q();
                        if (zF4 || objQ8 == obj8) {
                            objQ8 = t.d.a(fExactCenterY, 0.01f);
                            i0Var3.l0(objQ8);
                        }
                        t.c cVar10 = (t.c) objQ8;
                        boolean zF5 = i0Var3.f(obj7);
                        Object objQ9 = i0Var3.Q();
                        if (zF5 || objQ9 == obj8) {
                            objQ9 = t.d.a(81.0f, 0.01f);
                            i0Var3.l0(objQ9);
                        }
                        t.c cVar11 = (t.c) objQ9;
                        boolean zF6 = i0Var3.f(obj7);
                        Object objQ10 = i0Var3.Q();
                        if (zF6 || objQ10 == obj8) {
                            Object objA = t.d.a(0.0f, 0.01f);
                            i0Var3.l0(objA);
                            objQ10 = objA;
                        }
                        t.c cVar12 = (t.c) objQ10;
                        a1 a1Var8 = a1Var4;
                        boolean zF7 = i0Var3.f(a1Var8) | i0Var3.h(cVar8) | i0Var3.h(cVar9) | i0Var3.h(cVar10) | i0Var3.h(cVar11) | i0Var3.h(cVar12);
                        Object objQ11 = i0Var3.Q();
                        if (zF7 || objQ11 == obj8) {
                            objQ11 = new j0(a1Var8, cVar8, cVar9, cVar10, cVar11, cVar12, null, 5);
                            f12 = f16;
                            a1Var5 = a1Var8;
                            i0Var3.l0(objQ11);
                        } else {
                            f12 = f16;
                            a1Var5 = a1Var8;
                        }
                        f1.s.f((ej.e) objQ11, i0Var3, obj7);
                        a1 a1Var9 = a1Var2;
                        Boolean bool = (Boolean) a1Var9.getValue();
                        bool.getClass();
                        boolean zH = i0Var3.h(cVar8) | i0Var3.c(f17) | i0Var3.h(cVar9) | i0Var3.c(fExactCenterX) | i0Var3.h(cVar10) | i0Var3.c(fExactCenterY) | i0Var3.h(cVar11) | i0Var3.h(cVar12) | i0Var3.f(a1Var5);
                        ej.a aVar5 = aVar2;
                        boolean zF8 = zH | i0Var3.f(aVar5);
                        float f20 = fExactCenterY;
                        Object objQ12 = i0Var3.Q();
                        if (zF8 || objQ12 == obj8) {
                            a1 a1Var10 = a1Var5;
                            f13 = fExactCenterX;
                            f14 = f12;
                            a1Var6 = a1Var9;
                            eVar = new e(aVar5, a1Var6, cVar8, f17, cVar9, f13, cVar10, f20, cVar11, cVar12, a1Var10, null);
                            cVar5 = cVar9;
                            cVar6 = cVar11;
                            a1Var7 = a1Var10;
                            f15 = f17;
                            i0Var3.l0(eVar);
                        } else {
                            cVar6 = cVar11;
                            f13 = fExactCenterX;
                            a1Var7 = a1Var5;
                            f15 = f17;
                            eVar = objQ12;
                            f14 = f12;
                            a1Var6 = a1Var9;
                            cVar5 = cVar9;
                        }
                        f1.s.f((ej.e) eVar, i0Var3, bool);
                        ga.c cVar13 = new ga.c(((Number) cVar6.e()).floatValue(), 1);
                        float fHypot2 = (float) (((Boolean) a1Var6.getValue()).booleanValue() ? Math.hypot(((Number) cVar5.e()).floatValue() - f13, ((Number) cVar10.e()).floatValue() - f20) : Math.hypot(((Number) cVar5.e()).floatValue(), ((Number) cVar10.e()).floatValue()));
                        boolean z15 = ((Boolean) a1Var7.getValue()).booleanValue() && fHypot2 > f14 * 0.12f;
                        s3.c cVar14 = cVar4;
                        float fL0 = cVar14.l0(fG);
                        v1.l lVar = v1.l.f17564b;
                        v1.o oVarX = b0.d.x(lVar, 0.0f, fL0, 0.0f, 0.0f, 13);
                        boolean zH2 = i0Var3.h(cVar8) | i0Var3.h(cVar5) | i0Var3.h(cVar10);
                        Object objQ13 = i0Var3.Q();
                        if (zH2 || objQ13 == obj8) {
                            i16 = 1;
                            objQ13 = new fb.d(cVar8, cVar5, cVar10, 1);
                            i0Var3.l0(objQ13);
                        } else {
                            i16 = 1;
                        }
                        v1.o oVarQ = e0.q(oVarX, (ej.c) objQ13);
                        t.c cVar15 = cVar5;
                        long j4 = w.f3054d;
                        v1.o oVarF = v.n.f(oVarQ, w.c(j4, 0.0f), cVar13);
                        if (z11) {
                            oVarF = a.a.L(oVarF, cVar13, w.c(j4, 0.0f), i16, (float) 0.5d, fFloatValue, 64);
                            cVar7 = cVar13;
                        } else {
                            cVar7 = cVar13;
                        }
                        v1.o oVar = oVarF;
                        Object objQ14 = i0Var3.Q();
                        if (objQ14 == obj8) {
                            objQ14 = m1.p(i0Var3);
                        }
                        z.k kVar = (z.k) objQ14;
                        Object objQ15 = i0Var3.Q();
                        if (objQ15 == obj8) {
                            objQ15 = new s1.g(18);
                            i0Var3.l0(objQ15);
                        }
                        v1.o oVarK = v.n.k(oVar, kVar, null, false, null, (ej.a) objQ15, 28);
                        cVar14.h0(s3.a.h(j));
                        cVar14.h0(s3.a.g(j));
                        v1.o oVarQ2 = t1.q(t1.f(t1.o(300.0f, oVarK), 0.0f, 420.0f, 1));
                        v1.g gVar = v1.b.f17547a;
                        q0 q0VarD = b0.r.d(gVar, false);
                        int iHashCode = Long.hashCode(i0Var3.T);
                        n1 n1VarL = i0Var3.l();
                        v1.o oVarC = v1.a.c(i0Var3, oVarQ2);
                        v2.h.f17668w.getClass();
                        ej.a aVar6 = v2.g.f17645b;
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(aVar6);
                        } else {
                            i0Var3.o0();
                        }
                        v2.e eVar2 = v2.g.f17649f;
                        f1.s.M(eVar2, i0Var3, q0VarD);
                        v2.e eVar3 = v2.g.f17648e;
                        f1.s.M(eVar3, i0Var3, n1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        v2.e eVar4 = v2.g.f17650g;
                        f1.s.w(i0Var3, numValueOf, eVar4);
                        v2.d dVar = v2.g.f17651h;
                        f1.s.I(dVar, i0Var3);
                        ga.c cVar16 = cVar7;
                        v2.e eVar5 = v2.g.f17647d;
                        f1.s.M(eVar5, i0Var3, oVarC);
                        v1.o oVarP = b0.d.p(b0.w.f1450a.b(lVar, gVar), 18.0f, -36);
                        boolean zH3 = i0Var3.h(cVar12);
                        Object objQ16 = i0Var3.Q();
                        if (zH3 || objQ16 == obj8) {
                            objQ16 = new p3(cVar12, 2);
                            i0Var3.l0(objQ16);
                        }
                        v1.o oVarQ3 = e0.q(oVarP, (ej.c) objQ16);
                        q1 q1VarA = b0.o1.a(b0.j.g(8), v1.b.D, i0Var3, 54);
                        int iHashCode2 = Long.hashCode(i0Var3.T);
                        n1 n1VarL2 = i0Var3.l();
                        v1.o oVarC2 = v1.a.c(i0Var3, oVarQ3);
                        i0Var3.e0();
                        if (i0Var3.S) {
                            i0Var3.k(aVar6);
                        } else {
                            i0Var3.o0();
                        }
                        f1.s.M(eVar2, i0Var3, q1VarA);
                        f1.s.M(eVar3, i0Var3, n1VarL2);
                        gk.b.u(iHashCode2, i0Var3, eVar4, i0Var3, dVar);
                        f1.s.M(eVar5, i0Var3, oVarC2);
                        v7.a(vVar2.f18008b, null, j4, hj.a.x(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 24960, 0, 262122);
                        i0 i0Var4 = i0Var3;
                        if (vVar2.f18010d) {
                            i0Var4.b0(-1108781601);
                            Object objQ17 = i0Var4.Q();
                            if (objQ17 == obj8) {
                                objQ17 = f1.s.A(Boolean.FALSE);
                                i0Var4.l0(objQ17);
                            }
                            a1 a1Var11 = (a1) objQ17;
                            Object objQ18 = i0Var4.Q();
                            if (objQ18 == obj8) {
                                objQ18 = m1.p(i0Var4);
                            }
                            z.k kVar2 = (z.k) objQ18;
                            Object objQ19 = i0Var4.Q();
                            if (objQ19 == obj8) {
                                objQ19 = new r0.d(a1Var11, 23);
                                i0Var4.l0(objQ19);
                            }
                            v1.o oVarT = b0.d.t(4, v.n.k(lVar, kVar2, null, false, null, (ej.a) objQ19, 28));
                            q0 q0VarD2 = b0.r.d(gVar, false);
                            int iHashCode3 = Long.hashCode(i0Var4.T);
                            n1 n1VarL3 = i0Var4.l();
                            v1.o oVarC3 = v1.a.c(i0Var4, oVarT);
                            i0Var4.e0();
                            if (i0Var4.S) {
                                i0Var4.k(aVar6);
                            } else {
                                i0Var4.o0();
                            }
                            f1.s.M(eVar2, i0Var4, q0VarD2);
                            f1.s.M(eVar3, i0Var4, n1VarL3);
                            gk.b.u(iHashCode3, i0Var4, eVar4, i0Var4, dVar);
                            f1.s.M(eVar5, i0Var4, oVarC3);
                            i2.f fVarB = u1.d.f16567a;
                            if (fVarB == null) {
                                i2.e eVar6 = new i2.e("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i17 = h0.f8270a;
                                z0 z0Var = new z0(w.f3052b);
                                d8.e eVar7 = new d8.e(9);
                                eVar7.x(12.0f, 8.0f);
                                eVar7.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                                eVar7.D(-0.9f, -2.0f, -2.0f, -2.0f);
                                eVar7.D(-2.0f, 0.9f, -2.0f, 2.0f);
                                eVar7.D(0.9f, 2.0f, 2.0f, 2.0f);
                                eVar7.k();
                                eVar7.x(12.0f, 10.0f);
                                eVar7.o(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                eVar7.D(0.9f, 2.0f, 2.0f, 2.0f);
                                eVar7.D(2.0f, -0.9f, 2.0f, -2.0f);
                                eVar7.D(-0.9f, -2.0f, -2.0f, -2.0f);
                                eVar7.k();
                                eVar7.x(12.0f, 16.0f);
                                eVar7.o(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                                eVar7.D(0.9f, 2.0f, 2.0f, 2.0f);
                                eVar7.D(2.0f, -0.9f, 2.0f, -2.0f);
                                eVar7.D(-0.9f, -2.0f, -2.0f, -2.0f);
                                eVar7.k();
                                i2.e.a(eVar6, (ArrayList) eVar7.f5001a, z0Var);
                                fVarB = eVar6.b();
                                u1.d.f16567a = fVarB;
                            }
                            a2.b(fVarB, "Options", t1.k(20, lVar), w.c(j4, 0.8f), i0Var4, 3504, 0);
                            i0Var4.p(true);
                            if (((Boolean) a1Var11.getValue()).booleanValue()) {
                                i0Var4.b0(-1107808666);
                                Object objQ20 = i0Var4.Q();
                                if (objQ20 == obj8) {
                                    objQ20 = new r0.d(a1Var11, 24);
                                    i0Var4.l0(objQ20);
                                }
                                z12 = true;
                                z13 = false;
                                z4.a((ej.a) objQ20, p1.j.d(-1261144371, new ab.g(aVar3, a1Var11), i0Var4), null, p1.j.d(597175819, new lb.o(a1Var11, 6), i0Var4), a.f17902c, a.f17903d, null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var4, 1772598, 0, 16276);
                                i0Var4 = i0Var4;
                                i0Var4.p(false);
                            } else {
                                z12 = true;
                                z13 = false;
                                i0Var4.b0(-1106673725);
                                i0Var4.p(false);
                            }
                            i0Var4.p(z13);
                        } else {
                            z12 = true;
                            i0Var4.b0(-1106655869);
                            i0Var4.p(false);
                        }
                        i0Var4.p(z12);
                        a.c(t1.f1433c, list, cVar16, z15, f15, f18, f19, ((Number) cVar15.e()).floatValue(), ((Number) cVar10.e()).floatValue(), fHypot2, cVar, i0Var4, 28038);
                        i0Var4.p(z12);
                    } else {
                        i0Var3.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 3120, 4);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c(vVar, rect, pVar, cVar, aVar, aVar2, aVar3, i10);
        }
    }
}
