package vj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qj.d0;
import qj.g0;
import qj.o0;
import qj.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends qj.v implements g0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f18099c;

    /* renamed from: d, reason: collision with root package name */
    public final qj.v f18100d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18101e;

    /* renamed from: f, reason: collision with root package name */
    public final k f18102f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: z, reason: collision with root package name */
    public final Object f18103z;

    /* JADX WARN: Multi-variable type inference failed */
    public h(qj.v vVar, int i10) {
        g0 g0Var = vVar instanceof g0 ? (g0) vVar : null;
        this.f18099c = g0Var == null ? d0.f13564a : g0Var;
        this.f18100d = vVar;
        this.f18101e = i10;
        this.f18102f = new k();
        this.f18103z = new Object();
    }

    @Override // qj.g0
    public final void Q(long j, qj.l lVar) {
        this.f18099c.Q(j, lVar);
    }

    @Override // qj.g0
    public final o0 Z(long j, z1 z1Var, ti.h hVar) {
        return this.f18099c.Z(j, z1Var, hVar);
    }

    @Override // qj.v
    public final void e0(ti.h hVar, Runnable runnable) {
        Runnable runnableI0;
        this.f18102f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
        if (atomicIntegerFieldUpdater.get(this) >= this.f18101e || !j0() || (runnableI0 = i0()) == null) {
            return;
        }
        try {
            b.i(this.f18100d, this, new a8.e(25, this, runnableI0));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // qj.v
    public final void f0(ti.h hVar, Runnable runnable) {
        Runnable runnableI0;
        this.f18102f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
        if (atomicIntegerFieldUpdater.get(this) >= this.f18101e || !j0() || (runnableI0 = i0()) == null) {
            return;
        }
        try {
            this.f18100d.f0(this, new a8.e(25, this, runnableI0));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // qj.v
    public final qj.v h0(int i10) {
        b.a(i10);
        return i10 >= this.f18101e ? this : super.h0(i10);
    }

    public final Runnable i0() {
        while (true) {
            Runnable runnable = (Runnable) this.f18102f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f18103z) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f18102f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean j0() {
        synchronized (this.f18103z) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
            if (atomicIntegerFieldUpdater.get(this) >= this.f18101e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // qj.v
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18100d);
        sb2.append(".limitedParallelism(");
        return m6.a.g(sb2, this.f18101e, ')');
    }
}
