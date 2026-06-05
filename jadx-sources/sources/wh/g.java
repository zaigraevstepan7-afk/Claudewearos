package wh;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w2.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class g extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f19348a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f19349b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19350c;

    /* renamed from: d, reason: collision with root package name */
    public int f19351d;

    /* renamed from: e, reason: collision with root package name */
    public int f19352e;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rc.b("Firebase-Messaging-Intent-Handle", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19348a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f19350c = new Object();
        this.f19352e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            a0.b(intent);
        }
        synchronized (this.f19350c) {
            try {
                int i10 = this.f19352e - 1;
                this.f19352e = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f19351d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f19349b == null) {
                this.f19349b = new b0(new s1(this, 3));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19349b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f19348a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f19350c) {
            this.f19351d = i11;
            this.f19352e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) s.i().f19382d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f19348a.execute(new p0.g(this, intent2, taskCompletionSource, 3));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new n.a(1), new ac.l(15, this, intent));
        return 3;
    }
}
