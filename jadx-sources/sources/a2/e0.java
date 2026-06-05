package a2;

import android.os.Trace;
import v2.b1;
import v2.m1;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends v1.n implements v2.i, v2.v, m1, u2.d, v2.j {
    public final boolean H;
    public final ej.e I;
    public boolean J;
    public boolean K;
    public final int L;

    public e0(int i10, ej.e eVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        boolean z2 = (i11 & 2) == 0;
        eVar = (i11 & 4) != 0 ? null : eVar;
        this.H = z2;
        this.I = eVar;
        this.L = i10;
    }

    @Override // v2.m1
    public final void F0() {
        w1();
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void j1() {
        int iOrdinal = v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                m focusOwner = ((w2.t) v2.n.z(this)).getFocusOwner();
                e0 e0VarF = d.f(this);
                if (e0VarF == null || !e0VarF.H) {
                    return;
                }
                q qVar = (q) focusOwner;
                qVar.f44a.I();
                qVar.f47d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b3.e();
                }
                return;
            }
        }
        q qVar2 = (q) ((w2.t) v2.n.z(this)).getFocusOwner();
        qVar2.b(8, true, false);
        if (this.H) {
            qVar2.f44a.I();
        }
        qVar2.f47d.a();
    }

    @Override // v1.n
    public final void k1() {
        if (v1().a()) {
            ((q) ((w2.t) v2.n.z(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean q1(int i10) {
        int iOrdinal = d.v(this, i10).ordinal();
        if (iOrdinal == 0) {
            return d.w(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new b3.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [g1.e] */
    public final void r1(b0 b0Var, b0 b0Var2) {
        b1 b1Var;
        ej.e eVar;
        q qVar = (q) ((w2.t) v2.n.z(this)).getFocusOwner();
        e0 e0VarF = qVar.f();
        if (!b0Var.equals(b0Var2) && (eVar = this.I) != null) {
            eVar.invoke(b0Var, b0Var2);
        }
        v1.n nVar = this.f17565a;
        if (!nVar.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar2 = this.f17565a;
        v2.f0 f0VarY = v2.n.y(this);
        while (f0VarY != null) {
            if ((f0VarY.Y.f17586f.f17568d & 5120) != 0) {
                while (nVar2 != null) {
                    int i10 = nVar2.f17567c;
                    if ((i10 & 5120) != 0) {
                        if (nVar2 != nVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            v2.k kVarE = nVar2;
                            ?? eVar2 = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof g) {
                                    g gVar = (g) kVarE;
                                    if (e0VarF == qVar.f()) {
                                        gVar.E(b0Var2);
                                    }
                                } else if ((kVarE.f17567c & 4096) != 0 && (kVarE instanceof v2.k)) {
                                    v1.n nVar3 = kVarE.I;
                                    int i11 = 0;
                                    kVarE = kVarE;
                                    eVar2 = eVar2;
                                    while (nVar3 != null) {
                                        if ((nVar3.f17567c & 4096) != 0) {
                                            i11++;
                                            eVar2 = eVar2;
                                            if (i11 == 1) {
                                                kVarE = nVar3;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new g1.e(new v1.n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar2.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar2.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f17570f;
                                        kVarE = kVarE;
                                        eVar2 = eVar2;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                kVarE = v2.n.e(eVar2);
                            }
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
    /* JADX WARN: Type inference failed for: r6v10, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [g1.e] */
    public final u s1() {
        boolean z2;
        b1 b1Var;
        u uVar = new u();
        uVar.f56a = true;
        w wVar = w.f67b;
        uVar.f57b = wVar;
        uVar.f58c = wVar;
        uVar.f59d = wVar;
        uVar.f60e = wVar;
        uVar.f61f = wVar;
        uVar.f62g = wVar;
        uVar.f63h = wVar;
        uVar.f64i = wVar;
        uVar.j = t.f53b;
        uVar.f65k = t.f54c;
        uVar.f66l = r.f52a;
        int i10 = this.L;
        if (i10 == 1) {
            z2 = true;
        } else if (i10 == 0) {
            z2 = !(((l2.a) ((l2.c) ((l2.b) v2.n.h(this, f1.f18266m))).f9878a.getValue()).f9877a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z2 = false;
        }
        uVar.f56a = z2;
        v1.n nVar = this.f17565a;
        if (!nVar.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar2 = this.f17565a;
        v2.f0 f0VarY = v2.n.y(this);
        loop0: while (f0VarY != null) {
            if ((f0VarY.Y.f17586f.f17568d & 3072) != 0) {
                while (nVar2 != null) {
                    int i11 = nVar2.f17567c;
                    if ((i11 & 3072) != 0) {
                        if (nVar2 != nVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            v2.k kVarE = nVar2;
                            ?? eVar = 0;
                            while (kVarE != 0) {
                                if (kVarE instanceof v) {
                                    ((v) kVarE).P0(uVar);
                                } else if ((kVarE.f17567c & 2048) != 0 && (kVarE instanceof v2.k)) {
                                    v1.n nVar3 = kVarE.I;
                                    int i12 = 0;
                                    kVarE = kVarE;
                                    eVar = eVar;
                                    while (nVar3 != null) {
                                        if ((nVar3.f17567c & 2048) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                kVarE = nVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (kVarE != 0) {
                                                    eVar.b(kVarE);
                                                    kVarE = 0;
                                                }
                                                eVar.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f17570f;
                                        kVarE = kVarE;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                kVarE = v2.n.e(eVar);
                            }
                        }
                    }
                    nVar2 = nVar2.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar2 = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
        return uVar;
    }

    public final b2.c t1(t2.w wVar) {
        b2.c cVar = s1().f66l;
        return cVar != r.f52a ? wVar == null ? cVar : cVar.i(wVar.C(v2.n.x(this), 0L)) : wVar != null ? wVar.z(v2.n.x(this), false) : uk.c.g(0L, cg.b.S(v2.n.x(this).f15552c));
    }

    public final f0.r u1() {
        b1 b1Var;
        Object obj;
        if (!this.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar = this.f17565a.f17569e;
        v2.f0 f0VarY = v2.n.y(this);
        while (true) {
            if (f0VarY == null) {
                break;
            }
            if ((f0VarY.Y.f17586f.f17568d & 8388640) != 0) {
                while (nVar != null) {
                    int i10 = nVar.f17567c;
                    if ((i10 & 8388640) != 0) {
                        if ((8388608 & i10) != 0) {
                            if (!(nVar instanceof f0.r)) {
                                if (nVar instanceof v2.k) {
                                    v1.n nVar2 = null;
                                    for (v1.n nVar3 = ((v2.k) nVar).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                        if (nVar3 instanceof f0.r) {
                                            nVar2 = nVar3;
                                        }
                                    }
                                    nVar = nVar2;
                                } else {
                                    nVar = null;
                                }
                            }
                            f0.r rVar = (f0.r) nVar;
                            if (rVar != null) {
                                return rVar;
                            }
                        } else if ((i10 & 32) != 0) {
                            if (nVar instanceof u2.d) {
                                obj = nVar;
                            } else if (nVar instanceof v2.k) {
                                obj = null;
                                for (v1.n nVar4 = ((v2.k) nVar).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                    if (nVar4 instanceof u2.d) {
                                        obj = nVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            u2.d dVar = (u2.d) obj;
                            if (dVar != null) {
                                dVar.p0().getClass();
                            }
                        }
                    }
                    nVar = nVar.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
        return null;
    }

    public final b0 v1() {
        b1 b1Var;
        if (!this.G) {
            return b0.f12c;
        }
        e0 e0VarF = ((q) ((w2.t) v2.n.z(this)).getFocusOwner()).f();
        if (e0VarF == null) {
            return b0.f12c;
        }
        if (this == e0VarF) {
            return b0.f10a;
        }
        if (e0VarF.G) {
            if (!e0VarF.f17565a.G) {
                s2.a.b("visitAncestors called on an unattached node");
            }
            v1.n nVar = e0VarF.f17565a.f17569e;
            v2.f0 f0VarY = v2.n.y(e0VarF);
            while (f0VarY != null) {
                if ((f0VarY.Y.f17586f.f17568d & 1024) != 0) {
                    while (nVar != null) {
                        if ((nVar.f17567c & 1024) != 0) {
                            v1.n nVarE = nVar;
                            g1.e eVar = null;
                            while (nVarE != null) {
                                if (nVarE instanceof e0) {
                                    if (this == ((e0) nVarE)) {
                                        return b0.f11b;
                                    }
                                } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                    int i10 = 0;
                                    for (v1.n nVar2 = ((v2.k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                        if ((nVar2.f17567c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVarE = nVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar.b(nVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVarE = v2.n.e(eVar);
                            }
                        }
                        nVar = nVar.f17569e;
                    }
                }
                f0VarY = f0VarY.u();
                nVar = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
            }
        }
        return b0.f12c;
    }

    public final void w1() {
        int iOrdinal = v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b3.e();
                }
                return;
            }
        }
        fj.v vVar = new fj.v();
        v2.n.t(this, new d0(0, vVar, this));
        Object obj = vVar.f6807a;
        if (obj == null) {
            fj.l.l("focusProperties");
            throw null;
        }
        if (((s) obj).b()) {
            return;
        }
        ((q) ((w2.t) v2.n.z(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean x1(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return s1().f56a ? q1(i10) : d.h(this, i10, new p(i10, 2));
        } finally {
            Trace.endSection();
        }
    }

    @Override // v2.v
    public final void o0(t2.w wVar) {
    }
}
