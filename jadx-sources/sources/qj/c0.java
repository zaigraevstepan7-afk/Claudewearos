package qj;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c0 extends v0 implements Runnable {
    public static final c0 C;
    public static final long D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        c0 c0Var = new c0();
        C = c0Var;
        c0Var.l0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        D = timeUnit.toNanos(l10.longValue());
    }

    @Override // qj.v0, qj.g0
    public final o0 Z(long j, z1 z1Var, ti.h hVar) {
        long j4 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j4 >= 4611686018427387903L) {
            return p1.f13611a;
        }
        long jNanoTime = System.nanoTime();
        s0 s0Var = new s0(j4 + jNanoTime, z1Var);
        t0(jNanoTime, s0Var);
        return s0Var;
    }

    @Override // qj.w0
    public final Thread k0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(C.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // qj.w0
    public final void o0(long j, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // qj.v0
    public final void p0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.p0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zS0;
        v1.f13630a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (zS0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM0 = m0();
                    if (jM0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = D + jNanoTime;
                        }
                        long j4 = j - jNanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            u0();
                            if (s0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        if (jM0 > j4) {
                            jM0 = j4;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            u0();
                            if (s0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        LockSupport.parkNanos(this, jM0);
                    }
                }
            }
        } finally {
            _thread = null;
            u0();
            if (!s0()) {
                k0();
            }
        }
    }

    @Override // qj.v0, qj.w0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // qj.v
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void u0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            v0.f13629z.set(this, null);
            v0.A.set(this, null);
            notifyAll();
        }
    }
}
