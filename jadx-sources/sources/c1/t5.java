package c1;

import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2716a = 22;

    /* renamed from: b, reason: collision with root package name */
    public static final t.o1 f2717b = t.d.t(300, 0, t.y.f15326a, 2);

    public static final void a(p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(1033612924);
        int i11 = 1;
        if (i0Var.T(i10 & 1, (i10 & 19) != 18)) {
            String strI = d1.i.i(R.string.m3c_bottom_sheet_drag_handle_description, i0Var);
            b0.l0 l0Var = new b0.l0(v1.b.F);
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, l0Var);
            v2.h.f17668w.getClass();
            ej.a aVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            v2.e eVar2 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar2);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            float f10 = z7.f2960a;
            int iI0 = ((s3.c) i0Var.j(w2.f1.f18262h)).I0(e8.f2071a);
            boolean zD = i0Var.d(iI0);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (zD || objQ == obj) {
                objQ = new f8(iI0);
                i0Var.l0(objQ);
            }
            f8 f8Var = (f8) objQ;
            p1.e eVarD = p1.j.d(2059851063, new f4(strI, i11), i0Var);
            v.j1 j1Var = d1.s.f4569a;
            boolean zG = i0Var.g(false) | i0Var.f(j1Var);
            Object objQ2 = i0Var.Q();
            if (zG || objQ2 == obj) {
                objQ2 = new j8(j1Var);
                i0Var.l0(objQ2);
            }
            e8.b(f8Var, eVarD, (j8) objQ2, null, false, eVar, i0Var, 100663344);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(eVar, i10, i11);
        }
    }
}
