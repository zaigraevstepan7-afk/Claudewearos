package tj;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class h0 extends uj.b implements a0, e, uj.l {
    public Object[] A;
    public long B;
    public long C;
    public int D;
    public int E;

    /* renamed from: e, reason: collision with root package name */
    public final int f16372e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16373f;

    /* renamed from: z, reason: collision with root package name */
    public final sj.a f16374z;

    public h0(int i10, int i11, sj.a aVar) {
        this.f16372e = i10;
        this.f16373f = i11;
        this.f16374z = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x009f, B:43:0x00a0, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [uj.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [tj.h0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [tj.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [uj.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [tj.j0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [tj.j0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(tj.h0 r8, tj.f r9, ti.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof tj.g0
            if (r0 == 0) goto L13
            r0 = r10
            tj.g0 r0 = (tj.g0) r0
            int r1 = r0.f16368z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16368z = r1
            goto L18
        L13:
            tj.g0 r0 = new tj.g0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16366e
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16368z
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            qj.e1 r8 = r0.f16365d
            tj.j0 r9 = r0.f16364c
            tj.f r2 = r0.f16363b
            tj.h0 r5 = r0.f16362a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            qj.e1 r8 = r0.f16365d
            tj.j0 r9 = r0.f16364c
            tj.f r2 = r0.f16363b
            tj.h0 r5 = r0.f16362a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            tj.j0 r9 = r0.f16364c
            tj.f r8 = r0.f16363b
            tj.h0 r2 = r0.f16362a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            uk.c.R(r10)
            uj.d r10 = r8.d()
            tj.j0 r10 = (tj.j0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            ti.h r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            qj.w r5 = qj.w.f13632b     // Catch: java.lang.Throwable -> Lb1
            ti.f r2 = r2.C(r5)     // Catch: java.lang.Throwable -> Lb1
            qj.e1 r2 = (qj.e1) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            d7.c r6 = tj.i0.f16380a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f16362a = r5     // Catch: java.lang.Throwable -> L38
            r0.f16363b = r2     // Catch: java.lang.Throwable -> L38
            r0.f16364c = r9     // Catch: java.lang.Throwable -> L38
            r0.f16365d = r8     // Catch: java.lang.Throwable -> L38
            r0.f16368z = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.i(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.t()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f16362a = r5     // Catch: java.lang.Throwable -> L38
            r0.f16363b = r2     // Catch: java.lang.Throwable -> L38
            r0.f16364c = r9     // Catch: java.lang.Throwable -> L38
            r0.f16365d = r8     // Catch: java.lang.Throwable -> L38
            r0.f16368z = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.h0.k(tj.h0, tj.f, ti.c):void");
    }

    @Override // uj.l
    public final e a(ti.h hVar, int i10, sj.a aVar) {
        return i0.l(this, hVar, i10, aVar);
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) throws Throwable {
        Throwable th2;
        ti.c[] cVarArrN;
        f0 f0Var;
        if (q(obj)) {
            return pi.o.f13011a;
        }
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        ti.c[] cVarArrN2 = uj.c.f17100a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        lVar.resumeWith(pi.o.f13011a);
                        cVarArrN = n(cVarArrN2);
                        f0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        f0 f0Var2 = new f0(this, o() + this.D + this.E, obj, lVar);
                        m(f0Var2);
                        this.E++;
                        if (this.f16373f == 0) {
                            cVarArrN2 = n(cVarArrN2);
                        }
                        cVarArrN = cVarArrN2;
                        f0Var = f0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (f0Var != null) {
                    lVar.t(new qj.i(f0Var, 2));
                }
                for (ti.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(pi.o.f13011a);
                    }
                }
                Object objO = lVar.o();
                ui.a aVar = ui.a.f17085a;
                if (objO != aVar) {
                    objO = pi.o.f13011a;
                }
                return objO == aVar ? objO : pi.o.f13011a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // tj.e
    public final Object c(f fVar, ti.c cVar) throws Throwable {
        k(this, fVar, cVar);
        return ui.a.f17085a;
    }

    @Override // uj.b
    public final uj.d e() {
        j0 j0Var = new j0();
        j0Var.f16385a = -1L;
        return j0Var;
    }

    @Override // uj.b
    public final uj.d[] f() {
        return new j0[2];
    }

    public final Object i(j0 j0Var, g0 g0Var) {
        qj.l lVar = new qj.l(1, u3.a.g(g0Var));
        lVar.p();
        synchronized (this) {
            try {
                if (s(j0Var) < 0) {
                    j0Var.f16386b = lVar;
                } else {
                    lVar.resumeWith(pi.o.f13011a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objO = lVar.o();
        return objO == ui.a.f17085a ? objO : pi.o.f13011a;
    }

    public final void j() {
        if (this.f16373f != 0 || this.E > 1) {
            Object[] objArr = this.A;
            fj.l.c(objArr);
            while (this.E > 0) {
                long jO = o();
                int i10 = this.D;
                int i11 = this.E;
                if (objArr[((int) ((jO + (i10 + i11)) - 1)) & (objArr.length - 1)] != i0.f16380a) {
                    return;
                }
                this.E = i11 - 1;
                i0.d(objArr, o() + this.D + this.E, null);
            }
        }
    }

    public final void l() {
        uj.d[] dVarArr;
        Object[] objArr = this.A;
        fj.l.c(objArr);
        i0.d(objArr, o(), null);
        this.D--;
        long jO = o() + 1;
        if (this.B < jO) {
            this.B = jO;
        }
        if (this.C < jO) {
            if (this.f17097b != 0 && (dVarArr = this.f17096a) != null) {
                for (uj.d dVar : dVarArr) {
                    if (dVar != null) {
                        j0 j0Var = (j0) dVar;
                        long j = j0Var.f16385a;
                        if (j >= 0 && j < jO) {
                            j0Var.f16385a = jO;
                        }
                    }
                }
            }
            this.C = jO;
        }
    }

    public final void m(Object obj) {
        int i10 = this.D + this.E;
        Object[] objArrP = this.A;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i10 >= objArrP.length) {
            objArrP = p(objArrP, i10, objArrP.length * 2);
        }
        i0.d(objArrP, o() + i10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final ti.c[] n(ti.c[] cVarArr) {
        uj.d[] dVarArr;
        j0 j0Var;
        qj.l lVar;
        int length = cVarArr.length;
        if (this.f17097b != 0 && (dVarArr = this.f17096a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                uj.d dVar = dVarArr[i10];
                if (dVar != null && (lVar = (j0Var = (j0) dVar).f16386b) != null && s(j0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        fj.l.e(CopyOf, "copyOf(...)");
                        cVarArr = CopyOf;
                    }
                    cVarArr[length] = lVar;
                    j0Var.f16386b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long o() {
        return Math.min(this.C, this.B);
    }

    public final Object[] p(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.A = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i12 = 0; i12 < i10; i12++) {
                long j = i12 + jO;
                i0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i10;
        boolean z2;
        ti.c[] cVarArrN = uj.c.f17100a;
        synchronized (this) {
            if (r(obj)) {
                cVarArrN = n(cVarArrN);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (ti.c cVar : cVarArrN) {
            if (cVar != null) {
                cVar.resumeWith(pi.o.f13011a);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f17097b
            int r2 = r12.f16372e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.m(r13)
            int r1 = r12.D
            int r1 = r1 + r9
            r12.D = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.D
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.C = r1
            return r9
        L23:
            int r1 = r12.D
            int r3 = r12.f16373f
            if (r1 < r3) goto L47
            long r4 = r12.C
            long r6 = r12.B
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            sj.a r1 = r12.f16374z
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            b3.e r1 = new b3.e
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.m(r13)
            int r1 = r12.D
            int r1 = r1 + r9
            r12.D = r1
            if (r1 <= r3) goto L54
            r12.l()
        L54:
            long r3 = r12.o()
            int r1 = r12.D
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.B
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.C
            long r5 = r12.o()
            int r7 = r12.D
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.D
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.E
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.h0.r(java.lang.Object):boolean");
    }

    public final long s(j0 j0Var) {
        long j = j0Var.f16385a;
        if (j < o() + this.D) {
            return j;
        }
        if (this.f16373f <= 0 && j <= o() && this.E != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(j0 j0Var) {
        Object obj;
        ti.c[] cVarArrV = uj.c.f17100a;
        synchronized (this) {
            try {
                long jS = s(j0Var);
                if (jS < 0) {
                    obj = i0.f16380a;
                } else {
                    long j = j0Var.f16385a;
                    Object[] objArr = this.A;
                    fj.l.c(objArr);
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof f0) {
                        obj2 = ((f0) obj2).f16354c;
                    }
                    j0Var.f16385a = jS + 1;
                    Object obj3 = obj2;
                    cVarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ti.c cVar : cVarArrV) {
            if (cVar != null) {
                cVar.resumeWith(pi.o.f13011a);
            }
        }
        return obj;
    }

    public final void u(long j, long j4, long j10, long j11) {
        long jMin = Math.min(j4, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.A;
            fj.l.c(objArr);
            i0.d(objArr, jO, null);
        }
        this.B = j;
        this.C = j4;
        this.D = (int) (j10 - jMin);
        this.E = (int) (j11 - j10);
    }

    public final ti.c[] v(long j) {
        long j4;
        long j10;
        long j11;
        ti.c[] cVarArr;
        ti.c[] cVarArr2;
        uj.d[] dVarArr;
        d7.c cVar = i0.f16380a;
        ti.c[] cVarArr3 = uj.c.f17100a;
        if (j <= this.C) {
            long jO = o();
            long j12 = this.D + jO;
            int i10 = this.f16373f;
            if (i10 == 0 && this.E > 0) {
                j12++;
            }
            int i11 = 0;
            if (this.f17097b != 0 && (dVarArr = this.f17096a) != null) {
                for (uj.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((j0) dVar).f16385a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.C) {
                long jO2 = o() + this.D;
                int iMin = this.f17097b > 0 ? Math.min(this.E, i10 - ((int) (jO2 - j12))) : this.E;
                long j14 = this.E + jO2;
                if (iMin > 0) {
                    j11 = 1;
                    Object[] objArr = this.A;
                    fj.l.c(objArr);
                    j4 = jO;
                    ti.c[] cVarArr4 = new ti.c[iMin];
                    long j15 = jO2;
                    while (true) {
                        if (jO2 >= j14) {
                            cVarArr2 = cVarArr4;
                            j10 = j12;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != cVar) {
                            fj.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            f0 f0Var = (f0) obj;
                            int i12 = i11 + 1;
                            j10 = j12;
                            cVarArr2[i11] = f0Var.f16355d;
                            i0.d(objArr, jO2, cVar);
                            i0.d(objArr, j15, f0Var.f16354c);
                            j15++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j10 = j12;
                        }
                        jO2++;
                        cVarArr4 = cVarArr2;
                        j12 = j10;
                    }
                    jO2 = j15;
                    cVarArr = cVarArr2;
                } else {
                    j4 = jO;
                    j10 = j12;
                    j11 = 1;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (jO2 - j4);
                long j16 = this.f17097b == 0 ? jO2 : j10;
                long jMax = Math.max(this.B, jO2 - Math.min(this.f16372e, i13));
                if (i10 == 0 && jMax < j14) {
                    Object[] objArr2 = this.A;
                    fj.l.c(objArr2);
                    if (fj.l.b(objArr2[((int) jMax) & (objArr2.length - 1)], cVar)) {
                        jO2 += j11;
                        jMax += j11;
                    }
                }
                u(jMax, j16, jO2, j14);
                j();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr3;
    }
}
