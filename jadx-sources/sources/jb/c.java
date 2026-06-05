package jb;

import aa.j;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.h0;
import b0.c1;
import f1.a1;
import f1.i0;
import f1.m;
import f1.q2;
import f1.r1;
import f1.s;
import f1.t1;
import f1.v;
import fj.l;
import g3.z;
import t.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v f8800a = new v(new fa.a(22));

    /* renamed from: b, reason: collision with root package name */
    public static final v f8801b = new v(new fa.a(23));

    /* renamed from: c, reason: collision with root package name */
    public static final v f8802c = new v(new fa.a(24));

    /* renamed from: d, reason: collision with root package name */
    public static final v f8803d = new v(new fa.a(24));

    /* renamed from: e, reason: collision with root package name */
    public static final v f8804e = new v(new fa.a(25));

    /* renamed from: f, reason: collision with root package name */
    public static final v f8805f = new v(new fa.a(26));

    public static final void a(int i10, i0 i0Var) {
        v vVar;
        v vVar2;
        i0 i0Var2 = i0Var;
        p1.e eVar = ra.b.f13936k;
        i0Var2.c0(-491502954);
        if (i0Var2.T(i10 & 1, (i10 & 3) != 2)) {
            j jVar = (j) i0Var2.j(fa.b.f6654a);
            l.f(jVar, "<this>");
            boolean z2 = jVar instanceof aa.f;
            f1.f fVar = m.f6385a;
            v vVar3 = f8805f;
            v vVar4 = f8804e;
            v vVar5 = f8803d;
            v vVar6 = f8802c;
            v vVar7 = f8801b;
            v vVar8 = f8800a;
            if (!z2) {
                i0Var2.b0(-820831828);
                r1 r1VarA = vVar8.a(Float.valueOf(0.0f));
                r1 r1VarA2 = vVar7.a(Float.valueOf(1.0f));
                h hVar = h.f8837b;
                r1 r1VarA3 = vVar6.a(hVar);
                r1 r1VarA4 = vVar5.a(hVar);
                r1 r1VarA5 = vVar4.a(Boolean.FALSE);
                Object objQ = i0Var2.Q();
                if (objQ == fVar) {
                    objQ = new fa.a(27);
                    i0Var2.l0(objQ);
                }
                s.b(new r1[]{r1VarA, r1VarA2, r1VarA3, r1VarA4, r1VarA5, vVar3.a((ej.a) objQ)}, eVar, i0Var2, 56);
                i0Var2.p(false);
                t1 t1VarU = i0Var2.u();
                if (t1VarU != null) {
                    t1VarU.f6456d = new z(i10, 12);
                    return;
                }
                return;
            }
            i0Var2.b0(-820401300);
            i0Var2.p(false);
            Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = s.A(h.f8837b);
                i0Var2.l0(objQ2);
            }
            a1 a1Var = (a1) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == fVar) {
                objQ3 = s.A(h.f8837b);
                i0Var2.l0(objQ3);
            }
            a1 a1Var2 = (a1) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == fVar) {
                objQ4 = s.A(h.f8837b);
                i0Var2.l0(objQ4);
            }
            a1 a1Var3 = (a1) objQ4;
            h hVar2 = (h) a1Var.getValue();
            Object objQ5 = i0Var2.Q();
            if (objQ5 == fVar) {
                vVar = vVar5;
                vVar2 = vVar6;
                objQ5 = new h0(a1Var, a1Var2, null, 15);
                i0Var2.l0(objQ5);
            } else {
                vVar = vVar5;
                vVar2 = vVar6;
            }
            s.f((ej.e) objQ5, i0Var2, hVar2);
            boolean zH = i0Var2.h(context);
            Object objQ6 = i0Var2.Q();
            if (zH || objQ6 == fVar) {
                objQ6 = new c1(26, context, a1Var);
                i0Var2.l0(objQ6);
            }
            s.c(context, (ej.c) objQ6, i0Var2);
            v vVar9 = vVar;
            v vVar10 = vVar2;
            q2 q2VarB = t.e.b(((h) a1Var3.getValue()).f8841a, t.d.t(400, 0, x.f15311c, 2), "", null, i0Var2, 3072, 20);
            i0Var2 = i0Var;
            q2 q2VarB2 = t.e.b(((h) a1Var3.getValue()) != h.f8837b ? 0.82f : 1.0f, t.d.t(250, 0, x.f15310b, 2), "", null, i0Var2, 3072, 20);
            r1 r1VarA6 = vVar8.a(Float.valueOf(((Number) q2VarB.getValue()).floatValue()));
            r1 r1VarA7 = vVar7.a(Float.valueOf(((Number) q2VarB2.getValue()).floatValue()));
            r1 r1VarA8 = vVar10.a((h) a1Var3.getValue());
            r1 r1VarA9 = vVar9.a((h) a1Var2.getValue());
            r1 r1VarA10 = vVar4.a(Boolean.valueOf(((h) a1Var2.getValue()) != ((h) a1Var3.getValue())));
            Object objQ7 = i0Var2.Q();
            if (objQ7 == fVar) {
                objQ7 = new a(a1Var2, a1Var3, 0);
                i0Var2.l0(objQ7);
            }
            s.b(new r1[]{r1VarA6, r1VarA7, r1VarA8, r1VarA9, r1VarA10, vVar3.a((ej.a) objQ7)}, eVar, i0Var2, 56);
        } else {
            i0Var2.W();
        }
        t1 t1VarU2 = i0Var2.u();
        if (t1VarU2 != null) {
            t1VarU2.f6456d = new z(i10, 13);
        }
    }

    public static final v b() {
        return f8805f;
    }

    public static final v c() {
        return f8804e;
    }
}
