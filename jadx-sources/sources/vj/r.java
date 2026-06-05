package vj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qj.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class r extends c implements q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18120d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f18121c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j, r rVar, int i10) {
        super(rVar);
        this.f18121c = j;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // vj.c
    public final boolean d() {
        return f18120d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f18120d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, ti.h hVar);

    public final void i() {
        if (f18120d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f18120d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
