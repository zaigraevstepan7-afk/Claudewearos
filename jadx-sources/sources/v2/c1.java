package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c1 implements e1 {
    @Override // v2.e1
    public final int a() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // v2.e1
    public final boolean b(q qVar, f0 f0Var) {
        i1 i1Var = f0Var.Y.f17584d;
        i1Var.getClass();
        v1.n nVarY1 = i1Var.y1(j1.g(16));
        if (nVarY1 != null && nVarY1.G) {
            if (!nVarY1.f17565a.G) {
                s2.a.b("visitLocalDescendants called on an unattached node");
            }
            v1.n nVar = nVarY1.f17565a;
            if ((nVar.f17568d & 16) != 0) {
                while (nVar != null) {
                    if ((nVar.f17567c & 16) != 0) {
                        k kVarE = nVar;
                        ?? eVar = 0;
                        while (kVarE != 0) {
                            if (kVarE instanceof w1) {
                                if (((w1) kVarE).M0()) {
                                    qVar.f17745c = qVar.f17743a.f13034b - 1;
                                    return true;
                                }
                            } else if ((kVarE.f17567c & 16) != 0 && (kVarE instanceof k)) {
                                v1.n nVar2 = kVarE.I;
                                int i10 = 0;
                                kVarE = kVarE;
                                eVar = eVar;
                                while (nVar2 != null) {
                                    if ((nVar2.f17567c & 16) != 0) {
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
                            kVarE = n.e(eVar);
                        }
                    }
                    nVar = nVar.f17570f;
                }
            }
        }
        return false;
    }

    @Override // v2.e1
    public final boolean c(f0 f0Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // v2.e1
    public final boolean e(v1.n nVar) {
        ?? eVar = 0;
        while (true) {
            int i10 = 0;
            if (nVar == 0) {
                return false;
            }
            if (nVar instanceof w1) {
                ((w1) nVar).g0();
            } else if ((nVar.f17567c & 16) != 0 && (nVar instanceof k)) {
                v1.n nVar2 = nVar.I;
                eVar = eVar;
                nVar = nVar;
                while (nVar2 != null) {
                    if ((nVar2.f17567c & 16) != 0) {
                        i10++;
                        eVar = eVar;
                        if (i10 == 1) {
                            nVar = nVar2;
                        } else {
                            if (eVar == 0) {
                                eVar = new g1.e(new v1.n[16]);
                            }
                            if (nVar != 0) {
                                eVar.b(nVar);
                                nVar = 0;
                            }
                            eVar.b(nVar2);
                        }
                    }
                    nVar2 = nVar2.f17570f;
                    eVar = eVar;
                    nVar = nVar;
                }
                if (i10 == 1) {
                }
            }
            nVar = n.e(eVar);
        }
    }

    @Override // v2.e1
    public final void f(f0 f0Var, long j, q qVar, int i10, boolean z2) {
        f0Var.z(j, qVar, i10, z2);
    }
}
