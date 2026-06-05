package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1245a = m.l("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.g().c(f1245a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k kVarP0 = k.p0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (k.f16839m) {
                try {
                    kVarP0.j = pendingResultGoAsync;
                    if (kVarP0.f16847i) {
                        pendingResultGoAsync.finish();
                        kVarP0.j = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            m.g().f(f1245a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
