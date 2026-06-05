package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.w;
import d8.j;
import java.util.HashMap;
import java.util.WeakHashMap;
import t7.m;
import w7.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class SystemAlarmService extends w {

    /* renamed from: d, reason: collision with root package name */
    public static final String f1246d = m.l("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public g f1247b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1248c;

    public final void b() {
        this.f1248c = true;
        m.g().c(f1246d, "All commands completed in dispatcher", new Throwable[0]);
        String str = j.f5012a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = j.f5013b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.g().m(j.f5012a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f1247b = gVar;
        if (gVar.C != null) {
            m.g().f(g.D, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.C = this;
        }
        this.f1248c = false;
    }

    @Override // androidx.lifecycle.w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1248c = true;
        this.f1247b.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f1248c) {
            m.g().i(f1246d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1247b.d();
            g gVar = new g(this);
            this.f1247b = gVar;
            if (gVar.C != null) {
                m.g().f(g.D, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.C = this;
            }
            this.f1248c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1247b.a(i11, intent);
        return 3;
    }
}
