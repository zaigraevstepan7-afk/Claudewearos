package ak;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b0 implements Closeable {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(Throwable th2, kk.h hVar) throws Exception {
        boolean zIsTerminated;
        if (th2 != null) {
            try {
                m6.a.s(hVar);
                return;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                return;
            }
        }
        if (hVar instanceof AutoCloseable) {
            hVar.close();
            return;
        }
        if (!(hVar instanceof ExecutorService)) {
            if (hVar instanceof TypedArray) {
                ((TypedArray) hVar).recycle();
                return;
            } else if (hVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) hVar).release();
                return;
            } else {
                if (!(hVar instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) hVar).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) hVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z2 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z2) {
                    executorService.shutdownNow();
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bk.d.c(l());
    }

    public abstract long e();

    public abstract p g();

    public abstract kk.h l();
}
