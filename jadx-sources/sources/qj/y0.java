package qj;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y0 extends x0 implements g0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13642c;

    public y0(Executor executor) {
        Method method;
        this.f13642c = executor;
        Method method2 = vj.a.f18082a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = vj.a.f18082a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // qj.g0
    public final void Q(long j, l lVar) {
        Executor executor = this.f13642c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            a8.e eVar = new a8.e(22, this, lVar, false);
            ti.h hVar = lVar.f13597e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(eVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                b0.g(hVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.t(new i(scheduledFutureSchedule, 0));
        } else {
            c0.C.Q(j, lVar);
        }
    }

    @Override // qj.g0
    public final o0 Z(long j, z1 z1Var, ti.h hVar) {
        Executor executor = this.f13642c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(z1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                b0.g(hVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new n0(scheduledFutureSchedule) : c0.C.Z(j, z1Var, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f13642c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        try {
            this.f13642c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            b0.g(hVar, cancellationException);
            xj.e eVar = m0.f13601a;
            xj.d.f20094c.e0(hVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f13642c == this.f13642c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13642c);
    }

    @Override // qj.v
    public final String toString() {
        return this.f13642c.toString();
    }
}
