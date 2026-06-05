package yj;

import ab.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pi.o;
import qj.e2;
import vj.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20319c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20320d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20321e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20322f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20323z = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f20324a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f20325b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i10) {
        this.f20324a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10;
        this.f20325b = new a0(this, 13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.r(r3, r4.f20325b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(vi.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = yj.h.f20323z
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f20324a
            if (r1 > r2) goto L0
            pi.o r3 = pi.o.f13011a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            ti.c r5 = u3.a.g(r5)
            qj.l r5 = qj.b0.p(r5)
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ab.a0 r0 = r4.f20325b     // Catch: java.lang.Throwable -> L3f
            r5.r(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.o()
            ui.a r0 = ui.a.f17085a
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.h.a(vi.c):java.lang.Object");
    }

    public final boolean c(e2 e2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20321e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f20322f.getAndIncrement(this);
        f fVar = f.A;
        long j = andIncrement / j.f20331f;
        loop0: while (true) {
            objB = vj.b.b(kVar, j, fVar);
            if (!vj.b.e(objB)) {
                r rVarC = vj.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) vj.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.f20332e;
        int i10 = (int) (andIncrement % j.f20331f);
        while (!atomicReferenceArray.compareAndSet(i10, null, e2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                d7.c cVar = j.f20327b;
                d7.c cVar2 = j.f20328c;
                while (!atomicReferenceArray.compareAndSet(i10, cVar, cVar2)) {
                    if (atomicReferenceArray.get(i10) != cVar) {
                        return false;
                    }
                }
                ((qj.k) e2Var).r(o.f13011a, this.f20325b);
                return true;
            }
        }
        e2Var.a(kVar2, i10);
        return true;
    }

    public final void d() {
        int i10;
        Object objB;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20323z;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f20324a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20319c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f20320d.getAndIncrement(this);
            long j = andIncrement2 / j.f20331f;
            g gVar = g.A;
            while (true) {
                objB = vj.b.b(kVar, j, gVar);
                if (vj.b.e(objB)) {
                    break;
                }
                r rVarC = vj.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f18121c >= rVarC.f18121c) {
                        break;
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
            }
            k kVar2 = (k) vj.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.f20332e;
            kVar2.b();
            z2 = false;
            if (kVar2.f18121c <= j) {
                int i12 = (int) (andIncrement2 % j.f20331f);
                Object andSet = atomicReferenceArray.getAndSet(i12, j.f20327b);
                if (andSet == null) {
                    int i13 = j.f20326a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == j.f20328c) {
                            z2 = true;
                            break;
                        }
                    }
                    d7.c cVar = j.f20327b;
                    d7.c cVar2 = j.f20329d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, cVar, cVar2)) {
                            if (atomicReferenceArray.get(i12) != cVar) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = !z2;
                } else if (andSet != j.f20330e) {
                    if (!(andSet instanceof qj.k)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    qj.k kVar3 = (qj.k) andSet;
                    d7.c cVarF = kVar3.f(o.f13011a, this.f20325b);
                    if (cVarF != null) {
                        kVar3.z(cVarF);
                        z2 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z2);
    }
}
