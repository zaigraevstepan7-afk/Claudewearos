package qj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j0 extends vj.q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13585e = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // vj.q, qj.l1
    public final void i(Object obj) throws i0 {
        j(obj);
    }

    @Override // vj.q, qj.l1
    public final void j(Object obj) throws i0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f13585e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                vj.b.h(b0.y(obj), u3.a.g(this.f18119d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
