package b4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1553a = new b();

    public static boolean a(a4.d dVar) {
        int[] iArr = dVar.f129o0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        a4.d dVar2 = dVar.S;
        a4.e eVar = dVar2 != null ? (a4.e) dVar2 : null;
        if (eVar != null) {
            int i12 = eVar.f129o0[0];
        }
        if (eVar != null) {
            int i13 = eVar.f129o0[1];
        }
        boolean z2 = i10 == 1 || dVar.x() || i10 == 2 || (i10 == 3 && dVar.f131q == 0 && dVar.V == 0.0f && dVar.q(0)) || (i10 == 3 && dVar.f131q == 1 && dVar.r(0, dVar.n()));
        boolean z10 = i11 == 1 || dVar.y() || i11 == 2 || (i11 == 3 && dVar.f132r == 0 && dVar.V == 0.0f && dVar.q(1)) || (i10 == 3 && dVar.f132r == 1 && dVar.r(1, dVar.k()));
        return (dVar.V > 0.0f && (z2 || z10)) || (z2 && z10);
    }

    public static n b(a4.d dVar, int i10, ArrayList arrayList, n nVar) {
        int i11;
        int i12 = i10 == 0 ? dVar.f125m0 : dVar.f127n0;
        if (i12 != -1 && (nVar == null || i12 != nVar.f1561b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i13);
                if (nVar2.f1561b == i12) {
                    if (nVar != null) {
                        nVar.c(i10, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof a4.i) {
                a4.i iVar = (a4.i) dVar;
                int i14 = 0;
                while (true) {
                    if (i14 >= iVar.f177q0) {
                        i11 = -1;
                        break;
                    }
                    a4.d dVar2 = iVar.f176p0[i14];
                    if ((i10 == 0 && (i11 = dVar2.f125m0) != -1) || (i10 == 1 && (i11 = dVar2.f127n0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i15);
                        if (nVar3.f1561b == i11) {
                            nVar = nVar3;
                            break;
                        }
                        i15++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f1560a = new ArrayList();
                nVar.f1563d = null;
                nVar.f1564e = -1;
                int i16 = n.f1559f;
                n.f1559f = i16 + 1;
                nVar.f1561b = i16;
                nVar.f1562c = i10;
            }
            arrayList.add(nVar);
        }
        int i17 = nVar.f1561b;
        ArrayList arrayList2 = nVar.f1560a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof a4.h) {
            a4.h hVar = (a4.h) dVar;
            hVar.f173s0.c(hVar.f174t0 == 0 ? 1 : 0, nVar, arrayList);
        }
        if (i10 == 0) {
            dVar.f125m0 = i17;
            dVar.H.c(i10, nVar, arrayList);
            dVar.J.c(i10, nVar, arrayList);
        } else {
            dVar.f127n0 = i17;
            dVar.I.c(i10, nVar, arrayList);
            dVar.L.c(i10, nVar, arrayList);
            dVar.K.c(i10, nVar, arrayList);
        }
        dVar.O.c(i10, nVar, arrayList);
        return nVar;
    }

    public static void c(int i10, a4.d dVar, d4.f fVar, boolean z2) {
        a4.c cVar;
        a4.c cVar2;
        char c6;
        a4.c cVar3;
        a4.c cVar4;
        a4.c cVar5;
        if (dVar.f122l) {
            return;
        }
        if (!(dVar instanceof a4.e) && dVar.w() && a(dVar)) {
            a4.e.Q(dVar, fVar, new b());
        }
        a4.c cVarI = dVar.i(2);
        a4.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f92a;
        if (hashSet != null && cVarI.f94c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                a4.c cVar6 = (a4.c) it.next();
                a4.d dVar2 = cVar6.f95d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                a4.c cVar7 = dVar2.H;
                a4.c cVar8 = dVar2.J;
                if (dVar2.w() && zA) {
                    c6 = 0;
                    a4.e.Q(dVar2, fVar, new b());
                } else {
                    c6 = 0;
                }
                int i12 = dVar2.f129o0[c6];
                if (i12 != 3 || zA) {
                    if (!dVar2.w()) {
                        if (cVar6 == cVar7 && cVar8.f97f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.E(iE, dVar2.n() + iE);
                            c(i11, dVar2, fVar, z2);
                        } else if (cVar6 == cVar8 && cVar7.f97f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.E(iE2 - dVar2.n(), iE2);
                            c(i11, dVar2, fVar, z2);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f97f) != null && cVar3.f94c && !dVar2.u()) {
                            d(i11, dVar2, fVar, z2);
                        }
                    }
                } else if (i12 == 3 && dVar2.f135u >= 0 && dVar2.f134t >= 0 && (dVar2.f112f0 == 8 || (dVar2.f131q == 0 && dVar2.V == 0.0f))) {
                    if (!dVar2.u() && !dVar2.E && ((cVar6 == cVar7 && (cVar5 = cVar8.f97f) != null && cVar5.f94c) || (cVar6 == cVar8 && (cVar4 = cVar7.f97f) != null && cVar4.f94c))) {
                        if (!dVar2.u()) {
                            e(i11, dVar, fVar, dVar2, z2);
                        }
                    }
                }
            }
        }
        if (dVar instanceof a4.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f92a;
        if (hashSet2 != null && cVarI2.f94c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                a4.c cVar9 = (a4.c) it2.next();
                a4.d dVar3 = cVar9.f95d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                a4.c cVar10 = dVar3.H;
                a4.c cVar11 = dVar3.J;
                if (dVar3.w() && zA2) {
                    a4.e.Q(dVar3, fVar, new b());
                }
                boolean z10 = (cVar9 == cVar10 && (cVar2 = cVar11.f97f) != null && cVar2.f94c) || (cVar9 == cVar11 && (cVar = cVar10.f97f) != null && cVar.f94c);
                int i14 = dVar3.f129o0[0];
                if (i14 != 3 || zA2) {
                    if (!dVar3.w()) {
                        if (cVar9 == cVar10 && cVar11.f97f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.E(iE3, dVar3.n() + iE3);
                            c(i13, dVar3, fVar, z2);
                        } else if (cVar9 == cVar11 && cVar10.f97f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.E(iE4 - dVar3.n(), iE4);
                            c(i13, dVar3, fVar, z2);
                        } else if (z10 && !dVar3.u()) {
                            d(i13, dVar3, fVar, z2);
                        }
                    }
                } else if (i14 == 3 && dVar3.f135u >= 0 && dVar3.f134t >= 0 && (dVar3.f112f0 == 8 || (dVar3.f131q == 0 && dVar3.V == 0.0f))) {
                    if (!dVar3.u() && !dVar3.E && z10 && !dVar3.u()) {
                        e(i13, dVar, fVar, dVar3, z2);
                    }
                }
            }
        }
        dVar.f122l = true;
    }

    public static void d(int i10, a4.d dVar, d4.f fVar, boolean z2) {
        float f10 = dVar.f106c0;
        a4.c cVar = dVar.H;
        int iD = cVar.f97f.d();
        a4.c cVar2 = dVar.J;
        int iD2 = cVar2.f97f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = dVar.n();
        int i11 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i11 = (iD - iD2) - iN;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iN;
        if (iD > iD2) {
            i13 = i12 - iN;
        }
        dVar.E(i12, i13);
        c(i10 + 1, dVar, fVar, z2);
    }

    public static void e(int i10, a4.d dVar, d4.f fVar, a4.d dVar2, boolean z2) {
        float f10 = dVar2.f106c0;
        a4.c cVar = dVar2.H;
        int iE = cVar.e() + cVar.f97f.d();
        a4.c cVar2 = dVar2.J;
        int iD = cVar2.f97f.d() - cVar2.e();
        if (iD >= iE) {
            int iN = dVar2.n();
            if (dVar2.f112f0 != 8) {
                int i11 = dVar2.f131q;
                if (i11 == 2) {
                    iN = (int) (dVar2.f106c0 * 0.5f * (dVar instanceof a4.e ? dVar.n() : dVar.S.n()));
                } else if (i11 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(dVar2.f134t, iN);
                int i12 = dVar2.f135u;
                if (i12 > 0) {
                    iN = Math.min(i12, iN);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iN)) + 0.5f));
            dVar2.E(i13, iN + i13);
            c(i10 + 1, dVar2, fVar, z2);
        }
    }

    public static void f(int i10, a4.d dVar, d4.f fVar) {
        float f10 = dVar.f108d0;
        a4.c cVar = dVar.I;
        int iD = cVar.f97f.d();
        a4.c cVar2 = dVar.K;
        int iD2 = cVar2.f97f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i11 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i11 = (iD - iD2) - iK;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iK;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iK;
        }
        dVar.F(i13, i14);
        i(i10 + 1, dVar, fVar);
    }

    public static void g(int i10, a4.d dVar, d4.f fVar, a4.d dVar2) {
        float f10 = dVar2.f108d0;
        a4.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f97f.d();
        a4.c cVar2 = dVar2.K;
        int iD = cVar2.f97f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f112f0 != 8) {
                int i11 = dVar2.f132r;
                if (i11 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof a4.e ? dVar.k() : dVar.S.k()));
                } else if (i11 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f137w, iK);
                int i12 = dVar2.f138x;
                if (i12 > 0) {
                    iK = Math.min(i12, iK);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.F(i13, iK + i13);
            i(i10 + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    public static void i(int i10, a4.d dVar, d4.f fVar) {
        a4.c cVar;
        a4.c cVar2;
        float f10;
        a4.c cVar3;
        a4.c cVar4;
        a4.c cVar5;
        if (dVar.f124m) {
            return;
        }
        if (!(dVar instanceof a4.e) && dVar.w() && a(dVar)) {
            a4.e.Q(dVar, fVar, new b());
        }
        a4.c cVarI = dVar.i(3);
        a4.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet hashSet = cVarI.f92a;
        if (hashSet != null && cVarI.f94c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                a4.c cVar6 = (a4.c) it.next();
                a4.d dVar2 = cVar6.f95d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                a4.c cVar7 = dVar2.I;
                a4.c cVar8 = dVar2.K;
                if (dVar2.w() && zA) {
                    f10 = 0.0f;
                    a4.e.Q(dVar2, fVar, new b());
                } else {
                    f10 = 0.0f;
                }
                int i12 = dVar2.f129o0[1];
                if (i12 != 3 || zA) {
                    if (!dVar2.w()) {
                        if (cVar6 == cVar7 && cVar8.f97f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.F(iE, dVar2.k() + iE);
                            i(i11, dVar2, fVar);
                        } else if (cVar6 == cVar8 && cVar8.f97f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.F(iE2 - dVar2.k(), iE2);
                            i(i11, dVar2, fVar);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f97f) != null && cVar3.f94c) {
                            f(i11, dVar2, fVar);
                        }
                    }
                } else if (i12 == 3 && dVar2.f138x >= 0 && dVar2.f137w >= 0 && (dVar2.f112f0 == 8 || (dVar2.f132r == 0 && dVar2.V == f10))) {
                    if (!dVar2.v() && !dVar2.E && ((cVar6 == cVar7 && (cVar5 = cVar8.f97f) != null && cVar5.f94c) || (cVar6 == cVar8 && (cVar4 = cVar7.f97f) != null && cVar4.f94c))) {
                        if (!dVar2.v()) {
                            g(i11, dVar, fVar, dVar2);
                        }
                    }
                }
            }
        }
        if (dVar instanceof a4.h) {
            return;
        }
        HashSet hashSet2 = cVarI2.f92a;
        if (hashSet2 != null && cVarI2.f94c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                a4.c cVar9 = (a4.c) it2.next();
                a4.d dVar3 = cVar9.f95d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                a4.c cVar10 = dVar3.I;
                a4.c cVar11 = dVar3.K;
                if (dVar3.w() && zA2) {
                    a4.e.Q(dVar3, fVar, new b());
                }
                boolean z2 = (cVar9 == cVar10 && (cVar2 = cVar11.f97f) != null && cVar2.f94c) || (cVar9 == cVar11 && (cVar = cVar10.f97f) != null && cVar.f94c);
                int i14 = dVar3.f129o0[1];
                if (i14 != 3 || zA2) {
                    if (!dVar3.w()) {
                        if (cVar9 == cVar10 && cVar11.f97f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.F(iE3, dVar3.k() + iE3);
                            i(i13, dVar3, fVar);
                        } else if (cVar9 == cVar11 && cVar10.f97f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.F(iE4 - dVar3.k(), iE4);
                            i(i13, dVar3, fVar);
                        } else if (z2 && !dVar3.v()) {
                            f(i13, dVar3, fVar);
                        }
                    }
                } else if (i14 == 3 && dVar3.f138x >= 0 && dVar3.f137w >= 0 && (dVar3.f112f0 == 8 || (dVar3.f132r == 0 && dVar3.V == 0.0f))) {
                    if (!dVar3.v() && !dVar3.E && z2 && !dVar3.v()) {
                        g(i13, dVar, fVar, dVar3);
                    }
                }
            }
        }
        a4.c cVarI3 = dVar.i(6);
        if (cVarI3.f92a != null && cVarI3.f94c) {
            int iD3 = cVarI3.d();
            Iterator it3 = cVarI3.f92a.iterator();
            while (it3.hasNext()) {
                a4.c cVar12 = (a4.c) it3.next();
                a4.d dVar4 = cVar12.f95d;
                int i15 = i10 + 1;
                boolean zA3 = a(dVar4);
                a4.c cVar13 = dVar4.L;
                if (dVar4.w() && zA3) {
                    a4.e.Q(dVar4, fVar, new b());
                }
                if (dVar4.f129o0[1] != 3 || zA3) {
                    if (!dVar4.w() && cVar12 == cVar13) {
                        int iE5 = cVar12.e() + iD3;
                        if (dVar4.D) {
                            int i16 = iE5 - dVar4.Z;
                            int i17 = dVar4.U + i16;
                            dVar4.Y = i16;
                            dVar4.I.l(i16);
                            dVar4.K.l(i17);
                            cVar13.l(iE5);
                            dVar4.f120k = true;
                        }
                        i(i15, dVar4, fVar);
                    }
                }
            }
        }
        dVar.f124m = true;
    }
}
