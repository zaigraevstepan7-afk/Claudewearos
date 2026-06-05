package h6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7662a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7663b;

    public b(ac.d dVar) {
        this.f7662a = 2;
        this.f7663b = dVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7662a) {
            case 0:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f7663b).getAndIncrement());
            case 1:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f7663b).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("FirebaseDatabaseWorker");
                threadNewThread.setDaemon(true);
                threadNewThread.setUncaughtExceptionHandler(new ug.c(this));
                return threadNewThread;
        }
    }

    public b(int i10) {
        this.f7662a = i10;
        switch (i10) {
            case 1:
                this.f7663b = new AtomicInteger(0);
                break;
            default:
                this.f7663b = new AtomicInteger(1);
                break;
        }
    }
}
