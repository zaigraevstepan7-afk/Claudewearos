package gk;

import kk.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements kk.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk.f f7519a = new kk.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f7522d;

    public u(x xVar) {
        this.f7522d = xVar;
    }

    @Override // kk.b0
    public final void Y(long j, kk.f fVar) {
        kk.f fVar2 = this.f7519a;
        fVar2.Y(j, fVar);
        while (fVar2.f9695b >= 16384) {
            b(false);
        }
    }

    @Override // kk.b0
    public final e0 a() {
        return this.f7522d.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r13) {
        /*
            r12 = this;
            gk.x r1 = r12.f7522d
            monitor-enter(r1)
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L84
            gk.w r0 = r0.j     // Catch: java.lang.Throwable -> L84
            r0.h()     // Catch: java.lang.Throwable -> L84
        La:
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L31
            long r2 = r0.f7531b     // Catch: java.lang.Throwable -> L31
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L34
            boolean r2 = r12.f7521c     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L34
            boolean r2 = r12.f7520b     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L34
            int r2 = r0.f7539k     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L34
            r0.wait()     // Catch: java.lang.InterruptedException -> L24 java.lang.Throwable -> L31
            goto La
        L24:
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L31
            r13.interrupt()     // Catch: java.lang.Throwable -> L31
            java.io.InterruptedIOException r13 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L31
            r13.<init>()     // Catch: java.lang.Throwable -> L31
            throw r13     // Catch: java.lang.Throwable -> L31
        L31:
            r0 = move-exception
            r13 = r0
            goto L87
        L34:
            gk.w r0 = r0.j     // Catch: java.lang.Throwable -> L84
            r0.k()     // Catch: java.lang.Throwable -> L84
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L84
            r0.b()     // Catch: java.lang.Throwable -> L84
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L84
            long r2 = r0.f7531b     // Catch: java.lang.Throwable -> L84
            kk.f r0 = r12.f7519a     // Catch: java.lang.Throwable -> L84
            long r4 = r0.f9695b     // Catch: java.lang.Throwable -> L84
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L84
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L84
            long r2 = r0.f7531b     // Catch: java.lang.Throwable -> L84
            long r2 = r2 - r10
            r0.f7531b = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            gk.w r0 = r0.j
            r0.h()
            if (r13 == 0) goto L67
            kk.f r13 = r12.f7519a     // Catch: java.lang.Throwable -> L64
            long r0 = r13.f9695b     // Catch: java.lang.Throwable -> L64
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 != 0) goto L67
            r13 = 1
        L62:
            r8 = r13
            goto L69
        L64:
            r0 = move-exception
            r13 = r0
            goto L7c
        L67:
            r13 = 0
            goto L62
        L69:
            gk.x r13 = r12.f7522d     // Catch: java.lang.Throwable -> L64
            gk.q r6 = r13.f7533d     // Catch: java.lang.Throwable -> L64
            int r7 = r13.f7532c     // Catch: java.lang.Throwable -> L64
            kk.f r9 = r12.f7519a     // Catch: java.lang.Throwable -> L64
            r6.C(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L64
            gk.x r13 = r12.f7522d
            gk.w r13 = r13.j
            r13.k()
            return
        L7c:
            gk.x r0 = r12.f7522d
            gk.w r0 = r0.j
            r0.k()
            throw r13
        L84:
            r0 = move-exception
            r13 = r0
            goto L8f
        L87:
            gk.x r0 = r12.f7522d     // Catch: java.lang.Throwable -> L84
            gk.w r0 = r0.j     // Catch: java.lang.Throwable -> L84
            r0.k()     // Catch: java.lang.Throwable -> L84
            throw r13     // Catch: java.lang.Throwable -> L84
        L8f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L84
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.u.b(boolean):void");
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7522d) {
            try {
                if (this.f7520b) {
                    return;
                }
                x xVar = this.f7522d;
                if (!xVar.f7537h.f7521c) {
                    if (this.f7519a.f9695b > 0) {
                        while (this.f7519a.f9695b > 0) {
                            b(true);
                        }
                    } else {
                        xVar.f7533d.C(xVar.f7532c, true, null, 0L);
                    }
                }
                synchronized (this.f7522d) {
                    this.f7520b = true;
                }
                this.f7522d.f7533d.flush();
                this.f7522d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kk.b0, java.io.Flushable
    public final void flush() {
        synchronized (this.f7522d) {
            this.f7522d.b();
        }
        while (this.f7519a.f9695b > 0) {
            b(false);
            this.f7522d.f7533d.flush();
        }
    }
}
