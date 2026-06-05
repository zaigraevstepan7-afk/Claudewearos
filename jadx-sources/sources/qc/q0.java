package qc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (rc.h.f14340b) {
            rc.h.f14341c = false;
            rc.h.f14342d = false;
            rc.k.g("Ad debug logging enablement is out of date.");
        }
        uk.c.i0(context);
    }
}
