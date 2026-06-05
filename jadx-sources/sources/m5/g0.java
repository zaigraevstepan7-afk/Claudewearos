package m5;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f11298a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f11299b;

    /* renamed from: c, reason: collision with root package name */
    public final a7.e f11300c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11301d;

    /* renamed from: e, reason: collision with root package name */
    public final yj.c f11302e;

    public g0(File file, o0 o0Var, a7.e eVar) {
        fj.l.f(o0Var, "coordinator");
        this.f11298a = file;
        this.f11299b = o0Var;
        this.f11300c = eVar;
        this.f11301d = new AtomicBoolean(false);
        this.f11302e = new yj.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:33:0x0071, B:42:0x0081, B:41:0x007e, B:38:0x0079), top: B:52:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [m5.l] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(m5.l r9, vi.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof m5.e0
            if (r0 == 0) goto L13
            r0 = r10
            m5.e0 r0 = (m5.e0) r0
            int r1 = r0.f11286e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11286e = r1
            goto L18
        L13:
            m5.e0 r0 = new m5.e0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11284c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11286e
            yj.c r3 = r8.f11302e
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f11282a
            m5.c0 r0 = r0.f11283b
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L2e
            goto L63
        L2e:
            r10 = move-exception
            goto L79
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            uk.c.R(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f11301d
            boolean r10 = r10.get()
            if (r10 != 0) goto L8c
            boolean r10 = r3.g()
            m5.c0 r2 = new m5.c0     // Catch: java.lang.Throwable -> L82
            java.io.File r6 = r8.f11298a     // Catch: java.lang.Throwable -> L82
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L74
            r0.f11283b = r2     // Catch: java.lang.Throwable -> L74
            r0.f11282a = r10     // Catch: java.lang.Throwable -> L74
            r0.f11286e = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r9 = r9.c(r2, r6, r0)     // Catch: java.lang.Throwable -> L74
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
        L63:
            r0.close()     // Catch: java.lang.Throwable -> L68
            r0 = r5
            goto L69
        L68:
            r0 = move-exception
        L69:
            if (r0 != 0) goto L71
            if (r9 == 0) goto L70
            r3.e(r5)
        L70:
            return r10
        L71:
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r10 = move-exception
            goto L86
        L74:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
        L79:
            r0.close()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r0 = move-exception
            mk.b.i(r10, r0)     // Catch: java.lang.Throwable -> L72
        L81:
            throw r10     // Catch: java.lang.Throwable -> L72
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            if (r9 == 0) goto L8b
            r3.e(r5)
        L8b:
            throw r10
        L8c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.g0.a(m5.l, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: all -> 0x010c, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x010c, blocks: (B:42:0x00ce, B:45:0x00d5, B:51:0x00ed, B:52:0x010b, B:59:0x0118, B:66:0x0126, B:65:0x0123), top: B:92:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118 A[Catch: all -> 0x010c, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x010c, blocks: (B:42:0x00ce, B:45:0x00d5, B:51:0x00ed, B:52:0x010b, B:59:0x0118, B:66:0x0126, B:65:0x0123), top: B:92:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [yj.a] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(m5.y r11, vi.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.g0.b(m5.y, vi.c):java.lang.Object");
    }

    @Override // m5.a
    public final void close() {
        this.f11301d.set(true);
        this.f11300c.a();
    }
}
