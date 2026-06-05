package c;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1863b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1862a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1864c = new CopyOnWriteArrayList();

    public x(boolean z2) {
        this.f1863b = z2;
    }

    public abstract void b();

    public final void e() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1864c;
        Iterator it = copyOnWriteArrayList.iterator();
        fj.l.e(it, "iterator(...)");
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.f1862a;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((w) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i10 == 0) {
                                executorService.shutdownNow();
                                i10 = 1;
                            }
                        }
                    }
                    if (i10 != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    public final void f(boolean z2) {
        this.f1863b = z2;
        ArrayList arrayList = this.f1862a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            wVar.f(wVar.f1861e && z2);
        }
    }

    public void a() {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }
}
