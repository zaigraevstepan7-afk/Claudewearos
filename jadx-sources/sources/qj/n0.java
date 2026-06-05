package qj;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f13606a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f13606a = scheduledFuture;
    }

    @Override // qj.o0
    public final void a() {
        this.f13606a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f13606a + ']';
    }
}
