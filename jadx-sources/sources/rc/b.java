package rc;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14326a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14327b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14328c;

    public b() {
        this.f14326a = 2;
        this.f14327b = Executors.defaultThreadFactory();
        this.f14328c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f14326a) {
            case 0:
                return new Thread(runnable, "AdWorker(" + ((String) this.f14327b) + ") #" + ((AtomicInteger) this.f14328c).getAndIncrement());
            case 1:
                Thread threadNewThread = ((ThreadFactory) this.f14328c).newThread(new lg.j(2, runnable));
                threadNewThread.setName((String) this.f14327b);
                return threadNewThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f14328c;
                Thread threadNewThread2 = ((ThreadFactory) this.f14327b).newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread2;
        }
    }

    public b(String str, int i10) {
        this.f14326a = i10;
        switch (i10) {
            case 1:
                this.f14328c = Executors.defaultThreadFactory();
                this.f14327b = str;
                break;
            default:
                this.f14327b = str;
                this.f14328c = new AtomicInteger(1);
                break;
        }
    }
}
