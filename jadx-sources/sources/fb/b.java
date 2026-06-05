package fb;

import ab.u;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.b0;
import b0.g2;
import b0.j;
import b0.r;
import b0.t1;
import b0.w;
import c1.p4;
import e0.t;
import f1.a1;
import f1.f1;
import f1.i0;
import f1.m;
import f1.n1;
import f1.s;
import fj.l;
import p2.k0;
import qj.z;
import t2.q0;
import v.n;
import v1.o;
import v2.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f6660a = new p1.e(new p4(27), false, -1082919362);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f6661b = new p1.e(new p4(28), false, 1685247733);

    public static final void a(h2.b bVar, i0 i0Var, int i10) {
        Object obj;
        f1 f1Var;
        f1 f1Var2;
        f1 f1Var3;
        boolean z2;
        ej.a aVar;
        f1 f1Var4;
        f1 f1Var5;
        f1 f1Var6;
        f1 f1Var7;
        i0 i0Var2 = i0Var;
        l.f(bVar, "wallpaperPainter");
        i0Var2.c0(-1223799564);
        int i11 = i10 | (i0Var2.h(bVar) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = i0Var2.Q();
            Object obj2 = m.f6385a;
            if (objQ == obj2) {
                objQ = s.o(i0Var2);
                i0Var2.l0(objQ);
            }
            Object obj3 = (z) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = new t.c(new b2.b(0L), t.d.f15141o, null, 12);
                i0Var2.l0(objQ2);
            }
            t.c cVar = (t.c) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == obj2) {
                objQ3 = t.d.a(1.0f, 0.01f);
                i0Var2.l0(objQ3);
            }
            t.c cVar2 = (t.c) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == obj2) {
                objQ4 = t.d.a(0.0f, 0.01f);
                i0Var2.l0(objQ4);
            }
            t.c cVar3 = (t.c) objQ4;
            Object objQ5 = i0Var2.Q();
            if (objQ5 == obj2) {
                objQ5 = s.A(Boolean.TRUE);
                i0Var2.l0(objQ5);
            }
            a1 a1Var = (a1) objQ5;
            Object objQ6 = i0Var2.Q();
            if (objQ6 == obj2) {
                objQ6 = y8.f.a(0.5f, i0Var2);
            }
            f1 f1Var8 = (f1) objQ6;
            Object objQ7 = i0Var2.Q();
            if (objQ7 == obj2) {
                objQ7 = y8.f.a(0.0f, i0Var2);
            }
            f1 f1Var9 = (f1) objQ7;
            Object objQ8 = i0Var2.Q();
            if (objQ8 == obj2) {
                objQ8 = y8.f.a(0.2f, i0Var2);
            }
            f1 f1Var10 = (f1) objQ8;
            Object objQ9 = i0Var2.Q();
            if (objQ9 == obj2) {
                objQ9 = y8.f.a(0.2f, i0Var2);
            }
            f1 f1Var11 = (f1) objQ9;
            Object objQ10 = i0Var2.Q();
            if (objQ10 == obj2) {
                objQ10 = y8.f.a(0.0f, i0Var2);
            }
            f1 f1Var12 = (f1) objQ10;
            gi.d dVarD = gi.f.d(null, i0Var2, 0, 3);
            b0.i0 i0Var3 = t1.f1433c;
            q0 q0VarD = r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, i0Var3);
            h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            v1.l lVar = v1.l.f17564b;
            n.b(bVar, null, gi.f.a(lVar, dVarD).c(i0Var3), null, t2.h.f15563a, 0.0f, i0Var, 24632 | (i11 & 14), 104);
            o oVarC2 = b0.d.C(b0.d.x(lVar, 0.0f, 48.0f, 0.0f, 0.0f, 13), b0.d.f1295e);
            Object objQ11 = i0Var.Q();
            if (objQ11 == obj2) {
                objQ11 = new c(f1Var8, 0);
                i0Var.l0(objQ11);
            }
            ej.a aVar3 = (ej.a) objQ11;
            Object objQ12 = i0Var.Q();
            if (objQ12 == obj2) {
                objQ12 = new t(f1Var9, f1Var10, f1Var11, f1Var12, 1);
                i0Var.l0(objQ12);
            }
            ej.c cVar4 = (ej.c) objQ12;
            Object objQ13 = i0Var.Q();
            if (objQ13 == obj2) {
                objQ13 = new fa.a(2);
                i0Var.l0(objQ13);
            }
            ej.a aVar4 = (ej.a) objQ13;
            boolean zH = i0Var.h(cVar) | i0Var.h(cVar2) | i0Var.h(cVar3);
            Object objQ14 = i0Var.Q();
            if (zH || objQ14 == obj2) {
                objQ14 = new d(cVar, cVar2, cVar3, 0);
                i0Var.l0(objQ14);
            }
            o oVarB = fi.c.b(oVarC2, dVarD, aVar3, cVar4, aVar4, null, null, (ej.c) objQ14, null, null, 4016);
            boolean zH2 = i0Var.h(cVar) | i0Var.h(cVar2) | i0Var.h(cVar3) | i0Var.h(obj3);
            Object objQ15 = i0Var.Q();
            if (zH2 || objQ15 == obj2) {
                obj = obj3;
                f1Var = f1Var9;
                f1Var2 = f1Var10;
                f1Var3 = f1Var11;
                Object uVar = new u(cVar, cVar2, cVar3, obj, 1);
                i0Var.l0(uVar);
                objQ15 = uVar;
            } else {
                obj = obj3;
                f1Var = f1Var9;
                f1Var2 = f1Var10;
                f1Var3 = f1Var11;
            }
            o oVarK = t1.k(256.0f, k0.a(oVarB, obj, (PointerInputEventHandler) objQ15));
            v1.g gVar = v1.b.f17548b;
            w wVar = w.f1450a;
            r.a(wVar.b(oVarK, gVar), i0Var, 0);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                i0Var.b0(1456920833);
                gi.d dVarD2 = gi.f.d(null, i0Var, 0, 3);
                o oVarC3 = b0.d.C(b0.d.x(b0.d.t(16.0f, lVar), 0.0f, 0.0f, 0.0f, 72.0f, 7), b0.d.f1297g);
                Object objQ16 = i0Var.Q();
                if (objQ16 == obj2) {
                    objQ16 = new fa.a(3);
                    i0Var.l0(objQ16);
                }
                ej.a aVar5 = (ej.a) objQ16;
                Object objQ17 = i0Var.Q();
                if (objQ17 == obj2) {
                    objQ17 = new z9.a(1);
                    i0Var.l0(objQ17);
                }
                ej.c cVar5 = (ej.c) objQ17;
                Object objQ18 = i0Var.Q();
                if (objQ18 == obj2) {
                    objQ18 = new fa.a(4);
                    i0Var.l0(objQ18);
                }
                ej.a aVar6 = (ej.a) objQ18;
                Object objQ19 = i0Var.Q();
                if (objQ19 == obj2) {
                    objQ19 = new e(0);
                    i0Var.l0(objQ19);
                }
                o oVarB2 = wVar.b(t1.c(1.0f, b0.d.t(24.0f, fi.c.b(oVarC3, dVarD, aVar5, cVar5, aVar6, null, null, null, dVarD2, (ej.c) objQ19, 2928))), v1.b.A);
                b0 b0VarA = b0.z.a(j.g(16.0f), v1.b.F, i0Var, 54);
                int iHashCode2 = Long.hashCode(i0Var.T);
                n1 n1VarL2 = i0Var.l();
                o oVarC4 = v1.a.c(i0Var, oVarB2);
                i0Var.e0();
                if (i0Var.S) {
                    aVar = aVar2;
                    i0Var.k(aVar);
                } else {
                    aVar = aVar2;
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA);
                s.M(eVar2, i0Var, n1VarL2);
                gk.b.t(iHashCode2, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC4);
                b0.h hVarG = j.g(8.0f);
                v1.e eVar5 = v1.b.E;
                b0 b0VarA2 = b0.z.a(hVarG, eVar5, i0Var, 6);
                f1 f1Var13 = f1Var;
                int iHashCode3 = Long.hashCode(i0Var.T);
                n1 n1VarL3 = i0Var.l();
                o oVarC5 = v1.a.c(i0Var, lVar);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA2);
                s.M(eVar2, i0Var, n1VarL3);
                gk.b.t(iHashCode3, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC5);
                ej.a aVar7 = aVar;
                k0.s.b("Corner radius", null, null, 0, false, 0, 0, i0Var, 6, 1022);
                Object objQ20 = i0Var.Q();
                if (objQ20 == obj2) {
                    objQ20 = new c(f1Var8, 1);
                    i0Var.l0(objQ20);
                }
                ej.a aVar8 = (ej.a) objQ20;
                Object objQ21 = i0Var.Q();
                if (objQ21 == obj2) {
                    objQ21 = new bb.b(f1Var8, 10);
                    i0Var.l0(objQ21);
                }
                f1 f1Var14 = f1Var2;
                f1 f1Var15 = f1Var3;
                mk.b.b(aVar8, (ej.c) objQ21, new kj.d(0.0f, 1.0f), 0.001f, dVarD2, null, null, null, i0Var, 3126, 224);
                i0Var.p(true);
                b0 b0VarA3 = b0.z.a(j.g(8.0f), eVar5, i0Var, 6);
                int iHashCode4 = Long.hashCode(i0Var.T);
                n1 n1VarL4 = i0Var.l();
                o oVarC6 = v1.a.c(i0Var, lVar);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar7);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA3);
                s.M(eVar2, i0Var, n1VarL4);
                gk.b.t(iHashCode4, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC6);
                k0.s.b("Blur radius", null, null, 0, false, 0, 0, i0Var, 6, 1022);
                Object objQ22 = i0Var.Q();
                if (objQ22 == obj2) {
                    f1Var4 = f1Var13;
                    objQ22 = new c(f1Var4, 2);
                    i0Var.l0(objQ22);
                } else {
                    f1Var4 = f1Var13;
                }
                ej.a aVar9 = (ej.a) objQ22;
                Object objQ23 = i0Var.Q();
                if (objQ23 == obj2) {
                    objQ23 = new bb.b(f1Var4, 11);
                    i0Var.l0(objQ23);
                }
                mk.b.b(aVar9, (ej.c) objQ23, new kj.d(0.0f, 32.0f), 0.01f, dVarD2, null, null, null, i0Var, 3126, 224);
                i0Var.p(true);
                b0 b0VarA4 = b0.z.a(j.g(8.0f), eVar5, i0Var, 6);
                int iHashCode5 = Long.hashCode(i0Var.T);
                n1 n1VarL5 = i0Var.l();
                o oVarC7 = v1.a.c(i0Var, lVar);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar7);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA4);
                s.M(eVar2, i0Var, n1VarL5);
                gk.b.t(iHashCode5, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC7);
                k0.s.b("Refraction height", null, null, 0, false, 0, 0, i0Var, 6, 1022);
                Object objQ24 = i0Var.Q();
                if (objQ24 == obj2) {
                    f1Var5 = f1Var14;
                    objQ24 = new c(f1Var5, 3);
                    i0Var.l0(objQ24);
                } else {
                    f1Var5 = f1Var14;
                }
                ej.a aVar10 = (ej.a) objQ24;
                Object objQ25 = i0Var.Q();
                if (objQ25 == obj2) {
                    objQ25 = new bb.b(f1Var5, 12);
                    i0Var.l0(objQ25);
                }
                mk.b.b(aVar10, (ej.c) objQ25, new kj.d(0.0f, 1.0f), 0.001f, dVarD2, null, null, null, i0Var, 3126, 224);
                i0Var.p(true);
                b0 b0VarA5 = b0.z.a(j.g(8.0f), eVar5, i0Var, 6);
                int iHashCode6 = Long.hashCode(i0Var.T);
                n1 n1VarL6 = i0Var.l();
                o oVarC8 = v1.a.c(i0Var, lVar);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar7);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA5);
                s.M(eVar2, i0Var, n1VarL6);
                gk.b.t(iHashCode6, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC8);
                k0.s.b("Refraction amount", null, null, 0, false, 0, 0, i0Var, 6, 1022);
                Object objQ26 = i0Var.Q();
                if (objQ26 == obj2) {
                    f1Var6 = f1Var15;
                    objQ26 = new c(f1Var6, 4);
                    i0Var.l0(objQ26);
                } else {
                    f1Var6 = f1Var15;
                }
                ej.a aVar11 = (ej.a) objQ26;
                Object objQ27 = i0Var.Q();
                if (objQ27 == obj2) {
                    objQ27 = new bb.b(f1Var6, 13);
                    i0Var.l0(objQ27);
                }
                mk.b.b(aVar11, (ej.c) objQ27, new kj.d(0.0f, 1.0f), 0.001f, dVarD2, null, null, null, i0Var, 3126, 224);
                i0Var.p(true);
                b0 b0VarA6 = b0.z.a(j.g(8.0f), eVar5, i0Var, 6);
                int iHashCode7 = Long.hashCode(i0Var.T);
                n1 n1VarL7 = i0Var.l();
                o oVarC9 = v1.a.c(i0Var, lVar);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar7);
                } else {
                    i0Var.o0();
                }
                s.M(eVar, i0Var, b0VarA6);
                s.M(eVar2, i0Var, n1VarL7);
                gk.b.t(iHashCode7, i0Var, eVar3, i0Var, dVar);
                s.M(eVar4, i0Var, oVarC9);
                k0.s.b("Chromatic aberration", null, null, 0, false, 0, 0, i0Var, 6, 1022);
                Object objQ28 = i0Var.Q();
                if (objQ28 == obj2) {
                    f1Var7 = f1Var12;
                    objQ28 = new c(f1Var7, 5);
                    i0Var.l0(objQ28);
                } else {
                    f1Var7 = f1Var12;
                }
                ej.a aVar12 = (ej.a) objQ28;
                Object objQ29 = i0Var.Q();
                if (objQ29 == obj2) {
                    objQ29 = new bb.b(f1Var7, 14);
                    i0Var.l0(objQ29);
                }
                mk.b.b(aVar12, (ej.c) objQ29, new kj.d(0.0f, 1.0f), 0.001f, dVarD2, null, null, null, i0Var, 3126, 224);
                i0Var2 = i0Var;
                z2 = true;
                i0Var2.p(true);
                i0Var2.p(true);
                i0Var2.p(false);
            } else {
                i0Var2 = i0Var;
                z2 = true;
                i0Var2.b0(1460248776);
                i0Var2.p(false);
            }
            i0Var2.p(z2);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 10, bVar);
        }
    }
}
