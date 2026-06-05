package w7;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d8.j;
import d8.s;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements u7.a {
    public static final String D = m.l("SystemAlarmDispatcher");
    public final ArrayList A;
    public Intent B;
    public SystemAlarmService C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18909a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.a f18910b;

    /* renamed from: c, reason: collision with root package name */
    public final s f18911c;

    /* renamed from: d, reason: collision with root package name */
    public final u7.b f18912d;

    /* renamed from: e, reason: collision with root package name */
    public final k f18913e;

    /* renamed from: f, reason: collision with root package name */
    public final b f18914f;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f18915z;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f18909a = applicationContext;
        this.f18914f = new b(applicationContext);
        this.f18911c = new s();
        k kVarP0 = k.p0(systemAlarmService);
        this.f18913e = kVarP0;
        u7.b bVar = kVarP0.f16845g;
        this.f18912d = bVar;
        this.f18910b = kVarP0.f16843e;
        bVar.a(this);
        this.A = new ArrayList();
        this.B = null;
        this.f18915z = new Handler(Looper.getMainLooper());
    }

    public final void a(int i10, Intent intent) {
        m mVarG = m.g();
        String str = D;
        int i11 = 0;
        mVarG.c(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.g().m(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.A) {
                try {
                    ArrayList arrayList = this.A;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.A) {
            try {
                boolean zIsEmpty = this.A.isEmpty();
                this.A.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        String str2 = b.f18892d;
        Intent intent = new Intent(this.f18909a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        e(new b8.e(this, 0, 4, intent));
    }

    public final void c() {
        if (this.f18915z.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        m.g().c(D, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f18912d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f18911c.f5039a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.C = null;
    }

    public final void e(Runnable runnable) {
        this.f18915z.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock wakeLockA = j.a(this.f18909a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f18913e.f16843e.f(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
