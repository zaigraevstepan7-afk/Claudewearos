package sa;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c1.v7;
import f1.f1;
import f1.g1;
import f1.n1;
import f1.q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float f14848a = 32;

    /* renamed from: b, reason: collision with root package name */
    public static final float f14849b = 88;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f14850c;

    static {
        kj.c cVar = new kj.c('A', 'Z');
        ArrayList arrayList = new ArrayList(qi.m.s0(cVar));
        Iterator it = cVar.iterator();
        while (true) {
            kj.b bVar = (kj.b) it;
            if (!bVar.f9661c) {
                f14850c = arrayList;
                return;
            }
            arrayList.add(String.valueOf(bVar.a()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final v1.o r29, final java.util.List r30, final boolean r31, final boolean r32, final java.util.Map r33, final java.util.List r34, final java.lang.String r35, final float r36, final boolean r37, final ej.e r38, final ej.c r39, ej.c r40, f1.i0 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.g.a(v1.o, java.util.List, boolean, boolean, java.util.Map, java.util.List, java.lang.String, float, boolean, ej.e, ej.c, ej.c, f1.i0, int, int):void");
    }

    public static final void b(List list, v1.o oVar, ej.c cVar, f1.i0 i0Var, int i10) {
        int i11;
        Object eVar;
        f1 f1Var;
        g1 g1Var;
        String str;
        float fCos;
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-1074002958);
        int i12 = i10 | (i0Var2.h(list) ? 4 : 2) | (i0Var2.f(oVar) ? 32 : 16) | (i0Var2.h(cVar) ? 256 : 128);
        if (i0Var2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = i0Var2.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = y8.f.a(Float.NaN, i0Var2);
            }
            f1 f1Var2 = (f1) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == obj) {
                objQ2 = y8.f.a(Float.NaN, i0Var2);
            }
            f1 f1Var3 = (f1) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == obj) {
                objQ3 = new g1(1);
                i0Var2.l0(objQ3);
            }
            g1 g1Var2 = (g1) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == obj) {
                objQ4 = new g1(1);
                i0Var2.l0(objQ4);
            }
            g1 g1Var3 = (g1) objQ4;
            Object objQ5 = i0Var2.Q();
            if (objQ5 == obj) {
                objQ5 = new t1(16, g1Var2, g1Var3);
                i0Var2.l0(objQ5);
            }
            v1.o oVarN = t2.z.n(oVar, (ej.c) objQ5);
            boolean zH = ((i12 & 896) == 256) | i0Var2.h(list);
            Object objQ6 = i0Var2.Q();
            if (zH || objQ6 == obj) {
                f1Var = f1Var2;
                g1Var = g1Var3;
                eVar = new e(list, cVar, g1Var, f1Var, f1Var3);
                i0Var2.l0(eVar);
            } else {
                eVar = objQ6;
                f1Var = f1Var2;
                g1Var = g1Var3;
            }
            v1.o oVarA = p2.k0.a(oVarN, list, (PointerInputEventHandler) eVar);
            b0.b0 b0VarA = b0.z.a(b0.j.f1364f, v1.b.G, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarA);
            v2.h.f17668w.getClass();
            ej.a aVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            i0Var2.b0(-847007338);
            int i13 = 0;
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    yd.f.i0();
                    throw null;
                }
                String str2 = (String) next;
                float fAbs = Float.isNaN(f1Var3.g()) ? Float.MAX_VALUE : Math.abs(f1Var3.g() - (((i13 + 0.5f) / list.size()) * g1Var.g()));
                if (Float.isNaN(f1Var3.g())) {
                    str = str2;
                    fCos = 0.0f;
                } else {
                    str = str2;
                    fCos = (float) ((Math.cos(cg.b.o(fAbs / 260.0f, 0.0f, 1.0f) * 3.141592653589793d) + 1.0f) / 2.0f);
                }
                Object obj2 = obj;
                g1 g1Var4 = g1Var2;
                float f10 = fCos;
                q2 q2VarB = t.e.b((((Float.isNaN(f1Var.g()) ? 0.0f : cg.b.o(g1Var2.g() - f1Var.g(), 0.0f, 180.0f)) * 0.48f) + 300.0f) * (-fCos), null, "drawerAlphabetBulge", null, i0Var2, 3072, 22);
                q2 q2VarB2 = t.e.b((0.08f * f10) + 1.0f, null, "drawerAlphabetScale", null, i0Var, 3072, 22);
                long jC = c2.w.c(c2.w.f3054d, (f10 * 0.5f) + 0.5f);
                long jX = hj.a.x(11);
                k3.s sVar = k3.s.A;
                boolean zF = i0Var.f(q2VarB2) | i0Var.f(q2VarB);
                Object objQ7 = i0Var.Q();
                if (zF || objQ7 == obj2) {
                    objQ7 = new ab.y(q2VarB2, q2VarB, 1);
                    i0Var.l0(objQ7);
                }
                v7.a(str, c2.e0.q(v1.l.f17564b, (ej.c) objQ7), jC, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597440, 0, 262056);
                i0Var2 = i0Var;
                i13 = i14;
                g1Var2 = g1Var4;
                g1Var = g1Var;
                obj = obj2;
            }
            i11 = i10;
            i0Var2.p(false);
            i0Var2.p(true);
        } else {
            i11 = i10;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0.x(list, oVar, cVar, i11);
        }
    }

    public static final void c(final List list, final int i10, final int i11, final int i12, final xa.b bVar, final s3.c cVar, final ej.e eVar, final ej.c cVar2, final ej.c cVar3, f1.i0 i0Var, final int i13) {
        int i14;
        final int i15;
        int i16;
        int i17;
        xa.b bVar2;
        ej.e eVar2;
        i0Var.c0(-1748859249);
        if ((i13 & 6) == 0) {
            i14 = (i0Var.h(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 = i10;
            i14 |= i0Var.d(i15) ? 32 : 16;
        } else {
            i15 = i10;
        }
        if ((i13 & 384) == 0) {
            i16 = i11;
            i14 |= i0Var.d(i16) ? 256 : 128;
        } else {
            i16 = i11;
        }
        if ((i13 & 3072) == 0) {
            i17 = i12;
            i14 |= i0Var.d(i17) ? 2048 : 1024;
        } else {
            i17 = i12;
        }
        if ((i13 & 24576) == 0) {
            bVar2 = bVar;
            i14 |= i0Var.f(bVar2) ? 16384 : 8192;
        } else {
            bVar2 = bVar;
        }
        if ((196608 & i13) == 0) {
            i14 |= i0Var.f(cVar) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            eVar2 = eVar;
            i14 |= i0Var.h(eVar2) ? 1048576 : 524288;
        } else {
            eVar2 = eVar;
        }
        if ((i13 & 12582912) == 0) {
            i14 |= i0Var.h(cVar2) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i14 |= i0Var.h(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i14 |= i0Var.h(cVar3) ? 536870912 : 268435456;
        }
        if (i0Var.T(i14 & 1, (306783379 & i14) != 306783378)) {
            v1.o oVarD = z1.h.d(b0.t1.f1433c);
            boolean z2 = ((458752 & i14) == 131072) | ((234881024 & i14) == 67108864) | ((1879048192 & i14) == 536870912);
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (z2 || objQ == fVar) {
                objQ = new fi.h(cVar, cVar3, 1);
                i0Var.l0(objQ);
            }
            ej.c cVar4 = (ej.c) objQ;
            boolean zH = ((i14 & 112) == 32) | i0Var.h(list) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048) | ((57344 & i14) == 16384) | ((3670016 & i14) == 1048576) | ((i14 & 29360128) == 8388608);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == fVar) {
                final int i18 = i16;
                final int i19 = i17;
                final xa.b bVar3 = bVar2;
                final ej.e eVar3 = eVar2;
                ej.c cVar5 = new ej.c() { // from class: sa.c
                    @Override // ej.c
                    public final Object invoke(Object obj) {
                        x xVar = (x) obj;
                        fj.l.f(xVar, "recycler");
                        t6.x adapter = xVar.getAdapter();
                        k kVar = adapter instanceof k ? (k) adapter : null;
                        List list2 = list;
                        if (kVar == null) {
                            xVar.setAdapter(new k(list2, i15, i18, i19, bVar3, eVar3, cVar2));
                        } else {
                            fj.l.f(list2, "newApps");
                            kVar.f14887d = list2;
                            kVar.f16076a.b();
                        }
                        return pi.o.f13011a;
                    }
                };
                i0Var.l0(cVar5);
                objQ2 = cVar5;
            }
            v3.j.a(48, 0, cVar4, (ej.c) objQ2, i0Var, oVarD);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: sa.a
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g.c(list, i10, i11, i12, bVar, cVar, eVar, cVar2, cVar3, (f1.i0) obj, f1.s.O(i13 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void d(List list, ej.c cVar, g1 g1Var, f1 f1Var, f1 f1Var2, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j));
        int iP = cg.b.p((int) ((fIntBitsToFloat / g1Var.g()) * list.size()), 0, yd.f.B(list));
        f1Var.h(Float.intBitsToFloat((int) (j >> 32)));
        f1Var2.h(cg.b.o(fIntBitsToFloat, 0.0f, g1Var.g()));
        cVar.invoke(list.get(iP));
    }
}
