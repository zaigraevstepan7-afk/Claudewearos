package lg;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends x3.g implements ScheduledFuture {
    public final ScheduledFuture A;

    public h(g gVar) {
        this.A = gVar.a(new p7.k(this, 13));
    }

    @Override // x3.g
    public final void b() {
        ScheduledFuture scheduledFuture = this.A;
        Object obj = this.f19824a;
        scheduledFuture.cancel((obj instanceof x3.a) && ((x3.a) obj).f19805a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.A.getDelay(timeUnit);
    }
}
