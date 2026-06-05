package cg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f3364b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3365a;

    public h(Context context) {
        this.f3365a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (i.j) {
            try {
                Iterator it = ((q.d) i.f3366k.values()).iterator();
                while (it.hasNext()) {
                    ((i) it.next()).h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3365a.unregisterReceiver(this);
    }
}
