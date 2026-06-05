package xj;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import qj.b0;
import vj.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final d7.c D = new d7.c("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f20087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20088b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20089c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f20090d;

    /* renamed from: e, reason: collision with root package name */
    public final f f20091e;

    /* renamed from: f, reason: collision with root package name */
    public final f f20092f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: z, reason: collision with root package name */
    public final p f20093z;

    public c(int i10, int i11, long j, String str) {
        this.f20087a = i10;
        this.f20088b = i11;
        this.f20089c = j;
        this.f20090d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(m6.a.e(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(gk.b.l(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(m6.a.e(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f20091e = new f();
        this.f20092f = new f();
        this.f20093z = new p((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
    }

    public static /* synthetic */ void g(c cVar, Runnable runnable, int i10) {
        cVar.e(runnable, false, (i10 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f20093z) {
            try {
                if (C.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = B;
                long j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j & 2097151);
                int i11 = i10 - ((int) ((j & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f20087a) {
                    return 0;
                }
                if (i10 >= this.f20088b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f20093z.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f20093z.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xj.c.C
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof xj.a
            r3 = 0
            if (r1 == 0) goto L17
            xj.a r0 = (xj.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            xj.c r1 = r0.A
            boolean r1 = fj.l.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            vj.p r1 = r8.f20093z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = xj.c.B     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            vj.p r5 = r8.f20093z
            java.lang.Object r5 = r5.b(r1)
            fj.l.c(r5)
            xj.a r5 = (xj.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            xj.m r5 = r5.f20074a
            xj.f r6 = r8.f20092f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = xj.m.f20109b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            xj.i r7 = (xj.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            xj.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            xj.f r1 = r8.f20092f
            r1.b()
            xj.f r1 = r8.f20091e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            xj.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            xj.f r1 = r8.f20091e
            java.lang.Object r1 = r1.d()
            xj.i r1 = (xj.i) r1
            if (r1 != 0) goto Lb2
            xj.f r1 = r8.f20092f
            java.lang.Object r1 = r1.d()
            xj.i r1 = (xj.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            xj.b r1 = xj.b.f20085e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xj.c.A
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xj.c.B
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.c.close():void");
    }

    public final void e(Runnable runnable, boolean z2, boolean z10) {
        i jVar;
        b bVar;
        k.f20107f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f20099a = jNanoTime;
            jVar.f20100b = z2;
        } else {
            jVar = new j(runnable, jNanoTime, z2);
        }
        boolean z11 = jVar.f20100b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !fj.l.b(aVar.A, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f20076c) != b.f20085e && (jVar.f20100b || bVar != b.f20082b)) {
            aVar.f20080z = true;
            m mVar = aVar.f20074a;
            if (z10) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f20109b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f20100b ? this.f20092f.a(jVar) : this.f20091e.a(jVar))) {
                throw new RejectedExecutionException(m6.a.j(new StringBuilder(), this.f20090d, " was terminated"));
            }
        }
        if (z11) {
            if (s() || n(jAddAndGet)) {
                return;
            }
            s();
            return;
        }
        if (s() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        s();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void l(a aVar, int i10, int i11) {
        while (true) {
            long j = A.get(this);
            int i12 = (int) (2097151 & j);
            long j4 = (2097152 + j) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == D) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (A.compareAndSet(this, j, i12 | j4)) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j) {
        int i10 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f20087a;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        d7.c cVar;
        int iB;
        while (true) {
            long j = A.get(this);
            a aVar = (a) this.f20093z.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    cVar = D;
                    if (objC == cVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (A.compareAndSet(this, j, iB | j4)) {
                        aVar.g(cVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.B.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f20093z;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f20074a;
                mVar.getClass();
                int i16 = m.f20109b.get(mVar) != null ? (m.f20110c.get(mVar) - m.f20111d.get(mVar)) + 1 : m.f20110c.get(mVar) - m.f20111d.get(mVar);
                int iOrdinal = aVar.f20076c.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new b3.e();
                    }
                    i14++;
                }
            }
        }
        long j = B.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f20090d);
        sb5.append('@');
        sb5.append(b0.n(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f20087a;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.f20088b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f20091e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f20092f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
