package lb;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.b8;
import c1.v7;
import c1.z4;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10604a = c2.e0.d(4294967295L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f10605b = c2.e0.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f10606c = c2.e0.d(4287532691L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f10607d = c2.e0.d(4278221567L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f10608e = c2.e0.d(4291282892L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f10609f = c2.e0.d(4293256682L);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10610g = 0;

    public static final void a(ej.a aVar, final g gVar, mi.p pVar, boolean z2, ej.c cVar, final ej.a aVar2, f1.i0 i0Var, int i10) {
        f1.a1 a1Var;
        f1.i0 i0Var2 = i0Var;
        fj.l.f(aVar, "onDismiss");
        SharedPreferences sharedPreferences = gVar.f10289a;
        i0Var2.c0(-512119436);
        int i11 = i10 | (i0Var2.h(gVar) ? 32 : 16) | (i0Var2.f(pVar) ? 256 : 128);
        if (i0Var2.T(i11 & 1, (65683 & i11) != 65682)) {
            final Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ);
            }
            final f1.a1 a1Var2 = (f1.a1) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = f1.s.A(Boolean.valueOf(sharedPreferences.getBoolean("dont_show_text", false)));
                i0Var2.l0(objQ2);
            }
            final f1.a1 a1Var3 = (f1.a1) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == fVar) {
                objQ3 = f1.s.A(Boolean.valueOf(sharedPreferences.getBoolean("fill_cells_of_uninstalled_apps", true)));
                i0Var2.l0(objQ3);
            }
            final f1.a1 a1Var4 = (f1.a1) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == fVar) {
                objQ4 = f1.s.A(Boolean.valueOf(sharedPreferences.getBoolean("lock_home_screen_layout", false)));
                i0Var2.l0(objQ4);
            }
            final f1.a1 a1Var5 = (f1.a1) objQ4;
            Object objQ5 = i0Var2.Q();
            if (objQ5 == fVar) {
                f1.g1 g1Var = new f1.g1(sharedPreferences.getInt("beyond_viewport_pages", 3));
                i0Var2.l0(g1Var);
                objQ5 = g1Var;
            }
            final f1.g1 g1Var2 = (f1.g1) objQ5;
            Object objQ6 = i0Var2.Q();
            if (objQ6 == fVar) {
                objQ6 = Integer.valueOf(sharedPreferences.getInt("beyond_viewport_pages", 3));
                i0Var2.l0(objQ6);
            }
            int iIntValue = ((Number) objQ6).intValue();
            boolean z10 = g1Var2.g() != iIntValue;
            Object objQ7 = i0Var2.Q();
            if (objQ7 == fVar) {
                objQ7 = new b8(a1Var2, 8);
                i0Var2.l0(objQ7);
            }
            final boolean z11 = z10;
            c.b(pVar, aVar, z11, (ej.a) objQ7, false, 0.0f, 0L, false, false, 0.0f, null, null, false, false, 8, p1.j.d(1589495611, new ej.h() { // from class: lb.n
                @Override // ej.h
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ej.a aVar3;
                    f1.a1 a1Var6;
                    f1.a1 a1Var7;
                    f1.a1 a1Var8;
                    f1.g1 g1Var3;
                    final ej.a aVar4 = (ej.a) obj2;
                    f1.i0 i0Var3 = (f1.i0) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    fj.l.f(aVar4, "requestDismiss");
                    fj.l.f((ej.c) obj3, "$unused$var$");
                    b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var3, 0);
                    int iHashCode = Long.hashCode(i0Var3.T);
                    f1.n1 n1VarL = i0Var3.l();
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarC = v1.a.c(i0Var3, lVar);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar2);
                    } else {
                        i0Var3.o0();
                    }
                    v2.e eVar = v2.g.f17649f;
                    f1.s.M(eVar, i0Var3, b0VarA);
                    v2.e eVar2 = v2.g.f17648e;
                    f1.s.M(eVar2, i0Var3, n1VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    v2.e eVar3 = v2.g.f17650g;
                    f1.s.w(i0Var3, numValueOf, eVar3);
                    v2.d dVar = v2.g.f17651h;
                    f1.s.I(dVar, i0Var3);
                    v2.e eVar4 = v2.g.f17647d;
                    f1.s.M(eVar4, i0Var3, oVarC);
                    float f10 = 16;
                    v1.o oVarX = b0.d.x(b0.d.v(b0.t1.c(1.0f, lVar), 24, 0.0f, 2), 0.0f, f10, 0.0f, 20, 5);
                    t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
                    int iHashCode2 = Long.hashCode(i0Var3.T);
                    f1.n1 n1VarL2 = i0Var3.l();
                    v1.o oVarC2 = v1.a.c(i0Var3, oVarX);
                    i0Var3.e0();
                    if (i0Var3.S) {
                        i0Var3.k(fVar2);
                    } else {
                        i0Var3.o0();
                    }
                    f1.s.M(eVar, i0Var3, q0VarD);
                    f1.s.M(eVar2, i0Var3, n1VarL2);
                    gk.b.u(iHashCode2, i0Var3, eVar3, i0Var3, dVar);
                    f1.s.M(eVar4, i0Var3, oVarC2);
                    i2.f fVarP = u1.b.p();
                    long jC = c2.w.c(c2.e0.d(4282137667L), 0.6f);
                    v1.g gVar2 = v1.b.f17550d;
                    b0.w wVar = b0.w.f1450a;
                    v1.o oVarK = b0.t1.k(28, wVar.b(lVar, gVar2));
                    Object objQ8 = i0Var3.Q();
                    Object obj6 = f1.m.f6385a;
                    if (objQ8 == obj6) {
                        objQ8 = t.m1.p(i0Var3);
                    }
                    z.k kVar = (z.k) objQ8;
                    final g gVar3 = gVar;
                    boolean zH = i0Var3.h(gVar3);
                    final boolean z12 = z11;
                    boolean zG = ((((iIntValue2 & 112) ^ 48) > 32 && i0Var3.f(aVar4)) || (iIntValue2 & 48) == 32) | zH | i0Var3.g(z12);
                    Object objQ9 = i0Var3.Q();
                    final f1.a1 a1Var9 = a1Var3;
                    final f1.a1 a1Var10 = a1Var4;
                    final f1.a1 a1Var11 = a1Var5;
                    final f1.g1 g1Var4 = g1Var2;
                    if (zG || objQ9 == obj6) {
                        final f1.a1 a1Var12 = a1Var2;
                        ej.a aVar5 = new ej.a() { // from class: lb.q
                            @Override // ej.a
                            public final Object a() {
                                boolean zBooleanValue = ((Boolean) a1Var9.getValue()).booleanValue();
                                g gVar4 = gVar3;
                                SharedPreferences sharedPreferences2 = gVar4.f10289a;
                                sharedPreferences2.edit().putBoolean("dont_show_text", zBooleanValue).apply();
                                sharedPreferences2.edit().putBoolean("fill_cells_of_uninstalled_apps", ((Boolean) a1Var10.getValue()).booleanValue()).apply();
                                sharedPreferences2.edit().putBoolean("lock_home_screen_layout", ((Boolean) a1Var11.getValue()).booleanValue()).apply();
                                gVar4.t(g1Var4.g());
                                if (z12) {
                                    a1Var12.setValue(Boolean.TRUE);
                                } else {
                                    aVar4.a();
                                }
                                return pi.o.f13011a;
                            }
                        };
                        aVar3 = aVar4;
                        a1Var6 = a1Var9;
                        a1Var7 = a1Var10;
                        a1Var8 = a1Var11;
                        g1Var3 = g1Var4;
                        i0Var3.l0(aVar5);
                        objQ9 = aVar5;
                    } else {
                        aVar3 = aVar4;
                        a1Var8 = a1Var11;
                        g1Var3 = g1Var4;
                        a1Var7 = a1Var10;
                        a1Var6 = a1Var9;
                    }
                    c1.a2.b(fVarP, "Close", v.n.k(oVarK, kVar, null, false, null, (ej.a) objQ9, 28), jC, i0Var3, 3120, 0);
                    v7.a("Home screen settings", wVar.b(lVar, v1.b.f17551e), r.f10605b, hj.a.x(20), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1597830, 0, 262056);
                    i0Var3.p(true);
                    v1.o oVarV = b0.d.v(lVar, f10, 0.0f, 2);
                    final f1.a1 a1Var13 = a1Var6;
                    final f1.a1 a1Var14 = a1Var7;
                    final f1.a1 a1Var15 = a1Var8;
                    final f1.g1 g1Var5 = g1Var3;
                    r.b(oVarV, p1.j.d(-2051285068, new h(gVar3, aVar3, aVar2, a1Var13, a1Var14, a1Var15, g1Var5), i0Var3), i0Var3, 54);
                    b0.d.e(i0Var3, b0.t1.e(12, lVar));
                    v1.o oVarV2 = b0.d.v(lVar, f10, 0.0f, 2);
                    final Context context2 = context;
                    r.b(oVarV2, p1.j.d(1547135901, new ej.f() { // from class: lb.i
                        @Override // ej.f
                        public final Object c(Object obj7, Object obj8, Object obj9) {
                            f1.i0 i0Var4 = (f1.i0) obj8;
                            int iIntValue3 = ((Integer) obj9).intValue();
                            fj.l.f((b0.c0) obj7, "$this$SettingsCard");
                            if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                f1.g1 g1Var6 = g1Var5;
                                String strG = r.g(g1Var6.g());
                                Object objQ10 = i0Var4.Q();
                                f1.f fVar3 = f1.m.f6385a;
                                if (objQ10 == fVar3) {
                                    objQ10 = t.m1.p(i0Var4);
                                }
                                z.k kVar2 = (z.k) objQ10;
                                Object objQ11 = i0Var4.Q();
                                if (objQ11 == fVar3) {
                                    objQ11 = new gb.n(1, g1Var6);
                                    i0Var4.l0(objQ11);
                                }
                                r.f("Beyond viewport pages", strG, v.n.k(v1.l.f17564b, kVar2, null, false, null, (ej.a) objQ11, 28), i0Var4, 6);
                                r.c(0, i0Var4);
                                long j = r.f10607d;
                                g gVar4 = gVar3;
                                boolean zH2 = i0Var4.h(gVar4);
                                Context context3 = context2;
                                boolean zH3 = zH2 | i0Var4.h(context3);
                                Object objQ12 = i0Var4.Q();
                                if (zH3 || objQ12 == fVar3) {
                                    k kVar3 = new k(gVar4, context3, a1Var13, a1Var14, a1Var15, g1Var6, 0);
                                    i0Var4.l0(kVar3);
                                    objQ12 = kVar3;
                                }
                                r.d("More settings", j, (ej.a) objQ12, i0Var4, 54, 0);
                            } else {
                                i0Var4.W();
                            }
                            return pi.o.f13011a;
                        }
                    }, i0Var3), i0Var3, 54);
                    i0Var3.p(true);
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var, ((i11 >> 6) & 14) | 3120, 1769472, 32752);
            i0Var2 = i0Var;
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                i0Var2.b0(-820282804);
                Object objQ8 = i0Var2.Q();
                if (objQ8 == fVar) {
                    a1Var = a1Var2;
                    objQ8 = new b8(a1Var, 9);
                    i0Var2.l0(objQ8);
                } else {
                    a1Var = a1Var2;
                }
                z4.a((ej.a) objQ8, p1.j.d(897735303, new bb.c(gVar, context, g1Var2, a1Var), i0Var2), null, p1.j.d(1788809925, new o(a1Var, 0), i0Var2), c.f10166c, p1.j.d(-1169545438, new d0.i(iIntValue, g1Var2), i0Var2), null, 0L, 0L, 0L, 0L, 0.0f, null, i0Var, 1772598, 0, 16276);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                i0Var2.b0(-818558770);
                i0Var2.p(false);
            }
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p(aVar, gVar, pVar, z2, cVar, aVar2, i10);
        }
    }

    public static final void b(v1.o oVar, p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(-1036269273);
        if (i0Var.T(i10 & 1, (i10 & 19) != 18)) {
            v1.o oVarF = v.n.f(y8.f.c(16, b0.t1.c(1.0f, oVar)), f10604a, c2.e0.f2986b);
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
            eVar.c(b0.c0.f1285a, i0Var, 54);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new l(oVar, eVar, i10, 0);
        }
    }

    public static final void c(int i10, f1.i0 i0Var) {
        f1.i0 i0Var2;
        i0Var.c0(-333687547);
        if (i0Var.T(i10 & 1, i10 != 0)) {
            i0Var2 = i0Var;
            z4.d(b0.d.x(v1.l.f17564b, 16, 0.0f, 0.0f, 0.0f, 14), (float) 0.5d, f10609f, i0Var2, 438);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(i10, 3);
        }
    }

    public static final void d(final String str, long j, ej.a aVar, f1.i0 i0Var, final int i10, final int i11) {
        long j4;
        int i12;
        ej.a aVar2;
        int i13;
        final long j10;
        final ej.a aVar3;
        ej.a aVar4;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-1256936919);
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i10 | 48;
            j4 = j;
        } else if ((i10 & 48) == 0) {
            j4 = j;
            i12 = i10 | (i0Var2.e(j4) ? 32 : 16);
        } else {
            j4 = j;
            i12 = i10;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i13 = i12 | 384;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i13 = i12 | (i0Var2.h(aVar2) ? 256 : 128);
        }
        if (i0Var2.T(i13 & 1, (i13 & 147) != 146)) {
            if (i14 != 0) {
                j4 = f10605b;
            }
            f1.f fVar = f1.m.f6385a;
            if (i15 != 0) {
                Object objQ = i0Var2.Q();
                if (objQ == fVar) {
                    objQ = new jb.e(12);
                    i0Var2.l0(objQ);
                }
                aVar4 = (ej.a) objQ;
            } else {
                aVar4 = aVar2;
            }
            v1.f fVar2 = v1.b.D;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = b0.t1.c(1.0f, lVar);
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = t.m1.p(i0Var2);
            }
            ej.a aVar5 = aVar4;
            v1.o oVarU = b0.d.u(v.n.k(oVarC, (z.k) objQ2, null, false, null, aVar4, 28), 16, 14);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, fVar2, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar3 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar3);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            long jX = hj.a.x(16);
            k3.s sVar = k3.s.f9399f;
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            v7.a(str, new b0.y0(1.0f, true), j4, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597446 | ((i13 << 3) & 896), 0, 262056);
            i0Var2 = i0Var;
            c1.a2.b(u0.l.h(), null, b0.t1.k(20, lVar), f10608e, i0Var2, 3504, 0);
            i0Var2.p(true);
            j10 = j4;
            aVar3 = aVar5;
        } else {
            i0Var2.W();
            j10 = j4;
            aVar3 = aVar2;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: lb.m
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r.d(str, j10, aVar3, (f1.i0) obj, f1.s.O(i10 | 1), i11);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(String str, boolean z2, ej.c cVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-1946283136);
        int i11 = i10 | (i0Var2.g(z2) ? 32 : 16);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            v1.f fVar = v1.b.D;
            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, v1.l.f17564b), 16, 14);
            b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, fVar, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            long jX = hj.a.x(16);
            k3.s sVar = k3.s.f9399f;
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            v7.a(str, new b0.y0(1.0f, true), f10605b, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262056);
            i0Var2 = i0Var;
            sa.l0.a(z2, cVar, null, false, i0Var2, (i11 >> 3) & 126, 12);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new cb.j(str, z2, cVar, i10, 1);
        }
    }

    public static final void f(String str, String str2, v1.o oVar, f1.i0 i0Var, int i10) {
        String str3;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(261058010);
        int i11 = i10 | (i0Var2.f(str2) ? 32 : 16) | (i0Var2.f(oVar) ? 256 : 128);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            v1.f fVar = v1.b.D;
            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, oVar), 16, 14);
            b0.c cVar = b0.j.f1359a;
            b0.q1 q1VarA = b0.o1.a(cVar, fVar, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
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
            f1.s.M(eVar, i0Var2, q1VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            long jX = hj.a.x(16);
            k3.s sVar = k3.s.f9399f;
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            v7.a(str, new b0.y0(1.0f, true), f10605b, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262056);
            b0.q1 q1VarA2 = b0.o1.a(cVar, fVar, i0Var, 48);
            int iHashCode2 = Long.hashCode(i0Var.T);
            f1.n1 n1VarL2 = i0Var.l();
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC2 = v1.a.c(i0Var, lVar);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar, i0Var, q1VarA2);
            f1.s.M(eVar2, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar3, i0Var, dVar);
            f1.s.M(eVar4, i0Var, oVarC2);
            v7.a(str2, null, f10606c, hj.a.x(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, ((i11 >> 3) & 14) | 24960, 0, 262122);
            str3 = str2;
            i0Var2 = i0Var;
            b0.d.e(i0Var2, b0.t1.o(2, lVar));
            i2.f fVarB = u3.a.f16593d;
            if (fVarB == null) {
                i2.e eVar5 = new i2.e("Outlined.UnfoldMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = i2.h0.f8270a;
                c2.z0 z0Var = new c2.z0(c2.w.f3052b);
                d8.e eVar6 = new d8.e(9);
                eVar6.x(12.0f, 5.83f);
                eVar6.v(15.17f, 9.0f);
                eVar6.w(1.41f, -1.41f);
                eVar6.v(12.0f, 3.0f);
                eVar6.v(7.41f, 7.59f);
                eVar6.v(8.83f, 9.0f);
                eVar6.v(12.0f, 5.83f);
                eVar6.k();
                eVar6.x(12.0f, 18.17f);
                eVar6.v(8.83f, 15.0f);
                eVar6.w(-1.41f, 1.41f);
                eVar6.v(12.0f, 21.0f);
                eVar6.w(4.59f, -4.59f);
                eVar6.v(15.17f, 15.0f);
                eVar6.v(12.0f, 18.17f);
                eVar6.k();
                i2.e.a(eVar5, (ArrayList) eVar6.f5001a, z0Var);
                fVarB = eVar5.b();
                u3.a.f16593d = fVarB;
            }
            c1.a2.b(fVarB, null, b0.t1.k(18, lVar), f10608e, i0Var2, 3504, 0);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            str3 = str2;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0.x(str, str3, oVar, i10);
        }
    }

    public static final String g(int i10) {
        return i10 != 0 ? i10 != Integer.MAX_VALUE ? gk.b.m(i10, " pages") : "All" : "Current only";
    }
}
