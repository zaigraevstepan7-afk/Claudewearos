package y8;

import ab.a0;
import b0.b0;
import b0.c0;
import b0.f2;
import b0.j;
import b0.o1;
import b0.q1;
import b0.r;
import b0.t1;
import b0.y0;
import b0.z;
import c1.a2;
import c1.v7;
import c2.e0;
import c2.v0;
import c2.w;
import com.anonlab.voidlauncher.R;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.q2;
import f1.s;
import fj.l;
import g3.n0;
import java.util.List;
import java.util.WeakHashMap;
import k3.m;
import r3.k;
import t.m1;
import t.y;
import t2.q0;
import u1.p;
import u6.v;
import v.n;
import v1.o;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f20236a = new p1.e(new ua.a(9), false, -402126371);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f20237b = new p1.e(new ua.a(10), false, -852768364);

    public static final void a(float f10, ej.a aVar, i0 i0Var, int i10) {
        int i11;
        i0 i0Var2 = i0Var;
        l.f(aVar, "onContinue");
        i0Var2.c0(1758101093);
        if ((i10 & 6) == 0) {
            i11 = i10 | (i0Var2.c(f10) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var2.h(aVar) ? 32 : 16;
        }
        if (i0Var2.T(i11 & 1, (i11 & 19) != 18)) {
            WeakHashMap weakHashMap = f2.f1311w;
            b0.a aVar2 = b0.c.e(i0Var2).f1316e;
            s3.c cVar = (s3.c) i0Var2.j(f1.f18262h);
            o oVarV = b0.d.v(z1.h.a(f10, t1.f1433c), 20, 0.0f, 2);
            v1.e eVar = v1.b.F;
            b0.e eVar2 = j.f1361c;
            b0 b0VarA = z.a(eVar2, eVar, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar3 = v2.g.f17649f;
            s.M(eVar3, i0Var2, b0VarA);
            v2.e eVar4 = v2.g.f17648e;
            s.M(eVar4, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar5 = v2.g.f17650g;
            s.M(eVar5, i0Var2, numValueOf);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar6 = v2.g.f17647d;
            s.M(eVar6, i0Var2, oVarC);
            b0.d.e(i0Var2, c0.b());
            v1.l lVar = v1.l.f17564b;
            o oVarP = t1.p(lVar, Float.NaN, 420);
            b0 b0VarA2 = z.a(eVar2, eVar, i0Var2, 48);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarP);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar3, i0Var2, b0VarA2);
            s.M(eVar4, i0Var2, n1VarL2);
            s.M(eVar5, i0Var2, Integer.valueOf(iHashCode2));
            s.I(dVar, i0Var2);
            s.M(eVar6, i0Var2, oVarC2);
            long jX = hj.a.x(32);
            k3.s sVar = k3.s.A;
            m mVar = ha.e.f7769a;
            v7.a("Setup is not ready yet", null, e0.d(4279900698L), jX, sVar, mVar, 0L, new k(3), hj.a.x(38), 0, false, 0, 0, null, i0Var, 1597830, 48, 258858);
            b0.d.e(i0Var, t1.e(14, lVar));
            v7.a("Sorry, the project has not reached the point where we can continue the setup yet. It will return in the full release. Until then, enjoy the app.", null, e0.d(4284441448L), hj.a.x(16), k3.s.f9399f, mVar, 0L, new k(3), hj.a.x(23), 0, false, 0, 0, null, i0Var, 1597830, 48, 258858);
            i0Var.p(true);
            b0.d.e(i0Var, c0.b());
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            q2 q2VarB = t.e.b(((Boolean) p.e(kVar, i0Var, 6).getValue()).booleanValue() ? 0.96f : 1.0f, t.d.t(200, 0, y.f15326a, 2), "hoverScale", null, i0Var, 3072, 20);
            o oVarC3 = t1.c(1.0f, lVar);
            float fH0 = cVar.h0(aVar2.b(cVar));
            float f11 = 16;
            o oVarE = t1.e(56, b0.d.x(oVarC3, 0.0f, 0.0f, 0.0f, fH0 + f11, 7));
            float fFloatValue = ((Number) q2VarB.getValue()).floatValue();
            o oVarK = n.k(n.f(f.c(f11, z1.h.i(oVarE, fFloatValue, fFloatValue)), e0.d(4278221567L), e0.f2986b), kVar, null, false, null, aVar, 28);
            q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode3 = Long.hashCode(i0Var.T);
            n1 n1VarL3 = i0Var.l();
            o oVarC4 = v1.a.c(i0Var, oVarK);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            s.M(eVar3, i0Var, q0VarD);
            s.M(eVar4, i0Var, n1VarL3);
            s.M(eVar5, i0Var, Integer.valueOf(iHashCode3));
            s.I(dVar, i0Var);
            s.M(eVar6, i0Var, oVarC4);
            v7.a("Open Launcher", null, w.f3054d, hj.a.x(17), sVar, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 261930);
            i0Var2 = i0Var;
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new mb.m(f10, i10, aVar);
        }
    }

    public static final void b(final String str, final String str2, final String str3, final float f10, i0 i0Var, final int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(-1996604600);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.f(str2) ? 32 : 16) | (i0Var2.f(str3) ? 256 : 128) | (i0Var2.c(f10) ? 2048 : 1024);
        if (i0Var2.T(i11 & 1, (i11 & 1171) != 1170)) {
            v1.l lVar = v1.l.f17564b;
            float f11 = 16;
            o oVarC = f.c(f11, z1.h.a(f10, t1.c(1.0f, lVar)));
            long j = w.f3054d;
            c2.q0 q0Var = e0.f2986b;
            o oVarT = b0.d.t(f11, n.f(oVarC, j, q0Var));
            q1 q1VarA = o1.a(j.f1359a, v1.b.D, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarT);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, q1VarA);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.M(eVar3, i0Var2, numValueOf);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC2);
            o oVarF = n.f(z1.h.c(t1.k(40, lVar), j0.e.f8605a), e0.d(4278221567L), q0Var);
            q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC3 = v1.a.c(i0Var2, oVarF);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q0VarD);
            s.M(eVar2, i0Var2, n1VarL2);
            s.M(eVar3, i0Var2, Integer.valueOf(iHashCode2));
            s.I(dVar, i0Var2);
            s.M(eVar4, i0Var2, oVarC3);
            long jX = hj.a.x(20);
            k3.s sVar = k3.s.A;
            m mVar = ha.e.f7769a;
            v7.a(str, null, j, jX, sVar, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, (i11 & 14) | 1597824, 0, 261930);
            i0Var2.p(true);
            b0.d.e(i0Var2, t1.o(f11, lVar));
            b0 b0VarA = z.a(j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            o oVarC4 = v1.a.c(i0Var2, lVar);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, b0VarA);
            s.M(eVar2, i0Var2, n1VarL3);
            s.M(eVar3, i0Var2, Integer.valueOf(iHashCode3));
            s.I(dVar, i0Var2);
            s.M(eVar4, i0Var2, oVarC4);
            v7.a(str2, null, e0.d(4278190080L), hj.a.x(17), sVar, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, ((i11 >> 3) & 14) | 1597824, 0, 261930);
            i0Var2 = i0Var2;
            b0.d.e(i0Var2, t1.e(2, lVar));
            v7.a(str3, null, e0.d(4287532691L), hj.a.x(13), k3.s.f9399f, mVar, 0L, null, hj.a.x(16), 0, false, 0, 0, null, i0Var2, ((i11 >> 6) & 14) | 1597824, 48, 259882);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(str, str2, str3, f10, i10) { // from class: y8.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f20240a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f20241b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f20242c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f20243d;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(1);
                    a.b(this.f20240a, this.f20241b, this.f20242c, this.f20243d, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(ej.a aVar, i0 i0Var, int i10) {
        f1.f1 f1Var;
        f1.f1 f1Var2;
        f1.f1 f1Var3;
        f1.f1 f1Var4;
        f1.f1 f1Var5;
        f1.f1 f1Var6;
        f1.f1 f1Var7;
        f1.f1 f1Var8;
        i0 i0Var2 = i0Var;
        l.f(aVar, "onContinue");
        i0Var2.c0(-446681783);
        int i11 = i10 | (i0Var2.h(aVar) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = s.A(0);
                i0Var2.l0(objQ);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = s.A(Boolean.TRUE);
                i0Var2.l0(objQ2);
            }
            a1 a1Var2 = (a1) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == fVar) {
                objQ3 = s.A(Boolean.FALSE);
                i0Var2.l0(objQ3);
            }
            a1 a1Var3 = (a1) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == fVar) {
                objQ4 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var9 = (f1.f1) objQ4;
            Object objQ5 = i0Var2.Q();
            if (objQ5 == fVar) {
                objQ5 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var10 = (f1.f1) objQ5;
            Object objQ6 = i0Var2.Q();
            if (objQ6 == fVar) {
                objQ6 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var11 = (f1.f1) objQ6;
            Object objQ7 = i0Var2.Q();
            if (objQ7 == fVar) {
                objQ7 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var12 = (f1.f1) objQ7;
            Object objQ8 = i0Var2.Q();
            if (objQ8 == fVar) {
                objQ8 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var13 = (f1.f1) objQ8;
            Object objQ9 = i0Var2.Q();
            if (objQ9 == fVar) {
                objQ9 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var14 = (f1.f1) objQ9;
            Object objQ10 = i0Var2.Q();
            if (objQ10 == fVar) {
                objQ10 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var15 = (f1.f1) objQ10;
            Object objQ11 = i0Var2.Q();
            if (objQ11 == fVar) {
                objQ11 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var16 = (f1.f1) objQ11;
            Object objQ12 = i0Var2.Q();
            if (objQ12 == fVar) {
                objQ12 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var17 = (f1.f1) objQ12;
            Object objQ13 = i0Var2.Q();
            if (objQ13 == fVar) {
                objQ13 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var18 = (f1.f1) objQ13;
            Object objQ14 = i0Var2.Q();
            if (objQ14 == fVar) {
                objQ14 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var19 = (f1.f1) objQ14;
            Object objQ15 = i0Var2.Q();
            if (objQ15 == fVar) {
                objQ15 = f.a(0.0f, i0Var2);
            }
            f1.f1 f1Var20 = (f1.f1) objQ15;
            Object objQ16 = i0Var2.Q();
            if (objQ16 == fVar) {
                objQ16 = new b6.c(f1Var9, f1Var10, f1Var11, f1Var12, f1Var13, null, 18);
                f1Var = f1Var9;
                f1Var2 = f1Var13;
                i0Var2.l0(objQ16);
            } else {
                f1Var = f1Var9;
                f1Var2 = f1Var13;
            }
            s.f((ej.e) objQ16, i0Var2, pi.o.f13011a);
            Boolean bool = (Boolean) a1Var3.getValue();
            bool.booleanValue();
            Object objQ17 = i0Var2.Q();
            if (objQ17 == fVar) {
                f1Var8 = f1Var20;
                f1Var3 = f1Var15;
                f1Var4 = f1Var16;
                f1Var5 = f1Var17;
                f1Var6 = f1Var18;
                f1Var7 = f1Var19;
                g gVar = new g(a1Var3, a1Var, f1Var10, f1Var11, f1Var12, f1Var14, a1Var2, f1Var3, f1Var4, f1Var5, f1Var6, f1Var7, f1Var8, null);
                i0Var2.l0(gVar);
                objQ17 = gVar;
            } else {
                f1Var3 = f1Var15;
                f1Var4 = f1Var16;
                f1Var5 = f1Var17;
                f1Var6 = f1Var18;
                f1Var7 = f1Var19;
                f1Var8 = f1Var20;
            }
            s.f((ej.e) objQ17, i0Var2, bool);
            float fG = f1Var.g();
            t.s sVar = y.f15326a;
            q2 q2VarB = t.e.b(fG, t.d.t(600, 0, sVar, 2), "backgroundAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB2 = t.e.b(f1Var14.g(), t.d.t(600, 0, sVar, 2), "gradientProgress", null, i0Var, 3072, 20);
            i0Var2 = i0Var;
            q2 q2VarB3 = t.e.b(f1Var10.g(), t.d.t(500, 0, sVar, 2), "titleAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB4 = t.e.b(f1Var11.g(), t.d.t(500, 0, sVar, 2), "subtitleAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB5 = t.e.b(f1Var12.g(), t.d.t(500, 0, sVar, 2), "buttonAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB6 = t.e.b(f1Var2.g(), t.d.s(0.5f, 200.0f, null, 4), "buttonScale", null, i0Var2, 3120, 20);
            q2 q2VarB7 = t.e.b(f1Var3.g(), t.d.t(600, 0, sVar, 2), "setupTitleAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB8 = t.e.b(f1Var4.g(), t.d.t(500, 0, sVar, 2), "card1Alpha", null, i0Var2, 3072, 20);
            q2 q2VarB9 = t.e.b(f1Var5.g(), t.d.t(500, 0, sVar, 2), "card2Alpha", null, i0Var2, 3072, 20);
            q2 q2VarB10 = t.e.b(f1Var6.g(), t.d.t(500, 0, sVar, 2), "card3Alpha", null, i0Var2, 3072, 20);
            q2 q2VarB11 = t.e.b(f1Var7.g(), t.d.t(500, 0, sVar, 2), "continueButtonAlpha", null, i0Var2, 3072, 20);
            q2 q2VarB12 = t.e.b(f1Var8.g(), t.d.t(500, 0, sVar, 2), "dockCustomizationAlpha", null, i0Var2, 3072, 20);
            o oVarE = n.e(t1.f1433c, y9.a.l(qi.k.c0(new w[]{new w(w.c(e0.e(f(((Number) q2VarB2.getValue()).floatValue(), 254, 242), f(((Number) q2VarB2.getValue()).floatValue(), 232, 242), f(((Number) q2VarB2.getValue()).floatValue(), 233, 247)), ((Number) q2VarB.getValue()).floatValue())), new w(w.c(e0.e(f(((Number) q2VarB2.getValue()).floatValue(), 232, 242), f(((Number) q2VarB2.getValue()).floatValue(), 199, 242), f(((Number) q2VarB2.getValue()).floatValue(), 222, 247)), ((Number) q2VarB.getValue()).floatValue())), new w(w.c(e0.e(f(((Number) q2VarB2.getValue()).floatValue(), 162, 242), f(((Number) q2VarB2.getValue()).floatValue(), 172, 242), f(((Number) q2VarB2.getValue()).floatValue(), 252, 247)), ((Number) q2VarB.getValue()).floatValue()))}), 0.0f, 14));
            q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, oVarE);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            s.M(v2.g.f17649f, i0Var2, q0VarD);
            s.M(v2.g.f17648e, i0Var2, n1VarL);
            s.M(v2.g.f17650g, i0Var2, Integer.valueOf(iHashCode));
            s.I(v2.g.f17651h, i0Var2);
            s.M(v2.g.f17647d, i0Var2, oVarC);
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                i0Var2.b0(-766268037);
                float fFloatValue = ((Number) q2VarB3.getValue()).floatValue();
                float fFloatValue2 = ((Number) q2VarB4.getValue()).floatValue();
                float fFloatValue3 = ((Number) q2VarB5.getValue()).floatValue();
                float fFloatValue4 = ((Number) q2VarB6.getValue()).floatValue();
                Object objQ18 = i0Var2.Q();
                if (objQ18 == fVar) {
                    objQ18 = new r0.d(a1Var3, 26);
                    i0Var2.l0(objQ18);
                }
                e(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, (ej.a) objQ18, i0Var2, 24576);
                i0Var2 = i0Var2;
                i0Var2.p(false);
            } else if (((Number) a1Var.getValue()).intValue() == 1) {
                i0Var2.b0(-765891914);
                float fFloatValue5 = ((Number) q2VarB7.getValue()).floatValue();
                float fFloatValue6 = ((Number) q2VarB8.getValue()).floatValue();
                float fFloatValue7 = ((Number) q2VarB9.getValue()).floatValue();
                float fFloatValue8 = ((Number) q2VarB10.getValue()).floatValue();
                float fFloatValue9 = ((Number) q2VarB11.getValue()).floatValue();
                Object objQ19 = i0Var2.Q();
                if (objQ19 == fVar) {
                    objQ19 = new r0.d(a1Var3, 27);
                    i0Var2.l0(objQ19);
                }
                d(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, fFloatValue9, (ej.a) objQ19, i0Var2, 196608);
                i0Var2 = i0Var2;
                i0Var2.p(false);
            } else if (((Number) a1Var.getValue()).intValue() == 2) {
                i0Var2.b0(-765456736);
                a(((Number) q2VarB12.getValue()).floatValue(), aVar, i0Var2, (i11 << 3) & 112);
                i0Var2.p(false);
            } else {
                i0Var2.b0(-765274797);
                i0Var2.p(false);
            }
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new cb.b(i10, 7, aVar);
        }
    }

    public static final void d(final float f10, final float f11, final float f12, final float f13, float f14, final ej.a aVar, i0 i0Var, final int i10) {
        float f15;
        i0 i0Var2 = i0Var;
        l.f(aVar, "onContinue");
        i0Var2.c0(63052927);
        int i11 = i10 | (i0Var2.c(f10) ? 4 : 2) | (i0Var2.c(f11) ? 32 : 16) | (i0Var2.c(f12) ? 256 : 128) | (i0Var2.c(f13) ? 2048 : 1024) | (i0Var2.c(f14) ? 16384 : 8192);
        if (i0Var2.T(i11 & 1, (74899 & i11) != 74898)) {
            List listC0 = qi.k.c0(new h[]{new h("1", "Dock Customization", "Make it yours. \u1f3a8", f11), new h("2", "Graphics Mode", "Smooth feeling or battery saver? \u26a1", f12), new h("3", "Ready to Launch", "Then enjoy it! \u1f976", f13)});
            WeakHashMap weakHashMap = f2.f1311w;
            b0.a aVar2 = b0.c.e(i0Var2).f1316e;
            s3.c cVar = (s3.c) i0Var2.j(f1.f18262h);
            b0.i0 i0Var3 = t1.f1433c;
            b0 b0VarA = z.a(j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, i0Var3);
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
            s.M(eVar3, i0Var2, numValueOf);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            long jX = hj.a.x(32);
            k3.s sVar = k3.s.A;
            m mVar = ha.e.f7769a;
            long jD = e0.d(4279900698L);
            long jX2 = hj.a.x(38);
            v1.l lVar = v1.l.f17564b;
            float f16 = 16;
            v7.a("Let's setup some\nthings first, like:", b0.d.w(z1.h.a(f10, lVar), f16, 60, f16, 0), jD, jX, sVar, mVar, 0L, null, jX2, 0, false, 0, 0, null, i0Var, 1597830, 48, 259880);
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            v.f(new y0(1.0f, true), null, p1.j.d(-143172087, new a0(listC0, 11), i0Var), i0Var, 384, 2);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            q2 q2VarB = t.e.b(((Boolean) p.e(kVar, i0Var, 6).getValue()).booleanValue() ? 0.96f : 1.0f, t.d.t(200, 0, y.f15326a, 2), "hoverScale", null, i0Var, 3072, 20);
            o oVarE = t1.e(56, b0.d.w(t1.c(1.0f, lVar), f16, 32, f16, cVar.h0(aVar2.b(cVar)) + f16));
            float fFloatValue = ((Number) q2VarB.getValue()).floatValue();
            o oVarI = z1.h.i(oVarE, fFloatValue, fFloatValue);
            f15 = f14;
            o oVarK = n.k(n.f(f.c(f16, z1.h.a(f15, oVarI)), e0.d(4278221567L), e0.f2986b), kVar, null, false, null, aVar, 28);
            q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var.T);
            n1 n1VarL2 = i0Var.l();
            o oVarC2 = v1.a.c(i0Var, oVarK);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            s.M(eVar, i0Var, q0VarD);
            s.M(eVar2, i0Var, n1VarL2);
            s.M(eVar3, i0Var, Integer.valueOf(iHashCode2));
            s.I(dVar, i0Var);
            s.M(eVar4, i0Var, oVarC2);
            v7.a("Alright", null, w.f3054d, hj.a.x(17), sVar, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 261930);
            i0Var2 = i0Var;
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            f15 = f14;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final float f17 = f15;
            t1VarU.f6456d = new ej.e(f10, f11, f12, f13, f17, aVar, i10) { // from class: y8.d

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f20244a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f20245b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f20246c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f20247d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f20248e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ej.a f20249f;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(196609);
                    a.d(this.f20244a, this.f20245b, this.f20246c, this.f20247d, this.f20248e, this.f20249f, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(final float f10, final float f11, final float f12, final float f13, final ej.a aVar, i0 i0Var, final int i10) {
        i0 i0Var2 = i0Var;
        l.f(aVar, "onContinue");
        i0Var2.c0(-719962861);
        int i11 = i10 | (i0Var2.c(f10) ? 4 : 2) | (i0Var2.c(f11) ? 32 : 16) | (i0Var2.c(f12) ? 256 : 128) | (i0Var2.c(f13) ? 2048 : 1024);
        if (i0Var2.T(i11 & 1, (i11 & 9363) != 9362)) {
            v1.l lVar = v1.l.f17564b;
            o oVarV = b0.d.v(t1.c(1.0f, t1.p(lVar, Float.NaN, 400)), 48, 0.0f, 2);
            v1.g gVar = v1.b.f17551e;
            q0 q0VarD = r.d(gVar, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.M(eVar3, i0Var2, numValueOf);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            b0 b0VarA = z.a(j.g(8), v1.b.F, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, lVar);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, b0VarA);
            s.M(eVar2, i0Var2, n1VarL2);
            s.M(eVar3, i0Var2, Integer.valueOf(iHashCode2));
            s.I(dVar, i0Var2);
            s.M(eVar4, i0Var2, oVarC2);
            long jX = hj.a.x(48);
            k3.s sVar = k3.s.f9399f;
            m mVar = ha.e.f7769a;
            long jD = e0.d(4279900698L);
            long j = w.f3054d;
            v7.a("VoidLauncher", z1.h.a(f10, lVar), jD, jX, sVar, mVar, 0L, null, 0L, 0, false, 1, 0, new n0(0L, 0L, null, null, null, 0L, new v0(j, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(17.0f) & 4294967295L), 38.0f), 0, 0L, null, 16769023), i0Var2, 1597830, 12607488, 114472);
            v7.a("Minimal. Fast. Yours.", z1.h.a(f11, lVar), e0.d(4284900966L), hj.a.x(16), sVar, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 261928);
            b0.d.e(i0Var, t1.e(56, lVar));
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            q2 q2VarB = t.e.b(((Boolean) p.e(kVar, i0Var, 6).getValue()).booleanValue() ? 0.92f : 1.0f, t.d.t(300, 0, y.f15326a, 2), "hoverScale", null, i0Var, 3072, 20);
            o oVarK = t1.k(64, lVar);
            float fFloatValue = ((Number) q2VarB.getValue()).floatValue() * f13;
            o oVarK2 = n.k(n.f(z1.h.a(f12, z1.h.i(oVarK, fFloatValue, fFloatValue)), e0.d(4283417591L), j0.e.f8605a), kVar, null, false, null, aVar, 28);
            q0 q0VarD2 = r.d(gVar, false);
            int iHashCode3 = Long.hashCode(i0Var.T);
            n1 n1VarL3 = i0Var.l();
            o oVarC3 = v1.a.c(i0Var, oVarK2);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            s.M(eVar, i0Var, q0VarD2);
            s.M(eVar2, i0Var, n1VarL3);
            s.M(eVar3, i0Var, Integer.valueOf(iHashCode3));
            s.I(dVar, i0Var);
            s.M(eVar4, i0Var, oVarC3);
            a2.a(yd.f.V(R.drawable.ic_arrow_forward, i0Var), "Continue", t1.k(32, lVar), j, i0Var, 3512);
            i0Var2 = i0Var;
            i0Var2.p(true);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(f10, f11, f12, f13, aVar, i10) { // from class: y8.e

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f20250a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f20251b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f20252c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f20253d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ej.a f20254e;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(24577);
                    a.e(this.f20250a, this.f20251b, this.f20252c, this.f20253d, this.f20254e, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final int f(float f10, int i10, int i11) {
        return (int) (((i11 - i10) * f10) + i10);
    }
}
