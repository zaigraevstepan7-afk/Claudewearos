package x3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j implements mf.a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19831a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19832b = new i(this);

    public j(h hVar) {
        this.f19831a = new WeakReference(hVar);
    }

    @Override // mf.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f19832b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        h hVar = (h) this.f19831a.get();
        boolean zCancel = this.f19832b.cancel(z2);
        if (zCancel && hVar != null) {
            hVar.f19827a = null;
            hVar.f19828b = null;
            hVar.f19829c.w(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19832b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19832b.f19824a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19832b.isDone();
    }

    public final String toString() {
        return this.f19832b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19832b.get(j, timeUnit);
    }
}
