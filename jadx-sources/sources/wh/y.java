package wh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public z f19408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f19409b;

    public y(z zVar, z zVar2) {
        this.f19409b = zVar;
        this.f19408a = zVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f19409b.f19412a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            z zVar = this.f19408a;
            if (zVar == null) {
                return;
            }
            if (zVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                z zVar2 = this.f19408a;
                zVar2.f19415d.f19405f.schedule(zVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f19408a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
