package kf;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class i0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f9579a;

    public i0() {
        this.f9579a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f9579a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f9579a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public i0(TaskCompletionSource taskCompletionSource) {
        this.f9579a = taskCompletionSource;
    }
}
