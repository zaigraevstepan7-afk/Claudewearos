package d8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4996d = t7.m.l("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f4997e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4998a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.k f4999b;

    /* renamed from: c, reason: collision with root package name */
    public int f5000c = 0;

    public d(Context context, u7.k kVar) {
        this.f4998a = context.getApplicationContext();
        this.f4999b = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = p4.a.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f4997e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.d.a():void");
    }

    public final boolean b() {
        t7.b bVar = this.f4999b.f16841c;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f4996d;
        if (zIsEmpty) {
            t7.m.g().c(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = g.a(this.f4998a, bVar);
        t7.m.g().c(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f4996d;
        u7.k kVar = this.f4999b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                u7.j.a(this.f4998a);
                t7.m.g().c(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f5000c + 1;
                    this.f5000c = i10;
                    if (i10 >= 3) {
                        t7.m.g().f(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        kVar.f16841c.getClass();
                        throw illegalStateException;
                    }
                    long j = i10 * 300;
                    t7.m.g().c(str, "Retrying after " + j, e10);
                    try {
                        Thread.sleep(this.f5000c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.r0();
        }
    }
}
