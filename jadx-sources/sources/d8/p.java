package d8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f5035a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f5035a);
        this.f5035a = this.f5035a + 1;
        return threadNewThread;
    }
}
