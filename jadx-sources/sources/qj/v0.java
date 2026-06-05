package qj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class v0 extends w0 implements g0 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13629z = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");

    @Override // qj.g0
    public final void Q(long j, l lVar) {
        long j4 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j4 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j4 + jNanoTime, lVar);
            t0(jNanoTime, r0Var);
            lVar.t(new i(r0Var, 2));
        }
    }

    public o0 Z(long j, z1 z1Var, ti.h hVar) {
        return d0.f13564a.Z(j, z1Var, hVar);
    }

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        p0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // qj.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m0() {
        /*
            r10 = this;
            d7.c r0 = qj.b0.f13550c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qj.v0.f13629z
            boolean r2 = r10.n0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.q0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof vj.m
            if (r6 == 0) goto L3e
            r6 = r2
            vj.m r6 = (vj.m) r6
            java.lang.Object r7 = r6.d()
            d7.c r8 = vj.m.f18112g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            vj.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            qi.j r2 = r10.f13636e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof vj.m
            if (r2 == 0) goto L8d
            vj.m r1 = (vj.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = vj.m.f18111f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qj.v0.A
            java.lang.Object r0 = r0.get(r10)
            qj.u0 r0 = (qj.u0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            qj.t0[] r1 = r0.f18129a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f13623a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.v0.m0():long");
    }

    public void p0(Runnable runnable) {
        q0();
        if (!r0(runnable)) {
            c0.C.p0(runnable);
            return;
        }
        Thread threadK0 = k0();
        if (Thread.currentThread() != threadK0) {
            LockSupport.unpark(threadK0);
        }
    }

    public final void q0() {
        t0 t0VarB;
        u0 u0Var = (u0) A.get(this);
        if (u0Var == null || vj.w.f18128b.get(u0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f18129a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (t0Var != null) {
                        t0VarB = ((jNanoTime - t0Var.f13623a) > 0L ? 1 : ((jNanoTime - t0Var.f13623a) == 0L ? 0 : -1)) >= 0 ? r0(t0Var) : false ? u0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (t0VarB != null);
    }

    public final boolean r0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13629z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (B.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof vj.m)) {
                        if (obj != b0.f13550c) {
                            vj.m mVar = new vj.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    vj.m mVar2 = (vj.m) obj;
                    int iA = mVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        vj.m mVarC = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s0() {
        /*
            r7 = this;
            qi.j r0 = r7.f13636e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qj.v0.A
            java.lang.Object r0 = r0.get(r7)
            qj.u0 r0 = (qj.u0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = vj.w.f18128b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qj.v0.f13629z
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof vj.m
            if (r3 == 0) goto L4f
            vj.m r0 = (vj.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = vj.m.f18111f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            d7.c r3 = qj.b0.f13550c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.v0.s0():boolean");
    }

    @Override // qj.w0
    public void shutdown() {
        t0 t0VarB;
        v1.f13630a.set(null);
        B.set(this, 1);
        d7.c cVar = b0.f13550c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13629z;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof vj.m)) {
                    if (obj != cVar) {
                        vj.m mVar = new vj.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((vj.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) A.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                t0VarB = vj.w.f18128b.get(u0Var) > 0 ? u0Var.b(0) : null;
            }
            if (t0VarB == null) {
                return;
            } else {
                o0(jNanoTime, t0VarB);
            }
        }
    }

    public final void t0(long j, t0 t0Var) {
        int iB;
        Thread threadK0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (B.get(this) == 1) {
            iB = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.f13627c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                fj.l.c(obj);
                u0Var = (u0) obj;
            }
            iB = t0Var.b(j, u0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                o0(j, t0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var3 != null) {
            synchronized (u0Var3) {
                t0[] t0VarArr = u0Var3.f18129a;
                t0Var = t0VarArr != null ? t0VarArr[0] : null;
            }
        }
        if (t0Var != t0Var || Thread.currentThread() == (threadK0 = k0())) {
            return;
        }
        LockSupport.unpark(threadK0);
    }
}
