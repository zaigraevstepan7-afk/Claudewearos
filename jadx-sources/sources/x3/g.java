package x3;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g implements mf.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f19820d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f19821e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final u2.b f19822f;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f19823z;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f19824a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f19825b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f19826c;

    static {
        u2.b eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        f19822f = eVar;
        if (th != null) {
            f19821e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f19823z = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f19826c;
        } while (!f19822f.d(gVar, fVar, f.f19817c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f19818a;
            if (thread != null) {
                fVar.f19818a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f19819b;
        }
        gVar.b();
        do {
            cVar2 = gVar.f19825b;
        } while (!f19822f.b(gVar, cVar2, c.f19808d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f19811c;
            cVar.f19811c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f19811c;
            f(cVar3.f19809a, cVar3.f19810b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f19821e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object i(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f19806b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f19807a);
        }
        if (obj == f19823z) {
            return null;
        }
        return obj;
    }

    public static Object o(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objO = o(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objO == this ? "this future" : String.valueOf(objO));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // mf.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f19825b;
        c cVar2 = c.f19808d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f19811c = cVar;
                if (f19822f.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f19825b;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f19824a;
        if (obj == null) {
            if (f19822f.c(this, obj, f19820d ? new a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? a.f19803c : a.f19804d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f19817c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f19824a;
        if (obj != null) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f19826c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    u2.b bVar = f19822f;
                    bVar.n(fVar3, fVar2);
                    if (bVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                r(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f19824a;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(fVar3);
                    } else {
                        fVar2 = this.f19826c;
                    }
                } while (fVar2 != fVar);
            }
            return i(this.f19824a);
        }
        while (nanos > 0) {
            Object obj3 = this.f19824a;
            if (obj3 != null) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbL = m1.l("Waited ", " ", j);
        sbL.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbL.toString();
        if (nanos + 1000 < 0) {
            String strV = m1.v(string3, " (plus ");
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strV2 = strV + jConvert + " " + lowerCase;
                if (z2) {
                    strV2 = m1.v(strV2, ",");
                }
                strV = m1.v(strV2, " ");
            }
            if (z2) {
                strV = strV + nanos2 + " nanoseconds ";
            }
            string3 = m1.v(strV, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(m1.v(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(m1.w(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19824a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19824a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String p() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void r(f fVar) {
        fVar.f19818a = null;
        while (true) {
            f fVar2 = this.f19826c;
            if (fVar2 == f.f19817c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f19819b;
                if (fVar2.f19818a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f19819b = fVar4;
                    if (fVar3.f19818a == null) {
                        break;
                    }
                } else if (!f19822f.d(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strP;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f19824a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strP = p();
            } catch (RuntimeException e10) {
                strP = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strP != null && !strP.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strP);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean w(Object obj) {
        if (obj == null) {
            obj = f19823z;
        }
        if (!f19822f.c(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean x(Throwable th2) {
        th2.getClass();
        if (!f19822f.c(this, null, new b(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f19817c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19824a;
            if (obj2 != null) {
                return i(obj2);
            }
            f fVar2 = this.f19826c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    u2.b bVar = f19822f;
                    bVar.n(fVar3, fVar2);
                    if (bVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19824a;
                            } else {
                                r(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return i(obj);
                    }
                    fVar2 = this.f19826c;
                } while (fVar2 != fVar);
            }
            return i(this.f19824a);
        }
        throw new InterruptedException();
    }
}
