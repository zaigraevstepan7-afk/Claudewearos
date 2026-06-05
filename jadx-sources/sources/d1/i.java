package d1;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.g1;
import c1.j8;
import c1.r3;
import c1.v7;
import com.anonlab.voidlauncher.R;
import f1.n1;
import f1.r1;
import f1.t1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f4514a = new StackTraceElement[0];

    public static final void a(w3.c0 c0Var, p1.e eVar, j8 j8Var, p1.e eVar2, f1.i0 i0Var, int i10) {
        w3.c0 c0Var2;
        int i11;
        f1.a1 a1Var;
        i0Var.c0(-1221877520);
        if ((i10 & 6) == 0) {
            c0Var2 = c0Var;
            i11 = (i0Var.f(c0Var2) ? 4 : 2) | i10;
        } else {
            c0Var2 = c0Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? i0Var.f(j8Var) : i0Var.h(j8Var) ? 256 : 128;
        }
        int i12 = i10 & 3072;
        v1.l lVar = v1.l.f17564b;
        if (i12 == 0) {
            i11 |= i0Var.f(lVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(null) ? 16384 : 8192;
        }
        boolean z2 = false;
        if ((i10 & 196608) == 0) {
            i11 |= i0Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= i0Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= i0Var.h(eVar2) ? 67108864 : 33554432;
        }
        int i13 = i11;
        if (i0Var.T(i13 & 1, (38347923 & i13) != 38347922)) {
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = f1.s.o(i0Var);
                i0Var.l0(objQ);
            }
            qj.z zVar = (qj.z) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ2);
            }
            f1.a1 a1Var2 = (f1.a1) objQ2;
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, lVar);
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
            v2.e eVar3 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar3);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            if (j8Var.b()) {
                i0Var.b0(-1891243071);
                a1Var = a1Var2;
                c(c0Var2, j8Var, zVar, false, a1Var, eVar, i0Var, (i13 & 14) | 196608 | ((i13 >> 3) & 112) | ((i13 >> 6) & 896) | ((i13 << 15) & 3670016));
                i0Var.p(false);
            } else {
                a1Var = a1Var2;
                i0Var.b0(-1890863476);
                i0Var.p(false);
            }
            d(j8Var, a1Var, eVar2, i0Var, ((i13 >> 18) & 14) | 384 | ((i13 >> 3) & 112) | ((i13 >> 12) & 7168) | (57344 & (i13 << 3)) | ((i13 >> 9) & 458752));
            i0Var.p(true);
            if ((i13 & 896) == 256 || ((i13 & 512) != 0 && i0Var.h(j8Var))) {
                z2 = true;
            }
            Object objQ3 = i0Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new ab.k(j8Var, 9);
                i0Var.l0(objQ3);
            }
            f1.s.c(j8Var, (ej.c) objQ3, i0Var);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.d(c0Var, eVar, j8Var, eVar2, i10);
        }
    }

    public static final void b(long j, g3.n0 n0Var, ej.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-684938728);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.e(j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(n0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            f1.v vVar = v7.f2781a;
            f1.s.b(new r1[]{g1.f2116a.a(new c2.w(j)), vVar.a(((g3.n0) i0Var.j(vVar)).d(n0Var))}, eVar, i0Var, ((i11 >> 3) & 112) | 8);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new t0(j, n0Var, eVar, i10, 0);
        }
    }

    public static final void c(w3.c0 c0Var, j8 j8Var, qj.z zVar, boolean z2, f1.a1 a1Var, p1.e eVar, f1.i0 i0Var, int i10) {
        w3.c0 c0Var2;
        int i11;
        i0Var.c0(-1413720282);
        if ((i10 & 6) == 0) {
            c0Var2 = c0Var;
            i11 = (i0Var.f(c0Var2) ? 4 : 2) | i10;
        } else {
            c0Var2 = c0Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? i0Var.f(j8Var) : i0Var.h(j8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(null) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.h(zVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.f(a1Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.h(eVar) ? 1048576 : 524288;
        }
        if (i0Var.T(i11 & 1, (599187 & i11) != 599186)) {
            String string = ((Resources) i0Var.j(AndroidCompositionLocals_androidKt.f839c)).getString(R.string.tooltip_description);
            boolean zH = ((i11 & 112) == 32 || ((i11 & 64) != 0 && i0Var.h(j8Var))) | ((i11 & 896) == 256) | i0Var.h(zVar) | ((458752 & i11) == 131072);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new r3((Object) j8Var, zVar, (Object) a1Var, 2);
                i0Var.l0(objQ);
            }
            int i12 = (i11 & 14) | 3072;
            w3.m.a(c0Var2, (ej.a) objQ, new w3.d0(z2, w3.e0.f18499a, true, 0), p1.j.d(-1287705660, new c1.c0(4, string, eVar), i0Var), i0Var, i12, 0);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.m0(c0Var, j8Var, zVar, z2, a1Var, eVar, i10);
        }
    }

    public static final void d(j8 j8Var, f1.a1 a1Var, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(1873232064);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.g(true) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? i0Var.f(j8Var) : i0Var.h(j8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.f(a1Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.g(false) ? 2048 : 1024;
        }
        int i12 = i10 & 24576;
        v1.l lVar = v1.l.f17564b;
        if (i12 == 0) {
            i11 |= i0Var.f(lVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= i0Var.h(eVar) ? 131072 : 65536;
        }
        if (i0Var.T(i11 & 1, (74899 & i11) != 74898)) {
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = f1.s.o(i0Var);
                i0Var.l0(objQ);
            }
            qj.z zVar = (qj.z) objQ;
            v1.o oVarE = n2.d.e(a2.d.s(p2.k0.a(p2.k0.a(lVar, j8Var, new z(j8Var, 0)), j8Var, new z(j8Var, 1)).c(new r0(new ab.m(((Resources) i0Var.j(AndroidCompositionLocals_androidKt.f839c)).getString(R.string.tooltip_label), zVar, j8Var, 4))), new b0.c1(9, zVar, j8Var)), new b0(0, j8Var, a1Var));
            t2.q0 q0VarD = b0.r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarE);
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
            eVar.invoke(i0Var, Integer.valueOf((i11 >> 15) & 14));
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(j8Var, a1Var, eVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(ej.a r5, ej.e r6, vi.c r7) {
        /*
            boolean r0 = r7 instanceof d1.f
            if (r0 == 0) goto L13
            r0 = r7
            d1.f r0 = (d1.f) r0
            int r1 = r0.f4502b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4502b = r1
            goto L18
        L13:
            d1.f r0 = new d1.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4501a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f4502b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r7)     // Catch: d1.d -> L42
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r7)
            ab.s r7 = new ab.s     // Catch: d1.d -> L42
            r2 = 0
            r4 = 3
            r7.<init>(r5, r6, r2, r4)     // Catch: d1.d -> L42
            r0.f4502b = r3     // Catch: d1.d -> L42
            java.lang.Object r5 = qj.b0.h(r7, r0)     // Catch: d1.d -> L42
            if (r5 != r1) goto L42
            return r1
        L42:
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.i.e(ej.a, ej.e, vi.c):java.lang.Object");
    }

    public static v1.o f(v1.o oVar) {
        return oVar.c(new e0(new ab.d(15)));
    }

    public static final v1.o g(v1.o oVar, q qVar, ej.e eVar) {
        o1 o1Var = o1.f19664a;
        return oVar.c(new g0(qVar, eVar));
    }

    public static final Object h(t2.p0 p0Var) {
        Object objC0 = p0Var.c0();
        t2.a0 a0Var = objC0 instanceof t2.a0 ? (t2.a0) objC0 : null;
        if (a0Var != null) {
            return a0Var.H;
        }
        return null;
    }

    public static final String i(int i10, f1.i0 i0Var) {
        i0Var.j(AndroidCompositionLocals_androidKt.f837a);
        return ((Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b)).getResources().getString(i10);
    }

    public static final int j(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        int i12 = i10 - i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }
}
