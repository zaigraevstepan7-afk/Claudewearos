package yj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f20318a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f20317b;
        yj.c.A.set(r2, null);
        r3 = r0.f20316a;
        r3.B(r1, r3.f13589c, new ab.a0(new q0.i(18, r2, r0), 3));
     */
    @Override // yj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(vi.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.g()
            pi.o r1 = pi.o.f13011a
            if (r0 == 0) goto L9
            goto L52
        L9:
            ti.c r7 = u3.a.g(r7)
            qj.l r7 = qj.b0.p(r7)
            yj.b r0 = new yj.b     // Catch: java.lang.Throwable -> L53
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = yj.h.f20323z     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L53
            int r3 = r6.f20324a     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            yj.c r2 = r0.f20317b     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = yj.c.A     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L53
            qj.l r3 = r0.f20316a     // Catch: java.lang.Throwable -> L53
            q0.i r4 = new q0.i     // Catch: java.lang.Throwable -> L53
            r5 = 18
            r4.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r3.f13589c     // Catch: java.lang.Throwable -> L53
            ab.a0 r2 = new ab.a0     // Catch: java.lang.Throwable -> L53
            r5 = 3
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L53
            r3.B(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r7 = r7.o()
            ui.a r0 = ui.a.f17085a
            if (r7 != r0) goto L4e
            goto L4f
        L4e:
            r7 = r1
        L4f:
            if (r7 != r0) goto L52
            return r7
        L52:
            return r1
        L53:
            r0 = move-exception
            r7.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.c.b(vi.c):java.lang.Object");
    }

    @Override // yj.a
    public final void e(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            d7.c cVar = d.f20318a;
            if (obj2 != cVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, cVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean f() {
        return Math.max(h.f20323z.get(this), 0) == 0;
    }

    public final boolean g() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f20323z;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f20324a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    A.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + b0.n(this) + "[isLocked=" + f() + ",owner=" + A.get(this) + ']';
    }
}
