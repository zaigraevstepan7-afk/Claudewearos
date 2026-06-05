package k0;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.g2;
import c1.c6;
import c1.i8;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f9245a = new p1.e(new d1.a(2), false, 759698998);

    /* renamed from: b, reason: collision with root package name */
    public static final p7.k f9246b = new p7.k(new q0(0), 11);

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f9247c = new q0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final p2.a f9248d = new p2.a(1022);

    /* renamed from: e, reason: collision with root package name */
    public static final c1.u1 f9249e = new c1.u1(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final int f9250f = 9;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9251g = 10;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9252h = 12;

    public static final void A(int i10, int i11, int i12) {
        boolean z2 = false;
        if (i10 >= 0 && i10 <= i11) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbQ = gk.b.q("OffsetMapping.originalToTransformed returned invalid mapping: ", i12, " -> ", i10, " is not in range of transformed text [0, ");
        sbQ.append(i11);
        sbQ.append(']');
        a0.a.c(sbQ.toString());
    }

    public static final void B(int i10, int i11, int i12) {
        boolean z2 = false;
        if (i10 >= 0 && i10 <= i11) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbQ = gk.b.q("OffsetMapping.transformedToOriginal returned invalid mapping: ", i12, " -> ", i10, " is not in range of original text [0, ");
        sbQ.append(i11);
        sbQ.append(']');
        a0.a.c(sbQ.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final g3.f r20, final v1.o r21, final g3.n0 r22, final ej.c r23, final int r24, final boolean r25, final int r26, final int r27, final java.util.Map r28, f1.i0 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.s.a(g3.f, v1.o, g3.n0, ej.c, int, boolean, int, int, java.util.Map, f1.i0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r19, v1.o r20, g3.n0 r21, int r22, boolean r23, int r24, int r25, f1.i0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.s.b(java.lang.String, v1.o, g3.n0, int, boolean, int, int, f1.i0, int, int):void");
    }

    public static final void c(v0.u0 u0Var, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        v1.o oVarD;
        i0Var.c0(1533506138);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(u0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var.b0(-885604480);
            if (u0Var.k()) {
                ti.c cVar = null;
                oVarD = q0.h.d(q0.h.c(new v0.m0(u0Var, cVar, 0)), u0Var.f17508x, new i8(u0Var, cVar, 2), new v0.n0(u0Var, cVar, 0), new v(u0Var, 2));
            } else {
                oVarD = v1.l.f17564b;
            }
            p0.j.b(oVarD, eVar, i0Var, i11 & 112);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r(u0Var, eVar, i10, 0);
        }
    }

    public static final void d(v0.u0 u0Var, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(2080741862);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(u0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            c(u0Var, eVar, i0Var, i11 & 126);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r(u0Var, eVar, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x081e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08ce  */
    /* JADX WARN: Type inference failed for: r0v90, types: [v1.o] */
    /* JADX WARN: Type inference failed for: r15v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v74, types: [v1.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final l3.t r67, final ej.c r68, final v1.o r69, final g3.n0 r70, final b0.b r71, final ej.c r72, final z.k r73, final c2.s r74, final boolean r75, final int r76, final int r77, final l3.j r78, final k0.r0 r79, final boolean r80, final ej.f r81, f1.i0 r82, final int r83, final int r84) {
        /*
            Method dump skipped, instructions count: 2549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.s.e(l3.t, ej.c, v1.o, g3.n0, b0.b, ej.c, z.k, c2.s, boolean, int, int, l3.j, k0.r0, boolean, ej.f, f1.i0, int, int):void");
    }

    public static final void f(v1.o oVar, v0.u0 u0Var, p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(2036174316);
        int i11 = (i0Var.f(oVar) ? 4 : 2) | i10 | (i0Var.h(u0Var) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, true);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVar);
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
            f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            d(u0Var, eVar, i0Var, (i11 >> 3) & 126);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new x(oVar, u0Var, eVar, i10, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v0, types: [f1.i0] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [f1.a1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final v1.o r27, g3.f r28, final ej.c r29, final boolean r30, final java.util.Map r31, final g3.n0 r32, final int r33, final boolean r34, final int r35, final int r36, final k3.i r37, final ej.c r38, f1.i0 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.s.g(v1.o, g3.f, ej.c, boolean, java.util.Map, g3.n0, int, boolean, int, int, k3.i, ej.c, f1.i0, int, int):void");
    }

    public static final void h(v0.u0 u0Var, boolean z2, f1.i0 i0Var, int i10) {
        s1 s1VarD;
        i0Var.c0(626339208);
        int i11 = (i0Var.h(u0Var) ? 4 : 2) | i10 | (i0Var.g(z2) ? 32 : 16);
        if (!i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var.W();
        } else if (z2) {
            i0Var.b0(1530097388);
            t0 t0Var = u0Var.f17489d;
            g3.k0 k0Var = null;
            if (t0Var != null && (s1VarD = t0Var.d()) != null) {
                g3.k0 k0Var2 = s1VarD.f9254a;
                t0 t0Var2 = u0Var.f17489d;
                if (!(t0Var2 != null ? t0Var2.f9278p : true)) {
                    k0Var = k0Var2;
                }
            }
            if (k0Var == null) {
                i0Var.b0(1530097387);
                i0Var.p(false);
            } else {
                i0Var.b0(1530097388);
                if (g3.m0.c(u0Var.n().f9938b)) {
                    i0Var.b0(2110860558);
                    i0Var.p(false);
                } else {
                    i0Var.b0(2109807302);
                    int iB = u0Var.f17487b.b((int) (u0Var.n().f9938b >> 32));
                    int iB2 = u0Var.f17487b.b((int) (u0Var.n().f9938b & 4294967295L));
                    r3.j jVarA = k0Var.a(iB);
                    r3.j jVarA2 = k0Var.a(Math.max(iB2 - 1, 0));
                    t0 t0Var3 = u0Var.f17489d;
                    if (t0Var3 == null || !((Boolean) t0Var3.f9275m.getValue()).booleanValue()) {
                        i0Var.b0(2110490542);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(2110225306);
                        u2.b.a(true, jVarA, u0Var, i0Var, ((i11 << 6) & 896) | 6);
                        i0Var.p(false);
                    }
                    t0 t0Var4 = u0Var.f17489d;
                    if (t0Var4 == null || !((Boolean) t0Var4.f9276n.getValue()).booleanValue()) {
                        i0Var.b0(2110838734);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(2110574459);
                        u2.b.a(false, jVarA2, u0Var, i0Var, ((i11 << 6) & 896) | 6);
                        i0Var.p(false);
                    }
                    i0Var.p(false);
                }
                t0 t0Var5 = u0Var.f17489d;
                if (t0Var5 != null) {
                    f1.j1 j1Var = t0Var5.f9274l;
                    if (!fj.l.b(u0Var.f17504t.f9937a.f7081b, u0Var.n().f9937a.f7081b)) {
                        j1Var.setValue(Boolean.FALSE);
                    }
                    if (t0Var5.b()) {
                        if (((Boolean) j1Var.getValue()).booleanValue()) {
                            u0Var.r();
                        } else {
                            u0Var.o();
                        }
                    }
                }
                i0Var.p(false);
            }
            i0Var.p(false);
        } else {
            i0Var.b0(1989076778);
            i0Var.p(false);
            u0Var.o();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c6(u0Var, z2, i10);
        }
    }

    public static final void i(v0.u0 u0Var, f1.i0 i0Var, int i10) {
        g3.f fVarM;
        i0Var.c0(-1436003720);
        int i11 = 4;
        int i12 = (i0Var.h(u0Var) ? 4 : 2) | i10;
        if (i0Var.T(i12 & 1, (i12 & 3) != 2)) {
            t0 t0Var = u0Var.f17489d;
            if (t0Var == null || !((Boolean) t0Var.f9277o.getValue()).booleanValue() || (fVarM = u0Var.m()) == null || fVarM.f7081b.length() <= 0) {
                i0Var.b0(-2111042550);
                i0Var.p(false);
            } else {
                i0Var.b0(-2112351432);
                boolean zF = i0Var.f(u0Var);
                Object objQ = i0Var.Q();
                Object obj = f1.m.f6385a;
                if (zF || objQ == obj) {
                    objQ = new v0.p0(u0Var);
                    i0Var.l0(objQ);
                }
                b1 b1Var = (b1) objQ;
                s3.c cVar = (s3.c) i0Var.j(w2.f1.f18262h);
                l3.n nVar = u0Var.f17487b;
                long j = u0Var.n().f9938b;
                int i13 = g3.m0.f7144c;
                int iB = nVar.b((int) (j >> 32));
                t0 t0Var2 = u0Var.f17489d;
                s1 s1VarD = t0Var2 != null ? t0Var2.d() : null;
                fj.l.c(s1VarD);
                g3.k0 k0Var = s1VarD.f9254a;
                b2.c cVarC = k0Var.c(cg.b.p(iB, 0, k0Var.f7128a.f7117a.f7081b.length()));
                long jFloatToRawIntBits = (Float.floatToRawIntBits((cVar.w0(d1.f9072a) / 2) + cVarC.f1502a) << 32) | (4294967295L & Float.floatToRawIntBits(cVarC.f1505d));
                boolean zE = i0Var.e(jFloatToRawIntBits);
                Object objQ2 = i0Var.Q();
                if (zE || objQ2 == obj) {
                    objQ2 = new e0(jFloatToRawIntBits);
                    i0Var.l0(objQ2);
                }
                v0.m mVar = (v0.m) objQ2;
                boolean zH = i0Var.h(b1Var) | i0Var.h(u0Var);
                Object objQ3 = i0Var.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new h0(b1Var, u0Var);
                    i0Var.l0(objQ3);
                }
                v1.o oVarA = p2.k0.a(v1.l.f17564b, b1Var, (PointerInputEventHandler) objQ3);
                boolean zE2 = i0Var.e(jFloatToRawIntBits);
                Object objQ4 = i0Var.Q();
                if (zE2 || objQ4 == obj) {
                    objQ4 = new f1.b(jFloatToRawIntBits, i11);
                    i0Var.l0(objQ4);
                }
                b.a(mVar, d3.p.a(oVarA, false, (ej.c) objQ4), 0L, i0Var, 0);
                i0Var.p(false);
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 14, u0Var);
        }
    }

    public static final b2.c j(t2.e1 e1Var, int i10, l3.a0 a0Var, g3.k0 k0Var, boolean z2, int i11) {
        b2.c cVarC = k0Var != null ? k0Var.c(a0Var.f9882b.b(i10)) : b2.c.f1501e;
        float f10 = cVarC.f1502a;
        int iI0 = e1Var.I0(d1.f9072a);
        return new b2.c(z2 ? (i11 - f10) - iI0 : f10, cVarC.f1503b, z2 ? i11 - f10 : iI0 + f10, cVarC.f1505d);
    }

    public static final boolean k(int i10, KeyEvent keyEvent) {
        return ((int) (n2.d.b(keyEvent) >> 32)) == i10;
    }

    public static final ArrayList l(List list, ej.a aVar) {
        d4.g gVar;
        if (!((Boolean) aVar.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            t2.p0 p0Var = (t2.p0) list.get(i10);
            Object objC0 = p0Var.c0();
            fj.l.d(objC0, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            ac.l lVar = ((w1) objC0).f9315b;
            u1 u1Var = (u1) lVar.f401b;
            g3.d dVar = (g3.d) lVar.f402c;
            g3.k0 k0Var = (g3.k0) u1Var.f9300a.getValue();
            if (k0Var == null) {
                gVar = new d4.g(0, 0, new jb.e(8));
            } else {
                g3.d dVarC = u1.c(dVar, k0Var);
                if (dVarC == null) {
                    gVar = new d4.g(0, 0, new jb.e(9));
                } else {
                    s3.k kVarS = a.a.S(k0Var.h(dVarC.f7046b, dVarC.f7047c).f());
                    gVar = new d4.g(kVarS.c(), kVarS.a(), new a7.e(kVarS, 17));
                }
            }
            int i11 = gVar.f4870a;
            int i12 = gVar.f4871b;
            arrayList.add(new pi.h(p0Var.Y(uk.c.B(i11, i11, i12, i12)), (ej.a) gVar.f4872c));
        }
        return arrayList;
    }

    public static final int m(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final void n(t0 t0Var) {
        l3.z zVar = t0Var.f9268e;
        if (zVar != null) {
            t0Var.f9284v.invoke(l3.t.a((l3.t) t0Var.f9267d.f15363b, null, 0L, 3));
            l3.u uVar = zVar.f9963a;
            AtomicReference atomicReference = uVar.f9941b;
            while (true) {
                if (atomicReference.compareAndSet(zVar, null)) {
                    uVar.f9940a.e();
                    break;
                } else if (atomicReference.get() != zVar) {
                    break;
                }
            }
        }
        t0Var.f9268e = null;
    }

    public static final l3.a0 o(b0.b bVar, g3.f fVar) {
        bVar.getClass();
        int length = fVar.f7081b.length();
        int length2 = fVar.f7081b.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            A(i10, length2, i10);
        }
        A(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            B(i11, length, i11);
        }
        B(length2, length, length2);
        return new l3.a0(fVar, new c1.u1(fVar.f7081b.length(), fVar.f7081b.length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int p(int r11, java.lang.String r12) {
        /*
            r5.k r0 = t()
            r1 = 0
            if (r0 == 0) goto L7e
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L76
            java.lang.String r2 = "charSequence cannot be null"
            uk.c.p(r12, r2)
            r5.f r0 = r0.f13738e
            java.lang.Object r0 = r0.f13727a
            r4 = r0
            p1.l r4 = (p1.l) r4
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L2b
            int r2 = r12.length()
            if (r11 < r2) goto L2d
        L2b:
            r5 = r12
            goto L6c
        L2d:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<r5.y> r6 = r5.y.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            r5.y[] r5 = (r5.y[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L49
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6d
        L49:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            r5.q r10 = new r5.q
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.B(r5, r6, r7, r8, r9, r10)
            r5.q r12 = (r5.q) r12
            int r2 = r12.f13748c
            goto L6d
        L6c:
            r2 = r0
        L6d:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L74
            goto L7f
        L74:
            r1 = r12
            goto L7f
        L76:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        L7e:
            r5 = r12
        L7f:
            if (r1 == 0) goto L86
            int r11 = r1.intValue()
            return r11
        L86:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.s.p(int, java.lang.String):int");
    }

    public static final int q(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int r(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final int s(int i10, String str) {
        r5.k kVarT = t();
        Integer num = null;
        if (kVarT != null) {
            Integer numValueOf = Integer.valueOf(kVarT.b(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    public static final r5.k t() {
        if (!r5.k.d()) {
            return null;
        }
        r5.k kVarA = r5.k.a();
        if (kVarA.c() == 1) {
            return kVarA;
        }
        return null;
    }

    public static final int u(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final void v(t0 t0Var, l3.t tVar, l3.n nVar) {
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            s1 s1VarD = t0Var.d();
            if (s1VarD == null) {
                return;
            }
            l3.z zVar = t0Var.f9268e;
            if (zVar == null) {
                return;
            }
            t2.w wVarC = t0Var.c();
            if (wVarC == null) {
                return;
            }
            w(tVar, t0Var.f9264a, s1VarD.f9254a, wVarC, zVar, t0Var.b(), nVar);
        } finally {
            t1.r.n(gVarF, gVarK, cVarE);
        }
    }

    public static void w(l3.t tVar, a1 a1Var, g3.k0 k0Var, t2.w wVar, l3.z zVar, boolean z2, l3.n nVar) {
        if (z2) {
            int iB = nVar.b(g3.m0.e(tVar.f9938b));
            String str = e1.f9075a;
            b2.c cVarB = iB < k0Var.f7128a.f7117a.f7081b.length() ? k0Var.b(iB) : iB != 0 ? k0Var.b(iB - 1) : new b2.c(0.0f, 0.0f, 1.0f, (int) (e1.a(a1Var.f9038b, a1Var.f9043g, a1Var.f9044h, e1.f9075a, 1) & 4294967295L));
            float f10 = cVarB.f1503b;
            float f11 = cVarB.f1502a;
            long jQ0 = wVar.q0((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            b2.c cVarG = uk.c.g((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jQ0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jQ0 >> 32))) << 32), (Float.floatToRawIntBits(cVarB.f1504c - f11) << 32) | (Float.floatToRawIntBits(cVarB.f1505d - f10) & 4294967295L));
            if (fj.l.b((l3.z) zVar.f9963a.f9941b.get(), zVar)) {
                zVar.f9964b.f(cVarG);
            }
        }
    }

    public static final void x(l3.u uVar, t0 t0Var, l3.t tVar, l3.j jVar, l3.n nVar) {
        t0.j jVar2 = t0Var.f9267d;
        z zVar = t0Var.f9284v;
        z zVar2 = t0Var.f9285w;
        fj.v vVar = new fj.v();
        ab.m mVar = new ab.m(jVar2, zVar, vVar, 10);
        l3.o oVar = uVar.f9940a;
        oVar.b(tVar, jVar, mVar, zVar2);
        l3.z zVar3 = new l3.z(uVar, oVar);
        uVar.f9941b.set(zVar3);
        vVar.f6807a = zVar3;
        t0Var.f9268e = zVar3;
        v(t0Var, tVar, nVar);
    }

    public static final v1.o y(v1.o oVar, g3.f fVar, g3.n0 n0Var, ej.c cVar, int i10, boolean z2, int i11, int i12, k3.i iVar, List list, ej.c cVar2, ej.c cVar3) {
        return oVar.c(v1.l.f17564b).c(new u0.h(fVar, n0Var, iVar, cVar, i10, z2, i11, i12, list, cVar2, cVar3));
    }

    public static final void z(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            a0.a.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        a0.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
