package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends t1.c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f6478h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public long f6479c;

    /* renamed from: d, reason: collision with root package name */
    public int f6480d;

    /* renamed from: e, reason: collision with root package name */
    public q.a0 f6481e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6482f;

    /* renamed from: g, reason: collision with root package name */
    public int f6483g;

    public x(long j) {
        super(j);
        q.a0 a0Var = q.k0.f13101a;
        fj.l.d(a0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f6481e = a0Var;
        this.f6482f = f6478h;
    }

    @Override // t1.c0
    public final void a(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        x xVar = (x) c0Var;
        this.f6481e = xVar.f6481e;
        this.f6482f = xVar.f6482f;
        this.f6483g = xVar.f6483g;
    }

    @Override // t1.c0
    public final t1.c0 b(long j) {
        return new x(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(f1.y r7, t1.g r8) {
        /*
            r6 = this;
            java.lang.Object r0 = t1.m.f15471c
            monitor-enter(r0)
            long r1 = r6.f6479c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f6480d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f6482f
            java.lang.Object r5 = f1.x.f6478h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f6483g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f6479c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f6480d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.x.c(f1.y, t1.g):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[PHI: r10
      0x00d9: PHI (r10v14 int) = (r10v13 int), (r10v15 int) binds: [B:30:0x00aa, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(f1.y r32, t1.g r33) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.x.d(f1.y, t1.g):int");
    }
}
