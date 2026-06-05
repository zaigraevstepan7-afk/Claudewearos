package ta;

import b0.b0;
import b0.t1;
import f1.i0;
import f1.n1;
import java.util.List;
import java.util.Set;
import t2.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final float f16202a = 15;

    /* JADX WARN: Removed duplicated region for block: B:111:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final v1.o r39, final java.util.List r40, final java.lang.String r41, final int r42, final int r43, final boolean r44, final float r45, final boolean r46, final long r47, final mi.p r49, final boolean r50, boolean r51, final boolean r52, final java.util.Set r53, final ej.c r54, final ej.a r55, final ej.a r56, final ej.a r57, ej.c r58, final ej.c r59, final ej.e r60, f1.i0 r61, final int r62) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.u.a(v1.o, java.util.List, java.lang.String, int, int, boolean, float, boolean, long, mi.p, boolean, boolean, boolean, java.util.Set, ej.c, ej.a, ej.a, ej.a, ej.c, ej.c, ej.e, f1.i0, int):void");
    }

    public static final void b(v1.o oVar, final int i10, p1.e eVar, i0 i0Var, int i11) {
        v1.o oVarC;
        i0Var.c0(-652131456);
        int i12 = i11 | 6 | (i0Var.d(i10) ? 32 : 16);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            aa.j jVar = (aa.j) i0Var.j(fa.b.f6654a);
            fj.l.f(jVar, "<this>");
            boolean z2 = jVar instanceof aa.i;
            ej.f fVar = new ej.f() { // from class: ta.s
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    v1.o oVar2 = (v1.o) obj;
                    i0 i0Var2 = (i0) obj2;
                    ((Integer) obj3).getClass();
                    fj.l.f(oVar2, "$this$modifyIf");
                    i0Var2.b0(-864907014);
                    float f10 = ((s3.f) i0Var2.j(jb.f.f8821a)).f14742a;
                    int i13 = i10;
                    boolean zD = i0Var2.d(i13);
                    Object objQ = i0Var2.Q();
                    if (zD || objQ == f1.m.f6385a) {
                        objQ = new s3.f(((u.f16202a * 2) + f10) * i13);
                        i0Var2.l0(objQ);
                    }
                    v1.o oVarO = t1.o(((s3.f) objQ).f14742a, oVar2);
                    i0Var2.p(false);
                    return oVarO;
                }
            };
            v1.l lVar = v1.l.f17564b;
            if (z2) {
                i0Var.b0(664157603);
                oVarC = (v1.o) fVar.c(lVar, i0Var, 6);
                i0Var.p(false);
            } else {
                i0Var.b0(298519961);
                i0Var.b0(1424569403);
                oVarC = t1.c(1.0f, lVar);
                i0Var.p(false);
                i0Var.p(false);
            }
            q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarC);
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
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            eVar.c(b0.w.f1450a, i0Var, 54);
            i0Var.p(true);
            oVar = lVar;
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p0.i(oVar, i10, eVar, i11);
        }
    }

    public static final void c(v1.o oVar, List list, mi.p pVar, boolean z2, Set set, ej.c cVar, ej.c cVar2, ej.c cVar3, ej.e eVar, i0 i0Var, int i10) {
        i0 i0Var2;
        fj.l.f(cVar, "onAction");
        i0Var.c0(-248844222);
        int i11 = i10 | (i0Var.h(list) ? 32 : 16) | (i0Var.f(pVar) ? 256 : 128) | (i0Var.g(z2) ? 2048 : 1024) | (i0Var.h(set) ? 16384 : 8192) | (i0Var.h(cVar) ? 131072 : 65536) | (i0Var.h(cVar2) ? 1048576 : 524288) | (i0Var.h(cVar3) ? 8388608 : 4194304) | (i0Var.h(eVar) ? 67108864 : 33554432);
        if (i0Var.T(i11 & 1, (38347923 & i11) != 38347922)) {
            i0Var.Y();
            if ((i10 & 1) != 0 && !i0Var.C()) {
                i0Var.W();
            }
            i0Var.q();
            b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.F, i0Var, 48);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVar);
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
            boolean z10 = (i11 & 29360128) == 8388608;
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new ab.n(cVar3, 14);
                i0Var.l0(objQ);
            }
            uk.c.c(t2.z.m(v1.l.f17564b, (ej.c) objQ), list, pVar, z2, null, set, cVar2, eVar, i0Var, (i11 & 8176) | ((i11 << 3) & 458752) | (3670016 & i11) | ((i11 >> 3) & 29360128), 16);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.c(oVar, list, pVar, z2, set, cVar, cVar2, cVar3, eVar, i10);
        }
    }

    public static final void d(v1.o oVar, mi.p pVar, boolean z2, ej.c cVar, ej.a aVar, ej.a aVar2, ej.a aVar3, i0 i0Var, int i10) {
        v1.o oVar2;
        fj.l.f(cVar, "onAction");
        fj.l.f(aVar, "onSettingsClick");
        fj.l.f(aVar2, "onWallpaperClick");
        fj.l.f(aVar3, "onWidgetsClick");
        i0Var.c0(-420939021);
        int i11 = i10 | (i0Var.f(pVar) ? 32 : 16) | (i0Var.g(z2) ? 256 : 128) | (i0Var.h(cVar) ? 2048 : 1024) | (i0Var.h(aVar) ? 16384 : 8192) | (i0Var.h(aVar2) ? 131072 : 65536) | (i0Var.h(aVar3) ? 1048576 : 524288);
        if (i0Var.T(i11 & 1, (599187 & i11) != 599186)) {
            b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.F, i0Var, 48);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            oVar2 = oVar;
            v1.o oVarC = v1.a.c(i0Var, oVar2);
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
            v1.o oVarC2 = t1.c(1.0f, v1.l.f17564b);
            boolean z10 = ((3670016 & i11) == 1048576) | ((i11 & 7168) == 2048);
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new k0.t1(22, aVar3, cVar);
                i0Var.l0(objQ);
            }
            int i12 = (i11 & 112) | 6 | (i11 & 896);
            int i13 = i11 >> 3;
            yd.f.a((i13 & 57344) | i12 | (i13 & 7168), aVar, aVar2, (ej.c) objQ, i0Var, pVar, oVarC2, z2);
            i0Var.p(true);
        } else {
            oVar2 = oVar;
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new o(oVar2, pVar, z2, cVar, aVar, aVar2, aVar3, i10);
        }
    }

    public static final ia.a e(i0 i0Var) {
        mi.q qVarR = wd.a.R(i0Var);
        Object objQ = i0Var.Q();
        if (objQ == f1.m.f6385a) {
            objQ = ia.a.a(a.a.A(qVarR), 0.0f, 30);
            i0Var.l0(objQ);
        }
        return ia.a.a((ia.a) objQ, ((jb.d) i0Var.j(jb.f.f8827g)).f8813h, 19);
    }
}
