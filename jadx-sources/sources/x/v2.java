package x;

import c1.t6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f19742a = new o0(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p2.o0 r5, boolean r6, p2.o r7, vi.a r8) {
        /*
            boolean r0 = r8 instanceof x.m2
            if (r0 == 0) goto L13
            r0 = r8
            x.m2 r0 = (x.m2) r0
            int r1 = r0.f19636e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19636e = r1
            goto L18
        L13:
            x.m2 r0 = new x.m2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19635d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19636e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.f19634c
            p2.o r6 = r0.f19633b
            p2.o0 r7 = r0.f19632a
            uk.c.R(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            uk.c.R(r8)
        L3c:
            r0.f19632a = r5
            r0.f19633b = r7
            r0.f19634c = r6
            r0.f19636e = r3
            java.lang.Object r8 = r5.l(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            p2.n r8 = (p2.n) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3c
            java.lang.Object r5 = r8.f12734a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v2.a(p2.o0, boolean, p2.o, vi.a):java.lang.Object");
    }

    public static /* synthetic */ Object b(p2.o0 o0Var, vi.a aVar, int i10) {
        p2.o oVar = p2.o.f12743a;
        boolean z2 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            oVar = p2.o.f12744b;
        }
        return a(o0Var, z2, oVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(p2.o0 r8, vi.c r9) {
        /*
            boolean r0 = r9 instanceof x.n2
            if (r0 == 0) goto L13
            r0 = r9
            x.n2 r0 = (x.n2) r0
            int r1 = r0.f19658c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19658c = r1
            goto L18
        L13:
            x.n2 r0 = new x.n2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19657b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19658c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p2.o0 r8 = r0.f19656a
            uk.c.R(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            uk.c.R(r9)
        L34:
            r0.f19656a = r8
            r0.f19658c = r3
            p2.o r9 = p2.o.f12744b
            java.lang.Object r9 = r8.l(r9, r0)
            if (r9 != r1) goto L41
            return r1
        L41:
            p2.n r9 = (p2.n) r9
            java.lang.Object r2 = r9.f12734a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            p2.w r7 = (p2.w) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.lang.Object r9 = r9.f12734a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            p2.w r4 = (p2.w) r4
            boolean r4 = r4.f12763d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v2.c(p2.o0, vi.c):java.lang.Object");
    }

    public static Object d(p2.a0 a0Var, ej.c cVar, t6 t6Var, ej.c cVar2, ti.c cVar3, int i10) {
        ej.c cVar4 = (i10 & 2) != 0 ? null : cVar;
        ej.f fVar = t6Var;
        if ((i10 & 4) != 0) {
            fVar = f19742a;
        }
        Object objH = qj.b0.h(new androidx.lifecycle.j0(a0Var, (ej.c) null, cVar4, fVar, (i10 & 8) != 0 ? null : cVar2, (ti.c) null), cVar3);
        return objH == ui.a.f17085a ? objH : pi.o.f13011a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean e(p2.n nVar, boolean z2) {
        ?? r42 = nVar.f12734a;
        int size = r42.size();
        for (int i10 = 0; i10 < size; i10++) {
            p2.w wVar = (p2.w) r42.get(i10);
            if (!(z2 ? p2.v.a(wVar) : p2.v.b(wVar))) {
                return false;
            }
        }
        return true;
    }

    public static qj.s1 f(qj.z zVar, qj.e1 e1Var, ej.e eVar) {
        qj.a0 a0Var = qj.a0.f13538a;
        return qj.b0.w(zVar, null, new w6.z(e1Var, eVar, (ti.c) null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ae  */
    /* JADX WARN: Type inference failed for: r15v0, types: [ti.c] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v16, types: [ej.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v4, types: [ej.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, ti.c, ti.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(p2.o0 r21, qj.z r22, x.r1 r23, ej.c r24, ej.c r25, ej.f r26, ej.c r27, vi.a r28) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v2.g(p2.o0, qj.z, x.r1, ej.c, ej.c, ej.f, ej.c, vi.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(p2.o0 r7, p2.o r8, vi.c r9) {
        /*
            boolean r0 = r9 instanceof x.t2
            if (r0 == 0) goto L13
            r0 = r9
            x.t2 r0 = (x.t2) r0
            int r1 = r0.f19728c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19728c = r1
            goto L18
        L13:
            x.t2 r0 = new x.t2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19727b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19728c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fj.v r7 = r0.f19726a
            uk.c.R(r9)     // Catch: p2.p -> L5a
            goto L57
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            uk.c.R(r9)
            fj.v r9 = new fj.v
            r9.<init>()
            x.b1 r2 = x.b1.f19454a
            r9.f6807a = r2
            w2.h2 r2 = r7.C()     // Catch: p2.p -> L5a
            long r4 = r2.b()     // Catch: p2.p -> L5a
            k0.x0 r2 = new k0.x0     // Catch: p2.p -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: p2.p -> L5a
            r0.f19726a = r9     // Catch: p2.p -> L5a
            r0.f19728c = r3     // Catch: p2.p -> L5a
            java.lang.Object r7 = r7.D(r4, r2, r0)     // Catch: p2.p -> L5a
            if (r7 != r1) goto L56
            return r1
        L56:
            r7 = r9
        L57:
            java.lang.Object r7 = r7.f6807a
            return r7
        L5a:
            x.d1 r7 = x.d1.f19487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v2.h(p2.o0, p2.o, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(p2.o0 r13, p2.o r14, vi.a r15) {
        /*
            boolean r0 = r15 instanceof x.u2
            if (r0 == 0) goto L13
            r0 = r15
            x.u2 r0 = (x.u2) r0
            int r1 = r0.f19738d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19738d = r1
            goto L18
        L13:
            x.u2 r0 = new x.u2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f19737c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19738d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            p2.o r13 = r0.f19736b
            p2.o0 r14 = r0.f19735a
            uk.c.R(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            p2.o r13 = r0.f19736b
            p2.o0 r14 = r0.f19735a
            uk.c.R(r15)
            goto L56
        L43:
            uk.c.R(r15)
        L46:
            r0.f19735a = r13
            r0.f19736b = r14
            r0.f19738d = r5
            java.lang.Object r15 = r13.l(r14, r0)
            if (r15 != r1) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            p2.n r15 = (p2.n) r15
            java.lang.Object r15 = r15.f12734a
            int r2 = r15.size()
            r6 = r4
        L5f:
            if (r6 >= r2) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            p2.w r7 = (p2.w) r7
            boolean r7 = p2.v.c(r7)
            if (r7 != 0) goto Lbd
            int r2 = r15.size()
            r6 = r4
        L72:
            if (r6 >= r2) goto L92
            java.lang.Object r7 = r15.get(r6)
            p2.w r7 = (p2.w) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb8
            p2.p0 r8 = r14.f12752f
            long r8 = r8.Q
            long r10 = r14.A()
            boolean r7 = p2.v.f(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            p2.o r15 = p2.o.f12745c
            r0.f19735a = r14
            r0.f19736b = r13
            r0.f19738d = r3
            java.lang.Object r15 = r14.l(r15, r0)
            if (r15 != r1) goto L2e
        La0:
            return r1
        La1:
            p2.n r15 = (p2.n) r15
            java.lang.Object r15 = r15.f12734a
            int r2 = r15.size()
            r6 = r4
        Laa:
            if (r6 >= r2) goto L46
            java.lang.Object r7 = r15.get(r6)
            p2.w r7 = (p2.w) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v2.i(p2.o0, p2.o, vi.a):java.lang.Object");
    }
}
