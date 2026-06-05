package d8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5005b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f5007d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f5004a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f5006c = new Object();

    public h(Executor executor) {
        this.f5005b = executor;
    }

    public final void a() {
        synchronized (this.f5006c) {
            try {
                Runnable runnable = (Runnable) this.f5004a.poll();
                this.f5007d = runnable;
                if (runnable != null) {
                    this.f5005b.execute(this.f5007d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f5006c) {
            try {
                this.f5004a.add(new a8.e(1, this, runnable, false));
                if (this.f5007d == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
