package v;

import android.content.res.Configuration;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.b5;
import v2.e2;
import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n {
    public static final void a(v1.o oVar, ej.c cVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (i0Var.h(cVar) ? 32 : 16);
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            b0.d.e(i0Var, z1.h.e(oVar, cVar));
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(oVar, i10, 11, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final h2.b r16, final java.lang.String r17, final v1.o r18, v1.c r19, final t2.i r20, float r21, f1.i0 r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.b(h2.b, java.lang.String, v1.o, v1.c, t2.i, float, f1.i0, int, int):void");
    }

    public static final void c(c2.g gVar, String str, v1.o oVar, t2.i iVar, f1.i0 i0Var, int i10, int i11) {
        v1.g gVar2 = v1.b.f17551e;
        if ((i11 & 16) != 0) {
            iVar = t2.h.f15564b;
        }
        t2.i iVar2 = iVar;
        boolean zF = i0Var.f(gVar);
        Object objQ = i0Var.Q();
        if (zF || objQ == f1.m.f6385a) {
            objQ = wd.a.b(gVar, 1);
            i0Var.l0(objQ);
        }
        b((h2.a) objQ, str, oVar, gVar2, iVar2, 1.0f, i0Var, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10), 0);
    }

    public static float d(EdgeEffect edgeEffect, float f10, float f11, s3.c cVar) {
        float f12 = g0.f17198a;
        double dE = cVar.e() * 386.0878f * 160.0f * 0.84f;
        double d10 = g0.f17198a * dE;
        float fExp = (float) (Math.exp((g0.f17199b / g0.f17200c) * Math.log((Math.abs(f10) * 0.35f) / d10)) * d10);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? l.b(edgeEffect) : 0.0f) * f11) {
            return 0.0f;
        }
        int iH = hj.a.H(f10);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iH);
            return f10;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iH);
        }
        return f10;
    }

    public static v1.o e(v1.o oVar, c2.j0 j0Var) {
        return oVar.c(new m(0L, j0Var, c2.e0.f2986b, 1));
    }

    public static final v1.o f(v1.o oVar, long j, c2.w0 w0Var) {
        return oVar.c(new m(j, null, w0Var, 2));
    }

    public static final v1.o h(v1.o oVar, float f10, long j, c2.w0 w0Var) {
        return oVar.c(new t(f10, new c2.z0(j), w0Var));
    }

    public static final void i(long j, x.o1 o1Var) {
        if (o1Var == x.o1.f19664a) {
            if (s3.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            a0.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (s3.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            a0.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final v1.o j(v1.o oVar, z.k kVar, a1 a1Var, boolean z2, d3.j jVar, ej.a aVar) {
        v1.o oVarC;
        if (a1Var != null) {
            oVarC = new v(kVar, a1Var, false, z2, null, jVar, aVar);
        } else if (a1Var == null) {
            oVarC = new v(kVar, null, false, z2, null, jVar, aVar);
        } else {
            v1.l lVar = v1.l.f17564b;
            oVarC = kVar != null ? x0.a(lVar, kVar, a1Var).c(new v(kVar, null, false, z2, null, jVar, aVar)) : v1.a.a(lVar, new w(a1Var, z2, jVar, aVar));
        }
        return oVar.c(oVarC);
    }

    public static /* synthetic */ v1.o k(v1.o oVar, z.k kVar, b5 b5Var, boolean z2, d3.j jVar, ej.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i10 & 16) != 0) {
            jVar = null;
        }
        return j(oVar, kVar, b5Var, z10, jVar, aVar);
    }

    public static v1.o l(v1.o oVar, boolean z2, String str, ej.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i10 & 2) != 0) {
            str = null;
        }
        return oVar.c(new v(null, null, true, z10, str, null, aVar));
    }

    public static v1.o m(v1.o oVar, z.k kVar, d3.j jVar, ej.a aVar, ej.a aVar2, int i10) {
        if ((i10 & 16) != 0) {
            jVar = null;
        }
        if ((i10 & 64) != 0) {
            aVar = null;
        }
        return oVar.c(new a0(jVar, aVar2, aVar, kVar));
    }

    public static final v1.o n(v1.o oVar, boolean z2, z.k kVar) {
        return oVar.c(z2 ? new i0(kVar) : v1.l.f17564b);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [v.l0, v2.k] */
    public static final l0 o(v2.k kVar) {
        e2 e2VarJ = v2.n.j(kVar, m0.I);
        m0 m0Var = e2VarJ instanceof m0 ? (m0) e2VarJ : null;
        if (m0Var != null) {
            return m0Var.H;
        }
        return null;
    }

    public static v1.o p(v1.o oVar, z.k kVar) {
        return oVar.c(new q0(kVar));
    }

    public static final boolean q(KeyEvent keyEvent) {
        long jB = n2.d.b(keyEvent);
        int i10 = n2.a.O;
        return n2.a.a(jB, n2.a.f11874h) || n2.a.a(jB, n2.a.f11883r) || n2.a.a(jB, n2.a.E) || n2.a.a(jB, n2.a.f11882q);
    }

    public static final boolean r(f1.i0 i0Var) {
        return (((Configuration) i0Var.j(AndroidCompositionLocals_androidKt.f837a)).uiMode & 48) == 32;
    }

    public static final v1 s(f1.i0 i0Var) {
        Object[] objArr = new Object[0];
        boolean zD = i0Var.d(0);
        Object objQ = i0Var.Q();
        if (zD || objQ == f1.m.f6385a) {
            objQ = new s1.g(12);
            i0Var.l0(objQ);
        }
        return (v1) s1.k.e(objArr, v1.j, (ej.a) objQ, i0Var, 0);
    }

    public static v1.o t(v1.o oVar, v1 v1Var, boolean z2) {
        x.o1 o1Var = z2 ? x.o1.f19664a : x.o1.f19665b;
        z.k kVar = v1Var.f17310d;
        float f10 = z.f17337a;
        x.o1 o1Var2 = x.o1.f19664a;
        v1.l lVar = v1.l.f17564b;
        return oVar.c(o1Var == o1Var2 ? z1.h.c(lVar, p0.f17256c) : z1.h.c(lVar, p0.f17255b)).c(new w1(null, null, null, o1Var, v1Var, kVar, true, true)).c(new y1(v1Var, z2));
    }

    public static final v1.o u(v1.o oVar, f2 f2Var, x.o1 o1Var, i iVar, boolean z2, x.s0 s0Var, z.k kVar, g0.n nVar) {
        float f10 = z.f17337a;
        x.o1 o1Var2 = x.o1.f19664a;
        v1.l lVar = v1.l.f17564b;
        return oVar.c(o1Var == o1Var2 ? z1.h.c(lVar, p0.f17256c) : z1.h.c(lVar, p0.f17255b)).c(new w1(iVar, nVar, s0Var, o1Var, f2Var, kVar, z2, false));
    }

    public static final long v(long j, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f10);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }
}
