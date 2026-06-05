package kc;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9519a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9520b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f9521c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f9522d = false;

    public d(b bVar, long j) {
        this.f9519a = new WeakReference(bVar);
        this.f9520b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f9519a;
        try {
            if (this.f9521c.await(this.f9520b, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f9522d = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f9522d = true;
            }
        }
    }
}
