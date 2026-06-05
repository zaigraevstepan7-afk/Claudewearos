package p0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.r;
import c1.b8;
import f1.a1;
import f1.i0;
import f1.j1;
import f1.n1;
import f1.r1;
import f1.s;
import f1.t1;
import k0.x;
import t2.q0;
import w3.d0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f12619a = new p1.e(new l0.a(1), false, 636288403);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f12620b = new p1.e(new l0.a(2), false, -1357803046);

    public static final void a(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        v1.o oVar2;
        p1.e eVar2;
        i0Var.c0(790527681);
        int i12 = 4;
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                j1 j1Var = new j1(null, f1.f.f6290d);
                i0Var.l0(j1Var);
                objQ = j1Var;
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = new b8(a1Var, 29);
                i0Var.l0(objQ2);
            }
            ej.a aVar = (ej.a) objQ2;
            d0 d0Var = l.f12625a;
            r0.c cVarL = hj.a.l(f12620b, i0Var, 6);
            oVar2 = oVar;
            eVar2 = eVar;
            s.b(new r1[]{r0.g.f13663b.a(e(aVar, i0Var, 2)), r0.g.f13662a.a(cVarL)}, p1.j.d(1070596993, new bb.a(oVar2, a1Var, eVar2, cVarL, aVar), i0Var), i0Var, 56);
        } else {
            oVar2 = oVar;
            eVar2 = eVar;
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(oVar2, eVar2, i10, i12);
        }
    }

    public static final void b(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(155925518);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            boolean z2 = i0Var.j(r0.g.f13662a) != null;
            boolean z10 = i0Var.j(r0.g.f13663b) != null;
            if (z2 && z10) {
                i0Var.b0(-1977187922);
                q0 q0VarD = r.d(v1.b.f17547a, true);
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
                s.M(v2.g.f17649f, i0Var, q0VarD);
                s.M(v2.g.f17648e, i0Var, n1VarL);
                s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
                s.I(v2.g.f17651h, i0Var);
                s.M(v2.g.f17647d, i0Var, oVarC);
                eVar.invoke(i0Var, Integer.valueOf((i11 >> 3) & 14));
                i0Var.p(true);
                i0Var.p(false);
            } else if (z2) {
                i0Var.b0(-1976997706);
                c(oVar, eVar, i0Var, i11 & 126);
                i0Var.p(false);
            } else if (z10) {
                i0Var.b0(-1976846922);
                l.d(oVar, eVar, i0Var, i11 & 126);
                i0Var.p(false);
            } else {
                i0Var.b0(-1976716505);
                a(oVar, eVar, i0Var, i11 & 126);
                i0Var.p(false);
            }
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(oVar, eVar, i10, 3);
        }
    }

    public static final void c(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(2064964257);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            d(oVar, eVar, i0Var, ((i11 << 3) & 896) | (i11 & 14) | 48);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(oVar, eVar, i10, 0);
        }
    }

    public static final void d(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(771959668);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                j1 j1Var = new j1(null, f1.f.f6290d);
                i0Var.l0(j1Var);
                objQ = j1Var;
            }
            a1 a1Var = (a1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = new b8(a1Var, 28);
                i0Var.l0(objQ2);
            }
            s.a(r0.g.f13663b.a(e((ej.a) objQ2, i0Var, 0)), p1.j.d(-291176396, new x(oVar, a1Var, eVar, 3), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(oVar, eVar, i10, 1);
        }
    }

    public static final h e(ej.a aVar, i0 i0Var, int i10) {
        View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
        boolean zF = i0Var.f(view);
        Object objQ = i0Var.Q();
        Object obj = f1.m.f6385a;
        if (zF || objQ == obj) {
            objQ = new h(view, null, aVar);
            i0Var.l0(objQ);
        }
        h hVar = (h) objQ;
        boolean zH = i0Var.h(hVar);
        Object objQ2 = i0Var.Q();
        if (zH || objQ2 == obj) {
            objQ2 = new a(hVar, 3);
            i0Var.l0(objQ2);
        }
        s.c(hVar, (ej.c) objQ2, i0Var);
        return hVar;
    }
}
