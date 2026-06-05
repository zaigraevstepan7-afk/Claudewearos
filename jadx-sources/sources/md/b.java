package md;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q.p0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f11601h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f11602i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f11604b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.g f11605c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f11606d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f11608f;

    /* renamed from: g, reason: collision with root package name */
    public g f11609g;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f11603a = new p0(0);

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f11607e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f11604b = context;
        this.f11605c = new d4.g(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11606d = scheduledThreadPoolExecutor;
    }

    public final Task a(Bundle bundle) {
        int i10;
        h hVar = h.f11618c;
        d4.g gVar = this.f11605c;
        if (gVar.q() < 12000000) {
            return gVar.r() != 0 ? b(bundle).continueWithTask(hVar, new mh.g(22, this, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        m mVarC = m.c(this.f11604b);
        synchronized (mVarC) {
            i10 = mVarC.f11638a;
            mVarC.f11638a = i10 + 1;
        }
        return mVarC.d(new l(i10, 1, bundle, 1)).continueWith(hVar, d.f11611b);
    }

    public final Task b(Bundle bundle) throws RemoteException {
        String string;
        synchronized (b.class) {
            int i10 = f11601h;
            f11601h = i10 + 1;
            string = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f11603a) {
            this.f11603a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f11605c.r() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f11604b;
        synchronized (b.class) {
            try {
                if (f11602i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f11602i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f11602i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f11607e);
        if (this.f11608f != null || this.f11609g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f11608f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f11609g.f11616a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f11605c.r() == 2) {
            this.f11604b.sendBroadcast(intent);
        } else {
            this.f11604b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(h.f11618c, new ac.d(this, string, this.f11606d.schedule(new ah.d(taskCompletionSource, 14), 30L, TimeUnit.SECONDS), 20));
        return taskCompletionSource.getTask();
    }

    public final void c(Bundle bundle, String str) {
        synchronized (this.f11603a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f11603a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
