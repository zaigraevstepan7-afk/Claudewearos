package h6;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f7666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, c cVar) {
        super(cVar);
        this.f7666a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f7666a;
        AtomicBoolean atomicBoolean = aVar.f7659e;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e10) {
            Log.w("AsyncTask", e10);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e11) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
