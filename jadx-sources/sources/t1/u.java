package t1;

import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f15492a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15493b;

    /* renamed from: c, reason: collision with root package name */
    public q.a0 f15494c;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f15501k;

    /* renamed from: d, reason: collision with root package name */
    public int f15495d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final q.g0 f15496e = yd.f.q();

    /* renamed from: f, reason: collision with root package name */
    public final q.g0 f15497f = new q.g0();

    /* renamed from: g, reason: collision with root package name */
    public final q.h0 f15498g = new q.h0();

    /* renamed from: h, reason: collision with root package name */
    public final g1.e f15499h = new g1.e(new f1.y[16]);

    /* renamed from: i, reason: collision with root package name */
    public final f1.h0 f15500i = new f1.h0(this, 1);

    /* renamed from: l, reason: collision with root package name */
    public final q.g0 f15502l = yd.f.q();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f15503m = new HashMap();

    public u(ej.c cVar) {
        this.f15492a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0219 A[PHI: r23
      0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[PHI: r23
      0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fd A[EDGE_INSN: B:244:0x04f6->B:246:0x04fd BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
      0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056e A[PHI: r0
      0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r23
      0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.Set r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.u.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, q.a0 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f15501k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f13028c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f13027b
            r7[r4] = r1
            int[] r3 = r3.f13028c
            r3[r4] = r2
            boolean r3 = r1 instanceof f1.y
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            f1.y r2 = (f1.y) r2
            f1.x r2 = r2.h()
            java.util.HashMap r3 = r0.f15503m
            java.lang.Object r7 = r2.f6482f
            r3.put(r1, r7)
            q.a0 r2 = r2.f6481e
            q.g0 r3 = r0.f15502l
            yd.f.a0(r3, r1)
            java.lang.Object[] r7 = r2.f13027b
            long[] r2 = r2.f13026a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            t1.a0 r9 = (t1.a0) r9
            boolean r5 = r9 instanceof t1.b0
            if (r5 == 0) goto L82
            r5 = r9
            t1.b0 r5 = (t1.b0) r5
            r5.f(r4)
        L82:
            yd.f.d(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof t1.b0
            if (r2 == 0) goto L9d
            r2 = r1
            t1.b0 r2 = (t1.b0) r2
            r2.f(r4)
        L9d:
            q.g0 r2 = r0.f15496e
            r3 = r23
            yd.f.d(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.u.b(java.lang.Object, int, java.lang.Object, q.a0):void");
    }

    public final void c(Object obj, Object obj2) {
        q.g0 g0Var = this.f15496e;
        yd.f.Z(g0Var, obj2, obj);
        if (!(obj2 instanceof f1.y) || g0Var.c(obj2)) {
            return;
        }
        yd.f.a0(this.f15502l, obj2);
        this.f15503m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.u.d():void");
    }
}
