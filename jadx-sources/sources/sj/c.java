package sj;

import fj.y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.b0;
import qj.e2;
import qj.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f15052a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15046b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15047c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15048d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15049e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15050f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15051z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i10) {
        this.f15052a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.f15053a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f15048d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (w()) {
            kVar2 = e.f15053a;
            fj.l.d(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f15070s;
    }

    public static boolean B(Object obj) {
        if (!(obj instanceof qj.k)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        qj.k kVar = (qj.k) obj;
        k kVar2 = e.f15053a;
        d7.c cVarF = kVar.f(pi.o.f13011a, null);
        if (cVarF == null) {
            return false;
        }
        kVar.z(cVarF);
        return true;
    }

    public static final k b(c cVar, long j, k kVar) {
        Object objB;
        c cVar2;
        k kVar2 = e.f15053a;
        d dVar = d.A;
        loop0: while (true) {
            objB = vj.b.b(kVar, j, dVar);
            if (!vj.b.e(objB)) {
                vj.r rVarC = vj.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15050f;
                    vj.r rVar = (vj.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f18121c >= rVarC.f18121c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = vj.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15047c;
        if (zE) {
            cVar.u();
            if (kVar.f18121c * e.f15054b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) vj.b.c(objB);
            long j4 = kVar3.f18121c;
            if (j4 <= j) {
                return kVar3;
            }
            long j10 = e.f15054b * j4;
            while (true) {
                long j11 = f15046b.get(cVar);
                long j12 = 1152921504606846975L & j11;
                if (j12 >= j10) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f15046b.compareAndSet(cVar2, j11, (((int) (j11 >> 60)) << 60) + j12)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j4 * e.f15054b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.b();
            }
        }
        return null;
    }

    public static final void f(c cVar, Object obj, qj.l lVar) {
        lVar.resumeWith(uk.c.r(cVar.q()));
    }

    public static final int g(c cVar, k kVar, int i10, Object obj, long j, Object obj2, boolean z2) {
        kVar.n(i10, obj);
        if (z2) {
            return cVar.D(kVar, i10, obj, j, obj2, z2);
        }
        Object objL = kVar.l(i10);
        if (objL == null) {
            if (cVar.i(j)) {
                if (kVar.k(i10, null, e.f15056d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof e2) {
            kVar.n(i10, null);
            if (cVar.A(objL, obj)) {
                kVar.o(i10, e.f15061i);
                return 0;
            }
            d7.c cVar2 = e.f15062k;
            if (kVar.f15078f.getAndSet((i10 * 2) + 1, cVar2) == cVar2) {
                return 5;
            }
            kVar.m(i10, true);
            return 5;
        }
        return cVar.D(kVar, i10, obj, j, obj2, z2);
    }

    public static void s(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15049e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A(Object obj, Object obj2) throws i0 {
        if (!(obj instanceof b)) {
            if (!(obj instanceof qj.k)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            qj.k kVar = (qj.k) obj;
            k kVar2 = e.f15053a;
            d7.c cVarF = kVar.f(obj2, null);
            if (cVarF == null) {
                return false;
            }
            kVar.z(cVarF);
            return true;
        }
        b bVar = (b) obj;
        qj.l lVar = bVar.f15044b;
        fj.l.c(lVar);
        bVar.f15044b = null;
        bVar.f15043a = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.f15045c.getClass();
        k kVar3 = e.f15053a;
        d7.c cVarF2 = lVar.f(bool, null);
        if (cVarF2 == null) {
            return false;
        }
        lVar.z(cVarF2);
        return true;
    }

    public final Object C(k kVar, int i10, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f15078f;
        Object objL = kVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15046b;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f15065n;
                }
                if (kVar.k(i10, objL, obj)) {
                    m();
                    return e.f15064m;
                }
            }
        } else if (objL == e.f15056d && kVar.k(i10, objL, e.f15061i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            kVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = kVar.l(i10);
            if (objL2 == null || objL2 == e.f15057e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(i10, objL2, e.f15060h)) {
                        m();
                        return e.f15066o;
                    }
                } else {
                    if (obj == null) {
                        return e.f15065n;
                    }
                    if (kVar.k(i10, objL2, obj)) {
                        m();
                        return e.f15064m;
                    }
                }
            } else if (objL2 != e.f15056d) {
                d7.c cVar = e.j;
                if (objL2 == cVar) {
                    return e.f15066o;
                }
                if (objL2 == e.f15060h) {
                    return e.f15066o;
                }
                if (objL2 == e.f15063l) {
                    m();
                    return e.f15066o;
                }
                if (objL2 != e.f15059g && kVar.k(i10, objL2, e.f15058f)) {
                    boolean z2 = objL2 instanceof s;
                    if (z2) {
                        objL2 = ((s) objL2).f15080a;
                    }
                    if (B(objL2)) {
                        kVar.o(i10, e.f15061i);
                        m();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        kVar.n(i10, null);
                        return obj3;
                    }
                    kVar.o(i10, cVar);
                    kVar.i();
                    if (z2) {
                        m();
                    }
                    return e.f15066o;
                }
            } else if (kVar.k(i10, objL2, e.f15061i)) {
                m();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                kVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int D(k kVar, int i10, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objL = kVar.l(i10);
            if (objL == null) {
                if (!i(j) || z2) {
                    if (z2) {
                        if (kVar.k(i10, null, e.j)) {
                            kVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.k(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(i10, null, e.f15056d)) {
                    break;
                }
            } else {
                if (objL != e.f15057e) {
                    d7.c cVar = e.f15062k;
                    if (objL == cVar) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (objL == e.f15060h) {
                        kVar.n(i10, null);
                        return 5;
                    }
                    if (objL == e.f15063l) {
                        kVar.n(i10, null);
                        u();
                        return 4;
                    }
                    kVar.n(i10, null);
                    if (objL instanceof s) {
                        objL = ((s) objL).f15080a;
                    }
                    if (A(objL, obj)) {
                        kVar.o(i10, e.f15061i);
                        return 0;
                    }
                    if (kVar.f15078f.getAndSet((i10 * 2) + 1, cVar) != cVar) {
                        kVar.m(i10, true);
                    }
                    return 5;
                }
                if (kVar.k(i10, objL, e.f15056d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void E(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f15048d;
            if (atomicLongFieldUpdater.get(cVar) > j) {
                break;
            } else {
                cVar = this;
            }
        }
        int i10 = e.f15055c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15049e;
            if (i11 < i10) {
                long j4 = atomicLongFieldUpdater.get(cVar);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j4 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(cVar);
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    long j13 = j12 & 4611686018427387903L;
                    boolean z2 = (j12 & 4611686018427387904L) != 0;
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z2) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j12, 4611686018427387904L + j13);
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j14, j14 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // sj.q
    public final Object a() {
        k kVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15047c;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15046b;
        long j4 = atomicLongFieldUpdater2.get(this);
        if (t(j4, true)) {
            return new h(o());
        }
        long j10 = j4 & 1152921504606846975L;
        i iVar = j.f15075b;
        if (j >= j10) {
            return iVar;
        }
        Object obj = e.f15062k;
        k kVar2 = (k) f15051z.get(this);
        while (!t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = e.f15054b;
            long j12 = andIncrement / j11;
            int i10 = (int) (andIncrement % j11);
            if (kVar2.f18121c != j12) {
                k kVarN = n(j12, kVar2);
                if (kVarN == null) {
                    continue;
                } else {
                    kVar = kVarN;
                }
            } else {
                kVar = kVar2;
            }
            Object objC = C(kVar, i10, andIncrement, obj);
            k kVar3 = kVar;
            if (objC == e.f15064m) {
                e2 e2Var = obj instanceof e2 ? (e2) obj : null;
                if (e2Var != null) {
                    e2Var.a(kVar3, i10);
                }
                E(andIncrement);
                kVar3.i();
                return iVar;
            }
            if (objC != e.f15066o) {
                if (objC == e.f15065n) {
                    throw new IllegalStateException("unexpected");
                }
                kVar3.b();
                return objC;
            }
            if (andIncrement < r()) {
                kVar3.b();
            }
            kVar2 = kVar3;
        }
        return new h(o());
    }

    @Override // sj.q
    public final Object c(ti.c cVar) throws Throwable {
        k kVarN;
        c cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15051z;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15046b;
            if (cVar2.t(atomicLongFieldUpdater.get(cVar2), true)) {
                Throwable thP = p();
                int i10 = vj.s.f18122a;
                throw thP;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f15047c;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar2);
            long j = e.f15054b;
            long j4 = andIncrement / j;
            int i11 = (int) (andIncrement % j);
            if (kVar.f18121c != j4) {
                k kVarN2 = cVar2.n(j4, kVar);
                if (kVarN2 == null) {
                    continue;
                } else {
                    kVar = kVarN2;
                }
            }
            Object objC = cVar2.C(kVar, i11, andIncrement, null);
            d7.c cVar3 = e.f15064m;
            if (objC == cVar3) {
                throw new IllegalStateException("unexpected");
            }
            d7.c cVar4 = e.f15066o;
            if (objC != cVar4) {
                if (objC != e.f15065n) {
                    kVar.b();
                    return objC;
                }
                qj.l lVarP = b0.p(u3.a.g(cVar));
                c cVar5 = this;
                try {
                    Object objC2 = cVar5.C(kVar, i11, andIncrement, lVarP);
                    if (objC2 == cVar3) {
                        lVarP.a(kVar, i11);
                    } else if (objC2 == cVar4) {
                        if (andIncrement < cVar5.r()) {
                            kVar.b();
                        }
                        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar5);
                        while (true) {
                            if (cVar5.t(atomicLongFieldUpdater.get(cVar5), true)) {
                                lVarP.resumeWith(uk.c.r(cVar5.p()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(cVar5);
                            long j10 = e.f15054b;
                            long j11 = andIncrement2 / j10;
                            int i12 = (int) (andIncrement2 % j10);
                            if (kVar2.f18121c != j11) {
                                kVarN = cVar5.n(j11, kVar2);
                                if (kVarN == null) {
                                }
                            } else {
                                kVarN = kVar2;
                            }
                            Object objC3 = cVar5.C(kVarN, i12, andIncrement2, lVarP);
                            if (objC3 == e.f15064m) {
                                lVarP.a(kVarN, i12);
                                break;
                            }
                            if (objC3 == e.f15066o) {
                                if (andIncrement2 < r()) {
                                    kVarN.b();
                                }
                                cVar5 = this;
                                kVar2 = kVarN;
                            } else {
                                if (objC3 == e.f15065n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kVarN.b();
                                lVarP.r(objC3, null);
                            }
                        }
                    } else {
                        kVar.b();
                        lVarP.r(objC2, null);
                    }
                    Object objO = lVarP.o();
                    ui.a aVar = ui.a.f17085a;
                    return objO;
                } catch (Throwable th2) {
                    lVarP.A();
                    throw th2;
                }
            }
            if (andIncrement < r()) {
                kVar.b();
            }
            cVar2 = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0173 A[RETURN] */
    @Override // sj.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object r24, ti.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.d(java.lang.Object, ti.c):java.lang.Object");
    }

    @Override // sj.q
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(true, cancellationException);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // sj.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = sj.c.f15046b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.t(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.i(r1)
            r1 = r1 ^ r10
        L1b:
            sj.i r13 = sj.j.f15075b
            if (r1 == 0) goto L20
            return r13
        L20:
            d7.c r6 = sj.e.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sj.c.f15050f
            java.lang.Object r1 = r1.get(r15)
            sj.k r1 = (sj.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.t(r2, r9)
            int r14 = sj.e.f15054b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f18121c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            sj.k r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.q()
            sj.h r2 = new sj.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = g(r0, r1, r2, r3, r4, r6, r7)
            pi.o r3 = pi.o.f13011a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.b()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sj.c.f15047c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.b()
        L8a:
            java.lang.Throwable r1 = r15.q()
            sj.h r2 = new sj.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.q()
            sj.h r2 = new sj.h
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof qj.e2
            if (r3 == 0) goto Lb2
            qj.e2 r6 = (qj.e2) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.h(java.lang.Object):java.lang.Object");
    }

    public final boolean i(long j) {
        return j < f15048d.get(this) || j < f15047c.get(this) + ((long) this.f15052a);
    }

    @Override // sj.q
    public final b iterator() {
        return new b(this);
    }

    public final boolean j(boolean z2, Throwable th2) {
        c cVar;
        boolean z10;
        long j;
        long j4;
        long j10;
        Object obj;
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15046b;
        if (!z2) {
            cVar = this;
            break;
        }
        do {
            j12 = atomicLongFieldUpdater.get(this);
            if (((int) (j12 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f15053a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (j12 & 1152921504606846975L) + (1 << 60)));
        d7.c cVar2 = e.f15070s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            if (atomicReferenceFieldUpdater.compareAndSet(this, cVar2, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != cVar2) {
                z10 = false;
                break;
            }
        }
        if (z2) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j11, (3 << 60) + (j11 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j >> 60);
                if (i10 == 0) {
                    j4 = j & 1152921504606846975L;
                    j10 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j4 = j & 1152921504606846975L;
                    j10 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j, (j10 << 60) + j4));
        }
        u();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                obj = atomicReferenceFieldUpdater2.get(this);
                d7.c cVar3 = obj == null ? e.f15068q : e.f15069r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, cVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                y.c(1, obj);
                ((ej.c) obj).invoke(o());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (sj.k) ((vj.c) vj.c.f18091b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sj.k k(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.k(long):sj.k");
    }

    public final void l(long j) {
        k kVar = (k) f15051z.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15047c;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f15052a + j4, f15048d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j10 = e.f15054b;
                long j11 = j4 / j10;
                int i10 = (int) (j4 % j10);
                if (kVar.f18121c != j11) {
                    k kVarN = n(j11, kVar);
                    if (kVarN != null) {
                        kVar = kVarN;
                    }
                }
                k kVar2 = kVar;
                if (C(kVar2, i10, j4, null) != e.f15066o || j4 < r()) {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        s(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.m():void");
    }

    public final k n(long j, k kVar) {
        Object objB;
        long j4;
        k kVar2 = e.f15053a;
        d dVar = d.A;
        loop0: while (true) {
            objB = vj.b.b(kVar, j, dVar);
            if (!vj.b.e(objB)) {
                vj.r rVarC = vj.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15051z;
                    vj.r rVar = (vj.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f18121c >= rVarC.f18121c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (vj.b.e(objB)) {
            u();
            if (kVar.f18121c * e.f15054b < r()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) vj.b.c(objB);
            long j10 = kVar3.f18121c;
            if (!w() && j <= f15048d.get(this) / e.f15054b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    vj.r rVar2 = (vj.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f18121c >= j10 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j10 <= j) {
                return kVar3;
            }
            long j11 = j10 * e.f15054b;
            do {
                j4 = f15047c.get(this);
                if (j4 >= j11) {
                    break;
                }
            } while (!f15047c.compareAndSet(this, j4, j11));
            if (j10 * e.f15054b < r()) {
                kVar3.b();
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) B.get(this);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new l("Channel was closed") : thO;
    }

    public final Throwable q() {
        Throwable thO = o();
        return thO == null ? new m("Channel was closed") : thO;
    }

    public final long r() {
        return f15046b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (sj.k) ((vj.c) vj.c.f18091b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (sj.k) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.toString():java.lang.String");
    }

    public final boolean u() {
        return t(f15046b.get(this), false);
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j = f15048d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r5, sj.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f18121c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            vj.c r0 = r7.c()
            sj.k r0 = (sj.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            vj.c r5 = r7.c()
            sj.k r5 = (sj.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = sj.c.A
            java.lang.Object r6 = r5.get(r4)
            vj.r r6 = (vj.r) r6
            long r0 = r6.f18121c
            long r2 = r7.f18121c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.c.x(long, sj.k):void");
    }

    public final Object y(Object obj, ti.c cVar) {
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        lVar.resumeWith(uk.c.r(q()));
        Object objO = lVar.o();
        return objO == ui.a.f17085a ? objO : pi.o.f13011a;
    }

    public final void z(e2 e2Var, boolean z2) {
        if (e2Var instanceof qj.k) {
            ((ti.c) e2Var).resumeWith(uk.c.r(z2 ? p() : q()));
            return;
        }
        if (!(e2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + e2Var).toString());
        }
        b bVar = (b) e2Var;
        qj.l lVar = bVar.f15044b;
        fj.l.c(lVar);
        bVar.f15044b = null;
        bVar.f15043a = e.f15063l;
        Throwable thO = bVar.f15045c.o();
        if (thO == null) {
            lVar.resumeWith(Boolean.FALSE);
        } else {
            lVar.resumeWith(uk.c.r(thO));
        }
    }
}
