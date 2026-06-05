package lb;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.i5;
import c1.v7;
import c1.z4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10431a = c2.e0.d(4294111991L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f10432b = c2.e0.d(4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f10433c = c2.e0.d(4278190080L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f10434d = c2.e0.d(4287532691L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f10435e = c2.e0.d(4278221567L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f10436f = c2.e0.d(4293256682L);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10437g = 0;

    public static final void a(p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(1294372808);
        if (i0Var.T(i10 & 1, (i10 & 3) != 2)) {
            float f10 = 16;
            v1.o oVarF = v.n.f(z1.h.c(b0.d.v(v1.l.f17564b, f10, 0.0f, 2), j0.e.a(f10)), f10432b, c2.e0.f2986b);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            eVar.invoke(i0Var, 6);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.d(eVar, i10, 3);
        }
    }

    public static final void b(int i10, f1.i0 i0Var) {
        f1.i0 i0Var2;
        i0Var.c0(1493046188);
        if (i0Var.T(i10 & 1, i10 != 0)) {
            i0Var2 = i0Var;
            z4.d(b0.d.v(v1.l.f17564b, 16, 0.0f, 2), (float) 0.5d, f10436f, i0Var2, 438);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(i10, 4);
        }
    }

    public static final void c(String str, ej.a aVar, f1.i0 i0Var, int i10, int i11) {
        ej.a aVar2;
        int i12;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(624257909);
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 = i10 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i12 = i10 | (i0Var2.h(aVar2) ? 32 : 16);
        }
        if (i0Var2.T(i12 & 1, (i12 & 19) != 18)) {
            ej.a aVar3 = i13 != 0 ? null : aVar2;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, lVar), 28, 6);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            long jX = hj.a.x(12);
            k3.s sVar = k3.s.f9400z;
            v7.a(str, null, f10434d, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
            i0Var2 = i0Var2;
            if (aVar3 != null) {
                i0Var2.b0(-982432887);
                long jX2 = hj.a.x(13);
                Object objQ = i0Var2.Q();
                if (objQ == f1.m.f6385a) {
                    objQ = t.m1.p(i0Var2);
                }
                v7.a("Reset", v.n.k(lVar, (z.k) objQ, null, false, null, aVar3, 28), f10435e, jX2, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262056);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                i0Var2.b0(-982046255);
                i0Var2.p(false);
            }
            i0Var2.p(true);
            aVar2 = aVar3;
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(str, aVar2, i10, i11);
        }
    }

    public static final void d(final String str, final String str2, final ej.a aVar, final ej.c cVar, final kj.d dVar, final float f10, final ej.a aVar2, f1.i0 i0Var, final int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(1054326698);
        int i11 = i10 | (i0Var2.f(str2) ? 32 : 16) | (i0Var2.f(dVar) ? 16384 : 8192) | (i0Var2.h(aVar2) ? 1048576 : 524288);
        if (i0Var2.T(i11 & 1, (i11 & 599187) != 599186)) {
            v1.l lVar = v1.l.f17564b;
            v1.o oVarU = b0.d.u(lVar, 16, 12);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
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
            v2.d dVar2 = v2.g.f17651h;
            f1.s.I(dVar2, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.o oVarC2 = b0.t1.c(1.0f, lVar);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL2 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarC2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q1VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar2);
            f1.s.M(eVar4, i0Var2, oVarC3);
            v7.a(str, null, f10433c, hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262122);
            v7.a(str2, null, f10434d, hj.a.x(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, ((i11 >> 3) & 14) | 24960, 0, 262122);
            i0Var2 = i0Var;
            i0Var2.p(true);
            b0.d.e(i0Var2, b0.t1.e(8, lVar));
            Object objQ = i0Var2.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new la.a(1);
                i0Var2.l0(objQ);
            }
            mk.b.b(aVar, cVar, dVar, f10, gi.f.b((ej.c) objQ, i0Var2), null, null, aVar2, i0Var2, ((i11 >> 6) & 8190) | (29360128 & (i11 << 3)), 96);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(str, str2, aVar, cVar, dVar, f10, aVar2, i10) { // from class: lb.c0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f10187a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f10188b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.a f10189c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ej.c f10190d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ kj.d f10191e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f10192f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ ej.a f10193z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(200071);
                    l0.d(this.f10187a, this.f10188b, this.f10189c, this.f10190d, this.f10191e, this.f10192f, this.f10193z, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(g gVar, ej.a aVar, f1.i0 i0Var, int i10) {
        g gVar2;
        float f10;
        f1.a1 a1Var;
        int i11;
        String str;
        SharedPreferences sharedPreferences = gVar.f10289a;
        i0Var.c0(-1589355441);
        int i12 = i10 | (i0Var.h(gVar) ? 4 : 2) | (i0Var.h(aVar) ? 32 : 16);
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = f1.s.o(i0Var);
                i0Var.l0(objQ);
            }
            qj.z zVar = (qj.z) objQ;
            f1.a1 a1VarM = f1.s.m(nb.o.f12034i, i0Var);
            f1.a1 a1VarM2 = f1.s.m(nb.o.f12032g, i0Var);
            f1.a1 a1VarM3 = f1.s.m(nb.o.f12049y, i0Var);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ2);
            }
            f1.a1 a1Var2 = (f1.a1) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj) {
                objQ3 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ3);
            }
            f1.a1 a1Var3 = (f1.a1) objQ3;
            Object objQ4 = i0Var.Q();
            String str2 = null;
            if (objQ4 == obj) {
                objQ4 = f1.s.A(null);
                i0Var.l0(objQ4);
            }
            f1.a1 a1Var4 = (f1.a1) objQ4;
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj) {
                objQ5 = f1.s.A(Boolean.valueOf(gVar.g()));
                i0Var.l0(objQ5);
            }
            f1.a1 a1Var5 = (f1.a1) objQ5;
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj) {
                objQ6 = y8.f.a(gVar.d(), i0Var);
            }
            f1.f1 f1Var = (f1.f1) objQ6;
            Object objQ7 = i0Var.Q();
            if (objQ7 == obj) {
                objQ7 = y8.f.a(gVar.b(), i0Var);
            }
            f1.f1 f1Var2 = (f1.f1) objQ7;
            Object objQ8 = i0Var.Q();
            if (objQ8 == obj) {
                objQ8 = y8.f.a(gVar.j(), i0Var);
            }
            f1.f1 f1Var3 = (f1.f1) objQ8;
            Object objQ9 = i0Var.Q();
            if (objQ9 == obj) {
                objQ9 = y8.f.a(gVar.i(), i0Var);
            }
            f1.f1 f1Var4 = (f1.f1) objQ9;
            Object objQ10 = i0Var.Q();
            if (objQ10 == obj) {
                objQ10 = y8.f.a(gVar.c(), i0Var);
            }
            f1.f1 f1Var5 = (f1.f1) objQ10;
            Object objQ11 = i0Var.Q();
            if (objQ11 == obj) {
                objQ11 = y8.f.a(sharedPreferences.getFloat("liquid_glass_fill_opacity", 0.2f), i0Var);
            }
            f1.f1 f1Var6 = (f1.f1) objQ11;
            Object objQ12 = i0Var.Q();
            if (objQ12 == obj) {
                objQ12 = y8.f.a(gVar.e(), i0Var);
            }
            f1.f1 f1Var7 = (f1.f1) objQ12;
            Object objQ13 = i0Var.Q();
            if (objQ13 == obj) {
                objQ13 = f1.s.A(Boolean.valueOf(gVar.h()));
                i0Var.l0(objQ13);
            }
            f1.a1 a1Var6 = (f1.a1) objQ13;
            Object objQ14 = i0Var.Q();
            if (objQ14 == obj) {
                objQ14 = f1.s.A(Boolean.valueOf(gVar.k()));
                i0Var.l0(objQ14);
            }
            f1.a1 a1Var7 = (f1.a1) objQ14;
            boolean zO = gVar.o();
            float f11 = sharedPreferences.getFloat("icon_highlight_angle", 45.0f);
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                i0Var.b0(-766153421);
                ig.l lVar = (ig.l) a1VarM2.getValue();
                if (lVar == null || (str = ((jg.d) lVar).f8873b.f8924e) == null) {
                    nb.b bVar = (nb.b) a1VarM3.getValue();
                    if (bVar != null) {
                        str2 = bVar.f11976b;
                    }
                } else {
                    str2 = str;
                }
                boolean zBooleanValue = ((Boolean) a1VarM.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) a1Var3.getValue()).booleanValue();
                String str3 = (String) a1Var4.getValue();
                boolean zH = i0Var.h(zVar) | i0Var.h(context);
                Object objQ15 = i0Var.Q();
                if (zH || objQ15 == obj) {
                    Object f0Var = new f0(zVar, a1Var3, a1Var4, context, a1Var2);
                    a1Var = a1Var2;
                    i0Var.l0(f0Var);
                    objQ15 = f0Var;
                } else {
                    a1Var = a1Var2;
                }
                ej.a aVar2 = (ej.a) objQ15;
                boolean zH2 = i0Var.h(zVar);
                Object objQ16 = i0Var.Q();
                if (zH2 || objQ16 == obj) {
                    objQ16 = new g0(zVar, 0);
                    i0Var.l0(objQ16);
                }
                ej.a aVar3 = (ej.a) objQ16;
                Object objQ17 = i0Var.Q();
                if (objQ17 == obj) {
                    objQ17 = new jb.a(a1Var4, a1Var, 1);
                    i0Var.l0(objQ17);
                }
                f10 = f11;
                i11 = 0;
                nb.e.a(str2, zBooleanValue, null, zBooleanValue2, str3, aVar2, null, null, null, aVar3, (ej.a) objQ17, i0Var, 0, 452);
                i0Var.p(false);
            } else {
                f10 = f11;
                a1Var = a1Var2;
                i11 = 0;
                i0Var.b0(-765077101);
                i0Var.p(false);
            }
            gVar2 = gVar;
            i5.a(null, null, null, null, null, 0, f10431a, 0L, b0.d.f(i11, 14), p1.j.d(408630366, new h0(a1Var7, a1Var6, aVar, gVar, zO, f10, a1VarM, a1Var5, f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var7, f1Var6, a1Var), i0Var), i0Var, 806879232, 191);
        } else {
            gVar2 = gVar;
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i0(gVar2, aVar, i10, 0);
        }
    }

    public static final void f(f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, g gVar) {
        gVar.y(g(a1Var));
        gVar.w(f1Var.g());
        gVar.u(f1Var2.g());
        gVar.A(f1Var3.g());
        gVar.z(f1Var4.g());
        gVar.v(f1Var5.g());
        float fG = f1Var6.g();
        SharedPreferences sharedPreferences = gVar.f10289a;
        sharedPreferences.edit().putFloat("liquid_glass_fill_opacity", fG).apply();
        gVar.x(f1Var7.g());
        sharedPreferences.edit().putBoolean("dock_no_glass_thumb", ((Boolean) a1Var2.getValue()).booleanValue()).apply();
        gVar.B(((Boolean) a1Var3.getValue()).booleanValue());
    }

    public static final boolean g(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }
}
