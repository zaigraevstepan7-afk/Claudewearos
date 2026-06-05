package qj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x1 extends h1 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13637z = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f13638e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    public o0 f13639f;

    public static void n(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // qj.h1
    public final boolean k() {
        return true;
    }

    @Override // qj.h1
    public final void l(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f13637z;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                n(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f13638e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13637z;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                o0 o0Var = this.f13639f;
                if (o0Var != null) {
                    o0Var.a();
                    return;
                }
                return;
            }
        }
    }
}
