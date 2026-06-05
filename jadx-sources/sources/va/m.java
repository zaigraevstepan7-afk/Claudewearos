package va;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.b0;
import b0.q1;
import b0.t1;
import b0.z;
import c2.e0;
import c2.w;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.q2;
import f1.r1;
import p2.k0;
import ra.d0;
import s.z0;
import t.o1;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f17955a = t.d.t(400, 0, new t.s(0.16f, 1.0f, 0.3f, 1.0f), 2);

    public static final void a(final u uVar, final ej.c cVar, final ej.a aVar, v1.o oVar, final String str, final boolean z2, final mi.p pVar, final jb.d dVar, final fi.a aVar2, i0 i0Var, final int i10) {
        int i11;
        i0 i0Var2;
        final v1.o oVar2;
        int i12;
        float f10;
        a1 a1Var;
        a1 a1Var2;
        String str2;
        boolean z10;
        String str3;
        pi.o oVar3;
        Object obj;
        q2 q2Var;
        boolean z11;
        fj.l.f(uVar, "mode");
        fj.l.f(cVar, "onPinComplete");
        fj.l.f(aVar, "onCancel");
        fj.l.f(dVar, "dockSettings");
        i0Var.c0(1834477142);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.d(uVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(aVar) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 |= i0Var.f(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= i0Var.g(z2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= i0Var.f(pVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= i0Var.f(dVar) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= i0Var.h(aVar2) ? 67108864 : 33554432;
        }
        if (i0Var.T(i13 & 1, (i13 & 38347923) != 38347922)) {
            int i14 = i13 & 14;
            boolean z12 = i14 == 4;
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (z12 || objQ == obj2) {
                objQ = f1.s.A("");
                i0Var.l0(objQ);
            }
            a1 a1Var3 = (a1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj2) {
                objQ2 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ2);
            }
            a1 a1Var4 = (a1) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == obj2) {
                objQ3 = f1.s.o(i0Var);
                i0Var.l0(objQ3);
            }
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj2) {
                objQ4 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ4);
            }
            a1 a1Var5 = (a1) objQ4;
            Object objQ5 = i0Var.Q();
            ti.c cVar2 = null;
            if (objQ5 == obj2) {
                objQ5 = new d0(1, a1Var5, cVar2);
                i0Var.l0(objQ5);
            }
            pi.o oVar4 = pi.o.f13011a;
            f1.s.f((ej.e) objQ5, i0Var, oVar4);
            if (((Boolean) a1Var5.getValue()).booleanValue()) {
                i12 = i14;
                f10 = 1.0f;
            } else {
                i12 = i14;
                f10 = 0.0f;
            }
            int i15 = i13;
            q2 q2VarB = t.e.b(f10, t.d.t(250, 0, null, 6), "content_alpha", null, i0Var, 3120, 20);
            q2 q2VarB2 = t.e.b(((Boolean) a1Var5.getValue()).booleanValue() ? 0.5f : 0.0f, t.d.t(250, 0, null, 6), "overlay_alpha", null, i0Var, 3120, 20);
            q2 q2VarB3 = t.e.b(((Boolean) a1Var5.getValue()).booleanValue() ? 1.0f : 0.75f, t.d.t(250, 0, null, 6), "button_scale", null, i0Var, 3120, 20);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zF = ((i15 & 458752) == 131072) | i0Var.f(a1Var3);
            Object objQ6 = i0Var.Q();
            if (zF || objQ6 == obj2) {
                a1Var = a1Var4;
                Object vVar = new mb.v(z2, a1Var, a1Var3, cVar2, 1);
                a1Var2 = a1Var3;
                i0Var.l0(vVar);
                objQ6 = vVar;
            } else {
                a1Var2 = a1Var3;
                a1Var = a1Var4;
            }
            f1.s.f((ej.e) objQ6, i0Var, boolValueOf);
            int iOrdinal = uVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "Create Passcode";
            } else if (iOrdinal == 1) {
                str2 = "Confirm Passcode";
            } else {
                if (iOrdinal != 2) {
                    throw new b3.e();
                }
                str2 = "Enter Passcode";
            }
            String str4 = str2;
            int iOrdinal2 = uVar.ordinal();
            if (iOrdinal2 != 0) {
                z10 = true;
                if (iOrdinal2 == 1) {
                    str3 = "Enter your passcode again";
                } else {
                    if (iOrdinal2 != 2) {
                        throw new b3.e();
                    }
                    str3 = "Enter passcode to unlock folder";
                }
            } else {
                z10 = true;
                str3 = "Create a passcode to protect this folder";
            }
            String str5 = str3;
            String str6 = (String) a1Var2.getValue();
            boolean zF2 = i0Var.f(a1Var2) | (i12 == 4 ? z10 : false) | ((i15 & 112) == 32 ? z10 : false) | ((i15 & 57344) == 16384 ? z10 : false);
            Object objQ7 = i0Var.Q();
            if (zF2 || objQ7 == obj2) {
                oVar3 = oVar4;
                obj = obj2;
                q2Var = q2VarB3;
                z11 = false;
                a1 a1Var6 = a1Var2;
                Object cVar3 = new b6.c(uVar, cVar, str, a1Var6, a1Var, null, 14);
                a1Var2 = a1Var6;
                i0Var.l0(cVar3);
                objQ7 = cVar3;
            } else {
                obj = obj2;
                oVar3 = oVar4;
                q2Var = q2VarB3;
                z11 = false;
            }
            f1.s.f((ej.e) objQ7, i0Var, str6);
            b0.i0 i0Var3 = t1.f1433c;
            v1.o oVarA = z1.h.a(((Number) q2VarB.getValue()).floatValue(), i0Var3);
            q0 q0VarD = b0.r.d(v1.b.f17547a, z11);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarA);
            v2.h.f17668w.getClass();
            ej.a aVar3 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar3);
            } else {
                i0Var.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var, numValueOf, eVar3);
            v2.d dVar2 = v2.g.f17651h;
            f1.s.I(dVar2, i0Var);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var, oVarC);
            i0Var2 = i0Var;
            b0.r.a(v.n.f(i0Var3, w.c(w.f3052b, ((Number) q2VarB2.getValue()).floatValue()), e0.f2986b), i0Var2, 0);
            Object objQ8 = i0Var2.Q();
            if (objQ8 == obj) {
                objQ8 = l.f17954a;
                i0Var2.l0(objQ8);
            }
            b0.r.a(k0.a(i0Var3, oVar3, (PointerInputEventHandler) objQ8), i0Var2, 0);
            v1.o oVarC2 = b0.d.C(i0Var3, b0.d.f1294d);
            b0 b0VarA = z.a(b0.j.f1365g, v1.b.F, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarC2);
            i0Var2.e0();
            a1 a1Var7 = a1Var2;
            if (i0Var2.S) {
                i0Var2.k(aVar3);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, b0VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar2);
            f1.s.M(eVar4, i0Var2, oVarC3);
            f1.s.b(new r1[]{jb.f.f8827g.a(dVar), jb.f.f8828h.a(aVar2)}, p1.j.d(-1822780398, new c(pVar, a1Var7, aVar, str4, str5, a1Var, q2Var), i0Var2), i0Var2, 56);
            i0Var2.p(true);
            i0Var2.p(true);
            oVar2 = v1.l.f17564b;
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: va.h
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    m.a(uVar, cVar, aVar, oVar2, str, z2, pVar, dVar, aVar2, (i0) obj3, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r19, final ej.a r20, final mi.p r21, float r22, final int r23, f1.i0 r24, final int r25) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va.m.b(java.lang.String, ej.a, mi.p, float, int, f1.i0, int):void");
    }

    public static final void c(final boolean z2, final boolean z10, i0 i0Var, final int i10) {
        i0 i0Var2;
        i0Var.c0(587652207);
        int i11 = (i0Var.g(z2) ? 4 : 2) | i10 | (i0Var.g(z10) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var2 = i0Var;
            q2 q2VarB = t.e.b(z2 ? 1.0f : 0.0f, t.d.t(150, 0, null, 6), "dot_fill", null, i0Var2, 3120, 20);
            q2 q2VarA = z0.a(z10 ? w.f3055e : w.f3054d, t.d.t(200, 0, null, 6), "dot_outline_color", i0Var2, 432, 8);
            v1.o oVarK = t1.k(14, v1.l.f17564b);
            j0.d dVar = j0.e.f8605a;
            b0.r.a(v.n.f(v.n.h(z1.h.c(oVarK, dVar), (float) 1.5d, ((w) q2VarA.getValue()).f3060a, dVar), w.c(w.f3054d, ((Number) q2VarB.getValue()).floatValue()), e0.f2986b), i0Var2, 0);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(i10, z2, z10) { // from class: va.j

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f17949a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f17950b;

                {
                    this.f17949a = z2;
                    this.f17950b = z10;
                }

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    m.c(this.f17949a, this.f17950b, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void d(final int i10, final int i11, i0 i0Var, final boolean z2) {
        i0Var.c0(432850425);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | (i0Var.g(z2) ? 32 : 16);
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            q1 q1VarA = b0.o1.a(b0.j.g(16), v1.b.C, i0Var, 6);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
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
            i0Var.b0(-1916973415);
            int i13 = 0;
            while (i13 < 6) {
                c(i13 < i10, z2, i0Var, i12 & 112);
                i13++;
            }
            i0Var.p(false);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(i10, z2, i11) { // from class: va.i

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f17947a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f17948b;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    m.d(this.f17947a, iO, (i0) obj, this.f17948b);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(float f10, mi.p pVar, ej.c cVar, ej.a aVar, v1.o oVar, i0 i0Var, int i10) {
        v1.o oVar2;
        f1.f fVar;
        v1.f fVar2 = v1.b.C;
        i0Var.c0(-917652005);
        float f11 = f10;
        mi.p pVar2 = pVar;
        int i11 = i10 | (i0Var.c(f11) ? 4 : 2) | (i0Var.f(pVar2) ? 32 : 16) | (i0Var.h(cVar) ? 256 : 128) | 24576;
        if (i0Var.T(i11 & 1, (i11 & 8339) != 8338)) {
            b0 b0VarA = z.a(b0.j.g(16), v1.b.F, i0Var, 54);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = v1.a.c(i0Var, lVar);
            v2.h.f17668w.getClass();
            v2.f fVar3 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar3);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            i0Var.b0(-585483582);
            int i12 = 0;
            while (true) {
                fVar = f1.m.f6385a;
                if (i12 >= 3) {
                    break;
                }
                q1 q1VarA = b0.o1.a(b0.j.g(24), fVar2, i0Var, 6);
                int iHashCode2 = Long.hashCode(i0Var.T);
                n1 n1VarL2 = i0Var.l();
                v1.o oVarC2 = v1.a.c(i0Var, lVar);
                v2.h.f17668w.getClass();
                v2.f fVar4 = v2.g.f17645b;
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(fVar4);
                } else {
                    i0Var.o0();
                }
                f1.s.M(v2.g.f17649f, i0Var, q1VarA);
                f1.s.M(v2.g.f17648e, i0Var, n1VarL2);
                f1.s.w(i0Var, Integer.valueOf(iHashCode2), v2.g.f17650g);
                f1.s.I(v2.g.f17651h, i0Var);
                f1.s.M(v2.g.f17647d, i0Var, oVarC2);
                i0Var.b0(-205955429);
                int i13 = 0;
                for (int i14 = 3; i13 < i14; i14 = i14) {
                    int i15 = (i12 * 3) + i13;
                    int i16 = i15 + 1;
                    String strValueOf = String.valueOf(i16);
                    boolean zD = ((i11 & 896) == 256) | i0Var.d(i16);
                    Object objQ = i0Var.Q();
                    if (zD || objQ == fVar) {
                        objQ = new cb.g(cVar, i16, 1);
                        i0Var.l0(objQ);
                    }
                    b(strValueOf, (ej.a) objQ, pVar2, f11, i15, i0Var, ((i11 << 3) & 896) | ((i11 << 9) & 7168));
                    i13++;
                    f11 = f10;
                    pVar2 = pVar;
                }
                i0Var.p(false);
                i0Var.p(true);
                i12++;
                f11 = f10;
                pVar2 = pVar;
            }
            i0Var.p(false);
            q1 q1VarA2 = b0.o1.a(b0.j.g(24), fVar2, i0Var, 6);
            int iHashCode3 = Long.hashCode(i0Var.T);
            n1 n1VarL3 = i0Var.l();
            v1.o oVarC3 = v1.a.c(i0Var, lVar);
            v2.h.f17668w.getClass();
            v2.f fVar5 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar5);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q1VarA2);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL3);
            f1.s.w(i0Var, Integer.valueOf(iHashCode3), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC3);
            float f12 = 80;
            b0.d.e(i0Var, t1.k(f12, lVar));
            boolean z2 = (i11 & 896) == 256;
            Object objQ2 = i0Var.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new db.g(cVar, 12);
                i0Var.l0(objQ2);
            }
            b("0", (ej.a) objQ2, pVar, f10, 9, i0Var, ((i11 << 3) & 896) | 24582 | ((i11 << 9) & 7168));
            b0.d.e(i0Var, t1.k(f12, lVar));
            i0Var.p(true);
            i0Var.p(true);
            oVar2 = lVar;
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.q1(f10, pVar, cVar, aVar, oVar2, i10);
        }
    }
}
