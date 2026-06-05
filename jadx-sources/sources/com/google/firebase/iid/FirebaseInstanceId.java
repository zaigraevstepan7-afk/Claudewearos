package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import cg.i;
import cg.m;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d8.e;
import hj.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import mh.c;
import mh.d;
import mh.g;
import mh.h;
import oh.b;
import t0.j;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {
    public static g j;

    /* renamed from: l, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f4278l;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f4279a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4280b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4281c;

    /* renamed from: d, reason: collision with root package name */
    public final p f4282d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4283e;

    /* renamed from: f, reason: collision with root package name */
    public final ph.d f4284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4285g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4286h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f4276i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4277k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(i iVar, b bVar, b bVar2, ph.d dVar) {
        iVar.b();
        d dVar2 = new d(iVar.f3367a, 0);
        ThreadPoolExecutor threadPoolExecutorB = a.B();
        ThreadPoolExecutor threadPoolExecutorB2 = a.B();
        this.f4285g = false;
        this.f4286h = new ArrayList();
        if (d.c(iVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (j == null) {
                    iVar.b();
                    j = new g(iVar.f3367a, 24);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f4280b = iVar;
        this.f4281c = dVar2;
        iVar.b();
        md.b bVar3 = new md.b(iVar.f3367a);
        p pVar = new p();
        pVar.f17052a = iVar;
        pVar.f17053b = dVar2;
        pVar.f17054c = bVar3;
        pVar.f17055d = bVar;
        pVar.f17056e = bVar2;
        pVar.f17057f = dVar;
        this.f4282d = pVar;
        this.f4279a = threadPoolExecutorB2;
        this.f4283e = new j(threadPoolExecutorB);
        this.f4284f = dVar;
    }

    public static Object a(Task task) throws InterruptedException {
        e0.j(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(mh.a.f11687c, new e(countDownLatch));
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static void c(i iVar) {
        iVar.b();
        m mVar = iVar.f3369c;
        e0.f(mVar.f3387g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        iVar.b();
        String str = mVar.f3382b;
        e0.f(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        iVar.b();
        String str2 = mVar.f3381a;
        e0.f(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        iVar.b();
        e0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        iVar.b();
        e0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", f4277k.matcher(str2).matches());
    }

    public static void d(Runnable runnable, long j4) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f4278l == null) {
                    f4278l = new ScheduledThreadPoolExecutor(1, new rc.b("FirebaseInstanceId", 1));
                }
                f4278l.schedule(runnable, j4, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(i iVar) {
        c(iVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) iVar.c(FirebaseInstanceId.class);
        e0.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public final String b() throws IOException {
        String strC = d.c(this.f4280b);
        c(this.f4280b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        try {
            return ((c) Tasks.await(e(strC), 30000L, TimeUnit.MILLISECONDS)).f11693a;
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    j.l();
                }
            }
            throw ((IOException) cause);
        }
    }

    public final Task e(String str) {
        return Tasks.forResult(null).continueWithTask(this.f4279a, new mh.b(this, str, "*"));
    }

    public final String f() {
        c(this.f4280b);
        h hVarG = g(d.c(this.f4280b), "*");
        if (j(hVarG)) {
            synchronized (this) {
                if (!this.f4285g) {
                    i(0L);
                }
            }
        }
        if (hVarG != null) {
            return hVarG.f11711a;
        }
        int i10 = h.f11710e;
        return null;
    }

    public final h g(String str, String str2) {
        h hVarB;
        g gVar = j;
        i iVar = this.f4280b;
        iVar.b();
        String strG = "[DEFAULT]".equals(iVar.f3368b) ? "" : iVar.g();
        synchronized (gVar) {
            hVarB = h.b(((SharedPreferences) gVar.f11707b).getString(g.k(strG, str, str2), null));
        }
        return hVarB;
    }

    public final boolean h() {
        int i10;
        d dVar = this.f4281c;
        synchronized (dVar) {
            i10 = dVar.f11699f;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) dVar.f11695b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    }
                    dVar.f11699f = 2;
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public final synchronized void i(long j4) {
        d(new mh.i(this, Math.min(Math.max(30L, j4 + j4), f4276i)), j4);
        this.f4285g = true;
    }

    public final boolean j(h hVar) {
        if (hVar != null) {
            return System.currentTimeMillis() > hVar.f11713c + h.f11709d || !this.f4281c.b().equals(hVar.f11712b);
        }
        return true;
    }
}
