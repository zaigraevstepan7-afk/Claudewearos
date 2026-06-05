package gk;

import com.google.android.gms.common.api.internal.i0;
import f1.n0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q implements Closeable {
    public static final ThreadPoolExecutor P;
    public final ScheduledThreadPoolExecutor A;
    public final ThreadPoolExecutor B;
    public final a0 C;
    public long I;
    public final n0 J;
    public final n0 K;
    public final Socket L;
    public final y M;
    public final p N;
    public final LinkedHashSet O;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final n f7494b;

    /* renamed from: d, reason: collision with root package name */
    public final String f7496d;

    /* renamed from: e, reason: collision with root package name */
    public int f7497e;

    /* renamed from: f, reason: collision with root package name */
    public int f7498f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7499z;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7495c = new LinkedHashMap();
    public long D = 0;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public long H = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = bk.d.f1785a;
        P = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new bk.c("OkHttp Http2Connection", true));
    }

    public q(i0 i0Var) {
        n0 n0Var = new n0(1, false);
        this.J = n0Var;
        n0 n0Var2 = new n0(1, false);
        this.K = n0Var2;
        this.O = new LinkedHashSet();
        this.C = a0.f7437a;
        boolean z2 = i0Var.f3551a;
        this.f7493a = z2;
        this.f7494b = (n) i0Var.f3556f;
        int i10 = z2 ? 1 : 2;
        this.f7498f = i10;
        if (z2) {
            this.f7498f = i10 + 2;
        }
        if (z2) {
            n0Var.h(7, 16777216);
        }
        String str = (String) i0Var.f3553c;
        this.f7496d = str;
        byte[] bArr = bk.d.f1785a;
        Locale locale = Locale.US;
        this.A = new ScheduledThreadPoolExecutor(1, new bk.c(m1.j("OkHttp ", str, " Writer"), false));
        this.B = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bk.c(m1.j("OkHttp ", str, " Push Observer"), true));
        n0Var2.h(7, 65535);
        n0Var2.h(5, 16384);
        this.I = n0Var2.a();
        this.L = (Socket) i0Var.f3552b;
        this.M = new y((kk.v) i0Var.f3555e, z2);
        this.N = new p(this, new t((kk.x) i0Var.f3554d, z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.M.f7545d);
        r6 = r2;
        r8.I -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r9, boolean r10, kk.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            gk.y r12 = r8.M
            r12.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.I     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.f7495c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L63
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            gk.y r4 = r8.M     // Catch: java.lang.Throwable -> L28
            int r4 = r4.f7545d     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.I     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.I = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            gk.y r4 = r8.M
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.q.C(int, boolean, kk.f, long):void");
    }

    public final void D(int i10, int i11) {
        try {
            this.A.execute(new h(this, new Object[]{this.f7496d, Integer.valueOf(i10)}, i10, i11));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void F(int i10, long j) {
        try {
            this.A.execute(new i(this, new Object[]{this.f7496d, Integer.valueOf(i10)}, i10, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void b(int i10, int i11, IOException iOException) throws IOException {
        x[] xVarArr;
        try {
            s(i10);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f7495c.isEmpty()) {
                    xVarArr = null;
                } else {
                    xVarArr = (x[]) this.f7495c.values().toArray(new x[this.f7495c.size()]);
                    this.f7495c.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(iOException, i11);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.M.close();
        } catch (IOException unused3) {
        }
        try {
            this.L.close();
        } catch (IOException unused4) {
        }
        this.A.shutdown();
        this.B.shutdown();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b(1, 6, null);
    }

    public final synchronized x e(int i10) {
        return (x) this.f7495c.get(Integer.valueOf(i10));
    }

    public final void flush() {
        this.M.flush();
    }

    public final synchronized int g() {
        n0 n0Var;
        n0Var = this.K;
        return (n0Var.f6400a & 16) != 0 ? n0Var.f6401b[4] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final synchronized void l(bk.a aVar) {
        if (!this.f7499z) {
            this.B.execute(aVar);
        }
    }

    public final synchronized x n(int i10) {
        x xVar;
        xVar = (x) this.f7495c.remove(Integer.valueOf(i10));
        notifyAll();
        return xVar;
    }

    public final void s(int i10) {
        synchronized (this.M) {
            synchronized (this) {
                if (this.f7499z) {
                    return;
                }
                this.f7499z = true;
                this.M.l(this.f7497e, bk.d.f1785a, i10);
            }
        }
    }

    public final synchronized void t(long j) {
        long j4 = this.H + j;
        this.H = j4;
        if (j4 >= this.J.a() / 2) {
            F(0, this.H);
            this.H = 0L;
        }
    }
}
