package ai;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f504d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final n.a f505e = new n.a(1);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f506a;

    /* renamed from: b, reason: collision with root package name */
    public final q f507b;

    /* renamed from: c, reason: collision with root package name */
    public Task f508c = null;

    public e(Executor executor, q qVar) {
        this.f506a = executor;
        this.f507b = qVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ld.i iVar = new ld.i(2);
        Executor executor = f505e;
        task.addOnSuccessListener(executor, iVar);
        task.addOnFailureListener(executor, iVar);
        task.addOnCanceledListener(executor, iVar);
        if (!((CountDownLatch) iVar.f10924b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f508c;
            if (task == null || (task.isComplete() && !this.f508c.isSuccessful())) {
                this.f508c = Tasks.call(this.f506a, new c(this.f507b, 0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f508c;
    }

    public final g c() {
        synchronized (this) {
            try {
                Task task = this.f508c;
                if (task != null && task.isSuccessful()) {
                    return (g) this.f508c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (g) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task d(g gVar) {
        d dVar = new d(0, this, gVar);
        Executor executor = this.f506a;
        return Tasks.call(executor, dVar).onSuccessTask(executor, new ac.l(2, this, gVar));
    }
}
