package wh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19340a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f19341b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19342c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f19343d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f19344e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19345f;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new rc.b("Firebase-FirebaseInstanceIdServiceConnection", 1));
        this.f19343d = new ArrayDeque();
        this.f19345f = false;
        Context applicationContext = context.getApplicationContext();
        this.f19340a = applicationContext;
        this.f19341b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f19342c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f19343d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                b0 b0Var = this.f19344e;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f19344e.a((c0) this.f19343d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Task b(Intent intent) {
        c0 c0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            c0Var = new c0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f19342c;
            c0Var.f19337b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new t1.f(scheduledThreadPoolExecutor.schedule(new ac.o(c0Var, 27), 20L, TimeUnit.SECONDS), 7));
            this.f19343d.add(c0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return c0Var.f19337b.getTask();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[LOOP:0: B:22:0x0053->B:24:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r10 = this;
            r0 = 3
            java.lang.String r1 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "binder is dead. start connection? "
            r0.<init>(r3)
            boolean r3 = r10.f19345f
            r3 = r3 ^ r2
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1e:
            boolean r0 = r10.f19345f
            if (r0 == 0) goto L24
            r7 = r10
            goto L68
        L24:
            r10.f19345f = r2
            td.a r3 = td.a.a()     // Catch: java.lang.SecurityException -> L49
            android.content.Context r4 = r10.f19340a     // Catch: java.lang.SecurityException -> L49
            android.content.Intent r6 = r10.f19341b     // Catch: java.lang.SecurityException -> L49
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.SecurityException -> L49
            java.lang.String r5 = r0.getName()     // Catch: java.lang.SecurityException -> L49
            r9 = 0
            r8 = 65
            r7 = r10
            boolean r0 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L41
            goto L68
        L41:
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r1, r0)     // Catch: java.lang.SecurityException -> L47
            goto L50
        L47:
            r0 = move-exception
            goto L4b
        L49:
            r0 = move-exception
            r7 = r10
        L4b:
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)
        L50:
            r0 = 0
            r7.f19345f = r0
        L53:
            java.util.ArrayDeque r0 = r7.f19343d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L68
            java.lang.Object r0 = r0.poll()
            wh.c0 r0 = (wh.c0) r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.f19337b
            r1 = 0
            r0.trySetResult(r1)
            goto L53
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.d0.c():void");
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f19345f = false;
            if (iBinder instanceof b0) {
                this.f19344e = (b0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f19343d;
            while (!arrayDeque.isEmpty()) {
                ((c0) arrayDeque.poll()).f19337b.trySetResult(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
