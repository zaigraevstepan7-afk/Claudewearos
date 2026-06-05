package ab;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b0.o1;
import b0.q1;
import c1.v7;
import c1.z4;
import c2.e0;
import com.anonlab.voidlauncher.R;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.t1;
import java.util.List;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final float f351a = 160;

    /* renamed from: b, reason: collision with root package name */
    public static final float f352b = 220;

    /* renamed from: c, reason: collision with root package name */
    public static final float f353c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static final float f354d;

    /* renamed from: e, reason: collision with root package name */
    public static final ga.c f355e;

    static {
        float f10 = 18;
        f354d = f10;
        f355e = new ga.c(f10, 1);
    }

    public static final void a(final a aVar, final a aVar2, final ej.a aVar3, final ej.a aVar4, final ej.a aVar5, final ej.a aVar6, final ej.a aVar7, final ej.a aVar8, final ej.a aVar9, i0 i0Var, final int i10) {
        t1 t1VarU;
        ej.e eVar;
        fj.l.f(aVar3, "onDismiss");
        fj.l.f(aVar4, "onEditClick");
        fj.l.f(aVar5, "onShareClick");
        fj.l.f(aVar6, "onDeleteClick");
        fj.l.f(aVar7, "onAppLockClick");
        i0Var.c0(742653529);
        int i11 = i10 | (i0Var.h(aVar) ? 4 : 2) | (i0Var.h(aVar2) ? 32 : 16) | (i0Var.h(aVar4) ? 2048 : 1024) | (i0Var.h(aVar5) ? 16384 : 8192) | (i0Var.h(aVar6) ? 131072 : 65536) | (i0Var.h(aVar8) ? 8388608 : 4194304) | (i0Var.h(aVar9) ? 67108864 : 33554432);
        if (!i0Var.T(i11 & 1, (38347923 & i11) != 38347922)) {
            i0Var.W();
        } else {
            if (aVar == null && aVar2 == null) {
                t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i12 = 0;
                    eVar = new ej.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i10, i12) { // from class: ab.b
                        public final /* synthetic */ ej.a A;
                        public final /* synthetic */ ej.a B;
                        public final /* synthetic */ ej.a C;

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f259a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a f260b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ a f261c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ ej.a f262d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ ej.a f263e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ ej.a f264f;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ ej.a f265z;

                        {
                            this.f259a = i12;
                        }

                        @Override // ej.e
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f259a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iO = f1.s.O(1573321);
                                    v.a(this.f260b, this.f261c, this.f262d, this.f263e, this.f264f, this.f265z, this.A, this.B, this.C, (i0) obj, iO);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iO2 = f1.s.O(1573321);
                                    v.a(this.f260b, this.f261c, this.f262d, this.f263e, this.f264f, this.f265z, this.A, this.B, this.C, (i0) obj, iO2);
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    t1VarU.f6456d = eVar;
                }
                return;
            }
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = f1.s.A(null);
                i0Var.l0(objQ);
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = f1.s.A(null);
                i0Var.l0(objQ2);
            }
            a1 a1Var2 = (a1) objQ2;
            b0.i0 i0Var2 = b0.t1.f1433c;
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, i0Var2);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            Object objQ3 = i0Var.Q();
            if (objQ3 == fVar) {
                objQ3 = new i(a1Var, 0);
                i0Var.l0(objQ3);
            }
            b0.d.a(t2.z.m(i0Var2, (ej.c) objQ3), null, p1.j.d(569944829, new j(aVar2, aVar, aVar3, a1Var, a1Var2, aVar4, aVar6, aVar5, aVar7, aVar8, aVar9), i0Var), i0Var, 3078, 6);
            i0Var.p(true);
        }
        t1VarU = i0Var.u();
        if (t1VarU != null) {
            final int i13 = 1;
            eVar = new ej.e(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i10, i13) { // from class: ab.b
                public final /* synthetic */ ej.a A;
                public final /* synthetic */ ej.a B;
                public final /* synthetic */ ej.a C;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f259a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f260b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f261c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ej.a f262d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ej.a f263e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ej.a f264f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ ej.a f265z;

                {
                    this.f259a = i13;
                }

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f259a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iO = f1.s.O(1573321);
                            v.a(this.f260b, this.f261c, this.f262d, this.f263e, this.f264f, this.f265z, this.A, this.B, this.C, (i0) obj, iO);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iO2 = f1.s.O(1573321);
                            v.a(this.f260b, this.f261c, this.f262d, this.f263e, this.f264f, this.f265z, this.A, this.B, this.C, (i0) obj, iO2);
                            break;
                    }
                    return pi.o.f13011a;
                }
            };
            t1VarU.f6456d = eVar;
        }
    }

    public static final void b(xa.f fVar, ej.a aVar, ej.a aVar2, ej.a aVar3, ej.a aVar4, ej.a aVar5, ej.a aVar6, ej.c cVar, boolean z2, i0 i0Var, int i10) {
        ej.a aVar7;
        xa.d dVar;
        xa.d dVar2;
        ej.a aVar8;
        i0 i0Var2 = i0Var;
        i0Var2.c0(-452914147);
        int i11 = i10 | (i0Var2.f(fVar) ? 4 : 2) | (i0Var2.h(aVar) ? 32 : 16) | (i0Var2.h(aVar2) ? 256 : 128) | (i0Var2.h(aVar3) ? 2048 : 1024) | (i0Var2.h(aVar4) ? 16384 : 8192) | (i0Var2.h(aVar5) ? 131072 : 65536) | (i0Var2.h(aVar6) ? 1048576 : 524288) | (i0Var2.g(z2) ? 67108864 : 33554432);
        if (i0Var2.T(i11 & 1, (38347923 & i11) != 38347922)) {
            xa.d dVar3 = fVar.f19864c;
            boolean zD = ((i11 & 234881024) == 67108864) | i0Var2.d(dVar3.f19858d.ordinal()) | i0Var2.f(dVar3.f19856b);
            Object objQ = i0Var2.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (zD || objQ == fVar2) {
                objQ = dVar3.f19858d == xa.e.f19860b ? qi.k.c0(new x[]{new x("Get apps out", c0.f283z), new x(z2 ? "Remove lock" : "Folder lock", c0.f282f)}) : nj.e.C0(dVar3.f19856b, "clock", true) ? qi.k.c0(new x[]{new x("Add widgets", c0.f277a), new x("Set alarm", c0.f278b), new x("Start stopwatch", c0.f279c), new x("Start timer", c0.f280d)}) : qi.k.c0(new x[]{new x("Add widgets", c0.f277a), new x("Share app", c0.f281e), new x("App lock", c0.f282f)});
                i0Var2.l0(objQ);
            }
            List<x> list = (List) objQ;
            boolean z10 = dVar3.f19858d == xa.e.f19860b;
            float f10 = f351a;
            float f11 = f352b;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarP = b0.t1.p(lVar, f10, f11);
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar2) {
                objQ2 = new n(cVar, 0);
                i0Var2.l0(objQ2);
            }
            v1.o oVarF = v.n.f(z1.h.c(t2.z.m(oVarP, (ej.c) objQ2), f355e), e0.d(3875536895L), e0.f2986b);
            v1.g gVar = v1.b.f17551e;
            q0 q0VarD = b0.r.d(gVar, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarF);
            v2.h.f17668w.getClass();
            boolean z11 = z10;
            v2.f fVar3 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar3);
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
            v2.d dVar4 = v2.g.f17651h;
            f1.s.I(dVar4, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.o oVarV = b0.d.v(b0.t1.c(1.0f, lVar), 0.0f, 4, 1);
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 6);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarV);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar3);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, b0VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar4);
            f1.s.M(eVar4, i0Var2, oVarC2);
            if (z11) {
                aVar7 = aVar2;
                dVar = dVar3;
                i0Var2.b0(1182760353);
                i0Var2.p(false);
            } else {
                i0Var2.b0(1180934453);
                v1.o oVarU = b0.d.u(b0.t1.c(1.0f, lVar), 40, 8);
                q1 q1VarA = o1.a(b0.j.f1365g, v1.b.D, i0Var2, 54);
                int iHashCode3 = Long.hashCode(i0Var2.T);
                n1 n1VarL3 = i0Var2.l();
                v1.o oVarC3 = v1.a.c(i0Var2, oVarU);
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar3);
                } else {
                    i0Var2.o0();
                }
                f1.s.M(eVar, i0Var2, q1VarA);
                f1.s.M(eVar2, i0Var2, n1VarL3);
                gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar4);
                f1.s.M(eVar4, i0Var2, oVarC3);
                float f12 = 44;
                float f13 = 12;
                v1.o oVarL = v.n.l(y8.f.c(f13, b0.t1.k(f12, lVar)), false, null, aVar, 15);
                v1.g gVar2 = v1.b.f17547a;
                q0 q0VarD2 = b0.r.d(gVar2, false);
                int iHashCode4 = Long.hashCode(i0Var2.T);
                n1 n1VarL4 = i0Var2.l();
                v1.o oVarC4 = v1.a.c(i0Var2, oVarL);
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar3);
                } else {
                    i0Var2.o0();
                }
                f1.s.M(eVar, i0Var2, q0VarD2);
                f1.s.M(eVar2, i0Var2, n1VarL4);
                gk.b.t(iHashCode4, i0Var2, eVar3, i0Var2, dVar4);
                f1.s.M(eVar4, i0Var2, oVarC4);
                String strValueOf = String.valueOf('\ueba0');
                k3.m mVar = ha.e.f7772d;
                long jX = hj.a.x(24);
                long jD = e0.d(4281545523L);
                b0.w wVar = b0.w.f1450a;
                dVar = dVar3;
                v7.a(strValueOf, wVar.b(lVar, gVar), jD, jX, null, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24960, 0, 261992);
                i0Var.p(true);
                v1.o oVarC5 = y8.f.c(f13, b0.t1.k(f12, lVar));
                aVar7 = aVar2;
                v1.o oVarL2 = v.n.l(oVarC5, false, null, aVar7, 15);
                q0 q0VarD3 = b0.r.d(gVar2, false);
                int iHashCode5 = Long.hashCode(i0Var.T);
                n1 n1VarL5 = i0Var.l();
                v1.o oVarC6 = v1.a.c(i0Var, oVarL2);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(fVar3);
                } else {
                    i0Var.o0();
                }
                f1.s.M(eVar, i0Var, q0VarD3);
                f1.s.M(eVar2, i0Var, n1VarL5);
                gk.b.t(iHashCode5, i0Var, eVar3, i0Var, dVar4);
                f1.s.M(eVar4, i0Var, oVarC6);
                v7.a(String.valueOf('\ueaa5'), wVar.b(lVar, gVar), e0.d(4294198070L), hj.a.x(24), null, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24960, 0, 261992);
                i0Var2 = i0Var;
                i0Var2.p(true);
                i0Var2.p(true);
                z4.e(b0.d.v(lVar, 16, 0.0f, 2), (float) 0.5d, e0.c(536870912), i0Var2, 438, 0);
                i0Var2.p(false);
            }
            i0Var2.b0(1423628244);
            for (x xVar : list) {
                int iOrdinal = xVar.f360b.ordinal();
                if (iOrdinal != 5) {
                    aVar8 = iOrdinal != 6 ? aVar3 : aVar5;
                    dVar2 = dVar;
                } else {
                    dVar2 = dVar;
                    aVar8 = dVar2.f19858d == xa.e.f19860b ? aVar6 : aVar4;
                }
                c(xVar, aVar8, i0Var2, 0);
                dVar = dVar2;
            }
            i0Var2.p(false);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            aVar7 = aVar2;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c(fVar, aVar, aVar7, aVar3, aVar4, aVar5, aVar6, cVar, z2, i10);
        }
    }

    public static final void c(x xVar, ej.a aVar, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(1183725264);
        int i11 = i10 | (i0Var2.f(xVar) ? 4 : 2) | (i0Var2.h(aVar) ? 32 : 16);
        if (i0Var2.T(i11 & 1, (i11 & 19) != 18)) {
            v1.l lVar = v1.l.f17564b;
            float f10 = 14;
            v1.o oVarU = b0.d.u(v.n.l(b0.t1.c(1.0f, lVar), false, null, aVar, 15), 16, f10);
            q1 q1VarA = o1.a(b0.j.f1359a, v1.b.D, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
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
            switch (xVar.f360b.ordinal()) {
                case 0:
                    i0Var2.b0(-1862102459);
                    d('\ueca6', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 1:
                    i0Var2.b0(-1862099646);
                    d('\uec35', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 2:
                    i0Var2.b0(-1862096794);
                    d('\uec39', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 3:
                    i0Var2.b0(-1862093950);
                    d('\uec3b', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 4:
                    i0Var2.b0(-1862091237);
                    d('\uea9d', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 5:
                    i0Var2.b0(-1862088767);
                    d('\uec9e', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                case 6:
                    i0Var2.b0(-1862085828);
                    d('\uea90', null, i0Var2, 0);
                    i0Var2.p(false);
                    break;
                default:
                    i0Var2.b0(-1862104077);
                    i0Var2.p(false);
                    throw new b3.e();
            }
            b0.d.e(i0Var2, b0.t1.o(f10, lVar));
            v7.a(xVar.f359a, null, e0.d(4281545523L), hj.a.x(17), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597824, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g(xVar, i10, 0, aVar);
        }
    }

    public static final void d(final char c6, v1.o oVar, i0 i0Var, final int i10) {
        int i11;
        final v1.o oVar2;
        i0Var.c0(460074777);
        Object objI = i0Var.I();
        if ((objI instanceof Character) && c6 == ((Character) objI).charValue()) {
            i11 = 2;
        } else {
            i0Var.m0(Character.valueOf(c6));
            i11 = 4;
        }
        int i12 = i10 | i11 | 48;
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            String strValueOf = String.valueOf(c6);
            k3.m mVar = ha.e.f7772d;
            long jX = hj.a.x(26);
            long jD = e0.d(4281545523L);
            oVar2 = v1.l.f17564b;
            v7.a(strValueOf, oVar2, jD, jX, null, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 25008, 0, 261992);
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(c6, oVar2, i10) { // from class: ab.h

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ char f296a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1.o f297b;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    v.d(this.f296a, this.f297b, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(final v1.o oVar, final xa.f fVar, final int i10, final int i11, final float f10, i0 i0Var, final int i12) {
        i0Var.c0(967290521);
        int i13 = i12 | (i0Var.f(oVar) ? 4 : 2) | (i0Var.f(fVar) ? 32 : 16) | (i0Var.d(i10) ? 256 : 128) | (i0Var.c(f10) ? 16384 : 8192);
        if (i0Var.T(i13 & 1, (i13 & 8339) != 8338)) {
            Object objQ = i0Var.Q();
            f1.f fVar2 = f1.m.f6385a;
            if (objQ == fVar2) {
                objQ = new d(0);
                i0Var.l0(objQ);
            }
            ej.c cVar = (ej.c) objQ;
            boolean z2 = ((i13 & 112) == 32) | ((i13 & 896) == 256) | ((57344 & i13) == 16384);
            Object objQ2 = i0Var.Q();
            if (z2 || objQ2 == fVar2) {
                objQ2 = new ej.c() { // from class: ab.e
                    @Override // ej.c
                    public final Object invoke(Object obj) {
                        View view = (View) obj;
                        ImageView imageView = (ImageView) view.findViewById(R.id.app_icon_image);
                        TextView textView = (TextView) view.findViewById(R.id.icon_label);
                        Context context = view.getContext();
                        fj.l.e(context, "getContext(...)");
                        xa.b bVarC = xa.a.c(context);
                        fj.l.c(imageView);
                        xa.a.a(imageView, i10, bVarC, null, null, 56);
                        xa.f fVar3 = fVar;
                        imageView.setImageBitmap(fVar3.f19864c.f19855a);
                        xa.d dVar = fVar3.f19864c;
                        imageView.setContentDescription(dVar.f19856b);
                        fj.l.c(textView);
                        xa.a.b(textView, dVar.f19856b, bVarC);
                        textView.setAlpha(f10);
                        view.findViewById(R.id.app_icon_selection_badge).setVisibility(8);
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(objQ2);
            }
            v3.j.a(((i13 << 3) & 112) | 6, 0, cVar, (ej.c) objQ2, i0Var, oVar);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(fVar, i10, i11, f10, i12) { // from class: ab.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ xa.f f289b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f290c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f291d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f292e;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    v.e(this.f288a, this.f289b, this.f290c, this.f291d, this.f292e, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final Rect f(Rect rect, Rect rect2) {
        if (rect2 == null) {
            return rect;
        }
        int i10 = rect.left;
        int i11 = rect2.left;
        int i12 = rect.top;
        int i13 = rect2.top;
        return new Rect(i10 - i11, i12 - i13, rect.right - i11, rect.bottom - i13);
    }
}
