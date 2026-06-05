package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q.a0 f17705a;

    static {
        q.a0 a0Var = q.k0.f13101a;
        f17705a = new q.a0();
    }

    public static final void a(v1.n nVar, int i10, int i11) {
        if (!(nVar instanceof k)) {
            b(nVar, i10 & nVar.f17567c, i11);
            return;
        }
        k kVar = (k) nVar;
        int i12 = kVar.H;
        b(nVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (v1.n nVar2 = kVar.I; nVar2 != null; nVar2 = nVar2.f17570f) {
            a(nVar2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(v1.n nVar, int i10, int i11) {
        if (i11 != 0 || nVar.f1()) {
            if ((i10 & 2) != 0 && (nVar instanceof w)) {
                n.n((w) nVar);
                if (i11 == 2) {
                    n.v(nVar, 2).I1();
                }
            }
            if ((i10 & 128) != 0 && i11 != 2) {
                n.y(nVar).D();
            }
            if ((4194304 & i10) != 0 && i11 != 2) {
                n.y(nVar).U(false);
            }
            if ((i10 & 256) != 0 && (nVar instanceof o)) {
                if (i11 == 1) {
                    f0 f0VarY = n.y(nVar);
                    f0VarY.a0(f0VarY.f17636i0 + 1);
                } else if (i11 == 2) {
                    n.y(nVar).a0(r0.f17636i0 - 1);
                }
                if (i11 != 2) {
                    f0 f0VarY2 = n.y(nVar);
                    if (f0VarY2.f17636i0 != 0 && !f0VarY2.p() && !f0VarY2.q() && !f0VarY2.f17635h0) {
                        w2.t tVar = (w2.t) i0.a(f0VarY2);
                        q5.b bVar = tVar.f18411s0.f17765e;
                        bVar.getClass();
                        if (f0VarY2.f17636i0 > 0) {
                            ((g1.e) bVar.f13235b).b(f0VarY2);
                            f0VarY2.f17635h0 = true;
                        }
                        tVar.J(null);
                    }
                }
            }
            if ((i10 & 4) != 0 && (nVar instanceof m)) {
                n.m((m) nVar);
            }
            if ((i10 & 8) != 0 && (nVar instanceof z1)) {
                n.y(nVar).K = true;
            }
            if ((i10 & 64) != 0 && (nVar instanceof u1)) {
                j0 j0Var = n.y((u1) nVar).Z;
                j0Var.f17703p.J = true;
                r0 r0Var = j0Var.f17704q;
                if (r0Var != null) {
                    r0Var.P = true;
                }
            }
            if ((i10 & 2048) != 0 && (nVar instanceof a2.v)) {
                a2.v vVar = (a2.v) nVar;
                c.f17591b = null;
                vVar.P0(c.f17590a);
                if (c.f17591b != null) {
                    v1.n nVar2 = (v1.n) vVar;
                    if (!nVar2.f17565a.G) {
                        s2.a.b("visitChildren called on an unattached node");
                    }
                    g1.e eVar = new g1.e(new v1.n[16]);
                    v1.n nVar3 = nVar2.f17565a;
                    v1.n nVar4 = nVar3.f17570f;
                    if (nVar4 == null) {
                        n.b(eVar, nVar3);
                    } else {
                        eVar.b(nVar4);
                    }
                    while (true) {
                        int i12 = eVar.f7026c;
                        if (i12 == 0) {
                            break;
                        }
                        v1.n nVarE = (v1.n) eVar.l(i12 - 1);
                        if ((nVarE.f17568d & 1024) == 0) {
                            n.b(eVar, nVarE);
                        } else {
                            while (true) {
                                if (nVarE == null) {
                                    break;
                                }
                                if ((nVarE.f17567c & 1024) != 0) {
                                    g1.e eVar2 = null;
                                    while (nVarE != null) {
                                        if (nVarE instanceof a2.e0) {
                                            a2.e0 e0Var = (a2.e0) nVarE;
                                            a2.j jVar = ((a2.q) ((w2.t) n.z(e0Var)).getFocusOwner()).f47d;
                                            if (jVar.f33c.a(e0Var)) {
                                                jVar.a();
                                            }
                                        } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof k)) {
                                            int i13 = 0;
                                            for (v1.n nVar5 = ((k) nVarE).I; nVar5 != null; nVar5 = nVar5.f17570f) {
                                                if ((nVar5.f17567c & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        nVarE = nVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new g1.e(new v1.n[16]);
                                                        }
                                                        if (nVarE != null) {
                                                            eVar2.b(nVarE);
                                                            nVarE = null;
                                                        }
                                                        eVar2.b(nVar5);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        nVarE = n.e(eVar2);
                                    }
                                } else {
                                    nVarE = nVarE.f17570f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) != 0 && (nVar instanceof a2.g)) {
                a2.g gVar = (a2.g) nVar;
                a2.j jVar2 = ((a2.q) ((w2.t) n.z(gVar)).getFocusOwner()).f47d;
                if (jVar2.f34d.a(gVar)) {
                    jVar2.a();
                }
            }
            if ((i10 & 2097152) != 0 && (nVar instanceof m2.c) && i11 == 2) {
                ((m2.c) nVar).z0();
            }
        }
    }

    public static final void c(v1.n nVar) {
        if (!nVar.G) {
            s2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(nVar, -1, 0);
    }

    public static final int d(v1.m mVar) {
        int i10 = mVar instanceof t2.b0 ? 3 : 1;
        if (mVar instanceof z1.g) {
            i10 |= 4;
        }
        if (mVar instanceof d3.o) {
            i10 |= 8;
        }
        if (mVar instanceof p2.d0) {
            i10 |= 16;
        }
        if (mVar instanceof t2.b1) {
            i10 |= 64;
        }
        return mVar instanceof a3.a ? 524288 | i10 : i10;
    }

    public static final int e(v1.n nVar) {
        int i10 = nVar.f17567c;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = nVar.getClass();
        q.a0 a0Var = f17705a;
        int iD = a0Var.d(cls);
        if (iD >= 0) {
            return a0Var.f13028c[iD];
        }
        int i11 = nVar instanceof w ? 3 : 1;
        if (nVar instanceof m) {
            i11 |= 4;
        }
        if (nVar instanceof z1) {
            i11 |= 8;
        }
        if (nVar instanceof w1) {
            i11 |= 16;
        }
        if (nVar instanceof u2.d) {
            i11 |= 32;
        }
        if (nVar instanceof u1) {
            i11 |= 64;
        }
        if (nVar instanceof v) {
            i11 |= 4194432;
        } else if (nVar instanceof w0) {
            i11 |= 128;
        }
        if (nVar instanceof o) {
            i11 |= 256;
        }
        if (nVar instanceof a2.e0) {
            i11 |= 1024;
        }
        if (nVar instanceof a2.v) {
            i11 |= 2048;
        }
        if (nVar instanceof a2.g) {
            i11 |= 4096;
        }
        if (nVar instanceof n2.e) {
            i11 |= 8192;
        }
        if (nVar instanceof w2.k) {
            i11 |= 16384;
        }
        if (nVar instanceof i) {
            i11 |= 32768;
        }
        if (nVar instanceof e2) {
            i11 |= 262144;
        }
        if (nVar instanceof a3.a) {
            i11 |= 524288;
        }
        if (nVar instanceof m2.c) {
            i11 |= 2097152;
        }
        if (nVar instanceof f0.r) {
            i11 |= 8388608;
        }
        a0Var.g(i11, cls);
        return i11;
    }

    public static final int f(v1.n nVar) {
        if (!(nVar instanceof k)) {
            return e(nVar);
        }
        k kVar = (k) nVar;
        int iF = kVar.H;
        for (v1.n nVar2 = kVar.I; nVar2 != null; nVar2 = nVar2.f17570f) {
            iF |= f(nVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return ((i10 & 128) != 0) | ((i10 & 4194304) != 0);
    }
}
