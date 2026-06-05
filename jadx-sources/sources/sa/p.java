package sa;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.k1;
import b0.o1;
import b0.q1;
import b0.r1;
import b0.t1;
import c1.u5;
import c1.v7;
import c1.x1;
import c2.w0;
import com.anonlab.voidlauncher.R;
import f1.n1;
import f1.q2;
import java.util.List;
import java.util.Map;
import t2.q0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final float f14919a = 88;

    public static final void a(final xa.f fVar, final int i10, final int i11, final xa.b bVar, final Context context, final v1.o oVar, f1.i0 i0Var, final int i12) {
        i0Var.c0(1216128198);
        int i13 = i12 | (i0Var.f(fVar) ? 4 : 2) | (i0Var.d(i10) ? 32 : 16) | (i0Var.d(i11) ? 256 : 128) | (i0Var.f(bVar) ? 2048 : 1024) | (i0Var.f(oVar) ? 131072 : 65536);
        if (i0Var.T(i13 & 1, (66707 & i13) != 66706)) {
            v1.o oVarT = b0.d.t(2, b0.d.g(1.0f, oVar));
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarT);
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
            if (fVar != null) {
                i0Var.b0(947481648);
                v1.o oVarC2 = z1.h.c(t1.f1433c, new ga.c(8, 1));
                boolean z2 = ((i13 & 112) == 32) | ((i13 & 896) == 256) | ((i13 & 7168) == 2048);
                Object objQ = i0Var.Q();
                f1.f fVar3 = f1.m.f6385a;
                if (z2 || objQ == fVar3) {
                    objQ = new g3.n(i10, i11, bVar);
                    i0Var.l0(objQ);
                }
                ej.c cVar = (ej.c) objQ;
                boolean z10 = (i13 & 14) == 4;
                Object objQ2 = i0Var.Q();
                if (z10 || objQ2 == fVar3) {
                    objQ2 = new q0.i(fVar, 6);
                    i0Var.l0(objQ2);
                }
                v3.j.a(0, 0, cVar, (ej.c) objQ2, i0Var, oVarC2);
                i0Var.p(false);
            } else {
                i0Var.b0(949077218);
                i0Var.p(false);
            }
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(i10, i11, bVar, context, oVar, i12) { // from class: sa.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f14907b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f14908c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ xa.b f14909d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Context f14910e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ v1.o f14911f;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    p.a(this.f14906a, this.f14907b, this.f14908c, this.f14909d, this.f14910e, this.f14911f, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(na.b bVar, List list, ej.a aVar, v1.o oVar, boolean z2, f1.i0 i0Var, int i10) {
        v1.o oVar2;
        String str;
        v1.l lVar;
        int i11;
        int i12;
        boolean z10;
        float f10;
        f1.i0 i0Var2;
        f1.i0 i0Var3 = i0Var;
        String str2 = bVar.f11969b;
        i0Var3.c0(-1736602632);
        int i13 = i10 | (i0Var3.f(bVar) ? 4 : 2) | (i0Var3.h(list) ? 32 : 16) | (i0Var3.h(aVar) ? 256 : 128) | 3072 | (i0Var3.g(z2) ? 16384 : 8192);
        if (i0Var3.T(i13 & 1, (i13 & 9363) != 9362)) {
            Context context = (Context) i0Var3.j(AndroidCompositionLocals_androidKt.f838b);
            s3.c cVar = (s3.c) i0Var3.j(f1.f18262h);
            float f11 = ((s3.f) i0Var3.j(jb.f.f8821a)).f14742a;
            boolean zF = i0Var3.f(context);
            Object objQ = i0Var3.Q();
            f1.f fVar = f1.m.f6385a;
            if (zF || objQ == fVar) {
                fj.l.f(context, "context");
                Resources resources = context.getResources();
                objQ = new xa.b(r9.m() / 100.0f, r9.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context).n());
                i0Var3.l0(objQ);
            }
            xa.b bVar2 = (xa.b) objQ;
            boolean zF2 = i0Var3.f(cVar) | i0Var3.c(f11);
            Object objQ2 = i0Var3.Q();
            if (zF2 || objQ2 == fVar) {
                objQ2 = Integer.valueOf(cVar.I0(f11));
                i0Var3.l0(objQ2);
            }
            int iIntValue = ((Number) objQ2).intValue();
            boolean zF3 = i0Var3.f(cVar) | i0Var3.c(f11) | i0Var3.f(bVar2);
            Object objQ3 = i0Var3.Q();
            if (zF3 || objQ3 == fVar) {
                objQ3 = Integer.valueOf(cVar.I0(f11 * bVar2.f19850b));
                i0Var3.l0(objQ3);
            }
            int iIntValue2 = ((Number) objQ3).intValue();
            float fFloatValue = ((Number) i0Var3.j(jb.f.f8823c)).floatValue();
            boolean zBooleanValue = ((Boolean) i0Var3.j(jb.f.f8825e)).booleanValue();
            Object objQ4 = i0Var3.Q();
            if (objQ4 == fVar) {
                ga.c cVar2 = new ga.c(27, 1);
                i0Var3.l0(cVar2);
                objQ4 = cVar2;
            }
            w0 w0Var = (w0) objQ4;
            v1.e eVar = v1.b.F;
            b0.b0 b0VarA = b0.z.a(b0.j.f1361c, eVar, i0Var3, 48);
            int iHashCode = Long.hashCode(i0Var3.T);
            n1 n1VarL = i0Var3.l();
            v1.l lVar2 = v1.l.f17564b;
            v1.o oVarC = v1.a.c(i0Var3, lVar2);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var3.e0();
            if (i0Var3.S) {
                i0Var3.k(fVar2);
            } else {
                i0Var3.o0();
            }
            v2.e eVar2 = v2.g.f17649f;
            f1.s.M(eVar2, i0Var3, b0VarA);
            v2.e eVar3 = v2.g.f17648e;
            f1.s.M(eVar3, i0Var3, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar4 = v2.g.f17650g;
            f1.s.w(i0Var3, numValueOf, eVar4);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var3);
            v2.e eVar5 = v2.g.f17647d;
            f1.s.M(eVar5, i0Var3, oVarC);
            v1.o oVarC2 = z1.h.c(b0.d.g(1.0f, lVar2), w0Var);
            long j = c2.w.f3054d;
            v1.o oVarL = v.n.l(v.n.f(oVarC2, c2.w.c(j, 0.15f), c2.e0.f2986b), false, "Open ".concat(str2), aVar, 13);
            if (zBooleanValue) {
                oVarL = yd.f.U(0.0f, 62, w0Var, oVarL);
            } else if (z2) {
                oVarL = a.a.L(oVarL, w0Var, 0L, (float) 0.5d, (float) 0.8d, fFloatValue, 66);
            }
            float f12 = 8;
            v1.o oVarT = b0.d.t(f12, oVarL);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var3.T);
            n1 n1VarL2 = i0Var3.l();
            v1.o oVarC3 = v1.a.c(i0Var3, oVarT);
            i0Var3.e0();
            if (i0Var3.S) {
                i0Var3.k(fVar2);
            } else {
                i0Var3.o0();
            }
            f1.s.M(eVar2, i0Var3, q0VarD);
            f1.s.M(eVar3, i0Var3, n1VarL2);
            gk.b.t(iHashCode2, i0Var3, eVar4, i0Var3, dVar);
            f1.s.M(eVar5, i0Var3, oVarC3);
            if (list.isEmpty()) {
                str = str2;
                i0Var3.b0(199577666);
                lVar = lVar2;
                i11 = 3;
                i12 = 13;
                z10 = true;
                f10 = f12;
                v7.a("\u1f4f1", null, 0L, hj.a.x(40), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24582, 0, 262126);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                i0Var3.b0(198169336);
                b0.i0 i0Var4 = t1.f1433c;
                b0.f fVar3 = b0.j.f1364f;
                b0.b0 b0VarA2 = b0.z.a(fVar3, eVar, i0Var3, 54);
                int iHashCode3 = Long.hashCode(i0Var3.T);
                n1 n1VarL3 = i0Var3.l();
                v1.o oVarC4 = v1.a.c(i0Var3, i0Var4);
                i0Var3.e0();
                if (i0Var3.S) {
                    i0Var3.k(fVar2);
                } else {
                    i0Var3.o0();
                }
                f1.s.M(eVar2, i0Var3, b0VarA2);
                f1.s.M(eVar3, i0Var3, n1VarL3);
                gk.b.t(iHashCode3, i0Var3, eVar4, i0Var3, dVar);
                f1.s.M(eVar5, i0Var3, oVarC4);
                v1.o oVarC5 = t1.c(1.0f, b0.c0.b());
                v1.f fVar4 = v1.b.D;
                q1 q1VarA = o1.a(fVar3, fVar4, i0Var3, 54);
                int iHashCode4 = Long.hashCode(i0Var3.T);
                n1 n1VarL4 = i0Var3.l();
                v1.o oVarC6 = v1.a.c(i0Var3, oVarC5);
                i0Var3.e0();
                str = str2;
                if (i0Var3.S) {
                    i0Var3.k(fVar2);
                } else {
                    i0Var3.o0();
                }
                f1.s.M(eVar2, i0Var3, q1VarA);
                f1.s.M(eVar3, i0Var3, n1VarL4);
                gk.b.t(iHashCode4, i0Var3, eVar4, i0Var3, dVar);
                f1.s.M(eVar5, i0Var3, oVarC6);
                xa.f fVar5 = (xa.f) qi.l.B0(0, list);
                r1 r1Var = r1.f1410a;
                a(fVar5, iIntValue, iIntValue2, bVar2, context, r1.a(r1Var, lVar2), i0Var3, 0);
                a((xa.f) qi.l.B0(1, list), iIntValue, iIntValue2, bVar2, context, r1.a(r1Var, lVar2), i0Var, 0);
                i0Var.p(true);
                v1.o oVarC7 = t1.c(1.0f, b0.c0.b());
                q1 q1VarA2 = o1.a(fVar3, fVar4, i0Var, 54);
                int iHashCode5 = Long.hashCode(i0Var.T);
                n1 n1VarL5 = i0Var.l();
                v1.o oVarC8 = v1.a.c(i0Var, oVarC7);
                i0Var.e0();
                if (i0Var.S) {
                    i0Var.k(fVar2);
                } else {
                    i0Var.o0();
                }
                f1.s.M(eVar2, i0Var, q1VarA2);
                f1.s.M(eVar3, i0Var, n1VarL5);
                gk.b.t(iHashCode5, i0Var, eVar4, i0Var, dVar);
                f1.s.M(eVar5, i0Var, oVarC8);
                a((xa.f) qi.l.B0(2, list), iIntValue, iIntValue2, bVar2, context, r1.a(r1Var, lVar2), i0Var, 0);
                i0Var2 = i0Var;
                a((xa.f) qi.l.B0(3, list), iIntValue, iIntValue2, bVar2, context, r1.a(r1Var, lVar2), i0Var2, 0);
                i0Var2.p(true);
                i0Var2.p(true);
                i0Var2.p(false);
                lVar = lVar2;
                z10 = true;
                f10 = f12;
                i11 = 3;
                i12 = 13;
            }
            i0Var2.p(z10);
            v1.l lVar3 = lVar;
            v7.a(str, b0.d.x(lVar3, 0.0f, f10, 0.0f, 0.0f, 13), j, hj.a.x(i12), k3.s.f9400z, null, 0L, new r3.k(i11), 0L, 0, false, 1, 0, null, i0Var, 1597872, 24576, 244648);
            i0Var3 = i0Var;
            i0Var3.p(z10);
            oVar2 = lVar3;
        } else {
            i0Var3.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var3.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.k0(bVar, list, aVar, oVar2, z2, i10);
        }
    }

    public static final void c(List list, Map map, v1.o oVar, boolean z2, ej.c cVar, f1.i0 i0Var, int i10) {
        int i11;
        v1.o oVar2;
        fj.l.f(list, "categories");
        fj.l.f(cVar, "onCategoryClick");
        i0Var.c0(-703404983);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(map) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.g(z2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.h(cVar) ? 16384 : 8192;
        }
        if (i0Var.T(i12 & 1, (i12 & 9363) != 9362)) {
            e0.v vVarA = e0.w.a(i0Var);
            q2 q2VarB = t.e.b((vVarA.f5330d.f4425b.g() > 0 || vVarA.f5330d.f4426c.g() > 0) ? 1.0f : 0.0f, null, "categoryGridTopMaskAlpha", null, i0Var, 3072, 22);
            float fW0 = ((s3.c) i0Var.j(f1.f18262h)).w0(f14919a);
            e0.a aVar = new e0.a(2);
            float f10 = 16;
            float f11 = 12;
            v1.o oVarS = c2.e0.s(b0.d.u(t1.f1433c, f10, f11), 0.0f, 0.0f, 0.0f, null, null, 458751);
            boolean zF = i0Var.f(q2VarB) | i0Var.c(fW0);
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (zF || objQ == fVar) {
                objQ = new l(fW0, q2VarB, 0);
                i0Var.l0(objQ);
            }
            v1.o oVarG = z1.h.g(oVarS, (ej.c) objQ);
            b0.h hVarG = b0.j.g(f11);
            b0.h hVarG2 = b0.j.g(f10);
            k1 k1VarD = b0.d.d(0.0f, 0.0f, 80, 7);
            boolean zH = i0Var.h(list) | i0Var.h(map) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new u5(list, map, cVar, z2);
                i0Var.l0(objQ2);
            }
            hj.a.b(aVar, oVarG, vVarA, k1VarD, hVarG2, hVarG, null, false, null, (ej.c) objQ2, i0Var, 1772544, 912);
            oVar2 = v1.l.f17564b;
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new x1(list, map, oVar2, z2, cVar, i10);
        }
    }
}
