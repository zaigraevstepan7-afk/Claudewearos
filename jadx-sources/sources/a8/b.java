package a8;

import android.content.Intent;
import android.content.IntentFilter;
import t.m1;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f195i = m.l("BatteryNotLowTracker");

    @Override // a8.f
    public final Object a() {
        Intent intentRegisterReceiver = this.f205b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        m.g().f(f195i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // a8.d
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // a8.d
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m.g().c(f195i, m1.i("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
