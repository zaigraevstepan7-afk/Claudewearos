package e8;

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
public abstract class i implements mf.a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5823d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5824e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final wd.a f5825f;

    /* renamed from: z, reason: collision with root package name */
    public static final Object f5826z;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5827a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f5828b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f5829c;

    static {
        wd.a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f5825f = gVar;
        if (th != null) {
            f5824e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5826z = new Object();
    }

    public static void b(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f5829c;
            if (f5825f.o(iVar, hVar, h.f5820c)) {
                while (hVar != null) {
                    Thread thread = hVar.f5821a;
                    if (thread != null) {
                        hVar.f5821a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f5822b;
                }
                do {
                    dVar = iVar.f5828b;
                } while (!f5825f.m(iVar, dVar, d.f5809d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f5812c;
                    dVar3.f5812c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f5812c;
                    Runnable runnable = dVar2.f5810a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f5818a;
                        if (iVar.f5827a == fVar) {
                            if (f5825f.n(iVar, fVar, e(fVar.f5819b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f5811b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f5824e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f5805b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f5808a);
        }
        if (obj == f5826z) {
            return null;
        }
        return obj;
    }

    public static Object e(mf.a aVar) {
        Object obj;
        if (aVar instanceof i) {
            Object obj2 = ((i) aVar).f5827a;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar2 = (a) obj2;
            return aVar2.f5804a ? aVar2.f5805b != null ? new a(false, aVar2.f5805b) : a.f5803d : obj2;
        }
        boolean zIsCancelled = aVar.isCancelled();
        boolean z2 = true;
        if ((!f5823d) && zIsCancelled) {
            return a.f5803d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = z2;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException e10) {
                if (zIsCancelled) {
                    return new a(false, e10);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
            } catch (ExecutionException e11) {
                return new c(e11.getCause());
            } catch (Throwable th3) {
                return new c(th3);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f5826z : obj;
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    @Override // mf.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f5828b;
        d dVar2 = d.f5809d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f5812c = dVar;
                if (f5825f.m(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f5828b;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5827a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            boolean r4 = r0 instanceof e8.f
            r3 = r3 | r4
            if (r3 == 0) goto L5b
            boolean r3 = e8.i.f5823d
            if (r3 == 0) goto L1f
            e8.a r3 = new e8.a
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            e8.a r3 = e8.a.f5802c
            goto L26
        L24:
            e8.a r3 = e8.a.f5803d
        L26:
            r4 = r7
            r5 = r2
        L28:
            wd.a r6 = e8.i.f5825f
            boolean r6 = r6.n(r4, r0, r3)
            if (r6 == 0) goto L54
            b(r4)
            boolean r4 = r0 instanceof e8.f
            if (r4 == 0) goto L53
            e8.f r0 = (e8.f) r0
            mf.a r0 = r0.f5819b
            boolean r4 = r0 instanceof e8.i
            if (r4 == 0) goto L50
            r4 = r0
            e8.i r4 = (e8.i) r4
            java.lang.Object r0 = r4.f5827a
            if (r0 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r2
        L49:
            boolean r6 = r0 instanceof e8.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r1
            goto L28
        L50:
            r0.cancel(r8)
        L53:
            return r1
        L54:
            java.lang.Object r0 = r4.f5827a
            boolean r6 = r0 instanceof e8.f
            if (r6 != 0) goto L28
            return r5
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        Object obj = this.f5827a;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            mf.a aVar = ((f) obj).f5819b;
            return m6.a.j(sb2, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(h hVar) {
        hVar.f5821a = null;
        while (true) {
            h hVar2 = this.f5829c;
            if (hVar2 == h.f5820c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f5822b;
                if (hVar2.f5821a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f5822b = hVar4;
                    if (hVar3.f5821a == null) {
                        break;
                    }
                } else if (!f5825f.o(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        h hVar = h.f5820c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5827a;
        if ((obj != null) && (!(obj instanceof f))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f5829c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z2 = true;
                do {
                    wd.a aVar = f5825f;
                    aVar.L(hVar3, hVar2);
                    if (aVar.o(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5827a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(hVar3);
                    } else {
                        hVar2 = this.f5829c;
                    }
                } while (hVar2 != hVar);
            }
            return d(this.f5827a);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.f5827a;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof f))) {
                return d(obj3);
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
            boolean z10 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strV2 = strV + jConvert + " " + lowerCase;
                if (z10) {
                    strV2 = m1.v(strV2, ",");
                }
                strV = m1.v(strV2, " ");
            }
            if (z10) {
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
        return this.f5827a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f5827a != null);
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f5827a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e10) {
                strF = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strF);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        h hVar = h.f5820c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5827a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar2 = this.f5829c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    wd.a aVar = f5825f;
                    aVar.L(hVar3, hVar2);
                    if (aVar.o(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5827a;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar2 = this.f5829c;
                } while (hVar2 != hVar);
            }
            return d(this.f5827a);
        }
        throw new InterruptedException();
    }
}
