package mb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.b0;
import b0.o1;
import b0.q1;
import b0.r1;
import b0.t1;
import b0.y0;
import b0.z;
import c1.a2;
import c1.b8;
import c1.d3;
import c1.e3;
import c1.k0;
import c1.r3;
import c1.v7;
import c1.z4;
import c2.e0;
import c2.w;
import c2.z0;
import f1.a1;
import f1.f1;
import f1.g1;
import f1.i0;
import f1.n1;
import f1.q2;
import g0.l0;
import i2.h0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lb.e2;
import lb.u3;
import t.m1;
import t.y;
import t2.q0;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f11434a = new p1.e(new d1.a(18), false, -2144688948);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f11435b = new p1.e(new d1.a(19), false, 1364280458);

    /* renamed from: c, reason: collision with root package name */
    public static final p1.e f11436c = new p1.e(new lb.d(12), false, 592762725);

    /* renamed from: d, reason: collision with root package name */
    public static final p1.e f11437d = new p1.e(new lb.d(13), false, 199763780);

    public static final void a(v1.o oVar, ej.a aVar, i0 i0Var, int i10) {
        i0Var.c0(-1758361692);
        int i11 = (i0Var.f(oVar) ? 4 : 2) | i10 | (i0Var.h(aVar) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            v1.o oVarL = v.n.l(v.n.f(z1.h.c(t1.k(58, oVar), j0.e.f8605a), e0.d(2150305037L), e0.f2986b), false, null, aVar, 15);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarL);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            i2.f fVarB = u1.p.f16584a;
            if (fVarB == null) {
                i2.e eVar = new i2.e("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = h0.f8270a;
                z0 z0Var = new z0(w.f3052b);
                d8.e eVar2 = new d8.e(9);
                ArrayList arrayList = (ArrayList) eVar2.f5001a;
                eVar2.x(16.0f, 9.0f);
                eVar2.H(10.0f);
                eVar2.t(8.0f);
                eVar2.G(9.0f);
                eVar2.u(8.0f);
                arrayList.add(new i2.v(-1.5f, -6.0f));
                eVar2.u(-5.0f);
                eVar2.w(-1.0f, 1.0f);
                eVar2.t(5.0f);
                eVar2.H(2.0f);
                eVar2.u(14.0f);
                eVar2.G(4.0f);
                eVar2.u(-3.5f);
                eVar2.w(-1.0f, -1.0f);
                eVar2.k();
                eVar2.x(18.0f, 7.0f);
                eVar2.t(6.0f);
                eVar2.H(12.0f);
                eVar2.o(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVar2.u(8.0f);
                eVar2.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                eVar2.G(7.0f);
                eVar2.k();
                i2.e.a(eVar, arrayList, z0Var);
                fVarB = eVar.b();
                u1.p.f16584a = fVarB;
            }
            a2.b(fVarB, "Delete wallpaper", t1.k(27, v1.l.f17564b), e0.d(4294919482L), i0Var, 3504, 0);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(oVar, i10, 15, aVar);
        }
    }

    public static final void b(int i10, i0 i0Var) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(674100430);
        if (i0Var2.T(i10 & 1, i10 != 0)) {
            b0.i0 i0Var3 = t1.f1433c;
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, i0Var3);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            v7.a("No wallpapers found", null, e0.d(4286021001L), hj.a.x(16), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.d(i10, 14);
        }
    }

    public static final void c(boolean z2, mi.p pVar, ej.a aVar, ej.a aVar2, v1.o oVar, i0 i0Var, int i10) {
        ej.a aVar3;
        i0 i0Var2 = i0Var;
        i0Var2.c0(-465737035);
        int i11 = i10 | (i0Var2.g(z2) ? 4 : 2) | (i0Var2.h(aVar) ? 256 : 128) | (i0Var2.h(aVar2) ? 2048 : 1024) | (i0Var2.f(oVar) ? 16384 : 8192);
        if (i0Var2.T(i11 & 1, (i11 & 9347) != 9346)) {
            v1.o oVarV = b0.d.v(t1.c(1.0f, oVar), 24, 0.0f, 2);
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.g gVar = v1.b.f17551e;
            b0.w wVar = b0.w.f1450a;
            v1.l lVar = v1.l.f17564b;
            float f10 = 50;
            float f11 = 25;
            v1.o oVarL = v.n.l(v.n.f(y8.f.c(f11, t1.e(f10, t1.o(182, wVar.b(lVar, gVar)))), e0.d(z2 ? 4278221567L : 4291415768L), new ga.c(f11, 1)), z2, null, aVar, 14);
            q1 q1VarA = o1.a(b0.j.f1363e, v1.b.D, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarL);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q1VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC2);
            long j = w.f3054d;
            v7.a("Customize", null, j, hj.a.x(22), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
            v1.o oVarK = t1.k(f10, b0.d.q(wVar.b(lVar, gVar), 134, 0.0f, 2));
            j0.d dVar2 = j0.e.f8605a;
            v1.o oVarH = v.n.h(v.n.f(z1.h.c(oVarK, dVar2), j, e0.f2986b), 1, e0.d(4292402662L), dVar2);
            aVar3 = aVar2;
            v1.o oVarL2 = v.n.l(oVarH, z2, null, aVar3, 14);
            q0 q0VarD2 = b0.r.d(gVar, false);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarL2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q0VarD2);
            f1.s.M(eVar2, i0Var2, n1VarL3);
            gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC3);
            x8.a.f('\ue914', t1.k(30, lVar), hj.a.x(24), e0.d(4279309080L), i0Var2, 3504, 0);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            aVar3 = aVar2;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0(z2, pVar, aVar, aVar3, oVar, i10);
        }
    }

    public static final void d(String str, boolean z2, i2.f fVar, ej.a aVar, boolean z10, i0 i0Var, int i10, int i11) {
        boolean z11;
        int i12;
        i0 i0Var2 = i0Var;
        i0Var2.c0(1748065309);
        int i13 = (i0Var2.g(z2) ? 32 : 16) | i10 | (i0Var2.f(fVar) ? 256 : 128);
        if ((i10 & 3072) == 0) {
            i13 |= i0Var2.h(aVar) ? 2048 : 1024;
        }
        int i14 = i11 & 16;
        if (i14 != 0) {
            i12 = i13 | 24576;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i13 | (i0Var2.g(z11) ? 16384 : 8192);
        }
        if (i0Var2.T(i12 & 1, (i12 & 9363) != 9362)) {
            boolean z12 = i14 != 0 ? true : z11;
            Object objQ = i0Var2.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = m1.p(i0Var2);
            }
            z.k kVar = (z.k) objQ;
            v1.l lVar = v1.l.f17564b;
            boolean z13 = z12;
            v1.o oVarV = b0.d.v(v.n.k(lVar, kVar, null, z12, null, aVar, 24), 0.0f, 6, 1);
            b0 b0VarA = z.a(b0.j.g(7), v1.b.F, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarV);
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, b0VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.o oVarK = t1.k(56, lVar);
            fj.l.f(oVarK, "$this$selectedEffect");
            fj.l.f(kVar, "interactionSource");
            long jD = e0.d(4283072759L);
            int i15 = i12;
            q2 q2VarB = t.e.b(((Boolean) u1.p.e(kVar, i0Var2, 6).getValue()).booleanValue() ? 0.94f : 1.0f, t.d.s(0.5f, 400.0f, null, 4), "selected_effect_scale", null, i0Var2, 3120, 20);
            q2 q2VarB2 = t.e.b(z2 ? 1.0f : 0.0f, t.d.t(110, 0, null, 6), "selected_effect_alpha", null, i0Var, 3120, 20);
            float fFloatValue = ((Number) q2VarB.getValue()).floatValue();
            v1.o oVarI = z1.h.i(oVarK, fFloatValue, fFloatValue);
            boolean zF = i0Var.f(q2VarB2) | i0Var.e(jD);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new e3(jD, q2VarB2, 1);
                i0Var.l0(objQ2);
            }
            v1.o oVarF = v.n.f(z1.h.c(z1.h.g(oVarI, (ej.c) objQ2), j0.e.f8605a), w.c(e0.d(4283058765L), z13 ? 1.0f : 0.5f), e0.f2986b);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var.T);
            n1 n1VarL2 = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarF);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q0VarD);
            f1.s.M(eVar2, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar3, i0Var, dVar);
            f1.s.M(eVar4, i0Var, oVarC2);
            long j = w.f3054d;
            float f10 = 0.82f;
            a2.b(fVar, str, t1.k(24, lVar), w.c(j, z13 ? z2 ? 1.0f : 0.82f : 0.4f), i0Var, ((i15 >> 6) & 14) | 432, 0);
            i0Var.p(true);
            if (!z13) {
                f10 = 0.4f;
            } else if (z2) {
                f10 = 1.0f;
            }
            v7.a(str, null, w.c(j, f10), hj.a.x(15), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597446, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
            z11 = z13;
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e2(str, z2, fVar, aVar, z11, i10, i11);
        }
    }

    public static final void e(String str, mi.p pVar, ej.a aVar, ej.a aVar2, i0 i0Var, int i10) {
        int i11;
        a1 a1Var;
        Object jVar;
        v2.e eVar;
        int i12;
        v2.e eVar2;
        a1 a1Var2;
        v2.e eVar3;
        a1 a1Var3;
        v1.l lVar;
        long j;
        a1 a1Var4;
        lb.g gVar;
        long j4;
        f1 f1Var;
        a1 a1Var5;
        a1 a1Var6;
        v1.l lVar2;
        float f10;
        a1 a1Var7;
        Object obj;
        a1 a1Var8;
        a1 a1Var9;
        boolean z2;
        i0 i0Var2 = i0Var;
        fj.l.f(aVar, "onCancel");
        fj.l.f(aVar2, "onApply");
        i0Var2.c0(-1472052134);
        int i13 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.f(pVar) ? 32 : 16) | (i0Var2.h(aVar2) ? 2048 : 1024);
        if (i0Var2.T(i13 & 1, (i13 & 1171) != 1170)) {
            Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF = i0Var2.f(context);
            Object objQ = i0Var2.Q();
            Object obj2 = f1.m.f6385a;
            if (zF || objQ == obj2) {
                objQ = new lb.g(context);
                i0Var2.l0(objQ);
            }
            lb.g gVar2 = (lb.g) objQ;
            int i14 = i13 & 14;
            boolean z10 = i14 == 4;
            Object objQ2 = i0Var2.Q();
            if (z10 || objQ2 == obj2) {
                objQ2 = o(context, str);
                i0Var2.l0(objQ2);
            }
            c cVar = (c) objQ2;
            boolean zH = i0Var2.h(context) | (i14 == 4);
            Object objQ3 = i0Var2.Q();
            ti.c cVar2 = null;
            if (zH || objQ3 == obj2) {
                objQ3 = new ab.p(context, str, cVar2, 5);
                i0Var2.l0(objQ3);
            }
            a1 a1VarD = f1.s.D(null, str, (ej.e) objQ3, i0Var2, ((i13 << 3) & 112) | 6);
            boolean z11 = i14 == 4;
            Object objQ4 = i0Var2.Q();
            if (z11 || objQ4 == obj2) {
                objQ4 = y8.f.a(cVar != null ? cVar.f11442b : 0.0f, i0Var2);
            }
            f1 f1Var2 = (f1) objQ4;
            Object objQ5 = i0Var2.Q();
            if (objQ5 == obj2) {
                objQ5 = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ5);
            }
            a1 a1Var10 = (a1) objQ5;
            Object objQ6 = i0Var2.Q();
            if (objQ6 == obj2) {
                objQ6 = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ6);
            }
            a1 a1Var11 = (a1) objQ6;
            boolean z12 = i14 == 4;
            Object objQ7 = i0Var2.Q();
            if (z12 || objQ7 == obj2) {
                objQ7 = f1.s.A(Boolean.valueOf(cVar != null ? cVar.f11443c : false));
                i0Var2.l0(objQ7);
            }
            a1 a1Var12 = (a1) objQ7;
            boolean z13 = i14 == 4;
            Object objQ8 = i0Var2.Q();
            if (z13 || objQ8 == obj2) {
                objQ8 = f1.s.A(Boolean.valueOf(cVar != null ? cVar.f11444d : false));
                i0Var2.l0(objQ8);
            }
            a1 a1Var13 = (a1) objQ8;
            Object objQ9 = i0Var2.Q();
            if (objQ9 == obj2) {
                objQ9 = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ9);
            }
            a1 a1Var14 = (a1) objQ9;
            Boolean bool = (Boolean) a1Var12.getValue();
            bool.getClass();
            boolean zF2 = i0Var2.f(a1Var12) | i0Var2.f(a1Var13);
            Object objQ10 = i0Var2.Q();
            if (zF2 || objQ10 == obj2) {
                i11 = i14;
                a1Var = a1Var11;
                objQ10 = new h(a1Var12, a1Var13, null, 0);
                i0Var2.l0(objQ10);
            } else {
                i11 = i14;
                a1Var = a1Var11;
            }
            f1.s.f((ej.e) objQ10, i0Var2, bool);
            b0.i0 i0Var3 = t1.f1433c;
            v1.o oVarM = a.a.M(i0Var3, pVar);
            long jD = e0.d(4280032286L);
            c2.q0 q0Var = e0.f2986b;
            v1.o oVarF = v.n.f(oVarM, jD, q0Var);
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar4 = v2.g.f17649f;
            f1.s.M(eVar4, i0Var2, q0VarD);
            v2.e eVar5 = v2.g.f17648e;
            f1.s.M(eVar5, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar6 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar6);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar7 = v2.g.f17647d;
            f1.s.M(eVar7, i0Var2, oVarC);
            float f11 = 22;
            v1.o oVarU = b0.d.u(b0.d.C(i0Var3, b0.d.f1295e), f11, 4);
            b0 b0VarA = z.a(b0.j.f1361c, v1.b.F, i0Var2, 48);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarU);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar4, i0Var2, b0VarA);
            f1.s.M(eVar5, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar6, i0Var2, dVar);
            f1.s.M(eVar7, i0Var2, oVarC2);
            v1.l lVar3 = v1.l.f17564b;
            v1.o oVarC3 = t1.c(1.0f, lVar3);
            b0.f fVar2 = b0.j.f1365g;
            v1.f fVar3 = v1.b.D;
            q1 q1VarA = o1.a(fVar2, fVar3, i0Var2, 54);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            v1.o oVarC4 = v1.a.c(i0Var2, oVarC3);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar4, i0Var2, q1VarA);
            f1.s.M(eVar5, i0Var2, n1VarL3);
            gk.b.t(iHashCode3, i0Var2, eVar6, i0Var2, dVar);
            f1.s.M(eVar7, i0Var2, oVarC4);
            long jD2 = e0.d(4282006076L);
            long j10 = w.f3054d;
            int i15 = i11;
            g("Cancel", jD2, j10, aVar, i0Var2, 3510);
            long j11 = ha.a.f7750i;
            boolean zF3 = (i15 == 4) | i0Var2.f(a1VarD) | i0Var2.f(f1Var2) | i0Var2.h(context) | i0Var2.f(a1Var12) | i0Var2.f(a1Var13) | ((i13 & 7168) == 2048);
            Object objQ11 = i0Var2.Q();
            if (zF3 || objQ11 == obj2) {
                eVar = eVar6;
                i12 = i13;
                eVar2 = eVar4;
                a1Var2 = a1Var14;
                eVar3 = eVar7;
                a1Var3 = a1Var10;
                lVar = lVar3;
                j = j10;
                jVar = new lb.j(context, str, aVar2, a1VarD, f1Var2, a1Var12, a1Var13);
                a1Var4 = a1VarD;
                gVar = gVar2;
                j4 = j11;
                f1Var = f1Var2;
                a1Var5 = a1Var12;
                a1Var6 = a1Var13;
                i0Var2.l0(jVar);
            } else {
                jVar = objQ11;
                a1Var5 = a1Var12;
                j4 = j11;
                a1Var6 = a1Var13;
                eVar = eVar6;
                gVar = gVar2;
                i12 = i13;
                a1Var2 = a1Var14;
                eVar2 = eVar4;
                f1Var = f1Var2;
                a1Var4 = a1VarD;
                a1Var3 = a1Var10;
                j = j10;
                lVar = lVar3;
                eVar3 = eVar7;
            }
            g("Apply", j4, j, (ej.a) jVar, i0Var2, 390);
            i0Var2.p(true);
            b0.d.e(i0Var2, t1.e(10, lVar));
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            v1.o oVarC5 = t1.c(1.0f, new y0(1.0f, true));
            v1.g gVar3 = v1.b.f17551e;
            a1 a1Var15 = a1Var2;
            lb.q2 q2Var = new lb.q2(gVar, a1Var4, f1Var, a1Var5, a1Var6);
            f1 f1Var3 = f1Var;
            a1 a1Var16 = a1Var5;
            a1 a1Var17 = a1Var6;
            b0.d.a(oVarC5, gVar3, p1.j.d(-1684485844, q2Var, i0Var2), i0Var, 3120, 4);
            i0Var2 = i0Var;
            b0.d.e(i0Var2, t1.e(6, lVar));
            v1.o oVarX = b0.d.x(t1.c(1.0f, lVar), 0.0f, 0.0f, 0.0f, 20, 7);
            q1 q1VarA2 = o1.a(new b0.h(23, true, new b0.b(1)), fVar3, i0Var2, 54);
            int iHashCode4 = Long.hashCode(i0Var2.T);
            n1 n1VarL4 = i0Var2.l();
            v1.o oVarC6 = v1.a.c(i0Var2, oVarX);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar2, i0Var2, q1VarA2);
            f1.s.M(eVar5, i0Var2, n1VarL4);
            gk.b.t(iHashCode4, i0Var2, eVar, i0Var2, dVar);
            f1.s.M(eVar3, i0Var2, oVarC6);
            boolean zBooleanValue = ((Boolean) a1Var16.getValue()).booleanValue();
            i2.f fVarB = cg.b.f3357b;
            if (fVarB != null) {
                f10 = 6.0f;
                lVar2 = lVar;
            } else {
                i2.e eVar8 = new i2.e("Rounded.ViewInAr", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i16 = h0.f8270a;
                lVar2 = lVar;
                long j12 = w.f3052b;
                z0 z0Var = new z0(j12);
                d8.e eVar9 = new d8.e(9);
                eVar9.x(2.0f, 6.0f);
                eVar9.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar9.G(4.0f);
                eVar9.o(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                eVar9.u(1.0f);
                eVar9.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar9.C(5.55f, 1.0f, 5.0f, 1.0f);
                eVar9.t(4.0f);
                eVar9.n(2.34f, 1.0f, 1.0f, 2.34f, 1.0f, 4.0f);
                eVar9.H(1.0f);
                eVar9.n(1.0f, 5.55f, 1.45f, 6.0f, 2.0f, 6.0f);
                eVar9.k();
                i2.e.a(eVar8, (ArrayList) eVar9.f5001a, z0Var);
                z0 z0Var2 = new z0(j12);
                d8.e eVar10 = new d8.e(9);
                eVar10.x(5.0f, 21.0f);
                eVar10.t(4.0f);
                eVar10.o(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                eVar10.H(-1.0f);
                eVar10.o(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                eVar10.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar10.H(1.0f);
                eVar10.o(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                eVar10.u(1.0f);
                eVar10.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar10.C(5.55f, 21.0f, 5.0f, 21.0f);
                eVar10.k();
                i2.e.a(eVar8, (ArrayList) eVar10.f5001a, z0Var2);
                z0 z0Var3 = new z0(j12);
                d8.e eVar11 = new d8.e(9);
                eVar11.x(20.0f, 1.0f);
                eVar11.u(-1.0f);
                eVar11.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar11.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar11.u(1.0f);
                eVar11.o(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                eVar11.H(1.0f);
                eVar11.o(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                eVar11.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar11.G(4.0f);
                eVar11.n(23.0f, 2.34f, 21.66f, 1.0f, 20.0f, 1.0f);
                eVar11.k();
                i2.e.a(eVar8, (ArrayList) eVar11.f5001a, z0Var3);
                z0 z0Var4 = new z0(j12);
                d8.e eVar12 = new d8.e(9);
                eVar12.x(22.0f, 18.0f);
                eVar12.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar12.H(1.0f);
                eVar12.o(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                eVar12.u(-1.0f);
                eVar12.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar12.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar12.u(1.0f);
                eVar12.o(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                eVar12.H(-1.0f);
                eVar12.n(23.0f, 18.45f, 22.55f, 18.0f, 22.0f, 18.0f);
                eVar12.k();
                i2.e.a(eVar8, (ArrayList) eVar12.f5001a, z0Var4);
                z0 z0Var5 = new z0(j12);
                d8.e eVar13 = new d8.e(9);
                eVar13.x(19.0f, 14.87f);
                eVar13.G(9.13f);
                eVar13.o(0.0f, -0.72f, -0.38f, -1.38f, -1.0f, -1.73f);
                eVar13.w(-5.0f, -2.88f);
                eVar13.o(-0.31f, -0.18f, -0.65f, -0.27f, -1.0f, -0.27f);
                eVar13.D(-0.69f, 0.09f, -1.0f, 0.27f);
                f10 = 6.0f;
                eVar13.v(6.0f, 7.39f);
                eVar13.n(5.38f, 7.75f, 5.0f, 8.41f, 5.0f, 9.13f);
                eVar13.H(5.74f);
                eVar13.o(0.0f, 0.72f, 0.38f, 1.38f, 1.0f, 1.73f);
                eVar13.w(5.0f, 2.88f);
                eVar13.o(0.31f, 0.18f, 0.65f, 0.27f, 1.0f, 0.27f);
                eVar13.D(0.69f, -0.09f, 1.0f, -0.27f);
                eVar13.w(5.0f, -2.88f);
                eVar13.n(18.62f, 16.25f, 19.0f, 15.59f, 19.0f, 14.87f);
                eVar13.k();
                eVar13.x(11.0f, 17.17f);
                eVar13.w(-4.0f, -2.3f);
                eVar13.H(-4.63f);
                eVar13.w(4.0f, 2.33f);
                eVar13.G(17.17f);
                eVar13.k();
                eVar13.x(12.0f, 10.84f);
                eVar13.v(8.04f, 8.53f);
                eVar13.v(12.0f, 6.25f);
                eVar13.w(3.96f, 2.28f);
                eVar13.v(12.0f, 10.84f);
                eVar13.k();
                eVar13.x(17.0f, 14.87f);
                eVar13.w(-4.0f, 2.3f);
                eVar13.H(-4.6f);
                eVar13.w(4.0f, -2.33f);
                eVar13.G(14.87f);
                eVar13.k();
                i2.e.a(eVar8, (ArrayList) eVar13.f5001a, z0Var5);
                fVarB = eVar8.b();
                cg.b.f3357b = fVarB;
            }
            boolean zF4 = i0Var2.f(a1Var16);
            Object objQ12 = i0Var2.Q();
            if (zF4 || objQ12 == obj2) {
                objQ12 = new b8(a1Var16, 18);
                i0Var2.l0(objQ12);
            }
            float f12 = f10;
            int i17 = 1;
            d("3d effect", zBooleanValue, fVarB, (ej.a) objQ12, false, i0Var2, 6, 16);
            b0.d.e(i0Var2, v.n.f(y8.f.c(999, t1.o(2, t1.e(40, b0.d.x(lVar2, 0.0f, 0.0f, 0.0f, f11, 7)))), w.c(j, 0.28f), q0Var));
            boolean z14 = f1Var3.g() > 0.0f;
            i2.f fVarB2 = hj.a.f8016a;
            if (fVarB2 == null) {
                i2.e eVar14 = new i2.e("Rounded.BlurOn", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i18 = h0.f8270a;
                z0 z0Var6 = new z0(w.f3052b);
                d8.e eVar15 = new d8.e(9);
                eVar15.x(f12, 13.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(f12, 17.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(f12, 9.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(3.0f, 9.5f);
                eVar15.o(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.D(0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.k();
                eVar15.x(f12, 5.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(21.0f, 10.5f);
                eVar15.o(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.D(-0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.k();
                eVar15.x(14.0f, 7.0f);
                eVar15.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.D(-1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.k();
                eVar15.x(14.0f, 3.5f);
                eVar15.o(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.D(-0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.k();
                eVar15.x(3.0f, 13.5f);
                eVar15.o(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.D(0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.k();
                eVar15.x(10.0f, 20.5f);
                eVar15.o(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.D(0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.k();
                eVar15.x(10.0f, 3.5f);
                eVar15.o(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.D(-0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.k();
                eVar15.x(10.0f, 7.0f);
                eVar15.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.D(-1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.k();
                eVar15.x(10.0f, 12.5f);
                eVar15.o(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
                eVar15.D(0.67f, 1.5f, 1.5f, 1.5f);
                eVar15.D(1.5f, -0.67f, 1.5f, -1.5f);
                eVar15.D(-0.67f, -1.5f, -1.5f, -1.5f);
                eVar15.k();
                eVar15.x(18.0f, 13.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(18.0f, 17.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(18.0f, 9.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(18.0f, 5.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(21.0f, 13.5f);
                eVar15.o(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.D(0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.k();
                eVar15.x(14.0f, 17.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(14.0f, 20.5f);
                eVar15.o(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
                eVar15.D(0.22f, 0.5f, 0.5f, 0.5f);
                eVar15.D(0.5f, -0.22f, 0.5f, -0.5f);
                eVar15.D(-0.22f, -0.5f, -0.5f, -0.5f);
                eVar15.k();
                eVar15.x(10.0f, 8.5f);
                eVar15.o(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
                eVar15.D(0.67f, 1.5f, 1.5f, 1.5f);
                eVar15.D(1.5f, -0.67f, 1.5f, -1.5f);
                eVar15.D(-0.67f, -1.5f, -1.5f, -1.5f);
                eVar15.k();
                eVar15.x(10.0f, 17.0f);
                eVar15.o(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                eVar15.D(0.45f, 1.0f, 1.0f, 1.0f);
                eVar15.D(1.0f, -0.45f, 1.0f, -1.0f);
                eVar15.D(-0.45f, -1.0f, -1.0f, -1.0f);
                eVar15.k();
                eVar15.x(14.0f, 12.5f);
                eVar15.o(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
                eVar15.D(0.67f, 1.5f, 1.5f, 1.5f);
                eVar15.D(1.5f, -0.67f, 1.5f, -1.5f);
                eVar15.D(-0.67f, -1.5f, -1.5f, -1.5f);
                eVar15.k();
                eVar15.x(14.0f, 8.5f);
                eVar15.o(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
                eVar15.D(0.67f, 1.5f, 1.5f, 1.5f);
                eVar15.D(1.5f, -0.67f, 1.5f, -1.5f);
                eVar15.D(-0.67f, -1.5f, -1.5f, -1.5f);
                eVar15.k();
                i2.e.a(eVar14, (ArrayList) eVar15.f5001a, z0Var6);
                fVarB2 = eVar14.b();
                hj.a.f8016a = fVarB2;
            }
            i2.f fVar4 = fVarB2;
            Object objQ13 = i0Var2.Q();
            if (objQ13 == obj2) {
                objQ13 = new b8(a1Var3, 19);
                i0Var2.l0(objQ13);
            }
            d("Blur", z14, fVar4, (ej.a) objQ13, false, i0Var2, 3078, 16);
            boolean zBooleanValue2 = ((Boolean) a1Var17.getValue()).booleanValue();
            i2.f fVarB3 = hj.a.f8017b;
            if (fVarB3 == null) {
                i2.e eVar16 = new i2.e("Rounded.WaterDrop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i19 = h0.f8270a;
                z0 z0Var7 = new z0(w.f3052b);
                d8.e eVar17 = new d8.e(9);
                eVar17.x(12.66f, 2.58f);
                eVar17.o(-0.38f, -0.33f, -0.95f, -0.33f, -1.33f, 0.0f);
                eVar17.n(6.45f, 6.88f, 4.0f, 10.62f, 4.0f, 13.8f);
                eVar17.o(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
                eVar17.D(8.0f, -3.22f, 8.0f, -8.2f);
                eVar17.n(20.0f, 10.62f, 17.55f, 6.88f, 12.66f, 2.58f);
                eVar17.k();
                eVar17.x(7.83f, 14.0f);
                eVar17.o(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
                eVar17.o(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
                eVar17.o(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
                eVar17.o(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
                eVar17.o(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
                eVar17.n(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
                eVar17.k();
                i2.e.a(eVar16, (ArrayList) eVar17.f5001a, z0Var7);
                fVarB3 = eVar16.b();
                hj.a.f8017b = fVarB3;
            }
            i2.f fVar5 = fVarB3;
            boolean zF5 = i0Var2.f(a1Var17);
            Object objQ14 = i0Var2.Q();
            if (zF5 || objQ14 == obj2) {
                a1Var7 = a1Var;
                objQ14 = new jb.a(a1Var17, a1Var7, 4);
                i0Var2.l0(objQ14);
            } else {
                a1Var7 = a1Var;
            }
            d("Rain", zBooleanValue2, fVar5, (ej.a) objQ14, !((Boolean) a1Var16.getValue()).booleanValue(), i0Var2, 6, 0);
            i0Var2.p(true);
            i0Var2.p(true);
            if (((Boolean) a1Var3.getValue()).booleanValue()) {
                i0Var2.b0(-1811172467);
                Object objQ15 = i0Var2.Q();
                if (objQ15 == obj2) {
                    objQ15 = new b8(a1Var3, 20);
                    i0Var2.l0(objQ15);
                }
                a1Var9 = a1Var7;
                a1Var8 = a1Var17;
                obj = obj2;
                lb.c.b(pVar, (ej.a) objQ15, false, null, !((Boolean) a1Var15.getValue()).booleanValue(), 0.75f, 0L, false, false, 0.0f, null, null, false, false, 16, p1.j.d(1524907074, new u3(f1Var3, a1Var15, i17), i0Var2), i0Var, ((i12 >> 3) & 14) | 1769520, 1769472, 32652);
                i0Var2 = i0Var;
                z2 = false;
                i0Var2.p(false);
            } else {
                obj = obj2;
                a1Var8 = a1Var17;
                a1Var9 = a1Var7;
                z2 = false;
                i0Var2.b0(-1807769566);
                i0Var2.p(false);
            }
            if (((Boolean) a1Var9.getValue()).booleanValue()) {
                i0Var2.b0(-1807623463);
                Object objQ16 = i0Var2.Q();
                if (objQ16 == obj) {
                    objQ16 = new b8(a1Var9, 21);
                    i0Var2.l0(objQ16);
                }
                final a1 a1Var18 = a1Var8;
                lb.c.b(pVar, (ej.a) objQ16, false, null, false, 0.75f, 0L, false, false, 0.0f, null, null, false, false, 16, p1.j.d(1454250681, new ej.h() { // from class: mb.g
                    @Override // ej.h
                    public final Object g(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                        v2.f fVar6;
                        ej.a aVar3 = (ej.a) obj4;
                        i0 i0Var4 = (i0) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        fj.l.f(aVar3, "requestDismiss");
                        fj.l.f((ej.c) obj5, "$unused$var$");
                        v1.l lVar4 = v1.l.f17564b;
                        v1.o oVarV = b0.d.v(lVar4, 28, 0.0f, 2);
                        b0 b0VarA2 = z.a(b0.j.f1361c, v1.b.E, i0Var4, 0);
                        int iHashCode5 = Long.hashCode(i0Var4.T);
                        n1 n1VarL5 = i0Var4.l();
                        v1.o oVarC7 = v1.a.c(i0Var4, oVarV);
                        v2.h.f17668w.getClass();
                        v2.f fVar7 = v2.g.f17645b;
                        i0Var4.e0();
                        if (i0Var4.S) {
                            i0Var4.k(fVar7);
                        } else {
                            i0Var4.o0();
                        }
                        v2.e eVar18 = v2.g.f17649f;
                        f1.s.M(eVar18, i0Var4, b0VarA2);
                        v2.e eVar19 = v2.g.f17648e;
                        f1.s.M(eVar19, i0Var4, n1VarL5);
                        Integer numValueOf2 = Integer.valueOf(iHashCode5);
                        v2.e eVar20 = v2.g.f17650g;
                        f1.s.w(i0Var4, numValueOf2, eVar20);
                        v2.d dVar2 = v2.g.f17651h;
                        f1.s.I(dVar2, i0Var4);
                        v2.e eVar21 = v2.g.f17647d;
                        f1.s.M(eVar21, i0Var4, oVarC7);
                        float f13 = 24;
                        b0.d.e(i0Var4, t1.e(f13, lVar4));
                        long jX = hj.a.x(18);
                        k3.s sVar = k3.s.B;
                        long j13 = w.f3052b;
                        v7.a("Experimental Feature", null, w.c(j13, 0.85f), jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262058);
                        float f14 = 16;
                        b0.d.e(i0Var4, t1.e(f14, lVar4));
                        v7.a("This is an experimental feature with many bugs. Blur and liquid glass effects do not work with rain, and it may cause device heating.", null, w.c(j13, 0.65f), hj.a.x(14), null, null, 0L, null, hj.a.x(20), 0, false, 0, 0, null, i0Var4, 24966, 48, 260074);
                        b0.d.e(i0Var4, t1.e(f13, lVar4));
                        v1.o oVarC8 = t1.c(1.0f, lVar4);
                        q1 q1VarA3 = o1.a(b0.j.g(12), v1.b.C, i0Var4, 6);
                        int iHashCode6 = Long.hashCode(i0Var4.T);
                        n1 n1VarL6 = i0Var4.l();
                        v1.o oVarC9 = v1.a.c(i0Var4, oVarC8);
                        i0Var4.e0();
                        if (i0Var4.S) {
                            fVar6 = fVar7;
                            i0Var4.k(fVar6);
                        } else {
                            fVar6 = fVar7;
                            i0Var4.o0();
                        }
                        f1.s.M(eVar18, i0Var4, q1VarA3);
                        f1.s.M(eVar19, i0Var4, n1VarL6);
                        gk.b.u(iHashCode6, i0Var4, eVar20, i0Var4, dVar2);
                        f1.s.M(eVar21, i0Var4, oVarC9);
                        r1 r1Var = r1.f1410a;
                        v1.o oVarC10 = y8.f.c(f14, r1.a(r1Var, lVar4));
                        long jD3 = e0.d(4292927712L);
                        c2.q0 q0Var2 = e0.f2986b;
                        v1.o oVarF2 = v.n.f(oVarC10, jD3, q0Var2);
                        int i20 = (iIntValue & 112) ^ 48;
                        boolean z15 = (i20 > 32 && i0Var4.f(aVar3)) || (iIntValue & 48) == 32;
                        Object objQ17 = i0Var4.Q();
                        f1.f fVar8 = f1.m.f6385a;
                        if (z15 || objQ17 == fVar8) {
                            objQ17 = new d3(7, aVar3);
                            i0Var4.l0(objQ17);
                        }
                        v1.o oVarL = v.n.l(oVarF2, false, null, (ej.a) objQ17, 15);
                        float f15 = 13;
                        v1.o oVarV2 = b0.d.v(oVarL, 0.0f, f15, 1);
                        v1.g gVar4 = v1.b.f17551e;
                        q0 q0VarD2 = b0.r.d(gVar4, false);
                        int iHashCode7 = Long.hashCode(i0Var4.T);
                        n1 n1VarL7 = i0Var4.l();
                        v1.o oVarC11 = v1.a.c(i0Var4, oVarV2);
                        i0Var4.e0();
                        if (i0Var4.S) {
                            i0Var4.k(fVar6);
                        } else {
                            i0Var4.o0();
                        }
                        f1.s.M(eVar18, i0Var4, q0VarD2);
                        f1.s.M(eVar19, i0Var4, n1VarL7);
                        gk.b.u(iHashCode7, i0Var4, eVar20, i0Var4, dVar2);
                        f1.s.M(eVar21, i0Var4, oVarC11);
                        long jC = w.c(j13, 0.7f);
                        v2.f fVar9 = fVar6;
                        long jX2 = hj.a.x(16);
                        k3.s sVar2 = k3.s.A;
                        v7.a("Okay", null, jC, jX2, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262058);
                        i0Var4.p(true);
                        v1.o oVarF3 = v.n.f(y8.f.c(f14, r1.a(r1Var, lVar4)), e0.d(4283268339L), q0Var2);
                        a1 a1Var19 = a1Var18;
                        boolean zF6 = i0Var4.f(a1Var19) | ((i20 > 32 && i0Var4.f(aVar3)) || (iIntValue & 48) == 32);
                        Object objQ18 = i0Var4.Q();
                        if (zF6 || objQ18 == fVar8) {
                            objQ18 = new f(aVar3, a1Var19, 0);
                            i0Var4.l0(objQ18);
                        }
                        v1.o oVarV3 = b0.d.v(v.n.l(oVarF3, false, null, (ej.a) objQ18, 15), 0.0f, f15, 1);
                        q0 q0VarD3 = b0.r.d(gVar4, false);
                        int iHashCode8 = Long.hashCode(i0Var4.T);
                        n1 n1VarL8 = i0Var4.l();
                        v1.o oVarC12 = v1.a.c(i0Var4, oVarV3);
                        i0Var4.e0();
                        if (i0Var4.S) {
                            i0Var4.k(fVar9);
                        } else {
                            i0Var4.o0();
                        }
                        f1.s.M(eVar18, i0Var4, q0VarD3);
                        f1.s.M(eVar19, i0Var4, n1VarL8);
                        gk.b.u(iHashCode8, i0Var4, eVar20, i0Var4, dVar2);
                        f1.s.M(eVar21, i0Var4, oVarC12);
                        v7.a("Alright", null, w.f3054d, hj.a.x(16), sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262058);
                        i0Var4.p(true);
                        i0Var4.p(true);
                        b0.d.e(i0Var4, t1.e(8, lVar4));
                        i0Var4.p(true);
                        return pi.o.f13011a;
                    }
                }, i0Var2), i0Var, ((i12 >> 3) & 14) | 1769520, 1769472, 32668);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                i0Var2.b0(-1804478110);
                i0Var2.p(z2);
            }
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.c(str, pVar, aVar, aVar2, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    public static final void f(c2.g gVar, float f10, boolean z2, boolean z10, float f11, jb.d dVar, v1.o oVar, i0 i0Var, int i10) {
        c2.g gVar2;
        i0 i0Var2;
        boolean z11;
        ?? r13;
        i0 i0Var3;
        Object objR;
        i0 i0Var4 = i0Var;
        i0Var4.c0(1155885605);
        int i11 = i10 | (i0Var4.h(gVar) ? 4 : 2) | (i0Var4.c(f10) ? 32 : 16) | (i0Var4.g(z2) ? 256 : 128) | (i0Var4.g(z10) ? 2048 : 1024) | (i0Var4.f(oVar) ? 1048576 : 524288);
        if (i0Var4.T(i11 & 1, (i11 & 525459) != 525458)) {
            Context context = (Context) i0Var4.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var4.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("PhoneGridPlaceholder.png");
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                        u6.v.n(inputStreamOpen, null);
                        objR = bitmapDecodeStream != null ? new c2.g(bitmapDecodeStream) : null;
                    } finally {
                    }
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                objQ = (c2.g) (objR instanceof pi.j ? null : objR);
                i0Var4.l0(objQ);
            }
            c2.g gVar3 = (c2.g) objQ;
            pi.h hVarR = r(i0Var4);
            float f12 = z2 ? 1.09f : 1.0f;
            t.s sVar = y.f15326a;
            q2 q2VarB = t.e.b(f12, t.d.t(340, 0, sVar, 2), "wallpaper_3d_zoom", null, i0Var4, 3072, 20);
            q2 q2VarB2 = t.e.b(z2 ? ((Number) hVarR.f13000a).floatValue() : 0.0f, z2 ? t.d.r() : t.d.t(300, 0, sVar, 2), "wallpaper_3d_parallax_x", null, i0Var, 3072, 20);
            q2 q2VarB3 = t.e.b(z2 ? ((Number) hVarR.f13001b).floatValue() : 0.0f, z2 ? t.d.r() : t.d.t(300, 0, sVar, 2), "wallpaper_3d_parallax_y", null, i0Var, 3072, 20);
            i0 i0Var5 = i0Var;
            v1.o oVarF = v.n.f(y8.f.c(28, b0.d.g(0.46153846f, oVar)), e0.d(4279243028L), e0.f2986b);
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var5.T);
            n1 n1VarL = i0Var5.l();
            v1.o oVarC = v1.a.c(i0Var5, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var5.e0();
            if (i0Var5.S) {
                i0Var5.k(fVar2);
            } else {
                i0Var5.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var5, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var5, n1VarL);
            f1.s.w(i0Var5, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var5);
            f1.s.M(v2.g.f17647d, i0Var5, oVarC);
            if (gVar != null) {
                i0Var5.b0(-456293290);
                b0.i0 i0Var6 = t1.f1433c;
                boolean zF = i0Var5.f(q2VarB) | i0Var5.f(q2VarB2) | i0Var5.f(q2VarB3);
                Object objQ2 = i0Var5.Q();
                if (zF || objQ2 == fVar) {
                    objQ2 = new d(q2VarB, q2VarB2, q2VarB3, 0);
                    i0Var5.l0(objQ2);
                }
                z11 = true;
                r13 = 0;
                v.n.c(gVar, null, z1.h.b(f10, e0.q(i0Var6, (ej.c) objQ2)), t2.h.f15563a, i0Var, (i11 & 14) | 24624, 232);
                gVar2 = gVar;
                i0 i0Var7 = i0Var;
                i0Var7.p(false);
                i0Var3 = i0Var7;
            } else {
                gVar2 = gVar;
                z11 = true;
                r13 = 0;
                i0Var5.b0(-455778845);
                i0Var5.p(false);
                i0Var3 = i0Var5;
            }
            if (!z10 || gVar2 == null) {
                i0Var3.b0(-455541757);
                i0Var3.p(r13);
            } else {
                i0Var3.b0(-455678219);
                mk.b.e(gVar2, t1.f1433c, i0Var3, (i11 & 14) | 48, r13);
                i0Var3.p(r13);
            }
            if (gVar3 != null) {
                i0Var3.b0(-455467481);
                v.n.c(gVar3, null, b0.w.f1450a.b(t1.f1432b, v1.b.f17551e), t2.h.f15565c, i0Var3, 24624, 232);
                i0Var3.p(r13);
            } else {
                i0Var3.b0(-455184637);
                i0Var3.p(r13);
            }
            i0Var3.p(z11);
            i0Var2 = i0Var3;
        } else {
            gVar2 = gVar;
            i0Var4.W();
            i0Var2 = i0Var4;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new jb.g(gVar2, f10, z2, z10, f11, dVar, oVar, i10);
        }
    }

    public static final void g(final String str, final long j, final long j4, final ej.a aVar, i0 i0Var, final int i10) {
        int i11;
        i0Var.c0(-673665917);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.e(j) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.e(j4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.h(aVar) ? 2048 : 1024;
        }
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            v1.o oVarL = v.n.l(v.n.f(y8.f.c(19, t1.e(38, t1.o(92, v1.l.f17564b))), j, e0.f2986b), false, null, aVar, 15);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarL);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            v7.a(str, null, j4, hj.a.x(16), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 1597440 | (i11 & 896), 0, 262058);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: mb.e
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.g(str, j, j4, aVar, (i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void h(int i10, float f10, v1.o oVar, i0 i0Var, int i11) {
        i0Var.c0(-70522796);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | (i0Var.c(f10) ? 32 : 16) | (i0Var.f(oVar) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            v1.o oVarE = t1.e(16, t1.c(1.0f, oVar));
            q1 q1VarA = o1.a(b0.j.f1363e, v1.b.D, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarE);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            i0Var.b0(667148584);
            for (int i13 = 0; i13 < i10; i13++) {
                float fO = 1.0f - cg.b.o(Math.abs(f10 - i13), 0.0f, 1.0f);
                b0.r.a(v.n.f(z1.h.c(t1.k((1 * fO) + 7, b0.d.v(v1.l.f17564b, 4, 0.0f, 2)), j0.e.f8605a), w.c(e0.d(4279309080L), (fO * 0.8f) + 0.2f), e0.f2986b), i0Var, 0);
            }
            i0Var.p(false);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new m(i10, f10, oVar, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final android.content.Context r49, final mb.b r50, final float r51, final float r52, final boolean r53, final boolean r54, ej.a r55, final v1.o r56, final ej.a r57, final ej.c r58, final ej.a r59, f1.i0 r60, final int r61) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.i(android.content.Context, mb.b, float, float, boolean, boolean, ej.a, v1.o, ej.a, ej.c, ej.a, f1.i0, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final String str, int i10, final ej.c cVar, final ej.c cVar2, final ej.a aVar, i0 i0Var, int i11) {
        i0 i0Var2;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        int i13;
        Object objR;
        boolean z2;
        h.b bVar;
        Object bVar2;
        a1 a1Var;
        List list;
        qj.z zVar;
        Context context;
        fj.l.f(cVar, "onWallpaperSelected");
        fj.l.f(aVar, "onBack");
        i0Var.c0(-360109961);
        int i14 = (i0Var.h(aVar) ? 16384 : 8192) | i11 | (i0Var.f(str) ? 4 : 2) | (i0Var.d(i10) ? 32 : 16) | (i0Var.h(cVar) ? 256 : 128) | (i0Var.h(cVar2) ? 2048 : 1024);
        int i15 = 0;
        if (i0Var.T(i14 & 1, (i14 & 9363) != 9362)) {
            Context context2 = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            int i16 = i14 & 112;
            boolean zF = i0Var.f(context2) | (i16 == 32);
            Object objQ = i0Var.Q();
            Object obj = qi.s.f13520a;
            Object obj2 = f1.m.f6385a;
            if (zF || objQ == obj2) {
                String string = context2.getSharedPreferences("home_launcher_wallpaper_collection", 0).getString("user_wallpapers", null);
                if (string != null) {
                    List listN0 = nj.e.N0(string);
                    ArrayList arrayList3 = new ArrayList(qi.m.s0(listN0));
                    Iterator it = listN0.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(nj.e.a1((String) it.next()).toString());
                    }
                    arrayList = new ArrayList();
                    int size = arrayList3.size();
                    while (i15 < size) {
                        Object obj3 = arrayList3.get(i15);
                        i15++;
                        String str2 = (String) obj3;
                        if (str2.length() > 0) {
                            arrayList2 = arrayList3;
                            i13 = i14;
                            if (new File(new File(context2.getFilesDir(), "wallpapers"), str2).exists()) {
                                arrayList.add(obj3);
                            }
                        } else {
                            arrayList2 = arrayList3;
                            i13 = i14;
                        }
                        arrayList3 = arrayList2;
                        i14 = i13;
                    }
                } else {
                    arrayList = obj;
                }
                i12 = i14;
                objQ = f1.s.A(arrayList);
                i0Var.l0(objQ);
            } else {
                i12 = i14;
            }
            a1 a1Var2 = (a1) objQ;
            boolean zF2 = i0Var.f((List) a1Var2.getValue()) | i0Var.f(context2) | (i16 == 32);
            Object objQ2 = i0Var.Q();
            if (zF2 || objQ2 == obj2) {
                List<String> list2 = (List) a1Var2.getValue();
                fj.l.f(context2, "context");
                try {
                    String[] list3 = context2.getAssets().list("wallpapers");
                    if (list3 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (String str3 : list3) {
                            fj.l.c(str3);
                            if (nj.l.w0(str3, ".png", true) || nj.l.w0(str3, ".jpg", true)) {
                                arrayList4.add(str3);
                            }
                        }
                        objR = qi.l.K0(arrayList4);
                    } else {
                        objR = obj;
                    }
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                if (!(objR instanceof pi.j)) {
                    obj = objR;
                }
                qi.s<String> sVar = (List) obj;
                ArrayList arrayList5 = new ArrayList(qi.m.s0(sVar));
                for (String str4 : sVar) {
                    arrayList5.add(new b(str4, str4, false));
                }
                ArrayList arrayList6 = new ArrayList(qi.m.s0(list2));
                for (String str5 : list2) {
                    arrayList6.add(new b(m1.i("user:", str5), str5, true));
                }
                z2 = true;
                objQ2 = qi.l.I0(arrayList5, arrayList6);
                i0Var.l0(objQ2);
            } else {
                z2 = true;
            }
            List list4 = (List) objQ2;
            boolean zF3 = i0Var.f(list4) | ((i12 & 14) == 4 ? z2 : false);
            Object objQ3 = i0Var.Q();
            if (zF3 || objQ3 == obj2) {
                Iterator it2 = list4.iterator();
                int i17 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (fj.l.b(((b) it2.next()).f11438a, str)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i17);
                if (i17 < 0) {
                    numValueOf = null;
                }
                objQ3 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
                i0Var.l0(objQ3);
            }
            int iIntValue = ((Number) objQ3).intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            boolean zH = i0Var.h(list4);
            Object objQ4 = i0Var.Q();
            if (zH || objQ4 == obj2) {
                objQ4 = new g0.c(1, list4);
                i0Var.l0(objQ4);
            }
            final g0.d dVarB = l0.b(iIntValue, (ej.a) objQ4, i0Var, 2);
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj2) {
                objQ5 = f1.s.o(i0Var);
                i0Var.l0(objQ5);
            }
            qj.z zVar2 = (qj.z) objQ5;
            final s3.c cVar3 = (s3.c) i0Var.j(w2.f1.f18262h);
            gi.d dVarD = gi.f.d(null, i0Var, 0, 3);
            final mi.p pVarG = mi.d.g(i0Var);
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj2) {
                objQ6 = f1.s.A(null);
                i0Var.l0(objQ6);
            }
            final a1 a1Var3 = (a1) objQ6;
            Object objQ7 = i0Var.Q();
            if (objQ7 == obj2) {
                objQ7 = f1.s.A(null);
                i0Var.l0(objQ7);
            }
            final a1 a1Var4 = (a1) objQ7;
            Object objQ8 = i0Var.Q();
            if (objQ8 == obj2) {
                objQ8 = y8.f.a(0.0f, i0Var);
            }
            final f1 f1Var = (f1) objQ8;
            final float fW0 = cVar3.w0(60);
            h.b bVar3 = new h.b(2);
            boolean zH2 = i0Var.h(zVar2) | i0Var.h(context2) | i0Var.f(a1Var2) | i0Var.h(list4) | i0Var.f(dVarB);
            Object objQ9 = i0Var.Q();
            if (zH2 || objQ9 == obj2) {
                bVar = bVar3;
                a1Var = a1Var2;
                list = list4;
                zVar = zVar2;
                context = context2;
                bVar2 = new d.b(zVar, context, list, dVarB, a1Var, 4);
                i0Var.l0(bVar2);
            } else {
                bVar2 = objQ9;
                bVar = bVar3;
                a1Var = a1Var2;
                list = list4;
                zVar = zVar2;
                context = context2;
            }
            final d.k kVarM = uk.c.M(bVar, (ej.c) bVar2, i0Var);
            b0.i0 i0Var3 = t1.f1433c;
            v1.g gVar = v1.b.f17547a;
            q0 q0VarD = b0.r.d(gVar, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, i0Var3);
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
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
            v1.o oVarF = v.n.f(gi.f.a(v1.l.f17564b, dVarD).c(i0Var3), e0.d(4294375418L), e0.f2986b);
            q0 q0VarD2 = b0.r.d(gVar, false);
            int iHashCode2 = Long.hashCode(i0Var.T);
            n1 n1VarL2 = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarF);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q0VarD2);
            f1.s.M(eVar2, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar3, i0Var, dVar);
            f1.s.M(eVar4, i0Var, oVarC2);
            final qj.z zVar3 = zVar;
            final Context context3 = context;
            final List list5 = list;
            final a1 a1Var5 = a1Var;
            int i18 = i12;
            ej.f fVar = new ej.f() { // from class: mb.s
                @Override // ej.f
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    final f1 f1Var2;
                    v1.g gVar2;
                    final g0.h0 h0Var;
                    final Context context4;
                    v1.l lVar;
                    List list6;
                    b0.w wVar;
                    float f10;
                    b0.y yVar = (b0.y) obj4;
                    i0 i0Var4 = (i0) obj5;
                    int iIntValue2 = ((Integer) obj6).intValue();
                    v1.g gVar3 = v1.b.f17551e;
                    fj.l.f(yVar, "$this$BoxWithConstraints");
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= i0Var4.f(yVar) ? 4 : 2;
                    }
                    boolean z10 = (iIntValue2 & 19) != 18;
                    f2 f2Var = i0Var4.f6313a;
                    if (i0Var4.T(iIntValue2 & 1, z10)) {
                        final float f11 = ((s3.f) cg.b.t(new s3.f(yVar.c() - 126), new s3.f(222), new s3.f(298))).f14742a;
                        s3.f fVar2 = new s3.f((yVar.c() - f11) / 2);
                        s3.f fVar3 = new s3.f(24);
                        if (fVar2.compareTo(fVar3) < 0) {
                            fVar2 = fVar3;
                        }
                        float f12 = 2.1666667f * f11;
                        float f13 = f12 / 2.0f;
                        float fB = ((yVar.b() - f12) / 4.0f) + f13;
                        float f14 = ((fB - 25) + f13) / 2.0f;
                        v1.g gVar4 = v1.b.f17548b;
                        b0.w wVar2 = b0.w.f1450a;
                        v1.l lVar2 = v1.l.f17564b;
                        v1.o oVarC3 = b0.d.C(wVar2.b(lVar2, gVar4), b0.d.f1295e);
                        q0 q0VarD3 = b0.r.d(v1.b.f17547a, false);
                        int iHashCode3 = Long.hashCode(i0Var4.T);
                        n1 n1VarL3 = i0Var4.l();
                        v1.o oVarC4 = v1.a.c(i0Var4, oVarC3);
                        v2.h.f17668w.getClass();
                        v2.f fVar4 = v2.g.f17645b;
                        i0Var4.e0();
                        if (i0Var4.S) {
                            i0Var4.k(fVar4);
                        } else {
                            i0Var4.o0();
                        }
                        v2.e eVar5 = v2.g.f17649f;
                        f1.s.M(eVar5, i0Var4, q0VarD3);
                        v2.e eVar6 = v2.g.f17648e;
                        f1.s.M(eVar6, i0Var4, n1VarL3);
                        Integer numValueOf3 = Integer.valueOf(iHashCode3);
                        v2.e eVar7 = v2.g.f17650g;
                        f1.s.w(i0Var4, numValueOf3, eVar7);
                        v2.d dVar2 = v2.g.f17651h;
                        f1.s.I(dVar2, i0Var4);
                        v2.e eVar8 = v2.g.f17647d;
                        f1.s.M(eVar8, i0Var4, oVarC4);
                        a.k(aVar, i0Var4, 0);
                        i0Var4.p(true);
                        final List list7 = list5;
                        boolean zIsEmpty = list7.isEmpty();
                        g0.h0 h0Var2 = dVarB;
                        Context context5 = context3;
                        final a1 a1Var6 = a1Var4;
                        f1 f1Var3 = f1Var;
                        f1.f fVar5 = f1.m.f6385a;
                        if (zIsEmpty) {
                            i0Var4.b0(-1867803400);
                            a.b(0, i0Var4);
                            i0Var4.p(false);
                            h0Var = h0Var2;
                            gVar2 = gVar3;
                            lVar = lVar2;
                            f1Var2 = f1Var3;
                            context4 = context5;
                            list6 = list7;
                            f10 = f14;
                            wVar = wVar2;
                        } else {
                            f1Var2 = f1Var3;
                            i0Var4.b0(-1867613742);
                            v1.o oVarB = wVar2.b(t1.g(f12, t1.c(1.0f, lVar2)), gVar3);
                            q0 q0VarD4 = b0.r.d(gVar3, false);
                            int iHashCode4 = Long.hashCode(i0Var4.T);
                            n1 n1VarL4 = i0Var4.l();
                            v1.o oVarC5 = v1.a.c(i0Var4, oVarB);
                            i0Var4.e0();
                            gVar2 = gVar3;
                            if (i0Var4.S) {
                                i0Var4.k(fVar4);
                            } else {
                                i0Var4.o0();
                            }
                            f1.s.M(eVar5, i0Var4, q0VarD4);
                            f1.s.M(eVar6, i0Var4, n1VarL4);
                            gk.b.u(iHashCode4, i0Var4, eVar7, i0Var4, dVar2);
                            f1.s.M(eVar8, i0Var4, oVarC5);
                            b0.i0 i0Var5 = t1.f1433c;
                            boolean zF4 = i0Var4.f(h0Var2);
                            Object objQ10 = i0Var4.Q();
                            if (zF4 || objQ10 == fVar5) {
                                objQ10 = new g0.e(h0Var2, 5);
                                i0Var4.l0(objQ10);
                            }
                            ej.a aVar3 = (ej.a) objQ10;
                            boolean zF5 = i0Var4.f(h0Var2);
                            Object objQ11 = i0Var4.Q();
                            if (zF5 || objQ11 == fVar5) {
                                objQ11 = new g0.e(h0Var2, 6);
                                i0Var4.l0(objQ11);
                            }
                            ej.a aVar4 = (ej.a) objQ11;
                            final float f15 = fVar2.f14742a;
                            final String str6 = str;
                            final ej.c cVar4 = cVar;
                            final s3.c cVar5 = cVar3;
                            final float f16 = fW0;
                            h0Var = h0Var2;
                            context4 = context5;
                            lVar = lVar2;
                            ej.f fVar6 = new ej.f() { // from class: mb.t
                                @Override // ej.f
                                public final Object c(Object obj7, Object obj8, Object obj9) {
                                    v1.o oVar = (v1.o) obj7;
                                    i0 i0Var6 = (i0) obj8;
                                    int iIntValue3 = ((Integer) obj9).intValue();
                                    fj.l.f(oVar, "overscrollModifier");
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= i0Var6.f(oVar) ? 4 : 2;
                                    }
                                    if (i0Var6.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        final float f17 = f11;
                                        g0.k kVar = new g0.k(f17);
                                        final g0.h0 h0Var3 = h0Var;
                                        final Context context6 = context4;
                                        final List list8 = list7;
                                        final String str7 = str6;
                                        final ej.c cVar6 = cVar4;
                                        final s3.c cVar7 = cVar5;
                                        final float f18 = f16;
                                        int i19 = iIntValue3;
                                        final a1 a1Var7 = a1Var6;
                                        final f1 f1Var4 = f1Var2;
                                        u6.v.e(h0Var3, oVar, b0.d.b(f15, 2), kVar, 1, 14, null, null, false, null, null, null, p1.j.d(-1998278940, new ej.g() { // from class: mb.n
                                            /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
                                            /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
                                            @Override // ej.g
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final java.lang.Object e(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
                                                /*
                                                    Method dump skipped, instructions count: 484
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: mb.n.e(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                            }
                                        }, i0Var6), i0Var6, ((i19 << 3) & 112) | 221184, 24576, 16320);
                                    } else {
                                        i0Var6.W();
                                    }
                                    return pi.o.f13011a;
                                }
                            };
                            list6 = list7;
                            p1.e eVarD = p1.j.d(-119320669, fVar6, i0Var4);
                            wVar = wVar2;
                            f10 = f14;
                            u6.v.d(i0Var5, aVar3, aVar4, eVarD, i0Var4, 3078);
                            i0Var4.p(true);
                            i0Var4.p(false);
                        }
                        int size2 = list6.size();
                        float fG = ((f1) h0Var.f6893d.f3554d).g() + ((g1) h0Var.f6893d.f3553c).g();
                        int size3 = list6.size() - 1;
                        if (size3 < 0) {
                            size3 = 0;
                        }
                        float fO = cg.b.o(fG, 0.0f, size3);
                        v1.g gVar5 = gVar2;
                        a.h(size2, fO, b0.d.q(wVar.b(lVar, gVar5), 0.0f, f10, 1), i0Var4, 0);
                        final b bVar4 = (b) qi.l.B0(h0Var.o(), list6);
                        if (bVar4 != null && bVar4.f11440c && fj.l.b((String) a1Var6.getValue(), bVar4.f11438a)) {
                            i0Var4.b0(-1862896348);
                            v1.o oVarQ = b0.d.q(wVar.b(lVar, gVar5), 0.0f, f10 - 48, 1);
                            boolean zF6 = i0Var4.f(bVar4) | i0Var4.h(context4);
                            final a1 a1Var7 = a1Var5;
                            boolean zF7 = zF6 | i0Var4.f(a1Var7);
                            final ej.c cVar6 = cVar2;
                            boolean zF8 = zF7 | i0Var4.f(cVar6);
                            final qj.z zVar4 = zVar3;
                            boolean zH3 = zF8 | i0Var4.h(zVar4) | i0Var4.f(h0Var) | i0Var4.h(list6);
                            Object objQ12 = i0Var4.Q();
                            if (zH3 || objQ12 == fVar5) {
                                final List list8 = list6;
                                final g0.h0 h0Var3 = h0Var;
                                final Context context6 = context4;
                                final f1 f1Var4 = f1Var2;
                                objQ12 = new ej.a() { // from class: mb.u
                                    @Override // ej.a
                                    public final Object a() {
                                        Context context7 = context6;
                                        b bVar5 = bVar4;
                                        String str7 = bVar5.f11439b;
                                        String str8 = bVar5.f11438a;
                                        try {
                                            new File(new File(context7.getFilesDir(), "wallpapers"), str7).delete();
                                        } catch (Throwable th3) {
                                            uk.c.r(th3);
                                        }
                                        fj.l.f(context7, "context");
                                        fj.l.f(str8, "sourceWallpaperId");
                                        LinkedHashMap linkedHashMapN0 = qi.v.n0(a.p(context7));
                                        c cVar7 = (c) linkedHashMapN0.remove(str8);
                                        if (cVar7 != null) {
                                            try {
                                                new File(new File(context7.getFilesDir(), "wallpapers"), cVar7.f11441a).delete();
                                            } catch (Throwable th4) {
                                                uk.c.r(th4);
                                            }
                                            a.q(context7, linkedHashMapN0);
                                        }
                                        a1 a1Var8 = a1Var7;
                                        List list9 = (List) a1Var8.getValue();
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj7 : list9) {
                                            if (!fj.l.b((String) obj7, str7)) {
                                                arrayList7.add(obj7);
                                            }
                                        }
                                        a1Var8.setValue(arrayList7);
                                        context7.getSharedPreferences("home_launcher_wallpaper_collection", 0).edit().putString("user_wallpapers", qi.l.E0((List) a1Var8.getValue(), "\n", null, null, null, 62)).apply();
                                        cVar6.invoke(str8);
                                        a1Var6.setValue(null);
                                        f1Var4.h(0.0f);
                                        qj.b0.w(zVar4, null, new androidx.lifecycle.h0(h0Var3, list8, null, 21), 3);
                                        return pi.o.f13011a;
                                    }
                                };
                                i0Var4.l0(objQ12);
                            }
                            a.a(oVarQ, (ej.a) objQ12, i0Var4, 0);
                            i0Var4.p(false);
                        } else {
                            i0Var4.b0(-1861872883);
                            i0Var4.p(false);
                        }
                        boolean z11 = !list6.isEmpty();
                        boolean zH4 = i0Var4.h(list6) | i0Var4.f(h0Var);
                        Object objQ13 = i0Var4.Q();
                        if (zH4 || objQ13 == fVar5) {
                            objQ13 = new r3(list6, h0Var, a1Var3, 10);
                            i0Var4.l0(objQ13);
                        }
                        ej.a aVar5 = (ej.a) objQ13;
                        d.k kVar = kVarM;
                        boolean zH5 = i0Var4.h(kVar);
                        Object objQ14 = i0Var4.Q();
                        if (zH5 || objQ14 == fVar5) {
                            objQ14 = new a7.e(kVar, 22);
                            i0Var4.l0(objQ14);
                        }
                        a.c(z11, pVarG, aVar5, (ej.a) objQ14, b0.d.q(wVar.b(lVar, gVar5), 0.0f, fB, 1), i0Var4, 0);
                    } else {
                        i0Var4.W();
                    }
                    return pi.o.f13011a;
                }
            };
            i0Var2 = i0Var;
            b0.d.a(i0Var3, null, p1.j.d(-1760233771, fVar, i0Var2), i0Var2, 3078, 6);
            i0Var2.p(true);
            String str6 = (String) a1Var3.getValue();
            if (str6 == null) {
                i0Var2.b0(-133162035);
                i0Var2.p(false);
            } else {
                i0Var2.b0(-133162034);
                Object objQ10 = i0Var2.Q();
                if (objQ10 == obj2) {
                    objQ10 = new b8(a1Var3, 25);
                    i0Var2.l0(objQ10);
                }
                ej.a aVar3 = (ej.a) objQ10;
                boolean zF4 = i0Var2.f(str6) | ((i18 & 896) == 256);
                Object objQ11 = i0Var2.Q();
                if (zF4 || objQ11 == obj2) {
                    objQ11 = new r3(cVar, str6, a1Var3, 11);
                    i0Var2.l0(objQ11);
                }
                e(str6, pVarG, aVar3, (ej.a) objQ11, i0Var, 384);
                i0Var2 = i0Var;
                i0Var2.p(false);
            }
            i0Var2.p(true);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(str, i10, cVar, cVar2, aVar, i11);
        }
    }

    public static final void k(ej.a aVar, i0 i0Var, int i10) {
        a1 a1Var;
        i0 i0Var2 = i0Var;
        i0Var2.c0(-1786205674);
        int i11 = i10 | (i0Var2.h(aVar) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ);
            }
            a1 a1Var2 = (a1) objQ;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarU = b0.d.u(t1.c(1.0f, lVar), 18, 12);
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.g gVar = v1.b.f17550d;
            b0.w wVar = b0.w.f1450a;
            float f10 = 40;
            v1.o oVarK = t1.k(f10, wVar.b(lVar, gVar));
            j0.d dVar2 = j0.e.f8605a;
            v1.o oVarL = v.n.l(z1.h.c(oVarK, dVar2), false, null, aVar, 15);
            v1.g gVar2 = v1.b.f17551e;
            q0 q0VarD2 = b0.r.d(gVar2, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarL);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q0VarD2);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC2);
            float f11 = 21;
            a2.b(u2.b.h(), "Back", t1.k(f11, lVar), e0.d(4279309080L), i0Var2, 3504, 0);
            i0Var2.p(true);
            v7.a("COLLECTIONS", wVar.b(lVar, gVar2), e0.d(4279309080L), hj.a.x(18), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262056);
            i0Var2 = i0Var2;
            v1.o oVarC3 = z1.h.c(t1.k(f10, wVar.b(lVar, v1.b.f17552f)), dVar2);
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                a1Var = a1Var2;
                objQ2 = new b8(a1Var, 22);
                i0Var2.l0(objQ2);
            } else {
                a1Var = a1Var2;
            }
            v1.o oVarL2 = v.n.l(oVarC3, false, null, (ej.a) objQ2, 15);
            q0 q0VarD3 = b0.r.d(gVar2, false);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            v1.o oVarC4 = v1.a.c(i0Var2, oVarL2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q0VarD3);
            f1.s.M(eVar2, i0Var2, n1VarL3);
            gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC4);
            i2.f fVarB = u1.d.f16569c;
            if (fVarB == null) {
                i2.e eVar5 = new i2.e("Outlined.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = h0.f8270a;
                z0 z0Var = new z0(w.f3052b);
                d8.e eVar6 = new d8.e(9);
                eVar6.x(6.0f, 13.0f);
                eVar6.o(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
                eVar6.v(6.34f, 7.34f);
                eVar6.n(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
                eVar6.o(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
                eVar6.H(-2.02f);
                eVar6.n(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
                eVar6.k();
                eVar6.x(20.0f, 13.0f);
                eVar6.o(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                eVar6.o(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
                eVar6.w(1.09f, -1.09f);
                eVar6.v(11.5f, 2.5f);
                eVar6.v(8.0f, 6.0f);
                eVar6.w(3.5f, 3.5f);
                eVar6.w(1.41f, -1.41f);
                eVar6.w(-1.08f, -1.08f);
                eVar6.n(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
                eVar6.o(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
                eVar6.o(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
                eVar6.H(2.02f);
                eVar6.n(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
                eVar6.k();
                i2.e.a(eVar5, (ArrayList) eVar6.f5001a, z0Var);
                fVarB = eVar5.b();
                u1.d.f16569c = fVarB;
            }
            a2.b(fVarB, "Reset", t1.k(f11, lVar), e0.d(4292030255L), i0Var2, 3504, 0);
            int i13 = 1;
            i0Var2.p(true);
            i0Var2.p(true);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                i0Var2.b0(1793144153);
                Object objQ3 = i0Var2.Q();
                if (objQ3 == fVar) {
                    objQ3 = new b8(a1Var, 23);
                    i0Var2.l0(objQ3);
                }
                z4.a((ej.a) objQ3, p1.j.d(-2130208791, new lb.f2(context, a1Var, i13), i0Var2), null, p1.j.d(1378760615, new lb.o(a1Var, 3), i0Var2), f11436c, f11437d, null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var, 1772598, 0, 16276);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                i0Var2.b0(1793900460);
                i0Var2.p(false);
            }
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new cb.b(i10, 4, aVar);
        }
    }

    public static Bitmap l(Context context, Bitmap bitmap) throws IOException {
        fj.l.f(context, "context");
        fj.l.f(bitmap, "src");
        Bitmap bitmapM = m(bitmap, 24);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), "blurred_wallpaper_cache.jpg"));
            try {
                bitmapM.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
                return bitmapM;
            } finally {
            }
        } catch (Exception unused) {
            return bitmapM;
        }
    }

    public static Bitmap m(Bitmap bitmap, int i10) {
        fj.l.f(bitmap, "src");
        int i11 = 1;
        int i12 = i10 < 1 ? 1 : i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i13 = 0;
        while (i13 < 3) {
            int i14 = 0;
            while (true) {
                int i15 = -16777216;
                if (i14 >= height) {
                    break;
                }
                int i16 = -i12;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                if (i16 <= i12) {
                    while (true) {
                        int i21 = iArr[cg.b.p(i16, 0, width - 1) + (i14 * width)];
                        i17 += (i21 >> 16) & 255;
                        i18 += (i21 >> 8) & 255;
                        i19 += i21 & 255;
                        i20 += i11;
                        if (i16 == i12) {
                            break;
                        }
                        i16++;
                    }
                }
                int i22 = 0;
                while (i22 < width) {
                    int i23 = i14 * width;
                    iArr[i23 + i22] = ((i17 / i20) << 16) | i15 | ((i18 / i20) << 8) | (i19 / i20);
                    int i24 = i11;
                    int i25 = width - 1;
                    int iP = cg.b.p(i22 - i12, 0, i25);
                    int i26 = i15;
                    int iP2 = cg.b.p(i22 + i12 + 1, 0, i25);
                    int i27 = iArr[iP + i23];
                    int i28 = iArr[i23 + iP2];
                    i17 += ((i28 >> 16) & 255) - ((i27 >> 16) & 255);
                    i18 += ((i28 >> 8) & 255) - ((i27 >> 8) & 255);
                    i19 += (i28 & 255) - (i27 & 255);
                    i22++;
                    i15 = i26;
                    i11 = i24;
                }
                i14++;
            }
            int i29 = i11;
            for (int i30 = 0; i30 < width; i30++) {
                int i31 = -i12;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                if (i31 <= i12) {
                    while (true) {
                        int i36 = iArr[(cg.b.p(i31, 0, height - 1) * width) + i30];
                        i32 += (i36 >> 16) & 255;
                        i33 += (i36 >> 8) & 255;
                        i34 += i36 & 255;
                        i35++;
                        if (i31 == i12) {
                            break;
                        }
                        i31++;
                    }
                }
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[(i37 * width) + i30] = ((i32 / i35) << 16) | (-16777216) | ((i33 / i35) << 8) | (i34 / i35);
                    int i38 = height - 1;
                    int iP3 = cg.b.p(i37 - i12, 0, i38);
                    int iP4 = cg.b.p(i37 + i12 + 1, 0, i38);
                    int i39 = iArr[(iP3 * width) + i30];
                    int i40 = iArr[(iP4 * width) + i30];
                    i32 += ((i40 >> 16) & 255) - ((i39 >> 16) & 255);
                    i33 += ((i40 >> 8) & 255) - ((i39 >> 8) & 255);
                    i34 += (i40 & 255) - (i39 & 255);
                }
            }
            i13++;
            i11 = i29;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        fj.l.e(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public static final Bitmap n(Context context, String str) {
        Object objR;
        Object objR2;
        fj.l.f(str, "<this>");
        if (nj.l.A0(str, "user:")) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(new File(context.getFilesDir(), "wallpapers"), nj.e.R0(str, "user:")));
                try {
                    objR2 = BitmapFactory.decodeStream(fileInputStream);
                    fileInputStream.close();
                } finally {
                }
            } catch (Throwable th2) {
                objR2 = uk.c.r(th2);
            }
            return (Bitmap) (objR2 instanceof pi.j ? null : objR2);
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("wallpapers/".concat(str));
            try {
                objR = BitmapFactory.decodeStream(inputStreamOpen);
                u6.v.n(inputStreamOpen, null);
            } finally {
            }
        } catch (Throwable th3) {
            objR = uk.c.r(th3);
        }
        return (Bitmap) (objR instanceof pi.j ? null : objR);
    }

    public static final c o(Context context, String str) {
        fj.l.f(context, "context");
        return (c) p(context).get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map p(android.content.Context r12) {
        /*
            java.lang.String r0 = "home_launcher_wallpaper_collection"
            r1 = 0
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r0, r1)
            java.lang.String r0 = "wallpaper_customizations"
            r2 = 0
            java.lang.String r12 = r12.getString(r0, r2)
            if (r12 == 0) goto Le1
            java.util.List r12 = nj.e.N0(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L1d:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r12.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1
            char[] r5 = new char[r4]
            r6 = 9
            r5[r1] = r6
            java.util.List r3 = nj.e.U0(r3, r5)
            int r5 = r3.size()
            r6 = 2
            if (r5 < r6) goto Ld4
            java.lang.Object r5 = r3.get(r1)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = nj.e.K0(r5)
            if (r5 != 0) goto Ld4
            java.lang.Object r5 = r3.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = nj.e.K0(r5)
            if (r5 != 0) goto Ld4
            java.lang.Object r5 = r3.get(r1)
            mb.c r7 = new mb.c
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = qi.l.B0(r6, r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L7e
            boolean r8 = nj.k.v0(r6)     // Catch: java.lang.NumberFormatException -> L76
            if (r8 == 0) goto L76
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.NumberFormatException -> L76
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.NumberFormatException -> L76
            goto L77
        L76:
            r6 = r2
        L77:
            if (r6 == 0) goto L7e
            float r6 = r6.floatValue()
            goto L7f
        L7e:
            r6 = 0
        L7f:
            r8 = 3
            java.lang.Object r8 = qi.l.B0(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "false"
            java.lang.String r10 = "true"
            if (r8 == 0) goto La6
            boolean r11 = r8.equals(r10)
            if (r11 == 0) goto L95
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L9f
        L95:
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L9e
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L9f
        L9e:
            r8 = r2
        L9f:
            if (r8 == 0) goto La6
            boolean r8 = r8.booleanValue()
            goto La7
        La6:
            r8 = r1
        La7:
            r11 = 4
            java.lang.Object r3 = qi.l.B0(r11, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lca
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto Lb9
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto Lc3
        Lb9:
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto Lc2
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto Lc3
        Lc2:
            r3 = r2
        Lc3:
            if (r3 == 0) goto Lca
            boolean r3 = r3.booleanValue()
            goto Lcb
        Lca:
            r3 = r1
        Lcb:
            r7.<init>(r4, r6, r8, r3)
            pi.h r3 = new pi.h
            r3.<init>(r5, r7)
            goto Ld5
        Ld4:
            r3 = r2
        Ld5:
            if (r3 == 0) goto L1d
            r0.add(r3)
            goto L1d
        Ldc:
            java.util.Map r12 = qi.v.l0(r0)
            return r12
        Le1:
            qi.t r12 = qi.t.f13521a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.p(android.content.Context):java.util.Map");
    }

    public static final void q(Context context, Map map) {
        context.getSharedPreferences("home_launcher_wallpaper_collection", 0).edit().putString("wallpaper_customizations", qi.l.E0(map.entrySet(), "\n", null, null, new la.a(13), 30)).apply();
    }

    public static final pi.h r(i0 i0Var) {
        Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
        Object objQ = i0Var.Q();
        f1.f fVar = f1.m.f6385a;
        if (objQ == fVar) {
            objQ = y8.f.a(0.0f, i0Var);
        }
        f1 f1Var = (f1) objQ;
        Object objQ2 = i0Var.Q();
        if (objQ2 == fVar) {
            objQ2 = y8.f.a(0.0f, i0Var);
        }
        f1 f1Var2 = (f1) objQ2;
        boolean zH = i0Var.h(context) | i0Var.c(18.0f);
        Object objQ3 = i0Var.Q();
        if (zH || objQ3 == fVar) {
            objQ3 = new ab.m(context, f1Var, f1Var2, 13);
            i0Var.l0(objQ3);
        }
        f1.s.c(context, (ej.c) objQ3, i0Var);
        return new pi.h(Float.valueOf(f1Var.g()), Float.valueOf(f1Var2.g()));
    }
}
