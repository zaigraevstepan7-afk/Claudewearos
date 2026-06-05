package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r f18800a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18801b;

    /* renamed from: c, reason: collision with root package name */
    public final lh.e f18802c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f18803d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f18804e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18805f;

    /* renamed from: z, reason: collision with root package name */
    public final int f18806z;

    public e(qh.c cVar) {
        this.f18802c = new lh.e();
        this.f18803d = new ThreadLocal();
        oj.f fVar = oj.a.f12531b;
        this.f18805f = yd.f.j0(30, oj.c.f12539e);
        this.f18806z = 2;
        r rVar = new r(1, new q0.k(cVar, 18));
        this.f18800a = rVar;
        this.f18801b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:59:0x0115, B:61:0x0134, B:76:0x0195, B:77:0x019c), top: B:97:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195 A[Catch: all -> 0x0190, TRY_ENTER, TryCatch #0 {all -> 0x0190, blocks: (B:59:0x0115, B:61:0x0134, B:76:0x0195, B:77:0x019c), top: B:97:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // w6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(ej.e r17, vi.c r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.e.J(ej.e, vi.c):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f18804e) {
            return;
        }
        this.f18804e = true;
        this.f18800a.c();
        this.f18801b.c();
    }

    public e(final qh.c cVar, final String str, int i10) {
        fj.l.f(str, "fileName");
        this.f18802c = new lh.e();
        this.f18803d = new ThreadLocal();
        oj.f fVar = oj.a.f12531b;
        this.f18805f = yd.f.j0(30, oj.c.f12539e);
        this.f18806z = 2;
        if (i10 > 0) {
            final int i11 = 0;
            this.f18800a = new r(i10, new ej.a() { // from class: w6.c
                @Override // ej.a
                public final Object a() throws Exception {
                    switch (i11) {
                        case 0:
                            e7.a aVarF = cVar.f(str);
                            uk.c.y(aVarF, "PRAGMA query_only = 1");
                            return aVarF;
                        default:
                            return cVar.f(str);
                    }
                }
            });
            final int i12 = 1;
            this.f18801b = new r(1, new ej.a() { // from class: w6.c
                @Override // ej.a
                public final Object a() throws Exception {
                    switch (i12) {
                        case 0:
                            e7.a aVarF = cVar.f(str);
                            uk.c.y(aVarF, "PRAGMA query_only = 1");
                            return aVarF;
                        default:
                            return cVar.f(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
