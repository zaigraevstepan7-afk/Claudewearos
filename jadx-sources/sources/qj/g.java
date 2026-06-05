package qj;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f13576d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f13577e;

    public g(ti.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.f13576d = thread;
        this.f13577e = w0Var;
    }

    @Override // qj.l1
    public final void i(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f13576d;
        if (fj.l.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
