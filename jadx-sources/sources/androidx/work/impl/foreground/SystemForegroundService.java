package androidx.work.impl.foreground;

import ac.d;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.w;
import androidx.work.impl.WorkDatabase;
import b8.b;
import b8.c;
import d8.a;
import java.util.UUID;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class SystemForegroundService extends w {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1253f = m.l("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f1254b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1255c;

    /* renamed from: d, reason: collision with root package name */
    public c f1256d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f1257e;

    public final void b() {
        this.f1254b = new Handler(Looper.getMainLooper());
        this.f1257e = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f1256d = cVar;
        if (cVar.B != null) {
            m.g().f(c.C, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.B = this;
        }
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1256d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z2 = this.f1255c;
        String str = f1253f;
        if (z2) {
            m.g().i(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1256d.g();
            b();
            this.f1255c = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f1256d;
        k kVar = cVar.f1615a;
        String str2 = c.C;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m.g().i(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = kVar.f16842d;
            ((d) cVar.f1616b).f(new b(cVar, workDatabase, stringExtra, 0));
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.d(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            m.g().i(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            kVar.f16843e.f(new a(kVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        m.g().i(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = cVar.B;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f1255c = true;
        m.g().c(str, "All commands completed.", new Throwable[0]);
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf();
        return 3;
    }
}
