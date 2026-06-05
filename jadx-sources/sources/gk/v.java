package gk;

import kk.c0;
import kk.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final kk.f f7523a = new kk.f();

    /* renamed from: b, reason: collision with root package name */
    public final kk.f f7524b = new kk.f();

    /* renamed from: c, reason: collision with root package name */
    public final long f7525c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7526d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f7528f;

    public v(x xVar, long j) {
        this.f7528f = xVar;
        this.f7525c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    @Override // kk.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A(long r11, kk.f r13) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb5
        L6:
            gk.x r2 = r10.f7528f
            monitor-enter(r2)
            gk.x r3 = r10.f7528f     // Catch: java.lang.Throwable -> L7b
            gk.w r3 = r3.f7538i     // Catch: java.lang.Throwable -> L7b
            r3.h()     // Catch: java.lang.Throwable -> L7b
            gk.x r3 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            int r4 = r3.f7539k     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L28
            java.io.IOException r3 = r3.f7540l     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L1b
            goto L29
        L1b:
            gk.b0 r3 = new gk.b0     // Catch: java.lang.Throwable -> L25
            gk.x r4 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            int r4 = r4.f7539k     // Catch: java.lang.Throwable -> L25
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r11 = move-exception
            goto Lab
        L28:
            r3 = 0
        L29:
            boolean r4 = r10.f7526d     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto La3
            kk.f r4 = r10.f7524b     // Catch: java.lang.Throwable -> L25
            long r5 = r4.f9695b     // Catch: java.lang.Throwable -> L25
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r8 = -1
            if (r7 <= 0) goto L67
            long r11 = java.lang.Math.min(r11, r5)     // Catch: java.lang.Throwable -> L25
            long r11 = r4.A(r11, r13)     // Catch: java.lang.Throwable -> L25
            gk.x r13 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            long r4 = r13.f7530a     // Catch: java.lang.Throwable -> L25
            long r4 = r4 + r11
            r13.f7530a = r4     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L8b
            gk.q r13 = r13.f7533d     // Catch: java.lang.Throwable -> L25
            f1.n0 r13 = r13.J     // Catch: java.lang.Throwable -> L25
            int r13 = r13.a()     // Catch: java.lang.Throwable -> L25
            int r13 = r13 / 2
            long r6 = (long) r13     // Catch: java.lang.Throwable -> L25
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 < 0) goto L8b
            gk.x r13 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            gk.q r4 = r13.f7533d     // Catch: java.lang.Throwable -> L25
            int r5 = r13.f7532c     // Catch: java.lang.Throwable -> L25
            long r6 = r13.f7530a     // Catch: java.lang.Throwable -> L25
            r4.F(r5, r6)     // Catch: java.lang.Throwable -> L25
            gk.x r13 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            r13.f7530a = r0     // Catch: java.lang.Throwable -> L25
            goto L8b
        L67:
            boolean r4 = r10.f7527e     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L8a
            if (r3 != 0) goto L8a
            gk.x r3 = r10.f7528f     // Catch: java.lang.Throwable -> L25
            r3.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L7d
            gk.x r3 = r10.f7528f     // Catch: java.lang.Throwable -> L7b
            gk.w r3 = r3.f7538i     // Catch: java.lang.Throwable -> L7b
            r3.k()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            goto L6
        L7b:
            r11 = move-exception
            goto Lb3
        L7d:
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L25
            r11.interrupt()     // Catch: java.lang.Throwable -> L25
            java.io.InterruptedIOException r11 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L25
            r11.<init>()     // Catch: java.lang.Throwable -> L25
            throw r11     // Catch: java.lang.Throwable -> L25
        L8a:
            r11 = r8
        L8b:
            gk.x r13 = r10.f7528f     // Catch: java.lang.Throwable -> L7b
            gk.w r13 = r13.f7538i     // Catch: java.lang.Throwable -> L7b
            r13.k()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L9f
            gk.x r13 = r10.f7528f
            gk.q r13 = r13.f7533d
            r13.t(r11)
            return r11
        L9f:
            if (r3 != 0) goto La2
            return r8
        La2:
            throw r3
        La3:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r12 = "stream closed"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L25
            throw r11     // Catch: java.lang.Throwable -> L25
        Lab:
            gk.x r12 = r10.f7528f     // Catch: java.lang.Throwable -> L7b
            gk.w r12 = r12.f7538i     // Catch: java.lang.Throwable -> L7b
            r12.k()     // Catch: java.lang.Throwable -> L7b
            throw r11     // Catch: java.lang.Throwable -> L7b
        Lb3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r11
        Lb5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r11 = t.m1.g(r11, r0)
            r13.<init>(r11)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.v.A(long, kk.f):long");
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f7528f.f7538i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f7528f) {
            this.f7526d = true;
            kk.f fVar = this.f7524b;
            j = fVar.f9695b;
            fVar.skip(j);
            this.f7528f.notifyAll();
        }
        if (j > 0) {
            this.f7528f.f7533d.t(j);
        }
        this.f7528f.a();
    }
}
