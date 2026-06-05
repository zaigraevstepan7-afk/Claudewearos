package s;

import f1.n1;
import k0.t1;
import t.f1;
import t.j1;
import t.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static final void a(j1 j1Var, ej.c cVar, v1.o oVar, s0 s0Var, t0 t0Var, ej.e eVar, p1.e eVar2, f1.i0 i0Var, int i10) {
        int i11;
        int i12;
        j1 j1Var2;
        d1 d1Var;
        p1 p1Var;
        Object obj;
        d1 d1Var2;
        boolean z2;
        f1 f1Var;
        f1 f1Var2;
        f1 f1Var3;
        boolean z10;
        f1 f1Var4;
        boolean z11;
        f1 f1Var5;
        f1 f1Var6;
        f1 f1Var7;
        f1 f1VarL;
        s0 s0Var2;
        t0 t0Var2;
        p1.e eVar3 = eVar2;
        f1.j1 j1Var3 = j1Var.f15203d;
        i0Var.c0(1912839215);
        int i13 = (i0Var.f(j1Var) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i13 |= i0Var.h(cVar) ? 32 : 16;
        }
        int i14 = i13 | (i0Var.f(oVar) ? 256 : 128);
        if ((i10 & 3072) == 0) {
            i14 |= i0Var.f(s0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i14 |= i0Var.f(t0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i14 |= i0Var.h(eVar) ? 131072 : 65536;
        }
        int i15 = i14 | 1572864;
        if ((12582912 & i10) == 0) {
            i15 |= i0Var.h(eVar3) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if (!i0Var.T(i16 & 1, (4793491 & i16) != 4793490)) {
            i0Var.W();
        } else if (((Boolean) cVar.invoke(j1Var3.getValue())).booleanValue() || ((Boolean) cVar.invoke(j1Var.c())).booleanValue() || j1Var.g() || j1Var.d()) {
            i0Var.b0(-232386135);
            int i17 = i16 & 14;
            int i18 = i17 | 48;
            int i19 = i18 & 14;
            boolean z12 = ((i19 ^ 6) > 4 && i0Var.f(j1Var)) || (i18 & 6) == 4;
            Object objQ = i0Var.Q();
            boolean z13 = z12;
            Object obj2 = f1.m.f6385a;
            if (z13 || objQ == obj2) {
                objQ = j1Var.c();
                i0Var.l0(objQ);
            }
            if (j1Var.g()) {
                objQ = j1Var.c();
            }
            i0Var.b0(1844425648);
            g0 g0VarD = d(j1Var, cVar, objQ, i0Var);
            i0Var.p(false);
            Object value = j1Var3.getValue();
            i0Var.b0(1844425648);
            g0 g0VarD2 = d(j1Var, cVar, value, i0Var);
            i0Var.p(false);
            int i20 = i19 | 3072;
            int i21 = (i20 & 14) ^ 6;
            boolean z14 = (i21 > 4 && i0Var.f(j1Var)) || (i20 & 6) == 4;
            Object objQ2 = i0Var.Q();
            if (z14 || objQ2 == obj2) {
                i11 = i20;
                i12 = i16;
                objQ2 = new j1(new t.l0(g0VarD), j1Var, m6.a.j(new StringBuilder(), j1Var.f15202c, " > EnterExitTransition"));
                i0Var.l0(objQ2);
            } else {
                i11 = i20;
                i12 = i16;
            }
            j1 j1Var4 = (j1) objQ2;
            boolean zF = ((i21 > 4 && i0Var.f(j1Var)) || (i11 & 6) == 4) | i0Var.f(j1Var4);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj2) {
                objQ3 = new t1(19, j1Var, j1Var4);
                i0Var.l0(objQ3);
            }
            f1.s.c(j1Var4, (ej.c) objQ3, i0Var);
            if (j1Var.g()) {
                j1Var4.j(g0VarD, g0VarD2);
            } else {
                j1Var4.k(g0VarD2);
                j1Var4.f15209k.setValue(Boolean.FALSE);
            }
            p1 p1Var2 = n0.f14647a;
            boolean zF2 = i0Var.f(j1Var4);
            Object objQ4 = i0Var.Q();
            if (zF2 || objQ4 == obj2) {
                objQ4 = f1.s.A(s0Var);
                i0Var.l0(objQ4);
            }
            f1.a1 a1Var = (f1.a1) objQ4;
            Object objC = j1Var4.c();
            f1.j1 j1Var5 = j1Var4.f15203d;
            if (objC == j1Var5.getValue() && j1Var4.c() == g0.f14603b) {
                if (j1Var4.g()) {
                    a1Var.setValue(s0Var);
                } else {
                    a1Var.setValue(s0.f14671b);
                }
            } else if (j1Var5.getValue() == g0.f14603b) {
                a1Var.setValue(((s0) a1Var.getValue()).a(s0Var));
            }
            s0 s0Var3 = (s0) a1Var.getValue();
            boolean zF3 = i0Var.f(j1Var4);
            Object objQ5 = i0Var.Q();
            if (zF3 || objQ5 == obj2) {
                objQ5 = f1.s.A(t0Var);
                i0Var.l0(objQ5);
            }
            f1.a1 a1Var2 = (f1.a1) objQ5;
            if (j1Var4.c() == j1Var5.getValue() && j1Var4.c() == g0.f14603b) {
                if (j1Var4.g()) {
                    a1Var2.setValue(t0Var);
                } else {
                    a1Var2.setValue(t0.f14675b);
                }
            } else if (j1Var5.getValue() != g0.f14603b) {
                a1Var2.setValue(((t0) a1Var2.getValue()).a(t0Var));
            }
            t0 t0Var3 = (t0) a1Var2.getValue();
            Object objK = f1.s.K(eVar, i0Var);
            Object objInvoke = eVar.invoke(j1Var4.c(), j1Var5.getValue());
            boolean zF4 = i0Var.f(j1Var4) | i0Var.f(objK);
            Object objQ6 = i0Var.Q();
            ti.c cVar2 = null;
            if (zF4 || objQ6 == obj2) {
                objQ6 = new ab.s(j1Var4, objK, cVar2, 21);
                i0Var.l0(objQ6);
            }
            f1.a1 a1VarE = f1.s.E((ej.e) objQ6, i0Var, objInvoke);
            Object objC2 = j1Var4.c();
            g0 g0Var = g0.f14604c;
            if (objC2 == g0Var && j1Var5.getValue() == g0Var && ((Boolean) a1VarE.getValue()).booleanValue()) {
                i0Var.b0(-229368781);
                i0Var.p(false);
                eVar3 = eVar2;
                z2 = false;
            } else {
                i0Var.b0(-230699766);
                boolean z15 = i17 == 4;
                Object objQ7 = i0Var.Q();
                if (z15 || objQ7 == obj2) {
                    objQ7 = new c0();
                    i0Var.l0(objQ7);
                }
                c0 c0Var = (c0) objQ7;
                p1 p1Var3 = t.d.f15142p;
                Object objQ8 = i0Var.Q();
                if (objQ8 == obj2) {
                    objQ8 = k0.f14640a;
                    i0Var.l0(objQ8);
                }
                ej.a aVar = (ej.a) objQ8;
                i0Var.b0(-167964673);
                i0Var.p(false);
                i0Var.b0(-167961890);
                i0Var.p(false);
                d1 d1Var3 = s0Var3.f14672a;
                d1 d1Var4 = t0Var3.f14677a;
                b1 b1Var = d1Var3.f14583b;
                e0 e0Var = d1Var3.f14584c;
                boolean z16 = (b1Var == null && d1Var4.f14583b == null) ? false : true;
                boolean z17 = (e0Var == null && d1Var4.f14584c == null) ? false : true;
                if (z16) {
                    i0Var.b0(-911488127);
                    Object objQ9 = i0Var.Q();
                    if (objQ9 == obj2) {
                        objQ9 = "Built-in slide";
                        i0Var.l0("Built-in slide");
                    }
                    String str = (String) objQ9;
                    j1Var2 = j1Var4;
                    d1Var = d1Var3;
                    obj = obj2;
                    d1Var2 = d1Var4;
                    z2 = false;
                    f1 f1VarL2 = t.d.l(j1Var2, p1Var3, str, i0Var, 384, 0);
                    p1Var = p1Var3;
                    i0Var.p(false);
                    f1Var = f1VarL2;
                } else {
                    j1Var2 = j1Var4;
                    d1Var = d1Var3;
                    p1Var = p1Var3;
                    obj = obj2;
                    d1Var2 = d1Var4;
                    z2 = false;
                    i0Var.b0(-911382324);
                    i0Var.p(false);
                    f1Var = null;
                }
                if (z17) {
                    i0Var.b0(-911290533);
                    p1 p1Var4 = t.d.f15143q;
                    Object objQ10 = i0Var.Q();
                    if (objQ10 == obj) {
                        objQ10 = "Built-in shrink/expand";
                        i0Var.l0("Built-in shrink/expand");
                    }
                    f1 f1VarL3 = t.d.l(j1Var2, p1Var4, (String) objQ10, i0Var, 384, 0);
                    i0Var.p(z2);
                    f1Var2 = f1VarL3;
                } else {
                    i0Var.b0(-911179709);
                    i0Var.p(z2);
                    f1Var2 = null;
                }
                if (z17) {
                    i0Var.b0(-911106083);
                    Object objQ11 = i0Var.Q();
                    if (objQ11 == obj) {
                        objQ11 = "Built-in InterruptionHandlingOffset";
                        i0Var.l0("Built-in InterruptionHandlingOffset");
                    }
                    f1 f1VarL4 = t.d.l(j1Var2, p1Var, (String) objQ11, i0Var, 384, 0);
                    i0Var.p(z2);
                    f1Var3 = f1VarL4;
                } else {
                    i0Var.b0(-910935677);
                    i0Var.p(z2);
                    f1Var3 = null;
                }
                boolean z18 = !z17;
                float[] fArr = d2.d.f4630a;
                i0Var.b0(-910130296);
                i0Var.p(z2);
                p1 p1Var5 = t.d.j;
                boolean z19 = (d1Var.f14582a == null && d1Var2.f14582a == null) ? z2 : true;
                boolean z20 = (d1Var.f14585d == null && d1Var2.f14585d == null) ? z2 : true;
                if (z19) {
                    i0Var.b0(-703879421);
                    Object objQ12 = i0Var.Q();
                    if (objQ12 == obj) {
                        objQ12 = "Built-in alpha";
                        i0Var.l0("Built-in alpha");
                    }
                    String str2 = (String) objQ12;
                    z10 = z18;
                    f1 f1VarL5 = t.d.l(j1Var2, p1Var5, str2, i0Var, 384, 0);
                    i0Var.p(z2);
                    f1Var4 = f1VarL5;
                } else {
                    z10 = z18;
                    i0Var.b0(-703709976);
                    i0Var.p(z2);
                    f1Var4 = null;
                }
                if (z20) {
                    i0Var.b0(-703642333);
                    Object objQ13 = i0Var.Q();
                    if (objQ13 == obj) {
                        objQ13 = "Built-in scale";
                        i0Var.l0("Built-in scale");
                    }
                    z11 = z20;
                    f1Var5 = f1Var4;
                    f1 f1VarL6 = t.d.l(j1Var2, p1Var5, (String) objQ13, i0Var, 384, 0);
                    i0Var.p(z2);
                    f1Var6 = f1VarL6;
                } else {
                    z11 = z20;
                    f1Var5 = f1Var4;
                    i0Var.b0(-703472888);
                    i0Var.p(z2);
                    f1Var6 = null;
                }
                if (z11) {
                    i0Var.b0(-703395232);
                    f1Var7 = f1Var6;
                    f1VarL = t.d.l(j1Var2, n0.f14647a, "TransformOriginInterruptionHandling", i0Var, 384, 0);
                    i0Var.p(z2);
                } else {
                    f1Var7 = f1Var6;
                    i0Var.b0(-703222904);
                    i0Var.p(z2);
                    f1VarL = null;
                }
                boolean zH = i0Var.h(f1Var5) | i0Var.f(s0Var3) | i0Var.f(t0Var3) | i0Var.h(f1Var7) | i0Var.f(j1Var2) | i0Var.h(f1VarL);
                Object objQ14 = i0Var.Q();
                if (zH || objQ14 == obj) {
                    s0Var2 = s0Var3;
                    t0Var2 = t0Var3;
                    objQ14 = new i0(f1Var5, f1Var7, j1Var2, s0Var2, t0Var2, f1VarL);
                    i0Var.l0(objQ14);
                } else {
                    s0Var2 = s0Var3;
                    t0Var2 = t0Var3;
                }
                i0 i0Var2 = (i0) objQ14;
                boolean zG = i0Var.g(z10) | i0Var.f(aVar);
                Object objQ15 = i0Var.Q();
                if (zG || objQ15 == obj) {
                    objQ15 = new l0(aVar, z10);
                    i0Var.l0(objQ15);
                }
                v1.l lVar = v1.l.f17564b;
                v1.o oVarC = c2.e0.q(lVar, (ej.c) objQ15).c(new h0(j1Var2, f1Var2, f1Var3, f1Var, s0Var2, t0Var2, aVar, i0Var2)).c(lVar);
                i0Var.b0(-7404393);
                i0Var.p(z2);
                v1.o oVarC2 = oVar.c(oVarC.c(lVar));
                Object objQ16 = i0Var.Q();
                if (objQ16 == obj) {
                    objQ16 = new t(c0Var);
                    i0Var.l0(objQ16);
                }
                t tVar = (t) objQ16;
                int iHashCode = Long.hashCode(i0Var.T);
                n1 n1VarL = i0Var.l();
                v1.o oVarC3 = v1.a.c(i0Var, oVarC2);
                v2.h.f17668w.getClass();
                ej.a aVar2 = v2.g.f17645b;
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(aVar2);
                } else {
                    i0Var.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var, tVar);
                f1.s.M(v2.g.f17648e, i0Var, n1VarL);
                f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
                f1.s.I(v2.g.f17651h, i0Var);
                f1.s.M(v2.g.f17647d, i0Var, oVarC3);
                eVar3 = eVar2;
                eVar3.c(c0Var, i0Var, Integer.valueOf((i12 >> 18) & 112));
                i0Var.p(true);
                i0Var.p(z2);
            }
            i0Var.p(z2);
        } else {
            i0Var.b0(-229362829);
            i0Var.p(false);
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new u(j1Var, cVar, oVar, s0Var, t0Var, eVar, eVar3, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r21, v1.o r22, s.s0 r23, s.t0 r24, java.lang.String r25, p1.e r26, f1.i0 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.a0.b(boolean, v1.o, s.s0, s.t0, java.lang.String, p1.e, f1.i0, int, int):void");
    }

    public static final void c(j1 j1Var, ej.c cVar, v1.o oVar, s0 s0Var, t0 t0Var, p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(1706321816);
        int i11 = (i0Var.f(j1Var) ? 4 : 2) | i10;
        if ((i10 & 384) == 0) {
            i11 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.f(s0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.f(t0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.h(eVar) ? 131072 : 65536;
        }
        if (i0Var.T(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z2 = i12 == 4;
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (z2 || objQ == fVar) {
                objQ = new x(cVar, j1Var);
                i0Var.l0(objQ);
            }
            v1.o oVarK = t2.z.k(oVar, (ej.f) objQ);
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = y.f14701a;
                i0Var.l0(objQ2);
            }
            a(j1Var, cVar, oVarK, s0Var, t0Var, (ej.e) objQ2, eVar, i0Var, i12 | 196656 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new z(j1Var, cVar, oVar, s0Var, t0Var, eVar, i10);
        }
    }

    public static final g0 d(j1 j1Var, ej.c cVar, Object obj, f1.i0 i0Var) {
        g0 g0Var;
        i0Var.X(j1Var, -422486745, 0, null);
        if (j1Var.g()) {
            i0Var.b0(-212166497);
            i0Var.p(false);
            g0Var = ((Boolean) cVar.invoke(obj)).booleanValue() ? g0.f14603b : ((Boolean) cVar.invoke(j1Var.c())).booleanValue() ? g0.f14604c : g0.f14602a;
        } else {
            i0Var.b0(-211892364);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ);
            }
            f1.a1 a1Var = (f1.a1) objQ;
            if (((Boolean) cVar.invoke(j1Var.c())).booleanValue()) {
                a1Var.setValue(Boolean.TRUE);
            }
            g0Var = ((Boolean) cVar.invoke(obj)).booleanValue() ? g0.f14603b : ((Boolean) a1Var.getValue()).booleanValue() ? g0.f14604c : g0.f14602a;
            i0Var.p(false);
        }
        i0Var.p(false);
        return g0Var;
    }
}
