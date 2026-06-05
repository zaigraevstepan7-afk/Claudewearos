package lb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import c1.v7;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f10164a = new p1.e(new d1.a(3), false, 1313022634);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f10165b = new p1.e(new d1.a(4), false, -2090870040);

    /* renamed from: c, reason: collision with root package name */
    public static final p1.e f10166c = new p1.e(new g3.z(24), false, -1615082749);

    /* renamed from: d, reason: collision with root package name */
    public static final p1.e f10167d = new p1.e(new g3.z(25), false, -3103685);

    /* renamed from: e, reason: collision with root package name */
    public static final p1.e f10168e = new p1.e(new d1.a(14), false, 2055834195);

    /* renamed from: f, reason: collision with root package name */
    public static final p1.e f10169f = new p1.e(new d1.a(15), false, -311160420);

    /* renamed from: g, reason: collision with root package name */
    public static final p1.e f10170g = new p1.e(new d1.a(5), false, 1625487922);

    /* renamed from: h, reason: collision with root package name */
    public static final p1.e f10171h = new p1.e(new d1.a(6), false, -1773260397);

    /* renamed from: i, reason: collision with root package name */
    public static final p1.e f10172i = new p1.e(new d1.a(7), false, -1790547947);
    public static final p1.e j = new p1.e(new g3.z(26), false, 1549204698);

    /* renamed from: k, reason: collision with root package name */
    public static final p1.e f10173k = new p1.e(new d1.a(8), false, -821428558);

    /* renamed from: l, reason: collision with root package name */
    public static final p1.e f10174l = new p1.e(new d1.a(9), false, -838716108);

    /* renamed from: m, reason: collision with root package name */
    public static final p1.e f10175m = new p1.e(new g3.z(27), false, -1793930759);

    /* renamed from: n, reason: collision with root package name */
    public static final p1.e f10176n = new p1.e(new g3.z(28), false, 344909114);

    /* renamed from: o, reason: collision with root package name */
    public static final p1.e f10177o = new p1.e(new g3.z(29), false, 789545625);

    /* renamed from: p, reason: collision with root package name */
    public static final p1.e f10178p = new p1.e(new d1.a(10), false, 258262295);

    /* renamed from: q, reason: collision with root package name */
    public static final p1.e f10179q = new p1.e(new d1.a(11), false, 364627072);

    /* renamed from: r, reason: collision with root package name */
    public static final p1.e f10180r = new p1.e(new d1.a(12), false, -338769185);

    /* renamed from: s, reason: collision with root package name */
    public static final p1.e f10181s = new p1.e(new d1.a(13), false, 107091144);

    /* renamed from: t, reason: collision with root package name */
    public static final p1.e f10182t = new p1.e(new d(0), false, -48309934);

    /* renamed from: u, reason: collision with root package name */
    public static final p1.e f10183u = new p1.e(new d1.a(16), false, -402744524);

    /* renamed from: v, reason: collision with root package name */
    public static final p1.e f10184v = new p1.e(new d1.a(17), false, 1924417846);

    /* renamed from: w, reason: collision with root package name */
    public static final p1.e f10185w = new p1.e(new d(1), false, -1947113285);

    /* renamed from: x, reason: collision with root package name */
    public static final p1.e f10186x = new p1.e(new d(2), false, -1372973492);

    public static final void a(ej.a aVar, f1.i0 i0Var, int i10) {
        int i11;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(1129854717);
        if ((i10 & 6) == 0) {
            i11 = i10 | (i0Var2.h(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = t.m1.p(i0Var2);
            }
            z.k kVar = (z.k) objQ;
            f1.q2 q2VarB = t.e.b(((Boolean) u1.p.e(kVar, i0Var2, 6).getValue()).booleanValue() ? 0.97f : 1.0f, t.d.t(160, 0, t.y.f15326a, 2), "post_setup_done_scale", null, i0Var2, 3072, 20);
            v1.o oVarE = b0.t1.e(52, b0.t1.c(1.0f, v1.l.f17564b));
            boolean zF = i0Var2.f(q2VarB);
            Object objQ2 = i0Var2.Q();
            if (zF || objQ2 == fVar) {
                objQ2 = new ab.z(q2VarB, 7);
                i0Var2.l0(objQ2);
            }
            v1.o oVarK = v.n.k(v.n.f(y8.f.c(16, c2.e0.q(oVarE, (ej.c) objQ2)), c2.e0.d(4278221567L), c2.e0.f2986b), kVar, null, false, null, aVar, 28);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarK);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            v7.a("Done", null, c2.w.f3054d, hj.a.x(17), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.i(i10, 5, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final mi.p r48, final ej.a r49, boolean r50, ej.a r51, boolean r52, float r53, long r54, boolean r56, boolean r57, float r58, t.j r59, ej.c r60, boolean r61, boolean r62, final int r63, final p1.e r64, f1.i0 r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.c.b(mi.p, ej.a, boolean, ej.a, boolean, float, long, boolean, boolean, float, t.j, ej.c, boolean, boolean, int, p1.e, f1.i0, int, int, int):void");
    }

    public static final void c(final boolean z2, final g gVar, final mi.p pVar, final ej.a aVar, final ej.a aVar2, f1.i0 i0Var, final int i10) {
        mi.p pVar2;
        ej.a aVar3;
        f1.i0 i0Var2;
        f1.t1 t1VarU;
        ej.e eVar;
        int i11;
        v1.l lVar;
        v2.e eVar2;
        int i12;
        kj.d dVar;
        fj.l.f(aVar, "onIconSizeChanged");
        fj.l.f(aVar2, "onDone");
        i0Var.c0(-1716121471);
        int i13 = (i0Var.h(aVar2) ? 16384 : 8192) | i10 | (i0Var.g(z2) ? 4 : 2) | (i0Var.h(gVar) ? 32 : 16) | (i0Var.f(pVar) ? 256 : 128) | (i0Var.h(aVar) ? 2048 : 1024);
        if (!i0Var.T(i13 & 1, (i13 & 9363) != 9362)) {
            pVar2 = pVar;
            aVar3 = aVar2;
            i0Var2 = i0Var;
            i0Var2.W();
        } else {
            if (!z2) {
                t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i14 = 0;
                    eVar = new ej.e(z2, gVar, pVar, aVar, aVar2, i10, i14) { // from class: lb.s3

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f10649a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f10650b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ g f10651c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ mi.p f10652d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ ej.a f10653e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ ej.a f10654f;

                        {
                            this.f10649a = i14;
                        }

                        @Override // ej.e
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f10649a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iO = f1.s.O(65);
                                    c.c(this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f, (f1.i0) obj, iO);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iO2 = f1.s.O(65);
                                    c.c(this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f, (f1.i0) obj, iO2);
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    t1VarU.f6456d = eVar;
                }
                return;
            }
            pVar2 = pVar;
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = new b6.j(19);
                i0Var.l0(objQ);
            }
            wd.a.a(true, (ej.a) objQ, i0Var, 54, 0);
            s3.c cVar = (s3.c) i0Var.j(w2.f1.f18262h);
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ2);
            }
            f1.a1 a1Var = (f1.a1) objQ2;
            boolean zF = i0Var.f(cVar);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = Float.valueOf(-cVar.w0(380));
                i0Var.l0(objQ3);
            }
            float fFloatValue = ((Number) objQ3).floatValue();
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                fFloatValue = 0.0f;
            }
            f1.q2 q2VarB = t.e.b(fFloatValue, t.d.s(1.0f, 400.0f, null, 4), "post_setup_top_sheet_y", null, i0Var, 3120, 20);
            Object objQ4 = i0Var.Q();
            if (objQ4 == obj) {
                objQ4 = new q0(1, a1Var, null);
                i0Var.l0(objQ4);
            }
            f1.s.f((ej.e) objQ4, i0Var, pi.o.f13011a);
            b0.i0 i0Var3 = b0.t1.f1433c;
            Object objQ5 = i0Var.Q();
            if (objQ5 == obj) {
                objQ5 = t.m1.p(i0Var);
            }
            z.k kVar = (z.k) objQ5;
            Object objQ6 = i0Var.Q();
            if (objQ6 == obj) {
                objQ6 = new b6.j(19);
                i0Var.l0(objQ6);
            }
            v1.o oVarK = v.n.k(i0Var3, kVar, null, false, null, (ej.a) objQ6, 28);
            t2.q0 q0VarD = b0.r.d(v1.b.f17548b, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarK);
            v2.h.f17668w.getClass();
            ej.a aVar4 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar4);
            } else {
                i0Var.o0();
            }
            v2.e eVar3 = v2.g.f17649f;
            f1.s.M(eVar3, i0Var, q0VarD);
            v2.e eVar4 = v2.g.f17648e;
            f1.s.M(eVar4, i0Var, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar5 = v2.g.f17650g;
            f1.s.w(i0Var, numValueOf, eVar5);
            v2.d dVar2 = v2.g.f17651h;
            f1.s.I(dVar2, i0Var);
            v2.e eVar6 = v2.g.f17647d;
            f1.s.M(eVar6, i0Var, oVarC);
            ab.d dVar3 = b0.d.f1295e;
            v1.l lVar2 = v1.l.f17564b;
            v1.o oVarC2 = b0.t1.c(1.0f, b0.t1.p(b0.d.u(b0.d.C(lVar2, dVar3), 14, 10), Float.NaN, 520));
            boolean zF2 = i0Var.f(q2VarB);
            Object objQ7 = i0Var.Q();
            if (zF2 || objQ7 == obj) {
                objQ7 = new ab.z(q2VarB, 6);
                i0Var.l0(objQ7);
            }
            v1.o oVarQ = c2.e0.q(oVarC2, (ej.c) objQ7);
            float f10 = 30;
            v1.o oVarC3 = y8.f.c(f10, oVarQ);
            Object objQ8 = i0Var.Q();
            if (objQ8 == obj) {
                long j4 = c2.w.f3054d;
                i11 = i13;
                lVar = lVar2;
                eVar2 = eVar6;
                objQ8 = new ia.a(0.001f, 25, c2.w.c(j4, 0.88f), yd.f.K(new mi.s(c2.w.c(j4, 0.88f))), new mi.s(c2.w.c(j4, 0.88f)));
                i0Var.l0(objQ8);
            } else {
                i11 = i13;
                lVar = lVar2;
                eVar2 = eVar6;
            }
            float f11 = 18;
            v1.o oVarU = b0.d.u(a.a.L(a.a.f(oVarC3, pVar2, (ia.a) objQ8, i0Var), new ga.c(f10, 1), 0L, (float) 1.5d, 0.0f, 90.0f, 106), 16, f11);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
            int iHashCode2 = Long.hashCode(i0Var.T);
            f1.n1 n1VarL2 = i0Var.l();
            v1.o oVarC4 = v1.a.c(i0Var, oVarU);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar4);
            } else {
                i0Var.o0();
            }
            f1.s.M(eVar3, i0Var, b0VarA);
            f1.s.M(eVar4, i0Var, n1VarL2);
            gk.b.t(iHashCode2, i0Var, eVar5, i0Var, dVar2);
            f1.s.M(eVar2, i0Var, oVarC4);
            Object objQ9 = i0Var.Q();
            if (objQ9 == obj) {
                objQ9 = y8.f.a(gVar.f(), i0Var);
            }
            f1.f1 f1Var = (f1.f1) objQ9;
            Object objQ10 = i0Var.Q();
            if (objQ10 == obj) {
                Object g1Var = new f1.g1(gVar.q());
                i0Var.l0(g1Var);
                objQ10 = g1Var;
            }
            f1.g1 g1Var2 = (f1.g1) objQ10;
            Object objQ11 = i0Var.Q();
            if (objQ11 == obj) {
                objQ11 = y8.f.a(gVar.q(), i0Var);
            }
            f1.f1 f1Var2 = (f1.f1) objQ11;
            String strM = gk.b.m((int) f1Var.g(), " dp");
            float fG = f1Var.g();
            kj.d dVar4 = new kj.d(0.0f, 32.0f);
            boolean zH = i0Var.h(gVar);
            Object objQ12 = i0Var.Q();
            if (zH || objQ12 == obj) {
                objQ12 = new d1(gVar, f1Var, 6);
                i0Var.l0(objQ12);
            }
            d("Dock icon gap", strM, fG, dVar4, (ej.c) objQ12, i0Var, 6);
            v1.l lVar3 = lVar;
            b0.d.e(i0Var, b0.t1.e(f11, lVar3));
            String strM2 = gk.b.m(g1Var2.g(), "%");
            float fG2 = f1Var2.g();
            kj.d dVar5 = new kj.d(50.0f, 100.0f);
            int i15 = i11;
            boolean zH2 = i0Var.h(gVar) | ((i15 & 7168) == 2048);
            Object objQ13 = i0Var.Q();
            if (zH2 || objQ13 == obj) {
                i12 = i15;
                dVar = dVar5;
                Object tVar = new e0.t(gVar, aVar, f1Var2, g1Var2, 7);
                i0Var.l0(tVar);
                objQ13 = tVar;
            } else {
                dVar = dVar5;
                i12 = i15;
            }
            i0Var2 = i0Var;
            d("Icon size in cell", strM2, fG2, dVar, (ej.c) objQ13, i0Var2, 6);
            b0.d.e(i0Var2, b0.t1.e(22, lVar3));
            aVar3 = aVar2;
            a(aVar3, i0Var2, (i12 >> 12) & 14);
            i0Var2.p(true);
            i0Var2.p(true);
        }
        t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final int i16 = 1;
            final mi.p pVar3 = pVar2;
            final ej.a aVar5 = aVar3;
            eVar = new ej.e(z2, gVar, pVar3, aVar, aVar5, i10, i16) { // from class: lb.s3

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f10649a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f10650b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ g f10651c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ mi.p f10652d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ej.a f10653e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ej.a f10654f;

                {
                    this.f10649a = i16;
                }

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj22) {
                    switch (this.f10649a) {
                        case 0:
                            ((Integer) obj22).getClass();
                            int iO = f1.s.O(65);
                            c.c(this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f, (f1.i0) obj2, iO);
                            break;
                        default:
                            ((Integer) obj22).getClass();
                            int iO2 = f1.s.O(65);
                            c.c(this.f10650b, this.f10651c, this.f10652d, this.f10653e, this.f10654f, (f1.i0) obj2, iO2);
                            break;
                    }
                    return pi.o.f13011a;
                }
            };
            t1VarU.f6456d = eVar;
        }
    }

    public static final void d(String str, String str2, float f10, kj.d dVar, ej.c cVar, f1.i0 i0Var, int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(1827088118);
        int i11 = i10 | (i0Var2.f(str2) ? 32 : 16) | (i0Var2.c(f10) ? 256 : 128) | (i0Var2.f(dVar) ? 2048 : 1024) | (i0Var2.h(cVar) ? 16384 : 8192);
        if (i0Var2.T(i11 & 1, (i11 & 9363) != 9362)) {
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = v1.a.c(i0Var2, lVar);
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
            v7.a(str, null, c2.e0.d(4278190080L), hj.a.x(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262122);
            int i12 = i11 >> 3;
            v7.a(str2, null, c2.e0.d(4287532691L), hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i12 & 14) | 24960, 0, 262122);
            i0Var2 = i0Var;
            i0Var2.p(true);
            b0.d.e(i0Var2, b0.t1.e(8, lVar));
            boolean z2 = (i11 & 896) == 256;
            Object objQ = i0Var2.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (z2 || objQ == fVar2) {
                objQ = new n1(f10, 0);
                i0Var2.l0(objQ);
            }
            ej.a aVar = (ej.a) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar2) {
                objQ2 = new la.a(7);
                i0Var2.l0(objQ2);
            }
            mk.b.b(aVar, cVar, dVar, 0.01f, gi.f.b((ej.c) objQ2, i0Var2), null, null, null, i0Var2, ((i11 >> 9) & 112) | 3072 | (i12 & 896), 224);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new q1(str, str2, f10, dVar, cVar, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0d89  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(ej.a r128, f1.i0 r129, int r130) {
        /*
            Method dump skipped, instructions count: 3645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.c.e(ej.a, f1.i0, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (t.c.d(r1, r2, r3, null, null, r6, 12) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(t.c r9, ti.c r10) {
        /*
            boolean r0 = r10 instanceof lb.s0
            if (r0 == 0) goto L14
            r0 = r10
            lb.s0 r0 = (lb.s0) r0
            int r1 = r0.f10640c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f10640c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            lb.s0 r0 = new lb.s0
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f10639b
            ui.a r0 = ui.a.f17085a
            int r1 = r6.f10640c
            r2 = 1
            r8 = 2
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L34
            if (r1 != r8) goto L2c
            uk.c.R(r10)
            goto L7e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            t.c r9 = r6.f10638a
            uk.c.R(r10)
            r1 = r9
            goto L5f
        L3b:
            uk.c.R(r10)
            r10 = r2
            java.lang.Float r2 = new java.lang.Float
            r1 = 1130102784(0x435c0000, float:220.0)
            r2.<init>(r1)
            r1 = 0
            t.s r3 = t.y.f15326a
            r4 = 160(0xa0, float:2.24E-43)
            t.o1 r3 = t.d.t(r4, r1, r3, r8)
            r6.f10638a = r9
            r6.f10640c = r10
            r4 = 0
            r5 = 0
            r7 = 12
            r1 = r9
            java.lang.Object r9 = t.c.d(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L5f
            goto L7d
        L5f:
            java.lang.Float r2 = new java.lang.Float
            r9 = 0
            r2.<init>(r9)
            r9 = 1139802112(0x43f00000, float:480.0)
            r10 = 4
            r3 = 1057300152(0x3f051eb8, float:0.52)
            r4 = 0
            t.u0 r3 = t.d.s(r3, r9, r4, r10)
            r6.f10638a = r4
            r6.f10640c = r8
            r5 = 0
            r7 = 12
            java.lang.Object r9 = t.c.d(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L7e
        L7d:
            return r0
        L7e:
            pi.o r9 = pi.o.f13011a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.c.f(t.c, ti.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e A[LOOP:0: B:20:0x00bb->B:42:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r10v6, types: [ej.a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [ej.a] */
    /* JADX WARN: Type inference failed for: r12v7, types: [ej.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0157 -> B:41:0x015a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(android.content.Context r21, java.lang.String r22, java.lang.String r23, bb.b r24, c1.b8 r25, jb.a r26, vi.c r27) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.c.g(android.content.Context, java.lang.String, java.lang.String, bb.b, c1.b8, jb.a, vi.c):java.lang.Object");
    }

    public static final void h(Context context, File file) throws IOException {
        i4.d dVarC = FileProvider.c(context, context.getPackageName() + ".fileprovider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : dVarC.f8343b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(t.m1.i("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(dVarC.f8342a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriBuild, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
