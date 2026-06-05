package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d7.c f16380a = new d7.c("NO_VALUE");

    /* renamed from: b, reason: collision with root package name */
    public static final d7.c f16381b = new d7.c("NONE");

    /* renamed from: c, reason: collision with root package name */
    public static final d7.c f16382c = new d7.c("PENDING");

    public static h0 a(int i10, int i11, sj.a aVar) {
        int i12 = (i11 & 1) != 0 ? 0 : 1;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = sj.a.f15039a;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i12 <= 0 && i10 <= 0 && aVar != sj.a.f15039a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i13 = i10 + i12;
        if (i13 < 0) {
            i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return new h0(i12, i13, aVar);
    }

    public static final r0 b(Object obj) {
        if (obj == null) {
            obj = uj.c.f17101b;
        }
        return new r0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(tj.t0 r4, m5.l r5, java.lang.Throwable r6, vi.c r7) {
        /*
            boolean r0 = r7 instanceof tj.h
            if (r0 == 0) goto L13
            r0 = r7
            tj.h r0 = (tj.h) r0
            int r1 = r0.f16371c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16371c = r1
            goto L18
        L13:
            tj.h r0 = new tj.h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16370b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16371c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f16369a
            uk.c.R(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            uk.c.R(r7)
            r0.f16369a = r6     // Catch: java.lang.Throwable -> L29
            r0.f16371c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.c(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            pi.o r4 = pi.o.f13011a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            mk.b.i(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.i0.c(tj.t0, m5.l, java.lang.Throwable, vi.c):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static e e(e eVar, int i10) {
        sj.a aVar = sj.a.f15039a;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(m6.a.d(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            aVar = sj.a.f15040b;
            i10 = 0;
        }
        boolean z2 = eVar instanceof uj.l;
        ti.i iVar = ti.i.f16336a;
        return z2 ? ((uj.l) eVar).a(iVar, i10, aVar) : new uj.g(eVar, iVar, i10, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(m5.n r4, tj.f r5, vi.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof tj.o
            if (r0 == 0) goto L13
            r0 = r6
            tj.o r0 = (tj.o) r0
            int r1 = r0.f16417c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16417c = r1
            goto L18
        L13:
            tj.o r0 = new tj.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f16416b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16417c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fj.v r4 = r0.f16415a
            uk.c.R(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            uk.c.R(r6)
            fj.v r6 = new fj.v
            r6.<init>()
            tj.c r2 = new tj.c     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.f16415a = r6     // Catch: java.lang.Throwable -> L4d
            r0.f16417c = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.c(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r5 = move-exception
            r4 = r6
        L4f:
            java.lang.Object r4 = r4.f6807a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5b
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7d
        L5b:
            ti.h r6 = r0.getContext()
            qj.w r0 = qj.w.f13632b
            ti.f r6 = r6.C(r0)
            qj.e1 r6 = (qj.e1) r6
            if (r6 == 0) goto L7e
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r6 = r6.t()
            if (r6 == 0) goto L7e
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r4 != 0) goto L81
            return r5
        L81:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L89
            mk.b.i(r4, r5)
            throw r4
        L89:
            mk.b.i(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.i0.f(m5.n, tj.f, vi.c):java.io.Serializable");
    }

    public static final Object g(e eVar, ej.e eVar2, vi.i iVar) {
        int i10 = v.f16454a;
        Object objC = e(new uj.j(new u(eVar2, null), eVar, ti.i.f16336a, -2, sj.a.f15039a), 0).c(uj.n.f17124a, iVar);
        ui.a aVar = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objC != aVar) {
            objC = oVar;
        }
        return objC == aVar ? objC : oVar;
    }

    public static final e h(e eVar) {
        return ((eVar instanceof p0) || (eVar instanceof d)) ? eVar : new d(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r2.b(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [sj.q] */
    /* JADX WARN: Type inference failed for: r8v7, types: [sj.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(tj.f r7, sj.o r8, boolean r9, vi.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof tj.g
            if (r0 == 0) goto L13
            r0 = r10
            tj.g r0 = (tj.g) r0
            int r1 = r0.f16361f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16361f = r1
            goto L18
        L13:
            tj.g r0 = new tj.g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f16360e
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16361f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f16359d
            sj.b r7 = r0.f16358c
            sj.q r8 = r0.f16357b
            tj.f r2 = r0.f16356a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f16359d
            sj.b r7 = r0.f16358c
            sj.q r8 = r0.f16357b
            tj.f r2 = r0.f16356a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            uk.c.R(r10)
            boolean r10 = r7 instanceof tj.t0
            if (r10 != 0) goto Lab
            sj.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f16356a = r7     // Catch: java.lang.Throwable -> L35
            r0.f16357b = r8     // Catch: java.lang.Throwable -> L35
            r0.f16358c = r10     // Catch: java.lang.Throwable -> L35
            r0.f16359d = r9     // Catch: java.lang.Throwable -> L35
            r0.f16361f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            goto L87
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f16356a = r2     // Catch: java.lang.Throwable -> L35
            r0.f16357b = r8     // Catch: java.lang.Throwable -> L35
            r0.f16358c = r7     // Catch: java.lang.Throwable -> L35
            r0.f16359d = r9     // Catch: java.lang.Throwable -> L35
            r0.f16361f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
        L87:
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.e(r3)
        L8d:
            pi.o r7 = pi.o.f13011a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.e(r3)
        Laa:
            throw r10
        Lab:
            tj.t0 r7 = (tj.t0) r7
            java.lang.Throwable r7 = r7.f16449a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.i0.i(tj.f, sj.o, boolean, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(tj.e r6, ej.e r7, vi.c r8) {
        /*
            d7.c r0 = uj.c.f17101b
            boolean r1 = r8 instanceof tj.y
            if (r1 == 0) goto L15
            r1 = r8
            tj.y r1 = (tj.y) r1
            int r2 = r1.f16467d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16467d = r2
            goto L1a
        L15:
            tj.y r1 = new tj.y
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.f16466c
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f16467d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            b1.g r6 = r1.f16465b
            fj.v r7 = r1.f16464a
            uk.c.R(r8)     // Catch: uj.a -> L2d
            goto L65
        L2d:
            r8 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            uk.c.R(r8)
            fj.v r8 = new fj.v
            r8.<init>()
            r8.f6807a = r0
            b1.g r3 = new b1.g
            r5 = 6
            r3.<init>(r5, r7, r8)
            r1.f16464a = r8     // Catch: uj.a -> L56
            r1.f16465b = r3     // Catch: uj.a -> L56
            r1.f16467d = r4     // Catch: uj.a -> L56
            java.lang.Object r6 = r6.c(r3, r1)     // Catch: uj.a -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r7 = r8
            goto L65
        L56:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r3
        L5a:
            java.lang.Object r2 = r8.f17095a
            if (r2 != r6) goto L72
            ti.h r6 = r1.getContext()
            qj.b0.j(r6)
        L65:
            java.lang.Object r6 = r7.f6807a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L72:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.i0.j(tj.e, ej.e, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(tj.e r6, vi.c r7) {
        /*
            d7.c r0 = uj.c.f17101b
            boolean r1 = r7 instanceof tj.x
            if (r1 == 0) goto L15
            r1 = r7
            tj.x r1 = (tj.x) r1
            int r2 = r1.f16463d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16463d = r2
            goto L1a
        L15:
            tj.x r1 = new tj.x
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f16462c
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f16463d
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            m5.r r6 = r1.f16461b
            fj.v r2 = r1.f16460a
            uk.c.R(r7)     // Catch: uj.a -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            uk.c.R(r7)
            fj.v r7 = new fj.v
            r7.<init>()
            r7.f6807a = r0
            m5.r r3 = new m5.r
            r5 = 3
            r3.<init>(r7, r5)
            r1.f16460a = r7     // Catch: uj.a -> L56
            r1.f16461b = r3     // Catch: uj.a -> L56
            r1.f16463d = r4     // Catch: uj.a -> L56
            java.lang.Object r6 = r6.c(r3, r1)     // Catch: uj.a -> L56
            if (r6 != r2) goto L54
            return r2
        L54:
            r2 = r7
            goto L65
        L56:
            r6 = move-exception
            r2 = r7
            r7 = r6
            r6 = r3
        L5a:
            java.lang.Object r3 = r7.f17095a
            if (r3 != r6) goto L72
            ti.h r6 = r1.getContext()
            qj.b0.j(r6)
        L65:
            java.lang.Object r6 = r2.f6807a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.i0.k(tj.e, vi.c):java.lang.Object");
    }

    public static final e l(e0 e0Var, ti.h hVar, int i10, sj.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == sj.a.f15039a) ? e0Var : new uj.g(e0Var, hVar, i10, aVar);
    }

    public static final d0 m(m5.n nVar, vj.d dVar, o0 o0Var, Float f10) {
        sj.g.f15073q.getClass();
        sj.f fVar = sj.f.f15071a;
        sj.a aVar = sj.a.f15039a;
        q5.b bVar = new q5.b(10, nVar, ti.i.f16336a);
        r0 r0VarB = b(f10);
        qj.b0.v(dVar, (ti.h) bVar.f13236c, o0Var.equals(l0.f16400a) ? qj.a0.f13538a : qj.a0.f13541d, new ab.q(o0Var, (e) bVar.f13235b, r0VarB, f10, null, 11));
        return new d0(r0VarB);
    }
}
