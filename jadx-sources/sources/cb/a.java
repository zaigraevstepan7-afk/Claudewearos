package cb;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.b0;
import b0.i1;
import b0.o1;
import b0.q1;
import b0.r;
import b0.t1;
import b0.y0;
import b0.z;
import c1.b7;
import c1.b8;
import c1.f7;
import c1.i5;
import c1.o8;
import c1.p4;
import c1.p8;
import c1.t0;
import c1.v6;
import c1.v7;
import c1.w0;
import c1.x0;
import c1.z4;
import f1.a1;
import f1.f1;
import f1.g1;
import f1.i0;
import f1.n1;
import f1.r2;
import f1.s;
import java.util.Arrays;
import java.util.Iterator;
import t2.q0;
import v1.o;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f3145a = new p1.e(new p4(15), false, -1808965041);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f3146b = new p1.e(new p4(16), false, -1269516881);

    public static final void a(final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, final int i10, final boolean z2, final boolean z10, final boolean z11, final boolean z12, final ej.c cVar, final ej.c cVar2, final ej.c cVar3, final ej.c cVar4, final ej.c cVar5, final ej.c cVar6, final ej.c cVar7, final ej.c cVar8, final ej.c cVar9, final ej.c cVar10, final ej.c cVar11, i0 i0Var, final int i11) {
        i0Var.c0(2130879737);
        int i12 = i11 | (i0Var.c(f10) ? 4 : 2) | (i0Var.c(f11) ? 32 : 16) | (i0Var.c(f12) ? 256 : 128) | (i0Var.c(f13) ? 2048 : 1024) | (i0Var.c(f14) ? 16384 : 8192) | (i0Var.c(f15) ? 131072 : 65536) | (i0Var.d(i10) ? 1048576 : 524288) | (i0Var.g(z2) ? 8388608 : 4194304) | (i0Var.g(z10) ? 67108864 : 33554432) | (i0Var.g(z11) ? 536870912 : 268435456);
        if (i0Var.T(i12 & 1, ((i12 & 306783379) == 306783378 && (((i0Var.g(z12) ? (char) 4 : (char) 2) | '\u6db0') & 306783379) == 306783378) ? false : true)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = s.A(Boolean.TRUE);
                i0Var.l0(objQ);
            }
            final a1 a1Var = (a1) objQ;
            b7.a(t1.c(1.0f, v1.l.f17564b), null, ((w0) i0Var.j(x0.f2845a)).f2806p, 0L, 2, 0.0f, p1.j.d(-1614484908, new ej.e() { // from class: cb.c
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    v2.f fVar;
                    i0 i0Var2 = (i0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z13 = (iIntValue & 3) != 2;
                    f2 f2Var = i0Var2.f6313a;
                    if (i0Var2.T(iIntValue & 1, z13)) {
                        v1.l lVar = v1.l.f17564b;
                        o oVarT = b0.d.t(16, t1.c(1.0f, lVar));
                        b0.e eVar = b0.j.f1361c;
                        v1.e eVar2 = v1.b.E;
                        b0 b0VarA = z.a(eVar, eVar2, i0Var2, 0);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        n1 n1VarL = i0Var2.l();
                        o oVarC = v1.a.c(i0Var2, oVarT);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(fVar2);
                        } else {
                            i0Var2.o0();
                        }
                        v2.e eVar3 = v2.g.f17649f;
                        s.M(eVar3, i0Var2, b0VarA);
                        v2.e eVar4 = v2.g.f17648e;
                        s.M(eVar4, i0Var2, n1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        v2.e eVar5 = v2.g.f17650g;
                        s.w(i0Var2, numValueOf, eVar5);
                        v2.d dVar = v2.g.f17651h;
                        s.I(dVar, i0Var2);
                        v2.e eVar6 = v2.g.f17647d;
                        s.M(eVar6, i0Var2, oVarC);
                        o oVarC2 = t1.c(1.0f, lVar);
                        b0.f fVar3 = b0.j.f1365g;
                        v1.f fVar4 = v1.b.D;
                        q1 q1VarA = o1.a(fVar3, fVar4, i0Var2, 54);
                        int iHashCode2 = Long.hashCode(i0Var2.T);
                        n1 n1VarL2 = i0Var2.l();
                        o oVarC3 = v1.a.c(i0Var2, oVarC2);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(fVar2);
                        } else {
                            i0Var2.o0();
                        }
                        s.M(eVar3, i0Var2, q1VarA);
                        s.M(eVar4, i0Var2, n1VarL2);
                        gk.b.u(iHashCode2, i0Var2, eVar5, i0Var2, dVar);
                        s.M(eVar6, i0Var2, oVarC3);
                        v7.a("Controls", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((o8) i0Var2.j(p8.f2587a)).f2549h, i0Var2, 6, 0, 131070);
                        Object objQ2 = i0Var2.Q();
                        a1 a1Var2 = a1Var;
                        f1.f fVar5 = f1.m.f6385a;
                        if (objQ2 == fVar5) {
                            objQ2 = new b8(a1Var2, 1);
                            i0Var2.l0(objQ2);
                        }
                        z4.i((ej.a) objQ2, null, false, null, null, null, p1.j.d(971669405, new e(a1Var2, 0), i0Var2), i0Var2, 805306374, 510);
                        i0 i0Var3 = i0Var2;
                        boolean z14 = true;
                        i0Var3.p(true);
                        if (((Boolean) a1Var2.getValue()).booleanValue()) {
                            i0Var3.b0(-1287613604);
                            o oVarC4 = t1.c(1.0f, lVar);
                            b0 b0VarA2 = z.a(b0.j.g(8), eVar2, i0Var3, 6);
                            int iHashCode3 = Long.hashCode(i0Var3.T);
                            n1 n1VarL3 = i0Var3.l();
                            o oVarC5 = v1.a.c(i0Var3, oVarC4);
                            i0Var3.e0();
                            if (i0Var3.S) {
                                fVar = fVar2;
                                i0Var3.k(fVar);
                            } else {
                                fVar = fVar2;
                                i0Var3.o0();
                            }
                            s.M(eVar3, i0Var3, b0VarA2);
                            s.M(eVar4, i0Var3, n1VarL3);
                            gk.b.u(iHashCode3, i0Var3, eVar5, i0Var3, dVar);
                            s.M(eVar6, i0Var3, oVarC5);
                            a.c("Intensity", f10, 0.0f, 1.0f, cVar, i0Var3, 3462);
                            a.c("Speed", f11, 0.0f, 10.0f, cVar2, i0Var3, 3462);
                            a.c("Brightness", f12, 0.0f, 1.0f, cVar3, i0Var3, 3462);
                            a.c("Normal", f13, 0.0f, 3.0f, cVar4, i0Var3, 3462);
                            a.c("Zoom", f14, 0.1f, 3.0f, cVar5, i0Var3, 3462);
                            a.c("Blur", f15, 0.0f, 10.0f, cVar6, i0Var3, 3462);
                            o oVarC6 = t1.c(1.0f, lVar);
                            q1 q1VarA2 = o1.a(fVar3, fVar4, i0Var3, 54);
                            int iHashCode4 = Long.hashCode(i0Var3.T);
                            n1 n1VarL4 = i0Var3.l();
                            o oVarC7 = v1.a.c(i0Var3, oVarC6);
                            i0Var3.e0();
                            if (i0Var3.S) {
                                i0Var3.k(fVar);
                            } else {
                                i0Var3.o0();
                            }
                            s.M(eVar3, i0Var3, q1VarA2);
                            s.M(eVar4, i0Var3, n1VarL4);
                            gk.b.u(iHashCode4, i0Var3, eVar5, i0Var3, dVar);
                            s.M(eVar6, i0Var3, oVarC7);
                            v2.f fVar6 = fVar;
                            f1.f fVar7 = fVar5;
                            v7.a("Blur Quality", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 6, 0, 262142);
                            i0Var3 = i0Var3;
                            q1 q1VarA3 = o1.a(b0.j.g(4), v1.b.C, i0Var3, 6);
                            int iHashCode5 = Long.hashCode(i0Var3.T);
                            n1 n1VarL5 = i0Var3.l();
                            o oVarC8 = v1.a.c(i0Var3, lVar);
                            i0Var3.e0();
                            if (i0Var3.S) {
                                i0Var3.k(fVar6);
                            } else {
                                i0Var3.o0();
                            }
                            s.M(eVar3, i0Var3, q1VarA3);
                            s.M(eVar4, i0Var3, n1VarL5);
                            gk.b.u(iHashCode5, i0Var3, eVar5, i0Var3, dVar);
                            s.M(eVar6, i0Var3, oVarC8);
                            i0Var3.b0(1118889731);
                            Iterator it = qi.k.c0(new Integer[]{1, 16, 32, 64}).iterator();
                            while (it.hasNext()) {
                                final int iIntValue2 = ((Number) it.next()).intValue();
                                boolean z15 = i10 == iIntValue2;
                                ej.c cVar12 = cVar7;
                                boolean zF = i0Var3.f(cVar12) | i0Var3.d(iIntValue2);
                                Object objQ3 = i0Var3.Q();
                                f1.f fVar8 = fVar7;
                                if (zF || objQ3 == fVar8) {
                                    objQ3 = new g(cVar12, iIntValue2, 0);
                                    i0Var3.l0(objQ3);
                                }
                                i0 i0Var4 = i0Var3;
                                t0.b(z15, (ej.a) objQ3, p1.j.d(1478909562, new ej.e() { // from class: cb.h
                                    @Override // ej.e
                                    public final Object invoke(Object obj3, Object obj4) {
                                        i0 i0Var5 = (i0) obj3;
                                        int iIntValue3 = ((Integer) obj4).intValue();
                                        if (i0Var5.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            v7.a(String.valueOf(iIntValue2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var5, 0, 0, 262142);
                                        } else {
                                            i0Var5.W();
                                        }
                                        return pi.o.f13011a;
                                    }
                                }, i0Var3), null, false, null, null, null, null, i0Var4, 384);
                                i0Var3 = i0Var4;
                                fVar7 = fVar8;
                            }
                            i0Var3.p(false);
                            z14 = true;
                            i0Var3.p(true);
                            i0Var3.p(true);
                            a.d("Lightning", z2, cVar8, i0Var3, 6);
                            a.d("Post Processing", z10, cVar9, i0Var3, 6);
                            a.d("Panning", z11, cVar10, i0Var3, 6);
                            a.d("Scale to Fill", z12, cVar11, i0Var3, 6);
                            i0Var3.p(true);
                            i0Var3.p(false);
                        } else {
                            i0Var3.b0(-1285822300);
                            i0Var3.p(false);
                        }
                        i0Var3.p(z14);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 12607494, 106);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(f10, f11, f12, f13, f14, f15, i10, z2, z10, z11, z12, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, i11) { // from class: cb.d
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ ej.c E;
                public final /* synthetic */ ej.c F;
                public final /* synthetic */ ej.c G;
                public final /* synthetic */ ej.c H;
                public final /* synthetic */ ej.c I;
                public final /* synthetic */ ej.c J;
                public final /* synthetic */ ej.c K;
                public final /* synthetic */ ej.c L;
                public final /* synthetic */ ej.c M;
                public final /* synthetic */ ej.c N;
                public final /* synthetic */ ej.c O;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f3156a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f3157b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f3158c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f3159d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f3160e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f3161f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ int f3162z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(1);
                    a.a(this.f3156a, this.f3157b, this.f3158c, this.f3159d, this.f3160e, this.f3161f, this.f3162z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(ej.a aVar, i0 i0Var, int i10) {
        fj.l.f(aVar, "onBack");
        i0Var.c0(506888143);
        int i11 = i10 | (i0Var.h(aVar) ? 4 : 2);
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = y8.f.a(0.5f, i0Var);
            }
            final f1 f1Var = (f1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = y8.f.a(3.0f, i0Var);
            }
            final f1 f1Var2 = (f1) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj) {
                objQ3 = y8.f.a(0.8f, i0Var);
            }
            final f1 f1Var3 = (f1) objQ3;
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                objQ4 = y8.f.a(0.5f, i0Var);
            }
            final f1 f1Var4 = (f1) objQ4;
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj) {
                objQ5 = y8.f.a(2.61f, i0Var);
            }
            final f1 f1Var5 = (f1) objQ5;
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj) {
                objQ6 = y8.f.a(0.5f, i0Var);
            }
            final f1 f1Var6 = (f1) objQ6;
            Object objQ7 = i0Var.Q();
            if (objQ7 == obj) {
                objQ7 = new g1(16);
                i0Var.l0(objQ7);
            }
            final g1 g1Var = (g1) objQ7;
            Object objQ8 = i0Var.Q();
            if (objQ8 == obj) {
                objQ8 = s.A(Boolean.FALSE);
                i0Var.l0(objQ8);
            }
            final a1 a1Var = (a1) objQ8;
            Object objQ9 = i0Var.Q();
            if (objQ9 == obj) {
                objQ9 = s.A(Boolean.FALSE);
                i0Var.l0(objQ9);
            }
            final a1 a1Var2 = (a1) objQ9;
            Object objQ10 = i0Var.Q();
            if (objQ10 == obj) {
                objQ10 = s.A(Boolean.FALSE);
                i0Var.l0(objQ10);
            }
            final a1 a1Var3 = (a1) objQ10;
            Object objQ11 = i0Var.Q();
            if (objQ11 == obj) {
                objQ11 = s.A(Boolean.TRUE);
                i0Var.l0(objQ11);
            }
            final a1 a1Var4 = (a1) objQ11;
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ12 = i0Var.Q();
            Object obj2 = objQ12;
            if (objQ12 == obj) {
                m mVar = new m(context, null);
                mVar.a(f1Var.g(), f1Var2.g(), f1Var3.g(), f1Var4.g(), f1Var5.g(), f1Var6.g(), g1Var.g(), ((Boolean) a1Var.getValue()).booleanValue(), ((Boolean) a1Var2.getValue()).booleanValue(), ((Boolean) a1Var3.getValue()).booleanValue(), ((Boolean) a1Var4.getValue()).booleanValue());
                i0Var.l0(mVar);
                obj2 = mVar;
            }
            final m mVar2 = (m) obj2;
            Float fValueOf = Float.valueOf(f1Var.g());
            Float fValueOf2 = Float.valueOf(f1Var2.g());
            Float fValueOf3 = Float.valueOf(f1Var3.g());
            Float fValueOf4 = Float.valueOf(f1Var4.g());
            Float fValueOf5 = Float.valueOf(f1Var5.g());
            Float fValueOf6 = Float.valueOf(f1Var6.g());
            Integer numValueOf = Integer.valueOf(g1Var.g());
            Boolean bool = (Boolean) a1Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) a1Var2.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) a1Var3.getValue();
            bool3.getClass();
            Boolean bool4 = (Boolean) a1Var4.getValue();
            bool4.getClass();
            Object[] objArr = {fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, numValueOf, bool, bool2, bool3, bool4};
            boolean zH = i0Var.h(mVar2);
            Object objQ13 = i0Var.Q();
            if (zH || objQ13 == obj) {
                Object lVar = new l(mVar2, f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var6, g1Var, a1Var, a1Var2, a1Var3, a1Var4, null);
                i0Var.l0(lVar);
                objQ13 = lVar;
            }
            s.i(objArr, (ej.e) objQ13, i0Var);
            i5.a(null, p1.j.d(-1163874413, new b(0, aVar), i0Var), null, null, null, 0, 0L, 0L, null, p1.j.d(2131217566, new ej.f() { // from class: cb.f
                @Override // ej.f
                public final Object c(Object obj3, Object obj4, Object obj5) {
                    float f10;
                    i1 i1Var = (i1) obj3;
                    i0 i0Var2 = (i0) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    fj.l.f(i1Var, "padding");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var2.f(i1Var) ? 4 : 2;
                    }
                    boolean z2 = (iIntValue & 19) != 18;
                    f2 f2Var = i0Var2.f6313a;
                    if (i0Var2.T(iIntValue & 1, z2)) {
                        b0.i0 i0Var3 = t1.f1433c;
                        o oVarS = b0.d.s(i0Var3, i1Var);
                        b0 b0VarA = z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        n1 n1VarL = i0Var2.l();
                        o oVarC = v1.a.c(i0Var2, oVarS);
                        v2.h.f17668w.getClass();
                        ej.a aVar2 = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar2);
                        } else {
                            i0Var2.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        s.M(eVar, i0Var2, b0VarA);
                        v2.e eVar2 = v2.g.f17648e;
                        s.M(eVar2, i0Var2, n1VarL);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        v2.e eVar3 = v2.g.f17650g;
                        s.w(i0Var2, numValueOf2, eVar3);
                        v2.d dVar = v2.g.f17651h;
                        s.I(dVar, i0Var2);
                        v2.e eVar4 = v2.g.f17647d;
                        s.M(eVar4, i0Var2, oVarC);
                        o oVarC2 = t1.c(1.0f, v1.l.f17564b);
                        if (1.0f <= 0.0d) {
                            c0.a.a("invalid weight; must be greater than zero");
                        }
                        o oVarC3 = oVarC2.c(new y0(1.0f, true));
                        q0 q0VarD = r.d(v1.b.f17547a, false);
                        int iHashCode2 = Long.hashCode(i0Var2.T);
                        n1 n1VarL2 = i0Var2.l();
                        o oVarC4 = v1.a.c(i0Var2, oVarC3);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar2);
                        } else {
                            i0Var2.o0();
                        }
                        s.M(eVar, i0Var2, q0VarD);
                        s.M(eVar2, i0Var2, n1VarL2);
                        gk.b.u(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
                        s.M(eVar4, i0Var2, oVarC4);
                        m mVar3 = mVar2;
                        boolean zH2 = i0Var2.h(mVar3);
                        Object objQ14 = i0Var2.Q();
                        Object obj6 = f1.m.f6385a;
                        if (zH2 || objQ14 == obj6) {
                            objQ14 = new k(mVar3, 0);
                            i0Var2.l0(objQ14);
                        }
                        v3.j.a(48, 4, (ej.c) objQ14, null, i0Var2, i0Var3);
                        i0Var2.p(true);
                        f1 f1Var7 = f1Var;
                        float fG = f1Var7.g();
                        f1 f1Var8 = f1Var2;
                        float fG2 = f1Var8.g();
                        f1 f1Var9 = f1Var3;
                        float fG3 = f1Var9.g();
                        f1 f1Var10 = f1Var4;
                        float fG4 = f1Var10.g();
                        f1 f1Var11 = f1Var5;
                        float fG5 = f1Var11.g();
                        f1 f1Var12 = f1Var6;
                        float fG6 = f1Var12.g();
                        g1 g1Var2 = g1Var;
                        int iG = g1Var2.g();
                        a1 a1Var5 = a1Var;
                        boolean zBooleanValue = ((Boolean) a1Var5.getValue()).booleanValue();
                        a1 a1Var6 = a1Var2;
                        boolean zBooleanValue2 = ((Boolean) a1Var6.getValue()).booleanValue();
                        a1 a1Var7 = a1Var3;
                        boolean zBooleanValue3 = ((Boolean) a1Var7.getValue()).booleanValue();
                        a1 a1Var8 = a1Var4;
                        boolean zBooleanValue4 = ((Boolean) a1Var8.getValue()).booleanValue();
                        Object objQ15 = i0Var2.Q();
                        if (objQ15 == obj6) {
                            f10 = fG5;
                            objQ15 = new bb.b(f1Var7, 6);
                            i0Var2.l0(objQ15);
                        } else {
                            f10 = fG5;
                        }
                        ej.c cVar = (ej.c) objQ15;
                        Object objQ16 = i0Var2.Q();
                        if (objQ16 == obj6) {
                            objQ16 = new bb.b(f1Var8, 7);
                            i0Var2.l0(objQ16);
                        }
                        ej.c cVar2 = (ej.c) objQ16;
                        Object objQ17 = i0Var2.Q();
                        if (objQ17 == obj6) {
                            objQ17 = new bb.b(f1Var9, 8);
                            i0Var2.l0(objQ17);
                        }
                        ej.c cVar3 = (ej.c) objQ17;
                        Object objQ18 = i0Var2.Q();
                        if (objQ18 == obj6) {
                            objQ18 = new bb.b(f1Var10, 9);
                            i0Var2.l0(objQ18);
                        }
                        ej.c cVar4 = (ej.c) objQ18;
                        Object objQ19 = i0Var2.Q();
                        if (objQ19 == obj6) {
                            objQ19 = new bb.b(f1Var11, 4);
                            i0Var2.l0(objQ19);
                        }
                        ej.c cVar5 = (ej.c) objQ19;
                        Object objQ20 = i0Var2.Q();
                        if (objQ20 == obj6) {
                            objQ20 = new bb.b(f1Var12, 5);
                            i0Var2.l0(objQ20);
                        }
                        ej.c cVar6 = (ej.c) objQ20;
                        Object objQ21 = i0Var2.Q();
                        if (objQ21 == obj6) {
                            objQ21 = new ab.k(g1Var2, 6);
                            i0Var2.l0(objQ21);
                        }
                        ej.c cVar7 = (ej.c) objQ21;
                        Object objQ22 = i0Var2.Q();
                        if (objQ22 == obj6) {
                            objQ22 = new ab.i(a1Var5, 3);
                            i0Var2.l0(objQ22);
                        }
                        ej.c cVar8 = (ej.c) objQ22;
                        Object objQ23 = i0Var2.Q();
                        if (objQ23 == obj6) {
                            objQ23 = new ab.i(a1Var6, 4);
                            i0Var2.l0(objQ23);
                        }
                        ej.c cVar9 = (ej.c) objQ23;
                        Object objQ24 = i0Var2.Q();
                        if (objQ24 == obj6) {
                            objQ24 = new ab.i(a1Var7, 5);
                            i0Var2.l0(objQ24);
                        }
                        ej.c cVar10 = (ej.c) objQ24;
                        Object objQ25 = i0Var2.Q();
                        if (objQ25 == obj6) {
                            objQ25 = new ab.i(a1Var8, 6);
                            i0Var2.l0(objQ25);
                        }
                        a.a(fG, fG2, fG3, fG4, f10, fG6, iG, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, (ej.c) objQ25, i0Var2, 0);
                        i0Var2.p(true);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 805306416, 509);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b(i10, 2, aVar);
        }
    }

    public static final void c(final String str, final float f10, float f11, float f12, final ej.c cVar, i0 i0Var, final int i10) {
        float f13;
        float f14;
        i0 i0Var2 = i0Var;
        i0Var2.c0(-1762178336);
        int i11 = i10 | (i0Var2.c(f10) ? 32 : 16) | (i0Var2.h(cVar) ? 16384 : 8192);
        if (i0Var2.T(i11 & 1, (i11 & 9363) != 9362)) {
            b0 b0VarA = z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.l lVar = v1.l.f17564b;
            o oVarC = v1.a.c(i0Var2, lVar);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, b0VarA);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            o oVarC2 = t1.c(1.0f, lVar);
            q1 q1VarA = o1.a(b0.j.f1365g, v1.b.C, i0Var2, 6);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC3 = v1.a.c(i0Var2, oVarC2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q1VarA);
            s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            s.M(eVar4, i0Var2, oVarC3);
            r2 r2Var = p8.f2587a;
            v7.a(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((o8) i0Var2.j(r2Var)).f2551k, i0Var, 6, 0, 131070);
            v7.a(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1)), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((o8) i0Var.j(r2Var)).f2552l, i0Var, 0, 0, 131070);
            i0Var2 = i0Var;
            i0Var2.p(true);
            f13 = f11;
            f14 = f12;
            v6.b(f10, cVar, null, false, new kj.d(f13, f14), null, null, i0Var2, ((i11 >> 3) & 14) | ((i11 >> 9) & 112));
            i0Var2.p(true);
        } else {
            f13 = f11;
            f14 = f12;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final float f15 = f13;
            final float f16 = f14;
            t1VarU.f6456d = new ej.e(str, f10, f15, f16, cVar, i10) { // from class: cb.i

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f3176a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f3177b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f3178c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f3179d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ej.c f3180e;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(3463);
                    a.c(this.f3176a, this.f3177b, this.f3178c, this.f3179d, this.f3180e, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void d(String str, boolean z2, ej.c cVar, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(1110242049);
        int i11 = i10 | (i0Var2.g(z2) ? 32 : 16) | (i0Var2.h(cVar) ? 256 : 128);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            o oVarC = t1.c(1.0f, v1.l.f17564b);
            q1 q1VarA = o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(v2.g.f17649f, i0Var2, q1VarA);
            s.M(v2.g.f17648e, i0Var2, n1VarL);
            s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            s.I(v2.g.f17651h, i0Var2);
            s.M(v2.g.f17647d, i0Var2, oVarC2);
            v7.a(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((o8) i0Var2.j(p8.f2587a)).f2551k, i0Var, 6, 0, 131070);
            i0Var2 = i0Var;
            f7.a(z2, cVar, null, false, null, i0Var2, (i11 >> 3) & 126);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new j(str, z2, cVar, i10, 0);
        }
    }
}
