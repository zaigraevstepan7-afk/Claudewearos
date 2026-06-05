package qc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f13376d;

    /* renamed from: e, reason: collision with root package name */
    public Context f13377e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13375c = false;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f13374b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a8.c f13373a = new a8.c(this, 2);

    public final synchronized void a(Context context) {
        try {
            if (this.f13375c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f13377e = applicationContext;
            if (applicationContext == null) {
                this.f13377e = context;
            }
            zzbdc.zza(this.f13377e);
            zzbct zzbctVar = zzbdc.zzec;
            nc.t tVar = nc.t.f12227d;
            this.f13376d = ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f13377e.registerReceiver(this.f13373a, intentFilter);
            } else {
                this.f13377e.registerReceiver(this.f13373a, intentFilter, 4);
            }
            this.f13375c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f13376d) {
            this.f13374b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
