package kk;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f9728a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9729b;

    /* renamed from: c, reason: collision with root package name */
    public y f9730c;

    /* renamed from: d, reason: collision with root package name */
    public int f9731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9732e;

    /* renamed from: f, reason: collision with root package name */
    public long f9733f;

    public u(h hVar) {
        this.f9728a = hVar;
        f fVarQ = hVar.q();
        this.f9729b = fVarQ;
        y yVar = fVarQ.f9694a;
        this.f9730c = yVar;
        this.f9731d = yVar != null ? yVar.f9742b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f9742b) goto L15;
     */
    @Override // kk.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A(long r9, kk.f r11) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            fj.l.f(r11, r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f9732e
            if (r3 != 0) goto L63
            kk.y r3 = r8.f9730c
            kk.f r4 = r8.f9729b
            if (r3 == 0) goto L2b
            kk.y r5 = r4.f9694a
            if (r3 != r5) goto L23
            int r3 = r8.f9731d
            fj.l.c(r5)
            int r5 = r5.f9742b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f9733f
            r2 = 1
            long r0 = r0 + r2
            kk.h r2 = r8.f9728a
            boolean r0 = r2.N(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            kk.y r0 = r8.f9730c
            if (r0 != 0) goto L4c
            kk.y r0 = r4.f9694a
            if (r0 == 0) goto L4c
            r8.f9730c = r0
            int r0 = r0.f9742b
            r8.f9731d = r0
        L4c:
            long r0 = r4.f9695b
            long r2 = r8.f9733f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            kk.f r2 = r8.f9729b
            long r4 = r8.f9733f
            r3 = r11
            r2.b(r3, r4, r6)
            long r9 = r8.f9733f
            long r9 = r9 + r6
            r8.f9733f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r9 = t.m1.g(r9, r11)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.u.A(long, kk.f):long");
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f9728a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9732e = true;
    }
}
