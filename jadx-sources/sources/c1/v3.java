package c1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2763a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2764b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2765c = c2.e0.h(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0316 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final ej.a r30, v1.o r31, c1.x5 r32, float r33, boolean r34, c2.w0 r35, long r36, long r38, float r40, long r41, ej.e r43, ej.e r44, c1.w3 r45, final p1.e r46, f1.i0 r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.v3.a(ej.a, v1.o, c1.x5, float, boolean, c2.w0, long, long, float, long, ej.e, ej.e, c1.w3, p1.e, f1.i0, int, int, int):void");
    }

    public static final void b(final t.c cVar, final qj.z zVar, final ej.a aVar, final ej.c cVar2, final v1.o oVar, final x5 x5Var, final float f10, final boolean z2, final c2.w0 w0Var, final long j, final long j4, final float f11, final ej.e eVar, final ej.e eVar2, final p1.e eVar3, f1.i0 i0Var, final int i10) {
        i0Var.c0(-37400432);
        int i11 = i10 | (i0Var.h(cVar) ? 32 : 16) | (i0Var.h(zVar) ? 256 : 128) | (i0Var.h(aVar) ? 2048 : 1024) | (i0Var.h(cVar2) ? 16384 : 8192) | (i0Var.f(oVar) ? 131072 : 65536) | (i0Var.f(x5Var) ? 1048576 : 524288) | (i0Var.c(f10) ? 8388608 : 4194304) | (i0Var.g(z2) ? 67108864 : 33554432) | (i0Var.f(w0Var) ? 536870912 : 268435456);
        int i12 = (i0Var.e(j) ? 4 : 2) | (i0Var.e(j4) ? 32 : 16) | (i0Var.c(f11) ? 256 : 128) | (i0Var.h(eVar) ? 2048 : 1024) | (i0Var.h(eVar2) ? 16384 : 8192) | (i0Var.h(eVar3) ? 131072 : 65536);
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 74899) == 74898) ? false : true)) {
            i0Var.Y();
            if ((i10 & 1) != 0 && !i0Var.C()) {
                i0Var.W();
            }
            i0Var.q();
            String strI = d1.i.i(R.string.m3c_bottom_sheet_pane_title, i0Var);
            v1.o oVarC = b0.t1.c(1.0f, b0.t1.p(b0.w.f1450a.b(oVar, v1.b.f17548b), Float.NaN, f10));
            v1.o oVarA = v1.l.f17564b;
            Object obj = f1.m.f6385a;
            if (z2) {
                i0Var.b0(-1582035383);
                boolean z10 = (((i11 & 3670016) ^ 1572864) > 1048576 && i0Var.f(x5Var)) || (i11 & 1572864) == 1048576;
                Object objQ = i0Var.Q();
                if (z10 || objQ == obj) {
                    x.o1 o1Var = x.o1.f19664a;
                    float f12 = t5.f2716a;
                    objQ = new s5(x5Var, cVar2);
                    i0Var.l0(objQ);
                }
                oVarA = o2.f.a(oVarA, (o2.a) objQ, null);
                i0Var.p(false);
            } else {
                i0Var.b0(-1582020872);
                i0Var.p(false);
            }
            v1.o oVarC2 = oVarC.c(oVarA);
            d1.q qVar = x5Var.f2867d;
            d1.q qVar2 = x5Var.f2867d;
            x.o1 o1Var2 = x.o1.f19664a;
            int i13 = (i11 & 3670016) ^ 1572864;
            boolean z11 = (i13 > 1048576 && i0Var.f(x5Var)) || (i11 & 1572864) == 1048576;
            Object objQ2 = i0Var.Q();
            if (z11 || objQ2 == obj) {
                objQ2 = new b0.g2(x5Var, 4);
                i0Var.l0(objQ2);
            }
            v1.o oVarG = d1.i.g(oVarC2, qVar, (ej.e) objQ2);
            d1.p pVar = qVar2.f4559f;
            boolean z12 = z2 && x5Var.d();
            boolean z13 = qVar2.f4564l.getValue() != null;
            boolean z14 = (i11 & 57344) == 16384;
            Object objQ3 = i0Var.Q();
            if (z14 || objQ3 == obj) {
                objQ3 = new o3(cVar2, null);
                i0Var.l0(objQ3);
            }
            v1.o oVarA2 = x.p0.a(oVarG, pVar, o1Var2, z12, null, z13, (ej.f) objQ3, false, 168);
            boolean zF = i0Var.f(strI);
            Object objQ4 = i0Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new q(strI, 3);
                i0Var.l0(objQ4);
            }
            v1.o oVarA3 = d3.p.a(oVarA2, false, (ej.c) objQ4);
            int iG = (int) qVar2.j.g();
            if (iG < 0) {
                iG = 0;
            }
            v1.o oVarJ = b0.d.j(oVarA3, b0.d.f(iG, 13));
            boolean z15 = ((i13 > 1048576 && i0Var.f(x5Var)) || (i11 & 1572864) == 1048576) | ((i11 & 112) == 32 || i0Var.h(cVar));
            Object objQ5 = i0Var.Q();
            if (z15 || objQ5 == obj) {
                objQ5 = new b0.c1(6, x5Var, cVar);
                i0Var.l0(objQ5);
            }
            int i14 = i12 << 6;
            b7.a(c2.e0.q(c2.e0.q(oVarJ, (ej.c) objQ5), new u(x5Var, 0)), w0Var, j, j4, f11, 0.0f, p1.j.d(728743275, new t3(eVar2, cVar, x5Var, eVar, eVar3, aVar, zVar, z2), i0Var), i0Var, ((i11 >> 24) & 112) | 12582912 | (i14 & 896) | (i14 & 7168) | (i14 & 57344), 96);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(zVar, aVar, cVar2, oVar, x5Var, f10, z2, w0Var, j, j4, f11, eVar, eVar2, eVar3, i10) { // from class: c1.g3
                public final /* synthetic */ boolean A;
                public final /* synthetic */ c2.w0 B;
                public final /* synthetic */ long C;
                public final /* synthetic */ long D;
                public final /* synthetic */ float E;
                public final /* synthetic */ ej.e F;
                public final /* synthetic */ ej.e G;
                public final /* synthetic */ p1.e H;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ qj.z f2121b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.a f2122c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ej.c f2123d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ v1.o f2124e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ x5 f2125f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f2126z;

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(71);
                    v3.b(this.f2120a, this.f2121b, this.f2122c, this.f2123d, this.f2124e, this.f2125f, this.f2126z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (f1.i0) obj2, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(final long j, final ej.a aVar, final boolean z2, final boolean z10, f1.i0 i0Var, final int i10) {
        i0Var.c0(-391613911);
        int i11 = i10 | (i0Var.e(j) ? 4 : 2) | (i0Var.h(aVar) ? 32 : 16) | (i0Var.g(z2) ? 256 : 128) | (i0Var.g(z10) ? 2048 : 1024);
        if (!i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            i0Var.W();
        } else if (j != 16) {
            i0Var.b0(-1438582326);
            f1.q2 q2VarB = t.e.b(z2 ? 1.0f : 0.0f, z4.l(e1.u.f5671c, i0Var), null, null, i0Var, 0, 28);
            Object objI = d1.i.i(R.string.close_sheet, i0Var);
            v1.o oVarA = v1.l.f17564b;
            Object obj = f1.m.f6385a;
            if (z10) {
                i0Var.b0(-1438283579);
                int i12 = i11 & 112;
                boolean z11 = i12 == 32;
                Object objQ = i0Var.Q();
                if (z11 || objQ == obj) {
                    objQ = new u3(0, aVar);
                    i0Var.l0(objQ);
                }
                v1.o oVarA2 = p2.k0.a(oVarA, aVar, (PointerInputEventHandler) objQ);
                boolean zF = (i12 == 32) | i0Var.f(objI);
                Object objQ2 = i0Var.Q();
                if (zF || objQ2 == obj) {
                    objQ2 = new b0.c1(5, objI, aVar);
                    i0Var.l0(objQ2);
                }
                oVarA = d3.p.a(oVarA2, true, (ej.c) objQ2);
                i0Var.p(false);
            } else {
                i0Var.b0(-1437857391);
                i0Var.p(false);
            }
            v1.o oVarC = b0.t1.f1433c.c(oVarA);
            boolean zF2 = i0Var.f(q2VarB) | ((i11 & 14) == 4);
            Object objQ3 = i0Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new e3(j, q2VarB, 0);
                i0Var.l0(objQ3);
            }
            v.n.a(oVarC, (ej.c) objQ3, i0Var, 0);
            i0Var.p(false);
        } else {
            i0Var.b0(-1437676103);
            i0Var.p(false);
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(j, aVar, z2, z10, i10) { // from class: c1.f3

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f2087a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ej.a f2088b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f2089c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f2090d;

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(1);
                    v3.c(this.f2087a, this.f2088b, this.f2089c, this.f2090d, (f1.i0) obj2, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final float d(c2.f0 f0Var, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f0Var.a() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (u3.c.l(0.0f, Math.min(f0Var.e() * f2763a, fIntBitsToFloat), f10) / fIntBitsToFloat);
    }

    public static final float e(c2.f0 f0Var, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f0Var.a() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (u3.c.l(0.0f, Math.min(f0Var.e() * f2764b, fIntBitsToFloat), f10) / fIntBitsToFloat);
    }

    public static final x5 f(ej.c cVar, f1.i0 i0Var, int i10, int i11) {
        y5 y5Var = y5.f2911a;
        boolean z2 = true;
        boolean z10 = (i11 & 1) == 0;
        int i12 = i11 & 2;
        Object obj = f1.m.f6385a;
        if (i12 != 0) {
            Object objQ = i0Var.Q();
            if (objQ == obj) {
                objQ = new ab.d(12);
                i0Var.l0(objQ);
            }
            cVar = (ej.c) objQ;
        }
        ej.c cVar2 = cVar;
        int i13 = (i10 & 14) | 384;
        float f10 = t5.f2716a;
        float f11 = t.f2693c;
        float f12 = t.f2694d;
        Object obj2 = (s3.c) i0Var.j(w2.f1.f18262h);
        boolean zF = i0Var.f(obj2) | i0Var.c(f11);
        Object objQ2 = i0Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new q5(obj2, f11, 0);
            i0Var.l0(objQ2);
        }
        ej.a aVar = (ej.a) objQ2;
        boolean zF2 = i0Var.f(obj2) | i0Var.c(f12);
        Object objQ3 = i0Var.Q();
        if (zF2 || objQ3 == obj) {
            objQ3 = new q5(obj2, f12, 1);
            i0Var.l0(objQ3);
        }
        ej.a aVar2 = (ej.a) objQ3;
        Object[] objArr = {Boolean.valueOf(z10), cVar2, Boolean.FALSE};
        qh.c cVar3 = new qh.c(4, new p4(4), new u5(z10, aVar, aVar2, cVar2));
        if ((((i13 & 14) ^ 6) <= 4 || !i0Var.g(z10)) && (i13 & 6) != 4) {
            z2 = false;
        }
        boolean zF3 = i0Var.f(aVar) | z2 | i0Var.f(aVar2) | i0Var.f(cVar2) | i0Var.g(false);
        Object objQ4 = i0Var.Q();
        if (zF3 || objQ4 == obj) {
            Object r5Var = new r5(0, aVar, aVar2, y5Var, cVar2, z10);
            i0Var.l0(r5Var);
            objQ4 = r5Var;
        }
        return (x5) s1.k.e(objArr, cVar3, (ej.a) objQ4, i0Var, 0);
    }
}
