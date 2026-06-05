package s;

import f1.n1;
import f1.t1;
import java.util.ListIterator;
import t.f1;
import t.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14632a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14633b = 0;

    static {
        long j = Integer.MIN_VALUE;
        f14632a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(Object obj, v1.o oVar, ej.c cVar, v1.c cVar2, String str, ej.c cVar3, p1.e eVar, f1.i0 i0Var, int i10, int i11) {
        int i12;
        v1.o oVar2;
        ej.c cVar4;
        v1.c cVar5;
        ej.c cVar6;
        i0Var.c0(1501828832);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? i0Var.f(obj) : i0Var.h(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= i0Var.f(oVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= i0Var.h(cVar) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        if ((i10 & 24576) == 0) {
            i15 |= i0Var.f(str) ? 16384 : 8192;
        }
        int i16 = i15 | 196608;
        if ((1572864 & i10) == 0) {
            i16 |= i0Var.h(eVar) ? 1048576 : 524288;
        }
        if (i0Var.T(i16 & 1, (599187 & i16) != 599186)) {
            if (i13 != 0) {
                oVar = v1.l.f17564b;
            }
            f1.f fVar = f1.m.f6385a;
            if (i14 != 0) {
                Object objQ = i0Var.Q();
                if (objQ == fVar) {
                    objQ = c.f14565b;
                    i0Var.l0(objQ);
                }
                cVar = (ej.c) objQ;
            }
            v1.g gVar = v1.b.f17547a;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = c.f14566c;
                i0Var.l0(objQ2);
            }
            ej.c cVar7 = (ej.c) objQ2;
            j1 j1VarV = t.d.v(obj, str, i0Var, (i16 & 14) | ((i16 >> 9) & 112), 0);
            int i17 = i16 & 8176;
            int i18 = i16 >> 3;
            ej.c cVar8 = cVar;
            v1.o oVar3 = oVar;
            b(j1VarV, oVar3, cVar8, cVar7, eVar, i0Var, i17 | (57344 & i18) | (i18 & 458752));
            cVar5 = gVar;
            oVar2 = oVar3;
            cVar4 = cVar8;
            cVar6 = cVar7;
        } else {
            i0Var.W();
            oVar2 = oVar;
            cVar4 = cVar;
            cVar5 = cVar2;
            cVar6 = cVar3;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d(obj, oVar2, cVar4, cVar5, str, cVar6, eVar, i10, i11);
        }
    }

    public static final void b(j1 j1Var, v1.o oVar, ej.c cVar, ej.c cVar2, p1.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        ej.c cVar3;
        f1.i0 i0Var2;
        t1.q qVar;
        r rVar;
        t1.q qVar2;
        Object obj;
        f1 f1VarL;
        j1 j1Var2 = j1Var;
        Object obj2 = v1.b.f17547a;
        i0Var.c0(511725103);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(j1Var2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(cVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.f(obj2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= i0Var.h(cVar2) ? 16384 : 8192;
        }
        p1.e eVar2 = eVar;
        if ((196608 & i10) == 0) {
            i11 |= i0Var.h(eVar2) ? 131072 : 65536;
        }
        if (i0Var.T(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z2 = i12 == 4;
            Object objQ = i0Var.Q();
            Object obj3 = f1.m.f6385a;
            if (z2 || objQ == obj3) {
                objQ = new r(j1Var2);
                i0Var.l0(objQ);
            }
            r rVar2 = (r) objQ;
            boolean z10 = i12 == 4;
            Object objQ2 = i0Var.Q();
            Object obj4 = objQ2;
            if (z10 || objQ2 == obj3) {
                Object[] objArr = {j1Var2.c()};
                t1.q qVar3 = new t1.q();
                qVar3.addAll(qi.k.v0(objArr));
                i0Var.l0(qVar3);
                obj4 = qVar3;
            }
            t1.q qVar4 = (t1.q) obj4;
            boolean z11 = i12 == 4;
            Object objQ3 = i0Var.Q();
            if (z11 || objQ3 == obj3) {
                long[] jArr = q.n0.f13108a;
                objQ3 = new q.g0();
                i0Var.l0(objQ3);
            }
            q.g0 g0Var = (q.g0) objQ3;
            Object objC = j1Var2.c();
            f1.j1 j1Var3 = j1Var2.f15203d;
            if (!qVar4.contains(objC)) {
                qVar4.clear();
                qVar4.add(j1Var2.c());
            }
            if (fj.l.b(j1Var2.c(), j1Var3.getValue())) {
                if (qVar4.size() != 1 || !fj.l.b(qVar4.get(0), j1Var2.c())) {
                    qVar4.clear();
                    qVar4.add(j1Var2.c());
                }
                if (g0Var.f13077e != 1 || g0Var.c(j1Var2.c())) {
                    g0Var.a();
                }
                rVar2.getClass();
            }
            if (!fj.l.b(j1Var2.c(), j1Var3.getValue()) && !qVar4.contains(j1Var3.getValue())) {
                ListIterator listIterator = qVar4.listIterator();
                int i13 = 0;
                while (true) {
                    ri.a aVar = (ri.a) listIterator;
                    if (!aVar.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (fj.l.b(cVar2.invoke(aVar.next()), cVar2.invoke(j1Var3.getValue()))) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    qVar4.add(j1Var3.getValue());
                } else {
                    qVar4.set(i13, j1Var3.getValue());
                }
            }
            if (g0Var.c(j1Var3.getValue()) && g0Var.c(j1Var2.c())) {
                i0Var.b0(1968995539);
                i0Var.p(false);
                qVar = qVar4;
                rVar = rVar2;
                cVar3 = cVar;
            } else {
                i0Var.b0(1966410449);
                g0Var.a();
                int size = qVar4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj5 = qVar4.get(i14);
                    r rVar3 = rVar2;
                    p1.e eVar3 = eVar2;
                    t1.q qVar5 = qVar4;
                    g0Var.m(obj5, p1.j.d(-23915175, new h(j1Var2, obj5, cVar, rVar3, qVar5, eVar3), i0Var));
                    i14++;
                    j1Var2 = j1Var;
                    rVar2 = rVar3;
                    qVar4 = qVar5;
                    eVar2 = eVar;
                }
                qVar = qVar4;
                rVar = rVar2;
                cVar3 = cVar;
                i0Var.p(false);
            }
            boolean zF = i0Var.f(j1Var.f()) | i0Var.f(rVar);
            Object objQ4 = i0Var.Q();
            if (zF || objQ4 == obj3) {
                objQ4 = (f0) cVar3.invoke(rVar);
                i0Var.l0(objQ4);
            }
            f0 f0Var = (f0) objQ4;
            j1 j1Var4 = rVar.f14666a;
            boolean zF2 = i0Var.f(rVar);
            Object objQ5 = i0Var.Q();
            if (zF2 || objQ5 == obj3) {
                objQ5 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ5);
            }
            f1.a1 a1Var = (f1.a1) objQ5;
            f1.a1 a1VarK = f1.s.K(f0Var.f14597d, i0Var);
            if (fj.l.b(j1Var4.c(), j1Var4.f15203d.getValue())) {
                a1Var.setValue(Boolean.FALSE);
            } else if (a1VarK.getValue() != null) {
                a1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            v1.o oVarD = v1.l.f17564b;
            if (zBooleanValue) {
                i0Var.b0(1353077497);
                qVar2 = qVar;
                i0Var2 = i0Var;
                obj = null;
                f1VarL = t.d.l(rVar.f14666a, t.d.f15143q, null, i0Var2, 0, 2);
                boolean zF3 = i0Var2.f(f1VarL);
                Object objQ6 = i0Var2.Q();
                if (zF3 || objQ6 == obj3) {
                    a1 a1Var2 = (a1) a1VarK.getValue();
                    if (a1Var2 == null || a1Var2.f14561a) {
                        oVarD = z1.h.d(oVarD);
                    }
                    i0Var2.l0(oVarD);
                    objQ6 = oVarD;
                }
                oVarD = (v1.o) objQ6;
                i0Var2.p(false);
            } else {
                qVar2 = qVar;
                i0Var2 = i0Var;
                obj = null;
                i0Var2.b0(1353343539);
                i0Var2.p(false);
                f1VarL = null;
            }
            v1.o oVarC = oVar.c(oVarD.c(new o(f1VarL, a1VarK, rVar)));
            Object objQ7 = i0Var2.Q();
            if (objQ7 == obj3) {
                objQ7 = new l(rVar);
                i0Var2.l0(objQ7);
            }
            l lVar = (l) objQ7;
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, lVar);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            i0Var2.b0(-860173498);
            int size2 = qVar2.size();
            int i15 = 0;
            while (i15 < size2) {
                t1.q qVar6 = qVar2;
                Object obj6 = qVar6.get(i15);
                i0Var2.X(cVar2.invoke(obj6), -2026002954, 0, obj);
                ej.e eVar4 = (ej.e) g0Var.g(obj6);
                if (eVar4 == null) {
                    i0Var2.b0(1618454323);
                } else {
                    i0Var2.b0(-2026001778);
                    eVar4.invoke(i0Var2, 0);
                }
                i0Var2.p(false);
                i0Var2.p(false);
                i15++;
                qVar2 = qVar6;
            }
            i0Var2.p(false);
            i0Var2.p(true);
        } else {
            cVar3 = cVar;
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(j1Var, oVar, cVar3, cVar2, eVar, i10);
        }
    }
}
