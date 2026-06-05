package c1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1.b f2944a = new b1.b();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final ej.a r27, final p1.e r28, v1.o r29, ej.e r30, final ej.e r31, final ej.e r32, c2.w0 r33, long r34, long r36, long r38, long r40, float r42, w3.u r43, f1.i0 r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.z4.a(ej.a, p1.e, v1.o, ej.e, ej.e, ej.e, c2.w0, long, long, long, long, float, w3.u, f1.i0, int, int, int):void");
    }

    public static final void b(ej.a aVar, v1.o oVar, boolean z2, c2.w0 w0Var, v vVar, z4 z4Var, b0.i1 i1Var, ej.f fVar, f1.i0 i0Var, int i10) {
        int i11;
        c2.w0 w0Var2;
        i0Var.c0(-1310015664);
        if ((i10 & 6) == 0) {
            i11 = i10 | (i0Var.h(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            w0Var2 = w0Var;
            i11 |= i0Var.f(w0Var2) ? 2048 : 1024;
        } else {
            w0Var2 = w0Var;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.f(vVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.f(z4Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= i0Var.f(i1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= i0Var.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= i0Var.h(fVar) ? 536870912 : 268435456;
        }
        if (i0Var.T(i11 & 1, (306783379 & i11) != 306783378)) {
            i0Var.Y();
            if ((i10 & 1) != 0 && !i0Var.C()) {
                i0Var.W();
            }
            i0Var.q();
            i0Var.b0(1691738187);
            Object objQ = i0Var.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (objQ == fVar2) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            i0Var.p(false);
            long j = z2 ? vVar.f2757a : vVar.f2759c;
            long j4 = z2 ? vVar.f2758b : vVar.f2760d;
            i0Var.b0(1691921830);
            i0Var.p(false);
            long j10 = j;
            float f10 = 0;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar2) {
                objQ2 = new ab.d(8);
                i0Var.l0(objQ2);
            }
            v1.o oVarA = d3.p.a(oVar, false, (ej.c) objQ2);
            p1.e eVarD = p1.j.d(-535639973, new d0(j4, i1Var, fVar), i0Var);
            f1.v vVar2 = b7.f1945a;
            float f11 = 0;
            if (kVar == null) {
                i0Var.b0(-1701037204);
                Object objQ3 = i0Var.Q();
                if (objQ3 == fVar2) {
                    objQ3 = t.m1.p(i0Var);
                }
                kVar = (z.k) objQ3;
            } else {
                i0Var.b0(2023337163);
            }
            i0Var.p(false);
            f1.v vVar3 = b7.f1945a;
            float f12 = ((s3.f) i0Var.j(vVar3)).f14742a + f11;
            f1.s.b(new f1.r1[]{g1.f2116a.a(new c2.w(j4)), vVar3.a(new s3.f(f12))}, p1.j.d(849208527, new z6(oVarA, w0Var2, j10, f12, kVar, z2, aVar, f10, eVarD), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0(aVar, oVar, z2, w0Var, vVar, z4Var, i1Var, fVar, i10);
        }
    }

    public static final void c(v1.o oVar, c2.w0 w0Var, e0 e0Var, f0 f0Var, p1.e eVar, f1.i0 i0Var, int i10) {
        f0 f0Var2;
        int i11;
        f0 f0Var3;
        i0Var.c0(1359693790);
        int i12 = i10 | (i0Var.f(w0Var) ? 32 : 16) | (i0Var.f(e0Var) ? 256 : 128) | 25600;
        if (i0Var.T(i12 & 1, (74899 & i12) != 74898)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                i11 = i12 & (-7169);
                f0Var3 = new f0(e1.p.f5589b, e1.p.f5596i, e1.p.f5594g, e1.p.f5595h, e1.p.f5593f, e1.p.f5591d);
            } else {
                i0Var.W();
                i11 = i12 & (-7169);
                f0Var3 = f0Var;
            }
            i0Var.q();
            long j = e0Var.f2040a;
            long j4 = e0Var.f2041b;
            float f10 = f0Var3.f2081a;
            i0Var.b0(-1763481333);
            i0Var.b0(167751211);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = f1.s.A(new s3.f(f10));
                i0Var.l0(objQ);
            }
            i0Var.p(false);
            i0Var.p(false);
            b7.a(oVar, w0Var, j, j4, 0.0f, ((s3.f) ((f1.a1) objQ).getValue()).f14742a, p1.j.d(-97109725, new g0(eVar, 0), i0Var), i0Var, (i11 & 112) | 14155782, 16);
            f0Var2 = f0Var3;
        } else {
            i0Var.W();
            f0Var2 = f0Var;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.a(oVar, w0Var, e0Var, f0Var2, eVar, i10);
        }
    }

    public static final void d(v1.o oVar, float f10, long j, f1.i0 i0Var, int i10) {
        float fE;
        i0Var.c0(1562471785);
        if (i0Var.T(i10 & 1, (i10 & 147) != 146)) {
            i0Var.Y();
            if ((i10 & 1) != 0 && !i0Var.C()) {
                i0Var.W();
            }
            i0Var.q();
            if (s3.f.e(f10, 0.0f)) {
                i0Var.b0(-1258250053);
                fE = 1.0f / ((s3.c) i0Var.j(w2.f1.f18262h)).e();
                i0Var.p(false);
            } else {
                i0Var.b0(-1258183496);
                i0Var.p(false);
                fE = f10;
            }
            b0.r.a(v.n.f(b0.t1.e(fE, b0.t1.c(1.0f, oVar)), j, c2.e0.f2986b), i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r1(oVar, f10, j, i10, 0);
        }
    }

    public static final void e(v1.o oVar, float f10, long j, f1.i0 i0Var, final int i10, final int i11) {
        int i12;
        long jD;
        final float f11;
        final v1.o oVar2;
        final long j4;
        float f12;
        i0Var.c0(75144485);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= i0Var.c(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            jD = j;
            i12 |= ((i11 & 4) == 0 && i0Var.e(jD)) ? 256 : 128;
        } else {
            jD = j;
        }
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                if (i13 != 0) {
                    oVar = v1.l.f17564b;
                }
                f12 = i14 != 0 ? q1.f2597a : f10;
                if ((i11 & 4) != 0) {
                    float f13 = q1.f2597a;
                    i12 &= -897;
                    jD = x0.d(e1.n.f5581a, i0Var);
                }
            } else {
                i0Var.W();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                f12 = f10;
            }
            i0Var.q();
            v1.o oVarE = b0.t1.e(f12, b0.t1.c(1.0f, oVar));
            boolean z2 = ((((i12 & 896) ^ 384) > 256 && i0Var.e(jD)) || (i12 & 384) == 256) | ((i12 & 112) == 32);
            Object objQ = i0Var.Q();
            if (z2 || objQ == f1.m.f6385a) {
                objQ = new s1(f12, 1, jD);
                i0Var.l0(objQ);
            }
            v.n.a(oVarE, (ej.c) objQ, i0Var, 0);
            f11 = f12;
            j4 = jD;
            oVar2 = oVar;
        } else {
            i0Var.W();
            f11 = f10;
            oVar2 = oVar;
            j4 = jD;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.t1
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z4.e(oVar2, f11, j4, (f1.i0) obj, f1.s.O(i10 | 1), i11);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void f(int i10, w1 w1Var, c2.w0 w0Var, ej.a aVar, f1.i0 i0Var, v1.o oVar, boolean z2) {
        w1 w1Var2;
        c2.w0 w0Var2;
        v1.o oVar2;
        boolean z10;
        int i11;
        w1 w1Var3;
        c2.w0 w0VarB;
        int i12;
        boolean z11;
        v1.o oVar3;
        w1 w1Var4;
        i0Var.c0(1413012038);
        int i13 = i10 | (i0Var.h(aVar) ? 4 : 2) | 91568;
        if (i0Var.T(i13 & 1, (599187 & i13) != 599186)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                long j = ((c2.w) i0Var.j(g1.f2116a)).f3060a;
                w0 w0Var3 = (w0) i0Var.j(x0.f2845a);
                w1 w1Var5 = w0Var3.f2788b0;
                if (w1Var5 == null) {
                    long j4 = c2.w.f3057g;
                    w1Var5 = new w1(j4, j, j4, c2.w.c(j, e1.g0.f5405a));
                    w0Var3.f2788b0 = w1Var5;
                }
                long j10 = w1Var5.f2818b;
                if (c2.w.d(j10, j)) {
                    i11 = -465921;
                    w1Var3 = w1Var5;
                } else {
                    long jC = c2.w.c(j, e1.g0.f5405a);
                    long j11 = w1Var5.f2817a;
                    i11 = -465921;
                    long j12 = w1Var5.f2819c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (jC == 16) {
                        jC = w1Var5.f2820d;
                    }
                    w1Var3 = new w1(j11, j, j12, jC);
                }
                w0VarB = p5.b(e1.f0.f5400b, i0Var);
                i12 = i13 & i11;
                z11 = true;
                oVar3 = v1.l.f17564b;
                w1Var4 = w1Var3;
            } else {
                i0Var.W();
                i12 = i13 & (-465921);
                w1Var4 = w1Var;
                w0VarB = w0Var;
                oVar3 = oVar;
                z11 = z2;
            }
            i0Var.q();
            g(((i12 << 3) & 112) | 1769862, w1Var4, w0VarB, aVar, i0Var, oVar3, z11);
            w1Var2 = w1Var4;
            w0Var2 = w0VarB;
            z10 = z11;
            oVar2 = oVar3;
        } else {
            i0Var.W();
            w1Var2 = w1Var;
            w0Var2 = w0Var;
            oVar2 = oVar;
            z10 = z2;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0(i10, w1Var2, w0Var2, aVar, oVar2, z10);
        }
    }

    public static final void g(int i10, w1 w1Var, c2.w0 w0Var, ej.a aVar, f1.i0 i0Var, v1.o oVar, boolean z2) {
        int i11;
        v1.o oVar2;
        i0Var.c0(-1134296466);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.g(z2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.f(w0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.f(w1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.f(null) ? 131072 : 65536;
        }
        int i12 = 1572864 & i10;
        p1.e eVar = cb.a.f3146b;
        if (i12 == 0) {
            i11 |= i0Var.h(eVar) ? 1048576 : 524288;
        }
        int i13 = i11;
        if (i0Var.T(i13 & 1, (599187 & i13) != 599186)) {
            i0Var.b0(977045485);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = t.m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ;
            i0Var.p(false);
            t2.m mVar = g2.f2117a;
            oVar2 = oVar;
            v1.o oVarC = oVar2.c(v2.f2762b);
            float f10 = e1.f0.f5401c;
            long jC = x8.a.c(e1.f0.f5402d + f10 + f10, e1.f0.f5399a);
            b0.i0 i0Var2 = b0.t1.f1431a;
            v1.o oVarF = d1.i.f(v.n.k(v.n.f(z1.h.c(b0.t1.l(oVarC, s3.h.b(jC), s3.h.a(jC)), w0Var), z2 ? w1Var.f2817a : w1Var.f2819c, w0Var), kVar, a5.a(0.0f, 7), z2, new d3.j(0), aVar, 8));
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarF);
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            v2.e eVar2 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar2);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            f1.s.a(g1.f2116a.a(new c2.w(z2 ? w1Var.f2818b : w1Var.f2820d)), eVar, i0Var, ((i13 >> 15) & 112) | 8);
            i0Var.p(true);
        } else {
            oVar2 = oVar;
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new x1(i10, w1Var, w0Var, aVar, oVar2, z2);
        }
    }

    public static final void h(final ej.a aVar, final long j, final w3 w3Var, final t.c cVar, final p1.e eVar, f1.i0 i0Var, final int i10) {
        int i11;
        long j4;
        w3 w3Var2;
        int i12;
        s3.m mVar;
        int i13;
        boolean z2;
        boolean z10;
        Object obj;
        i0Var.c0(766784632);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j4 = j;
            i11 |= i0Var.e(j4) ? 32 : 16;
        } else {
            j4 = j;
        }
        if ((i10 & 384) == 0) {
            w3Var2 = w3Var;
            i11 |= i0Var.f(w3Var2) ? 256 : 128;
        } else {
            w3Var2 = w3Var;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? i0Var.f(cVar) : i0Var.h(cVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(eVar) ? 16384 : 8192;
        }
        if (i0Var.T(i11 & 1, (i11 & 9363) != 9362)) {
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
            s3.c cVar2 = (s3.c) i0Var.j(w2.f1.f18262h);
            s3.m mVar2 = (s3.m) i0Var.j(w2.f1.f18267n);
            f1.g0 g0VarJ = f1.s.J(i0Var);
            f1.a1 a1VarK = f1.s.K(eVar, i0Var);
            Object[] objArr = new Object[0];
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (objQ == obj2) {
                i12 = i11;
                objQ = new b6.j(12);
                i0Var.l0(objQ);
            } else {
                i12 = i11;
            }
            UUID uuid = (UUID) s1.k.c(objArr, (ej.a) objQ, i0Var);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj2) {
                objQ2 = f1.s.o(i0Var);
                i0Var.l0(objQ2);
            }
            qj.z zVar = (qj.z) objQ2;
            boolean zF = i0Var.f(view) | i0Var.f(cVar2);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj2) {
                mVar = mVar2;
                i13 = i12;
                z2 = true;
                z10 = false;
                c3 c3Var = new c3(aVar, w3Var2, j4, view, mVar, cVar2, uuid, cVar, zVar);
                p1.e eVar2 = new p1.e(new g0(a1VarK, 3), true, -1051373467);
                x2 x2Var = c3Var.B;
                x2Var.setParentCompositionContext(g0VarJ);
                x2Var.C.setValue(eVar2);
                x2Var.D = true;
                x2Var.d();
                i0Var.l0(c3Var);
                obj = c3Var;
            } else {
                mVar = mVar2;
                i13 = i12;
                z2 = true;
                z10 = false;
                obj = objQ3;
            }
            final c3 c3Var2 = (c3) obj;
            boolean zH = i0Var.h(c3Var2);
            Object objQ4 = i0Var.Q();
            if (zH || objQ4 == obj2) {
                objQ4 = new ab.k(c3Var2, 4);
                i0Var.l0(objQ4);
            }
            f1.s.c(c3Var2, (ej.c) objQ4, i0Var);
            int i14 = i13;
            boolean zH2 = i0Var.h(c3Var2) | ((i14 & 14) == 4 ? z2 : z10) | ((i14 & 896) == 256 ? z2 : z10) | ((i14 & 112) == 32 ? z2 : z10) | i0Var.d(mVar.ordinal());
            Object objQ5 = i0Var.Q();
            if (zH2 || objQ5 == obj2) {
                final s3.m mVar3 = mVar;
                objQ5 = new ej.a() { // from class: c1.x3
                    @Override // ej.a
                    public final Object a() {
                        c3Var2.e(aVar, w3Var, j, mVar3);
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(objQ5);
            }
            f1.s.j((ej.a) objQ5, i0Var);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.y3
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    z4.h(aVar, j, w3Var, cVar, eVar, (f1.i0) obj3, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void i(final ej.a aVar, v1.o oVar, boolean z2, c2.w0 w0Var, v vVar, b0.i1 i1Var, final ej.f fVar, f1.i0 i0Var, final int i10, final int i11) {
        ej.a aVar2;
        int i12;
        boolean z10;
        int i13;
        final v1.o oVar2;
        final c2.w0 w0Var2;
        final v vVar2;
        final b0.i1 i1Var2;
        final boolean z11;
        v vVar3;
        int i14;
        boolean z12;
        b0.i1 i1Var3;
        c2.w0 w0Var3;
        v1.o oVar3;
        v vVar4;
        i0Var.c0(-1061374109);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i12 = i10 | (i0Var.h(aVar2) ? 4 : 2);
        } else {
            aVar2 = aVar;
            i12 = i10;
        }
        int i15 = i12 | 48;
        int i16 = i11 & 4;
        if (i16 != 0) {
            i13 = i12 | 432;
            z10 = z2;
        } else {
            z10 = z2;
            i13 = i15 | (i0Var.g(z10) ? 256 : 128);
        }
        int i17 = i13 | 115024896;
        if (i0Var.T(i17 & 1, (306783379 & i17) != 306783378)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                boolean z13 = i16 == 0 ? z10 : true;
                b0.k1 k1Var = w.f2782a;
                c2.w0 w0VarB = p5.b(e1.h.f5407b, i0Var);
                w0 w0Var4 = (w0) i0Var.j(x0.f2845a);
                v vVar5 = w0Var4.W;
                if (vVar5 == null) {
                    long j = c2.w.f3057g;
                    vVar3 = new v(j, x0.c(w0Var4, e1.l.D), j, c2.w.c(x0.c(w0Var4, e1.i0.f5439a), e1.i0.f5440b));
                    w0Var4.W = vVar3;
                } else {
                    vVar3 = vVar5;
                }
                i14 = i17 & (-64513);
                z12 = z13;
                i1Var3 = w.f2782a;
                w0Var3 = w0VarB;
                oVar3 = v1.l.f17564b;
                vVar4 = vVar3;
            } else {
                i0Var.W();
                w0Var3 = w0Var;
                vVar4 = vVar;
                i1Var3 = i1Var;
                i14 = i17 & (-64513);
                z12 = z10;
                oVar3 = oVar;
            }
            i0Var.q();
            b(aVar2, oVar3, z12, w0Var3, vVar4, null, i1Var3, fVar, i0Var, i14 & 2147483646);
            w0Var2 = w0Var3;
            i1Var2 = i1Var3;
            oVar2 = oVar3;
            vVar2 = vVar4;
            z11 = z12;
        } else {
            i0Var.W();
            oVar2 = oVar;
            w0Var2 = w0Var;
            vVar2 = vVar;
            i1Var2 = i1Var;
            z11 = z10;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: c1.a0
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z4.i(aVar, oVar2, z11, w0Var2, vVar2, i1Var2, fVar, (f1.i0) obj, f1.s.O(i10 | 1), i11);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void j(v1.o oVar, float f10, long j, f1.i0 i0Var, int i10) {
        i0Var.c0(-1534852205);
        int i11 = i10 | 54;
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                f10 = q1.f2597a;
                oVar = v1.l.f17564b;
            } else {
                i0Var.W();
            }
            i0Var.q();
            v1.o oVarO = b0.t1.o(f10, oVar.c(b0.t1.f1432b));
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new s1(f10, 0, j);
                i0Var.l0(objQ);
            }
            v.n.a(oVarO, (ej.c) objQ, i0Var, 0);
        } else {
            i0Var.W();
        }
        v1.o oVar2 = oVar;
        float f11 = f10;
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r1(oVar2, f11, j, i10, 1);
        }
    }

    public static final t.u0 k(b4 b4Var, e1.u uVar) {
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            ((a4) b4Var).getClass();
            t.u0 u0Var = a4.f1882b;
            fj.l.d(u0Var, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return u0Var;
        }
        if (iOrdinal == 1) {
            ((a4) b4Var).getClass();
            t.u0 u0Var2 = a4.f1883c;
            fj.l.d(u0Var2, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return u0Var2;
        }
        if (iOrdinal == 2) {
            ((a4) b4Var).getClass();
            t.u0 u0Var3 = a4.f1884d;
            fj.l.d(u0Var3, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return u0Var3;
        }
        if (iOrdinal == 3) {
            ((a4) b4Var).getClass();
            t.u0 u0Var4 = a4.f1885e;
            fj.l.d(u0Var4, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return u0Var4;
        }
        if (iOrdinal == 4) {
            ((a4) b4Var).getClass();
            t.u0 u0Var5 = a4.f1886f;
            fj.l.d(u0Var5, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return u0Var5;
        }
        if (iOrdinal != 5) {
            throw new b3.e();
        }
        ((a4) b4Var).getClass();
        t.u0 u0Var6 = a4.f1887g;
        fj.l.d(u0Var6, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return u0Var6;
    }

    public static final t.u0 l(e1.u uVar, f1.i0 i0Var) {
        return k((b4) i0Var.j(u2.f2738a), uVar);
    }
}
