package v3;

import a2.c0;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f1.g0;
import f1.i0;
import f1.n1;
import f1.t1;
import t.m1;
import t2.l1;
import v2.f0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f17835a = new i();

    public static final void a(int i10, int i11, ej.c cVar, ej.c cVar2, i0 i0Var, v1.o oVar) {
        int i12;
        b bVar = b.f17811e;
        i0Var.c0(-1783766393);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.h(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.f(oVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= i0Var.h(cVar2) ? 256 : 128;
        }
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            if (i13 != 0) {
                cVar2 = bVar;
            }
            b(cVar, oVar, cVar2, i0Var, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344));
        } else {
            i0Var.W();
        }
        ej.c cVar3 = cVar2;
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k(i10, i11, cVar, cVar3, oVar);
        }
    }

    public static final void b(ej.c cVar, v1.o oVar, ej.c cVar2, i0 i0Var, int i10) {
        int i11;
        a7.f fVar;
        androidx.lifecycle.t tVar;
        s3.m mVar;
        s3.c cVar3;
        Object obj = b.f17811e;
        i0Var.c0(-180024211);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.h(obj) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.h(cVar2) ? 16384 : 8192;
        }
        if (i0Var.T(i12 & 1, (i12 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(i0Var.T);
            v1.o oVarC = v1.a.c(i0Var, oVar.c(p.f17856b).c(c0.f15b).c(u.f17860b).c(s.f17859b));
            s3.c cVar4 = (s3.c) i0Var.j(f1.f18262h);
            s3.m mVar2 = (s3.m) i0Var.j(f1.f18267n);
            n1 n1VarL = i0Var.l();
            androidx.lifecycle.t tVar2 = (androidx.lifecycle.t) i0Var.j(b6.k.f1609a);
            a7.f fVar2 = (a7.f) i0Var.j(b7.a.f1610a);
            i0Var.b0(1314774735);
            int i13 = i12 & 14;
            int iHashCode2 = Long.hashCode(i0Var.T);
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            g0 g0VarJ = f1.s.J(i0Var);
            s1.e eVar = (s1.e) i0Var.j(s1.h.f14730a);
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
            boolean zH = i0Var.h(context) | ((((i13 & 14) ^ 6) > 4 && i0Var.f(cVar)) || (i13 & 6) == 4) | i0Var.h(g0VarJ) | i0Var.h(eVar) | i0Var.d(iHashCode2) | i0Var.h(view);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                fVar = fVar2;
                tVar = tVar2;
                mVar = mVar2;
                cVar3 = cVar4;
                Object mVar3 = new m(context, cVar, g0VarJ, eVar, iHashCode2, view);
                i0Var.l0(mVar3);
                objQ = mVar3;
            } else {
                tVar = tVar2;
                fVar = fVar2;
                mVar = mVar2;
                cVar3 = cVar4;
            }
            ej.a aVar = (ej.a) objQ;
            i0Var.X(null, 125, 1, null);
            i0Var.f6329r = true;
            androidx.lifecycle.t tVar3 = tVar;
            if (i0Var.S) {
                i0Var.k(aVar);
            } else {
                i0Var.o0();
            }
            v2.h.f17668w.getClass();
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.M(l.f17844d, i0Var, oVarC);
            f1.s.M(l.f17845e, i0Var, cVar3);
            f1.s.M(l.f17846f, i0Var, tVar3);
            f1.s.M(l.f17847z, i0Var, fVar);
            f1.s.M(l.A, i0Var, mVar);
            f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
            f1.s.M(l.f17842b, i0Var, cVar2);
            f1.s.M(l.f17843c, i0Var, obj);
            i0Var.p(true);
            i0Var.p(false);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new l1(cVar, oVar, cVar2, i10, 1);
        }
    }

    public static final View c(v1.n nVar) {
        w wVar = v2.n.y(nVar.f17565a).H;
        View interopView = wVar != null ? wVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(w wVar, f0 f0Var) {
        long jQ0 = f0Var.Y.f17583c.q0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jQ0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jQ0 & 4294967295L)));
        wVar.layout(iRound, iRound2, wVar.getMeasuredWidth() + iRound, wVar.getMeasuredHeight() + iRound2);
    }

    public static final w e(f0 f0Var) {
        w wVar = f0Var.H;
        if (wVar != null) {
            return wVar;
        }
        throw m1.e("Required value was null.");
    }
}
