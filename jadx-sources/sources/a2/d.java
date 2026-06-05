package a2;

import java.util.Arrays;
import v2.b1;
import v2.i1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {
    public static final boolean A(int i10, n nVar, e0 e0Var, b2.c cVar) {
        e0 e0VarG;
        g1.e eVar = new g1.e(new e0[16]);
        if (!e0Var.f17565a.G) {
            s2.a.b("visitChildren called on an unattached node");
        }
        g1.e eVar2 = new g1.e(new v1.n[16]);
        v1.n nVar2 = e0Var.f17565a;
        v1.n nVar3 = nVar2.f17570f;
        if (nVar3 == null) {
            v2.n.b(eVar2, nVar2);
        } else {
            eVar2.b(nVar3);
        }
        while (true) {
            int i11 = eVar2.f7026c;
            if (i11 == 0) {
                break;
            }
            v1.n nVarE = (v1.n) eVar2.l(i11 - 1);
            if ((nVarE.f17568d & 1024) == 0) {
                v2.n.b(eVar2, nVarE);
            } else {
                while (true) {
                    if (nVarE == null) {
                        break;
                    }
                    if ((nVarE.f17567c & 1024) != 0) {
                        g1.e eVar3 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e0) {
                                e0 e0Var2 = (e0) nVarE;
                                if (e0Var2.G) {
                                    eVar.b(e0Var2);
                                }
                            } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                int i12 = 0;
                                for (v1.n nVar4 = ((v2.k) nVarE).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                    if ((nVar4.f17567c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            nVarE = nVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new g1.e(new v1.n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar3.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar3.b(nVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar3);
                        }
                    } else {
                        nVarE = nVarE.f17570f;
                    }
                }
            }
        }
        while (eVar.f7026c != 0 && (e0VarG = g(eVar, cVar, i10)) != null) {
            if (e0VarG.s1().f56a) {
                return ((Boolean) nVar.invoke(e0VarG)).booleanValue();
            }
            if (l(i10, nVar, e0VarG, cVar)) {
                return true;
            }
            eVar.k(e0VarG);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(a2.e0 r12, a2.e0 r13, int r14, a2.n r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.B(a2.e0, a2.e0, int, a2.n):boolean");
    }

    public static final Boolean C(int i10, n nVar, e0 e0Var, b2.c cVar) {
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarN = n(e0Var);
                if (e0VarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = e0VarN.v1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolC = C(i10, nVar, e0VarN, cVar);
                        if (!fj.l.b(boolC, Boolean.FALSE)) {
                            return boolC;
                        }
                        if (cVar == null) {
                            if (e0VarN.v1() != b0.f11b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            e0 e0VarF = f(e0VarN);
                            if (e0VarF == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = i(e0VarF);
                        }
                        return Boolean.valueOf(l(i10, nVar, e0Var, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new b3.e();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = i(e0VarN);
                }
                return Boolean.valueOf(l(i10, nVar, e0Var, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return e0Var.s1().f56a ? (Boolean) nVar.invoke(e0Var) : cVar == null ? Boolean.valueOf(h(e0Var, i10, nVar)) : Boolean.valueOf(A(i10, nVar, e0Var, cVar));
                }
                throw new b3.e();
            }
        }
        return Boolean.valueOf(h(e0Var, i10, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(a2.e0 r7, a2.n r8) {
        /*
            a2.b0 r0 = r7.v1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = x(r7, r8)
            if (r0 != 0) goto L7d
            a2.u r0 = r7.s1()
            boolean r0 = r0.f56a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            b3.e r7 = new b3.e
            r7.<init>()
            throw r7
        L37:
            a2.e0 r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            a2.b0 r6 = r0.v1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            b3.e r7 = new b3.e
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            a2.u r7 = r0.s1()
            boolean r7 = r7.f56a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = x(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.a(a2.e0, a2.n):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f1504c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f1502a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f1505d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f1503b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(b2.c r18, b2.c r19, b2.c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.f1503b
            float r6 = r2.f1505d
            float r7 = r2.f1502a
            float r2 = r2.f1504c
            float r8 = r0.f1505d
            float r9 = r0.f1503b
            float r10 = r0.f1504c
            float r11 = r0.f1502a
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f1504c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f1502a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f1505d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.f1503b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.b(b2.c, b2.c, b2.c, int):boolean");
    }

    public static final boolean c(int i10, b2.c cVar, b2.c cVar2) {
        if (i10 == 3 || i10 == 4) {
            return cVar.f1505d > cVar2.f1503b && cVar.f1503b < cVar2.f1505d;
        }
        if (i10 == 5 || i10 == 6) {
            return cVar.f1504c > cVar2.f1502a && cVar.f1502a < cVar2.f1504c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean d(e0 e0Var, boolean z2) {
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarN = n(e0Var);
                if (!(e0VarN != null ? d(e0VarN, z2) : true)) {
                    return false;
                }
                e0Var.r1(b0.f11b, b0.f12c);
                return true;
            }
            if (iOrdinal == 2) {
                return z2;
            }
            if (iOrdinal != 3) {
                throw new b3.e();
            }
        }
        return true;
    }

    public static final void e(e0 e0Var, g1.e eVar) {
        if (!e0Var.f17565a.G) {
            s2.a.b("visitChildren called on an unattached node");
        }
        g1.e eVar2 = new g1.e(new v1.n[16]);
        v1.n nVar = e0Var.f17565a;
        v1.n nVar2 = nVar.f17570f;
        if (nVar2 == null) {
            v2.n.b(eVar2, nVar);
        } else {
            eVar2.b(nVar2);
        }
        while (true) {
            int i10 = eVar2.f7026c;
            if (i10 == 0) {
                return;
            }
            v1.n nVarE = (v1.n) eVar2.l(i10 - 1);
            if ((nVarE.f17568d & 1024) == 0) {
                v2.n.b(eVar2, nVarE);
            } else {
                while (true) {
                    if (nVarE == null) {
                        break;
                    }
                    if ((nVarE.f17567c & 1024) != 0) {
                        g1.e eVar3 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e0) {
                                e0 e0Var2 = (e0) nVarE;
                                if (e0Var2.G && !v2.n.y(e0Var2).f17637j0) {
                                    if (e0Var2.s1().f56a) {
                                        eVar.b(e0Var2);
                                    } else {
                                        e(e0Var2, eVar);
                                    }
                                }
                            } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                int i11 = 0;
                                for (v1.n nVar3 = ((v2.k) nVarE).I; nVar3 != null; nVar3 = nVar3.f17570f) {
                                    if ((nVar3.f17567c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar3);
                        }
                    } else {
                        nVarE = nVarE.f17570f;
                    }
                }
            }
        }
    }

    public static final e0 f(e0 e0Var) {
        e0 e0VarF = ((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f();
        if (e0VarF == null || !e0VarF.G) {
            return null;
        }
        return e0VarF;
    }

    public static final e0 g(g1.e eVar, b2.c cVar, int i10) {
        b2.c cVarH;
        if (i10 == 3) {
            cVarH = cVar.h((cVar.f1504c - cVar.f1502a) + 1, 0.0f);
        } else if (i10 == 4) {
            cVarH = cVar.h(-((cVar.f1504c - cVar.f1502a) + 1), 0.0f);
        } else if (i10 == 5) {
            cVarH = cVar.h(0.0f, (cVar.f1505d - cVar.f1503b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarH = cVar.h(0.0f, -((cVar.f1505d - cVar.f1503b) + 1));
        }
        Object[] objArr = eVar.f7024a;
        int i11 = eVar.f7026c;
        e0 e0Var = null;
        for (int i12 = 0; i12 < i11; i12++) {
            e0 e0Var2 = (e0) objArr[i12];
            if (r(e0Var2)) {
                b2.c cVarI = i(e0Var2);
                if (o(cVarI, cVarH, cVar, i10)) {
                    e0Var = e0Var2;
                    cVarH = cVarI;
                }
            }
        }
        return e0Var;
    }

    public static final boolean h(e0 e0Var, int i10, ej.c cVar) {
        b2.c cVar2;
        g1.e eVar = new g1.e(new e0[16]);
        e(e0Var, eVar);
        int i11 = eVar.f7026c;
        if (i11 <= 1) {
            e0 e0Var2 = (e0) (i11 == 0 ? null : eVar.f7024a[0]);
            if (e0Var2 != null) {
                return ((Boolean) cVar.invoke(e0Var2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                b2.c cVarI = i(e0Var);
                float f10 = cVarI.f1502a;
                float f11 = cVarI.f1503b;
                cVar2 = new b2.c(f10, f11, f10, f11);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                b2.c cVarI2 = i(e0Var);
                float f12 = cVarI2.f1504c;
                float f13 = cVarI2.f1505d;
                cVar2 = new b2.c(f12, f13, f12, f13);
            }
            e0 e0VarG = g(eVar, cVar2, i10);
            if (e0VarG != null) {
                return ((Boolean) cVar.invoke(e0VarG)).booleanValue();
            }
        }
        return false;
    }

    public static final b2.c i(e0 e0Var) {
        i1 i1Var;
        if (e0Var.G && (i1Var = e0Var.A) != null) {
            t2.w wVarH = t2.z.h(i1Var);
            if (!wVarH.E()) {
                wVarH = null;
            }
            if (wVarH != null) {
                return e0Var.t1(wVarH);
            }
        }
        return b2.c.f1501e;
    }

    public static final v1.o j(w wVar) {
        return new x(wVar);
    }

    public static final boolean k(e0 e0Var, n nVar) {
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarN = n(e0Var);
                if (e0VarN != null) {
                    return k(e0VarN, nVar) || m(e0Var, e0VarN, 1, nVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return e0Var.s1().f56a ? ((Boolean) nVar.invoke(e0Var)).booleanValue() : y(e0Var, nVar);
                }
                throw new b3.e();
            }
        }
        return y(e0Var, nVar);
    }

    public static final boolean l(int i10, n nVar, e0 e0Var, b2.c cVar) {
        if (A(i10, nVar, e0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(e0Var, i10, new h0(((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f(), e0Var, cVar, i10, nVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(e0 e0Var, e0 e0Var2, int i10, n nVar) {
        if (B(e0Var, e0Var2, i10, nVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(e0Var, i10, new h0(((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f(), e0Var, e0Var2, i10, nVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a2.e0 n(a2.e0 r8) {
        /*
            v1.n r0 = r8.f17565a
            boolean r0 = r0.G
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            s2.a.b(r0)
        L10:
            g1.e r0 = new g1.e
            r2 = 16
            v1.n[] r3 = new v1.n[r2]
            r0.<init>(r3)
            v1.n r8 = r8.f17565a
            v1.n r3 = r8.f17570f
            if (r3 != 0) goto L23
            v2.n.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f7026c
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            v1.n r8 = (v1.n) r8
            int r3 = r8.f17568d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            v2.n.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f17567c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof a2.e0
            r5 = 1
            if (r4 == 0) goto L6e
            a2.e0 r8 = (a2.e0) r8
            v1.n r4 = r8.f17565a
            boolean r4 = r4.G
            if (r4 == 0) goto La4
            a2.b0 r4 = r8.v1()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            b3.e r8 = new b3.e
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f17567c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof v2.k
            if (r4 == 0) goto La4
            r4 = r8
            v2.k r4 = (v2.k) r4
            v1.n r4 = r4.I
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f17567c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            g1.e r3 = new g1.e
            v1.n[] r7 = new v1.n[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            v1.n r4 = r4.f17570f
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            v1.n r8 = v2.n.e(r3)
            goto L45
        La9:
            v1.n r8 = r8.f17570f
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.n(a2.e0):a2.e0");
    }

    public static final boolean o(b2.c cVar, b2.c cVar2, b2.c cVar3, int i10) {
        if (!p(i10, cVar, cVar3)) {
            return false;
        }
        if (p(i10, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i10)) {
            return !b(cVar3, cVar2, cVar, i10) && q(i10, cVar3, cVar) < q(i10, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i10, b2.c cVar, b2.c cVar2) {
        if (i10 == 3) {
            float f10 = cVar2.f1504c;
            float f11 = cVar2.f1502a;
            float f12 = cVar.f1504c;
            return (f10 > f12 || f11 >= f12) && f11 > cVar.f1502a;
        }
        if (i10 == 4) {
            float f13 = cVar2.f1502a;
            float f14 = cVar2.f1504c;
            float f15 = cVar.f1502a;
            return (f13 < f15 || f14 <= f15) && f14 < cVar.f1504c;
        }
        if (i10 == 5) {
            float f16 = cVar2.f1505d;
            float f17 = cVar2.f1503b;
            float f18 = cVar.f1505d;
            return (f16 > f18 || f17 >= f18) && f17 > cVar.f1503b;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f19 = cVar2.f1503b;
        float f20 = cVar2.f1505d;
        float f21 = cVar.f1503b;
        return (f19 < f21 || f20 <= f21) && f20 < cVar.f1505d;
    }

    public static final long q(int i10, b2.c cVar, b2.c cVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (i10 == 3) {
            f10 = cVar.f1502a;
            f11 = cVar2.f1504c;
        } else if (i10 == 4) {
            f10 = cVar2.f1502a;
            f11 = cVar.f1504c;
        } else if (i10 == 5) {
            f10 = cVar.f1503b;
            f11 = cVar2.f1505d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f1503b;
            f11 = cVar.f1505d;
        }
        float f16 = f10 - f11;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        long j = (long) f16;
        if (i10 == 3 || i10 == 4) {
            float f17 = cVar.f1503b;
            f12 = 2;
            f13 = ((cVar.f1505d - f17) / f12) + f17;
            f14 = cVar2.f1503b;
            f15 = cVar2.f1505d;
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f1502a;
            f12 = 2;
            f13 = ((cVar.f1504c - f18) / f12) + f18;
            f14 = cVar2.f1502a;
            f15 = cVar2.f1504c;
        }
        long j4 = (long) (f13 - (((f15 - f14) / f12) + f14));
        return (j4 * j4) + (13 * j * j);
    }

    public static final boolean r(e0 e0Var) {
        v2.f0 f0Var;
        i1 i1Var;
        v2.f0 f0Var2;
        i1 i1Var2 = e0Var.A;
        return (i1Var2 == null || (f0Var = i1Var2.H) == null || !f0Var.H() || (i1Var = e0Var.A) == null || (f0Var2 = i1Var.H) == null || !f0Var2.G()) ? false : true;
    }

    public static final v1.o s(v1.o oVar, ej.c cVar) {
        return oVar.c(new c(cVar));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ej.c, fj.m] */
    public static final b t(e0 e0Var, int i10) {
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarN = n(e0Var);
                if (e0VarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarT = t(e0VarN, i10);
                b bVar = b.f6a;
                if (bVarT == bVar) {
                    bVarT = null;
                }
                if (bVarT != null) {
                    return bVarT;
                }
                if (e0Var.J) {
                    return bVar;
                }
                e0Var.J = true;
                try {
                    u uVarS1 = e0Var.s1();
                    a aVar = new a(i10);
                    q qVar = (q) ((w2.t) v2.n.z(e0Var)).getFocusOwner();
                    e0 e0VarF = qVar.f();
                    uVarS1.f65k.invoke(aVar);
                    e0 e0VarF2 = qVar.f();
                    if (!aVar.f5b) {
                        return (e0VarF == e0VarF2 || e0VarF2 == null) ? bVar : w.f69d == w.f68c ? b.f7b : b.f8c;
                    }
                    w wVar = w.f67b;
                    return b.f7b;
                } finally {
                    e0Var.J = false;
                }
            }
            if (iOrdinal == 2) {
                return b.f7b;
            }
            if (iOrdinal != 3) {
                throw new b3.e();
            }
        }
        return b.f6a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ej.c, fj.m] */
    public static final b u(e0 e0Var, int i10) {
        if (!e0Var.K) {
            e0Var.K = true;
            try {
                u uVarS1 = e0Var.s1();
                a aVar = new a(i10);
                q qVar = (q) ((w2.t) v2.n.z(e0Var)).getFocusOwner();
                e0 e0VarF = qVar.f();
                uVarS1.j.invoke(aVar);
                e0 e0VarF2 = qVar.f();
                if (aVar.f5b) {
                    w wVar = w.f67b;
                    return b.f7b;
                }
                if (e0VarF != e0VarF2 && e0VarF2 != null) {
                    return w.f69d == w.f68c ? b.f7b : b.f8c;
                }
            } finally {
                e0Var.K = false;
            }
        }
        return b.f6a;
    }

    public static final b v(e0 e0Var, int i10) {
        v1.n nVarE;
        b1 b1Var;
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarN = n(e0Var);
                if (e0VarN != null) {
                    return t(e0VarN, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b3.e();
                }
                if (!e0Var.f17565a.G) {
                    s2.a.b("visitAncestors called on an unattached node");
                }
                v1.n nVar = e0Var.f17565a.f17569e;
                v2.f0 f0VarY = v2.n.y(e0Var);
                loop0: while (true) {
                    if (f0VarY == null) {
                        nVarE = null;
                        break;
                    }
                    if ((f0VarY.Y.f17586f.f17568d & 1024) != 0) {
                        while (nVar != null) {
                            if ((nVar.f17567c & 1024) != 0) {
                                nVarE = nVar;
                                g1.e eVar = null;
                                while (nVarE != null) {
                                    if (nVarE instanceof e0) {
                                        break loop0;
                                    }
                                    if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                        int i11 = 0;
                                        for (v1.n nVar2 = ((v2.k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                            if ((nVar2.f17567c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
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
                e0 e0Var2 = (e0) nVarE;
                if (e0Var2 == null) {
                    return b.f6a;
                }
                int iOrdinal2 = e0Var2.v1().ordinal();
                if (iOrdinal2 == 0) {
                    return u(e0Var2, i10);
                }
                if (iOrdinal2 == 1) {
                    return v(e0Var2, i10);
                }
                if (iOrdinal2 == 2) {
                    return b.f7b;
                }
                if (iOrdinal2 != 3) {
                    throw new b3.e();
                }
                b bVarV = v(e0Var2, i10);
                b bVar = bVarV != b.f6a ? bVarV : null;
                return bVar == null ? u(e0Var2, i10) : bVar;
            }
        }
        return b.f6a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v10, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final boolean w(e0 e0Var) {
        g1.e eVar;
        b1 b1Var;
        q qVar;
        boolean z2;
        int i10;
        ?? eVar2;
        int i11;
        int i12;
        b1 b1Var2;
        q qVar2 = (q) ((w2.t) v2.n.z(e0Var)).getFocusOwner();
        e0 e0VarF = qVar2.f();
        b0 b0VarV1 = e0Var.v1();
        if (e0VarF == e0Var) {
            e0Var.r1(b0VarV1, b0VarV1);
            return true;
        }
        if ((e0VarF == null || e0VarF.H) && !e0Var.H && !((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).f44a.I()) {
            return false;
        }
        if (e0VarF != null) {
            eVar = new g1.e(new e0[16]);
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
                            g1.e eVar3 = null;
                            while (nVarE != null) {
                                if (nVarE instanceof e0) {
                                    eVar.b((e0) nVarE);
                                } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                    int i13 = 0;
                                    for (v1.n nVar2 = ((v2.k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                        if ((nVar2.f17567c & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                nVarE = nVar2;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new g1.e(new v1.n[16]);
                                                }
                                                if (nVarE != null) {
                                                    eVar3.b(nVarE);
                                                    nVarE = null;
                                                }
                                                eVar3.b(nVar2);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                nVarE = v2.n.e(eVar3);
                            }
                        }
                        nVar = nVar.f17569e;
                    }
                }
                f0VarY = f0VarY.u();
                nVar = (f0VarY == null || (b1Var2 = f0VarY.Y) == null) ? null : b1Var2.f17585e;
            }
        } else {
            eVar = null;
        }
        e0[] e0VarArr = new e0[16];
        e0[] e0VarArr2 = new e0[16];
        if (!e0Var.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        v1.n nVar3 = e0Var.f17565a.f17569e;
        v2.f0 f0VarY2 = v2.n.y(e0Var);
        boolean z10 = true;
        int i14 = 0;
        int i15 = 0;
        while (f0VarY2 != null) {
            if ((f0VarY2.Y.f17586f.f17568d & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f17567c & 1024) != 0) {
                        e0 e0VarE = nVar3;
                        g1.e eVar4 = null;
                        while (e0VarE != 0) {
                            if (e0VarE instanceof e0) {
                                e0 e0Var2 = e0VarE;
                                if (fj.l.b(eVar != null ? Boolean.valueOf(eVar.k(e0Var2)) : null, Boolean.TRUE)) {
                                    int i16 = i14 + 1;
                                    if (e0VarArr.length < i16) {
                                        int length = e0VarArr.length;
                                        qVar = qVar2;
                                        ?? r12 = new Object[Math.max(i16, length * 2)];
                                        i12 = i16;
                                        System.arraycopy(e0VarArr, 0, r12, 0, length);
                                        e0VarArr = r12;
                                    } else {
                                        qVar = qVar2;
                                        i12 = i16;
                                    }
                                    e0VarArr[i14] = e0Var2;
                                    i14 = i12;
                                } else {
                                    qVar = qVar2;
                                    int i17 = i15 + 1;
                                    if (e0VarArr2.length < i17) {
                                        int length2 = e0VarArr2.length;
                                        ?? r52 = new Object[Math.max(i17, length2 * 2)];
                                        i11 = i17;
                                        System.arraycopy(e0VarArr2, 0, r52, 0, length2);
                                        e0VarArr2 = r52;
                                    } else {
                                        i11 = i17;
                                    }
                                    e0VarArr2[i15] = e0Var2;
                                    i15 = i11;
                                }
                                if (e0Var2 == e0VarF) {
                                    z10 = false;
                                }
                                z2 = false;
                            } else {
                                qVar = qVar2;
                                z2 = true;
                            }
                            if (z2 && (e0VarE.f17567c & 1024) != 0 && (e0VarE instanceof v2.k)) {
                                v1.n nVar4 = e0VarE.I;
                                int i18 = 0;
                                e0VarE = e0VarE;
                                while (nVar4 != null) {
                                    if ((nVar4.f17567c & 1024) != 0) {
                                        int i19 = i18 + 1;
                                        if (i19 == 1) {
                                            e0VarE = nVar4;
                                            i10 = i19;
                                        } else {
                                            if (eVar4 == null) {
                                                i10 = i19;
                                                eVar2 = new g1.e(new v1.n[16]);
                                            } else {
                                                i10 = i19;
                                                eVar2 = eVar4;
                                            }
                                            if (e0VarE != 0) {
                                                eVar2.b(e0VarE);
                                                e0VarE = 0;
                                            }
                                            eVar2.b(nVar4);
                                            eVar4 = eVar2;
                                            e0VarE = e0VarE;
                                        }
                                        i18 = i10;
                                    }
                                    nVar4 = nVar4.f17570f;
                                    e0VarE = e0VarE;
                                }
                                if (i18 == 1) {
                                    qVar2 = qVar;
                                } else {
                                    e0VarE = v2.n.e(eVar4);
                                    qVar2 = qVar;
                                }
                            } else {
                                e0VarE = v2.n.e(eVar4);
                                qVar2 = qVar;
                            }
                        }
                    }
                    nVar3 = nVar3.f17569e;
                    qVar2 = qVar2;
                }
            }
            q qVar3 = qVar2;
            f0VarY2 = f0VarY2.u();
            nVar3 = (f0VarY2 == null || (b1Var = f0VarY2.Y) == null) ? null : b1Var.f17585e;
            qVar2 = qVar3;
        }
        q qVar4 = qVar2;
        if (z10 && e0VarF != null && !d(e0VarF, false)) {
            return false;
        }
        v2.n.t(e0Var, new f0(e0Var, 0));
        int iOrdinal = e0Var.v1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).i(e0Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b3.e();
                }
                ((q) ((w2.t) v2.n.z(e0Var)).getFocusOwner()).i(e0Var);
            }
        }
        if (z10 && e0VarF != null) {
            e0VarF.r1(b0.f10a, b0.f12c);
        }
        if (eVar != null) {
            int i20 = eVar.f7026c - 1;
            Object[] objArr = eVar.f7024a;
            if (i20 < objArr.length) {
                while (i20 >= 0) {
                    e0 e0Var3 = (e0) objArr[i20];
                    if (qVar4.f() != e0Var) {
                        return false;
                    }
                    e0Var3.r1(b0.f11b, b0.f12c);
                    i20--;
                }
            }
        }
        int i21 = i15 - 1;
        if (i21 < e0VarArr2.length) {
            while (i21 >= 0) {
                e0 e0Var4 = e0VarArr2[i21];
                if (qVar4.f() != e0Var) {
                    return false;
                }
                e0Var4.r1(e0Var4 == e0VarF ? b0.f10a : b0.f12c, b0.f11b);
                i21--;
            }
        }
        if (qVar4.f() != e0Var) {
            return false;
        }
        e0Var.r1(b0VarV1, b0.f10a);
        return qVar4.f() == e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(e0 e0Var, n nVar) {
        e0[] e0VarArr = new e0[16];
        if (!e0Var.f17565a.G) {
            s2.a.b("visitChildren called on an unattached node");
        }
        g1.e eVar = new g1.e(new v1.n[16]);
        v1.n nVar2 = e0Var.f17565a;
        v1.n nVar3 = nVar2.f17570f;
        if (nVar3 == null) {
            v2.n.b(eVar, nVar2);
        } else {
            eVar.b(nVar3);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f7026c;
            if (i11 == 0) {
                break;
            }
            v1.n nVarE = (v1.n) eVar.l(i11 - 1);
            if ((nVarE.f17568d & 1024) == 0) {
                v2.n.b(eVar, nVarE);
            } else {
                while (true) {
                    if (nVarE == null) {
                        break;
                    }
                    if ((nVarE.f17567c & 1024) != 0) {
                        g1.e eVar2 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e0) {
                                e0 e0Var2 = (e0) nVarE;
                                int i12 = i10 + 1;
                                if (e0VarArr.length < i12) {
                                    int length = e0VarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(e0VarArr, 0, r10, 0, length);
                                    e0VarArr = r10;
                                }
                                e0VarArr[i10] = e0Var2;
                                i10 = i12;
                            } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                int i13 = 0;
                                for (v1.n nVar4 = ((v2.k) nVarE).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                    if ((nVar4.f17567c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar2);
                        }
                    } else {
                        nVarE = nVarE.f17570f;
                    }
                }
            }
        }
        Arrays.sort(e0VarArr, 0, i10, g0.f22a);
        int i14 = i10 - 1;
        if (i14 < e0VarArr.length) {
            while (i14 >= 0) {
                e0 e0Var3 = e0VarArr[i14];
                if (r(e0Var3) && a(e0Var3, nVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean y(e0 e0Var, n nVar) {
        e0[] e0VarArr = new e0[16];
        if (!e0Var.f17565a.G) {
            s2.a.b("visitChildren called on an unattached node");
        }
        g1.e eVar = new g1.e(new v1.n[16]);
        v1.n nVar2 = e0Var.f17565a;
        v1.n nVar3 = nVar2.f17570f;
        if (nVar3 == null) {
            v2.n.b(eVar, nVar2);
        } else {
            eVar.b(nVar3);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f7026c;
            if (i11 == 0) {
                break;
            }
            v1.n nVarE = (v1.n) eVar.l(i11 - 1);
            if ((nVarE.f17568d & 1024) == 0) {
                v2.n.b(eVar, nVarE);
            } else {
                while (true) {
                    if (nVarE == null) {
                        break;
                    }
                    if ((nVarE.f17567c & 1024) != 0) {
                        g1.e eVar2 = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e0) {
                                e0 e0Var2 = (e0) nVarE;
                                int i12 = i10 + 1;
                                if (e0VarArr.length < i12) {
                                    int length = e0VarArr.length;
                                    ?? r10 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(e0VarArr, 0, r10, 0, length);
                                    e0VarArr = r10;
                                }
                                e0VarArr[i10] = e0Var2;
                                i10 = i12;
                            } else if ((nVarE.f17567c & 1024) != 0 && (nVarE instanceof v2.k)) {
                                int i13 = 0;
                                for (v1.n nVar4 = ((v2.k) nVarE).I; nVar4 != null; nVar4 = nVar4.f17570f) {
                                    if ((nVar4.f17567c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar2);
                        }
                    } else {
                        nVarE = nVarE.f17570f;
                    }
                }
            }
        }
        Arrays.sort(e0VarArr, 0, i10, g0.f22a);
        for (int i14 = 0; i14 < i10; i14++) {
            e0 e0Var3 = e0VarArr[i14];
            if (r(e0Var3) && k(e0Var3, nVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[PHI: r0
      0x00a1: PHI (r0v10 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(a2.e0 r10, int r11, ej.c r12) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.d.z(a2.e0, int, ej.c):java.lang.Object");
    }
}
