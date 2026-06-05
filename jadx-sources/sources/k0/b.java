package k0;

import c1.k2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9047a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9048b;

    static {
        float f10 = 25;
        f9047a = f10;
        f9048b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(v0.m mVar, v1.o oVar, long j, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(1776202187);
        int i12 = (i0Var.f(mVar) ? 4 : 2) | i10 | (i0Var.f(oVar) ? 32 : 16) | 128;
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                i11 = i12 & (-897);
                j = 9205357640488583168L;
            } else {
                i0Var.W();
                i11 = i12 & (-897);
            }
            i0Var.q();
            int i13 = i11 & 14;
            boolean z2 = i13 == 4;
            Object objQ = i0Var.Q();
            if (z2 || objQ == f1.m.f6385a) {
                objQ = new ab.k(mVar, 20);
                i0Var.l0(objQ);
            }
            u3.c.c(mVar, v1.b.f17548b, p1.j.d(-1653527038, new a(j, d3.p.a(oVar, false, (ej.c) objQ)), i0Var), i0Var, i13 | 432);
        } else {
            i0Var.W();
        }
        long j4 = j;
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k2(mVar, oVar, j4, i10, 1);
        }
    }

    public static final void b(v1.o oVar, f1.i0 i0Var, int i10, int i11) {
        int i12;
        i0Var.c0(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        }
        if (i0Var.T(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                oVar = v1.l.f17564b;
            }
            b0.d.e(i0Var, z1.h.f(b0.t1.l(oVar, f9048b, f9047a), new f1.b(((v0.a1) i0Var.j(v0.b1.f17363a)).f17349a, 3)));
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0.p(oVar, i10, i11);
        }
    }
}
