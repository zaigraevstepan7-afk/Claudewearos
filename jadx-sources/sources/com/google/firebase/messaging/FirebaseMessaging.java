package com.google.firebase.messaging;

import ac.l;
import ai.n;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import cg.i;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import f0.a1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kg.f;
import mh.d;
import nh.a;
import oh.b;
import q.e;
import u3.c;
import uf.p;
import w8.h;
import wh.j;
import wh.k;
import wh.m;
import wh.t;
import wh.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    public static h f4290m;

    /* renamed from: o, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f4292o;

    /* renamed from: a, reason: collision with root package name */
    public final i f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4294b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4295c;

    /* renamed from: d, reason: collision with root package name */
    public final p f4296d;

    /* renamed from: e, reason: collision with root package name */
    public final wh.i f4297e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f4298f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4299g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f4300h;

    /* renamed from: i, reason: collision with root package name */
    public final Task f4301i;
    public final d j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4302k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f4289l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    public static b f4291n = new f(6);

    public FirebaseMessaging(i iVar, a aVar, b bVar, b bVar2, ph.d dVar, b bVar3, ih.b bVar4) {
        iVar.b();
        Context context = iVar.f3367a;
        final int i10 = 1;
        final d dVar2 = new d(context, i10);
        iVar.b();
        md.b bVar5 = new md.b(iVar.f3367a);
        final p pVar = new p();
        pVar.f17052a = iVar;
        pVar.f17053b = dVar2;
        pVar.f17054c = bVar5;
        pVar.f17055d = bVar;
        pVar.f17056e = bVar2;
        pVar.f17057f = dVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new rc.b("Firebase-Messaging-Task", 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new rc.b("Firebase-Messaging-Init", 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new rc.b("Firebase-Messaging-File-Io", 1));
        final int i11 = 0;
        this.f4302k = false;
        f4291n = bVar3;
        this.f4293a = iVar;
        this.f4294b = aVar;
        a1 a1Var = new a1();
        a1Var.f6107d = this;
        a1Var.f6105b = bVar4;
        this.f4298f = a1Var;
        iVar.b();
        final Context context2 = iVar.f3367a;
        this.f4295c = context2;
        j jVar = new j();
        this.j = dVar2;
        this.f4296d = pVar;
        this.f4297e = new wh.i(executorServiceNewSingleThreadExecutor);
        this.f4299g = scheduledThreadPoolExecutor;
        this.f4300h = threadPoolExecutor;
        iVar.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(jVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            ((mh.f) aVar).f11704a.f4286h.add(new k(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: wh.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f19363b;

            {
                this.f19363b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                int i12;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f19363b;
                        if (firebaseMessaging.f4298f.b()) {
                            nh.a aVar2 = firebaseMessaging.f4294b;
                            if (aVar2 != null) {
                                ((mh.f) aVar2).f11704a.f();
                                return;
                            } else {
                                if (firebaseMessaging.i(firebaseMessaging.d())) {
                                    synchronized (firebaseMessaging) {
                                        if (!firebaseMessaging.f4302k) {
                                            firebaseMessaging.h(0L);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f19363b;
                        final Context context3 = firebaseMessaging2.f4295c;
                        u3.c.k(context3);
                        uf.p pVar2 = firebaseMessaging2.f4296d;
                        final boolean zG = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesL = u0.b.l(context3);
                            if (!sharedPreferencesL.contains("proxy_retention") || sharedPreferencesL.getBoolean("proxy_retention", false) != zG) {
                                md.b bVar6 = (md.b) pVar2.f17054c;
                                if (bVar6.f11605c.q() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    md.m mVarC = md.m.c(bVar6.f11604b);
                                    synchronized (mVarC) {
                                        i12 = mVarC.f11638a;
                                        mVarC.f11638a = i12 + 1;
                                    }
                                    taskForException = mVarC.d(new md.l(i12, 4, bundle, 0));
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new n.a(1), new OnSuccessListener() { // from class: wh.q
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = u0.b.l(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new rc.b("Firebase-Messaging-Topics-Io", 1));
        int i12 = x.j;
        Task taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: wh.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                v vVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                mh.d dVar3 = dVar2;
                uf.p pVar2 = pVar;
                synchronized (v.class) {
                    try {
                        WeakReference weakReference = v.f19391c;
                        vVar = weakReference != null ? (v) weakReference.get() : null;
                        if (vVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            v vVar2 = new v(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (vVar2) {
                                vVar2.f19392a = ak.v.m(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            v.f19391c = new WeakReference(vVar2);
                            vVar = vVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new x(firebaseMessaging, dVar3, vVar, pVar2, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.f4301i = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new m(this, i11));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: wh.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f19363b;

            {
                this.f19363b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                int i122;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f19363b;
                        if (firebaseMessaging.f4298f.b()) {
                            nh.a aVar2 = firebaseMessaging.f4294b;
                            if (aVar2 != null) {
                                ((mh.f) aVar2).f11704a.f();
                                return;
                            } else {
                                if (firebaseMessaging.i(firebaseMessaging.d())) {
                                    synchronized (firebaseMessaging) {
                                        if (!firebaseMessaging.f4302k) {
                                            firebaseMessaging.h(0L);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f19363b;
                        final Context context3 = firebaseMessaging2.f4295c;
                        u3.c.k(context3);
                        uf.p pVar2 = firebaseMessaging2.f4296d;
                        final boolean zG = firebaseMessaging2.g();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesL = u0.b.l(context3);
                            if (!sharedPreferencesL.contains("proxy_retention") || sharedPreferencesL.getBoolean("proxy_retention", false) != zG) {
                                md.b bVar6 = (md.b) pVar2.f17054c;
                                if (bVar6.f11605c.q() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zG);
                                    md.m mVarC = md.m.c(bVar6.f11604b);
                                    synchronized (mVarC) {
                                        i122 = mVarC.f11638a;
                                        mVarC.f11638a = i122 + 1;
                                    }
                                    taskForException = mVarC.d(new md.l(i122, 4, bundle, 0));
                                } else {
                                    taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                taskForException.addOnSuccessListener(new n.a(1), new OnSuccessListener() { // from class: wh.q
                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor editorEdit = u0.b.l(context3).edit();
                                        editorEdit.putBoolean("proxy_retention", zG);
                                        editorEdit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.g()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f4292o == null) {
                    f4292o = new ScheduledThreadPoolExecutor(1, new rc.b("TAG", 1));
                }
                f4292o.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized h c(Context context) {
        try {
            if (f4290m == null) {
                f4290m = new h(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4290m;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(i iVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) iVar.c(FirebaseMessaging.class);
        e0.j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        a aVar = this.f4294b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(((mh.f) aVar).a());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        t tVarD = d();
        if (!i(tVarD)) {
            return tVarD.f19384a;
        }
        String strD = d.d(this.f4293a);
        wh.i iVar = this.f4297e;
        synchronized (iVar) {
            taskContinueWithTask = (Task) ((e) iVar.f19359b).get(strD);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strD);
                }
                p pVar = this.f4296d;
                taskContinueWithTask = pVar.p(pVar.u(d.d((i) pVar.f17052a), "*", new Bundle())).onSuccessTask(this.f4300h, new n(this, strD, tVarD, 6)).continueWithTask((Executor) iVar.f19358a, new l(16, iVar, strD));
                ((e) iVar.f19359b).put(strD, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strD);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public final t d() {
        t tVarB;
        h hVarC = c(this.f4295c);
        i iVar = this.f4293a;
        iVar.b();
        String strG = "[DEFAULT]".equals(iVar.f3368b) ? "" : iVar.g();
        String strD = d.d(this.f4293a);
        synchronized (hVarC) {
            tVarB = t.b(((SharedPreferences) hVarC.f18959a).getString(strG + "|T|" + strD + "|*", null));
        }
        return tVarB;
    }

    public final void e() {
        Task taskForException;
        int i10;
        md.b bVar = (md.b) this.f4296d.f17054c;
        if (bVar.f11605c.q() >= 241100000) {
            md.m mVarC = md.m.c(bVar.f11604b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (mVarC) {
                i10 = mVarC.f11638a;
                mVarC.f11638a = i10 + 1;
            }
            taskForException = mVarC.d(new md.l(i10, 5, bundle, 1)).continueWith(md.h.f11618c, md.d.f11612c);
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(this.f4299g, new m(this, 1));
    }

    public final void f(String str) {
        i iVar = this.f4293a;
        iVar.b();
        if ("[DEFAULT]".equals(iVar.f3368b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                iVar.b();
                sb2.append(iVar.f3368b);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new wh.i(this.f4295c).b(intent);
        }
    }

    public final boolean g() {
        Context context = this.f4295c;
        c.k(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f4293a.c(fg.a.class) != null) {
                    return true;
                }
                if (u3.a.c() && f4291n != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void h(long j) {
        b(new mh.i(this, Math.min(Math.max(30L, 2 * j), f4289l)), j);
        this.f4302k = true;
    }

    public final boolean i(t tVar) {
        if (tVar != null) {
            return System.currentTimeMillis() > tVar.f19386c + t.f19383d || !this.j.b().equals(tVar.f19385b);
        }
        return true;
    }
}
