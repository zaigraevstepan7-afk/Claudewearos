package h6;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static final ThreadPoolExecutor A;
    public static f B;
    public static volatile ThreadPoolExecutor C;

    /* renamed from: a, reason: collision with root package name */
    public final c f7655a;

    /* renamed from: b, reason: collision with root package name */
    public final d f7656b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f7657c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7658d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7659e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f7660f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ld.d f7661z;

    static {
        b bVar = new b(0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), bVar);
        A = threadPoolExecutor;
        C = threadPoolExecutor;
    }

    public a(ld.d dVar) {
        this.f7661z = dVar;
        c cVar = new c(this, 0);
        this.f7655a = cVar;
        this.f7656b = new d(this, cVar);
        this.f7660f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        f fVar;
        synchronized (a.class) {
            try {
                if (B == null) {
                    B = new f(Looper.getMainLooper());
                }
                fVar = B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        fVar.obtainMessage(1, new e(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7661z.b();
    }
}
