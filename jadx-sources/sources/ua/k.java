package ua;

import b0.b0;
import b0.o1;
import b0.q1;
import b0.t1;
import b0.z;
import c1.a2;
import c1.c6;
import c1.g7;
import c1.j0;
import c1.k7;
import c1.n0;
import c1.n4;
import c1.o2;
import c1.v3;
import c1.v7;
import c1.w0;
import c1.x0;
import c1.x5;
import c1.z4;
import c2.e0;
import c2.w;
import f1.a1;
import f1.i0;
import f1.m;
import f1.n1;
import f1.s;
import g0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lb.r1;
import ta.n;
import ta.v;
import v1.l;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final long f16930a = e0.d(4280229928L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f16931b = e0.d(2569480244L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f16932c = e0.d(4282402130L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f16933d = e0.d(4294111990L);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16934e = 0;

    public static final void a(xa.f fVar, boolean z2, ej.c cVar, i0 i0Var, int i10) {
        i0Var.c0(1973432533);
        int i11 = i10 | (i0Var.f(fVar) ? 4 : 2) | (i0Var.g(z2) ? 32 : 16) | (i0Var.h(cVar) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            o oVarC = t1.c(1.0f, l.f17564b);
            Object objQ = i0Var.Q();
            f1.f fVar2 = m.f6385a;
            if (objQ == fVar2) {
                objQ = new n(8);
                i0Var.l0(objQ);
            }
            ej.c cVar2 = (ej.c) objQ;
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objQ2 = i0Var.Q();
            if (z10 || objQ2 == fVar2) {
                objQ2 = new t(fVar, z2, cVar);
                i0Var.l0(objQ2);
            }
            v3.j.a(54, 0, cVar2, (ej.c) objQ2, i0Var, oVarC);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new r1(fVar, z2, cVar, i10, 2);
        }
    }

    public static final void b(List list, Set set, ej.a aVar, ej.c cVar, i0 i0Var, int i10) {
        ej.c cVar2;
        boolean z2;
        long j;
        long j4;
        long j10;
        long j11;
        long j12;
        long j13;
        int i11;
        long j14;
        Set set2 = set;
        ej.c cVar3 = cVar;
        i0 i0Var2 = i0Var;
        i0Var2.c0(-1734741907);
        int i12 = i10 | (i0Var2.h(list) ? 4 : 2) | (i0Var2.h(set2) ? 32 : 16) | (i0Var2.h(aVar) ? 256 : 128) | (i0Var2.h(cVar3) ? 2048 : 1024);
        if (i0Var2.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objQ = i0Var2.Q();
            Object obj = m.f6385a;
            if (objQ == obj) {
                objQ = new s1.g(8);
                i0Var2.l0(objQ);
            }
            a1 a1Var = (a1) s1.k.c(objArr, (ej.a) objQ, i0Var2);
            boolean zF = i0Var2.f((String) a1Var.getValue()) | i0Var2.f(list);
            Object objQ2 = i0Var2.Q();
            if (zF || objQ2 == obj) {
                if (nj.e.K0((String) a1Var.getValue())) {
                    objQ2 = list;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        xa.f fVar = (xa.f) obj2;
                        if (nj.e.C0(fVar.f19864c.f19856b, (String) a1Var.getValue(), true) || nj.e.C0(fVar.f19863b, (String) a1Var.getValue(), true)) {
                            arrayList.add(obj2);
                        }
                    }
                    objQ2 = arrayList;
                }
                i0Var2.l0(objQ2);
            }
            Object obj3 = (List) objQ2;
            boolean zF2 = i0Var2.f(list);
            Object objQ3 = i0Var2.Q();
            if (zF2 || objQ3 == obj) {
                ArrayList arrayList2 = new ArrayList(qi.m.s0(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((xa.f) it.next()).f19863b);
                }
                objQ3 = qi.l.V0(arrayList2);
                i0Var2.l0(objQ3);
            }
            Set set3 = (Set) objQ3;
            Set set4 = set3;
            boolean z10 = !set4.isEmpty() && set2.containsAll(set4);
            f3.a aVar2 = z10 ? f3.a.f6618a : !set2.isEmpty() ? f3.a.f6620c : f3.a.f6619b;
            l lVar = l.f17564b;
            o oVarC = t1.c(1.0f, lVar);
            float f10 = 8;
            b0 b0VarA = z.a(b0.j.g(f10), v1.b.E, i0Var2, 6);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            ej.a aVar3 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar3);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, b0VarA);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC2);
            o oVarC3 = t1.c(1.0f, lVar);
            boolean z11 = z10;
            v1.f fVar2 = v1.b.D;
            q1 q1VarA = o1.a(b0.j.g(f10), fVar2, i0Var2, 54);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            o oVarC4 = v1.a.c(i0Var2, oVarC3);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar3);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q1VarA);
            s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            s.M(eVar4, i0Var2, oVarC4);
            o oVarL = v.n.l(lVar, false, null, aVar, 15);
            i2.f fVarO = u1.b.o();
            long j15 = f16930a;
            a2.b(fVarO, "Back", oVarL, j15, i0Var2, 3120, 0);
            v7.a("App list", null, j15, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1573254, 0, 262074);
            i0Var.p(true);
            o oVarC5 = t1.c(1.0f, lVar);
            int i13 = i12 & 7168;
            boolean zG = i0Var.g(z11) | (i13 == 2048) | i0Var.h(set3);
            Object objQ4 = i0Var.Q();
            if (zG || objQ4 == obj) {
                cVar2 = cVar;
                z2 = false;
                objQ4 = new e(cVar2, z11, set3, 0);
                i0Var.l0(objQ4);
            } else {
                cVar2 = cVar;
                z2 = false;
            }
            o oVarL2 = v.n.l(oVarC5, z2, null, (ej.a) objQ4, 15);
            q1 q1VarA2 = o1.a(b0.j.f1359a, fVar2, i0Var, 48);
            int iHashCode3 = Long.hashCode(i0Var.T);
            n1 n1VarL3 = i0Var.l();
            o oVarC6 = v1.a.c(i0Var, oVarL2);
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar3);
            } else {
                i0Var.o0();
            }
            s.M(eVar, i0Var, q1VarA2);
            s.M(eVar2, i0Var, n1VarL3);
            gk.b.t(iHashCode3, i0Var, eVar3, i0Var, dVar);
            s.M(eVar4, i0Var, oVarC6);
            float f11 = j0.f2261a;
            long j16 = w.f3054d;
            long j17 = w.f3058h;
            w0 w0Var = (w0) i0Var.j(x0.f2845a);
            c1.i0 i0Var3 = w0Var.f2786a0;
            if (i0Var3 == null) {
                long jC = x0.c(w0Var, e1.i.f5435c);
                long j18 = w.f3057g;
                e1.l lVar2 = e1.i.f5433a;
                long jC2 = x0.c(w0Var, lVar2);
                e1.l lVar3 = e1.i.f5434b;
                j = j16;
                j4 = j17;
                i0Var3 = new c1.i0(jC, j18, jC2, j18, w.c(x0.c(w0Var, lVar3), 0.38f), j18, w.c(x0.c(w0Var, lVar3), 0.38f), x0.c(w0Var, lVar2), x0.c(w0Var, e1.i.f5438f), w.c(x0.c(w0Var, lVar3), 0.38f), w.c(x0.c(w0Var, e1.i.f5437e), 0.38f), w.c(x0.c(w0Var, lVar3), 0.38f));
                w0Var.f2786a0 = i0Var3;
            } else {
                j = j16;
                j4 = j17;
            }
            long j19 = w.f3057g;
            if (j != 16) {
                j11 = j;
                j10 = 16;
            } else {
                j10 = 16;
                j11 = i0Var3.f2219a;
            }
            long j20 = j19 != j10 ? j19 : i0Var3.f2220b;
            long j21 = f16932c;
            if (j21 != j10) {
                j12 = j19;
                j13 = j21;
            } else {
                j12 = j19;
                j13 = i0Var3.f2221c;
            }
            long j22 = j19 != j10 ? j12 : i0Var3.f2222d;
            int i14 = (j4 > j10 ? 1 : (j4 == j10 ? 0 : -1));
            if (i14 != 0) {
                i11 = i14;
                j14 = j4;
            } else {
                i11 = i14;
                j14 = i0Var3.f2223e;
            }
            long j23 = j19 != j10 ? j12 : i0Var3.f2224f;
            long j24 = i11 != 0 ? j4 : i0Var3.f2225g;
            long j25 = j21 != j10 ? j21 : i0Var3.f2226h;
            if (j21 == j10) {
                j21 = i0Var3.f2227i;
            }
            c1.i0 i0Var4 = new c1.i0(j11, j20, j13, j22, j14, j23, j24, j25, j21, i11 != 0 ? j4 : i0Var3.j, i11 != 0 ? j4 : i0Var3.f2228k, i11 != 0 ? j4 : i0Var3.f2229l);
            boolean zG2 = (i13 == 2048) | i0Var.g(z11) | i0Var.h(set3);
            Object objQ5 = i0Var.Q();
            if (zG2 || objQ5 == obj) {
                objQ5 = new e(cVar2, z11, set3, 1);
                i0Var.l0(objQ5);
            }
            cVar3 = cVar2;
            n0.c(aVar2, (ej.a) objQ5, null, false, i0Var4, i0Var, 0);
            v7.a("All apps", null, j15, 0L, k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1573254, 0, 262074);
            i0Var.p(true);
            z4.e(null, 0.0f, 0L, i0Var, 0, 7);
            o oVarC7 = t1.c(1.0f, lVar);
            String str = (String) a1Var.getValue();
            k7 k7Var = k7.f2344a;
            long j26 = f16933d;
            long j27 = f16931b;
            g7 g7VarC = k7.c(j15, j15, j26, j26, j15, 0L, 0L, j27, j27, i0Var, 2122317516);
            boolean zF3 = i0Var.f(a1Var);
            Object objQ6 = i0Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new v(a1Var, 1);
                i0Var.l0(objQ6);
            }
            n4.a(str, (ej.c) objQ6, oVarC7, false, null, b.f16892r, false, null, null, null, true, 0, 0, null, g7VarC, i0Var, 1573248, 4063160);
            o oVarC8 = t1.c(1.0f, lVar);
            b0.h hVarG = b0.j.g(2);
            set2 = set;
            boolean zH = i0Var.h(obj3) | i0Var.h(set2) | (i13 == 2048);
            Object objQ7 = i0Var.Q();
            if (zH || objQ7 == obj) {
                objQ7 = new ab.m(obj3, set2, cVar3, 20);
                i0Var.l0(objQ7);
            }
            x8.a.g(24582, 494, hVarG, null, null, (ej.c) objQ7, i0Var, null, null, oVarC8, null, false);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.c(list, set2, aVar, cVar3, i10, 5);
        }
    }

    public static final void c(boolean z2, ej.c cVar, ej.a aVar, ej.a aVar2, ej.a aVar3, ej.a aVar4, ej.a aVar5, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(2006832251);
        int i11 = i10 | (i0Var2.g(z2) ? 4 : 2) | (i0Var2.h(cVar) ? 32 : 16) | (i0Var2.h(aVar) ? 256 : 128) | (i0Var2.h(aVar2) ? 2048 : 1024) | (i0Var2.h(aVar3) ? 16384 : 8192) | (i0Var2.h(aVar4) ? 131072 : 65536) | (i0Var2.h(aVar5) ? 1048576 : 524288);
        if (i0Var2.T(i11 & 1, (599187 & i11) != 599186)) {
            l lVar = l.f17564b;
            o oVarC = t1.c(1.0f, lVar);
            b0 b0VarA = z.a(b0.j.g(8), v1.b.E, i0Var2, 6);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(v2.g.f17649f, i0Var2, b0VarA);
            s.M(v2.g.f17648e, i0Var2, n1VarL);
            s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            s.I(v2.g.f17651h, i0Var2);
            s.M(v2.g.f17647d, i0Var2, oVarC2);
            v7.a("Dev tools", null, f16930a, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1573254, 0, 262074);
            v7.a("Quick tools for layout and app visibility testing.", null, f16931b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 390, 0, 262138);
            z4.e(b0.d.x(lVar, 0.0f, 4, 0.0f, 6, 5), 0.0f, 0L, i0Var, 6, 6);
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objQ = i0Var.Q();
            if (z10 || objQ == m.f6385a) {
                objQ = new i0.g(cVar, z2, 3);
                i0Var.l0(objQ);
            }
            o2.a(b.f16876a, v.n.l(lVar, false, null, (ej.a) objQ, 15), b.f16877b, null, p1.j.d(-1378833196, new c6(cVar, z2), i0Var), null, 0.0f, 0.0f, i0Var, 199686, 468);
            o2.a(b.f16878c, v.n.l(lVar, false, null, aVar, 15), b.f16879d, b.f16880e, null, null, 0.0f, 0.0f, i0Var, 27654, 484);
            o2.a(b.f16881f, v.n.l(lVar, false, null, aVar2, 15), b.f16882g, b.f16883h, null, null, 0.0f, 0.0f, i0Var, 27654, 484);
            o2.a(b.f16884i, v.n.l(lVar, false, null, aVar3, 15), b.j, b.f16885k, null, null, 0.0f, 0.0f, i0Var, 27654, 484);
            o2.a(b.f16886l, v.n.l(lVar, false, null, aVar4, 15), b.f16887m, b.f16888n, null, null, 0.0f, 0.0f, i0Var, 27654, 484);
            o2.a(b.f16889o, v.n.l(lVar, false, null, aVar5, 15), b.f16890p, b.f16891q, null, null, 0.0f, 0.0f, i0Var, 27654, 484);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ta.o(z2, cVar, aVar, aVar2, aVar3, aVar4, aVar5, i10);
        }
    }

    public static final void d(boolean z2, final List list, final Set set, final boolean z10, final ej.a aVar, final ej.c cVar, final ej.c cVar2, final ej.a aVar2, final ej.a aVar3, final ej.a aVar4, final ej.a aVar5, x5 x5Var, i0 i0Var, int i10) {
        x5 x5Var2;
        f1.t1 t1VarU;
        d dVar;
        x5 x5VarF;
        fj.l.f(aVar, "onDismiss");
        fj.l.f(cVar, "onShowGridOutlinesChange");
        fj.l.f(cVar2, "onSelectedPackageNamesChange");
        i0Var.c0(343910848);
        int i11 = i10 | (i0Var.g(z2) ? 4 : 2) | (i0Var.h(list) ? 32 : 16) | (i0Var.h(set) ? 256 : 128) | (i0Var.g(z10) ? 2048 : 1024) | (i0Var.h(cVar2) ? 1048576 : 524288) | (i0Var.h(aVar2) ? 8388608 : 4194304) | (i0Var.h(aVar3) ? 67108864 : 33554432) | (i0Var.h(aVar4) ? 536870912 : 268435456);
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (((i0Var.h(aVar5) ? (char) 4 : (char) 2) | 16) & 19) == 18) ? false : true)) {
            i0Var.Y();
            ti.c cVar3 = null;
            if ((i10 & 1) == 0 || i0Var.C()) {
                x5VarF = v3.f(null, i0Var, 6, 2);
            } else {
                i0Var.W();
                x5VarF = x5Var;
            }
            i0Var.q();
            if (!z2) {
                f1.t1 t1VarU2 = i0Var.u();
                if (t1VarU2 != null) {
                    t1VarU = t1VarU2;
                    dVar = new d(z2, list, set, z10, aVar, cVar, cVar2, aVar2, aVar3, aVar4, aVar5, x5VarF, i10, 0);
                    t1VarU.f6456d = dVar;
                }
                return;
            }
            x5 x5Var3 = x5VarF;
            Object[] objArr = new Object[0];
            Object objQ = i0Var.Q();
            Object obj = m.f6385a;
            if (objQ == obj) {
                objQ = new s1.g(9);
                i0Var.l0(objQ);
            }
            final a1 a1Var = (a1) s1.k.c(objArr, (ej.a) objQ, i0Var);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zF = ((i11 & 14) == 4) | i0Var.f(a1Var);
            Object objQ2 = i0Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ra.b0(z2, a1Var, cVar3, 2);
                i0Var.l0(objQ2);
            }
            s.f((ej.e) objQ2, i0Var, boolValueOf);
            v3.a(aVar, null, x5Var3, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, p1.j.d(1641343650, new ej.f() { // from class: ua.g
                /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
                @Override // ej.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instructions count: 289
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ua.g.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, i0Var), i0Var, 6, 3078, 7162);
            x5Var2 = x5Var3;
        } else {
            i0Var.W();
            x5Var2 = x5Var;
        }
        t1VarU = i0Var.u();
        if (t1VarU != null) {
            dVar = new d(z2, list, set, z10, aVar, cVar, cVar2, aVar2, aVar3, aVar4, aVar5, x5Var2, i10, 1);
            t1VarU.f6456d = dVar;
        }
    }
}
