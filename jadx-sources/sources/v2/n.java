package v2;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f17730a = new o1(1);

    public static final View A(j jVar) {
        if (!((v1.n) jVar).f17565a.G) {
            s2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(y(jVar));
    }

    public static final void B(j jVar, Object obj, ej.c cVar) {
        b1 b1Var;
        boolean z2;
        v1.n nVar = (v1.n) jVar;
        if (!nVar.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar2 = nVar.f17565a.f17569e;
        f0 f0VarY = y(jVar);
        while (f0VarY != null) {
            if ((f0VarY.Y.f17586f.f17568d & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f17567c & 262144) != 0) {
                        v1.n nVarE = nVar2;
                        g1.e eVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e2) {
                                e2 e2Var = (e2) nVarE;
                                if (!(obj.equals(e2Var.D()) ? ((Boolean) cVar.invoke(e2Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (((nVarE.f17567c & 262144) != 0) && (nVarE instanceof k)) {
                                    int i10 = 0;
                                    for (v1.n nVar3 = ((k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                        if ((nVar3.f17567c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarE = nVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar.b(nVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            nVarE = e(eVar);
                        }
                    }
                    nVar2 = nVar2.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar2 = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(e2 e2Var, ej.c cVar) {
        b1 b1Var;
        boolean z2;
        v1.n nVar = (v1.n) e2Var;
        if (!nVar.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar2 = nVar.f17565a.f17569e;
        f0 f0VarY = y(e2Var);
        while (f0VarY != null) {
            if ((f0VarY.Y.f17586f.f17568d & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f17567c & 262144) != 0) {
                        v1.n nVarE = nVar2;
                        g1.e eVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e2) {
                                e2 e2Var2 = (e2) nVarE;
                                if (!((fj.l.b(e2Var.D(), e2Var2.D()) && e2Var.getClass() == e2Var2.getClass()) ? ((Boolean) cVar.invoke(e2Var2)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (((nVarE.f17567c & 262144) != 0) && (nVarE instanceof k)) {
                                    int i10 = 0;
                                    for (v1.n nVar3 = ((k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                        if ((nVar3.f17567c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarE = nVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar.b(nVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            nVarE = e(eVar);
                        }
                    }
                    nVar2 = nVar2.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar2 = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ej.c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void D(v1.n nVar, String str, ej.c cVar) {
        if (!nVar.f17565a.G) {
            s2.a.b("visitSubtreeIf called on an unattached node");
        }
        g1.e eVar = new g1.e(new v1.n[16]);
        v1.n nVar2 = nVar.f17565a;
        v1.n nVar3 = nVar2.f17570f;
        if (nVar3 == null) {
            b(eVar, nVar2);
        } else {
            eVar.b(nVar3);
        }
        while (true) {
            int i10 = eVar.f7026c;
            if (i10 == 0) {
                return;
            }
            v1.n nVar4 = (v1.n) eVar.l(i10 - 1);
            if ((nVar4.f17568d & 262144) != 0) {
                for (v1.n nVar5 = nVar4; nVar5 != null && nVar5.G; nVar5 = nVar5.f17570f) {
                    if ((nVar5.f17567c & 262144) != 0) {
                        k kVarE = nVar5;
                        ?? eVar2 = 0;
                        while (kVarE != 0) {
                            if (kVarE instanceof e2) {
                                e2 e2Var = (e2) kVarE;
                                d2 d2Var = str.equals(e2Var.D()) ? (d2) cVar.invoke(e2Var) : d2.f17606a;
                                if (d2Var == d2.f17608c) {
                                    return;
                                }
                                if (d2Var == d2.f17607b) {
                                    break;
                                }
                            } else if ((kVarE.f17567c & 262144) != 0 && (kVarE instanceof k)) {
                                v1.n nVar6 = kVarE.I;
                                int i11 = 0;
                                kVarE = kVarE;
                                eVar2 = eVar2;
                                while (nVar6 != null) {
                                    if ((nVar6.f17567c & 262144) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            kVarE = nVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new g1.e(new v1.n[16]);
                                            }
                                            if (kVarE != 0) {
                                                eVar2.b(kVarE);
                                                kVarE = 0;
                                            }
                                            eVar2.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f17570f;
                                    kVarE = kVarE;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            kVarE = e(eVar2);
                        }
                    }
                }
            }
            b(eVar, nVar4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, v2.e2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ej.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void E(e2 e2Var, ej.c cVar) {
        v1.n nVar = (v1.n) e2Var;
        if (!nVar.f17565a.G) {
            s2.a.b("visitSubtreeIf called on an unattached node");
        }
        g1.e eVar = new g1.e(new v1.n[16]);
        v1.n nVar2 = nVar.f17565a;
        v1.n nVar3 = nVar2.f17570f;
        if (nVar3 == null) {
            b(eVar, nVar2);
        } else {
            eVar.b(nVar3);
        }
        while (true) {
            int i10 = eVar.f7026c;
            if (i10 == 0) {
                return;
            }
            v1.n nVar4 = (v1.n) eVar.l(i10 - 1);
            if ((nVar4.f17568d & 262144) != 0) {
                for (v1.n nVar5 = nVar4; nVar5 != null && nVar5.G; nVar5 = nVar5.f17570f) {
                    if ((nVar5.f17567c & 262144) != 0) {
                        k kVarE = nVar5;
                        ?? eVar2 = 0;
                        while (kVarE != 0) {
                            if (kVarE instanceof e2) {
                                e2 e2Var2 = (e2) kVarE;
                                d2 d2Var = (fj.l.b(e2Var.D(), e2Var2.D()) && e2Var.getClass() == e2Var2.getClass()) ? (d2) cVar.invoke(e2Var2) : d2.f17606a;
                                if (d2Var == d2.f17608c) {
                                    return;
                                }
                                if (d2Var == d2.f17607b) {
                                    break;
                                }
                            } else if ((kVarE.f17567c & 262144) != 0 && (kVarE instanceof k)) {
                                v1.n nVar6 = kVarE.I;
                                int i11 = 0;
                                kVarE = kVarE;
                                eVar2 = eVar2;
                                while (nVar6 != null) {
                                    if ((nVar6.f17567c & 262144) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            kVarE = nVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new g1.e(new v1.n[16]);
                                            }
                                            if (kVarE != 0) {
                                                eVar2.b(kVarE);
                                                kVarE = 0;
                                            }
                                            eVar2.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f17570f;
                                    kVarE = kVarE;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            kVarE = e(eVar2);
                        }
                    }
                }
            }
            b(eVar, nVar4);
        }
    }

    public static final long a(float f10, boolean z2, boolean z10) {
        return (((z2 ? 1L : 0L) | (z10 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final void b(g1.e eVar, v1.n nVar) {
        g1.e eVarY = y(nVar).y();
        int i10 = eVarY.f7026c - 1;
        Object[] objArr = eVarY.f7024a;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b(((f0) objArr[i10]).Y.f17586f);
                i10--;
            }
        }
    }

    public static final int c(n0 n0Var, t2.a aVar) {
        n0 n0VarX0 = n0Var.X0();
        if (n0VarX0 == null) {
            s2.a.b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.e1().f().containsKey(aVar)) {
            Integer num = (Integer) n0Var.e1().f().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iX0 = n0VarX0.x0(aVar);
            if (iX0 != Integer.MIN_VALUE) {
                n0VarX0.C = true;
                n0Var.D = true;
                n0Var.k1();
                n0VarX0.C = false;
                n0Var.D = false;
                return iX0 + ((int) (aVar instanceof t2.m ? n0VarX0.g1() & 4294967295L : n0VarX0.g1() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final v1.n d(j jVar, int i10) {
        v1.n nVar = ((v1.n) jVar).f17565a.f17570f;
        if (nVar == null || (nVar.f17568d & i10) == 0) {
            return null;
        }
        while (nVar != null) {
            int i11 = nVar.f17567c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return nVar;
            }
            nVar = nVar.f17570f;
        }
        return null;
    }

    public static final v1.n e(g1.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.f7026c) == 0) {
            return null;
        }
        return (v1.n) eVar.l(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w f(v1.n nVar) {
        if ((nVar.f17567c & 2) != 0) {
            if (nVar instanceof w) {
                return (w) nVar;
            }
            if (nVar instanceof k) {
                v1.n nVar2 = ((k) nVar).I;
                while (nVar2 != 0) {
                    if (nVar2 instanceof w) {
                        return (w) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof k) || (nVar2.f17567c & 2) == 0) ? nVar2.f17570f : ((k) nVar2).I;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j4) {
        boolean zQ = q(j);
        if (zQ != q(j4)) {
            return zQ ? -1 : 1;
        }
        return (Math.min(l(j), l(j4)) >= 0.0f && p(j) != p(j4)) ? p(j) ? -1 : 1 : (int) Math.signum(l(j) - l(j4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(i iVar, f1.q1 q1Var) {
        if (!((v1.n) iVar).f17565a.G) {
            s2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        p1.i iVar2 = (p1.i) y(iVar).U;
        iVar2.getClass();
        return f1.s.H(iVar2, q1Var);
    }

    public static final b2.c i(v1.n nVar, boolean z2, boolean z10) {
        if (!nVar.f17565a.G) {
            return b2.c.f1501e;
        }
        if (z2) {
            return v(nVar, 8).S1();
        }
        i1 i1VarV = v(nVar, 8);
        return t2.z.h(i1VarV).z(i1VarV, z10);
    }

    public static final e2 j(v1.n nVar, Object obj) {
        b1 b1Var;
        if (!nVar.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar2 = nVar.f17565a.f17569e;
        f0 f0VarY = y(nVar);
        while (f0VarY != null) {
            if ((f0VarY.Y.f17586f.f17568d & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f17567c & 262144) != 0) {
                        v1.n nVarE = nVar2;
                        g1.e eVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e2) {
                                e2 e2Var = (e2) nVarE;
                                if (obj.equals(e2Var.D())) {
                                    return e2Var;
                                }
                            }
                            if ((nVarE.f17567c & 262144) != 0 && (nVarE instanceof k)) {
                                int i10 = 0;
                                for (v1.n nVar3 = ((k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                    if ((nVar3.f17567c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar.b(nVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarE = e(eVar);
                        }
                    }
                    nVar2 = nVar2.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar2 = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
        return null;
    }

    public static final ArrayList k(t2.r rVar) {
        fj.l.d(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        f0 f0VarD1 = ((n0) rVar).d1();
        boolean zR = r(f0VarD1);
        g1.b bVar = (g1.b) f0VarD1.o();
        g1.e eVar = (g1.e) bVar.f7016b;
        ArrayList arrayList = new ArrayList(eVar.f7026c);
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) bVar.get(i11);
            arrayList.add(zR ? f0Var.l() : f0Var.m());
        }
        return arrayList;
    }

    public static final float l(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(m mVar) {
        if (((v1.n) mVar).f17565a.G) {
            v(mVar, 1).D1();
        }
    }

    public static final void n(w wVar) {
        y(wVar).D();
    }

    public static final void o(z1 z1Var) {
        y(z1Var).E();
    }

    public static final boolean p(long j) {
        return (j & 2) != 0;
    }

    public static final boolean q(long j) {
        return (j & 1) != 0;
    }

    public static final boolean r(f0 f0Var) {
        int iOrdinal = f0Var.Z.f17692d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new b3.e();
                }
                f0 f0VarU = f0Var.u();
                if (f0VarU != null) {
                    return r(f0VarU);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean s(f0 f0Var) {
        if (f0Var.A == null) {
            return false;
        }
        f0 f0VarU = f0Var.u();
        return (f0VarU != null ? f0VarU.A : null) == null || f0Var.Z.f17690b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(v1.n nVar, ej.a aVar) {
        n1 n1Var = nVar.f17571z;
        if (n1Var == null) {
            n1Var = new n1((m1) nVar);
            nVar.f17571z = n1Var;
        }
        t1 snapshotObserver = ((w2.t) z(nVar)).getSnapshotObserver();
        snapshotObserver.f17770a.c(n1Var, d.f17599f, aVar);
    }

    public static final void u(j jVar) {
        w1.c cVar;
        f0 f0VarY = y(jVar);
        if (f0VarY.M || (cVar = ((w2.t) i0.a(f0VarY)).f18402j0) == null) {
            return;
        }
        cVar.f18171d.f5752b.m(f0VarY.f17624b, new w1.b(cVar, f0VarY));
    }

    public static final i1 v(j jVar, int i10) {
        i1 i1Var = ((v1.n) jVar).f17565a.A;
        fj.l.c(i1Var);
        if (i1Var.w1() != jVar || !j1.g(i10)) {
            return i1Var;
        }
        i1 i1Var2 = i1Var.I;
        fj.l.c(i1Var2);
        return i1Var2;
    }

    public static final c2.b0 w(v1.n nVar) {
        return ((w2.t) z(nVar)).getGraphicsContext();
    }

    public static final i1 x(j jVar) {
        if (!((v1.n) jVar).f17565a.G) {
            s2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        i1 i1VarV = v(jVar, 2);
        if (!i1VarV.w1().G) {
            s2.a.b("LayoutCoordinates is not attached.");
        }
        return i1VarV;
    }

    public static final f0 y(j jVar) {
        i1 i1Var = ((v1.n) jVar).f17565a.A;
        if (i1Var != null) {
            return i1Var.H;
        }
        throw t.m1.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final r1 z(j jVar) {
        r1 r1Var = y(jVar).G;
        if (r1Var != null) {
            return r1Var;
        }
        throw t.m1.e("This node does not have an owner.");
    }
}
