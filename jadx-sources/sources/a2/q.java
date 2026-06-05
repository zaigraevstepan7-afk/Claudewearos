package a2;

import android.view.View;
import v2.b1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    public final w2.t f44a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.t f45b;

    /* renamed from: d, reason: collision with root package name */
    public final j f47d;

    /* renamed from: f, reason: collision with root package name */
    public q.z f49f;

    /* renamed from: h, reason: collision with root package name */
    public e0 f51h;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f46c = new e0(2, null, 14);

    /* renamed from: e, reason: collision with root package name */
    public final o f48e = new o(this);

    /* renamed from: g, reason: collision with root package name */
    public final q.b0 f50g = new q.b0(1);

    public q(w2.t tVar, w2.t tVar2) {
        this.f44a = tVar;
        this.f45b = tVar2;
        this.f47d = new j(this, tVar2);
    }

    public final boolean a(boolean z2) {
        b1 b1Var;
        if (f() != null) {
            e0 e0VarF = f();
            i(null);
            if (e0VarF != null) {
                e0VarF.r1(b0.f10a, b0.f12c);
                if (!e0VarF.f17565a.G) {
                    s2.a.b("visitAncestors called on an unattached node");
                }
                v1.n nVar = e0VarF.f17565a.f17569e;
                v2.f0 f0VarY = v2.n.y(e0VarF);
                while (f0VarY != null) {
                    if ((f0VarY.Y.f17586f.f17568d & 1024) != 0) {
                        while (nVar != null) {
                            if ((nVar.f17567c & 1024) != 0) {
                                g1.e eVar = null;
                                v1.n nVarE = nVar;
                                while (nVarE != null) {
                                    if (nVarE instanceof e0) {
                                        ((e0) nVarE).r1(b0.f11b, b0.f12c);
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
        }
        return true;
    }

    public final boolean b(int i10, boolean z2, boolean z10) {
        int iOrdinal;
        boolean z11 = true;
        if (z2 || (iOrdinal = d.t(this.f46c, i10).ordinal()) == 0) {
            a(z2);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new b3.e();
            }
            z11 = false;
        }
        if (z11 && z10) {
            c();
        }
        return z11;
    }

    public final void c() {
        w2.t tVar = this.f44a;
        if (tVar.isFocused() || tVar.hasFocus()) {
            tVar.clearFocus();
        } else if (tVar.hasFocus()) {
            View viewFindFocus = tVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            tVar.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:147:0x01a7, B:149:0x01ad, B:151:0x01b1, B:153:0x01b9, B:155:0x01bf, B:159:0x01c7, B:161:0x01d0, B:162:0x01d4, B:163:0x01d7, B:166:0x01dd, B:167:0x01e2, B:168:0x01e5, B:170:0x01eb, B:172:0x01ef, B:175:0x01f6, B:177:0x01fe, B:184:0x0215, B:186:0x021a, B:188:0x021e, B:211:0x0260, B:192:0x022a, B:194:0x0230, B:196:0x0234, B:198:0x023c, B:200:0x0242, B:204:0x024a, B:206:0x0253, B:207:0x0257, B:208:0x025a, B:212:0x0265, B:216:0x0275, B:218:0x027a, B:220:0x027e, B:243:0x02c0, B:224:0x028a, B:226:0x0290, B:228:0x0294, B:230:0x029c, B:232:0x02a2, B:236:0x02aa, B:238:0x02b3, B:239:0x02b7, B:240:0x02ba, B:245:0x02c7, B:247:0x02ce, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:256:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r15v5, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r15v9, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [g1.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r14, ej.a r15) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q.d(android.view.KeyEvent, ej.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0120, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [ej.c, fj.m] */
    /* JADX WARN: Type inference failed for: r6v20, types: [ej.c, fj.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r20, b2.c r21, ej.c r22) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q.e(int, b2.c, ej.c):java.lang.Boolean");
    }

    public final e0 f() {
        e0 e0Var = this.f51h;
        if (e0Var == null || !e0Var.G) {
            return null;
        }
        return e0Var;
    }

    public final boolean g(int i10, boolean z2) {
        e0 e0VarF = f();
        w2.t tVar = this.f44a;
        if (e0VarF == null || !e0VarF.H || !tVar.z(i10)) {
            fj.v vVar = new fj.v();
            vVar.f6807a = Boolean.FALSE;
            e0 e0VarF2 = f();
            Boolean boolE = e(i10, tVar.getEmbeddedViewFocusRect(), new e5.g(i10, 4, vVar));
            if (!fj.l.b(boolE, Boolean.TRUE) || e0VarF2 == f()) {
                if (boolE != null && vVar.f6807a != null) {
                    if (!boolE.booleanValue() || !((Boolean) vVar.f6807a).booleanValue()) {
                        if ((i10 == 1 || i10 == 2) && z2 && b(i10, false, false)) {
                            Boolean boolE2 = e(i10, null, new p(i10, 1));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i10) {
        if (!b(i10, false, false)) {
            return false;
        }
        Boolean boolE = e(i10, null, new p(i10, 0));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(e0 e0Var) {
        e0 e0Var2 = this.f51h;
        this.f51h = e0Var;
        q.b0 b0Var = this.f50g;
        Object[] objArr = b0Var.f13033a;
        int i10 = b0Var.f13034b;
        for (int i11 = 0; i11 < i10; i11++) {
            ((k) objArr[i11]).a(e0Var2, e0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.f13156e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.f13152a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.f13154c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.f13155d * 32, r3 * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r3 = r4.f13152a;
        r8 = r4.f13154c;
        r9 = r4.f13153b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        r32 = r6;
        r17 = r15;
        r5 = qi.k.q0(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        if (r13 != r17) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0145, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0166, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0168, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0189, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r34 >> r6) & 255) != r17) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r17 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01db, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e9, code lost:
    
        r33 = r7;
        r4.f13156e = q.n0.a(r4.f13154c) - r4.f13155d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fa, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fc, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0201, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0204, code lost:
    
        r3 = q.n0.b(r4.f13154c);
        r5 = r4.f13152a;
        r6 = r4.f13153b;
        r7 = r4.f13154c;
        r4.c(r3);
        r3 = r4.f13152a;
        r8 = r4.f13153b;
        r9 = r4.f13154c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021b, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022a, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022c, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r19 = r5;
        r20 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r22 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r22))) | (r5 << r22);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026a, code lost:
    
        r16 = r3;
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0270, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0279, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        r32 = r3;
        r4.f13155d++;
        r3 = r4.f13156e;
        r5 = r4.f13152a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        r4.f13156e = r3 - r21;
        r3 = r4.f13154c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0345, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0347, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.q.j(android.view.KeyEvent):boolean");
    }
}
