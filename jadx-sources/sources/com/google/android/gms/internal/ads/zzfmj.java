package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfmj {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfmj zza = new zzfmj();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzfmj zza() {
        return zza;
    }

    public final void zzc() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.zzb.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z2, boolean z10) {
        if ((z10 || z2) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzflz.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzflh) it.next()).zzg().zzm(z10 || z2);
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzfmi(this), intentFilter);
    }
}
