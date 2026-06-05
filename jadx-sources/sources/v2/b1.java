package v2;

import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f17581a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f17582b;

    /* renamed from: c, reason: collision with root package name */
    public final s f17583c;

    /* renamed from: d, reason: collision with root package name */
    public i1 f17584d;

    /* renamed from: e, reason: collision with root package name */
    public final b2 f17585e;

    /* renamed from: f, reason: collision with root package name */
    public v1.n f17586f;

    /* renamed from: g, reason: collision with root package name */
    public g1.e f17587g;

    /* renamed from: h, reason: collision with root package name */
    public g1.e f17588h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.e f17589i;
    public z0 j;

    public b1(f0 f0Var) {
        this.f17581a = f0Var;
        a1 a1Var = new a1();
        a1Var.f17568d = -1;
        this.f17582b = a1Var;
        s sVar = new s(f0Var);
        this.f17583c = sVar;
        this.f17584d = sVar;
        b2 b2Var = sVar.f17751k0;
        this.f17585e = b2Var;
        this.f17586f = b2Var;
        this.f17589i = new g1.e(new v1.o[16]);
    }

    public static final void a(b1 b1Var, v1.n nVar, i1 i1Var) {
        for (v1.n nVar2 = nVar.f17569e; nVar2 != null; nVar2 = nVar2.f17569e) {
            if (nVar2 == b1Var.f17582b) {
                f0 f0VarU = b1Var.f17581a.u();
                i1Var.J = f0VarU != null ? f0VarU.Y.f17583c : null;
                b1Var.f17584d = i1Var;
                return;
            } else {
                if ((nVar2.f17567c & 2) != 0) {
                    return;
                }
                nVar2.p1(i1Var);
            }
        }
    }

    public static v1.n b(v1.m mVar, v1.n nVar) {
        v1.n nVarD;
        if (mVar instanceof x0) {
            nVarD = ((x0) mVar).d();
            nVarD.f17567c = j1.f(nVarD);
        } else {
            b bVar = new b();
            bVar.f17567c = j1.d(mVar);
            bVar.H = mVar;
            new HashSet();
            nVarD = bVar;
        }
        if (nVarD.G) {
            s2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        nVarD.B = true;
        v1.n nVar2 = nVar.f17570f;
        if (nVar2 != null) {
            nVar2.f17569e = nVarD;
            nVarD.f17570f = nVar2;
        }
        nVar.f17570f = nVarD;
        nVarD.f17569e = nVar;
        return nVarD;
    }

    public static v1.n c(v1.n nVar) {
        boolean z2 = nVar.G;
        if (z2) {
            q.a0 a0Var = j1.f17705a;
            if (!z2) {
                s2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            j1.a(nVar, -1, 2);
            nVar.n1();
            nVar.h1();
        }
        v1.n nVar2 = nVar.f17570f;
        v1.n nVar3 = nVar.f17569e;
        if (nVar2 != null) {
            nVar2.f17569e = nVar3;
            nVar.f17570f = null;
        }
        if (nVar3 != null) {
            nVar3.f17570f = nVar2;
            nVar.f17569e = null;
        }
        fj.l.c(nVar3);
        return nVar3;
    }

    public static void h(v1.m mVar, v1.m mVar2, v1.n nVar) {
        if ((mVar instanceof x0) && (mVar2 instanceof x0)) {
            fj.l.d(nVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((x0) mVar2).g(nVar);
            if (nVar.G) {
                j1.c(nVar);
                return;
            } else {
                nVar.C = true;
                return;
            }
        }
        if (!(nVar instanceof b)) {
            s2.a.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) nVar;
        boolean z2 = bVar.G;
        if (z2) {
            if (!z2) {
                s2.a.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.f17567c & 8) != 0) {
                ((w2.t) n.z(bVar)).F();
            }
        }
        bVar.H = mVar2;
        bVar.f17567c = j1.d(mVar2);
        if (bVar.G) {
            bVar.q1(false);
        }
        if (nVar.G) {
            j1.c(nVar);
        } else {
            nVar.C = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f17586f.f17568d) != 0;
    }

    public final void e() {
        for (v1.n nVar = this.f17586f; nVar != null; nVar = nVar.f17570f) {
            nVar.m1();
            if (nVar.B) {
                q.a0 a0Var = j1.f17705a;
                if (!nVar.G) {
                    s2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j1.a(nVar, -1, 1);
            }
            if (nVar.C) {
                j1.c(nVar);
            }
            nVar.B = false;
            nVar.C = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, g1.e r33, g1.e r34, v1.n r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.b1.f(int, g1.e, g1.e, v1.n, boolean):void");
    }

    public final void g() {
        f0 f0Var;
        y yVar;
        v1.n nVar = this.f17585e.f17569e;
        i1 i1Var = this.f17583c;
        v1.n nVar2 = nVar;
        while (true) {
            f0Var = this.f17581a;
            if (nVar2 == null) {
                break;
            }
            w wVarF = n.f(nVar2);
            if (wVarF != null) {
                i1 i1Var2 = nVar2.A;
                if (i1Var2 != null) {
                    y yVar2 = (y) i1Var2;
                    w wVar = yVar2.f17798k0;
                    yVar2.Y1(wVarF);
                    yVar = yVar2;
                    if (wVar != nVar2) {
                        q1 q1Var = yVar2.f17688e0;
                        yVar = yVar2;
                        if (q1Var != null) {
                            ((w2.l1) q1Var).invalidate();
                            yVar = yVar2;
                        }
                    }
                } else {
                    y yVar3 = new y(f0Var, wVarF);
                    nVar2.p1(yVar3);
                    yVar = yVar3;
                }
                i1Var.J = yVar;
                yVar.I = i1Var;
                i1Var = yVar;
            } else {
                nVar2.p1(i1Var);
            }
            nVar2 = nVar2.f17569e;
        }
        f0 f0VarU = f0Var.u();
        i1Var.J = f0VarU != null ? f0VarU.Y.f17583c : null;
        this.f17584d = i1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        v1.n nVar = this.f17586f;
        b2 b2Var = this.f17585e;
        if (nVar == b2Var) {
            sb2.append("]");
        } else {
            while (true) {
                if (nVar == null || nVar == b2Var) {
                    break;
                }
                sb2.append(String.valueOf(nVar));
                if (nVar.f17570f == b2Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                nVar = nVar.f17570f;
            }
        }
        return sb2.toString();
    }
}
