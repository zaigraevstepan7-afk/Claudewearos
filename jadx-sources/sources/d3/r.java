package d3;

import c2.x0;
import java.util.ArrayList;
import java.util.List;
import q.g0;
import v2.f0;
import v2.i1;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final v1.n f4763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4764b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f4765c;

    /* renamed from: d, reason: collision with root package name */
    public final n f4766d;

    /* renamed from: e, reason: collision with root package name */
    public r f4767e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4768f;

    public r(v1.n nVar, boolean z2, f0 f0Var, n nVar2) {
        this.f4763a = nVar;
        this.f4764b = z2;
        this.f4765c = f0Var;
        this.f4766d = nVar2;
        this.f4768f = f0Var.f17624b;
    }

    public static /* synthetic */ List j(int i10, r rVar) {
        return rVar.i((i10 & 1) != 0 ? !rVar.f4764b : false, (i10 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    public final b2.c a(i1 i1Var) {
        v2.k kVarE;
        r rVarL = l();
        if (rVarL == null) {
            return b2.c.f1501e;
        }
        v1.n nVar = rVarL.f4765c.Y.f17586f;
        if ((nVar.f17568d & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f17567c & 8) != 0) {
                    kVarE = nVar;
                    ?? eVar = 0;
                    while (kVarE != 0) {
                        if (kVarE instanceof z1) {
                            if (kVarE.z()) {
                                break loop0;
                            }
                        } else if ((kVarE.f17567c & 8) != 0 && (kVarE instanceof v2.k)) {
                            v1.n nVar2 = kVarE.I;
                            int i10 = 0;
                            kVarE = kVarE;
                            eVar = eVar;
                            while (nVar2 != null) {
                                if ((nVar2.f17567c & 8) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        kVarE = nVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new g1.e(new v1.n[16]);
                                        }
                                        if (kVarE != 0) {
                                            eVar.b(kVarE);
                                            kVarE = 0;
                                        }
                                        eVar.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f17570f;
                                kVarE = kVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        kVarE = v2.n.e(eVar);
                    }
                }
                if ((nVar.f17568d & 8) == 0) {
                    break;
                }
                nVar = nVar.f17570f;
            }
            kVarE = 0;
        } else {
            kVarE = 0;
        }
        z1 z1Var = (z1) kVarE;
        i1 i1VarV = z1Var != null ? v2.n.v(z1Var, 8) : null;
        return i1VarV == null ? rVarL.a(i1Var) : i1VarV.z(i1Var, true);
    }

    public final r b(j jVar, ej.c cVar) {
        n nVar = new n();
        nVar.f4760c = false;
        nVar.f4761d = false;
        cVar.invoke(nVar);
        r rVar = new r(new q(cVar), false, new f0(true, this.f4768f + (jVar != null ? 1000000000 : 2000000000)), nVar);
        rVar.f4767e = this;
        return rVar;
    }

    public final void c(f0 f0Var, ArrayList arrayList) {
        g1.e eVarX = f0Var.x();
        Object[] objArr = eVarX.f7024a;
        int i10 = eVarX.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.G() && !f0Var2.f17637j0) {
                if (f0Var2.Y.d(8)) {
                    arrayList.add(u.a(f0Var2, this.f4764b));
                } else {
                    c(f0Var2, arrayList);
                }
            }
        }
    }

    public final i1 d() {
        if (!o()) {
            z1 z1VarF = f();
            return z1VarF != null ? v2.n.v(z1VarF, 8) : this.f4765c.Y.f17583c;
        }
        r rVarL = l();
        if (rVarL != null) {
            return rVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            r rVar = (r) arrayList.get(size2);
            if (rVar.p()) {
                arrayList2.add(rVar);
            } else if (!rVar.f4766d.f4761d) {
                rVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z1 f() {
        v1.n nVarE;
        boolean z2;
        boolean z10 = this.f4766d.f4760c;
        f0 f0Var = this.f4765c;
        Object obj = null;
        if (z10) {
            v1.n nVar = f0Var.Y.f17586f;
            if ((nVar.f17568d & 8) != 0) {
                nVarE = null;
                while (nVar != null) {
                    if ((nVar.f17567c & 8) != 0) {
                        v1.n nVarE2 = nVar;
                        g1.e eVar = null;
                        while (nVarE2 != null) {
                            if (nVarE2 instanceof z1) {
                                z1 z1Var = (z1) nVarE2;
                                if (z1Var.z()) {
                                    if (z1Var.X0()) {
                                        return z1Var;
                                    }
                                    if (nVarE == null) {
                                        nVarE = z1Var;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2 && (nVarE2.f17567c & 8) != 0 && (nVarE2 instanceof v2.k)) {
                                int i10 = 0;
                                for (v1.n nVar2 = ((v2.k) nVarE2).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                    if ((nVar2.f17567c & 8) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarE2 = nVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE2 != null) {
                                                eVar.b(nVarE2);
                                                nVarE2 = null;
                                            }
                                            eVar.b(nVar2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarE2 = v2.n.e(eVar);
                        }
                    }
                    if ((nVar.f17568d & 8) == 0) {
                        break;
                    }
                    nVar = nVar.f17570f;
                }
                obj = nVarE;
            }
        } else {
            v1.n nVar3 = f0Var.Y.f17586f;
            if ((nVar3.f17568d & 8) != 0) {
                loop3: while (nVar3 != null) {
                    if ((nVar3.f17567c & 8) != 0) {
                        nVarE = nVar3;
                        g1.e eVar2 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof z1) {
                                if (((z1) nVarE).z()) {
                                    obj = nVarE;
                                }
                            } else if ((nVarE.f17567c & 8) != 0 && (nVarE instanceof v2.k)) {
                                int i11 = 0;
                                for (v1.n nVar4 = ((v2.k) nVarE).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                    if ((nVar4.f17567c & 8) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nVarE = nVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar2.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar2);
                        }
                    }
                    if ((nVar3.f17568d & 8) == 0) {
                        break;
                    }
                    nVar3 = nVar3.f17570f;
                }
            }
        }
        return (z1) obj;
    }

    public final b2.c g() {
        i1 i1VarD = d();
        if (i1VarD != null) {
            if (!i1VarD.w1().G) {
                i1VarD = null;
            }
            if (i1VarD != null) {
                return t2.z.h(i1VarD).z(i1VarD, true);
            }
        }
        return b2.c.f1501e;
    }

    public final b2.c h() {
        i1 i1VarD = d();
        if (i1VarD != null) {
            if (!i1VarD.w1().G) {
                i1VarD = null;
            }
            if (i1VarD != null) {
                return t2.z.f(i1VarD, true);
            }
        }
        return b2.c.f1501e;
    }

    public final List i(boolean z2, boolean z10) {
        if (!z2 && this.f4766d.f4761d) {
            return qi.s.f13520a;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z10);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final n k() {
        boolean zP = p();
        n nVar = this.f4766d;
        if (!zP) {
            return nVar;
        }
        n nVarE = nVar.e();
        r(new ArrayList(), nVarE);
        return nVarE;
    }

    public final r l() {
        f0 f0VarU;
        r rVar = this.f4767e;
        if (rVar != null) {
            return rVar;
        }
        f0 f0Var = this.f4765c;
        boolean z2 = this.f4764b;
        if (z2) {
            f0VarU = f0Var.u();
            while (f0VarU != null) {
                n nVarW = f0VarU.w();
                if (nVarW != null && nVarW.f4760c) {
                    break;
                }
                f0VarU = f0VarU.u();
            }
            f0VarU = null;
        } else {
            f0VarU = null;
        }
        if (f0VarU == null) {
            f0 f0VarU2 = f0Var.u();
            while (true) {
                if (f0VarU2 == null) {
                    f0VarU = null;
                    break;
                }
                if (f0VarU2.Y.d(8)) {
                    f0VarU = f0VarU2;
                    break;
                }
                f0VarU2 = f0VarU2.u();
            }
        }
        if (f0VarU == null) {
            return null;
        }
        return u.a(f0VarU, z2);
    }

    public final b2.c m() {
        Object objF = f();
        if (objF == null) {
            return this.f4765c.Y.f17583c.S1();
        }
        v1.n nVar = ((v1.n) objF).f17565a;
        Object objG = this.f4766d.f4758a.g(m.f4734b);
        if (objG == null) {
            objG = null;
        }
        return v2.n.i(nVar, objG != null, true);
    }

    public final n n() {
        return this.f4766d;
    }

    public final boolean o() {
        return this.f4767e != null;
    }

    public final boolean p() {
        return this.f4764b && this.f4766d.f4760c;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        f0 f0VarU = this.f4765c.u();
        while (true) {
            if (f0VarU == null) {
                f0VarU = null;
                break;
            }
            n nVarW = f0VarU.w();
            if (nVarW != null && nVarW.f4760c) {
                break;
            }
            f0VarU = f0VarU.u();
        }
        return f0VarU == null;
    }

    public final void r(ArrayList arrayList, n nVar) {
        if (this.f4766d.f4761d) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            r rVar = (r) arrayList.get(size2);
            if (!rVar.p()) {
                nVar.w(rVar.f4766d);
                rVar.r(arrayList, nVar);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z2) {
        if (o()) {
            return qi.s.f13520a;
        }
        c(this.f4765c, arrayList);
        if (z2) {
            n nVar = this.f4766d;
            g0 g0Var = nVar.f4758a;
            Object objG = g0Var.g(v.f4800z);
            if (objG == null) {
                objG = null;
            }
            j jVar = (j) objG;
            if (jVar != null && nVar.f4760c && !arrayList.isEmpty()) {
                arrayList.add(b(jVar, new x0(jVar, 1)));
            }
            y yVar = v.f4776a;
            if (g0Var.c(yVar) && !arrayList.isEmpty() && nVar.f4760c) {
                Object objG2 = g0Var.g(yVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) qi.l.A0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new x0(str, 2)));
                }
            }
        }
        return arrayList;
    }
}
