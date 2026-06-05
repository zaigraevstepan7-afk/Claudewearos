package qj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d1 extends h1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13565f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final k0.h1 f13566e;

    public d1(k0.h1 h1Var) {
        this.f13566e = h1Var;
    }

    @Override // qj.h1
    public final boolean k() {
        return true;
    }

    @Override // qj.h1
    public final void l(Throwable th2) {
        if (f13565f.compareAndSet(this, 0, 1)) {
            this.f13566e.invoke(th2);
        }
    }
}
