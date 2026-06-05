package p2;

import v2.i1;
import v2.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: c, reason: collision with root package name */
    public final v1.n f12717c;

    /* renamed from: d, reason: collision with root package name */
    public final k4.d f12718d;

    /* renamed from: e, reason: collision with root package name */
    public final q.p f12719e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f12720f;

    /* renamed from: g, reason: collision with root package name */
    public n f12721g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12722h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12723i;
    public boolean j;

    public l(v1.n nVar) {
        this.f12717c = nVar;
        k4.d dVar = new k4.d();
        dVar.f9421b = new long[2];
        this.f12718d = dVar;
        this.f12719e = new q.p(2);
        this.f12723i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ee  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // p2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(q.p r55, t2.w r56, p2.h r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.l.a(q.p, t2.w, p2.h, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p2.m
    public final void b(h hVar) {
        super.b(hVar);
        n nVar = this.f12721g;
        if (nVar == null) {
            return;
        }
        this.f12722h = this.f12723i;
        ?? r12 = nVar.f12734a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) r12.get(i10);
            boolean z2 = wVar.f12763d;
            long j = wVar.f12760a;
            boolean zA = hVar.a(j);
            boolean z10 = this.f12723i;
            if ((!z2 && !zA) || (!z2 && !z10)) {
                this.f12718d.h(j);
            }
        }
        this.f12723i = false;
        this.j = nVar.f12739f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [g1.e] */
    public final void c() {
        g1.e eVar = this.f12728a;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l) objArr[i11]).c();
        }
        v2.k kVarE = this.f12717c;
        ?? eVar2 = 0;
        while (kVarE != 0) {
            if (kVarE instanceof w1) {
                ((w1) kVarE).V();
            } else if ((kVarE.f17567c & 16) != 0 && (kVarE instanceof v2.k)) {
                v1.n nVar = kVarE.I;
                int i12 = 0;
                kVarE = kVarE;
                eVar2 = eVar2;
                while (nVar != null) {
                    if ((nVar.f17567c & 16) != 0) {
                        i12++;
                        eVar2 = eVar2;
                        if (i12 == 1) {
                            kVarE = nVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new g1.e(new v1.n[16]);
                            }
                            if (kVarE != 0) {
                                eVar2.b(kVarE);
                                kVarE = 0;
                            }
                            eVar2.b(nVar);
                        }
                    }
                    nVar = nVar.f17570f;
                    kVarE = kVarE;
                    eVar2 = eVar2;
                }
                if (i12 == 1) {
                }
            }
            kVarE = v2.n.e(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(h hVar) {
        Object[] objArr;
        v2.f0 f0Var;
        q.p pVar = this.f12719e;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (pVar.g() != 0) {
            v1.n nVar = this.f12717c;
            if (nVar.G) {
                i1 i1Var = nVar.A;
                if ((i1Var == null || (f0Var = i1Var.H) == null) ? false : f0Var.H()) {
                    n nVar2 = this.f12721g;
                    fj.l.c(nVar2);
                    i1 i1Var2 = this.f12720f;
                    fj.l.c(i1Var2);
                    long j = i1Var2.f15552c;
                    v1.n nVarE = nVar;
                    g1.e eVar = null;
                    while (nVarE != null) {
                        if (nVarE instanceof w1) {
                            ((w1) nVarE).a0(nVar2, o.f12745c, j);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((nVarE.f17567c & 16) != 0) != false && (nVarE instanceof v2.k)) {
                                int i10 = 0;
                                for (v1.n nVar3 = ((v2.k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                    if (((nVar3.f17567c & 16) != 0) != false) {
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
                        nVarE = v2.n.e(eVar);
                    }
                    if (nVar.G) {
                        g1.e eVar2 = this.f12728a;
                        Object[] objArr2 = eVar2.f7024a;
                        int i11 = eVar2.f7026c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            ((l) objArr2[i12]).d(hVar);
                        }
                    }
                    z2 = true;
                }
            }
        }
        b(hVar);
        pVar.a();
        this.f12720f = null;
        return z2;
    }

    public final boolean e(h hVar, boolean z2) {
        boolean z10;
        boolean z11;
        v2.f0 f0Var;
        if (this.f12719e.g() == 0) {
            return false;
        }
        v1.n nVarE = this.f12717c;
        if (nVarE.G) {
            i1 i1Var = nVarE.A;
            if ((i1Var == null || (f0Var = i1Var.H) == null) ? false : f0Var.H()) {
                n nVar = this.f12721g;
                fj.l.c(nVar);
                i1 i1Var2 = this.f12720f;
                fj.l.c(i1Var2);
                long j = i1Var2.f15552c;
                v1.n nVarE2 = nVarE;
                g1.e eVar = null;
                while (nVarE2 != null) {
                    if (nVarE2 instanceof w1) {
                        ((w1) nVarE2).a0(nVar, o.f12743a, j);
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        if (((nVarE2.f17567c & 16) != 0) && (nVarE2 instanceof v2.k)) {
                            int i10 = 0;
                            for (v1.n nVar2 = ((v2.k) nVarE2).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                if ((nVar2.f17567c & 16) != 0) {
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
                    }
                    nVarE2 = v2.n.e(eVar);
                }
                if (nVarE.G) {
                    g1.e eVar2 = this.f12728a;
                    Object[] objArr = eVar2.f7024a;
                    int i11 = eVar2.f7026c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        l lVar = (l) objArr[i12];
                        fj.l.c(this.f12720f);
                        lVar.e(hVar, z2);
                    }
                }
                if (nVarE.G) {
                    g1.e eVar3 = null;
                    while (nVarE != null) {
                        if (nVarE instanceof w1) {
                            ((w1) nVarE).a0(nVar, o.f12744b, j);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (((nVarE.f17567c & 16) != 0) && (nVarE instanceof v2.k)) {
                                int i13 = 0;
                                for (v1.n nVar3 = ((v2.k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                    if ((nVar3.f17567c & 16) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            nVarE = nVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar3.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar3.b(nVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                        }
                        nVarE = v2.n.e(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, q.b0 b0Var) {
        k4.d dVar = this.f12718d;
        if (dVar.d(j) && b0Var.g(this) < 0) {
            dVar.h(j);
            this.f12719e.f(j);
        }
        g1.e eVar = this.f12728a;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((l) objArr[i11]).f(j, b0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f12717c + ", children=" + this.f12728a + ", pointerIds=" + this.f12718d + ')';
    }
}
